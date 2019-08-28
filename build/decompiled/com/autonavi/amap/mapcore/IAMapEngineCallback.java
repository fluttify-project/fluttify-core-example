package com.autonavi.amap.mapcore;

public interface IAMapEngineCallback {
   byte[] requireMapResource(int var1, String var2);

   void reloadMapResource(int var1, String var2, int var3);

   /** @deprecated */
   @Deprecated
   void requireMapData(int var1, byte[] var2);

   byte[] requireCharBitmap(int var1, int var2, int var3);

   byte[] requireCharsWidths(int var1, int[] var2, int var3, int var4);

   void requireMapRender(int var1, int var2, int var3);

   void onMapRender(int var1, int var2);

   void cancelRequireMapData(Object var1);

   void OnIndoorBuildingActivity(int var1, byte[] var2);

   int generateRequestId();

   int requireMapDataAsyn(int var1, byte[] var2);
}
