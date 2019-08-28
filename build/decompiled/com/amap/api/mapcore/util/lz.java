package com.amap.api.mapcore.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.HandlerThread;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"NewApi"})
public final class lz {
   private Context l;
   int a = 0;
   ArrayList<ly> b = new ArrayList();
   private String m = null;
   private ArrayList<ly> n = new ArrayList();
   private int o = -113;
   TelephonyManager c = null;
   private lx p = null;
   private Object q;
   long d = 0L;
   CellLocation e;
   private int r = 0;
   private long s = 0L;
   boolean f = false;
   PhoneStateListener g = null;
   String h = null;
   boolean i = false;
   StringBuilder j = null;
   HandlerThread k = null;
   private boolean t = false;
   private Object u = new Object();

   private void j() {
      if (this.c != null) {
         try {
            CellLocation var10002 = this.c.getCellLocation();
            Context var10003 = this.l;
            this.a = this.c(var10002);
         } catch (SecurityException var3) {
            this.h = var3.getMessage();
         } catch (Throwable var4) {
            this.h = null;
            mg.a(var4, "CgiManager", "CgiManager");
            this.a = 0;
         }

         try {
            this.r = this.u();
            switch(this.r) {
            case 1:
               this.q = mk.a(this.l, "phone_msim");
               break;
            case 2:
               this.q = mk.a(this.l, "phone2");
               break;
            default:
               this.q = mk.a(this.l, "phone2");
            }
         } catch (Throwable var2) {
            ;
         }

         if (this.k == null) {
            this.k = new lz$a(this, "listenerPhoneStateThread");
            this.k.start();
         }

      }
   }

   private void k() {
      this.g = new lz$1(this);
      String var1 = "android.telephony.PhoneStateListener";
      int var3 = 0;
      String var2;
      if (mk.c() < 7) {
         var2 = "LISTEN_SIGNAL_STRENGTH";

         try {
            var3 = mi.b(var1, var2);
         } catch (Throwable var7) {
            ;
         }
      } else {
         var2 = "LISTEN_SIGNAL_STRENGTHS";

         try {
            var3 = mi.b(var1, var2);
         } catch (Throwable var6) {
            ;
         }
      }

      if (var3 == 0) {
         try {
            this.c.listen(this.g, 16);
         } catch (Throwable var4) {
            ;
         }
      } else {
         try {
            this.c.listen(this.g, 16 | var3);
         } catch (Throwable var5) {
            ;
         }
      }
   }

   public lz(Context var1) {
      this.l = var1;
      if (this.c == null) {
         this.c = (TelephonyManager)mk.a(this.l, "phone");
      }

      this.j();
      this.p = new lx();
   }

   public final ArrayList<ly> a() {
      return this.b;
   }

   public final ArrayList<ly> b() {
      return this.n;
   }

   public final int c() {
      return this.a;
   }

   public final int d() {
      return this.a & 3;
   }

   private CellLocation l() {
      if (this.c != null) {
         try {
            CellLocation var1 = this.c.getCellLocation();
            this.h = null;
            if (this.b(var1)) {
               this.e = var1;
               return var1;
            }
         } catch (SecurityException var2) {
            this.h = var2.getMessage();
         } catch (Throwable var3) {
            this.h = null;
            mg.a(var3, "CgiManager", "getCellLocation");
         }
      }

      return null;
   }

   public final TelephonyManager e() {
      return this.c;
   }

   public final void f() {
      try {
         this.i = mk.a(this.l);
         if (this.m() || this.b.isEmpty()) {
            this.p();
            this.d = mk.b();
         }

         if (this.i) {
            this.n();
         } else {
            this.o();
         }
      } catch (SecurityException var2) {
         this.h = var2.getMessage();
      } catch (Throwable var3) {
         mg.a(var3, "CgiManager", "refresh");
      }
   }

   private boolean m() {
      boolean var1 = true;
      if (this.i) {
         var1 = false;
      } else if (mk.b() - this.d < 10000L) {
         var1 = false;
      }

      return var1;
   }

   private void n() {
      this.h();
   }

   public final void g() {
      this.p.a();
      this.s = 0L;
      Object var1 = this.u;
      synchronized(this.u) {
         this.t = true;
      }

      if (this.c != null && this.g != null) {
         try {
            this.c.listen(this.g, 0);
         } catch (Throwable var3) {
            mg.a(var3, "CgiManager", "destroy");
         }
      }

      this.g = null;
      if (this.k != null) {
         this.k.quit();
         this.k = null;
      }

      this.o = -113;
      this.c = null;
      this.q = null;
   }

   private void o() {
      switch(this.d()) {
      case 1:
         if (this.b.isEmpty()) {
            this.a = 0;
            return;
         }
         break;
      case 2:
         if (this.b.isEmpty()) {
            this.a = 0;
         }
      }

   }

   final boolean a(CellLocation var1) {
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = true;
         Context var10002 = this.l;
         switch(this.c(var1)) {
         case 1:
            try {
               GsmCellLocation var5;
               var2 = a((var5 = (GsmCellLocation)var1).getLac(), var5.getCid());
            } catch (Throwable var3) {
               mg.a(var3, "CgiManager", "cgiUseful Cgi.I_GSM_T");
            }
            break;
         case 2:
            try {
               if (mi.b(var1, "getSystemId") <= 0 || mi.b(var1, "getNetworkId") < 0 || mi.b(var1, "getBaseStationId") < 0) {
                  var2 = false;
               }
            } catch (Throwable var4) {
               mg.a(var4, "CgiManager", "cgiUseful Cgi.I_CDMA_T");
            }
         }

         return var2;
      }
   }

   private boolean b(CellLocation var1) {
      boolean var2;
      if (!(var2 = this.a(var1))) {
         this.a = 0;
      }

      return var2;
   }

   private static boolean a(int var0, int var1) {
      boolean var2 = true;
      if (var0 == -1 || var0 == 0 || var0 > 65535 || var1 == -1 || var1 == 0 || var1 == 65535 || var1 >= 268435455) {
         var2 = false;
      }

      return var2;
   }

   private void p() {
      if (!this.i && this.c != null) {
         CellLocation var1 = this.q();
         if (!this.b(var1)) {
            var1 = this.r();
         }

         if (this.b(var1)) {
            this.e = var1;
            this.s = mk.b();
         } else if (mk.b() - this.s > 60000L) {
            this.e = null;
            this.b.clear();
            this.n.clear();
         }
      }

      if (!this.f) {
         CellLocation var10000 = this.e;
      }

      this.f = true;
      if (this.b(this.e)) {
         String[] var3 = mk.a(this.c);
         Context var10002 = this.l;
         switch(this.c(this.e)) {
         case 1:
            this.a(this.e, var3);
            break;
         case 2:
            this.b(this.e, var3);
         }
      }

      try {
         if (mk.c() >= 18) {
            this.t();
         }
      } catch (Throwable var2) {
         ;
      }

      if (this.c != null) {
         this.m = this.c.getNetworkOperator();
         if (!TextUtils.isEmpty(this.m)) {
            this.a |= 8;
         }
      }

   }

   private void a(CellLocation var1, String[] var2) {
      if (var1 != null && this.c != null) {
         this.b.clear();
         if (this.b(var1)) {
            this.a = 1;
            this.b.add(this.c(var1, var2));
            List var4;
            if ((var4 = this.c.getNeighboringCellInfo()) != null && !var4.isEmpty()) {
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  NeighboringCellInfo var3;
                  ly var6;
                  if ((var3 = (NeighboringCellInfo)var5.next()) != null && a(var3.getLac(), var3.getCid()) && (var6 = a(var3, var2)) != null && !this.b.contains(var6)) {
                     this.b.add(var6);
                  }
               }

            }
         }
      }
   }

   private void b(CellLocation var1, String[] var2) {
      if (var1 != null) {
         this.b.clear();
         if (mk.c() >= 5) {
            try {
               CellLocation var3 = var1;
               if (this.q != null) {
                  boolean var4 = false;

                  try {
                     Field var5;
                     if (!(var5 = var3.getClass().getDeclaredField("mGsmCellLoc")).isAccessible()) {
                        var5.setAccessible(true);
                     }

                     GsmCellLocation var9;
                     if ((var9 = (GsmCellLocation)var5.get(var3)) != null && this.b((CellLocation)var9)) {
                        this.a((CellLocation)var9, var2);
                        var4 = true;
                     }
                  } catch (Throwable var6) {
                     ;
                  }

                  if (var4) {
                     return;
                  }
               }

               if (this.b(var1)) {
                  this.a = 2;
                  ly var8;
                  (var8 = new ly(2, true)).a = Integer.parseInt(var2[0]);
                  var8.b = Integer.parseInt(var2[1]);
                  var8.g = mi.b(var1, "getSystemId");
                  var8.h = mi.b(var1, "getNetworkId");
                  String var10 = "getBaseStationId";
                  var8.i = mi.b(var1, var10);
                  var8.j = this.o;
                  var10 = "getBaseStationLatitude";
                  var8.e = mi.b(var1, var10);
                  var10 = "getBaseStationLongitude";
                  var8.f = mi.b(var1, var10);
                  boolean var11 = var8.e == var8.f && var8.e > 0;
                  if (var8.e < 0 || var8.f < 0 || var8.e == Integer.MAX_VALUE || var8.f == Integer.MAX_VALUE || var11) {
                     var8.e = 0;
                     var8.f = 0;
                  }

                  if (!this.b.contains(var8)) {
                     this.b.add(var8);
                  }

               }
            } catch (Throwable var7) {
               mg.a(var7, "CgiManager", "hdlCdmaLocChange");
            }
         }
      }
   }

   private CellLocation a(Object var1, String var2, Object... var3) {
      if (var1 == null) {
         return null;
      } else {
         CellLocation var4 = null;

         try {
            if ((var1 = mi.a(var1, var2, var3)) != null) {
               var4 = (CellLocation)var1;
            }

            if (this.b(var4)) {
               return var4;
            }
         } catch (Throwable var5) {
            ;
         }

         return null;
      }
   }

   @SuppressLint({"NewApi"})
   private CellLocation q() {
      TelephonyManager var1 = this.c;
      if (this.c == null) {
         return null;
      } else {
         CellLocation var2 = this.l();
         if (this.b(var2)) {
            return var2;
         } else {
            var2 = null;
            if (mk.c() >= 18) {
               try {
                  List var3 = var1.getAllCellInfo();
                  var2 = this.a(var3);
               } catch (SecurityException var4) {
                  this.h = var4.getMessage();
               }
            }

            if (var2 != null) {
               return var2;
            } else if ((var2 = this.a(var1, "getCellLocationExt", Integer.valueOf(1))) != null) {
               return var2;
            } else {
               return (var2 = this.a(var1, "getCellLocationGemini", Integer.valueOf(1))) != null ? var2 : var2;
            }
         }
      }
   }

   private CellLocation r() {
      Object var1 = this.q;
      if (this.q == null) {
         return null;
      } else {
         CellLocation var2 = null;

         try {
            Class var3;
            if ((var3 = this.s()).isInstance(var1)) {
               var1 = var3.cast(var1);
               String var5 = "getCellLocation";
               if ((var2 = this.a(var1, var5)) != null) {
                  return var2;
               }

               if ((var2 = this.a(var1, var5, Integer.valueOf(1))) != null) {
                  return var2;
               }

               if ((var2 = this.a(var1, "getCellLocationGemini", Integer.valueOf(1))) != null) {
                  return var2;
               }

               if ((var2 = this.a(var1, "getAllCellInfo", Integer.valueOf(1))) != null) {
                  return var2;
               }
            }
         } catch (Throwable var4) {
            mg.a(var4, "CgiManager", "getSim2Cgi");
         }

         return var2;
      }
   }

   private Class<?> s() {
      ClassLoader var1 = ClassLoader.getSystemClassLoader();
      String var2 = null;
      switch(this.r) {
      case 0:
         var2 = "android.telephony.TelephonyManager";
         break;
      case 1:
         var2 = "android.telephony.MSimTelephonyManager";
         break;
      case 2:
         var2 = "android.telephony.TelephonyManager2";
      }

      Class var3 = null;

      try {
         var3 = var1.loadClass(var2);
      } catch (Throwable var4) {
         mg.a(var4, "CgiManager", "getSim2TmClass");
      }

      return var3;
   }

   @SuppressLint({"NewApi"})
   private void t() {
      if (this.c != null) {
         List var1 = null;
         ArrayList var3 = this.n;
         lx var4 = this.p;

         try {
            var1 = this.c.getAllCellInfo();
            this.h = null;
         } catch (SecurityException var9) {
            this.h = var9.getMessage();
         }

         int var2;
         if (var1 != null && (var2 = var1.size()) != 0) {
            if (var3 != null) {
               var3.clear();
            }

            for(int var7 = 0; var7 < var2; ++var7) {
               CellInfo var5;
               if ((var5 = (CellInfo)var1.get(var7)) != null) {
                  try {
                     boolean var6 = var5.isRegistered();
                     ly var11;
                     if (var5 instanceof CellInfoCdma) {
                        CellInfoCdma var10;
                        if (a((var10 = (CellInfoCdma)var5).getCellIdentity())) {
                           (var11 = this.a(var10, var6)).l = (short)((int)Math.min(65535L, var4.a(var11)));
                           var3.add(var11);
                        }
                     } else if (var5 instanceof CellInfoGsm) {
                        CellInfoGsm var12;
                        if (a((var12 = (CellInfoGsm)var5).getCellIdentity())) {
                           (var11 = a(var12, var6)).l = (short)((int)Math.min(65535L, var4.a(var11)));
                           var3.add(var11);
                        }
                     } else if (var5 instanceof CellInfoWcdma) {
                        CellInfoWcdma var13;
                        if (a((var13 = (CellInfoWcdma)var5).getCellIdentity())) {
                           (var11 = a(var13, var6)).l = (short)((int)Math.min(65535L, var4.a(var11)));
                           var3.add(var11);
                        }
                     } else {
                        CellInfoLte var14;
                        if (var5 instanceof CellInfoLte && a((var14 = (CellInfoLte)var5).getCellIdentity())) {
                           (var11 = a(var14, var6)).l = (short)((int)Math.min(65535L, var4.a(var11)));
                           var3.add(var11);
                        }
                     }
                  } catch (Throwable var8) {
                     ;
                  }
               }
            }
         }

         if (var3 != null && var3.size() > 0) {
            this.a |= 4;
            var4.a(var3);
         }

      }
   }

   @SuppressLint({"NewApi"})
   private CellLocation a(List<CellInfo> var1) {
      if (var1 != null && !var1.isEmpty()) {
         GsmCellLocation var2 = null;
         CdmaCellLocation var3 = null;
         ly var6 = null;

         for(int var7 = 0; var7 < var1.size(); ++var7) {
            CellInfo var4;
            if ((var4 = (CellInfo)var1.get(var7)) != null) {
               try {
                  boolean var5 = var4.isRegistered();
                  if (var4 instanceof CellInfoCdma) {
                     CellInfoCdma var10;
                     if (a((var10 = (CellInfoCdma)var4).getCellIdentity())) {
                        var6 = this.a(var10, var5);
                        break;
                     }
                  } else if (var4 instanceof CellInfoGsm) {
                     CellInfoGsm var11;
                     if (a((var11 = (CellInfoGsm)var4).getCellIdentity())) {
                        var6 = a(var11, var5);
                        break;
                     }
                  } else if (var4 instanceof CellInfoWcdma) {
                     CellInfoWcdma var12;
                     if (a((var12 = (CellInfoWcdma)var4).getCellIdentity())) {
                        var6 = a(var12, var5);
                        break;
                     }
                  } else {
                     if (!(var4 instanceof CellInfoLte)) {
                        break;
                     }

                     CellInfoLte var13;
                     if (a((var13 = (CellInfoLte)var4).getCellIdentity())) {
                        var6 = a(var13, var5);
                        break;
                     }
                  }
               } catch (Throwable var9) {
                  ;
               }
            }
         }

         try {
            if (var6 != null) {
               if (var6.k == 2) {
                  (var3 = new CdmaCellLocation()).setCellLocationData(var6.i, var6.e, var6.f, var6.g, var6.h);
               } else {
                  (var2 = new GsmCellLocation()).setLacAndCid(var6.c, var6.d);
               }
            }
         } catch (Throwable var8) {
            ;
         }

         return (CellLocation)(var3 == null ? var2 : var3);
      } else {
         return null;
      }
   }

   private ly c(CellLocation var1, String[] var2) {
      GsmCellLocation var4 = (GsmCellLocation)var1;
      ly var3;
      (var3 = new ly(1, true)).a = mk.d(var2[0]);
      var3.b = mk.d(var2[1]);
      var3.c = var4.getLac();
      var3.d = var4.getCid();
      var3.j = this.o;
      return var3;
   }

   private static ly a(NeighboringCellInfo var0, String[] var1) {
      try {
         ly var2;
         (var2 = new ly(1, false)).a = Integer.parseInt(var1[0]);
         var2.b = Integer.parseInt(var1[1]);
         var2.c = mi.b(var0, "getLac");
         var2.d = var0.getCid();
         int var4 = var0.getRssi();
         var2.j = mk.a(var4);
         return var2;
      } catch (Throwable var3) {
         mg.a(var3, "CgiManager", "getGsm");
         return null;
      }
   }

   private void b(int var1) {
      if (var1 == -113) {
         this.o = -113;
      } else {
         this.o = var1;
         switch(this.a) {
         case 1:
         case 2:
            if (this.b != null && !this.b.isEmpty()) {
               try {
                  ((ly)this.b.get(0)).j = this.o;
                  return;
               } catch (Throwable var2) {
                  ;
               }
            }
         default:
         }
      }
   }

   final void h() {
      this.h = null;
      this.e = null;
      this.a = 0;
      this.b.clear();
      this.n.clear();
   }

   private int u() {
      try {
         Class.forName("android.telephony.MSimTelephonyManager");
         this.r = 1;
      } catch (Throwable var2) {
         ;
      }

      if (this.r == 0) {
         try {
            Class.forName("android.telephony.TelephonyManager2");
            this.r = 2;
         } catch (Throwable var1) {
            ;
         }
      }

      return this.r;
   }

   public static boolean a(int var0) {
      return var0 > 0 && var0 <= 15;
   }

   public final String i() {
      return this.m;
   }

   @SuppressLint({"NewApi"})
   private static boolean a(CellIdentityCdma var0) {
      if (var0 == null) {
         return false;
      } else {
         return var0.getSystemId() > 0 && var0.getNetworkId() >= 0 && var0.getBasestationId() >= 0;
      }
   }

   @SuppressLint({"NewApi"})
   private static boolean a(CellIdentityGsm var0) {
      if (var0 == null) {
         return false;
      } else {
         return c(var0.getLac()) && d(var0.getCid());
      }
   }

   @SuppressLint({"NewApi"})
   private static boolean a(CellIdentityWcdma var0) {
      if (var0 == null) {
         return false;
      } else {
         return c(var0.getLac()) && d(var0.getCid());
      }
   }

   @SuppressLint({"NewApi"})
   private static boolean a(CellIdentityLte var0) {
      if (var0 == null) {
         return false;
      } else {
         return c(var0.getTac()) && d(var0.getCi());
      }
   }

   private static boolean c(int var0) {
      return var0 != -1 && var0 != 0 && var0 <= 65535;
   }

   @SuppressLint({"NewApi"})
   private static ly a(CellInfoGsm var0, boolean var1) {
      CellIdentityGsm var2 = var0.getCellIdentity();
      return a(1, var1, var2.getMcc(), var2.getMnc(), var2.getLac(), var2.getCid(), var0.getCellSignalStrength().getDbm());
   }

   @SuppressLint({"NewApi"})
   private static ly a(CellInfoWcdma var0, boolean var1) {
      CellIdentityWcdma var2 = var0.getCellIdentity();
      return a(4, var1, var2.getMcc(), var2.getMnc(), var2.getLac(), var2.getCid(), var0.getCellSignalStrength().getDbm());
   }

   @SuppressLint({"NewApi"})
   private static ly a(CellInfoLte var0, boolean var1) {
      CellIdentityLte var2 = var0.getCellIdentity();
      return a(3, var1, var2.getMcc(), var2.getMnc(), var2.getTac(), var2.getCi(), var0.getCellSignalStrength().getDbm());
   }

   private static ly a(int var0, boolean var1, int var2, int var3, int var4, int var5, int var6) {
      ly var7;
      (var7 = new ly(var0, var1)).a = var2;
      var7.b = var3;
      var7.c = var4;
      var7.d = var5;
      var7.j = var6;
      return var7;
   }

   @SuppressLint({"NewApi"})
   private ly a(CellInfoCdma var1, boolean var2) {
      CellIdentityCdma var3 = var1.getCellIdentity();
      String[] var4 = mk.a(this.c);
      int var5 = 0;
      int var6 = 0;

      try {
         var5 = Integer.parseInt(var4[0]);
         var6 = Integer.parseInt(var4[1]);
      } catch (Throwable var7) {
         ;
      }

      ly var8;
      (var8 = a(2, var2, var5, var6, 0, 0, var1.getCellSignalStrength().getCdmaDbm())).g = var3.getSystemId();
      var8.h = var3.getNetworkId();
      var8.i = var3.getBasestationId();
      var8.e = var3.getLatitude();
      var8.f = var3.getLongitude();
      return var8;
   }

   private static boolean d(int var0) {
      return var0 != -1 && var0 != 0 && var0 != 65535 && var0 < 268435455;
   }

   private int c(CellLocation var1) {
      byte var2 = 0;
      if (this.i) {
         var2 = 0;
      } else if (var1 == null) {
         var2 = 0;
      } else if (var1 instanceof GsmCellLocation) {
         var2 = 1;
      } else {
         try {
            Class.forName("android.telephony.cdma.CdmaCellLocation");
            var2 = 2;
         } catch (Throwable var3) {
            mg.a(var3, "Utils", "getCellLocT");
         }
      }

      return var2;
   }
}
