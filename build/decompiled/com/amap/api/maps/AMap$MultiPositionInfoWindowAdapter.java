package com.amap.api.maps;

import android.view.View;
import com.amap.api.maps.model.Marker;

public interface AMap$MultiPositionInfoWindowAdapter extends AMap$InfoWindowAdapter {
   View getInfoWindowClick(Marker var1);

   View getOverturnInfoWindow(Marker var1);

   View getOverturnInfoWindowClick(Marker var1);
}
