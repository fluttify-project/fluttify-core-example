package com.amap.api.mapcore.util;

import android.opengl.GLSurfaceView.Renderer;
import android.view.SurfaceHolder;

public interface v {
   void setRenderer(Renderer var1);

   int getWidth();

   int getHeight();

   void setRenderMode(int var1);

   void queueEvent(Runnable var1);

   boolean isEnabled();

   void setVisibility(int var1);

   void requestRender();

   int getRenderMode();

   boolean postDelayed(Runnable var1, long var2);

   boolean post(Runnable var1);

   SurfaceHolder getHolder();

   void a(eo var1);

   void a(ep var1);

   void b();
}
