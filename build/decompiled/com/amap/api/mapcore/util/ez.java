package com.amap.api.mapcore.util;

import android.graphics.Bitmap;

public class ez {
   private static boolean a = false;
   private static boolean b = false;
   private int c = 0;
   private int d = 20;

   public ez() {
   }

   public static boolean a() {
      return a;
   }

   public boolean b() {
      return b;
   }

   public void c() {
      ++this.c;
   }

   public boolean d() {
      return this.c >= this.d;
   }

   public boolean a(Bitmap var1) {
      try {
         if (var1 != null) {
            int var2 = var1.getWidth();
            int var3 = var1.getHeight();
            int var4 = -1;
            int var5 = -16777216;

            for(int var6 = (int)((float)var2 / 4.0F); (float)var6 < (float)(var2 * 3) / 4.0F; ++var6) {
               for(int var7 = (int)((float)var3 / 4.0F); (float)var7 < (float)(var3 * 3) / 4.0F; ++var7) {
                  int var8 = var1.getPixel(var6, var7);
                  if (var4 == -1) {
                     var4 = var8;
                  }

                  boolean var9;
                  if (var8 != var4) {
                     var9 = true;
                     return var9;
                  }

                  if (var8 != var5) {
                     var9 = true;
                     return var9;
                  }
               }
            }
         }
      } catch (Throwable var14) {
         ht.c(var14, "AMapdelegate", "checkBlackScreen");
      } finally {
         b = true;
      }

      return false;
   }
}
