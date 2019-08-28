package com.amap.api.maps.model;

import com.autonavi.amap.mapcore.interfaces.ITileOverlay;

public final class TileOverlay {
   private ITileOverlay mTileOverlayDelegate;

   public TileOverlay(ITileOverlay var1) {
      this.mTileOverlayDelegate = var1;
   }

   public void remove() {
      this.mTileOverlayDelegate.remove();
   }

   public void clearTileCache() {
      this.mTileOverlayDelegate.clearTileCache();
   }

   public String getId() {
      return this.mTileOverlayDelegate.getId();
   }

   public void setZIndex(float var1) {
      this.mTileOverlayDelegate.setZIndex(var1);
   }

   public float getZIndex() {
      return this.mTileOverlayDelegate.getZIndex();
   }

   public void setVisible(boolean var1) {
      this.mTileOverlayDelegate.setVisible(var1);
   }

   public boolean isVisible() {
      return this.mTileOverlayDelegate.isVisible();
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof TileOverlay) {
         try {
            return this.mTileOverlayDelegate.equalsRemote(((TileOverlay)var1).mTileOverlayDelegate);
         } catch (Throwable var3) {
            var3.printStackTrace();
            return false;
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.mTileOverlayDelegate.hashCodeRemote();
   }
}
