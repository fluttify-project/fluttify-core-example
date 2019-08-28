package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.amap.api.maps.model.BitmapDescriptor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

public class ba {
   public static int a = 200;
   private boolean e = false;
   private boolean f = false;
   private BitmapDescriptor g;
   float[] b = null;
   private FloatBuffer h;
   private ShortBuffer i;
   private int j = 0;
   int c = 0;
   int d = 0;
   private dw$a k;
   private dw l;

   public ba(float[] var1, bc var2) {
      this.b = var1;
   }

   private void a(float[] var1) {
      if (var1 != null) {
         ByteBuffer var2;
         if (this.h == null) {
            var2 = ByteBuffer.allocateDirect(var1.length * a * 4);
            var2.order(ByteOrder.nativeOrder());
            this.h = var2.asFloatBuffer();
         }

         this.h.clear();

         for(int var8 = 0; var8 < a; ++var8) {
            int var3 = 0;
            float[] var4 = var1;
            int var5 = var1.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               float var7 = var4[var6];
               if (var3 % 6 == 3) {
                  this.h.put((float)var8);
               } else {
                  this.h.put(var7);
               }

               ++var3;
            }
         }

         this.h.position(0);
         if (this.i == null) {
            var2 = ByteBuffer.allocateDirect(a * 6 * 2);
            var2.order(ByteOrder.nativeOrder());
            this.i = var2.asShortBuffer();
            short[] var9 = new short[6 * a];

            for(int var10 = 0; var10 < a; ++var10) {
               var9[6 * var10 + 0] = (short)(4 * var10 + 0);
               var9[6 * var10 + 1] = (short)(4 * var10 + 1);
               var9[6 * var10 + 2] = (short)(4 * var10 + 2);
               var9[6 * var10 + 3] = (short)(4 * var10 + 0);
               var9[6 * var10 + 4] = (short)(4 * var10 + 2);
               var9[6 * var10 + 5] = (short)(4 * var10 + 3);
            }

            this.i.put(var9);
            this.i.flip();
         }

         this.e = true;
      }
   }

   public void a() {
      if (this.b != null && !this.e) {
         this.a(this.b);
      }

   }

   public void a(BitmapDescriptor var1) {
      this.g = var1;
   }

   private void a(Bitmap var1) {
      if (var1 != null) {
         if (this.j == 0) {
            int[] var2 = new int[1];
            GLES20.glGenTextures(1, var2, 0);
            this.j = var2[0];
         }

         if (this.j != 0) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.j);
            GLES20.glTexParameterf(3553, 10241, 9728.0F);
            GLES20.glTexParameterf(3553, 10240, 9729.0F);
            GLES20.glTexParameterf(3553, 10242, 33071.0F);
            GLES20.glTexParameterf(3553, 10243, 33071.0F);
            GLUtils.texImage2D(3553, 0, var1, 0);
            if (this.j != 0) {
               this.f = true;
            }

         }
      }
   }

   public boolean b() {
      return this.e;
   }

   public void a(float[] var1, float[] var2, float[] var3, float var4, float var5, float var6, float var7, int var8) {
      if (!this.f && this.g != null) {
         this.a(this.g.getBitmap());
      }

      if (this.j != 0) {
         if (this.k == null || this.k.c()) {
            this.f();
         }

         this.e();
         GLES20.glUseProgram(this.k.d);
         GLES20.glUniform4f(this.k.j, var4, var5, var6, var7);
         GLES20.glUniform3fv(this.k.i, var8, var3, 0);
         GLES20.glDisable(2929);
         GLES20.glEnable(3042);
         GLES20.glBlendFunc(770, 771);
         GLES20.glBlendColor(1.0F, 1.0F, 1.0F, 1.0F);
         GLES20.glActiveTexture(33984);
         GLES20.glBindTexture(3553, this.j);
         GLES20.glEnableVertexAttribArray(this.k.c);
         GLES20.glBindBuffer(34962, this.c);
         GLES20.glVertexAttribPointer(this.k.c, 4, 5126, false, 24, 0);
         GLES20.glEnableVertexAttribArray(this.k.h);
         GLES20.glVertexAttribPointer(this.k.h, 2, 5126, false, 24, 16);
         GLES20.glUniformMatrix4fv(this.k.g, 1, false, var1, 0);
         GLES20.glUniformMatrix4fv(this.k.k, 1, false, var2, 0);
         GLES20.glBindBuffer(34963, this.d);
         GLES20.glDrawElements(4, 6 * var8, 5123, 0);
         GLES20.glBindTexture(3553, 0);
         GLES20.glBindBuffer(34962, 0);
         GLES20.glDisableVertexAttribArray(this.k.c);
         GLES20.glDisableVertexAttribArray(this.k.h);
         GLES20.glUseProgram(0);
      }
   }

   private void e() {
      if (this.c == 0) {
         int[] var1 = new int[2];
         GLES20.glGenBuffers(2, var1, 0);
         this.c = var1[0];
         this.d = var1[1];
         GLES20.glBindBuffer(34962, this.c);
         GLES20.glBufferData(34962, this.h.limit() * 4, this.h, 35044);
         GLES20.glBindBuffer(34963, this.d);
         GLES20.glBufferData(34963, a * 6 * 2, this.i, 35044);
         a("bindVbo");
         this.h.clear();
         this.h = null;
      }

   }

   public void c() {
      if (this.h != null) {
         this.h.clear();
      }

      if (this.i != null) {
         this.i.clear();
      }

      if (this.g != null) {
         this.g = null;
      }

      GLES20.glDeleteBuffers(2, new int[]{this.c, this.d}, 0);
      if (this.j != 0) {
         GLES20.glDeleteTextures(1, new int[]{this.j}, 0);
      }

      this.c = 0;
      this.d = 0;
      this.b = null;
      this.e = false;
      this.f = false;
      this.c = 0;
      this.d = 0;
      this.l = null;
   }

   public void a(dw var1) {
      this.l = var1;
   }

   private void f() {
      try {
         if (this.l != null) {
            this.k = (dw$a)this.l.a(4);
         }
      } catch (Throwable var2) {
         a = 1;
         if (this.l != null) {
            this.k = (dw$a)this.l.a(4);
         }
      }

   }

   public static synchronized void a(String var0) {
      int var1;
      if ((var1 = GLES20.glGetError()) != 0) {
         Log.e("amap", var0 + ": glError " + var1);
         throw new RuntimeException(var0 + ": glError " + var1);
      }
   }

   public boolean d() {
      return this.l != null;
   }
}
