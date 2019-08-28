package com.amap.api.mapcore.util;

import android.opengl.GLES20;

public class dv {
   public int d;
   public int e;
   public int f;
   private boolean a;

   public dv() {
   }

   protected boolean a(String var1, String var2) {
      this.d = this.b(var1, var2);
      return this.d != 0;
   }

   protected boolean a(String var1) {
      this.d = this.d(var1);
      return this.d != 0;
   }

   protected int b(String var1) {
      int var2 = GLES20.glGetAttribLocation(this.d, var1);
      if (var2 < 0) {
         ;
      }

      return var2;
   }

   protected int c(String var1) {
      int var2 = GLES20.glGetUniformLocation(this.d, var1);
      if (var2 < 0) {
         ;
      }

      return var2;
   }

   public void a() {
      GLES20.glUseProgram(this.d);
   }

   public int d(String var1) {
      String var2 = "amap_sdk_shaders/" + var1;
      String var3 = ej.a(var2);
      if (var3 == null) {
         throw new IllegalArgumentException("shader file not found: " + var2);
      } else {
         int var4 = var3.indexOf(36);
         if (var4 >= 0 && var3.charAt(var4 + 1) == '$') {
            String var5 = var3.substring(var4 + 2);
            var3 = var3.substring(0, var4);
            int var6 = this.b(var3, var5);
            return var6;
         } else {
            throw new IllegalArgumentException("not a shader file " + var2);
         }
      }
   }

   public int b(String var1, String var2) {
      this.e = this.a(35633, var1);
      this.f = this.a(35632, var2);
      int var3 = GLES20.glCreateProgram();
      GLES20.glAttachShader(var3, this.e);
      GLES20.glAttachShader(var3, this.f);
      GLES20.glLinkProgram(var3);
      return var3;
   }

   public int a(int var1, String var2) {
      int var3 = GLES20.glCreateShader(var1);
      GLES20.glShaderSource(var3, var2);
      GLES20.glCompileShader(var3);
      return var3;
   }

   public void b() {
      if (this.d >= 0) {
         GLES20.glDeleteProgram(this.d);
      }

      if (this.e >= 0) {
         GLES20.glDeleteShader(this.e);
      }

      if (this.f >= 0) {
         GLES20.glDeleteShader(this.f);
      }

      this.a = true;
   }

   public boolean c() {
      return this.a;
   }
}
