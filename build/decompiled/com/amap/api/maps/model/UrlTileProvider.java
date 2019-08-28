package com.amap.api.maps.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public abstract class UrlTileProvider implements TileProvider {
   private final int width;
   private final int height;

   public UrlTileProvider(int var1, int var2) {
      this.width = var1;
      this.height = var2;
   }

   public abstract URL getTileUrl(int var1, int var2, int var3);

   public final Tile getTile(int var1, int var2, int var3) {
      URL var4 = this.getTileUrl(var1, var2, var3);
      if (var4 == null) {
         return NO_TILE;
      } else {
         Tile var5;
         try {
            var5 = Tile.obtain(this.width, this.height, a(var4.openStream()));
         } catch (IOException var7) {
            var5 = NO_TILE;
         }

         return var5;
      }
   }

   private static byte[] a(InputStream var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      a(var0, var1);
      return var1.toByteArray();
   }

   private static long a(InputStream var0, OutputStream var1) throws IOException {
      byte[] var2 = new byte[4096];
      long var4 = 0L;

      while(true) {
         int var3 = var0.read(var2);
         if (var3 == -1) {
            return var4;
         }

         var1.write(var2, 0, var3);
         var4 += (long)var3;
      }
   }

   public int getTileWidth() {
      return this.width;
   }

   public int getTileHeight() {
      return this.height;
   }
}
