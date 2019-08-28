package com.amap.api.trace;

import android.content.Context;
import com.amap.api.mapcore.util.fi;
import com.amap.api.mapcore.util.gq;
import com.amap.api.mapcore.util.hf;
import com.amap.api.mapcore.util.ik;
import java.util.List;

public class LBSTraceClient {
   public static final int TYPE_AMAP = 1;
   public static final int TYPE_GPS = 2;
   public static final int TYPE_BAIDU = 3;
   public static final String MIN_GRASP_POINT_ERROR = "轨迹点太少或距离太近,轨迹纠偏失败";
   public static final String LOCATE_TIMEOUT_ERROR = "定位超时";
   public static final String TRACE_SUCCESS = "纠偏成功";
   private static LBSTraceBase a;
   private static volatile LBSTraceClient b;

   /** @deprecated */
   public LBSTraceClient(Context var1) {
      a(var1);
   }

   private LBSTraceClient() {
   }

   public static LBSTraceClient getInstance(Context var0) {
      if (b == null) {
         Class var1 = LBSTraceClient.class;
         synchronized(LBSTraceClient.class) {
            if (b == null) {
               a(var0);
               b = new LBSTraceClient();
            }
         }
      }

      return b;
   }

   private static void a(Context var0) {
      if (var0 != null) {
         try {
            hf var1 = fi.e();
            a = (LBSTraceBase)ik.a(var0.getApplicationContext(), var1, "com.amap.api.wrapper.LBSTraceClientWrapper", gq.class, new Class[]{Context.class}, new Object[]{var0.getApplicationContext()});
         } catch (Throwable var2) {
            a = new gq(var0.getApplicationContext());
         }
      }

   }

   public void queryProcessedTrace(int var1, List<TraceLocation> var2, int var3, TraceListener var4) {
      if (a != null) {
         a.queryProcessedTrace(var1, var2, var3, var4);
      }

   }

   public void startTrace(TraceStatusListener var1) {
      if (a != null) {
         a.startTrace(var1);
      }

   }

   public void stopTrace() {
      if (a != null) {
         a.stopTrace();
      }

   }

   public void destroy() {
      if (a != null) {
         a.destroy();
         a();
      }

   }

   private static void a() {
      a = null;
      b = null;
   }
}
