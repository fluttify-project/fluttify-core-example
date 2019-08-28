package com.amap.api.maps;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.mapcore.util.fi;
import com.amap.api.mapcore.util.ik;
import com.amap.api.mapcore.util.is;
import com.amap.api.mapcore.util.z;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

public class MapFragment extends Fragment {
   private AMap a;
   private IMapFragmentDelegate b;

   public MapFragment() {
      this.a(this.getActivity());
   }

   public static MapFragment newInstance() {
      return newInstance(new AMapOptions());
   }

   public static MapFragment newInstance(AMapOptions var0) {
      MapFragment var1 = new MapFragment();
      Bundle var2 = new Bundle();

      try {
         Parcel var3 = Parcel.obtain();
         var0.writeToParcel(var3, 0);
         var2.putByteArray("MAP_OPTIONS", var3.marshall());
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

      var1.setArguments(var2);
      return var1;
   }

   private void a(Context var1) {
      if (var1 != null) {
         is.a().b(var1.getApplicationContext(), fi.e());
      }

   }

   protected IMapFragmentDelegate getMapFragmentDelegate() {
      if (this.b == null) {
         try {
            this.b = (IMapFragmentDelegate)is.a().a(this.getActivity(), fi.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", z.class, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(0)});
            if (this.b == null) {
               this.b = (IMapFragmentDelegate)ik.a(this.getActivity(), fi.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", z.class, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(0)});
            }
         } catch (Throwable var2) {
            ;
         }

         if (this.b == null) {
            this.b = new z(0);
            this.b.setContext(this.getActivity());
         }
      }

      return this.b;
   }

   public AMap getMap() {
      IMapFragmentDelegate var1 = this.getMapFragmentDelegate();
      if (var1 == null) {
         return null;
      } else {
         IAMap var2;
         try {
            var2 = var1.getMap();
         } catch (Throwable var4) {
            return null;
         }

         if (var2 == null) {
            return null;
         } else {
            if (this.a == null) {
               this.a = new AMap(var2);
            }

            return this.a;
         }
      }
   }

   public void onAttach(Activity var1) {
      super.onAttach(var1);
   }

   public void onInflate(Activity var1, AttributeSet var2, Bundle var3) {
      super.onInflate(var1, var2, var3);

      try {
         this.getMapFragmentDelegate().onInflate(var1, new AMapOptions(), var3);
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);

      try {
         this.getMapFragmentDelegate().onCreate(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      try {
         if (var3 == null) {
            var3 = this.getArguments();
         }

         return this.getMapFragmentDelegate().onCreateView(var1, var2, var3);
      } catch (Throwable var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void onResume() {
      super.onResume();

      try {
         this.getMapFragmentDelegate().onResume();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void onPause() {
      super.onPause();

      try {
         this.getMapFragmentDelegate().onPause();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void onDestroyView() {
      try {
         this.getMapFragmentDelegate().onDestroyView();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

      super.onDestroyView();
   }

   public void onDestroy() {
      try {
         IMapFragmentDelegate var1 = this.getMapFragmentDelegate();
         var1.onDestroy();
         this.a = null;
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

      super.onDestroy();
   }

   public void onLowMemory() {
      super.onLowMemory();

      try {
         this.getMapFragmentDelegate().onLowMemory();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void onSaveInstanceState(Bundle var1) {
      try {
         this.getMapFragmentDelegate().onSaveInstanceState(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      super.onSaveInstanceState(var1);
   }

   public void setArguments(Bundle var1) {
      super.setArguments(var1);
   }

   public void setUserVisibleHint(boolean var1) {
      if (var1) {
         this.getMapFragmentDelegate().setVisibility(0);
      } else {
         this.getMapFragmentDelegate().setVisibility(8);
      }

   }
}
