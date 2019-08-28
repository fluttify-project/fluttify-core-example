package com.autonavi.amap.mapcore;

public class AMapNativeParticleSystem {
   public AMapNativeParticleSystem() {
   }

   public static native long nativeCreate();

   public static native void nativeSetGLShaderManager(long var0, long var2);

   public static native long nativeDestroy(long var0);

   public static native void nativeRender(long var0, float[] var2, float[] var3, int var4, int var5, float var6, float var7, float var8);

   public static native void setStartParticleSize(long var0, float var2, float var3);

   public static native void setMaxParticles(long var0, int var2);

   public static native void setDuration(long var0, long var2);

   public static native void setParticleLifeTime(long var0, long var2);

   public static native void setParticleStartSpeed(long var0, long var2);

   public static native void setLoop(long var0, boolean var2);

   public static native void setParticleShapeModule(long var0, long var2);

   public static native void setParticleEmission(long var0, long var2);

   public static native int getCurrentParticleNum(long var0);

   public static native void setParticleOverLifeModule(long var0, long var2);

   public static native void setPreWram(long var0, boolean var2);

   public static native void setStartColor(long var0, long var2);

   public static native void nativeSetTextureId(long var0, int var2);

   public static native long nativeCreateParticleEmissionModule(int var0, int var1);

   public static native long nativeCreateSinglePointParticleShape(float var0, float var1, float var2, boolean var3);

   public static native long nativeCreateRectParticleShape(float var0, float var1, float var2, float var3, boolean var4);

   public static native long nativeCreateRandomColorBetWeenTwoConstants(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7);

   public static native long nativeCreateParticleOverLifeModule();

   public static native long nativeCreateConstantRotationOverLife(float var0);

   public static native long nativeCreateRandomVelocityBetweenTwoConstants(float var0, float var1, float var2, float var3, float var4, float var5);

   public static native long nativeCreateCurveSizeOverLife(float var0, float var1, float var2);

   public static native void nativeSetOverLifeItem(long var0, long var2, int var4);

   public static native void nativeReleaseVelocityOverLife(long var0);

   public static native void nativeReleaseColorGenerate(long var0);

   public static native void nativeReleaseParticleEmissonModule(long var0);

   public static native void nativeReleaseParticleOverLifeModule(long var0);

   public static native void nativeReleaseParticleShapeModule(long var0);

   public static native void nativeReleaseRotationOverLife(long var0);

   public static native void nativeReleaseSizeOverLife(long var0);
}
