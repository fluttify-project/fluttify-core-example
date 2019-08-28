package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMapException;
import java.util.Map;
import org.json.JSONObject;

public abstract class ce<T, V> {
   protected T a;
   protected int b = 3;
   protected Context c;

   public ce(Context var1, T var2) {
      this.a(var1, var2);
   }

   private void a(Context var1, T var2) {
      this.c = var1;
      this.a = var2;
   }

   protected abstract V b(JSONObject var1) throws AMapException;

   public V c() throws AMapException {
      return null != this.a ? this.d() : null;
   }

   protected V d() throws AMapException {
      Object var1 = null;
      int var2 = 0;
      gv$a var3 = null;

      while(var2 < this.b) {
         try {
            var3 = gv.a(this.c, fi.e(), this.a(), this.b());
            JSONObject var4 = this.a(var3);
            var1 = this.b(var4);
            var2 = this.b;
         } catch (Throwable var5) {
            ht.c(var5, "AbstractProtocalHandler", "getDataMayThrow AMapException");
            var5.printStackTrace();
            ++var2;
            if (var2 >= this.b) {
               var1 = null;
               if (var3 != null && var3.a != null) {
                  throw new AMapException(var3.a);
               }
            }
         }
      }

      return var1;
   }

   protected abstract JSONObject a(gv$a var1);

   protected abstract String a();

   protected abstract Map<String, String> b();
}
