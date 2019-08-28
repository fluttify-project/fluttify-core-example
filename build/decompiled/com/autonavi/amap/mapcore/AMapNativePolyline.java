package com.autonavi.amap.mapcore;

public class AMapNativePolyline {
   public AMapNativePolyline() {
   }

   public static native long nativeCreate();

   public static native void nativeSetGLShaderManager(long var0, long var2);

   public static native void nativeDrawLineByTextureID(long var0, float[] var2, int var3, float var4, int var5, float var6, float var7, float var8, float var9, float var10, boolean var11, boolean var12, boolean var13, float[] var14, int var15, int var16);

   public static native long nativeDestroy(long var0);
}
