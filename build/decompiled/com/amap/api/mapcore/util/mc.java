package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class mc {
   private static mc b = null;
   jd a = null;
   private Context c = null;
   private int d = 0;
   private int e;
   private boolean f;
   private int g;

   private mc(Context var1) {
      this.e = mg.f;
      this.f = false;
      this.g = 0;

      try {
         hb.a().a(var1);
      } catch (Throwable var2) {
         ;
      }

      this.c = var1;
      this.a = jd.a();
   }

   public static mc a(Context var0) {
      if (b == null) {
         b = new mc(var0);
      }

      return b;
   }

   public final void a(long var1, boolean var3) {
      try {
         this.f = var3;

         try {
            hb.a().a(var3);
         } catch (Throwable var4) {
            ;
         }

         this.e = var1.intValue();
         this.g = 0;
      } catch (Throwable var5) {
         mg.a(var5, "LocNetManager", "setOption");
      }
   }

   public final md a(Context var1, byte[] var2, String var3) {
      md var4 = null;

      try {
         HashMap var5 = new HashMap(16);
         var4 = new md(var1, mg.b());
         var5.put("Content-Type", "application/octet-stream");
         var5.put("Accept-Encoding", "gzip");
         var5.put("gzipped", "1");
         var5.put("Connection", "Keep-Alive");
         var5.put("User-Agent", "AMAP_Location_SDK_Android 4.5.1");
         var5.put("KEY", gu.f(var1));
         var5.put("enginever", "4.9");
         String var6 = gx.a();
         String var7 = gx.a(var1, var6, "key=" + gu.f(var1));
         var5.put("ts", var6);
         var5.put("scode", var7);
         var5.put("encr", "1");
         var4.b((Map)var5);
         String var10 = "loc";
         var4.k();
         var4.a(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "4.5.1", var10, Integer.valueOf(3)));
         var4.a();
         var4.b(var3);
         var4.b(mk.a(var2));
         var4.setProxy(hd.a(var1));
         HashMap var9;
         (var9 = new HashMap(16)).put("output", "bin");
         var9.put("policy", "3103");
         switch(this.g) {
         case 0:
            var9.remove("custom");
            break;
         case 1:
            var9.put("custom", "language:cn");
            break;
         case 2:
            var9.put("custom", "language:en");
            break;
         default:
            var9.remove("custom");
         }

         var4.a((Map)var9);
         var4.setConnectionTimeout(this.e);
         var4.setSoTimeout(this.e);
         if ((this.f || mk.e(var1)) && var3.startsWith("http:")) {
            var4.b(var4.getURL().replace("https:", "https:"));
         }
      } catch (Throwable var8) {
         ;
      }

      return var4;
   }

   public final jk a(md var1) throws Throwable {
      long var3 = mk.b();
      boolean var2 = this.f || mk.e(this.c);
      jk var5 = this.a.a(var1, var2);
      this.d = mk.b() - var3.intValue();
      return var5;
   }
}
