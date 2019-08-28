package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.ae.gmap.listener.AMapWidgetListener;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import com.autonavi.amap.mapcore.message.AbstractGestureMapMessage;

public interface u extends IAMap {
   void b();

   GLMapState c();

   int d();

   int f(int var1);

   int e();

   void a(Location var1) throws RemoteException;

   boolean a(String var1) throws RemoteException;

   void f();

   void a(double var1, double var3, IPoint var5);

   void a(int var1, int var2, FPoint var3);

   void a(int var1, int var2, DPoint var3);

   float g();

   x h();

   void a(int var1, MotionEvent var2);

   boolean c(int var1, MotionEvent var2);

   boolean b(int var1, MotionEvent var2);

   void a(m var1) throws RemoteException;

   void i();

   void a(double var1, double var3, FPoint var5);

   void b(int var1, int var2, DPoint var3);

   void b(double var1, double var3, IPoint var5);

   void a(int var1, int var2, IPoint var3);

   void j();

   void a(boolean var1);

   void b(boolean var1);

   void c(boolean var1);

   void d(boolean var1);

   void e(boolean var1);

   void g(int var1);

   LatLngBounds a(LatLng var1, float var2, float var3, float var4);

   void a(int var1, int var2, PointF var3);

   void a(float var1, float var2, IPoint var3);

   float h(int var1);

   boolean k();

   Point l();

   float t();

   View m();

   boolean n();

   void a(ad var1);

   void c(String var1);

   ad a(BitmapDescriptor var1);

   ad a(BitmapDescriptor var1, boolean var2);

   int a(IMarkerAction var1, Rect var2);

   void i(int var1);

   void j(int var1);

   void k(int var1);

   float l(int var1);

   void a(int var1, float var2);

   int o();

   void a(AbstractCameraUpdateMessage var1) throws RemoteException;

   void b(AbstractCameraUpdateMessage var1) throws RemoteException;

   Context v();

   int a(EAMapPlatformGestureInfo var1);

   GLMapEngine a();

   void a(int var1, AbstractGestureMapMessage var2);

   void a(int var1, int var2);

   boolean e(int var1);

   float n(int var1);

   void a(int var1, IPoint var2);

   float a(int var1);

   boolean d(int var1);

   float o(int var1);

   void c(int var1);

   void a(AMapWidgetListener var1);

   float[] x();

   String d(String var1);

   void h(boolean var1);

   dv u(int var1);

   dw y();

   void b(int var1, int var2);

   void i(boolean var1);

   void a(String var1, boolean var2, int var3);

   void z();

   void q();

   void a(boolean var1, byte[] var2);

   void a(boolean var1, boolean var2);

   void w();

   boolean b(String var1);

   float v(int var1);
}
