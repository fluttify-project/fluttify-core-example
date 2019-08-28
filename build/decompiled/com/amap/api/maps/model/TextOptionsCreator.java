package com.amap.api.maps.model;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class TextOptionsCreator implements Creator<TextOptions> {
   public TextOptionsCreator() {
   }

   public TextOptions createFromParcel(Parcel var1) {
      TextOptions var2 = new TextOptions();
      var2.a = var1.readString();
      Bundle var3 = var1.readBundle();
      LatLng var4 = new LatLng(var3.getDouble("lat"), var3.getDouble("lng"));
      var2.position(var4);
      var2.text(var1.readString());
      var2.typeface(Typeface.defaultFromStyle(var1.readInt()));
      var2.rotate(var1.readFloat());
      var2.align(var1.readInt(), var1.readInt());
      var2.backgroundColor(var1.readInt());
      var2.fontColor(var1.readInt());
      var2.fontSize(var1.readInt());
      var2.zIndex(var1.readFloat());
      var2.visible(var1.readByte() == 1);

      try {
         Bundle var5 = var1.readBundle();
         Parcelable var6 = var5.getParcelable("obj");
         if (var6 != null) {
            var2.setObject(var6);
         }
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

      return var2;
   }

   public TextOptions[] newArray(int var1) {
      return new TextOptions[var1];
   }
}
