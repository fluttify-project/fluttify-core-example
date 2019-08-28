package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;

class ai implements x {
   private u b;
   private boolean c = true;
   private boolean d = true;
   private boolean e = true;
   private boolean f = false;
   private boolean g = true;
   private boolean h = true;
   private boolean i = true;
   private boolean j = false;
   private boolean k = true;
   private int l = 0;
   private int m = 1;
   private boolean n = true;
   private boolean o = false;
   private boolean p = false;
   final Handler a = new ai$1(this, Looper.getMainLooper());

   ai(u var1) {
      this.b = var1;
   }

   public boolean isIndoorSwitchEnabled() throws RemoteException {
      return this.n;
   }

   public void setIndoorSwitchEnabled(boolean var1) throws RemoteException {
      this.n = var1;
      this.a.obtainMessage(4).sendToTarget();
   }

   public void setScaleControlsEnabled(boolean var1) throws RemoteException {
      this.j = var1;
      this.a.obtainMessage(1).sendToTarget();
   }

   public void setZoomControlsEnabled(boolean var1) throws RemoteException {
      this.h = var1;
      this.a.obtainMessage(0).sendToTarget();
   }

   public void setCompassEnabled(boolean var1) throws RemoteException {
      this.i = var1;
      this.a.obtainMessage(2).sendToTarget();
   }

   public void setMyLocationButtonEnabled(boolean var1) throws RemoteException {
      this.f = var1;
      this.a.obtainMessage(3).sendToTarget();
   }

   public void setScrollGesturesEnabled(boolean var1) throws RemoteException {
      this.d = var1;
   }

   public void setZoomGesturesEnabled(boolean var1) throws RemoteException {
      this.g = var1;
   }

   public void setTiltGesturesEnabled(boolean var1) throws RemoteException {
      this.e = var1;
   }

   public void setRotateGesturesEnabled(boolean var1) throws RemoteException {
      this.c = var1;
   }

   public void setAllGesturesEnabled(boolean var1) throws RemoteException {
      this.setRotateGesturesEnabled(var1);
      this.setTiltGesturesEnabled(var1);
      this.setZoomGesturesEnabled(var1);
      this.setScrollGesturesEnabled(var1);
   }

   public void setLogoPosition(int var1) throws RemoteException {
      this.l = var1;
      this.b.i(var1);
   }

   public void setZoomPosition(int var1) throws RemoteException {
      this.m = var1;
      this.b.g(var1);
   }

   public boolean isScaleControlsEnabled() throws RemoteException {
      return this.j;
   }

   public boolean isZoomControlsEnabled() throws RemoteException {
      return this.h;
   }

   public boolean isCompassEnabled() throws RemoteException {
      return this.i;
   }

   public boolean isMyLocationButtonEnabled() throws RemoteException {
      return this.f;
   }

   public boolean isScrollGesturesEnabled() throws RemoteException {
      return this.d;
   }

   public boolean isZoomGesturesEnabled() throws RemoteException {
      return this.g;
   }

   public boolean isTiltGesturesEnabled() throws RemoteException {
      return this.e;
   }

   public boolean isRotateGesturesEnabled() throws RemoteException {
      return this.c;
   }

   public int getLogoPosition() throws RemoteException {
      return this.l;
   }

   public int getZoomPosition() throws RemoteException {
      return this.m;
   }

   public void setZoomInByScreenCenter(boolean var1) {
      this.o = var1;
   }

   public boolean isZoomInByScreenCenter() {
      return this.o;
   }

   public void setLogoBottomMargin(int var1) {
      this.b.j(var1);
   }

   public void setLogoLeftMargin(int var1) {
      this.b.k(var1);
   }

   public float getLogoMarginRate(int var1) {
      return this.b.l(var1);
   }

   public void setLogoMarginRate(int var1, float var2) {
      this.b.a(var1, var2);
   }

   public void setGestureScaleByMapCenter(boolean var1) throws RemoteException {
      this.p = var1;
   }

   public boolean isGestureScaleByMapCenter() throws RemoteException {
      return this.p;
   }

   public void setLogoEnable(boolean var1) {
      this.k = var1;
      this.a.obtainMessage(5).sendToTarget();
   }

   public void requestRefreshLogo() {
      this.a.obtainMessage(6).sendToTarget();
   }

   public boolean isLogoEnable() {
      return this.k;
   }
}
