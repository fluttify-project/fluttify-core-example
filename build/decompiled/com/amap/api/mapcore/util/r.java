package com.amap.api.mapcore.util;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class r {
   List<Float> a = new ArrayList();
   List<Float> b = new ArrayList();
   private FloatBuffer c;
   private FloatBuffer d;
   private int e = 0;
   private float f;
   private float g = 0.0F;
   private float h = 0.0F;

   public r(List<Float> var1, List<Float> var2) {
      this.a = var1;
      this.b = var2;
      if (this.c == null) {
         ByteBuffer var3 = ByteBuffer.allocateDirect(var1.size() * 4);
         var3.order(ByteOrder.nativeOrder());
         this.c = var3.asFloatBuffer();
      }

      this.c.clear();
      float var13 = 0.0F;
      float var4 = 0.0F;
      float var5 = 1000000.0F;
      float var6 = 1000000.0F;
      float var7 = 0.0F;
      int var8 = 1;

      for(int var9 = 1; var9 < var1.size() + 1; ++var9) {
         Float var10 = (Float)var1.get(var9 - 1);
         this.c.put(var10.floatValue());
         if (var8 == 1) {
            var13 = Math.max(var10.floatValue(), var13);
            var5 = Math.min(var10.floatValue(), var5);
         }

         if (var8 == 2) {
            var4 = Math.max(var10.floatValue(), var4);
            var6 = Math.min(var10.floatValue(), var6);
         }

         if (var8 == 3) {
            var7 = Math.max(var7, var10.floatValue());
            var8 = 0;
         }

         ++var8;
      }

      float var14 = Math.abs(var13 - var5);
      float var15 = Math.abs(var4 - var6);
      this.g = var14 > var15 ? var14 : var15;
      this.h = var14 > var15 ? var15 : var14;
      this.c.position(0);
      if (this.d == null) {
         ByteBuffer var11 = ByteBuffer.allocateDirect(var2.size() * 4);
         var11.order(ByteOrder.nativeOrder());
         this.d = var11.asFloatBuffer();
      }

      this.d.clear();
      Iterator var16 = var2.iterator();

      while(var16.hasNext()) {
         Float var12 = (Float)var16.next();
         this.d.put(var12.floatValue());
      }

      this.d.position(0);
   }

   public float a() {
      return this.g;
   }

   public float b() {
      return this.h;
   }

   public void a(int var1) {
      this.e = var1;
   }

   public void a(float var1) {
      this.f = -var1;
   }

   public void a(dw$b var1, float[] var2) {
      Matrix.rotateM(var2, 0, this.f, 0.0F, 0.0F, 1.0F);
      GLES20.glUseProgram(var1.d);
      GLES20.glClear(256);
      GLES20.glEnable(2929);
      GLES20.glDepthMask(true);
      GLES20.glEnable(3042);
      GLES20.glBlendFunc(770, 771);
      GLES20.glBlendColor(1.0F, 1.0F, 1.0F, 1.0F);
      GLES20.glBindTexture(3553, this.e);
      GLES20.glEnableVertexAttribArray(var1.h);
      GLES20.glVertexAttribPointer(var1.h, 2, 5126, false, 8, this.d);
      GLES20.glEnableVertexAttribArray(var1.c);
      GLES20.glVertexAttribPointer(var1.c, 3, 5126, false, 12, this.c);
      GLES20.glUniformMatrix4fv(var1.g, 1, false, var2, 0);
      GLES20.glDrawArrays(4, 0, this.a.size() / 3);
      GLES20.glBindTexture(3553, 0);
      GLES20.glDisable(2929);
      GLES20.glDisableVertexAttribArray(var1.c);
      GLES20.glDisableVertexAttribArray(var1.h);
      GLES20.glUseProgram(0);
   }

   public void c() {
      this.a.clear();
      this.d.clear();
   }
}
