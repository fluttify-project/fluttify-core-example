package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.DownloadProgressView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;

public class gg implements OnClickListener {
   private int a = 0;
   private Context b;
   private TextView c;
   private TextView d;
   private ImageView e;
   private TextView f;
   private OfflineMapManager g;
   private OfflineMapCity h;
   private boolean i = false;
   private Handler j = new gg$1(this);
   private View k;
   private DownloadProgressView l;

   private void a(int var1, int var2) throws Exception {
      byte var3 = 3;
      byte var4 = 100;
      if (this.a == 2 && var2 > var3 && var2 < var4) {
         this.l.setVisibility(0);
         this.l.setProgress(var2);
      } else {
         this.l.setVisibility(8);
      }

      switch(var1) {
      case -1:
         this.e();
         break;
      case 0:
         if (this.a == 1) {
            this.e.setVisibility(8);
            this.f.setText("下载中");
            this.f.setTextColor(Color.parseColor("#4287ff"));
         } else {
            this.e(var2);
         }
         break;
      case 1:
         this.d(var2);
         break;
      case 2:
         this.b(var2);
         break;
      case 3:
         this.c(var2);
         break;
      case 4:
         this.f();
      case 5:
      default:
         break;
      case 6:
         this.c();
         break;
      case 7:
         this.d();
         break;
      case 101:
      case 102:
      case 103:
         this.e();
      }

   }

   public gg(Context var1, OfflineMapManager var2) {
      this.b = var1;
      this.b();
      this.g = var2;
   }

   public void a(int var1) {
      this.a = var1;
   }

   public View a() {
      return this.k;
   }

   private void b() {
      this.k = gk.a(this.b, 2130903042, (ViewGroup)null);
      this.l = (DownloadProgressView)this.k.findViewById(2131165200);
      this.c = (TextView)this.k.findViewById(2131165195);
      this.d = (TextView)this.k.findViewById(2131165199);
      this.e = (ImageView)this.k.findViewById(2131165198);
      this.f = (TextView)this.k.findViewById(2131165197);
      this.e.setOnClickListener(this);
   }

   public void a(OfflineMapCity var1) {
      if (var1 != null) {
         this.h = var1;
         this.c.setText(var1.getCity());
         double var2 = (double)((int)((double)var1.getSize() / 1024.0D / 1024.0D * 100.0D)) / 100.0D;
         this.d.setText(var2 + " M");
         this.a(this.h.getState(), this.h.getcompleteCode(), this.i);
      }

   }

   private void a(int var1, int var2, boolean var3) {
      if (this.h != null) {
         this.h.setState(var1);
         this.h.setCompleteCode(var2);
      }

      Message var4 = new Message();
      var4.arg1 = var1;
      var4.arg2 = var2;
      this.j.sendMessage(var4);
   }

   private void c() {
      this.f.setVisibility(8);
      this.e.setVisibility(0);
      this.e.setImageResource(2130837506);
   }

   private void d() {
      this.f.setVisibility(0);
      this.e.setVisibility(0);
      this.e.setImageResource(2130837506);
      this.f.setText("已下载-有更新");
   }

   private void b(int var1) {
      if (this.a == 1) {
         this.e.setVisibility(8);
         this.f.setVisibility(0);
         this.f.setText("等待中");
         this.f.setTextColor(Color.parseColor("#4287ff"));
      } else {
         this.f.setVisibility(0);
         this.e.setVisibility(8);
         this.f.setTextColor(Color.parseColor("#4287ff"));
         this.f.setText("等待中");
      }

   }

   private void e() {
      this.f.setVisibility(0);
      this.e.setVisibility(8);
      this.f.setTextColor(-65536);
      this.f.setText("下载出现异常");
   }

   private void c(int var1) {
      this.f.setVisibility(0);
      this.e.setVisibility(8);
      this.f.setTextColor(-7829368);
      this.f.setText("暂停");
   }

   private void f() {
      this.f.setVisibility(0);
      this.e.setVisibility(8);
      this.f.setText("已下载");
      this.f.setTextColor(Color.parseColor("#898989"));
   }

   private void d(int var1) {
      if (this.a != 1) {
         this.f.setVisibility(0);
         this.e.setVisibility(8);
         this.f.setText("解压中");
         this.f.setTextColor(Color.parseColor("#898989"));
      }
   }

   private void e(int var1) {
      if (this.h != null) {
         this.f.setVisibility(0);
         this.f.setText("下载中");
         this.e.setVisibility(8);
         this.f.setTextColor(Color.parseColor("#4287ff"));
      }
   }

   private synchronized void g() {
      this.g.pause();
      this.g.restart();
   }

   private synchronized boolean h() {
      try {
         this.g.downloadByCityName(this.h.getCity());
         return true;
      } catch (AMapException var2) {
         var2.printStackTrace();
         Toast.makeText(this.b, var2.getErrorMessage(), 0).show();
         return false;
      }
   }

   public void onClick(View var1) {
      try {
         if (!fi.d(this.b)) {
            Toast.makeText(this.b, "无网络连接", 0).show();
            return;
         }

         boolean var2 = true;
         boolean var3 = true;
         if (this.h != null) {
            int var6 = this.h.getState();
            int var5 = this.h.getcompleteCode();
            switch(var6) {
            case -1:
            case 2:
            case 3:
            case 5:
            case 6:
            default:
               if (this.h()) {
                  this.b(var5);
               } else {
                  this.e();
               }
               break;
            case 0:
               this.g();
               this.c(var5);
            case 1:
            case 4:
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }
}
