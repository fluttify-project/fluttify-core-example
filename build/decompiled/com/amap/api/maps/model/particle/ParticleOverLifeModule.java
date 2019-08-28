package com.amap.api.maps.model.particle;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.autonavi.amap.mapcore.AMapNativeParticleSystem;
import com.autonavi.amap.mapcore.AbstractNativeInstance;

public class ParticleOverLifeModule extends AbstractNativeInstance implements Parcelable {
   public static final Creator<ParticleOverLifeModule> CREATOR = new ParticleOverLifeModule$1();
   private static final int TYPE_VEL = 0;
   private static final int TYPE_ROTATE = 1;
   private static final int TYPE_SCALE = 2;
   private static final int TYPE_COLOR = 3;
   private VelocityGenerate overLife = null;
   private VelocityGenerate velocityOverLife = null;
   private RotationOverLife rotateOverLife;
   private SizeOverLife sizeOverLife;
   private ColorGenerate colorGenerate;
   private boolean isNeedReloadVelocityGenerate = false;
   private boolean isNeedReloadRotationOverLife = false;
   private boolean isNeedReloadSizeOverLife = false;
   private boolean isNeedReloadColorGenerate = false;

   protected ParticleOverLifeModule(Parcel var1) {
      this.nativeInstance = var1.readLong();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeLong(this.nativeInstance);
   }

   public int describeContents() {
      return 0;
   }

   protected void finalize() throws Throwable {
      super.finalize();
      if (this.nativeInstance != 0L) {
         AMapNativeParticleSystem.nativeReleaseParticleOverLifeModule(this.nativeInstance);
         this.nativeInstance = 0L;
      }

   }

   public ParticleOverLifeModule() {
      this.createNativeInstace();
   }

   public void createNativeInstace() {
      try {
         this.nativeInstance = AMapNativeParticleSystem.nativeCreateParticleOverLifeModule();
         if (this.isNeedReloadVelocityGenerate) {
            this.setVelocityOverLife(this.overLife);
            this.isNeedReloadVelocityGenerate = false;
         }

         if (this.isNeedReloadRotationOverLife) {
            this.setRotateOverLife(this.rotateOverLife);
            this.isNeedReloadRotationOverLife = false;
         }

         if (this.isNeedReloadSizeOverLife) {
            this.setSizeOverLife(this.sizeOverLife);
            this.isNeedReloadSizeOverLife = false;
         }

         if (this.isNeedReloadColorGenerate) {
            this.setColorGenerate(this.colorGenerate);
            this.isNeedReloadColorGenerate = false;
         }
      } catch (Throwable var2) {
         ;
      }

   }

   public void setVelocityOverLife(VelocityGenerate var1) {
      this.overLife = var1;
      this.velocityOverLife = var1;
      if (this.nativeInstance != 0L) {
         if (this.overLife != null) {
            if (this.overLife.getNativeInstance() == 0L) {
               this.overLife.createNativeInstace();
            }

            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, this.overLife.getNativeInstance(), 0);
         } else {
            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, 0L, 0);
         }
      } else {
         this.isNeedReloadVelocityGenerate = true;
      }

   }

   public void setRotateOverLife(RotationOverLife var1) {
      this.rotateOverLife = var1;
      if (this.nativeInstance != 0L) {
         if (this.rotateOverLife != null) {
            if (this.rotateOverLife.getNativeInstance() == 0L) {
               this.rotateOverLife.createNativeInstace();
            }

            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, this.rotateOverLife.getNativeInstance(), 1);
         } else {
            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, 0L, 1);
         }
      } else {
         this.isNeedReloadRotationOverLife = true;
      }

   }

   public void setSizeOverLife(SizeOverLife var1) {
      this.sizeOverLife = var1;
      if (this.nativeInstance != 0L) {
         if (this.sizeOverLife != null) {
            if (this.sizeOverLife.getNativeInstance() == 0L) {
               this.sizeOverLife.createNativeInstace();
            }

            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, this.sizeOverLife.getNativeInstance(), 2);
         } else {
            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, 0L, 2);
         }
      } else {
         this.isNeedReloadSizeOverLife = true;
      }

   }

   public void setColorGenerate(ColorGenerate var1) {
      this.colorGenerate = var1;
      if (this.nativeInstance != 0L) {
         if (this.colorGenerate != null) {
            if (this.colorGenerate.getNativeInstance() == 0L) {
               this.colorGenerate.createNativeInstace();
            }

            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, this.colorGenerate.getNativeInstance(), 3);
         } else {
            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, 0L, 3);
         }
      } else {
         this.isNeedReloadColorGenerate = true;
      }

   }
}
