package com.autonavi.ae.gmap.gloverlay;

import android.content.Context;
import android.graphics.Bitmap;
import com.amap.api.mapcore.util.u;
import java.io.Serializable;
import java.util.List;
import java.util.Vector;

public abstract class BaseMapOverlay<T extends GLOverlay, E> implements Serializable {
   private static final long serialVersionUID = 1L;
   protected T mGLOverlay;
   protected Vector<E> mItemList = null;
   protected Context mContext;
   protected u mMapView;
   protected int mEngineID = 1;
   protected int mLastFocusedIndex;

   protected abstract void iniGLOverlay();

   public abstract void addItem(E var1);

   public abstract void resumeMarker(Bitmap var1);

   public BaseMapOverlay(int var1, Context var2, u var3) {
      this.mEngineID = var1;
      this.mContext = var2;
      this.mMapView = var3;
      this.mItemList = new Vector();
      this.iniGLOverlay();
   }

   public T getGLOverlay() {
      return this.mGLOverlay;
   }

   public void setVisible(boolean var1) {
      if (this.mGLOverlay != null) {
         this.mGLOverlay.setVisible(var1);
      }

   }

   public boolean isVisible() {
      return this.mGLOverlay != null ? this.mGLOverlay.isVisible() : false;
   }

   public void setClickable(boolean var1) {
      if (this.mGLOverlay != null) {
         this.mGLOverlay.setClickable(var1);
      }

   }

   public boolean isClickable() {
      return this.mGLOverlay != null ? this.mGLOverlay.isClickable() : false;
   }

   public int getSize() {
      return this.mItemList.size();
   }

   public boolean clear() {
      try {
         this.mItemList.clear();
         this.clearFocus();
         if (this.mGLOverlay != null) {
            this.mGLOverlay.removeAll();
         }

         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   public boolean removeAll() {
      return this.clear();
   }

   public void clearFocus() {
      this.mLastFocusedIndex = -1;
      this.mGLOverlay.clearFocus();
   }

   public final E getItem(int var1) {
      try {
         Vector var2 = this.mItemList;
         synchronized(this.mItemList) {
            return var1 >= 0 && var1 <= this.mItemList.size() - 1 ? this.mItemList.get(var1) : null;
         }
      } catch (IndexOutOfBoundsException var5) {
         return null;
      }
   }

   public void removeItem(int var1) {
      try {
         if (var1 < 0 || var1 > this.mItemList.size() - 1) {
            return;
         }

         if (var1 == this.mLastFocusedIndex) {
            this.mLastFocusedIndex = -1;
            this.clearFocus();
         }

         this.mItemList.remove(var1);
         if (this.mGLOverlay != null) {
            this.mGLOverlay.removeItem(var1);
         }
      } catch (IndexOutOfBoundsException var3) {
         ;
      }

   }

   public void removeItem(E var1) {
      try {
         if (var1 == null) {
            return;
         }

         Vector var2 = this.mItemList;
         synchronized(this.mItemList) {
            int var3 = this.mItemList.indexOf(var1);
            this.removeItem(var3);
         }
      } catch (IndexOutOfBoundsException var6) {
         ;
      }

   }

   public List<E> getItems() {
      return this.mItemList;
   }

   public void releaseInstance() {
      this.mMapView.queueEvent(new BaseMapOverlay$1(this));
   }
}
