package com.amap.api.maps;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.amap.api.mapcore.util.gv;
import com.amap.api.mapcore.util.hb;
import com.amap.api.mapcore.util.jd;
import com.amap.api.mapcore.util.z;

public final class MapsInitializer {
   public static String sdcardDir = "";
   private static boolean a = true;
   private static boolean b = true;
   private static boolean c = false;
   private static boolean d = false;
   public static final int HTTP = 1;
   public static final int HTTPS = 2;
   private static int e = 1;

   public MapsInitializer() {
   }

   public static void initialize(Context var0) throws RemoteException {
      if (var0 != null) {
         z.a = var0.getApplicationContext();
      } else {
         Log.w("MapsInitializer", "the context is null");
      }

   }

   /** @deprecated */
   public static void setNetWorkEnable(boolean var0) {
      a = var0;
   }

   /** @deprecated */
   public static boolean getNetWorkEnable() {
      return a;
   }

   public static void setApiKey(String var0) {
      if (var0 != null && var0.trim().length() > 0) {
         gv.a(z.a, var0);
      }

   }

   public static String getVersion() {
      return "6.9.2";
   }

   public static void loadWorldGridMap(boolean var0) {
      c = var0;
   }

   public static boolean isLoadWorldGridMap() {
      return c;
   }

   public static void setBuildingHeight(int var0) {
   }

   public static void setDownloadCoordinateConvertLibrary(boolean var0) {
      b = var0;
   }

   public static boolean isDownloadCoordinateConvertLibrary() {
      return b;
   }

   public static void setHost(String var0) {
      if (TextUtils.isEmpty(var0)) {
         jd.a = -1;
         jd.b = "";
      } else {
         jd.a = 1;
         jd.b = var0;
      }

   }

   public static void setProtocol(int var0) {
      e = var0;
      hb.a().a(e == 2);
   }

   public static int getProtocol() {
      return e;
   }

   public static void closeTileOverlay(boolean var0) {
      d = var0;
   }

   public static boolean isTileOverlayClosed() {
      return d;
   }
}
