package com.amap.api.mapcore.util;

import java.util.Map;

public class jc extends ji {
   private byte[] d;
   private Map<String, String> e;

   public jc(byte[] var1, Map<String, String> var2) {
      this.d = var1;
      this.e = var2;
   }

   public Map<String, String> getRequestHead() {
      return null;
   }

   public Map<String, String> getParams() {
      return this.e;
   }

   public String getURL() {
      return "https://adiu.amap.com/ws/device/adius";
   }

   public byte[] getEntityBytes() {
      return this.d;
   }
}
