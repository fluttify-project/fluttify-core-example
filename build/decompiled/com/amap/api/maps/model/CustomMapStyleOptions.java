package com.amap.api.maps.model;

public class CustomMapStyleOptions {
   private String styleDataPath = null;
   private byte[] styleData = null;
   private String styleTexturePath = null;
   private byte[] styleTextureData = null;
   private String styleId = null;
   private boolean enable = true;
   private byte[] styleExtraData = null;
   private String styleExtraPath = null;

   public CustomMapStyleOptions() {
   }

   public String getStyleDataPath() {
      return this.styleDataPath;
   }

   public CustomMapStyleOptions setStyleDataPath(String var1) {
      this.styleDataPath = var1;
      return this;
   }

   public String getStyleTexturePath() {
      return this.styleTexturePath;
   }

   public CustomMapStyleOptions setStyleTexturePath(String var1) {
      this.styleTexturePath = var1;
      return this;
   }

   public byte[] getStyleData() {
      return this.styleData;
   }

   public CustomMapStyleOptions setStyleData(byte[] var1) {
      this.styleData = var1;
      return this;
   }

   public byte[] getStyleTextureData() {
      return this.styleTextureData;
   }

   public CustomMapStyleOptions setStyleTextureData(byte[] var1) {
      this.styleTextureData = var1;
      return this;
   }

   public String getStyleId() {
      return this.styleId;
   }

   public CustomMapStyleOptions setStyleId(String var1) {
      this.styleId = var1;
      return this;
   }

   public boolean isEnable() {
      return this.enable;
   }

   public CustomMapStyleOptions setEnable(boolean var1) {
      this.enable = var1;
      return this;
   }

   public byte[] getStyleExtraData() {
      return this.styleExtraData;
   }

   public CustomMapStyleOptions setStyleExtraData(byte[] var1) {
      this.styleExtraData = var1;
      return this;
   }

   public String getStyleExtraPath() {
      return this.styleExtraPath;
   }

   public CustomMapStyleOptions setStyleExtraPath(String var1) {
      this.styleExtraPath = var1;
      return this;
   }
}
