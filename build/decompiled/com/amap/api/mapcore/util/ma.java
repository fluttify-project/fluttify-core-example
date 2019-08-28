package com.amap.api.mapcore.util;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public final class ma {
   WifiManager a;
   ArrayList<ScanResult> b = new ArrayList();
   static long c = 0L;
   static long d = 0L;
   static long e = 0L;
   static long f = 0L;
   static long g = 0L;
   Context h;
   boolean i = false;
   StringBuilder j = null;
   boolean k = true;
   boolean l = true;
   boolean m = true;
   private volatile WifiInfo v = null;
   String n = null;
   TreeMap<Integer, ScanResult> o = null;
   public boolean p = true;
   public static HashMap<String, Long> q = new HashMap(36);
   public static long r = 0L;
   static int s = 0;
   ConnectivityManager t = null;
   private long w = 30000L;
   volatile boolean u = false;

   public ma(Context var1, WifiManager var2) {
      this.a = var2;
      this.h = var1;
   }

   private List<ScanResult> j() {
      if (this.a != null) {
         try {
            List var1 = this.a.getScanResults();
            if (VERSION.SDK_INT < 17) {
               r = mk.b();
            } else {
               HashMap var2 = new HashMap(36);
               Iterator var3 = var1.iterator();

               while(var3.hasNext()) {
                  ScanResult var4 = (ScanResult)var3.next();
                  var2.put(var4.BSSID, var4.timestamp);
               }

               if (q.isEmpty() || !q.equals(var2)) {
                  q = var2;
                  r = mk.b();
               }
            }

            this.n = null;
            return var1;
         } catch (SecurityException var5) {
            this.n = var5.getMessage();
         } catch (Throwable var6) {
            this.n = null;
            mg.a(var6, "WifiManagerWrapper", "getScanResults");
         }
      }

      return null;
   }

   private WifiInfo k() {
      try {
         if (this.a != null) {
            return this.a.getConnectionInfo();
         }
      } catch (Throwable var1) {
         mg.a(var1, "WifiManagerWrapper", "getConnectionInfo");
      }

      return null;
   }

   private int l() {
      return this.a != null ? this.a.getWifiState() : 4;
   }

   private boolean m() {
      long var1;
      if ((var1 = mk.b() - c) < 4900L) {
         return false;
      } else if (this.n() && var1 < 9900L) {
         return false;
      } else {
         if (s > 1) {
            long var3 = 30000L;
            if (this.w != 30000L) {
               var3 = this.w;
            } else if (mf.b() != -1L) {
               var3 = mf.b();
            }

            if (VERSION.SDK_INT >= 28 && var1 < var3) {
               return false;
            }
         }

         if (this.a != null) {
            c = mk.b();
            if (s < 2) {
               ++s;
            }

            return this.a.startScan();
         } else {
            return false;
         }
      }
   }

   public final boolean a(ConnectivityManager var1) {
      WifiManager var2 = this.a;
      if (this.a == null) {
         return false;
      } else {
         boolean var3 = false;

         try {
            if (mk.a(var1.getActiveNetworkInfo()) == 1 && a(var2.getConnectionInfo())) {
               var3 = true;
            }
         } catch (Throwable var4) {
            mg.a(var4, "WifiManagerWrapper", "wifiAccess");
         }

         return var3;
      }
   }

   private boolean n() {
      if (this.t == null) {
         this.t = (ConnectivityManager)mk.a(this.h, "connectivity");
      }

      return this.a(this.t);
   }

   private boolean o() {
      return this.a == null ? false : mk.c(this.h);
   }

   public final void a(boolean var1) {
      Context var2 = this.h;
      if (mf.a() && this.m) {
         if (this.a != null && var2 != null && var1) {
            if (mk.c() > 17) {
               ContentResolver var6 = var2.getContentResolver();
               String var7 = "android.provider.Settings$Global";
               Object[] var3;
               (var3 = new Object[2])[0] = var6;
               var3[1] = "wifi_scan_always_enabled";
               Class[] var4;
               (var4 = new Class[2])[0] = ContentResolver.class;
               var4[1] = String.class;

               try {
                  if (((Integer)mi.a(var7, "getInt", var3, var4)).intValue() == 0) {
                     (var3 = new Object[3])[0] = var6;
                     var3[1] = "wifi_scan_always_enabled";
                     var3[2] = Integer.valueOf(1);
                     (var4 = new Class[3])[0] = ContentResolver.class;
                     var4[1] = String.class;
                     var4[2] = Integer.TYPE;
                     mi.a(var7, "putInt", var3, var4);
                  }

               } catch (Throwable var5) {
                  mg.a(var5, "WifiManagerWrapper", "enableWifiAlwaysScan");
               }
            }
         }
      }
   }

   public static boolean a(WifiInfo var0) {
      boolean var1 = true;
      if (var0 == null) {
         var1 = false;
      } else if (TextUtils.isEmpty(var0.getSSID())) {
         var1 = false;
      } else if (!mk.a(var0.getBSSID())) {
         var1 = false;
      }

      return var1;
   }

   private void p() {
      if (this.b != null && !this.b.isEmpty()) {
         if (mk.b() - f > 3600000L) {
            this.b();
         }

         if (this.o == null) {
            this.o = new TreeMap(Collections.reverseOrder());
         }

         this.o.clear();
         int var1 = this.b.size();

         ScanResult var3;
         for(int var2 = 0; var2 < var1; ++var2) {
            if (mk.a((var3 = (ScanResult)this.b.get(var2)) != null ? var3.BSSID : "") && (var1 <= 20 || a(var3.level))) {
               if (!TextUtils.isEmpty(var3.SSID)) {
                  if (!"<unknown ssid>".equals(var3.SSID)) {
                     var3.SSID = String.valueOf(var2);
                  }
               } else {
                  var3.SSID = "unkwn";
               }

               this.o.put(var3.level * 25 + var2, var3);
            }
         }

         this.b.clear();
         Iterator var4 = this.o.values().iterator();

         while(var4.hasNext()) {
            var3 = (ScanResult)var4.next();
            this.b.add(var3);
         }

         this.o.clear();
      }
   }

   public final ArrayList<ScanResult> a() {
      if (this.b == null) {
         return null;
      } else {
         ArrayList var1 = new ArrayList();
         if (!this.b.isEmpty()) {
            var1.addAll(this.b);
         }

         return var1;
      }
   }

   public final void b(boolean var1) {
      if (var1) {
         this.q();
      } else {
         this.r();
      }

      if (this.u) {
         this.u = false;
         this.b();
      }

      this.s();
      if (mk.b() - f > 20000L) {
         this.b.clear();
      }

      d = mk.b();
      if (this.b.isEmpty()) {
         f = mk.b();
         List var2;
         if ((var2 = this.j()) != null) {
            this.b.addAll(var2);
         }
      }

      this.p();
   }

   private void q() {
      if (this.t()) {
         long var1 = mk.b();
         int var3 = 20;
         if (var1 - d >= 10000L) {
            this.b.clear();
            g = f;
         }

         this.r();
         if (var1 - d >= 10000L) {
            for(; var3 > 0 && f == g; --var3) {
               try {
                  Thread.sleep(150L);
               } catch (Throwable var4) {
                  ;
               }
            }
         }
      }

   }

   public final void c(boolean var1) {
      this.d(var1);
   }

   private void d(boolean var1) {
      this.k = var1;
      this.l = true;
      this.m = true;
      if (30000L < 10000L) {
         this.w = 10000L;
      } else {
         this.w = 30000L;
      }
   }

   public final void b() {
      this.v = null;
      this.b.clear();
   }

   private void r() {
      if (this.t()) {
         try {
            if (this.m()) {
               e = mk.b();
            }

            return;
         } catch (Throwable var1) {
            mg.a(var1, "WifiManager", "wifiScan");
         }
      }

   }

   private void s() {
      if (g != f) {
         List var1 = null;

         try {
            var1 = this.j();
         } catch (Throwable var2) {
            mg.a(var2, "WifiManager", "updateScanResult");
         }

         g = f;
         if (var1 != null) {
            this.b.clear();
            this.b.addAll(var1);
            return;
         }

         this.b.clear();
      }

   }

   public final void c() {
      if (this.a != null) {
         if (mk.b() - f > 4900L) {
            f = mk.b();
         }

      }
   }

   public final void d() {
      if (this.a != null) {
         int var1 = 4;

         try {
            var1 = this.l();
         } catch (Throwable var2) {
            mg.a(var2, "Aps", "onReceive part");
         }

         if (this.b == null) {
            this.b = new ArrayList();
         }

         switch(var1) {
         case 0:
         case 1:
         case 4:
            this.u = true;
         case 2:
         case 3:
         default:
         }
      }
   }

   private static boolean a(int var0) {
      try {
         var0 = WifiManager.calculateSignalLevel(var0, 20);
      } catch (ArithmeticException var1) {
         mg.a(var1, "Aps", "wifiSigFine");
         var0 = 20;
      }

      return var0 > 0;
   }

   public final boolean e() {
      return this.p;
   }

   private boolean t() {
      boolean var1 = true;
      this.p = this.o();
      if (!this.p) {
         var1 = false;
      } else if (!this.k) {
         var1 = false;
      } else if (e == 0L) {
         var1 = true;
      } else if (mk.b() - e < 4900L) {
         var1 = false;
      } else if (mk.b() - f < 1500L) {
         var1 = false;
      } else if (mk.b() - f > 4900L) {
         var1 = true;
      }

      return var1;
   }

   public final WifiInfo f() {
      this.v = this.k();
      return this.v;
   }

   public final boolean g() {
      return this.i;
   }

   public final void h() {
      this.b();
      this.b.clear();
   }

   public static String i() {
      return String.valueOf(mk.b() - f);
   }
}
