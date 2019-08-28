package com.amap.api.maps;

import android.content.Context;
import com.amap.api.mapcore.util.ao;
import com.amap.api.mapcore.util.fb;
import com.amap.api.mapcore.util.ht;
import com.amap.api.maps.model.LatLng;

public class CoordinateConverter {
   private Context a;
   private CoordinateConverter$CoordType b = null;
   private LatLng c = null;

   public CoordinateConverter(Context var1) {
      this.a = var1;
   }

   public CoordinateConverter from(CoordinateConverter$CoordType var1) {
      this.b = var1;
      return this;
   }

   public CoordinateConverter coord(LatLng var1) {
      this.c = var1;
      return this;
   }

   public LatLng convert() {
      if (this.b == null) {
         return null;
      } else if (null == this.c) {
         return null;
      } else {
         LatLng var1 = null;

         try {
            switch(CoordinateConverter$1.a[this.b.ordinal()]) {
            case 1:
               var1 = ao.a(this.c);
               break;
            case 2:
               var1 = ao.b(this.a, this.c);
               break;
            case 3:
            case 4:
            case 5:
            case 6:
               var1 = this.c;
               break;
            case 7:
               var1 = ao.a(this.a, this.c);
            }
         } catch (Throwable var3) {
            var3.printStackTrace();
            ht.c(var3, "CoordinateConverter", "convert");
            var1 = this.c;
         }

         return var1;
      }
   }

   public static boolean isAMapDataAvailable(double var0, double var2) {
      return fb.a(var0, var2);
   }
}
