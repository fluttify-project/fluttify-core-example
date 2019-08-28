package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Handler.Callback;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class g implements Callback {
   private Map<Integer, ac> a = new Hashtable();
   private Handler b;
   private HandlerThread c;
   private c d;
   private boolean e = false;

   public g(Context var1, c var2, v var3) {
      this.d = var2;
      this.c = new HandlerThread("AMapMessageHandler");
      this.c.start();
      this.b = new Handler(this.c.getLooper(), this);
      this.e = false;
   }

   public boolean handleMessage(Message var1) {
      try {
         if (this.e) {
            return false;
         }

         if (var1 == null) {
            return false;
         }

         ac var2 = (ac)var1.obj;
         switch(var1.what) {
         case 1:
            this.d.t(((Integer)var2.b).intValue());
            break;
         case 153:
            Map var3 = this.a;
            synchronized(this.a) {
               Set var4 = this.a.keySet();
               if (var4.size() > 0) {
                  Iterator var5 = var4.iterator();

                  while(var5.hasNext()) {
                     Integer var6 = (Integer)var5.next();
                     ac var7 = (ac)this.a.remove(var6);
                     this.b.obtainMessage(var7.a, var7).sendToTarget();
                  }
               }
            }
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }

      return false;
   }

   public void a(ac var1) {
      try {
         if (this.e) {
            return;
         }

         if (var1 == null) {
            return;
         }

         int var2 = var1.a;
         if (var1.a == 153) {
            if (this.a != null && this.a.size() > 0) {
               this.b.obtainMessage(153).sendToTarget();
            }
         } else {
            Map var3 = this.a;
            synchronized(this.a) {
               if (var2 < 33) {
                  this.a.put(var2, var1);
               }

               if (var2 >= 33) {
                  ;
               }
            }
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public void a() {
      this.e = true;
      if (this.c != null) {
         this.c.quit();
      }

      if (this.b != null) {
         this.b.removeCallbacksAndMessages((Object)null);
      }

   }
}
