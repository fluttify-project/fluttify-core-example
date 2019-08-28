package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.json.JSONException;
import org.json.JSONObject;

@hz(
   a = "update_item",
   b = true
)
public class bq extends bt {
   private String n = "";
   private Context o;

   public bq() {
   }

   public bq(OfflineMapCity var1, Context var2) {
      this.o = var2;
      this.a = var1.getCity();
      this.c = var1.getAdcode();
      this.b = var1.getUrl();
      this.g = var1.getSize();
      this.e = var1.getVersion();
      this.k = var1.getCode();
      this.i = 0;
      this.l = var1.getState();
      this.j = var1.getcompleteCode();
      this.m = var1.getPinyin();
      this.a();
   }

   public bq(OfflineMapProvince var1, Context var2) {
      this.o = var2;
      this.a = var1.getProvinceName();
      this.c = var1.getProvinceCode();
      this.b = var1.getUrl();
      this.g = var1.getSize();
      this.e = var1.getVersion();
      this.i = 1;
      this.l = var1.getState();
      this.j = var1.getcompleteCode();
      this.m = var1.getPinyin();
      this.a();
   }

   protected void a() {
      String var1 = fi.c(this.o);
      this.d = var1 + this.m + ".zip.tmp";
   }

   public String b() {
      return this.n;
   }

   public void a(String var1) {
      this.n = var1;
   }

   public void b(String var1) {
      try {
         if (var1 == null || "".equals(var1)) {
            return;
         }

         JSONObject var2 = new JSONObject(var1);
         JSONObject var3 = var2.getJSONObject("file");
         if (var3 == null) {
            return;
         }

         this.a = var3.optString("title");
         this.c = var3.optString("code");
         this.b = var3.optString("url");
         this.d = var3.optString("fileName");
         this.f = var3.optLong("lLocalLength");
         this.g = var3.optLong("lRemoteLength");
         this.l = var3.optInt("mState");
         this.e = var3.optString("version");
         this.h = var3.optString("localPath");
         this.n = var3.optString("vMapFileNames");
         this.i = var3.optInt("isSheng");
         this.j = var3.optInt("mCompleteCode");
         this.k = var3.optString("mCityCode");
         this.m = a(var3, "pinyin");
         if ("".equals(this.m)) {
            String var4 = this.b.substring(this.b.lastIndexOf("/") + 1);
            this.m = var4.substring(0, var4.lastIndexOf("."));
         }
      } catch (Throwable var5) {
         ht.c(var5, "UpdateItem", "readFileToJSONObject");
         var5.printStackTrace();
      }

   }

   public void c() {
      JSONObject var1 = new JSONObject();
      JSONObject var2 = null;

      try {
         var2 = new JSONObject();
         var2.put("title", this.a);
         var2.put("code", this.c);
         var2.put("url", this.b);
         var2.put("fileName", this.d);
         var2.put("lLocalLength", this.f);
         var2.put("lRemoteLength", this.g);
         var2.put("mState", this.l);
         var2.put("version", this.e);
         var2.put("localPath", this.h);
         if (this.n != null) {
            var2.put("vMapFileNames", this.n);
         }

         var2.put("isSheng", this.i);
         var2.put("mCompleteCode", this.j);
         var2.put("mCityCode", this.k);
         var2.put("pinyin", this.m);
         var1.put("file", var2);
         File var3 = new File(this.d + ".dt");
         var3.delete();
         OutputStreamWriter var4 = null;

         try {
            var4 = new OutputStreamWriter(new FileOutputStream(var3, true), "utf-8");
            var4.write(var1.toString());
         } catch (IOException var16) {
            ht.c(var16, "UpdateItem", "saveJSONObjectToFile");
            var16.printStackTrace();
         } finally {
            try {
               if (var4 != null) {
                  var4.close();
               }
            } catch (IOException var15) {
               var15.printStackTrace();
            }

         }
      } catch (Throwable var18) {
         ht.c(var18, "UpdateItem", "saveJSONObjectToFile parseJson");
         var18.printStackTrace();
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
}
