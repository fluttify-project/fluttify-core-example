package com.amap.api.mapcore.util;

import com.amap.api.maps.model.particle.ColorGenerate;
import com.amap.api.maps.model.particle.ParticleEmissionModule;
import com.amap.api.maps.model.particle.ParticleOverLifeModule;
import com.amap.api.maps.model.particle.ParticleShapeModule;
import com.amap.api.maps.model.particle.VelocityGenerate;

public interface dh extends df {
   void a(int var1, int var2);

   void a(int var1);

   void a(long var1);

   void b(long var1);

   void a(VelocityGenerate var1);

   void a(boolean var1);

   void a(ParticleShapeModule var1);

   void a(ParticleEmissionModule var1);

   int b();

   void a(ParticleOverLifeModule var1);

   void a(ColorGenerate var1);
}
