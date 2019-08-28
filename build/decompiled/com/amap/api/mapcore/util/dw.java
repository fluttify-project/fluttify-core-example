package com.amap.api.mapcore.util;

import com.autonavi.amap.mapcore.gles.AMapNativeGLShaderManager;

public class dw {
   private dw$d a;
   private dw$f b;
   private dw$c c;
   private dw$e d;
   private dw$a e;
   private dw$b f;
   private long g = 0L;

   public dw() {
      this.g = AMapNativeGLShaderManager.nativeCreateGLShaderManager();
   }

   public long a() {
      return this.g;
   }

   private synchronized dv c() {
      if (this.a == null) {
         this.a = new dw$d("texture_normal.glsl");
      }

      return this.a;
   }

   private synchronized dv d() {
      if (this.b == null) {
         this.b = new dw$f("texture.glsl");
      }

      return this.b;
   }

   private synchronized dv e() {
      if (this.c == null) {
         this.c = new dw$c("texture_layer.glsl");
      }

      return this.c;
   }

   private synchronized dv f() {
      if (this.d == null) {
         this.d = new dw$e("point.glsl");
      }

      return this.d;
   }

   private synchronized dw$a g() {
      if (this.e == null) {
         this.e = new dw$a();
      }

      return this.e;
   }

   public dv a(int var1) {
      switch(var1) {
      case 0:
         return this.d();
      case 1:
         return this.c();
      case 2:
         return this.e();
      case 3:
         return this.f();
      case 4:
         return this.g();
      case 5:
         return this.h();
      default:
         return null;
      }
   }

   private synchronized dv h() {
      if (this.f == null) {
         this.f = new dw$b();
      }

      return this.f;
   }

   public synchronized void b() {
      if (this.a != null) {
         this.a.b();
         this.a = null;
      }

      if (this.b != null) {
         this.b.b();
         this.b = null;
      }

      if (this.c != null) {
         this.c.b();
         this.c = null;
      }

      if (this.d != null) {
         this.d.b();
         this.d = null;
      }

      if (this.g != 0L) {
         AMapNativeGLShaderManager.nativeDestroyGLShaderManager(this.g);
         this.g = 0L;
      }

   }
}
