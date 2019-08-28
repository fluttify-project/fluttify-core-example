package com.amap.api.mapcore.util;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Hashtable;
import java.util.Random;
import org.json.JSONObject;

public final class mk {
   private static int b = 0;
   private static String[] c = null;
   private static Hashtable<String, Long> d = new Hashtable();
   private static SparseArray<String> e = null;
   private static String[] f = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
   static WifiManager a = null;
   private static boolean g = false;

   public static int a(int var0) {
      return -113 + 2 * var0;
   }

   public static String[] a(TelephonyManager var0) {
      String var1 = null;
      if (var0 != null) {
         var1 = var0.getNetworkOperator();
      }

      String[] var5 = new String[]{"0", "0"};
      boolean var2 = true;
      if (TextUtils.isEmpty(var1)) {
         var2 = false;
      } else if (!TextUtils.isDigitsOnly(var1)) {
         var2 = false;
      } else if (var1.length() <= 4) {
         var2 = false;
      }

      if (var2) {
         var5[0] = var1.substring(0, 3);
         char[] var6 = var1.substring(3).toCharArray();

         int var3;
         for(var3 = 0; var3 < var6.length && Character.isDigit(var6[var3]); ++var3) {
            ;
         }

         var5[1] = var1.substring(3, 3 + var3);
      }

      int var7;
      try {
         var7 = Integer.parseInt(var5[0]);
      } catch (Throwable var4) {
         mg.a(var4, "Utils", "getMccMnc");
         var7 = 0;
      }

      if (var7 == 0) {
         var5[0] = "0";
      }

      if (!"0".equals(var5[0]) && !"0".equals(var5[1])) {
         c = var5;
      } else if ("0".equals(var5[0]) && "0".equals(var5[1]) && c != null) {
         var5 = c;
      }

      return var5;
   }

   public static long a() {
      return System.currentTimeMillis();
   }

   public static long b() {
      return SystemClock.elapsedRealtime();
   }

   public static boolean a(Context var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            String var1;
            if (c() < 17) {
               var1 = "android.provider.Settings$System";
               return b(var0, var1);
            } else {
               var1 = "android.provider.Settings$Global";
               return b(var0, var1);
            }
         } catch (Throwable var2) {
            return false;
         }
      }
   }

   private static boolean b(Context var0, String var1) throws Throwable {
      ContentResolver var4 = var0.getContentResolver();
      String var2 = ((String)mi.a(var1, "AIRPLANE_MODE_ON")).toString();
      Object[] var3;
      (var3 = new Object[2])[0] = var4;
      var3[1] = var2;
      Class[] var5;
      (var5 = new Class[2])[0] = ContentResolver.class;
      var5[1] = String.class;
      return ((Integer)mi.a(var1, "getInt", var3, var5)).intValue() == 1;
   }

   public static float a(double[] var0) {
      if (var0.length != 4) {
         return 0.0F;
      } else {
         float[] var1 = new float[1];
         Location.distanceBetween(var0[0], var0[1], var0[2], var0[3], var1);
         return var1[0];
      }
   }

   public static Object a(Context var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         Object var2 = null;

         try {
            var2 = var0.getApplicationContext().getSystemService(var1);
         } catch (Throwable var3) {
            mg.a(var3, "Utils", "getServ");
         }

         return var2;
      }
   }

   public static int c() {
      if (b > 0) {
         return b;
      } else {
         int var0 = 0;
         String var1 = "android.os.Build$VERSION";

         try {
            var0 = mi.b(var1, "SDK_INT");
         } catch (Throwable var3) {
            try {
               var0 = Integer.parseInt(mi.a(var1, "SDK").toString());
            } catch (Throwable var2) {
               ;
            }
         }

         return var0;
      }
   }

   public static byte[] a(byte[] var0) {
      byte[] var1 = null;

      try {
         var1 = hg.b(var0);
      } catch (Throwable var2) {
         mg.a(var2, "Utils", "gz");
      }

      return var1;
   }

   public static String d() {
      return Build.MODEL;
   }

   public static String e() {
      return VERSION.RELEASE;
   }

   public static String b(Context var0) {
      if (!TextUtils.isEmpty(mg.g)) {
         return mg.g;
      } else if (var0 == null) {
         return null;
      } else {
         String var1 = gu.c(var0);
         PackageInfo var2 = null;

         try {
            var2 = var0.getPackageManager().getPackageInfo(var1, 64);
         } catch (Throwable var5) {
            mg.a(var5, "Utils", "getAppName part");
         }

         try {
            if (TextUtils.isEmpty(mg.h)) {
               mg.h = null;
            }
         } catch (Throwable var4) {
            mg.a(var4, "Utils", "getAppName");
         }

         StringBuilder var7 = new StringBuilder();
         CharSequence var3 = null;
         if (var2 != null) {
            if (var2.applicationInfo != null) {
               var3 = var2.applicationInfo.loadLabel(var0.getPackageManager());
            }

            if (var3 != null) {
               var7.append(var3.toString());
            }

            if (!TextUtils.isEmpty(var2.versionName)) {
               var7.append(var2.versionName);
            }
         }

         String var6;
         if (!TextUtils.isEmpty(var6 = gu.c(var0))) {
            var7.append(",").append(var6);
         }

         if (!TextUtils.isEmpty(mg.h)) {
            var7.append(",").append(mg.h);
         }

         return mg.g = var7.toString();
      }
   }

   public static int f() {
      return (new Random()).nextInt(65536) + -32768;
   }

   public static boolean a(JSONObject var0, String var1) {
      return hg.a(var0, var1);
   }

   public static boolean a(String var0) {
      String var1 = " :";
      boolean var2 = true;
      if (TextUtils.isEmpty(var0)) {
         var2 = false;
      } else if ("00:00:00:00:00:00".equals(var0)) {
         var2 = false;
      } else if (var0.contains(var1)) {
         var2 = false;
      }

      return var2;
   }

   public static int a(NetworkInfo var0) {
      int var1;
      if (var0 == null) {
         var1 = -1;
      } else if (!var0.isAvailable()) {
         var1 = -1;
      } else if (!var0.isConnected()) {
         var1 = -1;
      } else {
         var1 = var0.getType();
      }

      return var1;
   }

   public static String b(TelephonyManager var0) {
      if (e == null) {
         (e = new SparseArray()).append(0, "UNKWN");
         e.append(1, "GPRS");
         e.append(2, "EDGE");
         e.append(3, "UMTS");
         e.append(4, "CDMA");
         e.append(5, "EVDO_0");
         e.append(6, "EVDO_A");
         e.append(7, "1xRTT");
         e.append(8, "HSDPA");
         e.append(9, "HSUPA");
         e.append(10, "HSPA");
         e.append(11, "IDEN");
         e.append(12, "EVDO_B");
         e.append(13, "LTE");
         e.append(14, "EHRPD");
         e.append(15, "HSPAP");
      }

      int var1 = 0;
      if (var0 != null) {
         var1 = var0.getNetworkType();
      }

      return (String)e.get(var1, "UNKWN");
   }

   public static byte[] a(long var0) {
      byte[] var2 = new byte[8];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var2[var3] = (byte)((int)(var0 >> var3 * 8 & 255L));
      }

      return var2;
   }

   public static byte[] b(String var0) {
      return a(d(var0), (byte[])null);
   }

   public static byte[] a(int var0, byte[] var1) {
      if (var1 == null || var1.length < 2) {
         var1 = new byte[2];
      }

      var1[0] = (byte)(255 & var0);
      var1[1] = (byte)(('\uff00' & var0) >> 8);
      return var1;
   }

   public static byte[] c(String var0) {
      return b(d(var0), (byte[])null);
   }

   public static byte[] b(int var0, byte[] var1) {
      if (var1 == null || var1.length < 4) {
         var1 = new byte[4];
      }

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = (byte)(var0 >> var2 * 8 & 255);
      }

      return var1;
   }

   public static double a(double var0) {
      return (double)((long)(var0 * 1000000.0D)) / 1000000.0D;
   }

   public static double b(double var0) {
      return (double)((long)(var0 * 100.0D)) / 100.0D;
   }

   public static float a(float var0) {
      return (float)((double)((long)((double)var0 * 100.0D)) / 100.0D);
   }

   public static String b(int var0) {
      String var1 = "其他错误";
      switch(var0) {
      case 0:
         var1 = "success";
         break;
      case 1:
         var1 = "重要参数为空";
         break;
      case 2:
         var1 = "WIFI信息不足";
         break;
      case 3:
         var1 = "请求参数获取出现异常";
         break;
      case 4:
         var1 = "网络连接异常";
         break;
      case 5:
         var1 = "解析数据异常";
         break;
      case 6:
         var1 = "定位结果错误";
         break;
      case 7:
         var1 = "KEY错误";
         break;
      case 8:
         var1 = "其他错误";
         break;
      case 9:
         var1 = "初始化异常";
         break;
      case 10:
         var1 = "定位服务启动失败";
         break;
      case 11:
         var1 = "错误的基站信息，请检查是否插入SIM卡";
         break;
      case 12:
         var1 = "缺少定位权限";
         break;
      case 13:
         var1 = "网络定位失败，请检查设备是否插入sim卡，是否开启移动网络或开启了wifi模块";
         break;
      case 14:
         var1 = "GPS 定位失败，由于设备当前 GPS 状态差,建议持设备到相对开阔的露天场所再次尝试";
         break;
      case 15:
         var1 = "当前返回位置为模拟软件返回，请关闭模拟软件，或者在option中设置允许模拟";
      case 16:
      case 17:
      default:
         break;
      case 18:
         var1 = "定位失败，飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关";
         break;
      case 19:
         var1 = "定位失败，没有检查到SIM卡，并且关闭了WIFI开关，请打开WIFI开关或者插入SIM卡";
      }

      return var1;
   }

   @SuppressLint({"NewApi"})
   public static boolean c(Context var0) {
      if (var0 == null) {
         return true;
      } else {
         if (a == null) {
            a = (WifiManager)a(var0, "wifi");
         }

         boolean var4 = false;

         try {
            var4 = a.isWifiEnabled();
         } catch (Throwable var3) {
            ;
         }

         if (!var4 && c() > 17) {
            try {
               Object var1 = mi.a(a, "isScanAlwaysAvailable");
               var4 = "true".equals(String.valueOf(var1));
            } catch (Throwable var2) {
               ;
            }
         }

         return var4;
      }
   }

   public static String d(Context var0) {
      String var1;
      if (TextUtils.isEmpty(var1 = gz.m(var0)) || var1.equals("00:00:00:00:00:00")) {
         var1 = mj.a(var0);
      }

      if (TextUtils.isEmpty(var1)) {
         var1 = "00:00:00:00:00:00";
      }

      if (!g) {
         mj.a(var0, var1);
         g = true;
      }

      return var1;
   }

   public static int d(String var0) throws NumberFormatException {
      return Integer.parseInt(var0);
   }

   public static byte e(String var0) throws NumberFormatException {
      return Byte.parseByte(var0);
   }

   public static boolean e(Context var0) {
      return VERSION.SDK_INT >= 28 && var0.getApplicationInfo().targetSdkVersion >= 28;
   }
}
