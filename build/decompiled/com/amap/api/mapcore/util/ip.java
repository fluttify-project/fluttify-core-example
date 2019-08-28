package com.amap.api.mapcore.util;

import android.content.Context;
import dalvik.system.DexFile;
import java.util.HashMap;
import java.util.Map;

abstract class ip extends ClassLoader {
   protected final Context a;
   protected final Map<String, Class<?>> b = new HashMap();
   protected DexFile c = null;
   volatile boolean d = true;
   protected hf e;
   protected String f;
   protected volatile boolean g = false;
   protected volatile boolean h = false;

   public ip(Context var1, hf var2, boolean var3) {
      super(var1.getClassLoader());
      this.a = var1;
      this.e = var2;
   }

   public boolean a() {
      return this.c != null;
   }

   protected void b() {
      try {
         Map var1 = this.b;
         synchronized(this.b) {
            this.b.clear();
         }

         if (this.c != null) {
            if (this.h) {
               DexFile var7 = this.c;
               synchronized(this.c) {
                  this.c.wait();
               }
            }

            this.g = true;
            this.c.close();
         }
      } catch (Throwable var6) {
         in.a(var6, "BaseLoader", "releaseDexFile()");
      }

   }
}
