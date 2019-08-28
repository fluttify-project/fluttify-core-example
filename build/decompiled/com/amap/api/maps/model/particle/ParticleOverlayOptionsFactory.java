package com.amap.api.maps.model.particle;

import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

public class ParticleOverlayOptionsFactory {
   public static final int PARTICLE_TYPE_SUNNY = 0;
   public static final int PARTICLE_TYPE_RAIN = 1;
   public static final int PARTICLE_TYPE_SNOWY = 2;
   public static final int PARTICLE_TYPE_HAZE = 3;

   public ParticleOverlayOptionsFactory() {
   }

   public static List<ParticleOverlayOptions> defaultOptions(int var0) {
      ArrayList var1 = new ArrayList();
      switch(var0) {
      case 0:
         var1.addAll(d());
         break;
      case 1:
         var1.add(c());
         break;
      case 2:
         var1.add(b());
         break;
      case 3:
         var1.addAll(a());
      }

      return var1;
   }

   private static List<ParticleOverlayOptions> a() {
      ArrayList var0 = new ArrayList();
      String var1 = "map_custom/particle/fog.png";
      String var2 = "map_custom/particle/haze.png";
      float var3 = 0.0F;
      long var4 = 10000L;
      float var6 = 0.5F;
      ParticleOverlayOptions var8 = null;
      BitmapDescriptor var9 = null;
      Object var10 = null;
      var8 = new ParticleOverlayOptions();
      var8.setLoop(false);
      var8.setMaxParticles(1);
      var8.setDuration(var4);
      var8.setParticleEmissionModule(new ParticleEmissionModule(1, (int)var4));
      var8.setParticleShapeModule(new SinglePointParticleShape(0.5F, 0.5F, 0.0F, true));
      var8.setParticleLifeTime(var4);
      var8.setParticleStartSpeed(new RandomVelocityBetweenTwoConstants(-10.0F, -0.0F, -0.0F, -20.0F, 0.0F, 0.0F));
      var9 = BitmapDescriptorFactory.fromAsset(var1);
      var8.icon(var9);
      byte var11 = 5;
      var8.setStartParticleSize(var9.getWidth() * var11, var9.getWidth() * var11);
      var0.add(var8);
      var8 = new ParticleOverlayOptions();
      var8.setMaxParticles(1000);
      var8.setDuration(var4);
      var8.setParticleEmissionModule(new ParticleEmissionModule(30, (int)(var4 / 4L)));
      var8.setLoop(true);
      var8.setParticleShapeModule(new RectParticleShape(0.5F, 0.5F, 1.0F, 1.0F, true));
      var8.setParticleLifeTime(var4);
      var8.setParticleStartSpeed(new RandomVelocityBetweenTwoConstants(-100.0F, -100.0F, -1.0F, -200.0F, 100.0F, 1.0F));
      var9 = BitmapDescriptorFactory.fromAsset(var2);
      var8.icon(var9);
      var8.setStartParticleSize(var9.getWidth(), var9.getHeight());
      var8.setParticleStartColor(new RandomColorBetWeenTwoConstants(255.0F, 255.0F, 255.0F, 102.0F, 255.0F, 255.0F, 255.0F, 255.0F));
      var0.add(var8);
      return var0;
   }

   private static ParticleOverlayOptions b() {
      String var0 = "map_custom/particle/snow.png";
      ParticleOverlayOptions var1 = new ParticleOverlayOptions();
      var1.setMaxParticles(1000);
      var1.setDuration(5000L);
      var1.setParticleEmissionModule(new ParticleEmissionModule(20, 1000));
      var1.setLoop(true);
      var1.setParticleShapeModule(new RectParticleShape(0.0F, 0.0F, 1.0F, 0.1F, true));
      var1.setParticleLifeTime(10000L);
      var1.setParticleStartSpeed(new RandomVelocityBetweenTwoConstants(-50.0F, 100.0F, 0.0F, 50.0F, 200.0F, 0.0F));
      BitmapDescriptor var2 = BitmapDescriptorFactory.fromAsset(var0);
      var1.icon(var2);
      var1.setStartParticleSize(var2.getWidth(), var2.getHeight());
      return var1;
   }

   private static ParticleOverlayOptions c() {
      String var0 = "map_custom/particle/rain.png";
      ParticleOverlayOptions var1 = new ParticleOverlayOptions();
      var1.setMaxParticles(1000);
      var1.setDuration(5000L);
      var1.setParticleEmissionModule(new ParticleEmissionModule(100, 1000));
      var1.setLoop(true);
      var1.setParticleLifeTime(5000L);
      var1.setParticleStartSpeed(new RandomVelocityBetweenTwoConstants(10.0F, 1000.0F, 0.0F, 100.0F, 1000.0F, 0.0F));
      var1.setParticleShapeModule(new RectParticleShape(0.0F, 0.0F, 1.0F, 0.1F, true));
      BitmapDescriptor var2 = BitmapDescriptorFactory.fromAsset(var0);
      var1.icon(var2);
      var1.setStartParticleSize(var2.getWidth() * 2, var2.getHeight() * 2);
      return var1;
   }

   private static List<ParticleOverlayOptions> d() {
      ArrayList var0 = new ArrayList();
      long var1 = 10000L;
      String var3 = "map_custom/particle/sun_0.png";
      String var4 = "map_custom/particle/sun_1.png";
      ParticleOverlayOptions var5 = new ParticleOverlayOptions();
      var5.setMaxParticles(1);
      var5.setDuration(var1);
      var5.setParticleEmissionModule(new ParticleEmissionModule(1, (int)(var1 / 4L)));
      var5.setLoop(true);
      var5.setParticleShapeModule(new SinglePointParticleShape(0.0F, 0.0F, 0.0F));
      var5.setParticleLifeTime(var1);
      var5.setParticleStartSpeed(new RandomVelocityBetweenTwoConstants(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
      ParticleOverLifeModule var6 = new ParticleOverLifeModule();
      var5.setParticleOverLifeModule(var6);
      var5.icon(BitmapDescriptorFactory.fromAsset(var3));
      var5.setStartParticleSize(1000, 1000);
      var0.add(var5);
      var5 = new ParticleOverlayOptions();
      var5.setMaxParticles(1);
      var5.setDuration(var1);
      var5.setParticleEmissionModule(new ParticleEmissionModule(1, (int)(var1 / 4L)));
      var5.setLoop(true);
      var5.setParticleShapeModule(new SinglePointParticleShape(0.0F, 0.0F, 0.0F));
      var5.setParticleLifeTime(var1);
      var5.setParticleStartSpeed(new RandomVelocityBetweenTwoConstants(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
      var6 = new ParticleOverLifeModule();
      var6.setRotateOverLife(new ConstantRotationOverLife(45.0F));
      var5.setParticleOverLifeModule(var6);
      var5.icon(BitmapDescriptorFactory.fromAsset(var4));
      var5.setStartParticleSize(1000, 1000);
      var0.add(var5);
      return var0;
   }
}
