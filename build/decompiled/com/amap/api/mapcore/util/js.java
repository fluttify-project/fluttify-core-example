package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;

public class js {
   private Context a;
   private String b;
   private String c;
   private String d;
   private String e;

   public js(Context var1, String var2, String var3, String var4) throws gt {
      if (!TextUtils.isEmpty(var4) && var4.length() <= 256) {
         this.a = var1.getApplicationContext();
         this.c = var2;
         this.d = var3;
         this.b = var4;
      } else {
         throw new gt("无效的参数 - IllegalArgumentException");
      }
   }

   public void a(String var1) throws gt {
      if (!TextUtils.isEmpty(var1) && var1.length() <= 65536) {
         this.e = var1;
      } else {
         throw new gt("无效的参数 - IllegalArgumentException");
      }
   }

   public byte[] a(int var1) {
      byte[] var2 = new byte[]{(byte)(var1 >> 24 & 255), (byte)(var1 >> 16 & 255), (byte)(var1 >> 8 & 255), (byte)(var1 & 255)};
      return var2;
   }

   public byte[] b(String var1) {
      if (TextUtils.isEmpty(var1)) {
         return new byte[]{0, 0};
      } else {
         byte[] var2 = hg.a(this.e);
         if (var2 == null) {
            return new byte[]{0, 0};
         } else {
            int var3 = var2.length;
            byte var4 = (byte)(var3 / 256);
            byte var5 = (byte)(var3 % 256);
            return new byte[]{var4, var5};
         }
      }
   }

   public byte[] a() {
      ByteArrayOutputStream var1 = null;
      byte[] var2 = new byte[0];

      try {
         var1 = new ByteArrayOutputStream();
         hg.a(var1, this.c);
         hg.a(var1, this.d);
         hg.a(var1, this.b);
         hg.a(var1, String.valueOf(gz.r(this.a)));
         int var3 = 0;

         try {
            var3 = (int)(System.currentTimeMillis() / 1000L);
         } catch (Throwable var15) {
            ;
         }

         var1.write(this.a(var3));
         var1.write(this.b(this.e));
         var1.write(hg.a(this.e));
         var2 = var1.toByteArray();
      } catch (Throwable var16) {
         ht.c(var16, "se", "tds");
      } finally {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var14) {
               var14.printStackTrace();
            }
         }

      }

      return var2;
   }
}
