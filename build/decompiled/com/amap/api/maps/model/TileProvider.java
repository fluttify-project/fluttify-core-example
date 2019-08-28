package com.amap.api.maps.model;

public interface TileProvider {
   Tile NO_TILE = Tile.obtain(-1, -1, (byte[])null);

   Tile getTile(int var1, int var2, int var3);

   int getTileWidth();

   int getTileHeight();
}
