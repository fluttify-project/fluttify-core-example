package com.amap.api.mapcore.util;

import java.io.File;
import java.io.FilenameFilter;

class gk$a implements FilenameFilter {
   gk$a() {
   }

   public boolean accept(File var1, String var2) {
      String var3 = gk.b() + gk.c();
      return var2.startsWith(gk.d()) && !var2.endsWith(var3);
   }
}
