package com.amap.api.mapcore.util;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

final class lz$1 extends PhoneStateListener {
   lz$1(lz var1) {
      this.a = var1;
   }

   public final void onCellLocationChanged(CellLocation var1) {
      try {
         if (this.a.a(var1)) {
            this.a.e = var1;
            this.a.f = true;
            lz.a(this.a, mk.b());
         }
      } catch (Throwable var2) {
         ;
      }
   }

   public final void onSignalStrengthChanged(int var1) {
      try {
         int var2 = -113;
         switch(this.a.a) {
         case 1:
            var2 = mk.a(var1);
            break;
         case 2:
            var2 = mk.a(var1);
         }

         lz.a(this.a, var2);
      } catch (Throwable var3) {
         ;
      }
   }

   public final void onSignalStrengthsChanged(SignalStrength var1) {
      if (var1 != null) {
         try {
            int var2 = -113;
            switch(this.a.a) {
            case 1:
               var2 = mk.a(var1.getGsmSignalStrength());
               break;
            case 2:
               var2 = var1.getCdmaDbm();
            }

            lz.a(this.a, var2);
         } catch (Throwable var3) {
            ;
         }
      }
   }

   public final void onServiceStateChanged(ServiceState var1) {
      try {
         switch(var1.getState()) {
         case 0:
            this.a.f();
         default:
            return;
         case 1:
            this.a.h();
         }
      } catch (Throwable var2) {
         ;
      }
   }
}
