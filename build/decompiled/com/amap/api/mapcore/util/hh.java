package com.amap.api.mapcore.util;

import java.util.HashMap;
import java.util.Map;

/** @deprecated */
@Deprecated
class hh extends ji {
   private Map<String, String> d = new HashMap();
   private String e;
   private Map<String, String> f = new HashMap();

   hh() {
   }

   void a(Map<String, String> var1) {
      this.d.clear();
      this.d.putAll(var1);
   }

   void a(String var1) {
      this.e = var1;
   }

   void b(Map<String, String> var1) {
      this.f.clear();
      this.f.putAll(var1);
   }

   public String getURL() {
      return this.e;
   }

   public Map<String, String> getRequestHead() {
      return this.d;
   }

   public Map<String, String> getParams() {
      return this.f;
   }
}
