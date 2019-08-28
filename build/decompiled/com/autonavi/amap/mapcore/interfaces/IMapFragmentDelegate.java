package com.autonavi.amap.mapcore.interfaces;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.maps.AMapOptions;

public interface IMapFragmentDelegate {
   IAMap getMap() throws RemoteException;

   void onInflate(Activity var1, AMapOptions var2, Bundle var3) throws RemoteException;

   void setContext(Context var1);

   void setOptions(AMapOptions var1);

   void onCreate(Bundle var1) throws RemoteException;

   View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) throws RemoteException;

   void onResume() throws RemoteException;

   void onPause() throws RemoteException;

   void onDestroyView() throws RemoteException;

   void onDestroy() throws RemoteException;

   void onLowMemory() throws RemoteException;

   void onSaveInstanceState(Bundle var1) throws RemoteException;

   boolean isReady() throws RemoteException;

   void setVisibility(int var1);
}
