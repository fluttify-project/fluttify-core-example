package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class cd {
   public static void a(String var0) {
   }

   public static long a() {
      if (Environment.getExternalStorageState().equals("mounted")) {
         File var0 = Environment.getExternalStorageDirectory();
         StatFs var1 = new StatFs(var0.getPath());
         long var2 = (long)var1.getBlockSize();
         long var4 = (long)var1.getFreeBlocks();
         return var4 * var2;
      } else {
         return 0L;
      }
   }

   public static List<OfflineMapProvince> a(String var0, Context var1) throws JSONException {
      if (var0 != null && !"".equals(var0)) {
         JSONObject var2 = new JSONObject(var0);
         return a(var2, var1);
      } else {
         return new ArrayList();
      }
   }

   public static List<OfflineMapProvince> a(JSONObject var0, Context var1) throws JSONException {
      ArrayList var2 = new ArrayList();
      JSONObject var3 = null;
      JSONObject var4;
      if (!var0.has("result")) {
         var4 = new JSONObject();

         try {
            var4.put("result", (new JSONObject()).put("offlinemap_with_province_vfour", var0));
            c(var4.toString(), var1);
            var3 = var4.optJSONObject("result");
         } catch (JSONException var8) {
            var3 = var0.optJSONObject("result");
            ht.c(var8, "Utility", "parseJson");
            var8.printStackTrace();
         }
      } else {
         var3 = var0.optJSONObject("result");
      }

      var4 = null;
      if (var3 != null) {
         JSONObject var5 = var3.optJSONObject("offlinemap_with_province_vfour");
         if (var5 == null) {
            return var2;
         }

         var4 = var5.optJSONObject("offlinemapinfo_with_province");
      } else {
         var4 = var0.optJSONObject("offlinemapinfo_with_province");
      }

      if (var4 == null) {
         return var2;
      } else {
         if (var4.has("version")) {
            bg.d = a(var4, "version");
         }

         JSONArray var9 = var4.optJSONArray("provinces");
         if (var9 == null) {
            return var2;
         } else {
            JSONObject var7;
            for(int var6 = 0; var6 < var9.length(); ++var6) {
               var7 = var9.optJSONObject(var6);
               if (var7 != null) {
                  var2.add(a(var7));
               }
            }

            JSONArray var10 = var4.optJSONArray("others");
            var7 = null;
            if (var10 != null && var10.length() > 0) {
               var7 = var10.getJSONObject(0);
            }

            if (var7 == null) {
               return var2;
            } else {
               var2.add(a(var7));
               return var2;
            }
         }
      }
   }

   public static OfflineMapProvince a(JSONObject var0) throws JSONException {
      if (var0 == null) {
         return null;
      } else {
         OfflineMapProvince var1 = new OfflineMapProvince();
         var1.setUrl(a(var0, "url"));
         var1.setProvinceName(a(var0, "name"));
         var1.setJianpin(a(var0, "jianpin"));
         var1.setPinyin(a(var0, "pinyin"));
         String var2 = a(var0, "adcode");
         var2 = d(var2);
         var1.setProvinceCode(var2);
         var1.setVersion(a(var0, "version"));
         var1.setSize(Long.parseLong(a(var0, "size")));
         var1.setCityList(b(var0));
         return var1;
      }
   }

   private static String d(String var0) {
      if ("000001".equals(var0)) {
         var0 = "100000";
      }

      return var0;
   }

   public static ArrayList<OfflineMapCity> b(JSONObject var0) throws JSONException {
      JSONArray var1 = var0.optJSONArray("cities");
      ArrayList var2 = new ArrayList();
      if (var1 == null) {
         return var2;
      } else {
         if (var1.length() == 0) {
            var2.add(c(var0));
         }

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            JSONObject var4 = var1.optJSONObject(var3);
            if (var4 != null) {
               var2.add(c(var4));
            }
         }

         return var2;
      }
   }

   public static OfflineMapCity c(JSONObject var0) throws JSONException {
      OfflineMapCity var1 = new OfflineMapCity();
      String var2 = a(var0, "adcode");
      var2 = d(var2);
      var1.setAdcode(var2);
      var1.setUrl(a(var0, "url"));
      var1.setCity(a(var0, "name"));
      var1.setCode(a(var0, "citycode"));
      var1.setPinyin(a(var0, "pinyin"));
      var1.setJianpin(a(var0, "jianpin"));
      var1.setVersion(a(var0, "version"));
      var1.setSize(Long.parseLong(a(var0, "size")));
      return var1;
   }

   public static long a(File var0) {
      if (!var0.isDirectory()) {
         return var0.length();
      } else {
         long var1 = 0L;
         File[] var3 = var0.listFiles();
         if (var3 == null) {
            return var1;
         } else {
            File[] var4 = var3;
            int var5 = var3.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               File var7 = var4[var6];
               if (var7.isDirectory()) {
                  var1 += a(var7);
               } else {
                  var1 += var7.length();
               }
            }

            return var1;
         }
      }
   }

   public static boolean b(File var0) throws IOException, Exception {
      if (var0 != null && var0.exists()) {
         File[] var1 = var0.listFiles();
         if (var1 != null) {
            for(int var2 = 0; var2 < var1.length; ++var2) {
               if (var1[var2].isFile()) {
                  if (!var1[var2].delete()) {
                     return false;
                  }
               } else if (!b(var1[var2])) {
                  return false;
               }
            }
         }

         return var0.delete();
      } else {
         return false;
      }
   }

   public static String a(Context var0, String var1) {
      try {
         InputStream var2 = fc.a(var0).open(var1);
         return fi.a(var2);
      } catch (Throwable var3) {
         ht.c(var3, "MapDownloadManager", "readOfflineAsset");
         var3.printStackTrace();
         return null;
      }
   }

   public static String c(File var0) {
      StringBuffer var1 = new StringBuffer();
      FileInputStream var2 = null;
      BufferedReader var3 = null;

      try {
         var2 = new FileInputStream(var0);
         var3 = new BufferedReader(new InputStreamReader(var2, "utf-8"));
         String var4 = null;

         while((var4 = var3.readLine()) != null) {
            var1.append(var4);
         }

         String var5 = var1.toString();
         return var5;
      } catch (FileNotFoundException var22) {
         ht.c(var22, "MapDownloadManager", "readOfflineSD filenotfound");
         var22.printStackTrace();
      } catch (IOException var23) {
         ht.c(var23, "MapDownloadManager", "readOfflineSD io");
         var23.printStackTrace();
      } finally {
         if (var3 != null) {
            try {
               var3.close();
            } catch (IOException var21) {
               var21.printStackTrace();
            }
         }

         if (var2 != null) {
            try {
               var2.close();
            } catch (IOException var20) {
               var20.printStackTrace();
            }
         }

      }

      return null;
   }

   public static void b(String var0, Context var1) throws IOException, Exception {
      File[] var2 = (new File(fi.c(var1))).listFiles();
      if (var2 != null) {
         File[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            if (var6.exists() && var6.getName().contains(var0)) {
               b(var6);
            }
         }

         b(fi.c(var1));
      }
   }

   public static void b(String var0) {
      File var1 = new File(var0);
      if (var1.exists() && var1.isDirectory()) {
         File[] var2 = var1.listFiles();
         if (var2 == null) {
            return;
         }

         File[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            if (var6.exists() && var6.isDirectory()) {
               String[] var7 = var6.list();
               if (var7 == null) {
                  var6.delete();
               } else if (var7.length == 0) {
                  var6.delete();
               }
            }
         }
      }

   }

   public static String a(JSONObject var0, String var1) throws JSONException {
      if (var0 == null) {
         return "";
      } else {
         String var2 = "";
         if (var0.has(var1) && !"[]".equals(var0.getString(var1))) {
            var2 = var0.optString(var1).trim();
         }

         return var2;
      }
   }

   public static void c(String var0, Context var1) {
      if (!"".equals(fi.c(var1))) {
         File var2 = new File(fi.c(var1) + "offlinemapv4.png");
         if (!var2.exists()) {
            try {
               var2.createNewFile();
            } catch (IOException var19) {
               ht.c(var19, "OfflineUpdateCityHandlerAbstract", "writeSD dirCreate");
               var19.printStackTrace();
            }
         }

         if (a() > 1048576L) {
            FileOutputStream var3 = null;

            try {
               var3 = new FileOutputStream(var2);
               var3.write(var0.getBytes("utf-8"));
            } catch (FileNotFoundException var17) {
               ht.c(var17, "OfflineUpdateCityHandlerAbstract", "writeSD filenotfound");
               var17.printStackTrace();
            } catch (IOException var18) {
               ht.c(var18, "OfflineUpdateCityHandlerAbstract", "writeSD io");
               var18.printStackTrace();
            } finally {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (IOException var16) {
                     var16.printStackTrace();
                  }
               }

            }
         }

      }
   }

   public static String c(String var0) {
      try {
         if (!TextUtils.isEmpty(var0)) {
            return var0.substring(var0.lastIndexOf("/") + 1, var0.indexOf(".zip"));
         }
      } catch (Throwable var2) {
         ht.c(var2, "Utility", "getZipFileNameFromUrl");
      }

      return null;
   }
}
