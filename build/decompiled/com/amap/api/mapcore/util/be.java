package com.amap.api.mapcore.util;

import com.amap.api.maps.model.MultiPointItem;
import com.autonavi.amap.mapcore.IPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class be {
   private final bb a;
   private final int b;
   private int c;
   private List<MultiPointItem> d;
   private List<be> e;

   protected be(bb var1) {
      this(var1, 0);
   }

   private be(int var1, int var2, int var3, int var4, int var5) {
      this(new bb(var1, var2, var3, var4), var5);
   }

   private be(bb var1, int var2) {
      this.c = 30;
      this.e = null;
      this.a = var1;
      this.b = var2;
      this.c = this.a(this.b);
   }

   private int a(int var1) {
      boolean var2 = false;
      byte var3;
      switch(var1) {
      case 0:
         var3 = 50;
         break;
      case 1:
         var3 = 30;
         break;
      case 2:
         var3 = 20;
         break;
      case 3:
         var3 = 20;
         break;
      case 4:
         var3 = 10;
         break;
      case 5:
         var3 = 10;
         break;
      case 6:
         var3 = 5;
         break;
      default:
         var3 = 5;
      }

      return var3;
   }

   protected void a(MultiPointItem var1) {
      IPoint var2 = var1.getIPoint();
      if (this.a.a(var2.x, var2.y)) {
         this.a(var2.x, var2.y, var1);
      }

   }

   private void a(int var1, int var2, MultiPointItem var3) {
      if (this.d == null) {
         this.d = new ArrayList();
      }

      if (this.d.size() > this.c && this.b < 40) {
         if (this.e == null) {
            this.b();
         }

         if (this.e != null) {
            if (var2 < this.a.f) {
               if (var1 < this.a.e) {
                  ((be)this.e.get(0)).a(var1, var2, var3);
               } else {
                  ((be)this.e.get(1)).a(var1, var2, var3);
               }
            } else if (var1 < this.a.e) {
               ((be)this.e.get(2)).a(var1, var2, var3);
            } else {
               ((be)this.e.get(3)).a(var1, var2, var3);
            }

         }
      } else {
         this.d.add(var3);
      }
   }

   private void b() {
      this.e = new ArrayList(4);
      this.e.add(new be(this.a.a, this.a.e, this.a.b, this.a.f, this.b + 1));
      this.e.add(new be(this.a.e, this.a.c, this.a.b, this.a.f, this.b + 1));
      this.e.add(new be(this.a.a, this.a.e, this.a.f, this.a.d, this.b + 1));
      this.e.add(new be(this.a.e, this.a.c, this.a.f, this.a.d, this.b + 1));
   }

   protected void a() {
      this.e = null;
      if (this.d != null) {
         this.d.clear();
      }

   }

   protected void a(bb var1, Collection<MultiPointItem> var2, double var3) {
      this.a(var1, var2, 1.0F, var3);
   }

   private void a(bb var1, Collection<MultiPointItem> var2, float var3, double var4) {
      if (this.a.a(var1)) {
         if (this.d != null) {
            int var6 = (int)((float)this.d.size() * var3);

            for(int var7 = 0; var7 < var6; ++var7) {
               MultiPointItem var8 = (MultiPointItem)this.d.get(var7);
               IPoint var9 = var8.getIPoint();
               if (var1.a(var9)) {
                  var2.add(var8);
               }
            }
         }

         if (var4 > 0.0D) {
            double var11 = ((double)this.a.d - (double)this.a.b) * ((double)this.a.c - (double)this.a.a);
            double var14 = var11 / var4;
            float var10 = 0.7F;
            if (var14 < (double)var10) {
               return;
            }

            if (var14 > 1.0D) {
               var3 = 1.0F;
            } else {
               var3 = (float)(4.8188D * var14 * var14 - 4.9339D * var14 + 1.1093D);
            }
         }

         if (this.e != null) {
            Iterator var12 = this.e.iterator();

            while(var12.hasNext()) {
               be var13 = (be)var12.next();
               var13.a(var1, var2, var3, var4);
            }
         }

      }
   }
}
