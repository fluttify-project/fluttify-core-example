package com.amap.api.mapcore.util;

import android.text.TextUtils;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import org.json.JSONObject;

public final class ls extends Inner_3dMap_location {
   private String b = null;
   private String c = "";
   private int d;
   private String e = "";
   private String f = "new";
   private JSONObject g = null;
   private String h = "";
   boolean a = true;
   private String i = "";
   private long j = 0L;
   private String k = null;

   public ls(String var1) {
      super(var1);
   }

   public final String a() {
      return this.b;
   }

   public final void a(String var1) {
      this.b = var1;
   }

   public final String b() {
      return this.c;
   }

   public final void b(String var1) {
      this.c = var1;
   }

   public final int c() {
      return this.d;
   }

   public final void c(String var1) {
      if (!TextUtils.isEmpty(var1)) {
         if (this.getProvider().equals("gps")) {
            this.d = 0;
            return;
         }

         if (var1.equals("0")) {
            this.d = 0;
            return;
         }

         if (var1.equals("1")) {
            this.d = 1;
            return;
         }
      }

      this.d = -1;
   }

   public final String d() {
      return this.e;
   }

   public final void d(String var1) {
      this.e = var1;
   }

   public final void setFloor(String var1) {
      if (!TextUtils.isEmpty(var1)) {
         var1 = var1.replace("F", "");

         try {
            Integer.parseInt(var1);
         } catch (Throwable var3) {
            var1 = null;
            mg.a(var3, "MapLocationModel", "setFloor");
         }
      }

      this.floor = var1;
   }

   public final JSONObject e() {
      return this.g;
   }

   public final JSONObject toJson(int var1) {
      JSONObject var2;
      try {
         var2 = super.toJson(var1);
         switch(var1) {
         case 1:
            var2.put("retype", this.e);
            var2.put("cens", this.i);
            var2.put("poiid", this.buildingId);
            var2.put("floor", this.floor);
            var2.put("coord", this.d);
            var2.put("mcell", this.h);
            var2.put("desc", this.desc);
            var2.put("address", this.getAddress());
            if (this.g != null && mk.a(var2, "offpct")) {
               var2.put("offpct", this.g.getString("offpct"));
            }
         case 2:
         case 3:
            var2.put("type", this.f);
            var2.put("isReversegeo", this.a);
         }
      } catch (Throwable var3) {
         var2 = null;
         mg.a(var3, "MapLocationModel", "toStr");
      }

      return var2;
   }

   public final void e(String var1) {
      this.desc = var1;
   }

   public final String toStr(int var1) {
      JSONObject var4;
      try {
         (var4 = super.toJson(var1)).put("nb", this.k);
      } catch (Throwable var3) {
         var4 = null;
         mg.a(var3, "MapLocationModel", "toStr part2");
      }

      return var4 == null ? null : var4.toString();
   }
}
