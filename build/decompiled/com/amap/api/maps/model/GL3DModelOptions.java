package com.amap.api.maps.model;

import java.util.ArrayList;
import java.util.List;

public class GL3DModelOptions {
   private float rotate;
   private LatLng latLng;
   private List<Float> vertextList = new ArrayList();
   private List<Float> textrueList = new ArrayList();
   private BitmapDescriptor bitmapDescriptor;
   private int fixedLength;

   public GL3DModelOptions() {
   }

   public GL3DModelOptions textureDrawable(BitmapDescriptor var1) {
      this.bitmapDescriptor = var1;
      return this;
   }

   public GL3DModelOptions vertexData(List<Float> var1, List<Float> var2) {
      this.vertextList = var1;
      this.textrueList = var2;
      return this;
   }

   public GL3DModelOptions position(LatLng var1) {
      this.latLng = var1;
      return this;
   }

   public GL3DModelOptions angle(float var1) {
      this.rotate = var1;
      return this;
   }

   public List<Float> getVertext() {
      return this.vertextList;
   }

   public List<Float> getTextrue() {
      return this.textrueList;
   }

   public float getAngle() {
      return this.rotate;
   }

   public LatLng getLatLng() {
      return this.latLng;
   }

   public BitmapDescriptor getBitmapDescriptor() {
      return this.bitmapDescriptor;
   }

   public GL3DModelOptions setModelFixedLength(int var1) {
      this.fixedLength = var1;
      return this;
   }

   public int getModelFixedLength() {
      return this.fixedLength;
   }
}
