package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class kw extends kz {
   private Context a;
   private if b;
   private lg c;
   private iu d;
   private ko e;
   private kn f;
   private kp g;
   private List<kz$a> h = new ArrayList();

   public kw(Context var1, if var2, lg var3, iu var4, ko var5, kn var6, kp var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      kw$b var8 = new kw$b(this.e.h(), this.c);
      this.h.add(var8);
      kx var9 = new kx(this.e.h(), this.b.b(), this.c);
      this.h.add(var9);
      kw$d var10 = new kw$d(this.e.h(), this.e, this.c);
      this.h.add(var10);
      var2 = this.d.c();
      kw$a var11 = new kw$a(var2, this.f, this.a, this.e.k(), this.c, this.d);
      this.h.add(var11);
      kw$c var12 = new kw$c(this.e.j(), this.d, this.a, this.c, this.g);
      this.h.add(var12);
   }

   protected final List<kz$a> a() {
      return this.h;
   }

   protected final boolean b() {
      if (this.a == null) {
         return false;
      } else if (this.b != null && !TextUtils.isEmpty(this.b.b())) {
         if (this.d != null && this.d.c() != null) {
            if (this.e == null) {
               return false;
            } else if (this.f == null) {
               return false;
            } else {
               return this.g != null;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
