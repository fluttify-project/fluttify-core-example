package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

public class bm {
   private Context a;

   public bm(Context var1) {
      this.a = var1;
   }

   public void a(bf var1) {
      this.b(var1);
   }

   private boolean b(bf var1) {
      if (var1 != null) {
         String var2 = var1.getPinyin();
         boolean var3 = this.a(var2, this.a, "vmap/");
         if (var2.equals("quanguogaiyaotu")) {
            var2 = "quanguo";
         }

         var3 = this.a(var2, this.a, "map/") || var3;
         String var4 = cd.c(var1.getUrl());
         var3 = this.b(var4, this.a, "map/") || var3;
         if (var3) {
            var1.i();
            return var3;
         } else {
            var1.h();
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean a(String var1, Context var2, String var3) {
      if (TextUtils.isEmpty(var1)) {
         return false;
      } else {
         String var4 = fi.b(var2);

         try {
            File var5 = new File(var4 + var3 + var1 + ".dat");
            if (var5.exists()) {
               boolean var6 = cd.b(var5);
               if (!var6) {
                  cd.a("deleteDownload delete some thing wrong!");
                  return false;
               }
            }
         } catch (IOException var9) {
            var9.printStackTrace();
            return false;
         } catch (Exception var10) {
            var10.printStackTrace();
            return false;
         }

         try {
            cd.b(var4 + var3);
            cd.b(var1, var2);
            return true;
         } catch (IOException var7) {
            var7.printStackTrace();
            return false;
         } catch (Exception var8) {
            var8.printStackTrace();
            return false;
         }
      }
   }

   private boolean b(String var1, Context var2, String var3) {
      if (TextUtils.isEmpty(var1)) {
         return false;
      } else {
         String var4 = fi.a(var2);

         try {
            File var5 = new File(var4 + var3 + var1);
            if (var5.exists()) {
               boolean var6 = cd.b(var5);
               if (!var6) {
                  cd.a("deleteDownload delete some thing wrong!");
                  return false;
               }
            }
         } catch (IOException var9) {
            var9.printStackTrace();
            return false;
         } catch (Exception var10) {
            var10.printStackTrace();
            return false;
         }

         try {
            cd.b(var4 + var3);
            cd.b(var1, var2);
            return true;
         } catch (IOException var7) {
            var7.printStackTrace();
            return false;
         } catch (Exception var8) {
            var8.printStackTrace();
            return false;
         }
      }
   }
}
