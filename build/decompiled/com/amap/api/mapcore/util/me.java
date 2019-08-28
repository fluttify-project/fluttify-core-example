package com.amap.api.mapcore.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.zip.CRC32;

@SuppressLint({"NewApi"})
public final class me {
   public String a = "1";
   public short b = 0;
   public String c = null;
   public String d = null;
   public String e = null;
   public String f = null;
   public String g = null;
   public String h = null;
   public String i = null;
   public String j = null;
   public String k = null;
   public String l = null;
   public String m = null;
   public String n = null;
   public String o = null;
   public String p = null;
   public String q = null;
   public String r = null;
   public String s = null;
   public String t = null;
   public String u = null;
   public String v = null;
   public String w = null;
   public String x = null;
   public String y = null;
   public int z = 0;
   public String A = null;
   public String B = null;
   public ArrayList<ly> C = new ArrayList();
   public String D = null;
   public String E = null;
   public ArrayList<ScanResult> F = new ArrayList();
   public String G = null;
   public String H = null;
   public byte[] I = null;
   private byte[] N = null;
   private int O = 0;
   public static String J = null;
   public String K = null;
   public static String L = null;
   public String M = null;

   public me() {
   }

   public final byte[] a() {
      this.b();
      byte[] var2 = new byte[2];
      byte[] var3 = new byte[4];
      int var4 = 4096;
      if (this.I != null) {
         var4 = 4096 + 1 + this.I.length;
      }

      byte[] var1;
      if (this.N != null && var4 <= this.O) {
         var1 = this.N;
      } else {
         var1 = new byte[var4];
         this.N = var1;
         this.O = var4;
      }

      var1[0] = mk.e(this.a);
      byte[] var40;
      System.arraycopy(var40 = mk.a(this.b, (byte[])null), 0, var1, 1, var40.length);
      var4 = 1 + var40.length;

      byte[] var5;
      try {
         var5 = this.c.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var37) {
         mg.a(var37, "Req", "buildV4Dot2");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.d.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var36) {
         mg.a(var36, "Req", "buildV4Dot21");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.o.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var35) {
         mg.a(var35, "Req", "buildV4Dot22");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.e.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var34) {
         mg.a(var34, "Req", "buildV4Dot23");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.f.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var33) {
         mg.a(var33, "Req", "buildV4Dot24");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.g.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var32) {
         mg.a(var32, "Req", "buildV4Dot25");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.u.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var31) {
         mg.a(var31, "Req", "buildV4Dot26");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.h.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var30) {
         mg.a(var30, "Req", "buildV4Dot27");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.p.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var29) {
         mg.a(var29, "Req", "buildV4Dot28");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.q.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var28) {
         mg.a(var28, "Req", "buildV4Dot29");
         var1[var4] = 0;
         ++var4;
      }

      try {
         if (TextUtils.isEmpty(this.t)) {
            var1[var4] = 0;
            ++var4;
         } else {
            var5 = this.a(this.t);
            var1[var4] = (byte)var5.length;
            ++var4;
            System.arraycopy(var5, 0, var1, var4, var5.length);
            var4 += var5.length;
         }
      } catch (Throwable var27) {
         mg.a(var27, "Req", "buildV4Dot219");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.v.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var26) {
         mg.a(var26, "Req", "buildV4Dot211");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.w.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var25) {
         mg.a(var25, "Req", "buildV4Dot212");
         var1[var4] = 0;
         ++var4;
      }

      try {
         if (TextUtils.isEmpty(J)) {
            var1[var4] = 0;
            ++var4;
         } else {
            var5 = J.getBytes("GBK");
            var1[var4] = (byte)var5.length;
            ++var4;
            System.arraycopy(var5, 0, var1, var4, var5.length);
            var4 += var5.length;
         }
      } catch (Throwable var24) {
         mg.a(var24, "Req", "buildV4Dot213");
         var1[var4] = 0;
         ++var4;
      }

      try {
         if (TextUtils.isEmpty(L)) {
            var1[var4] = 0;
            ++var4;
         } else {
            var5 = L.getBytes("GBK");
            var1[var4] = (byte)var5.length;
            ++var4;
            System.arraycopy(var5, 0, var1, var4, var5.length);
            var4 += var5.length;
         }
      } catch (Throwable var23) {
         mg.a(var23, "Req", "buildV4Dot214");
         var1[var4] = 0;
         ++var4;
      }

      try {
         var5 = this.x.getBytes("GBK");
         var1[var4] = (byte)var5.length;
         ++var4;
         System.arraycopy(var5, 0, var1, var4, var5.length);
         var4 += var5.length;
      } catch (Throwable var22) {
         mg.a(var22, "Req", "buildV4Dot213");
         var1[var4] = 0;
         ++var4;
      }

      var1[var4] = Byte.parseByte(this.y);
      ++var4;
      var1[var4] = Byte.parseByte(this.j);
      ++var4;
      int var49 = this.z & 3;
      var1[var4] = (byte)this.z;
      ++var4;
      byte[] var6;
      byte[] var7;
      byte[] var8;
      byte[] var10;
      int var45;
      int var48;
      if (var49 == 1 || var49 == 2) {
         System.arraycopy(var6 = mk.b(this.b("mcc")), 0, var1, var4, var6.length);
         var4 += var6.length;
         if (var49 == 1) {
            System.arraycopy(var6 = mk.b(this.b("mnc")), 0, var1, var4, var6.length);
            var4 += var6.length;
            System.arraycopy(var7 = mk.b(this.b("lac")), 0, var1, var4, var7.length);
            var4 += var7.length;
            System.arraycopy(var8 = mk.c(this.b("cellid")), 0, var1, var4, var8.length);
            var4 += var8.length;
         } else if (var49 == 2) {
            System.arraycopy(var6 = mk.b(this.b("sid")), 0, var1, var4, var6.length);
            var4 += var6.length;
            System.arraycopy(var7 = mk.b(this.b("nid")), 0, var1, var4, var7.length);
            var4 += var7.length;
            System.arraycopy(var8 = mk.b(this.b("bid")), 0, var1, var4, var8.length);
            var4 += var8.length;
            byte[] var9;
            System.arraycopy(var9 = mk.c(this.b("lon")), 0, var1, var4, var9.length);
            var4 += var9.length;
            System.arraycopy(var10 = mk.c(this.b("lat")), 0, var1, var4, var10.length);
            var4 += var10.length;
         }

         int var41;
         if ((var41 = Integer.parseInt(this.b("signal"))) > 127) {
            var41 = 0;
         } else if (var41 < -128) {
            var41 = 0;
         }

         var1[var4] = (byte)var41;
         ++var4;
         System.arraycopy(var7 = mk.a(0, var2), 0, var1, var4, var7.length);
         var4 += 2;
         if (var49 == 1) {
            if (TextUtils.isEmpty(this.B)) {
               var1[var4] = 0;
               ++var4;
            } else {
               var45 = this.B.split("\\*").length;
               var1[var4] = (byte)var45;
               ++var4;

               for(var48 = 0; var48 < var45; ++var48) {
                  System.arraycopy(var10 = mk.b(this.a("lac", var48)), 0, var1, var4, var10.length);
                  var4 += var10.length;
                  System.arraycopy(var5 = mk.c(this.a("cellid", var48)), 0, var1, var4, var5.length);
                  var4 += var5.length;
                  if ((var49 = Integer.parseInt(this.a("signal", var48))) > 127) {
                     var49 = 0;
                  } else if (var49 < -128) {
                     var49 = 0;
                  }

                  var1[var4] = (byte)var49;
                  ++var4;
               }
            }
         } else if (var49 == 2) {
            var1[var4] = 0;
            ++var4;
         }
      }

      int var42;
      label347: {
         String var43 = this.D;
         if (this.D != null && (this.z & 8) == 8) {
            try {
               var42 = Math.min((var6 = var43.getBytes("GBK")).length, 60);
               var1[var4] = (byte)var42;
               ++var4;
               System.arraycopy(var6, 0, var1, var4, var42);
               var4 += var42;
               break label347;
            } catch (Exception var38) {
               ;
            }
         }

         var1[var4] = 0;
         ++var4;
      }

      Object var46 = this.C;
      var48 = this.C.size();
      byte[] var12;
      if ((this.z & 4) == 4 && var48 > 0) {
         if (!((ly)((ArrayList)var46).get(0)).o) {
            --var48;
         }

         var1[var4] = (byte)var48;
         ++var4;

         for(int var11 = 0; var11 < var48; ++var11) {
            ly var44;
            if ((var44 = (ly)((ArrayList)var46).get(var11)).o) {
               byte var47;
               if (var44.k != 1 && var44.k != 3 && var44.k != 4) {
                  if (var44.k == 2) {
                     var47 = (byte)var44.k;
                     if (var44.n) {
                        var47 = (byte)(var47 | 8);
                     }

                     var1[var4] = var47;
                     ++var4;
                     System.arraycopy(var5 = mk.a(var44.a, var2), 0, var1, var4, var5.length);
                     var4 += var5.length;
                     System.arraycopy(var5 = mk.a(var44.g, var2), 0, var1, var4, var5.length);
                     var4 += var5.length;
                     System.arraycopy(var8 = mk.a(var44.h, var2), 0, var1, var4, var8.length);
                     var4 += var8.length;
                     System.arraycopy(var10 = mk.a(var44.i, var2), 0, var1, var4, var10.length);
                     var4 += var10.length;
                     System.arraycopy(var12 = mk.b(var44.f, var3), 0, var1, var4, var12.length);
                     var4 += var12.length;
                     byte[] var13;
                     System.arraycopy(var13 = mk.b(var44.e, var3), 0, var1, var4, var13.length);
                     var4 += var13.length;
                  }
               } else {
                  var47 = (byte)var44.k;
                  if (var44.n) {
                     var47 = (byte)(var47 | 8);
                  }

                  var1[var4] = var47;
                  ++var4;
                  System.arraycopy(var5 = mk.a(var44.a, var2), 0, var1, var4, var5.length);
                  var4 += var5.length;
                  System.arraycopy(var5 = mk.a(var44.b, var2), 0, var1, var4, var5.length);
                  var4 += var5.length;
                  System.arraycopy(var5 = mk.a(var44.c, var2), 0, var1, var4, var5.length);
                  var4 += var5.length;
                  System.arraycopy(var5 = mk.b(var44.d, var3), 0, var1, var4, var5.length);
                  var4 += var5.length;
               }

               int var51 = var44.j;
               if (var44.j > 127) {
                  var51 = 99;
               } else if (var51 < -128) {
                  var51 = 99;
               }

               var1[var4] = (byte)var51;
               ++var4;
               System.arraycopy(var5 = mk.a(var44.l, var2), 0, var1, var4, var5.length);
               var4 += var5.length;
            }
         }
      } else {
         var1[var4] = 0;
         ++var4;
      }

      if (this.E.length() == 0) {
         var1[var4] = 0;
         ++var4;
      } else {
         var1[var4] = 1;
         ++var4;

         try {
            String[] var52 = this.E.split(",");
            System.arraycopy(var5 = this.a(var52[0]), 0, var1, var4, var5.length);
            var4 += var5.length;

            try {
               var8 = var52[2].getBytes("GBK");
               var1[var4] = (byte)var8.length;
               ++var4;
               System.arraycopy(var8, 0, var1, var4, var8.length);
               var4 += var8.length;
            } catch (Throwable var20) {
               mg.a(var20, "Req", "buildV4Dot214");
               var1[var4] = 0;
               ++var4;
            }

            if ((var45 = Integer.parseInt(var52[1])) > 127) {
               var45 = 0;
            } else if (var45 < -128) {
               var45 = 0;
            }

            var1[var4] = Byte.parseByte(String.valueOf(var45));
            ++var4;
         } catch (Throwable var21) {
            mg.a(var21, "Req", "buildV4Dot216");
            System.arraycopy(var5 = this.a("00:00:00:00:00:00"), 0, var1, var4, var5.length);
            var4 += var5.length;
            var1[var4] = 0;
            ++var4;
            var1[var4] = Byte.parseByte("0");
            ++var4;
         }
      }

      ArrayList var53 = this.F;
      boolean var54;
      if ((var49 = Math.min(this.F.size(), 25)) == 0) {
         var1[var4] = 0;
         ++var4;
      } else {
         var1[var4] = (byte)var49;
         ++var4;
         var54 = mk.c() >= 17;
         long var55 = 0L;
         if (var54) {
            var55 = mk.b() / 1000L;
         }

         for(var42 = 0; var42 < var49; ++var42) {
            ScanResult var56 = (ScanResult)var53.get(var42);
            System.arraycopy(var3 = this.a(var56.BSSID), 0, var1, var4, var3.length);
            var4 += var3.length;

            try {
               var3 = var56.SSID.getBytes("GBK");
               var1[var4] = (byte)var3.length;
               ++var4;
               System.arraycopy(var3, 0, var1, var4, var3.length);
               var4 += var3.length;
            } catch (Exception var19) {
               var1[var4] = 0;
               ++var4;
            }

            int var39 = var56.level;
            if (var56.level > 127) {
               var39 = 0;
            } else if (var39 < -128) {
               var39 = 0;
            }

            var1[var4] = Byte.parseByte(String.valueOf(var39));
            ++var4;
            if (!var54 || (var46 = (int)((var55 - var56.timestamp) / 1000000L + 1L)) < 0) {
               var46 = false;
            }

            System.arraycopy(var46 = mk.a((int)var46, var2), 0, var1, var4, ((Object[])var46).length);
            var4 += ((Object[])var46).length;
            System.arraycopy(var3 = mk.a(var56.frequency, var2), 0, var1, var4, var3.length);
            var4 += var3.length;
         }

         System.arraycopy(var7 = mk.a(Integer.parseInt(this.G), var2), 0, var1, var4, var7.length);
         var4 += var7.length;
      }

      var1[var4] = 0;
      ++var4;

      try {
         if ((var8 = this.H.getBytes("GBK")).length > 127) {
            var8 = null;
         }

         if (var8 == null) {
            var1[var4] = 0;
            ++var4;
         } else {
            var1[var4] = (byte)var8.length;
            ++var4;
            System.arraycopy(var8, 0, var1, var4, var8.length);
            var4 += var8.length;
         }
      } catch (Throwable var18) {
         var1[var4] = 0;
         ++var4;
      }

      var8 = new byte[]{0, 0};

      try {
         if (!(var54 = TextUtils.isEmpty(this.K))) {
            var8 = mk.a(this.K.length(), var2);
         }

         System.arraycopy(var8, 0, var1, var4, 2);
         var4 += 2;
         if (!var54) {
            try {
               System.arraycopy(var12 = this.K.getBytes("GBK"), 0, var1, var4, var12.length);
               var4 += var12.length;
            } catch (Throwable var16) {
               ;
            }
         }
      } catch (Throwable var17) {
         var4 += 2;
      }

      byte[] var10000 = new byte[]{0, 0};

      try {
         System.arraycopy(mk.a(0, var2), 0, var1, var4, 2);
         var4 += 2;
      } catch (Throwable var15) {
         var4 += 2;
      }

      var12 = new byte[]{0, 0};

      try {
         System.arraycopy(var12, 0, var1, var4, 2);
         var4 += 2;
      } catch (Throwable var14) {
         var4 += 2;
      }

      int var57 = 0;
      if (this.I != null) {
         var57 = this.I.length;
      }

      System.arraycopy(var3 = mk.a(var57, (byte[])null), 0, var1, var4, var3.length);
      var4 += var3.length;
      if (var57 > 0) {
         System.arraycopy(this.I, 0, var1, var4, this.I.length);
         var4 += this.I.length;
      }

      var3 = new byte[var4];
      System.arraycopy(var1, 0, var3, 0, var4);
      CRC32 var50;
      (var50 = new CRC32()).update(var3);
      var6 = mk.a(var50.getValue());
      var7 = new byte[var4 + var6.length];
      System.arraycopy(var3, 0, var7, 0, var4);
      System.arraycopy(var6, 0, var7, var4, var6.length);
      return var7;
   }

   private byte[] a(String var1) {
      String[] var2 = var1.split(":");
      byte[] var3 = new byte[6];

      try {
         int var4;
         if (var2 == null || var2.length != 6) {
            var2 = new String[6];

            for(var4 = 0; var4 < var2.length; ++var4) {
               var2[var4] = "0";
            }
         }

         for(var4 = 0; var4 < var2.length; ++var4) {
            if (var2[var4].length() > 2) {
               var2[var4] = var2[var4].substring(0, 2);
            }

            int var5 = Integer.parseInt(var2[var4], 16);
            var3[var4] = (byte)var5;
         }
      } catch (Throwable var6) {
         mg.a(var6, "Req", "getMacBa " + var1);
         var3 = this.a("00:00:00:00:00:00");
      }

      return var3;
   }

   private String b(String var1) {
      if (!this.A.contains(var1 + ">")) {
         return "0";
      } else {
         int var2 = this.A.indexOf(var1 + ">");
         int var3 = this.A.indexOf("</" + var1);
         return this.A.substring(var2 + var1.length() + 1, var3);
      }
   }

   private String a(String var1, int var2) {
      String[] var3 = this.B.split("\\*")[var2].split(",");
      if ("lac".equals(var1)) {
         return var3[0];
      } else if ("cellid".equals(var1)) {
         return var3[1];
      } else {
         return "signal".equals(var1) ? var3[2] : null;
      }
   }

   private void b() {
      if (TextUtils.isEmpty(this.a)) {
         this.a = "";
      }

      if (TextUtils.isEmpty(this.c)) {
         this.c = "";
      }

      if (TextUtils.isEmpty(this.d)) {
         this.d = "";
      }

      if (TextUtils.isEmpty(this.e)) {
         this.e = "";
      }

      if (TextUtils.isEmpty(this.f)) {
         this.f = "";
      }

      if (TextUtils.isEmpty(this.g)) {
         this.g = "";
      }

      if (TextUtils.isEmpty(this.h)) {
         this.h = "";
      }

      if (TextUtils.isEmpty(this.i)) {
         this.i = "";
      }

      if (TextUtils.isEmpty(this.j)) {
         this.j = "0";
      } else if (!"0".equals(this.j) && !"2".equals(this.j)) {
         this.j = "0";
      }

      if (TextUtils.isEmpty(this.k)) {
         this.k = "0";
      } else if (!"0".equals(this.k) && !"1".equals(this.k)) {
         this.k = "0";
      }

      if (TextUtils.isEmpty(this.l)) {
         this.l = "";
      }

      if (TextUtils.isEmpty(this.m)) {
         this.m = "";
      }

      if (TextUtils.isEmpty(this.n)) {
         this.n = "";
      }

      if (TextUtils.isEmpty(this.o)) {
         this.o = "";
      }

      if (TextUtils.isEmpty(this.p)) {
         this.p = "";
      }

      if (TextUtils.isEmpty(this.q)) {
         this.q = "";
      }

      if (TextUtils.isEmpty(this.r)) {
         this.r = "";
      }

      if (TextUtils.isEmpty(this.s)) {
         this.s = "";
      }

      if (TextUtils.isEmpty(this.t)) {
         this.t = "";
      }

      if (TextUtils.isEmpty(this.u)) {
         this.u = "";
      }

      if (TextUtils.isEmpty(this.v)) {
         this.v = "";
      }

      if (TextUtils.isEmpty(this.w)) {
         this.w = "";
      }

      if (TextUtils.isEmpty(this.x)) {
         this.x = "";
      }

      if (TextUtils.isEmpty(this.y)) {
         this.y = "0";
      } else if (!"1".equals(this.y) && !"2".equals(this.y)) {
         this.y = "0";
      }

      if (!lz.a(this.z)) {
         this.z = 0;
      }

      if (TextUtils.isEmpty(this.A)) {
         this.A = "";
      }

      if (TextUtils.isEmpty(this.B)) {
         this.B = "";
      }

      if (TextUtils.isEmpty(this.E)) {
         this.E = "";
      }

      if (TextUtils.isEmpty(this.G)) {
         this.G = "";
      }

      if (TextUtils.isEmpty(this.H)) {
         this.H = "";
      }

      if (TextUtils.isEmpty(J)) {
         J = "";
      }

      if (this.I == null) {
         this.I = new byte[0];
      }

   }

   public final void a(Context var1, boolean var2, boolean var3, lz var4, ma var5, ConnectivityManager var6, String var7) {
      String var8 = "0";
      String var9 = "0";
      String var10 = "0";
      String var11 = "0";
      String var12 = "0";
      String var13 = gu.f(var1);
      int var14 = mk.f();
      String var15 = "";
      String var16 = "";
      String var17 = "";
      this.K = var7;
      var7 = "api_serverSDK_130905";
      String var18 = "S128DF1572465B890OE3F7A13167KLEI";
      if (!var3) {
         var7 = "UC_nlp_20131029";
         var18 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
      }

      StringBuilder var35 = new StringBuilder();
      StringBuilder var19 = new StringBuilder();
      int var20 = var4.c();
      int var21 = var4.d();
      TelephonyManager var22 = var4.e();
      ArrayList var23 = var4.a();
      ArrayList var24 = var4.b();
      ArrayList var25 = var5.a();
      if (var21 == 2) {
         var8 = "1";
      }

      if (var22 != null) {
         if (TextUtils.isEmpty(mg.d)) {
            try {
               mg.d = gz.v(var1);
            } catch (Throwable var34) {
               mg.a(var34, "Aps", "getApsReq part4");
            }
         }

         if (TextUtils.isEmpty(mg.d)) {
            mg.d = "888888888888888";
         }

         if (TextUtils.isEmpty(mg.e)) {
            try {
               mg.e = var22.getSubscriberId();
            } catch (SecurityException var32) {
               ;
            } catch (Throwable var33) {
               mg.a(var33, "Aps", "getApsReq part2");
            }
         }

         if (TextUtils.isEmpty(mg.e)) {
            mg.e = "888888888888888";
         }
      }

      NetworkInfo var26 = null;

      try {
         var26 = var6.getActiveNetworkInfo();
      } catch (Throwable var31) {
         mg.a(var31, "Aps", "getApsReq part");
      }

      WifiInfo var36;
      boolean var27 = ma.a(var36 = var5.f());
      if (mk.a(var26) != -1) {
         var15 = mk.b(var22);
         if (var27 && var5.e()) {
            var16 = "2";
         } else {
            var16 = "1";
         }
      }

      int var42;
      if (!var23.isEmpty()) {
         StringBuilder var39;
         var39 = new StringBuilder();
         label138:
         switch(var21) {
         case 1:
            ly var37 = (ly)var23.get(0);
            var39.delete(0, var39.length());
            var39.append("<mcc>").append(var37.a).append("</mcc>");
            var39.append("<mnc>").append(var37.b).append("</mnc>");
            var39.append("<lac>").append(var37.c).append("</lac>");
            var39.append("<cellid>").append(var37.d);
            var39.append("</cellid>");
            var39.append("<signal>").append(var37.j);
            var39.append("</signal>");
            var17 = var39.toString();
            var42 = 1;

            while(true) {
               if (var42 >= var23.size()) {
                  break label138;
               }

               var37 = (ly)var23.get(var42);
               var35.append(var37.c).append(",");
               var35.append(var37.d).append(",");
               var35.append(var37.j);
               if (var42 < var23.size() - 1) {
                  var35.append("*");
               }

               ++var42;
            }
         case 2:
            ly var41 = (ly)var23.get(0);
            var39.delete(0, var39.length());
            var39.append("<mcc>").append(var41.a).append("</mcc>");
            var39.append("<sid>").append(var41.g).append("</sid>");
            var39.append("<nid>").append(var41.h).append("</nid>");
            var39.append("<bid>").append(var41.i).append("</bid>");
            if (var41.f > 0 && var41.e > 0) {
               var39.append("<lon>").append(var41.f).append("</lon>");
               var39.append("<lat>").append(var41.e).append("</lat>");
            }

            var39.append("<signal>").append(var41.j).append("</signal>");
            var17 = var39.toString();
         }

         var39.delete(0, var39.length());
      }

      if ((var20 & 4) == 4 && !var24.isEmpty()) {
         this.C.clear();
         this.C.addAll(var24);
      } else {
         this.C.clear();
      }

      if (var5.e()) {
         if (var27) {
            var19.append(var5.f().getBSSID()).append(",");
            int var40;
            if ((var40 = var5.f().getRssi()) < -128) {
               var40 = 0;
            } else if (var40 > 127) {
               var40 = 0;
            }

            var19.append(var40).append(",");
            String var38 = var36.getSSID();
            var42 = 32;

            try {
               var42 = var36.getSSID().getBytes("UTF-8").length;
            } catch (Exception var30) {
               ;
            }

            if (var42 >= 32) {
               var38 = "unkwn";
            }

            var19.append(var38.replace("*", "."));
         }

         if (var25 != null && this.F != null) {
            this.F.clear();
            this.F.addAll(var25);
         }
      } else {
         var5.b();
         if (this.F != null) {
            this.F.clear();
         }
      }

      if (!var2) {
         this.b = 2;
      } else {
         this.b = 0;
      }

      this.c = var7;
      this.d = var18;
      this.f = mk.d();
      this.g = "android" + mk.e();
      this.h = mk.b(var1);
      this.i = var8;
      this.j = var9;
      this.k = "0";
      this.l = var10;
      this.m = var11;
      this.n = var12;
      this.o = var13;
      this.p = mg.d;
      this.q = mg.e;
      this.s = String.valueOf(var14);
      this.t = mk.d(var1);
      this.v = "4.5.1";
      this.w = null;
      this.u = "";
      this.x = var15;
      this.y = var16;
      this.z = var20;
      this.A = var17;
      this.B = var35.toString();
      this.D = var4.i();
      this.G = ma.i();
      this.E = var19.toString();

      try {
         if (TextUtils.isEmpty(J)) {
            J = gz.h(var1);
         }
      } catch (Throwable var29) {
         ;
      }

      try {
         if (TextUtils.isEmpty(L)) {
            L = gz.b(var1);
         }
      } catch (Throwable var28) {
         ;
      }

      var35.delete(0, var35.length());
      var19.delete(0, var19.length());
   }
}
