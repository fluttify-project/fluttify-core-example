package com.amap.api.mapcore.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class iy$a {
   private final iy$c b;
   private final boolean[] c;
   private boolean d;
   private boolean e;

   private iy$a(iy var1, iy$c var2) {
      this.a = var1;
      this.b = var2;
      this.c = iy$c.d(var2) ? null : new boolean[iy.e(var1)];
   }

   public OutputStream a(int var1) throws IOException {
      if (var1 >= 0 && var1 < iy.e(this.a)) {
         iy var2 = this.a;
         synchronized(this.a) {
            if (iy$c.a(this.b) != this) {
               throw new IllegalStateException();
            } else {
               if (!iy$c.d(this.b)) {
                  this.c[var1] = true;
               }

               File var3 = this.b.b(var1);

               FileOutputStream var4;
               try {
                  var4 = new FileOutputStream(var3);
               } catch (FileNotFoundException var9) {
                  iy.f(this.a).mkdirs();

                  try {
                     var4 = new FileOutputStream(var3);
                  } catch (FileNotFoundException var8) {
                     return iy.g();
                  }
               }

               return new iy$a$a(this, var4, (iy$1)null);
            }
         }
      } else {
         throw new IllegalArgumentException("Expected index " + var1 + " to be greater than 0 and less than the maximum value count of " + iy.e(this.a));
      }
   }

   public void a() throws IOException {
      if (this.d) {
         iy.a(this.a, this, false);
         this.a.c(iy$c.c(this.b));
      } else {
         iy.a(this.a, this, true);
      }

      this.e = true;
   }

   public void b() throws IOException {
      iy.a(this.a, this, false);
   }
}
