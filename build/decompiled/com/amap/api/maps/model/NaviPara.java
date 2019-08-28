package com.amap.api.maps.model;

public class NaviPara {
   /** @deprecated */
   @Deprecated
   public static final int DRIVING_DEFAULT = 0;
   /** @deprecated */
   @Deprecated
   public static final int DRIVING_SAVE_MONEY = 1;
   /** @deprecated */
   @Deprecated
   public static final int DRIVING_SHORT_DISTANCE = 2;
   /** @deprecated */
   @Deprecated
   public static final int DRIVING_NO_HIGHWAY = 3;
   /** @deprecated */
   @Deprecated
   public static final int DRIVING_AVOID_CONGESTION = 4;
   /** @deprecated */
   @Deprecated
   public static final int DRIVING_NO_HIGHWAY_AVOID_SHORT_MONEY = 5;
   /** @deprecated */
   @Deprecated
   public static final int DRIVING_NO_HIGHWAY_AVOID_CONGESTION = 6;
   /** @deprecated */
   @Deprecated
   public static final int DRIVING_SAVE_MONEY_AVOID_CONGESTION = 7;
   /** @deprecated */
   @Deprecated
   public static final int DRIVING_NO_HIGHWAY_SAVE_MONEY_AVOID_CONGESTION = 8;
   private int naviStyle = 0;
   private LatLng latLng;

   public NaviPara() {
   }

   public void setTargetPoint(LatLng var1) {
      this.latLng = var1;
   }

   public void setNaviStyle(int var1) {
      byte var2 = 9;
      if (var1 >= 0 && var1 < var2) {
         this.naviStyle = var1;
      }

   }

   public LatLng getTargetPoint() {
      return this.latLng;
   }

   public int getNaviStyle() {
      return this.naviStyle;
   }
}
