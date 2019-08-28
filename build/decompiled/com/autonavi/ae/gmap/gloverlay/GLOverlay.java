package com.autonavi.ae.gmap.gloverlay;

import com.amap.api.mapcore.util.u;
import com.autonavi.ae.gmap.GLMapEngine;

public abstract class GLOverlay {
   protected int mCode;
   protected u mGLMapView;
   protected int mEngineID;
   protected boolean isNightStyle = false;
   boolean mIsInBundle = false;
   protected long mNativeInstance = 0L;
   protected int mItemPriority = 0;

   public GLOverlay(int var1, u var2, int var3) {
      this.mEngineID = var1;
      this.mGLMapView = var2;
      this.mCode = var3;
      this.mNativeInstance = 0L;
      this.mItemPriority = 0;
   }

   public long getNativeInstatnce() {
      return this.mNativeInstance;
   }

   public int getCode() {
      return this.mCode;
   }

   public int getType() {
      return this.mNativeInstance == 0L ? -1 : nativeGetType(this.mNativeInstance);
   }

   public int getSubType() {
      return this.mNativeInstance == 0L ? -1 : nativeGetSubType(this.mNativeInstance);
   }

   public void removeItem(int var1) {
      if (this.mNativeInstance != 0L) {
         nativeRemoveItem(this.mNativeInstance, var1);
      }
   }

   public void removeAll() {
      if (this.mNativeInstance != 0L) {
         nativeRemoveAll(this.mNativeInstance);
         if (this.mGLMapView != null) {
            ;
         }

      }
   }

   public int getSize() {
      return this.mNativeInstance == 0L ? 0 : nativeGetCount(this.mNativeInstance);
   }

   public void setVisible(boolean var1) {
      if (this.mNativeInstance != 0L) {
         nativeSetVisible(this.mNativeInstance, var1);
      }
   }

   public boolean isVisible() {
      return this.mNativeInstance == 0L ? false : nativeIsVisible(this.mNativeInstance);
   }

   public void setClickable(boolean var1) {
      if (this.mNativeInstance != 0L) {
         nativeSetClickable(this.mNativeInstance, var1);
      }
   }

   public boolean isClickable() {
      return this.mNativeInstance == 0L ? false : nativeIsClickable(this.mNativeInstance);
   }

   public void clearFocus() {
   }

   public boolean getIsInBundle() {
      return this.mIsInBundle;
   }

   public void setMaxCountShown(int var1) {
      nativeSetShownMaxCount(this.mNativeInstance, var1);
   }

   public void setOverlayOnTop(boolean var1) {
      nativeSetOverlayOnTop(this.mNativeInstance, var1);
   }

   public void setMinDisplayLevel(float var1) {
      nativeSetMinDisplayLevel(this.mNativeInstance, var1);
   }

   public void setMaxDisplayLevel(float var1) {
      nativeSetMaxDisplayLevel(this.mNativeInstance, var1);
   }

   public void setOverlayPriority(int var1) {
      nativeSetOverlayPriority(this.mNativeInstance, var1);
      if (this.mGLMapView != null && this.mGLMapView.a() != null) {
         GLOverlayBundle var2 = this.mGLMapView.a().getOverlayBundle(this.mEngineID);
         if (null != var2) {
            var2.sortOverlay();
         }
      }

   }

   public int getOverlayPriority() {
      return nativeGetOverlayPriority(this.mNativeInstance);
   }

   public void setOverlayItemPriority(int var1) {
      this.mItemPriority = var1;
   }

   void releaseInstance() {
      if (this.mNativeInstance != 0L) {
         long var1 = this.mNativeInstance;
         this.mNativeInstance = 0L;
         GLMapEngine.destroyOverlay(this.mEngineID, var1);
      }

   }

   private static native int nativeGetType(long var0);

   private static native int nativeGetSubType(long var0);

   private static native void nativeRemoveItem(long var0, int var2);

   private static native void nativeRemoveAll(long var0);

   private static native int nativeGetCount(long var0);

   protected static native void nativeSetVisible(long var0, boolean var2);

   private static native boolean nativeIsVisible(long var0);

   private static native void nativeSetClickable(long var0, boolean var2);

   private static native boolean nativeIsClickable(long var0);

   private static native void nativeSetOverlayOnTop(long var0, boolean var2);

   private static native void nativeSetMinDisplayLevel(long var0, float var2);

   private static native void nativeSetMaxDisplayLevel(long var0, float var2);

   private static native void nativeSetShownMaxCount(long var0, int var2);

   private static native void nativeSetOverlayPriority(long var0, int var2);

   private static native int nativeGetOverlayPriority(long var0);

   private static native void nativeSetOverlayItemPriority(long var0, int var2);

   public void useNightStyle(boolean var1) {
      this.isNightStyle = var1;
   }
}
