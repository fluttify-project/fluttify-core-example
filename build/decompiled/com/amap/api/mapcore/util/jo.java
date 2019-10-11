package com.amap.api.mapcore.util;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONObject;

public class jo {
   public static void a(String var0, byte[] var1, jn var2) throws IOException, CertificateException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
      iy var3 = null;
      OutputStream var4 = null;

      try {
         if (a(var2.a, var0)) {
            return;
         }

         File var5 = new File(var2.a);
         if (!var5.exists()) {
            var5.mkdirs();
         }

         var3 = iy.a(var5, 1, 1, var2.b);
         var3.a(var2.d);
         byte[] var6 = var2.e.b(var1);
         iy$a var7 = var3.b(var0);
         var4 = var7.a(0);
         var4.write(var6);
         var7.a();
         var3.e();
      } finally {
         if (var4 != null) {
            try {
               var4.close();
            } catch (Throwable var19) {
               var19.printStackTrace();
            }
         }

         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var18) {
               var18.printStackTrace();
            }
         }

      }

   }

   public static void a(jn var0) {
      iy var1 = null;

      try {
         if (!var0.f.c()) {
            return;
         }

         var0.f.a(true);
         var1 = iy.a(new File(var0.a), 1, 1, var0.b);
         ArrayList var2 = new ArrayList();
         byte[] var3 = a((iy)var1, (jn)var0, (List)var2);
         if (var3 != null && var3.length != 0) {
            hs var4 = new hs(var3, var0.c);
            byte[] var5 = jd.a().b(var4);
            JSONObject var6 = new JSONObject(new String(var5));
            if (var6.has("code") && var6.getInt("code") == 1) {
               if (var0.f != null && var3 != null) {
                  var0.f.a(var3.length);
               }

               if (var0.f.b() < Integer.MAX_VALUE) {
                  a((iy)var1, (List)var2);
               } else {
                  a(var1);
               }

               var1 = null;
            }

            return;
         }
      } catch (Throwable var17) {
         ht.c(var17, "leg", "uts");
         return;
      } finally {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var16) {
               var16.printStackTrace();
            }
         }

      }

   }

   private static byte[] a(iy var0, jn var1, List<String> var2) {
      int var3 = 0;

      try {
         File var4 = var0.c();
         if (var4 != null && var4.exists()) {
            String[] var5 = var4.list();
            String[] var6 = var5;
            int var7 = var5.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               String var9 = var6[var8];
               if (var9.contains(".0")) {
                  String[] var10 = var9.split("\\.");
                  var9 = var10[0];
                  byte[] var11 = ju.a(var0, var9, false);
                  var3 += var11.length;
                  var2.add(var9);
                  if (var3 > var1.f.b()) {
                     break;
                  }

                  var1.g.b(var11);
               }
            }

            return var1.g.a();
         }
      } catch (Throwable var12) {
         ht.c(var12, "leg", "gCo");
      }

      return new byte[0];
   }

   private static void a(iy var0) {
      if (var0 != null) {
         try {
            var0.f();
         } catch (Throwable var2) {
            ht.c(var2, "ofm", "dlo");
         }
      }

   }

   private static void a(iy var0, List<String> var1) {
      if (var0 != null) {
         try {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               String var3 = (String)var2.next();
               var0.c(var3);
            }

            var0.close();
         } catch (Throwable var4) {
            ht.c(var4, "ofm", "dlo");
         }
      }

   }

   private static boolean a(String var0, String var1) {
      try {
         File var2 = new File(var0, var1 + ".0");
         return var2.exists();
      } catch (Throwable var3) {
         ht.c(var3, "leg", "fet");
         return false;
      }
   }
}
