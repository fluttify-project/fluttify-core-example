package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Bundle;
import com.amap.api.maps.AMap;
import java.io.IOException;

public class bl extends kk implements ca$a {
   private ca a;
   private cc b;
   private cf c;
   private Context e;
   private Bundle f;
   private boolean g;

   public bl(cf var1, Context var2) {
      this.f = new Bundle();
      this.g = false;
      this.c = var1;
      this.e = var2;
   }

   public bl(cf var1, Context var2, AMap var3) {
      this(var1, var2);
   }

   public void runTask() {
      if (this.c.y()) {
         this.c.a(cg$a.c);
      } else {
         try {
            this.e();
         } catch (Throwable var2) {
            var2.printStackTrace();
         }

      }
   }

   public void a() {
      this.g = true;
      if (this.a != null) {
         this.a.b();
      } else {
         this.cancelTask();
      }

      if (this.b != null) {
         this.b.a();
      }

   }

   private String d() {
      return fi.c(this.e);
   }

   private void e() throws IOException {
      String var1 = this.c.A();
      cb var2 = new cb(this.c.getUrl(), this.d(), this.c.z(), 1, var1);
      this.a = new ca(var2, this.c.getUrl(), this.e, this.c);
      this.a.a(this);
      this.b = new cc(this.c, this.c);
      if (!this.g) {
         this.a.a();
      }

   }

   public void b() {
      if (this.f != null) {
         this.f.clear();
         this.f = null;
      }

   }

   public void c() {
      if (this.b != null) {
         this.b.b();
      }

   }
}
