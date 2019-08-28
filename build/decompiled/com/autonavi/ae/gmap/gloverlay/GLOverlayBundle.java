package com.autonavi.ae.gmap.gloverlay;

import android.util.SparseArray;
import com.amap.api.mapcore.util.u;
import java.util.ArrayList;
import java.util.List;

public class GLOverlayBundle<E extends BaseMapOverlay<?, ?>> {
   private final List<E> mOverlayList = new ArrayList();
   u mGLMapView = null;
   private long mNativeInstance = 0L;
   private SparseArray<GLOverlayTexture> mTextureCaches = new SparseArray();
   private int mEngineID;

   public static void intClr2PVRClr(float[] var0, int var1) {
      var0[2] = (float)(var1 & 255) / 255.0F;
      var0[1] = (float)(var1 >> 8 & 255) / 255.0F;
      var0[0] = (float)(var1 >> 16 & 255) / 255.0F;
      var0[3] = (float)(var1 >> 24 & 255) / 255.0F;
   }

   public GLOverlayBundle(int var1, u var2) {
      this.mEngineID = var1;
      this.mGLMapView = var2;
      this.mNativeInstance = var2.a().getGlOverlayMgrPtr(this.mEngineID);
   }

   public int getOverlayCount() {
      List var1 = this.mOverlayList;
      synchronized(this.mOverlayList) {
         return this.mOverlayList.size();
      }
   }

   public boolean cotainsOverlay(E var1) {
      if (var1 == null) {
         return false;
      } else {
         List var2 = this.mOverlayList;
         synchronized(this.mOverlayList) {
            return this.mOverlayList.contains(var1);
         }
      }
   }

   public E getOverlay(int var1) {
      List var2 = this.mOverlayList;
      synchronized(this.mOverlayList) {
         return var1 >= 0 && var1 <= this.mOverlayList.size() - 1 ? (BaseMapOverlay)this.mOverlayList.get(var1) : null;
      }
   }

   private int getOverlyExType(E var1) {
      return 0;
   }

   public void addOverlay(E var1) {
      if (var1 != null) {
         nativeAddGLOverlay(this.mNativeInstance, var1.getGLOverlay().getNativeInstatnce(), (long)var1.getGLOverlay().getCode());
         var1.getGLOverlay().mIsInBundle = true;
         List var2 = this.mOverlayList;
         synchronized(this.mOverlayList) {
            this.mOverlayList.add(var1);
         }
      }
   }

   public void sortOverlay() {
      nativeSortAllGLOverlay(this.mNativeInstance);
   }

   public void removeOverlay(E var1) {
      if (var1 != null) {
         nativeRemoveGLOverlay(this.mNativeInstance, var1.getGLOverlay().getNativeInstatnce());
         var1.getGLOverlay().mIsInBundle = false;
         List var2 = this.mOverlayList;
         synchronized(this.mOverlayList) {
            this.mOverlayList.remove(var1);
         }
      }
   }

   public void removeAll(boolean var1) {
      nativeClearAllGLOverlay(this.mNativeInstance, var1);
      List var2 = this.mOverlayList;
      synchronized(this.mOverlayList) {
         for(int var3 = 0; var3 < this.mOverlayList.size(); ++var3) {
            BaseMapOverlay var4 = (BaseMapOverlay)this.mOverlayList.get(var3);
            if (var4 != null) {
               var4.getGLOverlay().mIsInBundle = false;
               var4.getGLOverlay().releaseInstance();
            }
         }

         this.mOverlayList.clear();
      }
   }

   public void clearFocus() {
      if (this.mOverlayList != null) {
         List var1 = this.mOverlayList;
         synchronized(this.mOverlayList) {
            for(int var2 = 0; var2 < this.mOverlayList.size(); ++var2) {
               BaseMapOverlay var3 = (BaseMapOverlay)this.mOverlayList.get(var2);
               if (var3 != null) {
                  var3.clearFocus();
               }
            }
         }
      }

   }

   public boolean onSingleTap(int var1, int var2, int var3, int var4) {
      boolean var5 = false;
      byte var6 = 1;
      int var7 = var4 & var6;
      if (var7 == var6) {
         var5 = this.onSingleTapPoints(var1, var2, var3);
      }

      if (var5) {
         return true;
      } else {
         byte var8 = 2;
         var7 = var4 & var8;
         if (var7 == var8) {
            var5 = this.onSingleTapLines(var1, var2, var3);
         }

         return var5;
      }
   }

   boolean onSingleTapPoints(int var1, int var2, int var3) {
      return false;
   }

   boolean onSingleTapLines(int var1, int var2, int var3) {
      return false;
   }

   public long checkSingleTapOnLine(int var1, int var2) {
      long[] var3 = new long[3];
      return nativeOnSingleTapLineOverlay(this.mNativeInstance, var1, var2, var3) ? var3[0] : -1L;
   }

   public long checkSingleTapOnPoint(int var1, int var2) {
      long[] var3 = new long[3];
      return nativeOnSingleTapPointOverlay(this.mNativeInstance, var1, var2, var3) ? var3[0] : -1L;
   }

   public GLOverlayTexture getOverlayTextureItem(int var1) {
      SparseArray var2 = this.mTextureCaches;
      synchronized(this.mTextureCaches) {
         return (GLOverlayTexture)this.mTextureCaches.get(var1);
      }
   }

   public boolean addOverlayTextureItem(int var1, int var2, int var3, int var4) {
      GLOverlayTexture var5 = new GLOverlayTexture(var1, var2, var3, var4);
      SparseArray var6 = this.mTextureCaches;
      synchronized(this.mTextureCaches) {
         this.mTextureCaches.put(var1, var5);
         return true;
      }
   }

   public boolean addOverlayTextureItem(int var1, int var2, float var3, float var4, int var5, int var6) {
      GLOverlayTexture var7 = new GLOverlayTexture(var1, var2, var3, var4, var5, var6);
      SparseArray var8 = this.mTextureCaches;
      synchronized(this.mTextureCaches) {
         this.mTextureCaches.put(var1, var7);
         return true;
      }
   }

   public void clearOverlayTexture() {
      SparseArray var1 = this.mTextureCaches;
      synchronized(this.mTextureCaches) {
         this.mTextureCaches.clear();
      }
   }

   public void reculateRouteBoard(u var1) {
   }

   private static native void nativeAddGLOverlay(long var0, long var2, long var4);

   private static native void nativeAddGLOverlayEx(long var0, long var2, long var4, int var6);

   private static native void nativeSortAllGLOverlay(long var0);

   private static native void nativeRemoveGLOverlay(long var0, long var2);

   private static native void nativeRemoveGLOverlayEx(long var0, long var2, int var4);

   private static native void nativeClearAllGLOverlay(long var0, boolean var2);

   private static native boolean nativeOnSingleTapPointOverlay(long var0, int var2, int var3, long[] var4);

   private static native boolean nativeOnSingleTapLineOverlay(long var0, int var2, int var3, long[] var4);
}
