package com.amap.api.maps;

public interface LocationSource {
   void activate(LocationSource$OnLocationChangedListener var1);

   void deactivate();
}
