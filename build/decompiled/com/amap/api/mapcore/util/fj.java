package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileProvider;

public class fj extends fk {
   private TileProvider e = null;

   public fj(Context var1, int var2, int var3) {
      super(var1, var2, var3);
      this.a(var1);
   }

   private void a(Context var1) {
      this.b(var1);
   }

   public void a(TileProvider var1) {
      this.e = var1;
   }

   private void b(Context var1) {
      ConnectivityManager var2 = (ConnectivityManager)var1.getSystemService("connectivity");
      if (var2 != null) {
         NetworkInfo var3 = var2.getActiveNetworkInfo();
         if (var3 != null && !var3.isConnectedOrConnecting()) {
            ;
         }
      }

   }

   private Bitmap c(du$a var1) {
      Bitmap var2 = null;

      try {
         Tile var3 = this.e.getTile(var1.a, var1.b, var1.c);
         if (var3 != null && var3 != TileProvider.NO_TILE) {
            var2 = BitmapFactory.decodeByteArray(var3.data, 0, var3.data.length);
         }

         var3 = null;
      } catch (Throwable var4) {
         ;
      }

      return var2;
   }

   protected Bitmap a(Object var1) {
      return this.c((du$a)var1);
   }
}
