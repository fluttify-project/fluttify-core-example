package com.autonavi.amap.mapcore;

import com.amap.api.maps.model.BuildingOverlayOptions;

public class AMapNativeBuildingRenderer {
   public AMapNativeBuildingRenderer() {
   }

   public static native long nativeCreate();

   public static native void setCurTileIDs(long var0, int[] var2);

   public static native void nativeClearBuildingOptions(long var0);

   public static native void addBuildingOptions(long var0, BuildingOverlayOptions var2);

   public static native void render(long var0, float[] var2, float[] var3, int var4, int var5, float var6, int[] var7);

   public static native void nativeDestory(long var0);

   public static native void nativeSetGLShaderManager(long var0, long var2);
}
