package com.amap.api.mapcore.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;
import com.amap.api.maps.model.Marker;

public class ag implements SensorEventListener {
   private SensorManager a;
   private Sensor b;
   private long c = 0L;
   private float d;
   private Context e;
   private u f;
   private Marker g;
   private boolean h = true;

   public ag(Context var1, u var2) {
      this.e = var1.getApplicationContext();
      this.f = var2;

      try {
         this.a = (SensorManager)var1.getSystemService("sensor");
         if (this.a != null) {
            this.b = this.a.getDefaultSensor(3);
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public void a() {
      if (this.a != null && this.b != null) {
         this.a.registerListener(this, this.b, 3);
      }

   }

   public void b() {
      if (this.a != null && this.b != null) {
         this.a.unregisterListener(this, this.b);
      }

   }

   public void a(Marker var1) {
      this.g = var1;
   }

   public void a(boolean var1) {
      this.h = var1;
   }

   public void onAccuracyChanged(Sensor var1, int var2) {
   }

   public void onSensorChanged(SensorEvent var1) {
      try {
         if (System.currentTimeMillis() - this.c < 100L) {
            return;
         }

         if (this.f.a() != null && this.f.a().getAnimateionsCount() > 0) {
            return;
         }

         switch(var1.sensor.getType()) {
         case 3:
            float var2 = var1.values[0];
            var2 += (float)a(this.e);
            var2 %= 360.0F;
            float var3 = 180.0F;
            float var4 = -180.0F;
            if (var2 > var3) {
               var2 -= 360.0F;
            } else if (var2 < var4) {
               var2 += 360.0F;
            }

            if (Math.abs(this.d - var2) >= 3.0F) {
               this.d = Float.isNaN(var2) ? 0.0F : var2;
               if (this.g != null) {
                  try {
                     if (this.h) {
                        this.f.a(an.d(this.d));
                        this.g.setRotateAngle(-this.d);
                     } else {
                        this.g.setRotateAngle(360.0F - this.d);
                     }
                  } catch (Throwable var6) {
                     var6.printStackTrace();
                  }
               }

               this.c = System.currentTimeMillis();
            }
         }
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

   }

   public static int a(Context var0) {
      if (var0 != null) {
         WindowManager var2 = (WindowManager)var0.getSystemService("window");
         if (var2 != null) {
            Display var1 = var2.getDefaultDisplay();
            switch(var1.getRotation()) {
            case 0:
               return 0;
            case 1:
               return 90;
            case 2:
               return 180;
            case 3:
               return -90;
            }
         }
      }

      return 0;
   }
}
