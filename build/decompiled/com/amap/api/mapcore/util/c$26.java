package com.amap.api.mapcore.util;

class c$26 implements Runnable {
   c$26(c var1) {
      this.a = var1;
   }

   public void run() {
      if (this.a.g != null) {
         this.a.g.setIndoorBuildingToBeActive(1, this.a.d.activeFloorName, this.a.d.activeFloorIndex, this.a.d.poiid);
      }

   }
}
