package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ej {
   Context a;
   static ej b;

   public static String a(String var0) {
      StringBuilder var1 = new StringBuilder();
      InputStream var2 = b.b(var0);
      if (var2 == null) {
         return null;
      } else {
         try {
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2, "utf-8"));

            String var4;
            while((var4 = var3.readLine()) != null) {
               var1.append(var4).append('\n');
            }

            var3.close();
         } catch (IOException var5) {
            var5.printStackTrace();
         }

         return var1.toString();
      }
   }

   public static void a(Context var0) {
      b = new ej(var0);
   }

   private ej(Context var1) {
      this.a = var1;
   }

   public InputStream b(String var1) {
      try {
         return this.a.getAssets().open(var1);
      } catch (IOException var3) {
         var3.printStackTrace();
         return null;
      }
   }
}
