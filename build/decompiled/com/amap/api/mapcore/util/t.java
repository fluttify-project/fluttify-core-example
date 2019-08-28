package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;

public class t {
   private int a = -1;
   private int b = -1;
   private int c = -1;
   private int d = 0;
   private Bitmap e = null;
   private Bitmap f = null;
   private Bitmap g = null;

   public t() {
   }

   public void a(Context var1) {
      if (this.e == null || this.e.isRecycled()) {
         this.e = fi.a(var1, "amap_sdk_lineTexture.png");
      }

      if (this.f == null || this.f.isRecycled()) {
         this.f = fi.a(var1, "amap_sdk_lineDashTexture_square.png");
      }

      if (this.g == null || this.g.isRecycled()) {
         this.g = fi.a(var1, "amap_sdk_lineDashTexture_circle.png");
      }

      this.a = fi.a(this.e);
      this.b = fi.a(this.f, true);
      this.c = fi.a(this.g, true);
      this.d = fi.a(512, 1024);
   }

   public int a() {
      return this.a;
   }

   public int a(int var1) {
      if (var1 == 0) {
         return this.b;
      } else {
         return var1 == 1 ? this.c : -1;
      }
   }

   public int b() {
      return this.d;
   }

   public void c() {
      GLES20.glDeleteTextures(3, new int[]{this.a, this.b, this.c, this.d}, 0);
   }

   public void d() {
      if (this.f != null && !this.f.isRecycled()) {
         this.f.recycle();
         this.f = null;
      }

      if (this.g != null && !this.g.isRecycled()) {
         this.g.recycle();
         this.g = null;
      }

      if (this.e != null && !this.e.isRecycled()) {
         this.e.recycle();
         this.e = null;
      }

   }
}
