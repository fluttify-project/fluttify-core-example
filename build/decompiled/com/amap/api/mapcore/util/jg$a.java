package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.Vector;

class jg$a {
   private Vector<jg$b> a;
   private volatile jg$b b;

   private jg$a() {
      this.a = new Vector();
      this.b = new jg$b((jg$1)null);
   }

   public jg$b a() {
      return this.b;
   }

   public jg$b a(String var1) {
      if (TextUtils.isEmpty(var1)) {
         return this.b;
      } else {
         for(int var2 = 0; var2 < this.a.size(); ++var2) {
            jg$b var3 = (jg$b)this.a.get(var2);
            if (var3 != null && var3.a().equals(var1)) {
               return var3;
            }
         }

         jg$b var4 = new jg$b((jg$1)null);
         var4.b(var1);
         this.a.add(var4);
         return var4;
      }
   }

   public void b(String var1) {
      if (!TextUtils.isEmpty(var1)) {
         this.b.a(var1);
      }
   }
}
