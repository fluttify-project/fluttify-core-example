package com.amap.api.mapcore.util;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Xml;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class gz {
   static String a = "";
   static String b = "";
   public static boolean c = false;
   static String d = "";
   static boolean e = false;
   private static String i = null;
   private static boolean j = false;
   private static String k = "";
   private static String l = "";
   private static String m = "";
   private static String n = "";
   private static String o = "";
   private static String p = "";
   private static boolean q = false;
   static int f = -1;
   static String g = "";
   static String h = "";
   private static long r;
   private static int s;
   private static String t;
   private static String u = "";

   public static String a() {
      return i;
   }

   public static String a(Context var0) {
      try {
         if (!TextUtils.isEmpty(d)) {
            return d;
         }

         hf var1 = ho.a();
         boolean var2 = ik.a(var0, var1);
         if (var2) {
            Class var3 = ik.a(var0, var1, hg.c("WY29tLmFtYXAuYXBpLmFpdW5ldC5OZXRSZXVlc3RQYXJhbQ"));
            if (var3 != null) {
               Method var4 = var3.getMethod("getAdiuExtras");
               String var5 = (String)var4.invoke(var3);
               d = var5;
            }

            return d;
         }
      } catch (Throwable var6) {
         ;
      }

      return "";
   }

   public static String b(Context var0) {
      try {
         if (!TextUtils.isEmpty(b)) {
            return b;
         }

         hf var1 = ho.a();
         if (var1 == null) {
            return null;
         }

         boolean var2 = ik.a(var0, var1);
         if (var2) {
            Class var3 = ik.a(var0, var1, hg.c("WY29tLmFtYXAuYXBpLmFpdW5ldC5OZXRSZXVlc3RQYXJhbQ"));
            if (var3 == null) {
               return b;
            }

            Method var4 = var3.getMethod("getADIU", Context.class);
            String var5 = (String)var4.invoke(var3, var0);
            if (!TextUtils.isEmpty(var5)) {
               b = var5;
               return var5;
            }

            if (!j) {
               j = true;
               ht.d().submit(new gz$1(var3, var0));
            }
         }
      } catch (Throwable var6) {
         ;
      }

      return "";
   }

   public static String c(Context var0) {
      try {
         return C(var0);
      } catch (Throwable var2) {
         var2.printStackTrace();
         return "";
      }
   }

   public static String d(Context var0) {
      if (VERSION.SDK_INT >= 29) {
         return "";
      } else {
         String var1 = "";

         try {
            return F(var0);
         } catch (Throwable var3) {
            var3.printStackTrace();
            return var1;
         }
      }
   }

   public static int e(Context var0) {
      byte var1 = -1;

      try {
         return G(var0);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return var1;
      }
   }

   public static int f(Context var0) {
      byte var1 = -1;

      try {
         return D(var0);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return var1;
      }
   }

   public static String g(Context var0) {
      try {
         return B(var0);
      } catch (Throwable var2) {
         var2.printStackTrace();
         return "";
      }
   }

   public static void b() {
      try {
         if (VERSION.SDK_INT > 14) {
            Method var0 = TrafficStats.class.getDeclaredMethod("setThreadStatsTag", Integer.TYPE);
            var0.invoke((Object)null, Integer.valueOf(40964));
         }
      } catch (Throwable var1) {
         ;
      }

   }

   private static String A(Context var0) {
      FileInputStream var1 = null;

      try {
         if (!hg.a(var0, "android.permission.READ_EXTERNAL_STORAGE") || !"mounted".equals(Environment.getExternalStorageState())) {
            return "";
         } else {
            String var2 = Environment.getExternalStorageDirectory().getAbsolutePath();
            String var3 = var2 + "/.UTSystemConfig/Global/Alvin2.xml";
            File var4 = new File(var3);
            XmlPullParser var5 = Xml.newPullParser();
            int var6 = var5.getEventType();
            var1 = new FileInputStream(var4);
            var5.setInput(var1, "utf-8");

            for(boolean var7 = false; 1 != var6; var6 = var5.next()) {
               switch(var6) {
               case 0:
               case 1:
               default:
                  break;
               case 2:
                  if (var5.getAttributeCount() <= 0) {
                     break;
                  }

                  int var23 = var5.getAttributeCount();
                  int var9 = 0;

                  for(; var9 < var23; ++var9) {
                     String var10 = var5.getAttributeValue(var9);
                     if ("UTDID2".equals(var10) || "UTDID".equals(var10)) {
                        var7 = true;
                     }
                  }
                  break;
               case 3:
                  var7 = false;
                  break;
               case 4:
                  if (var7) {
                     String var8 = var5.getText();
                     return var8;
                  }
               }
            }

            return "";
         }
      } catch (Throwable var21) {
         return "";
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Throwable var20) {
            ;
         }

      }
   }

   public static String h(Context var0) {
      if (VERSION.SDK_INT >= 29) {
         return "";
      } else {
         try {
            if (a != null && !"".equals(a)) {
               return a;
            }

            if (a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
               a = System.getString(var0.getContentResolver(), "mqBRboGZkQPcAkyk");
            }

            if (a != null && !"".equals(a)) {
               return a;
            }
         } catch (Throwable var3) {
            ;
         }

         try {
            a = A(var0);
         } catch (Throwable var2) {
            ;
         }

         return a == null ? "" : a;
      }
   }

   public static String i(Context var0) {
      if (VERSION.SDK_INT >= 29) {
         return "";
      } else if (!TextUtils.isEmpty(l)) {
         return l;
      } else if (!a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
         return "";
      } else {
         try {
            if (VERSION.SDK_INT >= 26) {
               Method var1 = hg.a(Build.class, "MZ2V0U2VyaWFs");
               String var2 = (String)var1.invoke(Build.class);
               return var2;
            }

            if (VERSION.SDK_INT >= 9) {
               l = Build.SERIAL;
            }
         } catch (Throwable var3) {
            ;
         }

         return l == null ? "" : l;
      }
   }

   public static String j(Context var0) {
      if (!TextUtils.isEmpty(k)) {
         return k;
      } else {
         try {
            k = Secure.getString(var0.getContentResolver(), hg.c(new String(ho.a(13))));
            return k == null ? "" : k;
         } catch (Throwable var2) {
            return k;
         }
      }
   }

   private static boolean a(Context var0, String var1) {
      return var0 != null && var0.checkCallingOrSelfPermission(var1) == 0;
   }

   static String k(Context var0) {
      String var1 = "";

      try {
         if (var0 == null || !a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
            return var1;
         }

         WifiManager var2 = (WifiManager)var0.getSystemService("wifi");
         if (var2 == null) {
            return var1;
         }

         if (var2.isWifiEnabled()) {
            WifiInfo var3 = var2.getConnectionInfo();
            var1 = var3.getBSSID();
         }
      } catch (Throwable var4) {
         ;
      }

      return var1;
   }

   static String l(Context var0) {
      StringBuilder var1 = new StringBuilder();

      try {
         if (var0 == null || !a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
            return var1.toString();
         }

         WifiManager var2 = (WifiManager)var0.getSystemService("wifi");
         if (var2 == null) {
            return "";
         }

         if (var2.isWifiEnabled()) {
            List var3 = var2.getScanResults();
            if (var3 == null || var3.size() == 0) {
               return var1.toString();
            }

            var3 = a(var3);
            boolean var4 = true;

            for(int var5 = 0; var5 < var3.size() && var5 < 7; ++var5) {
               ScanResult var6 = (ScanResult)var3.get(var5);
               if (var4) {
                  var4 = false;
               } else {
                  var1.append(";");
               }

               var1.append(var6.BSSID);
            }
         }
      } catch (Throwable var7) {
         ;
      }

      return var1.toString();
   }

   public static String m(Context var0) {
      try {
         if (m != null && !"".equals(m)) {
            return m;
         }

         if (!a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
            return m;
         }

         WifiManager var1 = (WifiManager)var0.getSystemService("wifi");
         if (var1 == null) {
            return "";
         }

         m = var1.getConnectionInfo().getMacAddress();
         if (hg.c("YMDI6MDA6MDA6MDA6MDA6MDA").equals(m) || hg.c("YMDA6MDA6MDA6MDA6MDA6MDA").equals(m)) {
            m = e();
         }
      } catch (Throwable var2) {
         ;
      }

      return m;
   }

   private static String e() {
      try {
         ArrayList var0 = Collections.list(NetworkInterface.getNetworkInterfaces());
         Iterator var1 = var0.iterator();

         while(var1.hasNext()) {
            NetworkInterface var2 = (NetworkInterface)var1.next();
            if (var2.getName().equalsIgnoreCase("wlan0")) {
               byte[] var3 = null;
               if (VERSION.SDK_INT >= 9) {
                  var3 = var2.getHardwareAddress();
               }

               if (var3 == null) {
                  return "";
               }

               StringBuilder var4 = new StringBuilder();
               byte[] var5 = var3;
               int var6 = var3.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  byte var8 = var5[var7];
                  String var9 = Integer.toHexString(var8 & 255).toUpperCase();
                  if (var9.length() == 1) {
                     var4.append("0");
                  }

                  var4.append(var9).append(":");
               }

               if (var4.length() > 0) {
                  var4.deleteCharAt(var4.length() - 1);
               }

               return var4.toString();
            }
         }
      } catch (Exception var10) {
         ;
      }

      return "";
   }

   static String[] n(Context var0) {
      try {
         if (!a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=")) || !a(var0, hg.c("EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04="))) {
            return new String[]{"", ""};
         }

         TelephonyManager var1 = (TelephonyManager)var0.getSystemService("phone");
         if (var1 == null) {
            return new String[]{"", ""};
         }

         CellLocation var2 = var1.getCellLocation();
         int var4;
         int var5;
         if (var2 instanceof GsmCellLocation) {
            GsmCellLocation var8 = (GsmCellLocation)var2;
            var4 = var8.getCid();
            var5 = var8.getLac();
            return new String[]{var5 + "||" + var4, "gsm"};
         }

         if (var2 instanceof CdmaCellLocation) {
            CdmaCellLocation var3 = (CdmaCellLocation)var2;
            var4 = var3.getSystemId();
            var5 = var3.getNetworkId();
            int var6 = var3.getBaseStationId();
            if (var4 >= 0 && var5 >= 0 && var6 < 0) {
               ;
            }

            return new String[]{var4 + "||" + var5 + "||" + var6, "cdma"};
         }
      } catch (Throwable var7) {
         ;
      }

      return new String[]{"", ""};
   }

   static String o(Context var0) {
      String var1 = "";

      try {
         TelephonyManager var2 = H(var0);
         if (var2 == null) {
            return "";
         }

         String var3 = var2.getNetworkOperator();
         if (TextUtils.isEmpty(var3) || var3.length() < 3) {
            return var1;
         }

         var1 = var3.substring(0, 3);
      } catch (Throwable var4) {
         ;
      }

      return var1;
   }

   static String p(Context var0) {
      String var1 = "";

      try {
         TelephonyManager var2 = H(var0);
         if (var2 == null) {
            return "";
         }

         String var3 = var2.getNetworkOperator();
         if (TextUtils.isEmpty(var3) || var3.length() < 3) {
            return var1;
         }

         var1 = var3.substring(3);
      } catch (Throwable var4) {
         ;
      }

      return var1;
   }

   public static int q(Context var0) {
      byte var1 = -1;

      try {
         return G(var0);
      } catch (Throwable var3) {
         return var1;
      }
   }

   public static int r(Context var0) {
      byte var1 = -1;

      try {
         return D(var0);
      } catch (Throwable var3) {
         return var1;
      }
   }

   public static NetworkInfo s(Context var0) {
      NetworkInfo var1 = null;
      if (!a(var0, hg.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
         return var1;
      } else {
         ConnectivityManager var2 = E(var0);
         if (var2 == null) {
            return var1;
         } else {
            var1 = var2.getActiveNetworkInfo();
            return var1;
         }
      }
   }

   static String t(Context var0) {
      String var1 = null;

      try {
         NetworkInfo var2 = s(var0);
         if (var2 == null) {
            return var1;
         }

         var1 = var2.getExtraInfo();
      } catch (Throwable var3) {
         ;
      }

      return var1;
   }

   static String u(Context var0) {
      try {
         if (n != null && !"".equals(n)) {
            return n;
         }

         DisplayMetrics var1 = new DisplayMetrics();
         WindowManager var2 = (WindowManager)var0.getSystemService("window");
         if (var2 == null) {
            return "";
         }

         var2.getDefaultDisplay().getMetrics(var1);
         int var3 = var1.widthPixels;
         int var4 = var1.heightPixels;
         n = var4 > var3 ? var3 + "*" + var4 : var4 + "*" + var3;
      } catch (Throwable var5) {
         ;
      }

      return n;
   }

   public static String a(Context var0, String var1, boolean var2) {
      if (VERSION.SDK_INT >= 29) {
         return "";
      } else {
         try {
            if (VERSION.SDK_INT < 21) {
               return "";
            } else if (!TextUtils.isEmpty(g)) {
               return g;
            } else if (!var2 && f >= 0 && f < 2) {
               return "";
            } else {
               TelephonyManager var3 = H(var0);
               Method var4;
               if (f == -1) {
                  var4 = hg.a(TelephonyManager.class, "UZ2V0UGhvbmVDb3VudA=");
                  if (var4 != null) {
                     try {
                        f = ((Integer)var4.invoke(var3)).intValue();
                     } catch (Throwable var8) {
                        f = 0;
                     }
                  } else {
                     f = 0;
                  }
               }

               if (!var2 && f <= 1) {
                  return "";
               } else {
                  var4 = hg.a(TelephonyManager.class, "MZ2V0SW1laQ=", Integer.TYPE);
                  if (var4 == null) {
                     f = 0;
                     return "";
                  } else {
                     StringBuilder var5 = new StringBuilder();

                     try {
                        for(int var6 = 0; var6 < f; ++var6) {
                           String var7 = (String)var4.invoke(var3, var6);
                           var5.append(var7).append(var1);
                        }
                     } catch (Throwable var9) {
                        ;
                     }

                     String var11 = var5.toString();
                     if (var11.length() == 0) {
                        f = 0;
                        return "";
                     } else {
                        g = var11.substring(0, var11.length() - 1);
                        return g;
                     }
                  }
               }
            }
         } catch (Throwable var10) {
            return "";
         }
      }
   }

   public static String v(Context var0) {
      try {
         if (VERSION.SDK_INT >= 29) {
            return "";
         }

         if (o != null && !"".equals(o)) {
            return o;
         }

         if (!a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return o;
         }

         TelephonyManager var1 = H(var0);
         if (var1 == null) {
            return "";
         }

         Method var2 = hg.a(var1.getClass(), "QZ2V0RGV2aWNlSWQ");
         if (VERSION.SDK_INT >= 26) {
            var2 = hg.a(var1.getClass(), "QZ2V0SW1laQ==");
         }

         if (var2 != null) {
            o = (String)var2.invoke(var1);
         }

         if (o == null) {
            o = "";
         }
      } catch (Throwable var3) {
         ;
      }

      return o;
   }

   public static String w(Context var0) {
      if (VERSION.SDK_INT >= 29) {
         return "";
      } else {
         try {
            if (p != null && !"".equals(p)) {
               return p;
            }

            if (!a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
               return p;
            }

            TelephonyManager var1 = H(var0);
            if (var1 == null) {
               return "";
            }

            if (VERSION.SDK_INT >= 26) {
               Method var2 = hg.a(var1.getClass(), "QZ2V0TWVpZA==");
               if (var2 != null) {
                  p = (String)var2.invoke(var1);
               }

               if (p == null) {
                  p = "";
               }
            }
         } catch (Throwable var3) {
            ;
         }

         return p;
      }
   }

   public static String x(Context var0) {
      String var1 = "";

      try {
         return B(var0);
      } catch (Throwable var3) {
         return var1;
      }
   }

   public static long c() {
      if (r != 0L) {
         return r;
      } else {
         try {
            StatFs var0 = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs var3 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long var1;
            long var4;
            if (VERSION.SDK_INT >= 18) {
               var1 = var0.getBlockCountLong() * var0.getBlockSizeLong() / 1048576L;
               var4 = var3.getBlockCountLong() * var3.getBlockSizeLong() / 1048576L;
            } else {
               var1 = (long)var0.getBlockCount() * (long)var0.getBlockSize() / 1048576L;
               var4 = (long)var3.getBlockCount() * (long)var3.getBlockSize() / 1048576L;
            }

            r = var1 + var4;
         } catch (Throwable var6) {
            ;
         }

         return r;
      }
   }

   public static int y(Context var0) {
      if (s != 0) {
         return s;
      } else {
         int var1 = 0;
         if (VERSION.SDK_INT >= 16) {
            ActivityManager var2 = (ActivityManager)var0.getSystemService("activity");
            if (var2 == null) {
               return 0;
            }

            MemoryInfo var3 = new MemoryInfo();
            var2.getMemoryInfo(var3);
            var1 = (int)(var3.totalMem / 1024L);
         } else {
            BufferedReader var17 = null;

            try {
               File var18 = new File("/proc/meminfo");
               var17 = new BufferedReader(new FileReader(var18));
               String var4 = var17.readLine();
               String[] var5 = var4.split("\\s+");
               var1 = Integer.valueOf(var5[1]).intValue();
            } catch (Throwable var15) {
               ;
            } finally {
               if (var17 != null) {
                  try {
                     var17.close();
                  } catch (IOException var14) {
                     ;
                  }
               }

            }
         }

         s = var1 / 1024;
         return s;
      }
   }

   public static String d() {
      if (!TextUtils.isEmpty(t)) {
         return t;
      } else {
         t = java.lang.System.getProperty("os.arch");
         return t;
      }
   }

   static String z(Context var0) {
      try {
         return C(var0);
      } catch (Throwable var2) {
         return "";
      }
   }

   private static String B(Context var0) throws InvocationTargetException, IllegalAccessException {
      if (VERSION.SDK_INT >= 29) {
         return "";
      } else if (u != null && !"".equals(u)) {
         return u;
      } else if (!a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
         return u;
      } else {
         TelephonyManager var1 = H(var0);
         if (var1 == null) {
            return "";
         } else {
            Method var2 = hg.a(var1.getClass(), "UZ2V0U3Vic2NyaWJlcklk");
            if (var2 != null) {
               u = (String)var2.invoke(var1);
            }

            if (u == null) {
               u = "";
            }

            return u;
         }
      }
   }

   private static String C(Context var0) {
      String var1 = null;
      if (!a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
         return var1;
      } else {
         TelephonyManager var2 = H(var0);
         if (var2 == null) {
            return "";
         } else {
            var1 = var2.getSimOperatorName();
            if (TextUtils.isEmpty(var1)) {
               var1 = var2.getNetworkOperatorName();
            }

            return var1;
         }
      }
   }

   private static int D(Context var0) {
      byte var1 = -1;
      if (var0 != null && a(var0, hg.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
         ConnectivityManager var2 = E(var0);
         if (var2 == null) {
            return var1;
         } else {
            NetworkInfo var3 = var2.getActiveNetworkInfo();
            if (var3 == null) {
               return var1;
            } else {
               int var4 = var3.getType();
               return var4;
            }
         }
      } else {
         return var1;
      }
   }

   private static ConnectivityManager E(Context var0) {
      ConnectivityManager var1 = (ConnectivityManager)var0.getSystemService("connectivity");
      return var1;
   }

   private static String F(Context var0) {
      String var1 = "";
      String var2 = x(var0);
      if (var2 != null && var2.length() >= 5) {
         var1 = var2.substring(3, 5);
         return var1;
      } else {
         return var1;
      }
   }

   private static int G(Context var0) {
      byte var1 = -1;
      if (!a(var0, hg.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
         return var1;
      } else {
         TelephonyManager var2 = H(var0);
         if (var2 == null) {
            return -1;
         } else {
            int var3 = var2.getNetworkType();
            return var3;
         }
      }
   }

   private static TelephonyManager H(Context var0) {
      TelephonyManager var1 = (TelephonyManager)var0.getSystemService("phone");
      return var1;
   }

   private static List<ScanResult> a(List<ScanResult> var0) {
      int var1 = var0.size();

      for(int var2 = 0; var2 < var1 - 1; ++var2) {
         for(int var3 = 1; var3 < var1 - var2; ++var3) {
            if (((ScanResult)var0.get(var3 - 1)).level > ((ScanResult)var0.get(var3)).level) {
               ScanResult var4 = (ScanResult)var0.get(var3 - 1);
               var0.set(var3 - 1, var0.get(var3));
               var0.set(var3, var4);
            }
         }
      }

      return var0;
   }
}
