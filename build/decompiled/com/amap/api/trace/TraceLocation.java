package com.amap.api.trace;

public class TraceLocation {
   private double a;
   private double b;
   private float c;
   private float d;
   private long e;

   public TraceLocation(double var1, double var3, float var5, float var6, long var7) {
      this.a = a(var1);
      this.b = a(var3);
      this.c = (float)((int)(var5 * 3600.0F / 1000.0F));
      this.d = (float)((int)var6);
      this.e = var7;
   }

   public TraceLocation() {
   }

   public double getLatitude() {
      return this.a;
   }

   public void setLatitude(double var1) {
      this.a = a(var1);
   }

   public double getLongitude() {
      return this.b;
   }

   public void setLongitude(double var1) {
      this.b = a(var1);
   }

   public float getSpeed() {
      return this.c;
   }

   public void setSpeed(float var1) {
      this.c = (float)((int)(var1 * 3600.0F / 1000.0F));
   }

   public float getBearing() {
      return this.d;
   }

   public void setBearing(float var1) {
      this.d = (float)((int)var1);
   }

   public long getTime() {
      return this.e;
   }

   public void setTime(long var1) {
      this.e = var1;
   }

   private static double a(double var0) {
      return (double)Math.round(var0 * 1000000.0D) / 1000000.0D;
   }

   public TraceLocation copy() {
      TraceLocation var1 = new TraceLocation();
      var1.d = this.d;
      var1.a = this.a;
      var1.b = this.b;
      var1.c = this.c;
      var1.e = this.e;
      return var1;
   }

   public String toString() {
      return this.a + ",longtitude " + this.b + ",speed " + this.c + ",bearing " + this.d + ",time " + this.e;
   }
}
