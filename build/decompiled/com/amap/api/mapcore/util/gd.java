package com.amap.api.mapcore.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapActivity;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.util.ArrayList;
import java.util.List;

public class gd extends BaseAdapter {
   private List<OfflineMapCity> a = new ArrayList();
   private OfflineMapManager b;
   private Activity c;

   public gd(List<OfflineMapProvince> var1, OfflineMapManager var2, OfflineMapActivity var3) {
      this.b = var2;
      this.c = var3;
   }

   public void a(List<OfflineMapCity> var1) {
      this.a = var1;
   }

   public int getCount() {
      return this.a.size();
   }

   public Object getItem(int var1) {
      return this.a.get(var1);
   }

   public long getItemId(int var1) {
      return (long)var1;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      try {
         OfflineMapCity var4 = (OfflineMapCity)this.a.get(var1);
         gd$a var5;
         if (var2 == null) {
            var5 = new gd$a(this);
            var2 = gk.a(this.c, 2130903042, (ViewGroup)null);
            var5.a = (TextView)var2.findViewById(2131165195);
            var5.b = (TextView)var2.findViewById(2131165199);
            var5.c = (TextView)var2.findViewById(2131165197);
            var5.d = (ImageView)var2.findViewById(2131165198);
            var2.setTag(var5);
         } else {
            var5 = (gd$a)var2.getTag();
         }

         var5.d.setOnClickListener(new gd$1(this, var5, var4));
         var5.c.setVisibility(0);
         var5.a.setText(var4.getCity());
         double var6 = (double)((int)((double)var4.getSize() / 1024.0D / 1024.0D * 100.0D)) / 100.0D;
         var5.b.setText(var6 + " M");
         int var8 = var4.getState();
         switch(var8) {
         case -1:
         case 101:
         case 102:
         case 103:
            var5.d.setVisibility(8);
            var5.c.setText("下载失败");
            break;
         case 0:
         case 1:
            var5.d.setVisibility(8);
            var5.c.setText("下载中");
            break;
         case 2:
            var5.d.setVisibility(8);
            var5.c.setText("等待下载");
            break;
         case 3:
            var5.d.setVisibility(8);
            var5.c.setText("暂停中");
            break;
         case 4:
            var5.d.setVisibility(8);
            var5.c.setText("已下载");
            break;
         case 6:
            var5.d.setVisibility(0);
            var5.c.setVisibility(8);
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

      return var2;
   }
}
