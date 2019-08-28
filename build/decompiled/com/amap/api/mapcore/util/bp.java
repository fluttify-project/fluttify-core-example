package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class bp {
   private static bp a;
   private kj b;
   private LinkedHashMap<String, kk> c = new LinkedHashMap();
   private boolean d = true;

   public static bp a(int var0) {
      return a(true, var0);
   }

   private static synchronized bp a(boolean var0, int var1) {
      try {
         if (a == null) {
            a = new bp(var0, var1);
         } else if (var0 && a.b == null) {
            a.b = kj.a(var1);
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return a;
   }

   private bp(boolean var1, int var2) {
      try {
         if (var1) {
            this.b = kj.a(var2);
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public void a() {
      LinkedHashMap var1 = this.c;
      synchronized(this.c) {
         if (this.c.size() >= 1) {
            Iterator var2 = this.c.entrySet().iterator();

            while(var2.hasNext()) {
               Entry var3 = (Entry)var2.next();
               Object var4 = var3.getKey();
               bl var5 = (bl)var3.getValue();
               var5.a();
            }

            this.c.clear();
         }
      }
   }

   public void a(bo var1) {
      LinkedHashMap var2 = this.c;
      synchronized(this.c) {
         bl var3 = (bl)this.c.get(var1.b());
         if (var3 != null) {
            var3.a();
            this.c.remove(var1.b());
         }
      }
   }

   public void a(bo var1, Context var2, AMap var3) throws gt {
      if (this.b == null) {
         ;
      }

      if (!this.c.containsKey(var1.b())) {
         bl var4 = new bl((cf)var1, var2.getApplicationContext(), var3);
         LinkedHashMap var5 = this.c;
         synchronized(this.c) {
            this.c.put(var1.b(), var4);
         }
      }

      this.b.a((kk)this.c.get(var1.b()));
   }

   public void b() {
      this.a();
      kj.a();
      this.b = null;
      c();
   }

   public static void c() {
      a = null;
   }

   public void b(bo var1) {
      bl var2 = (bl)this.c.get(var1.b());
      if (var2 != null) {
         LinkedHashMap var3 = this.c;
         synchronized(this.c) {
            var2.b();
            this.c.remove(var1.b());
         }
      }

   }
}
