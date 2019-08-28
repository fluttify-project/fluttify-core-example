package com.amap.api.maps.model.particle;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.amap.api.maps.model.BaseOptions;
import com.amap.api.maps.model.BitmapDescriptor;

public class ParticleOverlayOptions extends BaseOptions implements Parcelable, Cloneable {
   private BitmapDescriptor bitmapDescriptor;
   private float zIndex = 1.0F;
   private int maxParticles = 100;
   private boolean loop = true;
   private long duration = 5000L;
   private long particleLifeTime = 5000L;
   private ParticleEmissionModule particleEmissionModule;
   private ParticleShapeModule particleShapeModule;
   private VelocityGenerate startSpeed = null;
   private ColorGenerate startColor;
   private ParticleOverLifeModule particleOverLifeModule;
   private int startParticleW = 32;
   private int startParticleH = 32;
   private boolean visibile = true;
   private boolean isParticleEmissionModuleUpdate = false;
   private boolean isParticleShapeModuleUpdate = false;
   private boolean isStartSpeedUpdate = false;
   private boolean isStartColorUpdate = false;
   private boolean isParticleOverLifeModuleUpdate = false;
   private final String type = "ParticleOptions";
   private String bitmapSymbol;
   public static final Creator<ParticleOverlayOptions> CREATOR = new ParticleOverlayOptions$1();

   public ParticleOverlayOptions() {
   }

   protected ParticleOverlayOptions(Parcel var1) {
      this.bitmapDescriptor = (BitmapDescriptor)var1.readParcelable(BitmapDescriptor.class.getClassLoader());
      this.bitmapSymbol = this.bitmapDescriptor.getId();
      this.zIndex = var1.readFloat();
      this.maxParticles = var1.readInt();
      this.loop = var1.readByte() != 0;
      this.duration = var1.readLong();
      this.particleLifeTime = var1.readLong();
      this.startParticleW = var1.readInt();
      this.startParticleH = var1.readInt();
      this.visibile = var1.readByte() != 0;
   }

   public ParticleOverlayOptions icon(BitmapDescriptor var1) {
      try {
         this.bitmapDescriptor = var1;
         this.bitmapSymbol = this.bitmapDescriptor.getId();
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return this;
   }

   public BitmapDescriptor getIcon() {
      return this.bitmapDescriptor;
   }

   public int getMaxParticles() {
      return this.maxParticles;
   }

   public ParticleOverlayOptions setMaxParticles(int var1) {
      this.maxParticles = var1;
      return this;
   }

   public boolean isLoop() {
      return this.loop;
   }

   public ParticleOverlayOptions setLoop(boolean var1) {
      this.loop = var1;
      return this;
   }

   public long getDuration() {
      return this.duration;
   }

   public ParticleOverlayOptions setDuration(long var1) {
      this.duration = var1;
      return this;
   }

   public long getParticleLifeTime() {
      return this.particleLifeTime;
   }

   public ParticleOverlayOptions setParticleLifeTime(long var1) {
      this.particleLifeTime = var1;
      return this;
   }

   public ParticleEmissionModule getParticleEmissionModule() {
      return this.particleEmissionModule;
   }

   public ParticleOverlayOptions setParticleEmissionModule(ParticleEmissionModule var1) {
      this.particleEmissionModule = var1;
      this.isParticleEmissionModuleUpdate = true;
      return this;
   }

   public ParticleShapeModule getParticleShapeModule() {
      return this.particleShapeModule;
   }

   public ParticleOverlayOptions setParticleShapeModule(ParticleShapeModule var1) {
      this.particleShapeModule = var1;
      this.isParticleShapeModuleUpdate = true;
      return this;
   }

   public VelocityGenerate getParticleStartSpeed() {
      return this.startSpeed;
   }

   public ParticleOverlayOptions setParticleStartSpeed(VelocityGenerate var1) {
      this.startSpeed = var1;
      this.isStartSpeedUpdate = true;
      return this;
   }

   public ParticleOverlayOptions setParticleStartColor(ColorGenerate var1) {
      this.startColor = var1;
      this.isStartColorUpdate = true;
      return this;
   }

   public ColorGenerate getParticleStartColor() {
      return this.startColor;
   }

   public ParticleOverlayOptions setParticleOverLifeModule(ParticleOverLifeModule var1) {
      this.particleOverLifeModule = var1;
      this.isParticleOverLifeModuleUpdate = true;
      return this;
   }

   public ParticleOverLifeModule getParticleOverLifeModule() {
      return this.particleOverLifeModule;
   }

   public ParticleOverlayOptions setStartParticleSize(int var1, int var2) {
      this.startParticleW = var1;
      this.startParticleH = var2;
      return this;
   }

   public int getStartParticleW() {
      return this.startParticleW;
   }

   public int getstartParticleH() {
      return this.startParticleH;
   }

   public ParticleOverlayOptions zIndex(float var1) {
      this.zIndex = var1;
      return this;
   }

   public float getZIndex() {
      return this.zIndex;
   }

   public ParticleOverlayOptions setVisible(boolean var1) {
      this.visibile = var1;
      return this;
   }

   public boolean isVisibile() {
      return this.visibile;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeParcelable(this.bitmapDescriptor, var2);
      var1.writeFloat(this.zIndex);
      var1.writeInt(this.maxParticles);
      var1.writeByte((byte)(this.loop ? 1 : 0));
      var1.writeLong(this.duration);
      var1.writeLong(this.particleLifeTime);
      var1.writeInt(this.startParticleW);
      var1.writeInt(this.startParticleH);
      var1.writeByte((byte)(this.visibile ? 1 : 0));
   }
}
