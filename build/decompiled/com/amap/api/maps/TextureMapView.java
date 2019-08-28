package com.amap.api.maps;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.amap.api.mapcore.util.fi;
import com.amap.api.mapcore.util.ik;
import com.amap.api.mapcore.util.is;
import com.amap.api.mapcore.util.z;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

public class TextureMapView extends FrameLayout {
   private IMapFragmentDelegate a;
   private AMap b;
   private int c = 0;

   public TextureMapView(Context var1) {
      super(var1);
      this.a(var1);
      this.getMapFragmentDelegate().setContext(var1);
   }

   public TextureMapView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1);
      this.c = var2.getAttributeIntValue(16842972, 0);
      this.getMapFragmentDelegate().setContext(var1);
      this.getMapFragmentDelegate().setVisibility(this.c);
   }

   public TextureMapView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var1);
      this.c = var2.getAttributeIntValue(16842972, 0);
      this.getMapFragmentDelegate().setContext(var1);
      this.getMapFragmentDelegate().setVisibility(this.c);
   }

   public TextureMapView(Context var1, AMapOptions var2) {
      super(var1);
      this.a(var1);
      this.getMapFragmentDelegate().setContext(var1);
      this.getMapFragmentDelegate().setOptions(var2);
   }

   private void a(Context var1) {
      if (var1 != null) {
         is.a().b(var1.getApplicationContext(), fi.e());
      }

   }

   protected IMapFragmentDelegate getMapFragmentDelegate() {
      if (this.a == null) {
         try {
            this.a = (IMapFragmentDelegate)is.a().a(this.getContext(), fi.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", z.class, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(1)});
            if (this.a == null) {
               this.a = (IMapFragmentDelegate)ik.a(this.getContext(), fi.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", z.class, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(1)});
            }
         } catch (Throwable var2) {
            ;
         }

         if (this.a == null) {
            this.a = new z(1);
         }
      }

      return this.a;
   }

   public AMap getMap() {
      IMapFragmentDelegate var1 = this.getMapFragmentDelegate();

      IAMap var2;
      try {
         var2 = var1.getMap();
      } catch (Throwable var4) {
         return null;
      }

      if (var2 == null) {
         return null;
      } else {
         if (this.b == null) {
            this.b = new AMap(var2);
         }

         return this.b;
      }
   }

   public final void onCreate(Bundle var1) {
      try {
         View var2 = this.getMapFragmentDelegate().onCreateView((LayoutInflater)null, (ViewGroup)null, var1);
         LayoutParams var3 = new LayoutParams(-1, -1);
         this.addView(var2, var3);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public final void onResume() {
      try {
         this.getMapFragmentDelegate().onResume();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public final void onPause() {
      try {
         this.getMapFragmentDelegate().onPause();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public final void onDestroy() {
      try {
         IMapFragmentDelegate var1 = this.getMapFragmentDelegate();
         var1.onDestroy();
         this.b = null;
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public final void onLowMemory() {
      try {
         this.getMapFragmentDelegate().onLowMemory();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public final void onSaveInstanceState(Bundle var1) {
      try {
         this.getMapFragmentDelegate().onSaveInstanceState(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setVisibility(int var1) {
      super.setVisibility(var1);
      this.getMapFragmentDelegate().setVisibility(var1);
   }
}
