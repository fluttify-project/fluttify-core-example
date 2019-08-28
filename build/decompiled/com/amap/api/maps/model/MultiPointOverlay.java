package com.amap.api.maps.model;

import com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay;
import java.util.List;

public class MultiPointOverlay {
   IMultiPointOverlay a;

   public MultiPointOverlay(IMultiPointOverlay var1) {
      this.a = var1;
   }

   public void setItems(List<MultiPointItem> var1) {
      if (this.a != null) {
         this.a.addItems(var1);
      }

   }

   public void setAnchor(float var1, float var2) {
      if (this.a != null) {
         this.a.setAnchor(var1, var2);
      }

   }

   public void setEnable(boolean var1) {
      if (this.a != null) {
         this.a.setVisible(var1);
      }

   }

   public void remove() {
      if (this.a != null) {
         this.a.remove(true);
      }

   }

   public void destroy() {
      if (this.a != null) {
         this.a.destroy(true);
      }

   }
}
