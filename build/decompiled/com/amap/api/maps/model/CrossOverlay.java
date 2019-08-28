package com.amap.api.maps.model;

import com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay;
import com.autonavi.ae.gmap.gloverlay.GLCrossVector$AVectorCrossAttr;

public class CrossOverlay {
   CrossVectorOverlay a = null;

   public CrossOverlay(CrossOverlayOptions var1, CrossVectorOverlay var2) {
      this.a = var2;
   }

   public int setData(byte[] var1) {
      if (var1 != null && this.a != null) {
         try {
            return this.a.setData(var1);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

      return -1;
   }

   public void setAttribute(GLCrossVector$AVectorCrossAttr var1) {
      try {
         this.a.setAttribute(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setVisible(boolean var1) {
      if (this.a != null) {
         try {
            this.a.setVisible(var1);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

   }

   public void remove() {
      if (this.a != null) {
         try {
            this.a.remove();
         } catch (Throwable var2) {
            var2.printStackTrace();
         }
      }

   }

   public void setImageMode(boolean var1) {
      if (this.a != null) {
         try {
            this.a.setImageMode(var1);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

   }

   public void setGenerateCrossImageListener(CrossOverlay$GenerateCrossImageListener var1) {
      if (this.a != null) {
         try {
            this.a.setGenerateCrossImageListener(var1);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

   }
}
