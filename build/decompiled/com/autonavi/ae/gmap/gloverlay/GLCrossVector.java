package com.autonavi.ae.gmap.gloverlay;

import com.amap.api.mapcore.util.u;

public class GLCrossVector extends GLOverlay {
   public GLCrossVector(int var1, u var2, int var3) {
      super(var1, var2, var3);
      if (var2 != null && var2.a() != null) {
         this.mNativeInstance = var2.a().createOverlay(var1, GLOverlay$EAMapOverlayTpye.AMAPOVERLAY_VECTOR.ordinal());
      }

   }

   public int addVectorItem(GLCrossVector$AVectorCrossAttr var1, byte[] var2, int var3) {
      if (var1 != null && var2 != null && var3 != 0) {
         int[] var4 = new int[10];
         byte var5 = 0;
         int var7 = var5 + 1;
         var4[var5] = var1.stAreaRect.left;
         var4[var7++] = var1.stAreaRect.top;
         var4[var7++] = var1.stAreaRect.right;
         var4[var7++] = var1.stAreaRect.bottom;
         var4[var7++] = var1.stAreaColor;
         var4[var7++] = var1.fArrowBorderWidth;
         var4[var7++] = var1.stArrowBorderColor;
         var4[var7++] = var1.fArrowLineWidth;
         var4[var7++] = var1.stArrowLineColor;
         var4[var7++] = var1.dayMode ? 1 : 0;
         int var6 = nativeAddVectorData(this.mNativeInstance, var4, var2);
         return var6;
      } else {
         return -1;
      }
   }

   public void addVectorRemainDis(int var1) {
   }

   public void addVectorCar(int var1, int var2, int var3) {
      nativeAddVectorCar(this.mNativeInstance, var1, var2, var3);
   }

   public void setRoadResId(boolean var1, int var2) {
   }

   public void setArrowResId(boolean var1, int var2) {
      nativeSetArrowResId(this.mNativeInstance, var1, var2);
   }

   public void setCarResId(int var1) {
      nativeSetCarResId(this.mNativeInstance, var1);
   }

   public void setBackgroundResId(int var1) {
      nativeSetBackgroundResId(this.mNativeInstance, var1);
   }

   public void setSkyResId(boolean var1, int var2) {
   }

   public int getFBOTextureId() {
      return nativeGetFBOTextureId(this.mNativeInstance);
   }

   public void initFBOTexture(int var1, int var2) {
      nativeInitFBOTexture(this.mNativeInstance, var1, var2);
   }

   private static native int nativeAddVectorData(long var0, int[] var2, byte[] var3);

   private static native void nativeAddVectorCar(long var0, int var2, int var3, int var4);

   private static native void nativeSetArrowResId(long var0, boolean var2, int var3);

   private static native void nativeSetCarResId(long var0, int var2);

   private static native void nativeSetBackgroundResId(long var0, int var2);

   private static native int nativeGetFBOTextureId(long var0);

   private static native void nativeInitFBOTexture(long var0, int var2, int var3);
}
