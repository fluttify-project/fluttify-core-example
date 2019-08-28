package com.amap.api.mapcore.util;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.maps.model.LatLng;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class gr$a {
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private HashMap<Integer, List<LatLng>> g;
   private List<LatLng> h;

   public gr$a(gr var1, int var2, int var3, int var4, HashMap var5) {
      this.a = var1;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.f = 0;
      this.h = new ArrayList();
      this.b = var3;
      this.g = var5;
      this.c = var2;
      this.e = var4;
   }

   public HashMap<Integer, List<LatLng>> a() {
      return this.g;
   }

   public void a(Handler var1) {
      List var2 = null;

      for(int var3 = this.d; var3 <= this.b; ++var3) {
         var2 = (List)this.g.get(var3);
         if (var2 == null) {
            break;
         }

         this.h.addAll(var2);
         this.a(var1, var2);
      }

      if (this.d == this.b + 1) {
         this.b(var1);
      }

   }

   private void a(Handler var1, List<LatLng> var2) {
      Message var3 = var1.obtainMessage();
      var3.obj = var2;
      var3.what = 100;
      var3.arg1 = this.d;
      Bundle var4 = new Bundle();
      var4.putInt("lineID", this.c);
      var3.setData(var4);
      var1.sendMessage(var3);
      ++this.d;
      ++this.f;
   }

   private void b(Handler var1) {
      if (this.f > 0) {
         int var2 = go.a(this.h);
         Message var3 = var1.obtainMessage();
         var3.obj = this.h;
         var3.what = 101;
         var3.arg1 = var2;
         var3.arg2 = this.e;
         Bundle var4 = new Bundle();
         var4.putInt("lineID", this.c);
         var3.setData(var4);
         var1.sendMessage(var3);
      } else {
         this.a.a(var1, this.c, "轨迹点太少或距离太近,轨迹纠偏失败");
      }

   }
}
