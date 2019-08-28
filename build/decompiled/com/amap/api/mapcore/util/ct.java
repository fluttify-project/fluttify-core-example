package com.amap.api.mapcore.util;

import javax.microedition.khronos.opengles.GL10;

public abstract class ct {
   private u map;

   public ct() {
   }

   public abstract int getZIndex();

   public void destroy() {
      if (this.map != null) {
         ;
      }

   }

   public abstract void onDrawFrame(GL10 var1);
}
