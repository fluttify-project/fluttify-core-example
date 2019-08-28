package com.amap.api.mapcore.util;

import android.os.RemoteException;

class c$c implements ft$a {
   private c$c(c var1) {
      this.a = var1;
   }

   public void a(int var1) {
      if (this.a.d != null) {
         this.a.d.activeFloorIndex = this.a.d.floor_indexs[var1];
         this.a.d.activeFloorName = this.a.d.floor_names[var1];

         try {
            this.a.setIndoorBuildingInfo(this.a.d);
         } catch (RemoteException var3) {
            var3.printStackTrace();
         }
      }

   }
}
