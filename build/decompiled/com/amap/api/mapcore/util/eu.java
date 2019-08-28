package com.amap.api.mapcore.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;

public class eu<K, V> {
   private final LinkedHashMap<K, V> a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public eu(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("maxSize <= 0");
      } else {
         this.c = var1;
         this.a = new LinkedHashMap(0, 0.75F, true);
      }
   }

   public final V a(K var1) {
      if (var1 == null) {
         throw new NullPointerException("key == null");
      } else {
         Object var2;
         synchronized(this) {
            var2 = this.a.get(var1);
            if (var2 != null) {
               ++this.g;
               return var2;
            }

            ++this.h;
         }

         Object var3 = this.b(var1);
         if (var3 == null) {
            return null;
         } else {
            synchronized(this) {
               ++this.e;
               var2 = this.a.put(var1, var3);
               if (var2 != null) {
                  this.a.put(var1, var2);
               } else {
                  this.b += this.c(var1, var3);
               }
            }

            if (var2 != null) {
               this.a(false, var1, var3, var2);
               return var2;
            } else {
               this.a(this.c);
               return var3;
            }
         }
      }
   }

   public final V a(K var1, V var2) {
      if (var1 != null && var2 != null) {
         Object var3;
         synchronized(this) {
            ++this.d;
            this.b += this.c(var1, var2);
            var3 = this.a.put(var1, var2);
            if (var3 != null) {
               this.b -= this.c(var1, var3);
            }
         }

         if (var3 != null) {
            this.a(false, var1, var3, var2);
         }

         this.a(this.c);
         return var3;
      } else {
         throw new NullPointerException("key == null || value == null");
      }
   }

   private void a(int var1) {
      while(true) {
         Object var2;
         Object var3;
         synchronized(this) {
            label72: {
               boolean var5 = this.b < 0 || this.a.isEmpty() && this.b != 0;
               if (var5) {
                  ;
               }

               if (this.b > var1) {
                  Entry var6 = null;

                  Entry var8;
                  for(Iterator var7 = this.a.entrySet().iterator(); var7.hasNext(); var6 = var8) {
                     var8 = (Entry)var7.next();
                  }

                  if (var6 != null) {
                     var2 = var6.getKey();
                     var3 = var6.getValue();
                     this.a.remove(var2);
                     this.b -= this.c(var2, var3);
                     ++this.f;
                     break label72;
                  }
               }

               return;
            }
         }

         this.a(true, var2, var3, (Object)null);
      }
   }

   protected void a(boolean var1, K var2, V var3, V var4) {
   }

   protected V b(K var1) {
      return null;
   }

   private int c(K var1, V var2) {
      int var3 = this.b(var1, var2);
      if (var3 < 0) {
         throw new IllegalStateException("Negative size: " + var1 + "=" + var2);
      } else {
         return var3;
      }
   }

   protected int b(K var1, V var2) {
      return 1;
   }

   public final void a() {
      this.a(-1);
   }

   public final synchronized String toString() {
      int var1 = this.g + this.h;
      int var2 = var1 != 0 ? 100 * this.g / var1 : 0;
      return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.g, this.h, var2);
   }
}
