package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.opengl.GLES20;
import android.util.Log;
import android.view.SurfaceHolder;
import com.autonavi.amap.mapcore.AMapNativeRenderer;
import java.nio.FloatBuffer;

public class eq {
   public static void a(String var0) {
      int var1;
      if ((var1 = GLES20.glGetError()) != 0) {
         Log.e("amap", var0 + ": glError " + var1);
         throw new RuntimeException(var0 + ": glError " + var1);
      }
   }

   public static void a(dw$e var0, int var1, int var2, FloatBuffer var3, float var4, FloatBuffer var5, int var6, int var7, float[] var8) {
      b(var0, 4, var1, var5, 1.0F, var7, var8);
      b(var0, 2, var2, var3, var4, var6, var8);
   }

   public static void a(dw$e var0, int var1, int var2, FloatBuffer var3, float var4, int var5, float[] var6, float var7, int var8) {
      b(var0, 6, var1, var3, 1.0F, var5, var6);
      b(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void b(dw$e var0, int var1, int var2, FloatBuffer var3, float var4, int var5, float[] var6, float var7, int var8) {
      if (var8 != -1) {
         a(var0, var1, var2, var3, var4 * var7, var5, var6, var8);
      } else {
         a(var0, var1, var2, var3, var4, var5, var6);
      }

   }

   public static void b(dw$e var0, int var1, int var2, FloatBuffer var3, float var4, FloatBuffer var5, int var6, int var7, float[] var8) {
      b(var0, 2, var2, var3, var4, var6, var8);
   }

   private static void a(dw$e var0, int var1, int var2, FloatBuffer var3, float var4, int var5, float[] var6, int var7) {
      try {
         float var9 = (float)Color.alpha(var2) / 255.0F;
         float var10 = (float)Color.red(var2) / 255.0F;
         float var11 = (float)Color.green(var2) / 255.0F;
         float var12 = (float)Color.blue(var2) / 255.0F;
         byte var13 = 3;
         byte var14 = 2;
         if (var5 < var13) {
            return;
         }

         int var15 = (var5 - var14) * var13;
         byte var16 = var13;
         if (var3 == null || var3.limit() < var15 + var13) {
            return;
         }

         float[] var17 = new float[var15];

         for(int var18 = 0; var18 < var15; ++var18) {
            var17[var18] = var3.get(var18 + var16);
         }

         AMapNativeRenderer.nativeDrawLineByTextureID(var17, var17.length, var4, var7, var10, var11, var12, var9, 0.0F, true, true, false, var6, 3, 0);
      } catch (Throwable var19) {
         ht.c(var19, "GlesUtility", "drawCircleLine");
      }

   }

   private static void a(dw$e var0, int var1, int var2, FloatBuffer var3, float var4, int var5, float[] var6) {
      a(var0, 2, var2, var3, var4, 1, var5 - 1, var6);
   }

   private static void b(dw$e var0, int var1, int var2, FloatBuffer var3, float var4, int var5, float[] var6) {
      a(var0, var1, var2, var3, var4, 0, var5, var6);
   }

   private static void a(dw$e var0, int var1, int var2, FloatBuffer var3, float var4, int var5, int var6, float[] var7) {
      if (var4 != 0.0F) {
         if (var0 != null) {
            var0.a();
            GLES20.glEnable(3042);
            GLES20.glDisable(2929);
            GLES20.glBlendFunc(770, 771);
            float var8 = (float)Color.alpha(var2) / 255.0F;
            float var9 = (float)Color.red(var2) / 255.0F;
            float var10 = (float)Color.green(var2) / 255.0F;
            float var11 = (float)Color.blue(var2) / 255.0F;
            float[] var12 = new float[]{var9, var10, var11, var8};
            GLES20.glLineWidth(var4);
            GLES20.glEnableVertexAttribArray(var0.b);
            GLES20.glVertexAttribPointer(var0.b, 3, 5126, false, 0, var3);
            GLES20.glUniform4fv(var0.c, 1, var12, 0);
            GLES20.glUniformMatrix4fv(var0.a, 1, false, var7, 0);
            GLES20.glDrawArrays(var1, var5, var6);
            GLES20.glDisableVertexAttribArray(var0.b);
            GLES20.glDisable(3042);
            GLES20.glUseProgram(0);
         }
      }
   }

   public static void a(v var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var4 > 0) {
         SurfaceHolder var7 = var0.getHolder();
         if (var7 != null) {
            var7.setFormat(-3);
         }
      }

      var0.a((ep)(new eq$b()));
      var0.a((eo)(new eq$a(var1, var2, var3, var4, var5, var6)));
   }
}
