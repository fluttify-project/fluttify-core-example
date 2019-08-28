package com.amap.api.trace;

import com.amap.api.maps.model.LatLng;
import java.util.List;

public interface TraceStatusListener {
   void onTraceStatus(List<TraceLocation> var1, List<LatLng> var2, String var3);
}
