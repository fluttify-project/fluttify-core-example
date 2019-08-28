package com.amap.api.maps.model;

import com.amap.api.mapcore.util.em;
import com.autonavi.amap.mapcore.DPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class a {
   private final em a;
   private final int b;
   private List<WeightedLatLng> c;
   private List<a> d;

   protected a(em var1) {
      this(var1, 0);
   }

   private a(double var1, double var3, double var5, double var7, int var9) {
      this(new em(var1, var3, var5, var7), var9);
   }

   private a(em var1, int var2) {
      this.d = null;
      this.a = var1;
      this.b = var2;
   }

   protected void a(WeightedLatLng var1) {
      DPoint var2 = var1.getPoint();
      if (this.a.a(var2.x, var2.y)) {
         this.a(var2.x, var2.y, var1);
      }

   }

   private void a(double var1, double var3, WeightedLatLng var5) {
      if (this.d != null) {
         if (var3 < this.a.f) {
            if (var1 < this.a.e) {
               ((a)this.d.get(0)).a(var1, var3, var5);
            } else {
               ((a)this.d.get(1)).a(var1, var3, var5);
            }
         } else if (var1 < this.a.e) {
            ((a)this.d.get(2)).a(var1, var3, var5);
         } else {
            ((a)this.d.get(3)).a(var1, var3, var5);
         }

      } else {
         if (this.c == null) {
            this.c = new ArrayList();
         }

         this.c.add(var5);
         if (this.c.size() > 50 && this.b < 40) {
            this.a();
         }

      }
   }

   private void a() {
      this.d = new ArrayList(4);
      this.d.add(new a(this.a.a, this.a.e, this.a.b, this.a.f, this.b + 1));
      this.d.add(new a(this.a.e, this.a.c, this.a.b, this.a.f, this.b + 1));
      this.d.add(new a(this.a.a, this.a.e, this.a.f, this.a.d, this.b + 1));
      this.d.add(new a(this.a.e, this.a.c, this.a.f, this.a.d, this.b + 1));
      List var1 = this.c;
      this.c = null;
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         WeightedLatLng var3 = (WeightedLatLng)var2.next();
         this.a(var3.getPoint().x, var3.getPoint().y, var3);
      }

   }

   protected Collection<WeightedLatLng> a(em var1) {
      ArrayList var2 = new ArrayList();
      this.a(var1, var2);
      return var2;
   }

   private void a(em var1, Collection<WeightedLatLng> var2) {
      if (this.a.a(var1)) {
         Iterator var3;
         if (this.d != null) {
            var3 = this.d.iterator();

            while(var3.hasNext()) {
               a var4 = (a)var3.next();
               var4.a(var1, var2);
            }
         } else if (this.c != null) {
            if (var1.b(this.a)) {
               var2.addAll(this.c);
            } else {
               var3 = this.c.iterator();

               while(var3.hasNext()) {
                  WeightedLatLng var5 = (WeightedLatLng)var3.next();
                  if (var1.a(var5.getPoint())) {
                     var2.add(var5);
                  }
               }
            }
         }

      }
   }
}
