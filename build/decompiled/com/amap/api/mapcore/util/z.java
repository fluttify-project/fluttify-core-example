package com.amap.api.mapcore.util;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.maps.AMapOptions;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.CameraPosition;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

public class z implements IMapFragmentDelegate {
   private IAMap c;
   public static volatile Context a;
   public int b = 0;
   private int d = 0;
   private AMapOptions e;

   public z(int var1) {
      this.d = var1 % 3;
   }

   public void setContext(Context var1) {
      a(var1);
   }

   private static void a(Context var0) {
      if (var0 != null) {
         a = var0.getApplicationContext();
      }

   }

   public void setOptions(AMapOptions var1) {
      this.e = var1;
   }

   public IAMap getMap() throws RemoteException {
      if (this.c == null) {
         if (a == null) {
            Log.w("MapFragmentDelegateImp", "Context 为 null 请在地图调用之前 使用 MapsInitializer.initialize(Context paramContext) 来设置Context");
            return null;
         }

         int var1 = a.getResources().getDisplayMetrics().densityDpi;
         if (var1 <= 120) {
            n.a = 0.5F;
         } else if (var1 <= 160) {
            n.a = 0.8F;
         } else if (var1 <= 240) {
            n.a = 0.87F;
         } else if (var1 <= 320) {
            n.a = 1.0F;
         } else if (var1 <= 480) {
            n.a = 1.5F;
         } else if (var1 <= 640) {
            n.a = 1.8F;
         } else {
            n.a = 0.9F;
         }

         if (this.d == 0) {
            this.c = (new e(a)).a();
         } else if (this.d == 1) {
            this.c = (new f(a)).a();
         } else {
            this.c = (new d(a)).a();
         }
      }

      return this.c;
   }

   public void onInflate(Activity var1, AMapOptions var2, Bundle var3) throws RemoteException {
      this.setContext(var1.getApplicationContext());
      this.e = var2;
   }

   public void onCreate(Bundle var1) throws RemoteException {
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) throws RemoteException {
      if (a == null && var1 != null) {
         this.setContext(var1.getContext().getApplicationContext());
      }

      try {
         this.c = this.getMap();
         this.c.setVisibilityEx(this.b);
         if (this.e == null && var3 != null) {
            byte[] var4 = var3.getByteArray("MAP_OPTIONS");
            if (var4 != null) {
               Parcel var5 = Parcel.obtain();
               var5.unmarshall(var4, 0, var4.length);
               var5.setDataPosition(0);
               this.e = AMapOptions.CREATOR.createFromParcel(var5);
            }
         }

         this.a(this.e);
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

      return this.c.getView();
   }

   void a(AMapOptions var1) throws RemoteException {
      if (var1 != null && this.c != null) {
         CameraPosition var2 = var1.getCamera();
         if (var2 != null) {
            this.c.moveCamera(CameraUpdateFactory.newCameraPosition(var2));
         }

         UiSettings var3 = this.c.getAMapUiSettings();
         var3.setRotateGesturesEnabled(var1.getRotateGesturesEnabled());
         var3.setScrollGesturesEnabled(var1.getScrollGesturesEnabled());
         var3.setTiltGesturesEnabled(var1.getTiltGesturesEnabled());
         var3.setZoomControlsEnabled(var1.getZoomControlsEnabled());
         var3.setZoomGesturesEnabled(var1.getZoomGesturesEnabled());
         var3.setCompassEnabled(var1.getCompassEnabled());
         var3.setScaleControlsEnabled(var1.getScaleControlsEnabled());
         var3.setLogoPosition(var1.getLogoPosition());
         this.c.setMapType(var1.getMapType());
         this.c.setZOrderOnTop(var1.getZOrderOnTop());
      }

   }

   public void onResume() throws RemoteException {
      if (this.c != null) {
         this.c.onActivityResume();
      }

   }

   public void onPause() throws RemoteException {
      if (this.c != null) {
         this.c.onActivityPause();
      }

   }

   public void onDestroyView() throws RemoteException {
   }

   public void onDestroy() throws RemoteException {
      if (this.c != null) {
         this.c.clear();
         this.c.destroy();
         this.c = null;
      }

   }

   public void onLowMemory() throws RemoteException {
      Log.d("onLowMemory", "onLowMemory run");
   }

   public void onSaveInstanceState(Bundle var1) throws RemoteException {
      if (this.c != null) {
         if (this.e == null) {
            this.e = new AMapOptions();
         }

         try {
            Parcel var2 = Parcel.obtain();
            this.e = this.e.camera(this.getMap().getCameraPosition());
            this.e.writeToParcel(var2, 0);
            var1.putByteArray("MAP_OPTIONS", var2.marshall());
         } catch (Throwable var3) {
            ;
         }
      }

   }

   public boolean isReady() throws RemoteException {
      return false;
   }

   public void setVisibility(int var1) {
      this.b = var1;
      if (this.c != null) {
         this.c.setVisibilityEx(var1);
      }

   }
}
