package com.amap.api.mapcore.util;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

class ja$1 extends ByteArrayOutputStream {
   ja$1(ja var1, int var2) {
      super(var2);
      this.a = var1;
   }

   public String toString() {
      int var1 = this.count > 0 && this.buf[this.count - 1] == 13 ? this.count - 1 : this.count;

      try {
         return new String(this.buf, 0, var1, ja.a(this.a).name());
      } catch (UnsupportedEncodingException var3) {
         throw new AssertionError(var3);
      }
   }
}
