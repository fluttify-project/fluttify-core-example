package com.amap.api.mapcore.util;

import android.content.Context;
import android.opengl.GLES20;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.GL3DModelOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p {
   private long a = 0L;
   private Context b;
   private u c;
   private List<cx> d = new ArrayList();
   private List<Integer> e = new ArrayList();

   public p(Context var1, u var2) {
      this.b = var1;
      this.c = var2;
   }

   public GL3DModel a(GL3DModelOptions var1) {
      if (var1 == null) {
         return null;
      } else {
         cx var2 = new cx(this, var1, this.c);
         var2.a("model_" + this.a++);
         List var3 = this.d;
         synchronized(this.d) {
            this.d.add(var2);
            return new GL3DModel(var2);
         }
      }
   }

   public void a() {
      Iterator var1 = this.d.iterator();

      while(var1.hasNext()) {
         cx var2 = (cx)var1.next();
         if (var2.isVisible()) {
            var2.j();
         }
      }

   }

   public void b() {
      if (this.d != null) {
         this.d.clear();
      }

   }

   public void c() {
      if (this.d != null) {
         Iterator var1 = this.d.iterator();

         while(var1.hasNext()) {
            cx var2 = (cx)var1.next();
            var2.destroy();
         }

         this.d.clear();
      }

   }

   public void d() {
      if (this.e != null) {
         Iterator var1 = this.e.iterator();

         while(var1.hasNext()) {
            Integer var2 = (Integer)var1.next();
            GLES20.glDeleteTextures(1, new int[]{var2.intValue()}, 0);
         }
      }

   }

   public void a(String var1) {
      try {
         if (this.d != null && this.d.size() > 0) {
            cx var2 = null;

            for(int var3 = 0; var3 < this.d.size(); ++var3) {
               var2 = (cx)this.d.get(var3);
               if (var1.equals(var2.getId())) {
                  break;
               }
            }

            if (var2 != null) {
               this.d.remove(var2);
               var2.destroy();
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public void a(int var1) {
      this.e.add(var1);
   }
}
