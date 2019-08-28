package com.autonavi.ae.gmap.style;

import java.util.HashMap;
import java.util.Map;

public class StyleItem {
   private int styleTypeId;
   public int mainKey;
   public int[] subKey;
   private Map<Integer, StyleElement> styleElements = new HashMap();

   public StyleItem(int var1) {
      this.styleTypeId = var1;
   }

   public StyleElement[] getStyleElements() {
      if (this.styleElements != null && this.styleElements.size() > 0) {
         StyleElement[] var1 = new StyleElement[this.styleElements.size()];
         return (StyleElement[])this.styleElements.values().toArray(var1);
      } else {
         return null;
      }
   }

   public StyleElement get(int var1) {
      return (StyleElement)this.styleElements.get(var1);
   }

   public void put(int var1, StyleElement var2) {
      this.styleElements.put(var1, var2);
   }

   public boolean isValid() {
      return this.styleElements.size() > 0 && this.styleTypeId >= 0;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("styleTypeId:").append(this.styleTypeId).append("\n");
      var1.append("styleElements.size :").append(this.styleElements.size());
      return var1.toString();
   }
}
