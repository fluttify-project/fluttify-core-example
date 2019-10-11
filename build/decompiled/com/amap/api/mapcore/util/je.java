package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public abstract class je extends ji {
   protected Context d;
   protected hf e;

   public boolean g() {
      return true;
   }

   public je(Context var1, hf var2) {
      if (var1 != null) {
         this.d = var1.getApplicationContext();
      }

      this.e = var2;
   }

   public Map<String, String> getParams() {
      String var1 = gu.f(this.d);
      String var2 = gx.a();
      String var3 = gx.a(this.d, var2, "key=" + var1);
      HashMap var4 = new HashMap();
      var4.put("ts", var2);
      var4.put("key", var1);
      var4.put("scode", var3);
      return var4;
   }

   public final byte[] getEntityBytes() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      try {
         var1.write(this.a());
         var1.write(this.h());
         var1.write(this.k());
         var1.write(this.l());
         byte[] var2 = var1.toByteArray();
         byte[] var3 = var2;
         return var3;
      } catch (Throwable var13) {
         hq.a(var13, "bre", "geb");
      } finally {
         try {
            var1.close();
         } catch (Throwable var12) {
            hq.a(var12, "bre", "geb");
         }

      }

      return null;
   }

   private byte[] a() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      try {
         byte[] var2 = hg.a("PANDORA$");
         var1.write(var2);
         var1.write(new byte[]{1});
         var1.write(new byte[]{0});
         byte[] var3 = var1.toByteArray();
         return var3;
      } catch (Throwable var13) {
         hq.a(var13, "bre", "gbh");
      } finally {
         try {
            var1.close();
         } catch (Throwable var12) {
            hq.a(var12, "bre", "gbh");
         }

      }

      return null;
   }

   public byte[] h() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      try {
         var1.write(new byte[]{3});
         byte[] var3;
         if (this.g()) {
            byte[] var2 = gx.a(this.d, this.j());
            var3 = this.a(var2);
            var1.write(var3);
            var1.write(var2);
         } else {
            var1.write(new byte[]{0, 0});
         }

         String var18 = this.f();
         var3 = hg.a(var18);
         if (var3 != null && var3.length > 0) {
            byte[] var4 = this.a(var3);
            var1.write(var4);
            var1.write(var3);
         } else {
            var1.write(new byte[]{0, 0});
         }

         String var19 = this.i();
         byte[] var5 = hg.a(var19);
         byte[] var6;
         if (var5 != null && var5.length > 0) {
            var6 = this.a(var5);
            var1.write(var6);
            var1.write(var5);
         } else {
            var1.write(new byte[]{0, 0});
         }

         var6 = var1.toByteArray();
         return var6;
      } catch (Throwable var16) {
         hq.a(var16, "bre", "gpd");
      } finally {
         try {
            var1.close();
         } catch (Throwable var15) {
            hq.a(var15, "bre", "gred");
         }

      }

      return new byte[]{0};
   }

   public String i() {
      return String.format("platform=Android&sdkversion=%s&product=%s", this.e.c(), this.e.a());
   }

   protected String f() {
      return "2.1";
   }

   protected byte[] a(byte[] var1) {
      int var2 = var1.length;
      byte var3 = (byte)(var2 / 256);
      byte var4 = (byte)(var2 % 256);
      return new byte[]{var3, var4};
   }

   private byte[] k() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      byte[] var4;
      try {
         byte[] var2 = this.d();
         byte[] var3;
         if (var2 == null || var2.length == 0) {
            var1.write(new byte[]{0});
            var3 = var1.toByteArray();
            return var3;
         }

         var1.write(new byte[]{1});
         var3 = this.a(var2);
         var1.write(var3);
         var1.write(var2);
         var4 = var1.toByteArray();
      } catch (Throwable var15) {
         hq.a(var15, "bre", "grrd");
         return new byte[]{0};
      } finally {
         try {
            var1.close();
         } catch (Throwable var14) {
            hq.a(var14, "bre", "grrd");
         }

      }

      return var4;
   }

   private byte[] l() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      try {
         byte[] var2 = this.e();
         byte[] var3;
         if (var2 == null || var2.length == 0) {
            var1.write(new byte[]{0});
            var3 = var1.toByteArray();
            return var3;
         }

         var1.write(new byte[]{1});
         var3 = gx.a(this.d, var2);
         byte[] var4 = this.a(var3);
         var1.write(var4);
         var1.write(var3);
         byte[] var5 = var1.toByteArray();
         return var5;
      } catch (Throwable var16) {
         hq.a(var16, "bre", "gred");
      } finally {
         try {
            var1.close();
         } catch (Throwable var15) {
            hq.a(var15, "bre", "gred");
         }

      }

      return new byte[]{0};
   }

   public abstract byte[] d();

   public abstract byte[] e();

   protected boolean j() {
      return false;
   }
}
