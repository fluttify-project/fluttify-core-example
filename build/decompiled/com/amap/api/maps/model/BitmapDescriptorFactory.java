package com.amap.api.maps.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.amap.api.mapcore.util.er$a;
import com.amap.api.mapcore.util.fi;
import com.amap.api.mapcore.util.z;
import java.io.FileInputStream;
import java.io.InputStream;

public final class BitmapDescriptorFactory {
   private static final String ICON_ID_PREFIX = "com.amap.api.icon_";
   private static int nextId = 0;
   public static final float HUE_RED = 0.0F;
   public static final float HUE_ORANGE = 30.0F;
   public static final float HUE_YELLOW = 60.0F;
   public static final float HUE_GREEN = 120.0F;
   public static final float HUE_CYAN = 180.0F;
   public static final float HUE_AZURE = 210.0F;
   public static final float HUE_BLUE = 240.0F;
   public static final float HUE_VIOLET = 270.0F;
   public static final float HUE_MAGENTA = 300.0F;
   public static final float HUE_ROSE = 330.0F;

   public BitmapDescriptorFactory() {
   }

   public static BitmapDescriptor fromResource(int var0) {
      try {
         Context var1 = getContext();
         if (var1 != null) {
            InputStream var2 = var1.getResources().openRawResource(var0);
            Bitmap var3 = BitmapFactory.decodeStream(var2);
            BitmapDescriptor var4 = fromBitmap(var3);
            return var4;
         } else {
            return null;
         }
      } catch (Throwable var5) {
         return null;
      }
   }

   public static BitmapDescriptor fromView(View var0) {
      try {
         Context var1 = getContext();
         if (var1 != null) {
            FrameLayout var2 = new FrameLayout(var1);
            var2.addView(var0);
            var2.setDrawingCacheEnabled(true);
            Bitmap var3 = fi.a((View)var2);
            BitmapDescriptor var4 = fromBitmap(var3);
            return var4;
         } else {
            return null;
         }
      } catch (Throwable var5) {
         return null;
      }
   }

   public static BitmapDescriptor fromPath(String var0) {
      try {
         Bitmap var1 = BitmapFactory.decodeFile(var0);
         BitmapDescriptor var2 = fromBitmap(var1);
         return var2;
      } catch (Throwable var3) {
         return null;
      }
   }

   public static BitmapDescriptor fromAsset(String var0) {
      try {
         Context var1 = getContext();
         if (var1 != null) {
            return fromBitmap(fi.a(var1, var0));
         } else {
            InputStream var2 = BitmapDescriptorFactory.class.getResourceAsStream("/assets/" + var0);
            Bitmap var3 = BitmapFactory.decodeStream(var2);
            var2.close();
            BitmapDescriptor var4 = fromBitmap(var3);
            return var4;
         }
      } catch (Throwable var5) {
         return null;
      }
   }

   public static BitmapDescriptor fromFile(String var0) {
      try {
         Context var1 = getContext();
         if (var1 != null) {
            FileInputStream var2 = var1.openFileInput(var0);
            Bitmap var3 = BitmapFactory.decodeStream(var2);
            var2.close();
            BitmapDescriptor var4 = fromBitmap(var3);
            var3.recycle();
            return var4;
         } else {
            return null;
         }
      } catch (Throwable var5) {
         return null;
      }
   }

   public static BitmapDescriptor defaultMarker() {
      try {
         return fromAsset(er$a.b.name() + ".png");
      } catch (Throwable var1) {
         return null;
      }
   }

   public static BitmapDescriptor defaultMarker(float var0) {
      try {
         var0 = (float)((int)(var0 + 15.0F) / 30 * 30);
         short var1 = 330;
         if (var0 > (float)var1) {
            var0 = (float)var1;
         } else if (var0 < 0.0F) {
            var0 = 0.0F;
         }

         String var2 = "";
         if (var0 == 0.0F) {
            var2 = "RED";
         } else if (var0 == 30.0F) {
            var2 = "ORANGE";
         } else if (var0 == 60.0F) {
            var2 = "YELLOW";
         } else if (var0 == 120.0F) {
            var2 = "GREEN";
         } else if (var0 == 180.0F) {
            var2 = "CYAN";
         } else if (var0 == 210.0F) {
            var2 = "AZURE";
         } else if (var0 == 240.0F) {
            var2 = "BLUE";
         } else if (var0 == 270.0F) {
            var2 = "VIOLET";
         } else if (var0 == 300.0F) {
            var2 = "MAGENTA";
         } else if (var0 == 330.0F) {
            var2 = "ROSE";
         }

         return fromAsset(var2 + ".png");
      } catch (Throwable var3) {
         return null;
      }
   }

   public static BitmapDescriptor fromBitmap(Bitmap var0) {
      if (var0 == null) {
         return null;
      } else {
         BitmapDescriptor var1 = null;

         try {
            if (nextId == Integer.MAX_VALUE) {
               nextId = 0;
            }

            String var2 = "com.amap.api.icon_" + ++nextId;
            var1 = new BitmapDescriptor(var0, var2);
            return var1;
         } catch (Throwable var3) {
            return var1;
         }
      }
   }

   public static Context getContext() {
      Context var0 = z.a;

      try {
         if (var0 == null) {
            Class var1 = Class.forName("com.amap.api.wrapper.MapFragmentDelegateWrapper");
            Object var2 = var1.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(0));
            Object var3 = var1.getDeclaredMethod("getContext").invoke(var2);
            var0 = (Context)var3;
         }
      } catch (Throwable var4) {
         var0 = null;
         Log.d("mapcore", "BitmapDescriptor catch e:" + var4.toString());
      }

      return var0;
   }
}
