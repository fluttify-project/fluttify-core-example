package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import com.amap.api.maps.AMap$OnMapScreenShotListener;
import com.amap.api.maps.AMap$onMapPrintScreenListener;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Poi;
import com.autonavi.amap.mapcore.DPoint;

class c$1 extends Handler {
   c$1(c var1, Looper var2) {
      super(var2);
      this.a = var1;
   }

   public void handleMessage(Message var1) {
      if (var1 != null && !c.a(this.a)) {
         try {
            CameraPosition var13;
            switch(var1.what) {
            case 2:
               StringBuilder var14 = new StringBuilder();
               var14.append("Key验证失败：[");
               if (var1.obj != null) {
                  var14.append(var1.obj);
               } else {
                  var14.append(gv.b);
               }

               var14.append("]");
               Log.w("amapsdk", var14.toString());
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
               break;
            case 10:
               var13 = (CameraPosition)var1.obj;
               if (var13 != null && c.b(this.a) != null) {
                  c.b(this.a).onCameraChange(var13);
               }
               break;
            case 11:
               try {
                  var13 = this.a.getCameraPosition();
                  if (var13 != null && c.d(this.a) != null) {
                     c.d(this.a).a(var13);
                  }

                  c.a(this.a, var13);
                  if (c.h(this.a)) {
                     c.a(this.a, false);
                     if (c.i(this.a) != null && !MapsInitializer.isTileOverlayClosed()) {
                        c.i(this.a).b(false);
                     }

                     this.a.g(true);
                  }

                  if (c.j(this.a)) {
                     this.a.j();
                     c.b(this.a, false);
                  }

                  this.a.a(true, var13);
               } catch (Throwable var8) {
                  ht.c(var8, "AMapDelegateImp", "CameraUpdateFinish");
               }
               break;
            case 12:
               if (c.d(this.a) != null) {
                  c.d(this.a).a(this.a.g());
               }
               break;
            case 13:
               if (c.d(this.a) != null) {
                  c.d(this.a).m();
               }
               break;
            case 14:
               try {
                  if (c.e(this.a) != null) {
                     c.e(this.a).onTouch((MotionEvent)var1.obj);
                  }
               } catch (Throwable var9) {
                  ht.c(var9, "AMapDelegateImp", "onTouchHandler");
                  var9.printStackTrace();
               }
               break;
            case 15:
               Bitmap var12 = (Bitmap)var1.obj;
               int var3 = var1.arg1;
               if (var12 != null && c.d(this.a) != null) {
                  Canvas var4 = new Canvas(var12);
                  fy var5 = c.d(this.a).i();
                  if (var5 != null) {
                     var5.onDraw(var4);
                  }

                  c.d(this.a).a(var4);
                  if (c.f(this.a) != null) {
                     c.f(this.a).onMapPrint(new BitmapDrawable(this.a.f.getResources(), var12));
                  }

                  if (c.g(this.a) != null) {
                     c.g(this.a).onMapScreenShot(var12);
                     c.g(this.a).onMapScreenShot(var12, var3);
                  }
               } else {
                  if (c.f(this.a) != null) {
                     c.f(this.a).onMapPrint((Drawable)null);
                  }

                  if (c.g(this.a) != null) {
                     c.g(this.a).onMapScreenShot((Bitmap)null);
                     c.g(this.a).onMapScreenShot((Bitmap)null, var3);
                  }
               }

               c.a((c)this.a, (AMap$onMapPrintScreenListener)null);
               c.a((c)this.a, (AMap$OnMapScreenShotListener)null);
               break;
            case 16:
               if (c.c(this.a) != null) {
                  try {
                     c.c(this.a).onMapLoaded();
                  } catch (Throwable var10) {
                     ht.c(var10, "AMapDelegateImp", "onMapLoaded");
                     var10.printStackTrace();
                  }
               }

               if (c.d(this.a) != null) {
                  c.d(this.a).n();
               }
               break;
            case 17:
               if (this.a.g.isInMapAnimation(1) && c.i(this.a) != null && !MapsInitializer.isTileOverlayClosed()) {
                  c.i(this.a).b(false);
               }

               if (c.i(this.a) != null && !MapsInitializer.isTileOverlayClosed()) {
                  c.i(this.a).a(var1.arg1 != 0);
               }
               break;
            case 18:
               if (c.m(this.a) != null && c.n(this.a)) {
                  c.m(this.a).c();
               }
               break;
            case 19:
               if (c.l(this.a) != null) {
                  DPoint var2 = DPoint.obtain();
                  this.a.b(var1.arg1, var1.arg2, var2);

                  try {
                     c.l(this.a).onMapClick(new LatLng(var2.y, var2.x));
                     var2.recycle();
                  } catch (Throwable var6) {
                     ht.c(var6, "AMapDelegateImp", "OnMapClickListener.onMapClick");
                     var6.printStackTrace();
                  }
               }
               break;
            case 20:
               try {
                  c.k(this.a).onPOIClick((Poi)var1.obj);
               } catch (Throwable var7) {
                  ht.c(var7, "AMapDelegateImp", "OnPOIClickListener.onPOIClick");
                  var7.printStackTrace();
               }
            }
         } catch (Throwable var11) {
            ht.c(var11, "AMapDelegateImp", "handleMessage");
            var11.printStackTrace();
         }

      }
   }
}
