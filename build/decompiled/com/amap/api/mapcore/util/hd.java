package com.amap.api.mapcore.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Proxy.Type;
import java.util.List;
import java.util.Locale;

public class hd {
   public static Proxy a(Context var0) {
      Proxy var1 = null;

      try {
         if (VERSION.SDK_INT >= 11) {
            URI var2 = new URI("http://restapi.amap.com");
            var1 = a(var0, var2);
         } else {
            var1 = b(var0);
         }
      } catch (Throwable var3) {
         ht.c(var3, "pu", "gp");
      }

      return var1;
   }

   private static Proxy b(Context var0) {
      String var1 = null;
      int var2 = -1;
      if (c(var0)) {
         Uri var3 = Uri.parse("content://telephony/carriers/preferapn");
         ContentResolver var4 = var0.getContentResolver();
         Cursor var5 = null;

         try {
            String var7;
            String var8;
            boolean var9;
            try {
               var5 = var4.query(var3, (String[])null, (String)null, (String[])null, (String)null);
               if (var5 != null && var5.moveToFirst()) {
                  int var6 = var5.getColumnIndex("apn");
                  var7 = var5.getString(var6);
                  if (var7 != null) {
                     var7 = var7.toLowerCase(Locale.US);
                  }

                  if (var7 != null && var7.contains("ctwap")) {
                     var8 = a();
                     var2 = b();
                     var9 = false;
                     if (!TextUtils.isEmpty(var8) && !var8.equals("null")) {
                        var9 = true;
                        var1 = var8;
                     }

                     if (!var9) {
                        var1 = a("QMTAuMC4wLjIwMA==");
                     }

                     if (var2 == -1) {
                        var2 = 80;
                     }
                  } else if (var7 != null && var7.contains("wap")) {
                     var8 = a();
                     var2 = b();
                     var9 = false;
                     if (!TextUtils.isEmpty(var8) && !var8.equals("null")) {
                        var9 = true;
                        var1 = var8;
                     }

                     if (!var9) {
                        var1 = a("QMTAuMC4wLjE3Mg==");
                     }

                     if (var2 == -1) {
                        var2 = 80;
                     }
                  }
               }
            } catch (SecurityException var24) {
               ht.c(var24, "pu", "ghp");
               var7 = gz.t(var0);
               if (var7 != null) {
                  var8 = var7.toLowerCase(Locale.US);
                  var9 = false;
                  String var10 = a();
                  var2 = b();
                  if (var8.indexOf("ctwap") != -1) {
                     if (!TextUtils.isEmpty(var10) && !var10.equals("null")) {
                        var9 = true;
                        var1 = var10;
                     }

                     if (!var9) {
                        var1 = a("QMTAuMC4wLjIwMA==");
                     }

                     if (var2 == -1) {
                        var2 = 80;
                     }
                  } else if (var8.indexOf("wap") != -1) {
                     if (!TextUtils.isEmpty(var10) && !var10.equals("null")) {
                        var9 = true;
                        var1 = var10;
                     }

                     if (!var9) {
                        var1 = a("QMTAuMC4wLjE3Mg==");
                     }

                     var2 = 80;
                  }
               }
            } catch (Throwable var25) {
               ht.c(var25, "pu", "gPx1");
               var25.printStackTrace();
            }
         } finally {
            if (var5 != null) {
               try {
                  var5.close();
               } catch (Throwable var22) {
                  ht.c(var22, "pu", "gPx2");
               }
            }

         }

         try {
            if (a(var1, var2)) {
               Proxy var27 = new Proxy(Type.HTTP, InetSocketAddress.createUnresolved(var1, var2));
               return var27;
            }
         } catch (Throwable var23) {
            hq.a(var23, "pu", "gp2");
            var23.printStackTrace();
         }
      }

      return null;
   }

   public static String a(String var0) {
      return hg.c(var0);
   }

   private static boolean a(String var0, int var1) {
      return var0 != null && var0.length() > 0 && var1 != -1;
   }

   private static String a() {
      String var0 = null;

      try {
         var0 = android.net.Proxy.getDefaultHost();
      } catch (Throwable var2) {
         ht.c(var2, "pu", "gdh");
         var0 = null;
      }

      if (var0 == null) {
         var0 = "null";
      }

      return var0;
   }

   private static Proxy a(Context var0, URI var1) {
      if (c(var0)) {
         try {
            ProxySelector var2 = ProxySelector.getDefault();
            Proxy var3 = null;
            List var4 = null;
            var4 = var2.select(var1);
            if (var4 != null && !var4.isEmpty()) {
               var3 = (Proxy)var4.get(0);
               if (var3 == null || var3.type() == Type.DIRECT) {
                  var3 = null;
               }
            }

            return var3;
         } catch (Throwable var5) {
            ht.c(var5, "pu", "gpsc");
         }
      }

      return null;
   }

   private static boolean c(Context var0) {
      return gz.r(var0) == 0;
   }

   private static int b() {
      int var0 = -1;

      try {
         var0 = android.net.Proxy.getDefaultPort();
      } catch (Throwable var2) {
         ht.c(var2, "pu", "gdp");
      }

      return var0;
   }
}
