package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.LayoutInflater.Factory;
import java.lang.reflect.Constructor;

public class gj extends ContextThemeWrapper {
   private Resources a = gk.a();
   private LayoutInflater b;
   private ClassLoader c;
   private static final String[] d = new String[]{"android.widget", "android.webkit", "android.app"};
   private gj$a e = new gj$a(this);
   private Factory f = new gj$1(this);

   public gj(Context var1, int var2, ClassLoader var3) {
      super(var1, var2);
      this.c = var3;
   }

   public Resources getResources() {
      return this.a != null ? this.a : super.getResources();
   }

   public Object getSystemService(String var1) {
      if ("layout_inflater".equals(var1)) {
         if (this.b == null) {
            LayoutInflater var2 = (LayoutInflater)super.getSystemService(var1);
            if (var2 != null) {
               this.b = var2.cloneInContext(this);
            }

            this.b.setFactory(this.f);
            this.b = this.b.cloneInContext(this);
         }

         return this.b;
      } else {
         return super.getSystemService(var1);
      }
   }

   private final View a(String var1, Context var2, AttributeSet var3) {
      if (this.e.a.contains(var1)) {
         return null;
      } else {
         Constructor var4 = (Constructor)this.e.b.get(var1);
         if (var4 == null) {
            Class var5 = null;
            boolean var6 = false;

            try {
               String var7 = "api.navi";
               if (var1.contains(var7)) {
                  var5 = this.c.loadClass(var1);
               } else {
                  String[] var8 = d;
                  int var9 = var8.length;
                  int var10 = 0;

                  while(var10 < var9) {
                     String var11 = var8[var10];

                     try {
                        var5 = this.c.loadClass(var11 + "." + var1);
                        break;
                     } catch (Throwable var15) {
                        ++var10;
                     }
                  }
               }

               if (var5 != null && var5 != ViewStub.class && var5.getClassLoader() == this.c) {
                  var6 = true;
               }
            } catch (Throwable var16) {
               ;
            }

            if (!var6) {
               this.e.a.add(var1);
               return null;
            }

            try {
               var4 = var5.getConstructor(Context.class, AttributeSet.class);
               this.e.b.put(var1, var4);
            } catch (Throwable var14) {
               ;
            }
         }

         try {
            View var17 = null;
            if (var4 != null) {
               var17 = (View)var4.newInstance(var2, var3);
            }

            return var17;
         } catch (Throwable var13) {
            return null;
         }
      }
   }
}
