package com.amap.api.mapcore.util;

import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.amap.mapcore.MapConfig;
import java.io.IOException;
import java.util.Random;

public class el implements TileProvider {
   private final int b;
   private final int c;
   private MapConfig d;
   Random a = new Random();

   public el(int var1, int var2, MapConfig var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Tile getTile(int var1, int var2, int var3) {
      Tile var4;
      try {
         String var5 = this.d != null ? this.d.getMapLanguage() : "zh_cn";
         byte[] var6 = this.a(var1, var2, var3, var5);
         if (var6 == null) {
            return NO_TILE;
         }

         var4 = Tile.obtain(this.b, this.c, var6);
      } catch (IOException var7) {
         var4 = NO_TILE;
      }

      return var4;
   }

   private byte[] a(int var1, int var2, int var3, String var4) throws IOException {
      try {
         el$a var5 = new el$a(this, var1, var2, var3, var4);
         return var5.makeHttpRequest();
      } catch (Throwable var6) {
         return null;
      }
   }

   public int getTileWidth() {
      return this.b;
   }

   public int getTileHeight() {
      return this.c;
   }
}
