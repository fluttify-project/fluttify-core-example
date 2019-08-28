package com.amap.api.mapcore.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

final class ew$a extends fq<ew$a> {
   ByteBuffer a;
   ShortBuffer b;
   FloatBuffer c;
   IntBuffer d;
   int e;

   ew$a() {
   }

   void a(int var1) {
      byte var2 = 15;
      if (var1 < 1 << var2) {
         var1 = 1 << var2;
      }

      this.a = ByteBuffer.allocateDirect(var1).order(ByteOrder.nativeOrder());
      this.e = var1;
      this.b = null;
      this.d = null;
      this.c = null;
   }
}
