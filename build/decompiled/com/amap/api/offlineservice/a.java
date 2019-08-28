package com.amap.api.offlineservice;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.amap.api.maps.offlinemap.OfflineMapActivity;

public abstract class a {
   protected OfflineMapActivity a = null;

   public a() {
   }

   public void a(OfflineMapActivity var1) {
      this.a = var1;
   }

   public void a(Bundle var1) {
      this.a.showScr();
   }

   public abstract void a();

   public boolean b() {
      return true;
   }

   public abstract void a(View var1);

   public abstract RelativeLayout c();

   public abstract void d();

   public void e() {
   }

   public void f() {
   }

   public void g() {
   }

   public void h() {
   }

   public int a(float var1) {
      if (this.a != null) {
         float var2 = (float)this.a.getResources().getDisplayMetrics().densityDpi;
         return (int)(var1 * (var2 / 160.0F) + 0.5F);
      } else {
         return (int)var1;
      }
   }
}
