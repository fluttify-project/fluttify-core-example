package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.style.StyleItem;

class c$13 implements Runnable {
   c$13(c var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, StyleItem[] var8) {
      this.h = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.f = var7;
      this.g = var8;
   }

   public void run() {
      try {
         this.h.g.setMapModeAndStyle(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }
}
