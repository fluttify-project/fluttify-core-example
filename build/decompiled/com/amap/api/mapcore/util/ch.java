package com.amap.api.mapcore.util;

import java.util.Hashtable;
import java.util.Map;

public class ch extends eh {
   private String d;

   public ch(String var1) {
      this.d = var1;
   }

   public Map<String, String> getRequestHead() {
      Hashtable var1 = new Hashtable(32);
      var1.put("User-Agent", "MAC=channel:amapapi");
      return var1;
   }

   public Map<String, String> getParams() {
      return null;
   }

   public String getURL() {
      return this.d;
   }
}
