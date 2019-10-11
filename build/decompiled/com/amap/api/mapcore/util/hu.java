package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hu {
   private static WeakReference<jn> a;
   private static boolean b = true;
   private static WeakReference<kh> c;
   private static WeakReference<kh> d;
   private static String[] e = new String[10];
   private static int f = 0;
   private static boolean g = false;
   private static int h = 0;
   private static hf i;

   public hu() {
   }

   private static boolean a(hf var0) {
      return var0 != null && var0.f();
   }

   private static void a(Context var0, hf var1, int var2, String var3, String var4) {
      String var5 = ju.a();
      String var6 = ju.a(var0, var1);
      String var7 = gu.a(var0);
      String var8 = ju.a(var7, var6, var5, var2, var3, var4);
      if (var8 != null && !"".equals(var8)) {
         String var9 = hc.c(var4);
         String var10 = "";
         if (var2 == 1) {
            var10 = hr.b;
         } else if (var2 == 2) {
            var10 = hr.d;
         } else {
            if (var2 != 0) {
               return;
            }

            var10 = hr.c;
         }

         a(var0, var9, var10, var8);
      }
   }

   static void a(Context var0) {
      List var1 = hr.c(var0);
      if (var1 != null && var1.size() != 0) {
         String var2 = a(var1);
         if (var2 != null && !"".equals(var2) && i != null) {
            String var3 = "ANR";
            a(var0, (hf)i, 2, var3, var2);
         }
      }
   }

   public static void a(Context var0, hf var1, String var2, int var3, String var4, String var5) {
      if (var4 != null && !"".equals(var4)) {
         StringBuilder var7 = new StringBuilder();
         if (var4 != null) {
            var7.append("class:").append(var4);
         }

         if (var5 != null) {
            var7.append(" method:").append(var5).append("$").append("<br/>");
         }

         var7.append(var2);
         a(var0, var1, var3, var4, var7.toString());
      }
   }

   public static void a(Context var0, Throwable var1, int var2, String var3, String var4) {
      String var5 = hg.a(var1);
      hf var6 = a(var0, var5);
      if (a(var6)) {
         var5 = var5.replaceAll("\n", "<br/>");
         String var7 = a(var1);
         if (var7 != null && !"".equals(var7)) {
            StringBuilder var8 = new StringBuilder();
            if (var3 != null) {
               var8.append("class:").append(var3);
            }

            if (var4 != null) {
               var8.append(" method:").append(var4).append("$").append("<br/>");
            }

            var8.append(var5);
            a(var0, var6, var2, var7, var8.toString());
         }
      }
   }

   static void a(hf var0, Context var1, String var2, String var3) {
      if (a(var0)) {
         if (var2 != null && !"".equals(var2)) {
            a(var1, (hf)var0, 0, var2, var3);
         }
      }
   }

   static void b(hf var0, Context var1, String var2, String var3) {
      if (a(var0)) {
         if (var2 != null && !"".equals(var2)) {
            a(var1, (hf)var0, 1, var2, var3);
         }
      }
   }

   private static void a(Context var0, String var1, String var2, String var3) {
      jn var4 = ju.a(a);
      ju.a(var0, var4, var2, 1000, 40960, "1");
      if (var4.e == null) {
         var4.e = new hi(new hj(new hl(new hn())));
      }

      try {
         var3 = var3.replaceAll("\n", "<br/>");
         jo.a(var1, hg.a(var3), var4);
      } catch (Throwable var6) {
         ;
      }

   }

   static void b(Context var0) {
      kf var1 = new kf(b);
      b = false;
      a(var0, var1, hr.c);
   }

   static void c(Context var0) {
      if (c == null || c.get() == null) {
         c = new WeakReference(new kg(var0, 3600000, "hKey", new ki(var0, false)));
      }

      a(var0, (kh)c.get(), hr.d);
   }

   static void d(Context var0) {
      if (d == null || d.get() == null) {
         d = new WeakReference(new kg(var0, 3600000, "gKey", new ki(var0, false)));
      }

      a(var0, (kh)d.get(), hr.b);
   }

   private static void a(Context var0, kh var1, String var2) {
      ht.d().submit(new hu$1(var0, var2, var1));
   }

   static hf a(Context var0, String var1) {
      Object var2 = hr.c(var0);
      if (var2 == null) {
         var2 = new ArrayList();
      }

      if (var1 != null && !"".equals(var1)) {
         Iterator var3 = ((List)var2).iterator();

         while(var3.hasNext()) {
            hf var4 = (hf)var3.next();
            String[] var5 = var4.g();
            if (hr.a(var5, var1)) {
               return var4;
            }
         }

         hf var8;
         if (var1.contains("com.amap.api.col")) {
            try {
               var8 = hg.a();
               return var8;
            } catch (gt var7) {
               var7.printStackTrace();
            }
         }

         if (var1.contains("com.amap.co") || var1.contains("com.amap.opensdk.co") || var1.contains("com.amap.location")) {
            try {
               var8 = hg.b();
               var8.a(true);
               return var8;
            } catch (gt var6) {
               var6.printStackTrace();
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static String a(Throwable var0) {
      return var0.toString();
   }

   static String a(List<hf> var0) {
      FileInputStream var1 = null;
      ja var2 = null;

      try {
         File var3 = new File("/data/anr/traces.txt");
         if (!var3.exists()) {
            Object var32 = null;
            return (String)var32;
         }

         var1 = new FileInputStream(var3);
         int var4 = var1.available();
         if (var4 > 1024000) {
            var1.skip((long)(var4 - 1024000));
         }

         var2 = new ja(var1, jb.a);
         boolean var5 = false;

         while(true) {
            try {
               String var6 = var2.a().trim();
               if (var6.contains("pid")) {
                  while(!var6.startsWith("\"main\"")) {
                     var6 = var2.a();
                  }

                  var5 = true;
               }

               if (var6.equals("") && var5) {
                  break;
               }

               if (var5) {
                  a(var6);
                  if (h == 5) {
                     break;
                  }

                  if (!g) {
                     Iterator var7 = var0.iterator();

                     while(var7.hasNext()) {
                        hf var8 = (hf)var7.next();
                        g = hr.b(var8.g(), var6);
                        if (g) {
                           i = var8;
                           break;
                        }
                     }
                  } else {
                     ++h;
                  }
               }
            } catch (EOFException var28) {
               break;
            }
         }
      } catch (FileNotFoundException var29) {
         ;
      } catch (Throwable var30) {
         ht.c(var30, "alg", "getA");
      } finally {
         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (Throwable var27) {
            ht.c(var27, "alg", "getA");
         }

         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Throwable var26) {
            ht.c(var26, "alg", "getA");
         }

      }

      if (g) {
         return b();
      } else {
         return null;
      }
   }

   private static void a(String var0) {
      try {
         if (f > 9) {
            f = 0;
         }

         e[f] = var0;
         ++f;
      } catch (Throwable var2) {
         ht.c(var2, "alg", "aDa");
      }

   }

   private static String b() {
      StringBuilder var0 = new StringBuilder();

      try {
         int var1;
         for(var1 = f; var1 < 10 && var1 <= 9; ++var1) {
            var0.append(e[var1]);
         }

         for(var1 = 0; var1 < f; ++var1) {
            var0.append(e[var1]);
         }
      } catch (Throwable var2) {
         ht.c(var2, "alg", "gLI");
      }

      return var0.toString();
   }
}
