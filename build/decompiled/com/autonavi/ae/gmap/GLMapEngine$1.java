package com.autonavi.ae.gmap;

import com.amap.api.mapcore.util.ht;
import com.autonavi.amap.mapcore.maploader.AMapLoader;

class GLMapEngine$1 implements Runnable {
   GLMapEngine$1(GLMapEngine var1, AMapLoader var2) {
      this.this$0 = var1;
      this.val$mapLoader = var2;
   }

   public void run() {
      boolean var16 = false;

      AMapLoader var1;
      label251: {
         label236: {
            label247: {
               try {
                  var16 = true;
                  if (this.this$0.mRequestDestroy) {
                     var16 = false;
                     break label251;
                  }

                  if (this.val$mapLoader != null) {
                     this.val$mapLoader.doRequest();
                     var16 = false;
                     break label236;
                  }

                  var16 = false;
                  break label247;
               } catch (Throwable var22) {
                  ht.c(var22, "download Thread", "AMapLoader doRequest");
                  var16 = false;
               } finally {
                  if (var16) {
                     if (null != this.val$mapLoader && !this.val$mapLoader.isFinish) {
                        AMapLoader var7 = this.val$mapLoader;
                        synchronized(this.val$mapLoader) {
                           if (!this.val$mapLoader.isFinish) {
                              this.val$mapLoader.notify();
                              this.val$mapLoader.isFinish = true;
                           }
                        }
                     }

                  }
               }

               if (null != this.val$mapLoader && !this.val$mapLoader.isFinish) {
                  var1 = this.val$mapLoader;
                  synchronized(this.val$mapLoader) {
                     if (!this.val$mapLoader.isFinish) {
                        this.val$mapLoader.notify();
                        this.val$mapLoader.isFinish = true;
                        return;
                     }
                  }
               }

               return;
            }

            if (null != this.val$mapLoader && !this.val$mapLoader.isFinish) {
               var1 = this.val$mapLoader;
               synchronized(this.val$mapLoader) {
                  if (!this.val$mapLoader.isFinish) {
                     this.val$mapLoader.notify();
                     this.val$mapLoader.isFinish = true;
                  }
               }
            }

            return;
         }

         if (null != this.val$mapLoader && !this.val$mapLoader.isFinish) {
            var1 = this.val$mapLoader;
            synchronized(this.val$mapLoader) {
               if (!this.val$mapLoader.isFinish) {
                  this.val$mapLoader.notify();
                  this.val$mapLoader.isFinish = true;
               }
            }
         }

         return;
      }

      if (null != this.val$mapLoader && !this.val$mapLoader.isFinish) {
         var1 = this.val$mapLoader;
         synchronized(this.val$mapLoader) {
            if (!this.val$mapLoader.isFinish) {
               this.val$mapLoader.notify();
               this.val$mapLoader.isFinish = true;
            }
         }
      }

   }
}
