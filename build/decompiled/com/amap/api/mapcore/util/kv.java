package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class kv extends kz {
   private if a;
   private kn b;
   private Context c;
   private String d;
   private lg e;
   private iu f;
   private List<kz$a> g = new ArrayList();

   public kv(if var1, kn var2, Context var3, String var4, lg var5, iu var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   protected final List<kz$a> a() {
      kv$a var1 = new kv$a(this.d, this.a.b(), this.b, this.e, this.f, this.c);
      this.g.add(var1);
      return this.g;
   }

   protected final boolean b() {
      return !TextUtils.isEmpty(this.d) && this.a != null;
   }
}
