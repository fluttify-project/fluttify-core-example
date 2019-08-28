package com.amap.api.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
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

public class SupportMapFragment extends Fragment {
   private AMap a;
   private IMapFragmentDelegate b;

   public SupportMapFragment() {
      this.a(this.getActivity());
   }

   public static SupportMapFragment newInstance() {
      return newInstance(new AMapOptions());
   }

   public static SupportMapFragment newInstance(AMapOptions var0) {
      SupportMapFragment var1 = new SupportMapFragment();
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

   protected IMapFragmentDelegate getMapFragmentDelegate(Context var1) {
      if (this.b == null) {
         try {
            this.b = (IMapFragmentDelegate)is.a().a(var1, fi.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", z.class, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(0)});
            if (this.b == null) {
               this.b = (IMapFragmentDelegate)ik.a(var1, fi.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", z.class, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(0)});
            }
         } catch (Throwable var3) {
            ;
         }

         if (this.b == null) {
            this.b = new z(0);
            this.b.setContext(var1);
         }
      }

      return this.b;
   }

   private IMapFragmentDelegate a() {
      return this.getMapFragmentDelegate(this.getActivity());
   }

   public AMap getMap() {
      IMapFragmentDelegate var1 = this.a();
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
         this.getMapFragmentDelegate(var1).onInflate(var1, new AMapOptions(), var3);
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      try {
         if (var3 == null) {
            var3 = this.getArguments();
         }

         return this.a().onCreateView(var1, var2, var3);
      } catch (Throwable var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void onResume() {
      super.onResume();

      try {
         this.a().onResume();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void onPause() {
      super.onPause();

      try {
         this.a().onPause();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void onDestroyView() {
      try {
         this.a().onDestroyView();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

      super.onDestroyView();
   }

   public void onDestroy() {
      try {
         this.a().onDestroy();
         this.a = null;
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

      super.onDestroy();
   }

   public void onLowMemory() {
      super.onLowMemory();

      try {
         this.a().onLowMemory();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void onSaveInstanceState(Bundle var1) {
      try {
         this.a().onSaveInstanceState(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      super.onSaveInstanceState(var1);
   }

   public void setArguments(Bundle var1) {
      super.setArguments(var1);
   }

   public void setUserVisibleHint(boolean var1) {
      super.setUserVisibleHint(var1);
      if (var1) {
         this.a().setVisibility(0);
      } else {
         this.a().setVisibility(8);
      }

   }
}
