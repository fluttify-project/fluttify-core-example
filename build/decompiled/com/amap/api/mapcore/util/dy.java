package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.MapsInitializer;

public class dy implements Runnable {
   private Context a;
   private u b;
   private dx c;
   private dy$a d;
   private int e = 0;

   public dy(Context var1, dy$a var2, int var3) {
      this.a = var1;
      this.d = var2;
      this.e = var3;
      if (this.c == null) {
         this.c = new dx(this.a, "", var3 == 1);
      }

   }

   public dy(Context var1, u var2) {
      this.a = var1;
      this.b = var2;
      if (this.c == null) {
         this.c = new dx(this.a, "");
      }

   }

   public void a(String var1) {
      if (this.c != null) {
         this.c.c(var1);
      }

   }

   public void run() {
      try {
         if (!MapsInitializer.getNetWorkEnable()) {
            return;
         }

         if (this.c != null) {
            dx$a var1 = (dx$a)this.c.a();
            if (var1 != null && var1.a != null) {
               if (this.d != null) {
                  this.d.a(var1.a, this.e);
               } else if (this.b != null) {
                  this.b.a(this.b.getMapConfig().isCustomStyleEnable(), var1.a);
               }
            }
         }

         ht.a(this.a, fi.e());
         if (this.b != null) {
            this.b.setRunLowFrame(false);
         }
      } catch (Throwable var2) {
         ht.c(var2, "CustomStyleTask", "download customStyle");
         var2.printStackTrace();
      }

   }

   public void a() {
      this.a = null;
      if (this.c != null) {
         this.c = null;
      }

   }

   public void b() {
      fh.a().a(this);
   }
}
