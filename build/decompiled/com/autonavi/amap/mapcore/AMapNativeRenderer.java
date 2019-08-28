package com.autonavi.amap.mapcore;

public class AMapNativeRenderer {
   public AMapNativeRenderer() {
   }

   public static native void nativeDrawLineByMultiTextureID(float[] var0, int var1, float var2, int[] var3, int var4, int[] var5, int var6, float var7, float[] var8, int var9, int var10);

   public static native void nativeDrawLineByMultiColor(float[] var0, int var1, float var2, int var3, int[] var4, int var5, int[] var6, int var7, float[] var8, int var9, int var10);

   public static native void nativeDrawGradientColorLine(float[] var0, int var1, float var2, int[] var3, int var4, int[] var5, int var6, int var7, float[] var8, int var9, int var10);

   public static native void nativeDrawLineInit();

   public static native void nativeDrawLineByTextureID(float[] var0, int var1, float var2, int var3, float var4, float var5, float var6, float var7, float var8, boolean var9, boolean var10, boolean var11, float[] var12, int var13, int var14);
}
