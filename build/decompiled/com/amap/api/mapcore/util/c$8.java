package com.amap.api.mapcore.util;

import android.os.Message;
import android.view.MotionEvent;
import com.amap.api.maps.model.Poi;

class c$8 implements Runnable {
   c$8(c var1, MotionEvent var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         Message var1 = Message.obtain();
         Poi var2 = c.a(this.b, (int)this.a.getX(), (int)this.a.getY(), 25);
         if (c.k(this.b) != null) {
            if (var2 != null) {
               var1.what = 20;
               var1.obj = var2;
               this.b.j.sendMessage(var1);
            } else {
               c.a(this.b, this.a);
            }
         } else {
            c.a(this.b, this.a);
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }
}
