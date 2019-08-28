package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapManager;

public class ge extends gf implements OnClickListener {
   private OfflineMapManager a;
   private View b;
   private TextView c;
   private TextView d;
   private TextView e;
   private TextView f;
   private int g;
   private String h;

   public ge(Context var1, OfflineMapManager var2) {
      super(var1);
      this.a = var2;
   }

   protected void a() {
      this.b = gk.a(this.getContext(), 2130903041, (ViewGroup)null);
      this.setContentView(this.b);
      this.b.setOnClickListener(new ge$1(this));
      this.c = (TextView)this.b.findViewById(2131165191);
      this.d = (TextView)this.b.findViewById(2131165192);
      this.d.setText("暂停下载");
      this.e = (TextView)this.b.findViewById(2131165193);
      this.f = (TextView)this.b.findViewById(2131165194);
      this.d.setOnClickListener(this);
      this.e.setOnClickListener(this);
      this.f.setOnClickListener(this);
   }

   public void a(int var1, String var2) {
      this.c.setText(var2);
      if (var1 == 0) {
         this.d.setText("暂停下载");
         this.d.setVisibility(0);
         this.e.setText("取消下载");
      }

      if (var1 == 2) {
         this.d.setVisibility(8);
         this.e.setText("取消下载");
      } else if (var1 != -1 && var1 != 101 && var1 != 102 && var1 != 103) {
         if (var1 == 3) {
            this.d.setVisibility(0);
            this.d.setText("继续下载");
            this.e.setText("取消下载");
         } else if (var1 == 4) {
            this.e.setText("删除");
            this.d.setVisibility(8);
         }
      } else {
         this.d.setText("继续下载");
         this.d.setVisibility(0);
      }

      this.g = var1;
      this.h = var2;
   }

   public void onClick(View var1) {
      try {
         int var2 = var1.getId();
         if (var2 == 2131165192) {
            if (this.g == 0) {
               this.d.setText("继续下载");
               this.a.pause();
            } else if (this.g == 3 || this.g == -1 || this.g == 101 || this.g == 102 || this.g == 103) {
               this.d.setText("暂停下载");
               this.a.downloadByCityName(this.h);
            }

            this.dismiss();
         } else if (var2 == 2131165193) {
            if (!TextUtils.isEmpty(this.h)) {
               this.a.remove(this.h);
               this.dismiss();
            }
         } else if (var2 == 2131165194) {
            this.dismiss();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }
}
