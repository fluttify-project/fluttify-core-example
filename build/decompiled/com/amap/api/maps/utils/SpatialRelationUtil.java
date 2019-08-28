package com.amap.api.maps.utils;

import android.util.Pair;
import com.amap.api.mapcore.util.fi;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.DPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpatialRelationUtil {
   public static final int MIN_POLYLINE_POINT_SIZE = 2;
   public static final int A_HALF_CIRCLE_DEGREE = 180;
   public static final int A_CIRCLE_DEGREE = 360;
   public static final int MIN_OFFSET_DEGREE = 50;

   public SpatialRelationUtil() {
   }

   public static Pair<Integer, LatLng> calShortestDistancePoint(List<LatLng> var0, LatLng var1, float var2, double var3) {
      try {
         if (var0 == null || var1 == null || var0.size() == 0) {
            return null;
         }

         ArrayList var5 = new ArrayList();
         int var6 = 0;

         for(Iterator var7 = var0.iterator(); var7.hasNext(); ++var6) {
            LatLng var8 = (LatLng)var7.next();
            var5.add(DPoint.obtain(var8.latitude, var8.longitude));
            if (var8.equals(var1)) {
               return new Pair(var6, var1);
            }
         }

         DPoint var11 = DPoint.obtain(var1.latitude, var1.longitude);
         Pair var12 = calShortestDistancePoint(var5, var11, var2);
         if (var12 != null) {
            DPoint var9 = (DPoint)var12.second;
            if ((double)AMapUtils.calculateLineDistance(new LatLng(var9.x, var9.y), var1) < var3) {
               return new Pair(var12.first, new LatLng(((DPoint)var12.second).x, ((DPoint)var12.second).y));
            }
         }
      } catch (Throwable var10) {
         var10.printStackTrace();
      }

      return null;
   }

   public static Pair<Integer, LatLng> calShortestDistancePoint(List<LatLng> var0, LatLng var1) {
      try {
         if (var0 == null || var1 == null || var0.size() == 0) {
            return null;
         }

         ArrayList var2 = new ArrayList();
         int var3 = 0;

         for(Iterator var4 = var0.iterator(); var4.hasNext(); ++var3) {
            LatLng var5 = (LatLng)var4.next();
            var2.add(DPoint.obtain(var5.latitude, var5.longitude));
            if (var5.equals(var1)) {
               return new Pair(var3, var1);
            }
         }

         DPoint var7 = DPoint.obtain(var1.latitude, var1.longitude);
         Pair var8 = calShortestDistancePoint(var2, (DPoint)var7);
         if (var8 != null) {
            return new Pair(var8.first, new LatLng(((DPoint)var8.second).x, ((DPoint)var8.second).y));
         }
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

      return null;
   }

   public static Pair<Integer, DPoint> calShortestDistancePoint(List<DPoint> var0, DPoint var1) {
      return calShortestDistancePoint(var0, var1, -1.0F);
   }

   public static Pair<Integer, DPoint> calShortestDistancePoint(List<DPoint> var0, DPoint var1, float var2) {
      if (var0 != null && var1 != null && var0.size() != 0) {
         int var3 = var0.size();
         if (var3 < 2) {
            return null;
         } else {
            Pair var4 = null;
            DPoint var5 = var1;
            DPoint var6 = (DPoint)var0.get(0);
            DPoint var7 = null;
            double var8 = 0.0D;
            int var10 = var0.size();

            for(int var11 = 1; var11 <= var10 - 1; ++var11) {
               var7 = (DPoint)var0.get(var11);
               if (var11 == var10 - 1 && var7.equals(var1)) {
                  return new Pair(var11, var1);
               }

               boolean var12 = checkRotateIsMatch(var6, var7, var2);
               if (!var12) {
                  var6 = var7;
               } else {
                  if (var6.equals(var1)) {
                     return new Pair(var11 - 1, var1);
                  }

                  Pair var13 = pointToSegDist(var5.x, var5.y, var6.x, var6.y, var7.x, var7.y);
                  if (var4 == null) {
                     var8 = ((Double)var13.first).doubleValue();
                     var4 = new Pair(var11 - 1, var13.second);
                  } else if (var8 > ((Double)var13.first).doubleValue()) {
                     var8 = ((Double)var13.first).doubleValue();
                     var4 = new Pair(var11 - 1, var13.second);
                  }

                  var6 = var7;
               }
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   private static boolean checkRotateIsMatch(DPoint var0, DPoint var1, float var2) {
      if (var2 == -1.0F) {
         return true;
      } else if (var0 != null && var1 != null) {
         float var3 = fi.a(var0, var1);
         var3 += 360.0F;
         float var4 = Math.abs(var3 - var2) % 360.0F;
         if (var4 > 180.0F) {
            var4 = 360.0F - var4;
         }

         return var4 < 50.0F;
      } else {
         return false;
      }
   }

   private static Pair<Double, DPoint> pointToSegDist(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = (var8 - var4) * (var0 - var4) + (var10 - var6) * (var2 - var6);
      if (var12 <= 0.0D) {
         return new Pair(Math.sqrt((var0 - var4) * (var0 - var4) + (var2 - var6) * (var2 - var6)), new DPoint(var4, var6));
      } else {
         double var14 = (var8 - var4) * (var8 - var4) + (var10 - var6) * (var10 - var6);
         if (var12 >= var14) {
            return new Pair(Math.sqrt((var0 - var8) * (var0 - var8) + (var2 - var10) * (var2 - var10)), new DPoint(var8, var10));
         } else {
            double var16 = var12 / var14;
            double var18 = var4 + (var8 - var4) * var16;
            double var20 = var6 + (var10 - var6) * var16;
            double var22 = Math.sqrt((var0 - var18) * (var0 - var18) + (var20 - var2) * (var20 - var2));
            Pair var24 = new Pair(var22, new DPoint(var18, var20));
            return var24;
         }
      }
   }
}
