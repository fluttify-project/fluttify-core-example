package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class hv {
   private static HashSet<String> d = new HashSet();
   public static byte[] a = "FDF1F436161AEF5B".getBytes();
   public static byte[] b = "0102030405060708".getBytes();
   public static String c = "SOCRASH";
   private File[] e;
   private static final String f;

   public hv() {
   }

   void a(Context var1) {
      try {
         File[] var2 = this.b(var1);
         if (var2 == null) {
            return;
         }

         this.e = var2;
         hf var3 = null;

         try {
            var3 = (new hf$a(f, "1.0", "")).a(new String[0]).a();
         } catch (Throwable var10) {
            ;
         }

         ArrayList var4 = new ArrayList();

         for(int var5 = 0; var5 < var2.length && var5 < 10; ++var5) {
            File var6 = var2[var5];
            if (var6 != null && var6.exists() && var6.isFile()) {
               byte[] var7 = this.b(var6);
               if (var7 != null && var7.length != 0 && var7.length <= 100000) {
                  String var8 = hc.a(var7);
                  if (!this.a((List)var4, (String)var8) && !d.contains(var8)) {
                     this.a(var1, var7);
                     d.add(var8);
                     String var9 = ha.b(var7);
                     hu.a(var3, var1, f, var9);
                     this.a(var6);
                  } else {
                     var6.delete();
                  }
               } else {
                  var6.delete();
               }
            }
         }
      } catch (Throwable var11) {
         ;
      }

   }

   private File[] b(Context var1) {
      String var2 = hr.a(var1);
      File var3 = new File(var2);
      if (var3 != null && var3.isDirectory()) {
         File[] var4 = var3.listFiles();
         return var4;
      } else {
         return null;
      }
   }

   private void a(Context var1, byte[] var2) {
      try {
         if (var1 == null) {
            return;
         }

         String var3 = new String(var2, "ISO-8859-1");
         boolean var4 = var3.indexOf("{\"") > 0 && var3.indexOf("\"}") > 0;
         if (!var4) {
            return;
         }

         int var5 = var3.indexOf("{\"");
         int var6 = var3.lastIndexOf("\"}") + 2;
         String var7 = var3.substring(var5, var6);
         JSONObject var8 = new JSONObject(var7);
         String var9 = var8.optString("ik");
         String var10 = var8.optString("jk");
         if (TextUtils.isEmpty(var10)) {
            return;
         }

         List var11 = hv$a.b(var9);
         if (var11 == null) {
            return;
         }

         for(int var12 = 0; var12 < var11.size(); ++var12) {
            hv$a var13 = (hv$a)var11.get(var12);
            if (var10.contains(var13.e())) {
               a(var1, var13);
            }
         }
      } catch (Throwable var14) {
         var14.printStackTrace();
      }

   }

   private static String a() {
      return hc.b("SO_DYNAMIC_FILE_KEY");
   }

   private static void a(Context var0, hv$a var1) throws JSONException {
      if (!TextUtils.isEmpty(var1.b()) && !TextUtils.isEmpty(var1.c()) && !TextUtils.isEmpty(var1.d())) {
         SharedPreferences var2 = var0.getSharedPreferences(a(), 0);
         String var3 = var2.getString("SO_ERROR_KEY", "");
         String var4 = hg.a(gs.b(hg.e(var3)));
         JSONArray var5 = new JSONArray(var4);

         for(int var6 = 0; var6 < var5.length(); ++var6) {
            JSONObject var7 = var5.getJSONObject(var6);
            if (var7.opt("mk").equals(var1.a()) && var7.opt("ak").equals(var1.b()) && var7.opt("bk").equals(var1.c()) && var7.opt("ik").equals(var1.d()) && var7.opt("nk").equals(var1.e())) {
               return;
            }
         }

         JSONObject var9 = new JSONObject();
         var9.putOpt("mk", var1.a());
         var9.putOpt("ak", var1.b());
         var9.putOpt("bk", var1.c());
         var9.putOpt("ik", var1.d());
         var9.putOpt("nk", var1.e());
         var5.put(var9);
         Editor var10 = var2.edit();
         String var8 = hg.g(gs.a(hg.a(var5.toString())));
         var10.putString("SO_ERROR_KEY", var8);
         var10.commit();
      }

   }

   private void a(File var1) {
      if (var1 != null) {
         try {
            var1.delete();
         } catch (Exception var3) {
            ;
         }
      }
   }

   private boolean a(List<hv$b> var1, String var2) {
      if (var1 == null) {
         return false;
      } else {
         Iterator var3 = var1.iterator();

         hv$b var4;
         do {
            if (!var3.hasNext()) {
               return false;
            }

            var4 = (hv$b)var3.next();
         } while(!hv$b.a(var4).equals(var2));

         hv$b.a(var4, hv$b.b(var4) + 1);
         return true;
      }
   }

   private byte[] b(File var1) {
      FileInputStream var2 = null;

      try {
         var2 = new FileInputStream(var1);
         byte[] var3 = new byte[var2.available()];
         var2.read(var3);
         var2.close();
         String var4 = "a1f5886b7153004c5c99559f5261676f";
         String var5 = "nFy1THrhajaZzz8U";
         byte[] var6 = ha.a(var4.getBytes(), var3, var5.getBytes());
         byte[] var7 = new byte[16];
         byte[] var8 = new byte[var6.length - 16];
         System.arraycopy(var6, 0, var7, 0, 16);
         System.arraycopy(var6, 16, var8, 0, var6.length - 16);
         byte[] var9 = hc.a(var8, "MD5");
         return !this.a(var9, var7) ? new byte[0] : var8;
      } catch (Throwable var10) {
         return null;
      }
   }

   private boolean a(byte[] var1, byte[] var2) {
      if (var1 != null && var1.length != 0) {
         if (var2 != null && var2.length != 0) {
            if (var1.length != var2.length) {
               return false;
            } else {
               for(int var3 = 0; var3 < var1.length; ++var3) {
                  if (var1[var3] != var2[var3]) {
                     return false;
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static {
      f = c;
   }
}
