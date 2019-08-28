package com.amap.api.maps;

import android.content.Context;
import com.amap.api.mapcore.util.gt;
import com.amap.api.mapcore.util.gw;
import com.amap.api.mapcore.util.hf;
import com.amap.api.mapcore.util.hf$a;
import com.amap.api.mapcore.util.n;

class AMapUtils$a extends Thread {
   String a = "";
   Context b;

   public AMapUtils$a(String var1, Context var2) {
      this.a = var1;
      if (var2 != null) {
         this.b = var2.getApplicationContext();
      }

   }

   public void run() {
      if (this.b != null) {
         try {
            hf var1 = (new hf$a(this.a, "6.9.2", n.c)).a(new String[]{"com.amap.api.maps"}).a();
            gw.a(this.b, var1);
            this.interrupt();
         } catch (gt var2) {
            var2.printStackTrace();
         }
      }

   }
}
