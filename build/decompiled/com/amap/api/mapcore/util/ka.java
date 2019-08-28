package com.amap.api.mapcore.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class ka extends kb {
   public ka() {
   }

   public ka(kb var1) {
      super(var1);
   }

   protected byte[] a(byte[] var1) {
      StringBuffer var2 = new StringBuffer();
      var2.append((new SimpleDateFormat("yyyyMMdd HHmmss")).format(new Date()));
      var2.append(" ");
      var2.append(UUID.randomUUID().toString());
      var2.append(" ");
      if (var2.length() != 53) {
         return new byte[0];
      } else {
         byte[] var3 = hg.a(var2.toString());
         byte[] var4 = new byte[var3.length + var1.length];
         System.arraycopy(var3, 0, var4, 0, var3.length);
         System.arraycopy(var1, 0, var4, var3.length, var1.length);
         return var4;
      }
   }
}
