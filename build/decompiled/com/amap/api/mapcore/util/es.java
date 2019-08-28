package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.model.LatLng;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;

public class es {
   private static boolean a = false;
   private Hashtable<String, String> b = new Hashtable();
   private WeakReference<Context> c = null;
   private static volatile es d;

   private es() {
   }

   public static es a() {
      if (d == null) {
         Class var0 = es.class;
         synchronized(es.class) {
            if (d == null) {
               d = new es();
            }
         }
      }

      return d;
   }

   public static void b() {
      if (d != null) {
         if (d.b != null && d.b.size() > 0) {
            Hashtable var0 = d.b;
            synchronized(d.b) {
               d.c();
               if (d.c != null) {
                  d.c.clear();
               }
            }
         }

         d = null;
      }

      a(false);
   }

   public static void a(boolean var0) {
      a = var0;
   }

   public static void a(int var0) {
      if (a) {
         a(var0 < 1000);
      }

   }

   public void a(Context var1) {
      if (var1 != null) {
         this.c = new WeakReference(var1);
      }

   }

   public void a(LatLng var1, String var2, String var3) {
      if (!a) {
         this.b.clear();
      } else {
         if (var1 != null && !TextUtils.isEmpty(var2)) {
            StringBuffer var4 = new StringBuffer();
            var4.append("{");
            var4.append("\"lon\":").append(var1.longitude).append(",");
            var4.append("\"lat\":").append(var1.latitude).append(",");
            var4.append("\"title\":").append("\"").append(var2).append("\"").append(",");
            if (TextUtils.isEmpty(var3)) {
               var3 = "";
            }

            var4.append("\"snippet\":").append("\"").append(var3).append("\"");
            var4.append("}");
            this.a(var4.toString());
         }

      }
   }

   private void a(String var1) {
      if (var1 != null && this.b != null) {
         Hashtable var2 = this.b;
         synchronized(this.b) {
            String var3 = hc.b(var1);
            if (this.b != null && !this.b.contains(var3)) {
               this.b.put(var3, var1);
            }

            if (this.d()) {
               this.c();
            }
         }
      }

   }

   private void c() {
      if (!a) {
         this.b.clear();
      } else {
         if (this.b != null) {
            StringBuffer var1 = new StringBuffer();
            int var2 = 0;
            int var3 = this.b.size();
            if (var3 > 0) {
               var1.append("[");
               Iterator var4 = this.b.values().iterator();

               while(var4.hasNext()) {
                  String var5 = (String)var4.next();
                  ++var2;
                  var1.append(var5);
                  if (var2 < var3) {
                     var1.append(",");
                  }
               }

               var1.append("]");
               String var6 = var1.toString();
               if (!TextUtils.isEmpty(var6) && this.c != null && this.c.get() != null) {
                  jp.a(var6, (Context)this.c.get());
               }
            }

            this.b.clear();
         }

      }
   }

   private boolean d() {
      if (this.b != null) {
         return this.b.size() > 20;
      } else {
         return false;
      }
   }
}
