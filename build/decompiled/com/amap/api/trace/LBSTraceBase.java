package com.amap.api.trace;

import java.util.List;

public interface LBSTraceBase {
   void queryProcessedTrace(int var1, List<TraceLocation> var2, int var3, TraceListener var4);

   void setLocationInterval(long var1);

   void setTraceStatusInterval(int var1);

   void startTrace(TraceStatusListener var1);

   void stopTrace();

   void destroy();
}
