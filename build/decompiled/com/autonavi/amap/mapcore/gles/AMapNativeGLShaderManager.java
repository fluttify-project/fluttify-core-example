package com.autonavi.amap.mapcore.gles;

public class AMapNativeGLShaderManager {
   public AMapNativeGLShaderManager() {
   }

   public static native long nativeCreateGLShaderManager();

   public static native void nativeDestroyGLShaderManager(long var0);
}
