package com.amap.api.mapcore.util;

import android.text.TextUtils;

public class ee {
   public static final int[][] a = new int[][]{{0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, {12}, {1}, {13}, {14}, {15, 16}, {17, 18, 19, 20, 21, 26, 27, 28}, {22, 23}, {24, 25}, {39, 40, 41}, {29, 30, 31}, {32, 33, 34, 35, 36, 37, 38}};
   public static final String[] b = new String[]{"land", "water", "green", "building", "highway", "arterial", "local", "railway", "subway", "boundary", "poilabel", "districtlable"};
   public static final String[][] c = new String[][]{{"land", "edu", "public", "traffic", "scenicSpot", "culture", "health", "sports", "business", "parkingLot", "subway"}, {"water"}, {"green"}, {"buildings"}, {"highWay"}, {"ringRoad", "nationalRoad"}, {"provincialRoad", "secondaryRoad", "levelThreeRoad", "levelFourRoad", "roadsBeingBuilt", "overPass", "underPass", "other"}, {"railway", "highSpeedRailway"}, {"subwayline", "subwayBeingBuilt"}, {"China", "foreign", "provincial"}, {"guideBoards", "pois", "aois"}, {"continent", "country", "province", "city", "district", "town", "village"}};
   public static final String[] d = new String[]{"regions", "water", "regions", "buildings", "roads", "roads", "roads", "roads", "roads", "borders", "labels", "labels"};

   public static String[] a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return null;
      } else {
         int var1 = -1;

         for(int var2 = 0; var2 < b.length; ++var2) {
            if (b[var2].equals(var0)) {
               var1 = var2;
               break;
            }
         }

         return var1 >= 0 ? c[var1] : null;
      }
   }

   public static String b(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return null;
      } else {
         int var1 = -1;

         for(int var2 = 0; var2 < b.length; ++var2) {
            if (b[var2].equals(var0)) {
               var1 = var2;
               break;
            }
         }

         return var1 >= 0 ? d[var1] : null;
      }
   }
}
