package com.amap.api.maps;

import android.view.View;

public class InfoWindowParams {
   private int a = 2;
   private int b;
   private View c;
   private View d;
   public static final int INFOWINDOW_TYPE_IMAGE = 1;
   public static final int INFOWINDOW_TYPE_VIEW = 2;

   public InfoWindowParams() {
   }

   public void setInfoWindowUpdateTime(int var1) {
      this.b = var1;
   }

   public long getInfoWindowUpdateTime() {
      return (long)this.b;
   }

   public void setInfoWindowType(int var1) {
      this.a = var1;
   }

   public int getInfoWindowType() {
      return this.a;
   }

   public View getInfoWindow() {
      return this.c;
   }

   public void setInfoContent(View var1) {
      this.d = var1;
   }

   public void setInfoWindow(View var1) {
      this.c = var1;
   }

   public View getInfoContents() {
      return this.d;
   }
}
