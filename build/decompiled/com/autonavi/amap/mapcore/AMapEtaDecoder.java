package com.autonavi.amap.mapcore;

public class AMapEtaDecoder {
   public AMapEtaDecoder() {
   }

   public static native LinkInfo[] nativeDecode(byte[] var0);
}
