package com.amap.api.maps.model;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class TextOptions implements Parcelable {
   public static final TextOptionsCreator CREATOR = new TextOptionsCreator();
   String a;
   private LatLng position;
   private String text;
   private Typeface typeface;
   private float rotate;
   private int alignX;
   private int alignY;
   private int backgroundColor;
   private int fontColor;
   private Object object;
   private int fontSize;
   private float zIndex;
   private boolean isVisible;

   public TextOptions() {
      this.typeface = Typeface.DEFAULT;
      this.alignX = 4;
      this.alignY = 32;
      this.backgroundColor = -1;
      this.fontColor = -16777216;
      this.fontSize = 20;
      this.zIndex = 0.0F;
      this.isVisible = true;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.a);
      Bundle var3 = new Bundle();
      if (this.position != null) {
         var3.putDouble("lat", this.position.latitude);
         var3.putDouble("lng", this.position.longitude);
      }

      var1.writeBundle(var3);
      var1.writeString(this.text);
      var1.writeInt(this.typeface.getStyle());
      var1.writeFloat(this.rotate);
      var1.writeInt(this.alignX);
      var1.writeInt(this.alignY);
      var1.writeInt(this.backgroundColor);
      var1.writeInt(this.fontColor);
      var1.writeInt(this.fontSize);
      var1.writeFloat(this.zIndex);
      var1.writeByte((byte)(this.isVisible ? 1 : 0));
      if (this.object instanceof Parcelable) {
         Bundle var4 = new Bundle();
         var4.putParcelable("obj", (Parcelable)this.object);
         var1.writeBundle(var4);
      }

   }

   public int describeContents() {
      return 0;
   }

   public TextOptions position(LatLng var1) {
      this.position = var1;
      return this;
   }

   public TextOptions text(String var1) {
      this.text = var1;
      return this;
   }

   public TextOptions typeface(Typeface var1) {
      if (var1 != null) {
         this.typeface = var1;
      }

      return this;
   }

   public TextOptions visible(boolean var1) {
      this.isVisible = var1;
      return this;
   }

   public TextOptions zIndex(float var1) {
      this.zIndex = var1;
      return this;
   }

   public TextOptions rotate(float var1) {
      this.rotate = var1;
      return this;
   }

   public TextOptions align(int var1, int var2) {
      this.alignX = var1;
      this.alignY = var2;
      return this;
   }

   public TextOptions backgroundColor(int var1) {
      this.backgroundColor = var1;
      return this;
   }

   public TextOptions setObject(Object var1) {
      this.object = var1;
      return this;
   }

   public TextOptions fontColor(int var1) {
      this.fontColor = var1;
      return this;
   }

   public TextOptions fontSize(int var1) {
      this.fontSize = var1;
      return this;
   }

   public LatLng getPosition() {
      return this.position;
   }

   public String getText() {
      return this.text;
   }

   public Typeface getTypeface() {
      return this.typeface;
   }

   public float getRotate() {
      return this.rotate;
   }

   public int getAlignX() {
      return this.alignX;
   }

   public int getAlignY() {
      return this.alignY;
   }

   public int getBackgroundColor() {
      return this.backgroundColor;
   }

   public int getFontColor() {
      return this.fontColor;
   }

   public Object getObject() {
      return this.object;
   }

   public int getFontSize() {
      return this.fontSize;
   }

   public float getZIndex() {
      return this.zIndex;
   }

   public boolean isVisible() {
      return this.isVisible;
   }
}
