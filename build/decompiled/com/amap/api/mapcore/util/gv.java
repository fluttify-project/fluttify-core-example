package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.net.URLDecoder;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class gv {
   public static int a = -1;
   public static String b = "";

   public static void a(Context var0, String var1) {
      gu.a(var0, var1);
   }

   public static boolean a(String var0, boolean var1) {
      try {
         if (TextUtils.isEmpty(var0)) {
            return var1;
         } else {
            String var2 = URLDecoder.decode(var0);
            String[] var3 = var2.split("/");
            int var4 = var3.length;
            String var5 = var3[var4 - 1];
            char var6 = var5.charAt(4);
            return var6 % 2 == 1;
         }
      } catch (Throwable var7) {
         return var1;
      }
   }

   public static gv$a a(Context var0, hf var1, String var2, Map<String, String> var3) {
      return a(var0, var1, var2, var3, false);
   }

   public static gv$a a(Context var0, hf var1, String var2, Map<String, String> var3, boolean var4) {
      String var5 = null;
      byte[] var6 = null;
      jk var7 = null;
      gv$a var8 = new gv$a();
      var8.w = new JSONObject();
      hb.a().a(var0);

      jd var9;
      try {
         var9 = new jd();

         try {
            var2 = var2 + ";14N;" + "15K" + ";" + "16H";
            gv$b var10 = new gv$b(var0, var1, var2, var3);
            var7 = var9.a(var10, var10.a());
         } catch (gt var20) {
            throw var20;
         } catch (Throwable var21) {
            throw new gt("未知的错误");
         }

         if (var7 != null) {
            var6 = var7.a;
         }

         byte[] var28 = new byte[16];
         byte[] var11 = new byte[var6.length - 16];
         System.arraycopy(var6, 0, var28, 0, 16);
         System.arraycopy(var6, 16, var11, 0, var6.length - 16);
         SecretKeySpec var12 = new SecretKeySpec(var28, "AES");
         Cipher var13 = Cipher.getInstance("AES/CBC/PKCS5Padding");
         IvParameterSpec var14 = new IvParameterSpec(hg.c());
         var13.init(2, var12, var14);
         byte[] var15 = var13.doFinal(var11);
         var5 = hg.a(var15);
      } catch (gt var22) {
         var8.a = var22.a();
         ht.a(var1, "/v3/iasdkauth", var22);
      } catch (IllegalBlockSizeException var23) {
         ;
      } catch (Throwable var24) {
         ht.c(var24, "at", "lc");
      }

      if (var6 == null) {
         return var8;
      } else {
         if (TextUtils.isEmpty(var5)) {
            var5 = hg.a(var6);
         }

         var9 = null;

         try {
            JSONObject var27 = new JSONObject(var5);
            if (var27.has("status")) {
               int var29 = var27.getInt("status");
               if (var29 == 1) {
                  a = 1;
               } else if (var29 == 0) {
                  String var30 = "authcsid";
                  String var31 = "authgsid";
                  if (var7 != null) {
                     var30 = var7.c;
                     var31 = var7.d;
                  }

                  hg.a(var0, var30, var31, var27);
                  a = 0;
                  if (var27.has("info")) {
                     b = var27.getString("info");
                  }

                  String var34 = "";
                  if (var27.has("infocode")) {
                     var34 = var27.getString("infocode");
                  }

                  ht.a(var1, "/v3/iasdkauth", b, var31, var34);
                  if (a == 0) {
                     var8.a = b;
                     return var8;
                  }
               }

               try {
                  if (var27.has("ver")) {
                     var8.b = var27.getInt("ver");
                  }
               } catch (Throwable var19) {
                  hq.a(var19, "at", "lc");
               }

               if (hg.a(var27, "result")) {
                  gv$a$a var32 = new gv$a$a();
                  var32.a = false;
                  var32.b = false;
                  var8.x = var32;
                  JSONObject var33 = var27.getJSONObject("result");

                  try {
                     String[] var35 = var2.split(";");
                     if (var35 != null && var35.length > 0) {
                        String[] var36 = var35;
                        int var40 = var35.length;

                        for(int var16 = 0; var16 < var40; ++var16) {
                           String var17 = var36[var16];
                           if (var33.has(var17)) {
                              var8.w.putOpt(var17, var33.get(var17));
                           }
                        }
                     }
                  } catch (Throwable var25) {
                     hq.a(var25, "at", "co");
                  }

                  JSONObject var37;
                  if (hg.a(var33, "16H")) {
                     var37 = var33.getJSONObject("16H");
                     gv$a.a(var8, a(var37.optString("able"), false));
                  }

                  if (hg.a(var33, "11K")) {
                     try {
                        var37 = var33.getJSONObject("11K");
                        String var38 = var37.getString("able");
                        var32.a = a(var38, false);
                        if (var37.has("off")) {
                           var32.c = var37.getJSONObject("off");
                        }
                     } catch (Throwable var18) {
                        hq.a(var18, "AuthConfigManager", "loadException");
                     }
                  }

                  if (hg.a(var33, "001")) {
                     var37 = var33.getJSONObject("001");
                     gv$a$d var39 = new gv$a$d();
                     a(var37, var39);
                     var8.y = var39;
                  }

                  gv$a$c var41;
                  if (hg.a(var33, "002")) {
                     var37 = var33.getJSONObject("002");
                     var41 = new gv$a$c();
                     a(var37, var41);
                     var8.A = var41;
                  }

                  if (hg.a(var33, "14S")) {
                     var37 = var33.getJSONObject("14S");
                     var41 = new gv$a$c();
                     a(var37, var41);
                     var8.B = var41;
                  }

                  a(var8, var33);
                  if (hg.a(var33, "14Z")) {
                     var37 = var33.getJSONObject("14Z");
                     gv$a$f var43 = new gv$a$f();
                     a(var37, var43);
                     var8.G = var43;
                  }

                  if (hg.a(var33, "151")) {
                     var37 = var33.getJSONObject("151");
                     gv$a$e var44 = new gv$a$e();
                     a(var37, var44);
                     var8.z = var44;
                  }

                  a(var8, var33);
                  if (hg.a(var33, "14N")) {
                     var37 = var33.getJSONObject("14N");
                     gv$a$b var45 = new gv$a$b();
                     var45.a = a(var37.optString("able"), false);
                     var45.b = var37.optString("url");
                     var45.c = var37.optString("md5");
                     if (var45.a) {
                        hf var42 = ho.a();
                        if (var42 != null) {
                           if var46 = new if(var45.b, var45.c, "", gv$a.a(var8));
                           var46.a(var4);
                           ie var47 = new ie(var0, var46, var42);
                           var47.a();
                        }
                     } else {
                        ik.a(var0, "aiu");
                     }
                  }

                  a(var0, var33);
               }
            }
         } catch (Throwable var26) {
            hq.a(var26, "at", "lc");
         }

         return var8;
      }
   }

   private static void a(Context var0, JSONObject var1) {
      try {
         var1 = var1.getJSONObject("15K");
         boolean var2 = a(var1.optString("isTargetAble"), false);
         boolean var3 = a(var1.optString("able"), false);
         if (!var3) {
            hb.a().b(var0);
            return;
         }

         hb.a().a(var0, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public static String a(JSONObject var0, String var1) throws JSONException {
      if (var0 == null) {
         return "";
      } else {
         String var2 = "";
         if (var0.has(var1) && !var0.getString(var1).equals("[]")) {
            var2 = var0.optString(var1);
         }

         return var2;
      }
   }

   private static void a(JSONObject var0, gv$a$b var1) {
      try {
         if (var1 != null) {
            String var2 = a(var0, "m");
            String var3 = a(var0, "u");
            String var4 = a(var0, "v");
            String var5 = a(var0, "able");
            String var6 = a(var0, "on");
            var1.c = var2;
            var1.b = var3;
            var1.d = var4;
            var1.a = a(var5, false);
            var1.e = a(var6, true);
         }
      } catch (Throwable var7) {
         hq.a(var7, "at", "pe");
      }

   }

   private static void a(JSONObject var0, gv$a$f var1) {
      try {
         if (var1 != null) {
            String var2 = a(var0, "md5");
            String var3 = a(var0, "md5info");
            String var4 = a(var0, "url");
            String var5 = a(var0, "able");
            String var6 = a(var0, "on");
            String var7 = a(var0, "mobileable");
            var1.e = var2;
            var1.f = var3;
            var1.d = var4;
            var1.a = a(var5, false);
            var1.b = a(var6, false);
            var1.c = a(var7, false);
         }
      } catch (Throwable var8) {
         hq.a(var8, "at", "pes");
      }

   }

   private static void a(JSONObject var0, gv$a$c var1) {
      try {
         if (var0 != null) {
            String var2 = a(var0, "md5");
            String var3 = a(var0, "url");
            var1.b = var2;
            var1.a = var3;
         }
      } catch (Throwable var4) {
         hq.a(var4, "at", "psc");
      }

   }

   private static void a(JSONObject var0, gv$a$d var1) {
      try {
         if (var0 != null) {
            String var2 = a(var0, "md5");
            String var3 = a(var0, "url");
            String var4 = a(var0, "sdkversion");
            if (!TextUtils.isEmpty(var2) && !TextUtils.isEmpty(var3) && !TextUtils.isEmpty(var4)) {
               var1.a = var3;
               var1.b = var2;
               var1.c = var4;
            } else {
               var1 = null;
            }
         } else {
            var1 = null;
         }
      } catch (Throwable var5) {
         hq.a(var5, "at", "psu");
      }

   }

   private static void a(JSONObject var0, gv$a$e var1) {
      if (var1 != null && var0 != null) {
         boolean var2 = a(var0.optString("able"), false);
         var1.a = var2;
      }
   }

   private static void a(gv$a var0, JSONObject var1) {
      try {
         if (hg.a(var1, "11B")) {
            var0.h = var1.getJSONObject("11B");
         }

         if (hg.a(var1, "11C")) {
            var0.k = var1.getJSONObject("11C");
         }

         if (hg.a(var1, "11I")) {
            var0.l = var1.getJSONObject("11I");
         }

         if (hg.a(var1, "11H")) {
            var0.m = var1.getJSONObject("11H");
         }

         if (hg.a(var1, "11E")) {
            var0.n = var1.getJSONObject("11E");
         }

         if (hg.a(var1, "11F")) {
            var0.o = var1.getJSONObject("11F");
         }

         if (hg.a(var1, "13A")) {
            var0.q = var1.getJSONObject("13A");
         }

         if (hg.a(var1, "13J")) {
            var0.i = var1.getJSONObject("13J");
         }

         if (hg.a(var1, "11G")) {
            var0.p = var1.getJSONObject("11G");
         }

         JSONObject var2;
         if (hg.a(var1, "006")) {
            var2 = var1.getJSONObject("006");
            var0.r = var2;
         }

         if (hg.a(var1, "010")) {
            var2 = var1.getJSONObject("010");
            var0.s = var2;
         }

         gv$a$b var3;
         if (hg.a(var1, "11Z")) {
            var2 = var1.getJSONObject("11Z");
            var3 = new gv$a$b();
            a(var2, var3);
            var0.C = var3;
         }

         if (hg.a(var1, "135")) {
            var0.j = var1.getJSONObject("135");
         }

         if (hg.a(var1, "13S")) {
            var0.g = var1.getJSONObject("13S");
         }

         if (hg.a(var1, "121")) {
            var2 = var1.getJSONObject("121");
            var3 = new gv$a$b();
            a(var2, var3);
            var0.D = var3;
         }

         if (hg.a(var1, "122")) {
            var2 = var1.getJSONObject("122");
            var3 = new gv$a$b();
            a(var2, var3);
            var0.E = var3;
         }

         if (hg.a(var1, "123")) {
            var2 = var1.getJSONObject("123");
            var3 = new gv$a$b();
            a(var2, var3);
            var0.F = var3;
         }

         if (hg.a(var1, "011")) {
            var2 = var1.getJSONObject("011");
            var0.c = var2;
         }

         if (hg.a(var1, "012")) {
            var2 = var1.getJSONObject("012");
            var0.d = var2;
         }

         if (hg.a(var1, "013")) {
            var0.e = var1.getJSONObject("013");
         }

         if (hg.a(var1, "014")) {
            var0.f = var1.getJSONObject("014");
         }

         if (hg.a(var1, "145")) {
            var0.t = var1.getJSONObject("145");
         }

         if (hg.a(var1, "14B")) {
            var0.u = var1.getJSONObject("14B");
         }

         if (hg.a(var1, "14D")) {
            var0.v = var1.getJSONObject("14D");
         }
      } catch (Throwable var4) {
         ht.c(var4, "at", "pe");
      }

   }
}
