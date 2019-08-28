package com.amap.api.mapcore.util;

import java.util.HashMap;
import java.util.Map;

public class hs extends ji {
   private byte[] d;
   private String e = "1";

   public hs(byte[] var1, String var2) {
      this.d = (byte[])var1.clone();
      this.e = var2;
   }

   private String a() {
      byte[] var1 = hg.a(ho.b);
      byte[] var2 = new byte[50 + var1.length];
      System.arraycopy(this.d, 0, var2, 0, 50);
      System.arraycopy(var1, 0, var2, 50, var1.length);
      String var3 = hc.a(var2);
      return var3;
   }

   public Map<String, String> getRequestHead() {
      HashMap var1 = new HashMap();
      var1.put("Content-Type", "application/zip");
      var1.put("Content-Length", String.valueOf(this.d.length));
      return var1;
   }

   public Map<String, String> getParams() {
      return null;
   }

   public String getURL() {
      return String.format(hg.c(ho.c), "1", this.e, "1", "open", this.a());
   }

   public byte[] getEntityBytes() {
      return this.d;
   }
}
