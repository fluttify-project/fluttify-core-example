package com.autonavi.amap.mapcore.maploader;

import android.content.Context;
import com.amap.api.mapcore.util.eh;
import com.amap.api.mapcore.util.fi;
import com.amap.api.mapcore.util.gu;
import com.amap.api.mapcore.util.gx;
import com.amap.api.mapcore.util.hf;
import java.net.URLEncoder;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

public class AMapLoader$AMapGridDownloadRequest extends eh {
   private final Context mContext;
   private String sUrl;
   private byte[] postEntityBytes;
   private String userAgent;

   public AMapLoader$AMapGridDownloadRequest(Context var1, String var2, String var3) {
      this.mContext = var1;
      this.sUrl = var2;
      this.userAgent = var3;
   }

   public Map<String, String> getRequestHead() {
      hf var1 = fi.e();
      String var2 = null;
      if (var1 != null) {
         var2 = var1.b();
      }

      String var3 = gu.f(this.mContext);

      try {
         var3 = URLEncoder.encode(var3, "UTF-8");
      } catch (Throwable var5) {
         ;
      }

      Hashtable var4 = new Hashtable(16);
      var4.put("User-Agent", this.userAgent);
      var4.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", var2, "3dmap"));
      var4.put("x-INFO", gx.a(this.mContext));
      var4.put("key", var3);
      var4.put("logversion", "2.1");
      return var4;
   }

   public Map<String, String> getParams() {
      return null;
   }

   public String getURL() {
      return this.sUrl;
   }

   public void setPostEntityBytes(byte[] var1) {
      this.postEntityBytes = var1;
   }

   public byte[] getEntityBytes() {
      return this.postEntityBytes;
   }
}
