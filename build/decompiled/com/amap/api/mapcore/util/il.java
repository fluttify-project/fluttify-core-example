package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class il {
   private static final il a = new il();
   private final Map<String, ip> b = new HashMap();
   private final Map<String, il$a> c = new HashMap();
   private static final ThreadFactory d = new il$b();
   private ExecutorService e = null;

   private il() {
   }

   public ExecutorService a() {
      try {
         if (this.e == null || this.e.isShutdown()) {
            this.e = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), d);
         }
      } catch (Throwable var2) {
         ;
      }

      return this.e;
   }

   public static il b() {
      return a;
   }

   il$a a(hf var1) {
      Map var2 = this.c;
      synchronized(this.c) {
         if (!this.b(var1)) {
            return null;
         } else {
            String var3 = var1.a();
            il$a var4 = (il$a)this.c.get(var3);
            if (var4 == null) {
               try {
                  var4 = new il$a(this);
                  this.c.put(var3, var4);
               } catch (Throwable var7) {
                  ;
               }
            }

            return var4;
         }
      }
   }

   ip a(Context var1, hf var2) throws Exception {
      if (this.b(var2) && var1 != null) {
         String var3 = var2.a();
         Map var4 = this.b;
         synchronized(this.b) {
            Object var5 = (ip)this.b.get(var3);
            if (var5 == null) {
               try {
                  var5 = new ir(var1.getApplicationContext(), var2, true);
                  this.b.put(var3, var5);
                  ih.a(var1, var2);
               } catch (Throwable var8) {
                  ;
               }
            }

            return (ip)var5;
         }
      } else {
         return null;
      }
   }

   private boolean b(hf var1) {
      return var1 != null && !TextUtils.isEmpty(var1.b()) && !TextUtils.isEmpty(var1.a());
   }
}
