package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.style.StyleItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class eg {
   private Map<Integer, StyleItem> a = new ConcurrentHashMap();
   private Object b = null;
   private StyleItem[] c;

   public eg() {
   }

   public Map<Integer, StyleItem> a() {
      return this.a;
   }

   public StyleItem[] b() {
      if (this.a != null && this.a.size() != 0) {
         ArrayList var1 = new ArrayList();
         Iterator var2 = this.a.values().iterator();

         while(var2.hasNext()) {
            StyleItem var3 = (StyleItem)var2.next();
            if (var3.isValid()) {
               var1.add(var3);
            }
         }

         int var4 = var1.size();
         if (var4 > 0) {
            this.c = (StyleItem[])var1.toArray(new StyleItem[var4]);
            return this.c;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public StyleItem[] c() {
      return this.c;
   }

   public Object d() {
      return this.b;
   }
}
