package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bv {
   private static volatile bv a;
   private static hy b;
   private Context c;

   public static bv a(Context var0) {
      if (a == null) {
         Class var1 = bv.class;
         synchronized(bv.class) {
            if (a == null) {
               a = new bv(var0);
            }
         }
      }

      return a;
   }

   private bv(Context var1) {
      this.c = var1;
      b = this.b(this.c);
   }

   private hy b(Context var1) {
      hy var2 = null;

      try {
         var2 = new hy(var1, bu.a());
      } catch (Throwable var4) {
         ht.c(var4, "OfflineDB", "getDB");
         var4.printStackTrace();
      }

      return var2;
   }

   private boolean b() {
      if (b == null) {
         b = this.b(this.c);
      }

      return b != null;
   }

   public ArrayList<bq> a() {
      ArrayList var1 = new ArrayList();
      if (!this.b()) {
         return var1;
      } else {
         String var2 = "";
         List var3 = b.b(var2, bq.class);
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            bq var5 = (bq)var4.next();
            var1.add(var5);
         }

         return var1;
      }
   }

   public synchronized bq a(String var1) {
      if (!this.b()) {
         return null;
      } else {
         String var2 = bq.e(var1);
         List var3 = b.b(var2, bq.class);
         return var3.size() > 0 ? (bq)var3.get(0) : null;
      }
   }

   public synchronized void a(bq var1) {
      if (this.b()) {
         String var2 = bq.f(var1.i());
         b.a((Object)var1, (String)var2);
         String var3 = var1.b();
         this.a(var1.f(), var3);
      }
   }

   private void a(String var1, String var2) {
      if (var2 != null && var2.length() > 0) {
         String var3 = bs.a(var1);
         List var4 = b.b(var3, bs.class);
         if (var4.size() > 0) {
            b.a(var3, bs.class);
         }

         String[] var5 = var2.split(";");
         ArrayList var6 = new ArrayList();
         String[] var7 = var5;
         int var8 = var5.length;

         for(int var9 = 0; var9 < var8; ++var9) {
            String var10 = var7[var9];
            bs var11 = new bs(var1, var10);
            var6.add(var11);
         }

         b.a((List)var6);
      }

   }

   public synchronized List<String> b(String var1) {
      ArrayList var2 = new ArrayList();
      if (!this.b()) {
         return var2;
      } else {
         String var3 = bs.a(var1);
         List var4 = b.b(var3, bs.class);
         var2.addAll(this.a(var4));
         return var2;
      }
   }

   private List<String> a(List<bs> var1) {
      ArrayList var2 = new ArrayList();
      if (var1.size() > 0) {
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            bs var4 = (bs)var3.next();
            var2.add(var4.a());
         }
      }

      return var2;
   }

   public synchronized void c(String var1) {
      if (this.b()) {
         b.a(bt.e(var1), bt.class);
         b.a(bs.a(var1), bs.class);
         b.a(br.a(var1), br.class);
      }
   }

   public synchronized void b(bq var1) {
      if (this.b()) {
         b.a(bt.f(var1.i()), bt.class);
         b.a(bs.a(var1.f()), bs.class);
         b.a(br.a(var1.f()), br.class);
      }
   }

   public void a(String var1, int var2, long var3, long var5, long var7) {
      if (this.b()) {
         long[] var9 = new long[]{var5, 0L, 0L, 0L, 0L};
         long[] var10 = new long[]{var7, 0L, 0L, 0L, 0L};
         this.a(var1, var2, var3, var9, var10);
      }
   }

   public synchronized void a(String var1, int var2, long var3, long[] var5, long[] var6) {
      if (this.b()) {
         br var7 = new br(var1, var3, var2, var5[0], var6[0]);
         String var8 = br.a(var1);
         b.a((Object)var7, (String)var8);
      }
   }

   public synchronized String d(String var1) {
      String var2 = null;
      if (!this.b()) {
         return var2;
      } else {
         String var3 = bt.f(var1);
         List var4 = b.b(var3, bt.class);
         if (var4.size() > 0) {
            var2 = ((bt)var4.get(0)).e();
         }

         return var2;
      }
   }
}
