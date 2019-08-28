package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class ky extends kz {
   private String a;
   private iu b;
   private List<kz$a> c = new ArrayList();
   private Context d;
   private lg e;
   private kp f;

   public ky(String var1, iu var2, Context var3, lg var4, kp var5) {
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      kr var6 = this.b.d();
      ky$b var9 = new ky$b(this.a, this.f, this.d, this.e);
      this.c.add(var9);
      ky$c var7 = new ky$c(this.d, var6, this.f, this.e);
      this.c.add(var7);
      ky$a var8 = new ky$a(this.f, this.e, this.b, this.d);
      this.c.add(var8);
   }

   protected final List<kz$a> a() {
      return this.c;
   }

   protected final boolean b() {
      if (TextUtils.isEmpty(this.a)) {
         return false;
      } else if (this.b != null && this.b.d() != null) {
         if (this.d == null) {
            return false;
         } else {
            return this.f != null;
         }
      } else {
         return false;
      }
   }
}
