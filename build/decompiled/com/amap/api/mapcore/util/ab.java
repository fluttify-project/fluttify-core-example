package com.amap.api.mapcore.util;

import com.autonavi.amap.mapcore.animation.GLAlphaAnimation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

public class ab {
   private float e = 0.0F;
   private float f = 0.0F;
   private float g = 0.0F;
   private float h = 0.7F;
   public FloatBuffer a;
   public ShortBuffer b;
   float[] c = new float[]{-1.0F, -1.0F, 1.0F, 1.0F, -1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
   short[] d = new short[]{0, 1, 3, 0, 3, 2};
   private GLAlphaAnimation i;

   public ab() {
      ByteBuffer var1 = ByteBuffer.allocateDirect(this.d.length * 2);
      var1.order(ByteOrder.nativeOrder());
      this.b = var1.asShortBuffer();
      this.b.put(this.d);
      this.b.position(0);
      ByteBuffer var2 = ByteBuffer.allocateDirect(this.c.length * 4);
      var2.order(ByteOrder.nativeOrder());
      this.a = var2.asFloatBuffer();
      this.a.put(this.c);
      this.a.position(0);
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.e = (float)var1 / 255.0F;
      this.f = (float)var2 / 255.0F;
      this.g = (float)var3 / 255.0F;
      this.h = (float)var4 / 255.0F;
   }

   public void a(GLAlphaAnimation var1) {
      if (this.i != null && !this.i.hasEnded()) {
         this.i.cancel();
      }

      if (var1 != null) {
         this.i = var1;
         this.i.start();
      }
   }
}
