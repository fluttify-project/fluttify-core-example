package com.amap.api.mapcore.util;

import java.util.Collections;

class s$1 implements Runnable {
   s$1(s var1) {
      this.a = var1;
   }

   public synchronized void run() {
      try {
         s var1 = this.a;
         synchronized(this.a) {
            if (s.a(this.a) != null && s.a(this.a).size() > 0) {
               Collections.sort(s.a(this.a), this.a.b);
            }
         }
      } catch (Throwable var4) {
         ht.c(var4, "MapOverlayImageView", "changeOverlayIndex");
      }

   }
}
