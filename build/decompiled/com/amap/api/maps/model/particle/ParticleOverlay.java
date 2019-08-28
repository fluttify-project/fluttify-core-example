package com.amap.api.maps.model.particle;

import android.text.TextUtils;
import com.amap.api.mapcore.util.dh;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BaseOverlay;
import java.lang.ref.WeakReference;

public class ParticleOverlay extends BaseOverlay {
   private dh overlayDelegate;
   private String overlayName;
   private ParticleOverlayOptions options;
   private WeakReference<IGlOverlayLayer> glOverlayLayerRef;

   public ParticleOverlay(dh var1) {
      this.overlayDelegate = var1;
   }

   public ParticleOverlay(IGlOverlayLayer var1, ParticleOverlayOptions var2) {
      this.glOverlayLayerRef = new WeakReference(var1);
      this.options = var2;
      this.overlayName = "";
   }

   public void setVisible(boolean var1) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.setVisible(var1);
         } else if (this.options != null) {
            this.options.setVisible(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void destroy() {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.destroy();
         } else {
            IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
            if (var1 != null) {
               var1.removeOverlay(this.overlayName);
            }
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void setStartParticleSize(int var1, int var2) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.a(var1, var2);
         } else if (this.options != null) {
            this.options.setStartParticleSize(var1, var2);
            this.a();
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public void setMaxParticles(int var1) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.a(var1);
         } else if (this.options != null) {
            this.options.setMaxParticles(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setDuration(long var1) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.a(var1);
         } else if (this.options != null) {
            this.options.setDuration(var1);
            this.a();
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public void setParticleLifeTime(long var1) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.b(var1);
         } else if (this.options != null) {
            this.options.setParticleLifeTime(var1);
            this.a();
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public void setParticleStartSpeed(VelocityGenerate var1) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.a(var1);
         } else if (this.options != null) {
            this.options.setParticleStartSpeed(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setLoop(boolean var1) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.a(var1);
         } else if (this.options != null) {
            this.options.setLoop(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setParticleShapeModule(ParticleShapeModule var1) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.a(var1);
         } else if (this.options != null) {
            this.options.setParticleShapeModule(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setParticleEmission(ParticleEmissionModule var1) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.a(var1);
         } else if (this.options != null) {
            this.options.setParticleEmissionModule(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getCurrentParticleNum() {
      byte var1 = 0;

      try {
         if (this.overlayDelegate != null) {
            return this.overlayDelegate.b();
         } else {
            IGlOverlayLayer var2 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
            return var2 != null ? var2.getCurrentParticleNum(this.overlayName) : 0;
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
         return var1;
      }
   }

   public void setParticleOverLifeModule(ParticleOverLifeModule var1) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.a(var1);
         } else if (this.options != null) {
            this.options.setParticleOverLifeModule(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setStartColor(ColorGenerate var1) {
      try {
         if (this.overlayDelegate != null) {
            this.overlayDelegate.a(var1);
         } else if (this.options != null) {
            this.options.setParticleStartColor(var1);
            this.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   private void a() {
      IGlOverlayLayer var1 = (IGlOverlayLayer)this.glOverlayLayerRef.get();
      if (!TextUtils.isEmpty(this.overlayName) && var1 != null) {
         var1.updateOption(this.overlayName, this.options);
      }

   }
}
