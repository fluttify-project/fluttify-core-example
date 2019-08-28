package com.amap.api.mapcore.util;

import android.animation.TypeEvaluator;
import com.amap.api.maps.model.LatLng;

public class dn$a implements TypeEvaluator {
   public dn$a() {
   }

   public Object evaluate(float var1, Object var2, Object var3) {
      LatLng var4 = (LatLng)var2;
      LatLng var5 = (LatLng)var3;
      double var6 = var4.latitude + (double)var1 * (var5.latitude - var4.latitude);
      double var8 = var4.longitude + (double)var1 * (var5.longitude - var4.longitude);
      LatLng var10 = new LatLng(var6, var8);
      return var10;
   }
}
