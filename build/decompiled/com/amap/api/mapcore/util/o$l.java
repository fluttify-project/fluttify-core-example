package com.amap.api.mapcore.util;

import android.util.Log;
import java.io.Writer;

class o$l extends Writer {
   private StringBuilder a = new StringBuilder();

   o$l() {
   }

   public void close() {
      this.a();
   }

   public void flush() {
      this.a();
   }

   public void write(char[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         char var5 = var1[var2 + var4];
         if (var5 == '\n') {
            this.a();
         } else {
            this.a.append(var5);
         }
      }

   }

   private void a() {
      if (this.a.length() > 0) {
         Log.v("GLSurfaceView", this.a.toString());
         this.a.delete(0, this.a.length());
      }

   }
}
