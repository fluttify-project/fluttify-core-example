package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.amap.mapcore.FileUtil;

public class ea implements Runnable {
   private Context a;
   private dz b;
   private eg c;
   private ea$a d;

   public ea(Context var1) {
      this.a = var1;
      if (this.b == null) {
         this.b = new dz(this.a, "");
      }

   }

   public void a(String var1) {
      if (this.b != null) {
         this.b.a(var1);
      }

   }

   public void run() {
      try {
         if (!MapsInitializer.getNetWorkEnable()) {
            return;
         }

         if (this.b != null) {
            dz$a var1 = (dz$a)this.b.a();
            String var2 = null;
            if (var1 != null && var1.a != null) {
               String var3 = this.a(this.a);
               var2 = var3 + "/" + "custom_texture_data";
               this.a(var2, var1.a);
            }

            if (this.d != null) {
               this.d.a(var2, this.c);
            }
         }

         ht.a(this.a, fi.e());
      } catch (Throwable var4) {
         ht.c(var4, "CustomStyleTask", "download customStyle");
         var4.printStackTrace();
      }

   }

   private void a(String var1, byte[] var2) {
      FileUtil.writeDatasToFile(var1, var2);
   }

   private String a(Context var1) {
      String var2 = FileUtil.getMapBaseStorage(var1);
      return var2;
   }

   public void a() {
      this.a = null;
      if (this.b != null) {
         this.b = null;
      }

   }

   public void b() {
      fh.a().a(this);
   }

   public void a(ea$a var1) {
      this.d = var1;
   }

   public void a(eg var1) {
      this.c = var1;
   }
}
