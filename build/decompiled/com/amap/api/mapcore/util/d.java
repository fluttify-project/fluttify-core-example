package com.amap.api.mapcore.util;

import android.content.Context;
import android.opengl.GLSurfaceView.Renderer;
import android.util.AttributeSet;
import android.view.SurfaceHolder;

public class d implements v {
   private u b;
   protected boolean a;

   public d(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public d(Context var1, AttributeSet var2) {
      this.b = null;
      this.a = false;
      this.b = new c(this, var1, var2);
   }

   public u a() {
      return this.b;
   }

   public void queueEvent(Runnable var1) {
      if (var1 != null) {
         var1.run();
      }

   }

   public boolean isEnabled() {
      return this.b != null;
   }

   public void setVisibility(int var1) {
   }

   public void requestRender() {
   }

   public int getRenderMode() {
      return 0;
   }

   public boolean postDelayed(Runnable var1, long var2) {
      return false;
   }

   public boolean post(Runnable var1) {
      return false;
   }

   public SurfaceHolder getHolder() {
      return null;
   }

   public void a(eo var1) {
   }

   public void a(ep var1) {
   }

   public void b() {
   }

   public void setRenderer(Renderer var1) {
   }

   public int getWidth() {
      return 0;
   }

   public int getHeight() {
      return 0;
   }

   public void setRenderMode(int var1) {
   }
}
