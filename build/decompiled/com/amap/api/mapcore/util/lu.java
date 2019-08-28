package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol;

public final class lu {
   Context a = null;
   private ma e = null;
   private lz f = null;
   private lu$a g = null;
   private mc h = null;
   private ConnectivityManager i = null;
   private me j = null;
   boolean b = false;
   private StringBuilder k = new StringBuilder();
   private Inner_3dMap_locationOption l = null;
   String c = null;
   private ls m = null;
   long d = 0L;
   private final String n = "\"status\":\"0\"";
   private final String o = "</body></html>";

   public lu(Context var1) {
      try {
         this.a = var1.getApplicationContext();
         mk.b(this.a);
         this.a(this.a);
         this.l = new Inner_3dMap_locationOption();
         if (this.e == null) {
            WifiManager var3 = (WifiManager)mk.a(this.a, "wifi");
            this.e = new ma(this.a, var3);
            this.e.a(this.b);
         }

         if (this.f == null) {
            this.f = new lz(this.a);
         }

         if (this.h == null) {
            this.h = mc.a(this.a);
         }

         if (this.i == null) {
            this.i = (ConnectivityManager)mk.a(this.a, "connectivity");
         }

         this.j = new me();
         this.c();
      } catch (Throwable var2) {
         mg.a(var2, "MapNetLocation", "<init>");
      }
   }

   public final void a(Inner_3dMap_locationOption var1) {
      this.l = var1;
      if (this.l == null) {
         this.l = new Inner_3dMap_locationOption();
      }

      try {
         ma var10000 = this.e;
         this.l.isWifiActiveScan();
         var10000.c(this.l.isWifiScan());
      } catch (Throwable var3) {
         ;
      }

      try {
         this.h.a(this.l.getHttpTimeOut(), this.l.getLocationProtocol().equals(Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol.HTTPS));
      } catch (Throwable var2) {
         ;
      }
   }

   private void c() {
      try {
         if (this.g == null) {
            this.g = new lu$a(this, (byte)0);
         }

         IntentFilter var1;
         (var1 = new IntentFilter()).addAction("android.net.wifi.WIFI_STATE_CHANGED");
         var1.addAction("android.net.wifi.SCAN_RESULTS");
         this.a.registerReceiver(this.g, var1);
         this.e.b(false);
         this.f.f();
      } catch (Throwable var2) {
         mg.a(var2, "MapNetLocation", "initBroadcastListener");
      }
   }

   private void a(Context var1) {
      try {
         if (var1.checkCallingOrSelfPermission(hg.c("EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFQ1VSRV9TRVRUSU5HUw==")) == 0) {
            this.b = true;
         }

      } catch (Throwable var2) {
         ;
      }
   }

   private boolean a(long var1) {
      boolean var3 = false;
      if (mk.b() - var1 < 800L) {
         long var4 = 0L;
         if (lw.a(this.m)) {
            var4 = mk.a() - this.m.getTime();
         }

         if (var4 <= 10000L) {
            var3 = true;
         }
      }

      return var3;
   }

   public final Inner_3dMap_location a() {
      if (this.k.length() > 0) {
         this.k.delete(0, this.k.length());
      }

      if (this.a(this.d) && lw.a(this.m)) {
         return this.m;
      } else {
         this.d = mk.b();
         if (this.a == null) {
            this.k.append("context is null");
            Inner_3dMap_location var1;
            (var1 = new Inner_3dMap_location("")).setErrorCode(1);
            var1.setLocationDetail(this.k.toString());
            return var1;
         } else {
            try {
               this.f.f();
            } catch (Throwable var4) {
               mg.a(var4, "MapNetLocation", "getLocation getCgiListParam");
            }

            try {
               this.e.b(true);
            } catch (Throwable var3) {
               mg.a(var3, "MapNetLocation", "getLocation getScanResultsParam");
            }

            try {
               this.m = this.d();
               this.m = a(this.m);
            } catch (Throwable var2) {
               mg.a(var2, "MapNetLocation", "getLocation getScanResultsParam");
            }

            return this.m;
         }
      }
   }

   private ls d() throws Exception {
      ls var1 = new ls("");
      if (this.e != null && this.e.g()) {
         var1.setErrorCode(15);
         return var1;
      } else {
         try {
            if (this.j == null) {
               this.j = new me();
            }

            this.j.a(this.a, this.l.isNeedAddress(), this.l.isOffset(), this.f, this.e, this.i, this.c);
         } catch (Throwable var9) {
            mg.a(var9, "MapNetLocation", "getApsLoc");
            this.k.append("get parames error:" + var9.getMessage());
            var1.setErrorCode(3);
            var1.setLocationDetail(this.k.toString());
            return var1;
         }

         lv var2 = new lv();
         byte[] var3 = null;
         String var5 = "";

         byte[] var4;
         try {
            var4 = this.j.a();
         } catch (Throwable var8) {
            mg.a(var8, "MapNetLocation", "getApsLoc buildV4Dot2");
            var1.setErrorCode(3);
            this.k.append("buildV4Dot2 error " + var8.getMessage());
            var1.setLocationDetail(this.k.toString());
            return var1;
         }

         jk var12;
         try {
            md var11 = this.h.a(this.a, var4, mg.a());
            if ((var12 = this.h.a(var11)) != null) {
               var3 = var12.a;
               var5 = var12.c;
            }
         } catch (Throwable var7) {
            mg.a(var7, "MapNetLocation", "getApsLoc req");
            var1.setErrorCode(4);
            this.k.append("please check the network");
            var1.setLocationDetail(this.k.toString());
            return var1;
         }

         if (var3 != null && var3.length != 0) {
            String var6;
            if ((var6 = new String(var3, "UTF-8")).contains("\"status\":\"0\"")) {
               return var2.a(var6, this.a, var12);
            } else if (var6.contains("</body></html>")) {
               var1.setErrorCode(5);
               if (this.e != null && this.e.a(this.i)) {
                  this.k.append("make sure you are logged in to the network");
               } else {
                  this.k.append("request may be intercepted");
               }

               if (!TextUtils.isEmpty(var5)) {
                  this.k.append(" #csid:" + var5);
               }

               var1.setLocationDetail(this.k.toString());
               return var1;
            } else if ((var3 = mb.a(var3)) == null) {
               var1.setErrorCode(5);
               this.k.append("decrypt response data error");
               if (!TextUtils.isEmpty(var5)) {
                  this.k.append(" #csid:" + var5);
               }

               var1.setLocationDetail(this.k.toString());
               return var1;
            } else if ((var1 = var2.a(var3)) == null) {
               (var1 = new ls("")).setErrorCode(5);
               this.k.append("location is null");
               if (!TextUtils.isEmpty(var5)) {
                  this.k.append(" #csid:" + var5);
               }

               var1.setLocationDetail(this.k.toString());
               return var1;
            } else {
               this.c = var1.a();
               if (var1.getErrorCode() != 0) {
                  if (!TextUtils.isEmpty(var5)) {
                     var1.setLocationDetail(var1.getLocationDetail() + " #csid:" + var5);
                  }

                  return var1;
               } else if (lw.a(var1)) {
                  if (var1.e() != null) {
                     ;
                  }

                  if (var1.getErrorCode() == 0 && var1.getLocationType() == 0) {
                     if (!"-5".equals(var1.d()) && !"1".equals(var1.d()) && !"2".equals(var1.d()) && !"14".equals(var1.d()) && !"24".equals(var1.d()) && !"-1".equals(var1.d())) {
                        var1.setLocationType(6);
                     } else {
                        var1.setLocationType(5);
                     }

                     this.k.append(var1.d());
                     if (!TextUtils.isEmpty(var5)) {
                        this.k.append(" #csid:" + var5);
                     }

                     var1.setLocationDetail(this.k.toString());
                  }

                  return var1;
               } else {
                  String var10 = var1.b();
                  var1.setErrorCode(6);
                  this.k.append("location faile retype:" + var1.d() + " rdesc:" + (var10 != null ? var10 : "null"));
                  if (!TextUtils.isEmpty(var5)) {
                     this.k.append(" #csid:" + var5);
                  }

                  var1.setLocationDetail(this.k.toString());
                  return var1;
               }
            }
         } else {
            var1.setErrorCode(4);
            this.k.append("please check the network");
            if (!TextUtils.isEmpty(var5)) {
               this.k.append(" #csid:" + var5);
            }

            var1.setLocationDetail(this.k.toString());
            return var1;
         }
      }
   }

   private static ls a(ls var0, String... var1) {
      if (var1 != null && var1.length != 0) {
         if (var1[0].equals("shake")) {
            return lo.a().a(var0);
         } else if (var1[0].equals("fusion")) {
            lo.a();
            return lo.b(var0);
         } else {
            return var0;
         }
      } else {
         return lo.a().a(var0);
      }
   }

   public final void b() {
      this.b = false;
      this.c = null;

      try {
         if (this.a != null && this.g != null) {
            this.a.unregisterReceiver(this.g);
         }

         if (this.f != null) {
            this.f.g();
         }

         if (this.e != null) {
            this.e.h();
         }

         return;
      } catch (Throwable var4) {
         ;
      } finally {
         this.g = null;
      }

   }
}
