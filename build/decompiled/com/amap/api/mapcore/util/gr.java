package com.amap.api.mapcore.util;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.maps.model.LatLng;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gr {
   private Map<String, gr$a> a = null;
   private static volatile gr b = null;

   public gr() {
      this.a = Collections.synchronizedMap(new HashMap());
   }

   public static gr a() {
      if (b == null) {
         Class var0 = gr.class;
         synchronized(gr.class) {
            if (b == null) {
               b = new gr();
            }
         }
      }

      return b;
   }

   public synchronized void a(String var1, int var2, List<LatLng> var3) {
      if (this.a != null) {
         ((gr$a)this.a.get(var1)).a().put(var2, var3);
      }

   }

   public synchronized void a(String var1, int var2, int var3, int var4) {
      if (this.a != null) {
         this.a.put(var1, new gr$a(this, var2, var3, var4, new HashMap(16)));
      }

   }

   public synchronized gr$a a(String var1) {
      return this.a != null ? (gr$a)this.a.get(var1) : null;
   }

   public void a(Handler var1, int var2, String var3) {
      Message var4 = var1.obtainMessage();
      var4.obj = var3;
      var4.what = 102;
      Bundle var5 = new Bundle();
      var5.putInt("lineID", var2);
      var4.setData(var5);
      var1.sendMessage(var4);
   }
}
