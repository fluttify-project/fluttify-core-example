package com.amap.api.maps.offlinemap;

public interface OfflineMapManager$OfflineMapDownloadListener {
   void onDownload(int var1, int var2, String var3);

   void onCheckUpdate(boolean var1, String var2);

   void onRemove(boolean var1, String var2, String var3);
}
