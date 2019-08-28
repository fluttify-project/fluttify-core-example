package com.amap.api.mapcore.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class la$c {
   private static Object[] a(Object var0, ArrayList<File> var1, File var2, ArrayList<IOException> var3) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Method var4;
      try {
         var4 = kl.a(var0, "makePathElements", List.class, File.class, List.class);
      } catch (NoSuchMethodException var7) {
         try {
            var4 = kl.a(var0, "makePathElements", ArrayList.class, File.class, ArrayList.class);
         } catch (NoSuchMethodException var6) {
            try {
               return la$b.a(var0, var1, var2, var3);
            } catch (NoSuchMethodException var5) {
               throw var5;
            }
         }
      }

      return (Object[])var4.invoke(var0, var1, var2, var3);
   }
}
