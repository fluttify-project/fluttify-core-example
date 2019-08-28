package com.autonavi.amap.mapcore.maploader;

import android.content.Context;
import com.amap.api.mapcore.util.gu;
import com.amap.api.mapcore.util.gx;
import com.amap.api.mapcore.util.gz;
import com.amap.api.mapcore.util.ht;
import com.amap.api.mapcore.util.jf;
import com.amap.api.mapcore.util.jf$a;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.ae.gmap.GLMapEngine;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.UUID;

public class AMapLoader implements jf$a {
   AMapLoader$ADataRequestParam mDataRequestParam;
   GLMapEngine mGLMapEngine;
   private int mEngineID = 0;
   private static final int GET_METHOD = 0;
   private volatile boolean isCanceled = false;
   private static String mDiu;
   private boolean mRequestCancel = false;
   public boolean isFinish = false;
   private jf downloadManager;

   public void onDownload(byte[] var1, long var2) {
      if (var1 != null && this.mGLMapEngine != null && this.mDataRequestParam != null) {
         this.mGLMapEngine.receiveNetData(this.mEngineID, this.mDataRequestParam.handler, var1, var1.length);
      }

   }

   public void onStop() {
      if (this.mGLMapEngine != null && this.mDataRequestParam != null) {
         this.mGLMapEngine.netError(this.mEngineID, this.mDataRequestParam.handler, -1);
      }

   }

   public void onFinish() {
      if (this.mGLMapEngine != null && this.mDataRequestParam != null) {
         this.mGLMapEngine.finishDownLoad(this.mEngineID, this.mDataRequestParam.handler);
      }

   }

   public void onException(Throwable var1) {
      if (this.mGLMapEngine != null && this.mDataRequestParam != null) {
         this.mGLMapEngine.netError(this.mEngineID, this.mDataRequestParam.handler, -1);
      }

      ht.c(var1, "AMapLoader", "download onException");
   }

   public AMapLoader(int var1, GLMapEngine var2, AMapLoader$ADataRequestParam var3) {
      this.mDataRequestParam = var3;
      this.mEngineID = var1;
      this.mGLMapEngine = var2;
      this.mRequestCancel = false;
   }

   public void doRequest() {
      if (!this.mRequestCancel) {
         String var1 = this.mDataRequestParam.requestBaseUrl;
         String var2 = this.mDataRequestParam.requestUrl;
         boolean var3 = true;
         if (!var1.endsWith("?")) {
            var1 = var1 + "?";
         }

         if (var3) {
            var2 = var2.replaceAll(";", this.getEncodeRequestParams(";").toString());
         }

         boolean var4 = false;
         if (var1 != null && var1.contains("http://m5.amap.com/")) {
            var4 = true;
         }

         var2 = this.getRequestParams(var2, var4, this.mDataRequestParam.nRequestType);
         StringBuffer var5 = new StringBuffer();
         if (this.mDataRequestParam.nRequestType == 0) {
            var5.append(var2);
            var5.append("&csid=" + UUID.randomUUID().toString());
         } else {
            var5.append("csid=" + UUID.randomUUID().toString());
         }

         try {
            var1 = var1 + this.generateQueryString(this.mGLMapEngine.getContext(), var5.toString());
            AMapLoader$AMapGridDownloadRequest var6 = new AMapLoader$AMapGridDownloadRequest(this.mGLMapEngine.getContext(), var1, this.mGLMapEngine.getUserAgent());
            var6.setConnectionTimeout(1800000);
            var6.setSoTimeout(1800000);
            if (this.mDataRequestParam.nRequestType != 0) {
               byte[] var7 = var2.getBytes("UTF-8");
               var6.setPostEntityBytes(var7);
            }

            this.downloadManager = new jf(var6, 0L, -1L, MapsInitializer.getProtocol() == 2);
            this.downloadManager.a(this);
         } catch (Throwable var11) {
            this.onException(var11);
         } finally {
            this.doCancel();
         }

      }
   }

   public void doCancel() {
      this.mRequestCancel = true;
      if (null != this.downloadManager && !this.isCanceled) {
         jf var1 = this.downloadManager;
         synchronized(this.downloadManager) {
            try {
               this.isCanceled = true;
               this.downloadManager.a();
               this.mGLMapEngine.setMapLoaderToTask(this.mEngineID, this.mDataRequestParam.handler, (AMapLoader)null);
            } catch (Throwable var4) {
               ht.c(var4, "AMapLoader", "doCancel");
            }
         }
      }

   }

   private String getEncodeRequestParams(String var1) {
      String var2 = null;

      try {
         var2 = URLEncoder.encode(var1, "UTF-8");
      } catch (UnsupportedEncodingException var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public String getDeviceId(Context var1) {
      return null != var1 ? gz.v(var1) : null;
   }

   protected String getRequestParams(String var1, boolean var2, int var3) {
      if (null == mDiu) {
         mDiu = this.getDeviceId(this.mGLMapEngine.getContext());
      }

      StringBuffer var4 = new StringBuffer(var1);
      if (var2) {
         var4.append("&channel=amap7&div=GNaviMap");
         var4.append("&diu=").append(mDiu);
      } else {
         var4.append("&channel=amapapi");
         var4.append("&div=GNaviMap");
         var4.append("&diu=").append(mDiu);
      }

      return var4.toString();
   }

   private String generateQueryString(Context var1, String var2) {
      StringBuffer var3 = new StringBuffer(var2);
      String var4 = gu.f(this.mGLMapEngine.getContext());

      try {
         var4 = URLEncoder.encode(var4, "UTF-8");
      } catch (Throwable var7) {
         ;
      }

      var3.append("&key=").append(var4);
      String var5 = this.sortReEncoderParams(var3.toString());
      String var6 = gx.a();
      var3.append("&ts=" + var6);
      var3.append("&scode=" + gx.a(var1, var6, var5));
      var3.append("&dip=").append("16300");
      return var3.toString();
   }

   private String sortReEncoderParams(String var1) {
      String[] var2 = var1.split("&");
      Arrays.sort(var2);
      StringBuffer var3 = new StringBuffer();
      String[] var4 = var2;
      int var5 = var2.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         String var8 = this.strReEncoder(var7);
         var3.append(var8);
         var3.append("&");
      }

      String var9 = var3.toString();
      if (var9.length() > 1) {
         var9 = (String)var9.subSequence(0, var9.length() - 1);
         return var9;
      } else {
         return var1;
      }
   }

   private String strReEncoder(String var1) {
      if (var1 == null) {
         return var1;
      } else {
         try {
            return URLDecoder.decode(var1, "utf-8");
         } catch (UnsupportedEncodingException var3) {
            ht.c(var3, "AbstractProtocalHandler", "strReEncoder");
         } catch (Exception var4) {
            ht.c(var4, "AbstractProtocalHandler", "strReEncoderException");
         }

         return "";
      }
   }
}
