package com.amap.api.trace;

import com.amap.api.maps.model.LatLng;
import java.util.List;

public interface TraceListener {
   void onRequestFailed(int var1, String var2);

   void onTraceProcessing(int var1, int var2, List<LatLng> var3);

   void onFinished(int var1, List<LatLng> var2, int var3, int var4);
}
