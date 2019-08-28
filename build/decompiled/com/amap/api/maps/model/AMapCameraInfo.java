package com.amap.api.maps.model;

public class AMapCameraInfo {
   private float fov = 0.0F;
   private float aspectRatio = 1.0F;
   private float rotate = 0.0F;
   private float positionX = 0.0F;
   private float positionY = 0.0F;
   private float positionZ = 0.0F;

   public AMapCameraInfo(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.fov = var1;
      this.aspectRatio = var2;
      this.rotate = var3;
      this.positionX = var4;
      this.positionY = var5;
      this.positionZ = var6;
   }

   public float getFov() {
      return this.fov;
   }

   public float getAspectRatio() {
      return this.aspectRatio;
   }

   public float getRotate() {
      return this.rotate;
   }

   public float getX() {
      return this.positionX;
   }

   public float getY() {
      return this.positionY;
   }

   public float getZ() {
      return this.positionZ;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("[").append("fov:").append(this.fov).append(" ");
      var1.append("aspectRatio:").append(this.aspectRatio).append(" ");
      var1.append("rotate:").append(this.rotate).append(" ");
      var1.append("pos_x:").append(this.positionX).append(" ");
      var1.append("pos_y:").append(this.positionY).append(" ");
      var1.append("pos_z:").append(this.positionZ).append("]");
      return var1.toString();
   }
}
