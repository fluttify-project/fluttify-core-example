package com.amap.api.mapcore.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class fw {
   private boolean b = false;
   ArrayList<fw$a> a = new ArrayList();

   public fw() {
   }

   public synchronized void a() {
      if (!this.b) {
         this.b = true;

         for(int var1 = 0; var1 < this.a.size(); ++var1) {
            fw$a var2 = (fw$a)this.a.get(var1);

            try {
               if (fw$a.a(var2) != null) {
                  Class var3 = fw$a.a(var2).getClass();
                  if (var3 != null) {
                     Method var4 = null;

                     try {
                        var4 = var3.getDeclaredMethod(fw$a.b(var2), fw$a.c(var2));
                     } catch (NoSuchMethodException var8) {
                        if (fw$a.c(var2).length > 0) {
                           Class[] var6 = new Class[fw$a.c(var2).length];

                           for(int var7 = 0; var7 < fw$a.c(var2).length; ++var7) {
                              if (fw$a.c(var2)[var7].getInterfaces().length > 0) {
                                 var6[var7] = fw$a.c(var2)[var7].getInterfaces()[0];
                              }
                           }

                           var4 = var3.getDeclaredMethod(fw$a.b(var2), var6);
                        }
                     }

                     if (var4 != null) {
                        var4.setAccessible(true);
                        var4.invoke(fw$a.a(var2), fw$a.d(var2));
                     }
                  }
               }
            } catch (NoSuchMethodException var9) {
               var9.printStackTrace();
            } catch (SecurityException var10) {
               var10.printStackTrace();
            } catch (IllegalAccessException var11) {
               var11.printStackTrace();
            } catch (IllegalArgumentException var12) {
               var12.printStackTrace();
            } catch (InvocationTargetException var13) {
               var13.printStackTrace();
            }
         }

         this.a.clear();
      }
   }

   public synchronized void a(Object var1, Object... var2) {
      try {
         StackTraceElement[] var3 = Thread.currentThread().getStackTrace();
         if (var3 != null && var3.length >= 3) {
            fw$a var4 = new fw$a(var1, var3[3].getMethodName(), var2);
            if (var4 != null) {
               this.a.add(var4);
            }
         }
      } catch (Throwable var5) {
         ;
      }

      this.b = false;
   }
}
