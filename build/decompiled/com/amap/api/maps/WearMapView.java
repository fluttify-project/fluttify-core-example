package com.amap.api.maps;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import com.amap.api.mapcore.util.fi;
import com.amap.api.mapcore.util.ik;
import com.amap.api.mapcore.util.is;
import com.amap.api.mapcore.util.z;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

@TargetApi(20)
public class WearMapView extends ViewGroup {
   private final String a = WearMapView.class.getSimpleName();
   private IMapFragmentDelegate b;
   private AMap c;
   private View d;
   private SwipeDismissView e;
   private static int f = 0;
   private static int g = 0;
   private int h = 0;

   public WearMapView(Context var1) {
      super(var1);
      this.getMapFragmentDelegate().setContext(var1);
      this.a(var1);
      this.b(var1);
      this.c(var1);
   }

   public WearMapView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1);
      this.h = var2.getAttributeIntValue(16842972, 0);
      this.getMapFragmentDelegate().setContext(var1);
      this.getMapFragmentDelegate().setVisibility(this.h);
      this.b(var1);
      this.c(var1);
   }

   public WearMapView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var1);
      this.h = var2.getAttributeIntValue(16842972, 0);
      this.getMapFragmentDelegate().setContext(var1);
      this.getMapFragmentDelegate().setVisibility(this.h);
      this.b(var1);
      this.c(var1);
   }

   public WearMapView(Context var1, AMapOptions var2) {
      super(var1);
      this.a(var1);
      this.getMapFragmentDelegate().setContext(var1);
      this.getMapFragmentDelegate().setOptions(var2);
      this.b(var1);
      this.c(var1);
   }

   private void a(Context var1) {
      if (var1 != null) {
         is.a().b(var1.getApplicationContext(), fi.e());
      }

   }

   protected IMapFragmentDelegate getMapFragmentDelegate() {
      if (this.b == null) {
         try {
            this.b = (IMapFragmentDelegate)is.a().a(this.getContext(), fi.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", z.class, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(1)});
            if (this.b == null) {
               this.b = (IMapFragmentDelegate)ik.a(this.getContext(), fi.e(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", z.class, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(1)});
            }
         } catch (Throwable var2) {
            ;
         }

         if (this.b == null) {
            this.b = new z(1);
         }
      }

      return this.b;
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
         if (this.c == null) {
            this.c = new AMap(var2);
         }

         return this.c;
      }
   }

   public final void onCreate(Bundle var1) {
      try {
         this.d = this.getMapFragmentDelegate().onCreateView((LayoutInflater)null, (ViewGroup)null, var1);
         LayoutParams var2 = new LayoutParams(-1, -1);
         this.addView(this.d, 0, var2);
      } catch (Throwable var3) {
         var3.printStackTrace();
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

   public void setLayerType(int var1, Paint var2) {
   }

   public void setVisibility(int var1) {
      super.setVisibility(var1);
      this.getMapFragmentDelegate().setVisibility(var1);
   }

   private void b(Context var1) {
      WindowManager var2 = (WindowManager)var1.getSystemService("window");
      Display var3 = null;
      if (var2 != null) {
         var3 = var2.getDefaultDisplay();
         Point var4 = new Point();
         if (var3 != null) {
            var3.getSize(var4);
         }

         f = var4.x;
         g = var4.y;
      }

   }

   private void c(Context var1) {
      this.e = new SwipeDismissView(var1, this);
      int var2 = (int)(var1.getResources().getDisplayMetrics().density * 30.0F + 0.5F);
      LayoutParams var3 = new LayoutParams(var2, g);
      this.e.setBackgroundColor(Color.argb(0, 0, 0, 0));
      this.setBackgroundColor(Color.argb(0, 0, 0, 0));
      this.addView(this.e, var3);
   }

   public void setOnDismissCallbackListener(WearMapView$OnDismissCallback var1) {
      if (this.e != null) {
         this.e.setCallback(var1);
      }

   }

   protected void onMeasure(int var1, int var2) {
      int var3 = this.getChildCount();

      for(int var4 = 0; var4 < var3; ++var4) {
         View var5 = this.getChildAt(var4);
         if (var5 instanceof SwipeDismissView) {
            SwipeDismissView var6 = (SwipeDismissView)var5;
            var5.measure(var6.getLayoutParams().width, var6.getLayoutParams().height);
         } else {
            var5.measure(var1, var2);
         }
      }

      super.onMeasure(var1, var2);
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      int var6 = this.getChildCount();

      for(int var9 = 0; var9 < var6; ++var9) {
         View var10 = this.getChildAt(var9);
         if (var10 == this.d) {
            var10.layout(0, 0, this.getWidth(), this.getHeight());
         } else if (var10 == this.e) {
            this.a((View)this.e);
            int var7 = this.e.getMeasuredWidth();
            this.e.layout(0, 0, var7, var4);
         }
      }

   }

   private void a(View var1) {
      LayoutParams var2 = var1.getLayoutParams();
      if (var2 == null) {
         var2 = new LayoutParams(-2, -2);
      }

      int var3 = var2.width;
      int var4;
      if (var3 > 0) {
         var4 = MeasureSpec.makeMeasureSpec(var3, 1073741824);
      } else {
         var4 = MeasureSpec.makeMeasureSpec(0, 0);
      }

      int var5 = var2.height;
      int var6;
      if (var5 > 0) {
         var6 = MeasureSpec.makeMeasureSpec(var5, 1073741824);
      } else {
         var6 = MeasureSpec.makeMeasureSpec(0, 0);
      }

      var1.measure(var4, var6);
   }

   public void onDismiss() {
      this.removeAllViews();
   }

   public void onEnterAmbient(Bundle var1) {
      this.onResume();
   }

   public void onExitAmbient() {
      this.onPause();
   }
}
