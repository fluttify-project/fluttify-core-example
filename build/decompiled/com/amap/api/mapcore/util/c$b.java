package com.amap.api.mapcore.util;

class c$b {
   c$b(c var1) {
      this.a = var1;
   }

   public void a(aw var1) {
      if (this.a.c != null && this.a.c.isIndoorEnable()) {
         ft var2 = c.d(this.a).g();
         if (var1 == null) {
            try {
               if (c.A(this.a) != null) {
                  c.A(this.a).OnIndoorBuilding(var1);
               }
            } catch (Throwable var5) {
               var5.printStackTrace();
            }

            if (this.a.d != null) {
               this.a.d.g = null;
            }

            if (var2.d()) {
               this.a.j.post(new c$b$1(this, var2));
            }

            this.a.c.maxZoomLevel = this.a.c.isSetLimitZoomLevel() ? this.a.c.getMaxZoomLevel() : 20.0F;

            try {
               if (c.B(this.a).isZoomControlsEnabled() && c.C(this.a) != null) {
                  c.C(this.a).invalidateZoomController(this.a.c.getSZ());
               }

               return;
            } catch (Throwable var6) {
               var6.printStackTrace();
            }
         }

         if (var1 != null && var1.floor_indexs != null && var1.floor_names != null && var1.floor_indexs.length == var1.floor_names.length) {
            for(int var3 = 0; var3 < var1.floor_indexs.length; ++var3) {
               if (var1.activeFloorIndex == var1.floor_indexs[var3]) {
                  var1.activeFloorName = var1.floor_names[var3];
                  break;
               }
            }
         }

         if (var1 == null || this.a.d == null || this.a.d.activeFloorIndex == var1.activeFloorIndex || !var2.d()) {
            if (var1 != null && (this.a.d == null || !this.a.d.poiid.equals(var1.poiid) || this.a.d.g == null)) {
               this.a.d = var1;
               if (this.a.c != null) {
                  this.a.d.g = this.a.c.getMapGeoCenter();
               }
            }

            try {
               if (c.A(this.a) != null) {
                  c.A(this.a).OnIndoorBuilding(var1);
               }

               this.a.c.maxZoomLevel = this.a.c.isSetLimitZoomLevel() ? this.a.c.getMaxZoomLevel() : 20.0F;
               if (c.B(this.a).isZoomControlsEnabled() && c.C(this.a) != null) {
                  c.C(this.a).invalidateZoomController(this.a.c.getSZ());
               }

               if (c.B(this.a).isIndoorSwitchEnabled()) {
                  if (!var2.d()) {
                     c.B(this.a).setIndoorSwitchEnabled(true);
                  }

                  this.a.j.post(new c$b$2(this, var2));
               } else if (!c.B(this.a).isIndoorSwitchEnabled() && var2.d()) {
                  c.B(this.a).setIndoorSwitchEnabled(false);
                  return;
               }
            } catch (Throwable var4) {
               var4.printStackTrace();
            }

         }
      }
   }
}
