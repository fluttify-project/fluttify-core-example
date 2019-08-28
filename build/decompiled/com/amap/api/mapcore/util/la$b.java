package com.amap.api.mapcore.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class la$b {
   private static Object[] b(Object var0, ArrayList<File> var1, File var2, ArrayList<IOException> var3) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Method var4;
      try {
         var4 = kl.a(var0, "makeDexElements", ArrayList.class, File.class, ArrayList.class);
      } catch (NoSuchMethodException var6) {
         try {
            var4 = kl.a(var0, "makeDexElements", List.class, File.class, List.class);
         } catch (NoSuchMethodException var5) {
            throw var5;
         }
      }

      return (Object[])var4.invoke(var0, var1, var2, var3);
   }
}
