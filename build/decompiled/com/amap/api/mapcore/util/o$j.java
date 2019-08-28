package com.amap.api.mapcore.util;

import javax.microedition.khronos.opengles.GL10;

class o$j {
   private static String a = "GLThreadManager";
   private boolean b;
   private int c;
   private boolean d;
   private boolean e;
   private boolean f;
   private o$i g;

   private o$j() {
   }

   public synchronized void a(o$i var1) {
      o$i.a(var1, true);
      if (this.g == var1) {
         this.g = null;
      }

      this.notifyAll();
   }

   public boolean b(o$i var1) {
      if (this.g != var1 && this.g != null) {
         this.c();
         if (this.e) {
            return true;
         } else {
            if (this.g != null) {
               this.g.i();
            }

            return false;
         }
      } else {
         this.g = var1;
         this.notifyAll();
         return true;
      }
   }

   public void c(o$i var1) {
      if (this.g == var1) {
         this.g = null;
      }

      this.notifyAll();
   }

   public synchronized boolean a() {
      return this.f;
   }

   public synchronized boolean b() {
      this.c();
      return !this.e;
   }

   public synchronized void a(GL10 var1) {
      if (!this.d && var1 != null) {
         this.c();
         String var2 = var1.glGetString(7937);
         if (this.c < 131072) {
            this.e = !var2.startsWith("Q3Dimension MSM7500 ");
            this.notifyAll();
         }

         this.f = !this.e;
         this.d = true;
      }

   }

   private void c() {
      if (!this.b) {
         this.c = 131072;
         if (this.c >= 131072) {
            this.e = true;
         }

         this.b = true;
      }

   }
}
