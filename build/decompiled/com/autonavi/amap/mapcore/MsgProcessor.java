package com.autonavi.amap.mapcore;

import android.os.Build;
import android.os.Build.VERSION;
import com.amap.api.mapcore.util.iv;

public class MsgProcessor {
   public MsgProcessor() {
   }

   public void nativeInitMsg() {
      try {
         this.nativeInit(VERSION.SDK_INT, Build.MODEL);
      } catch (Throwable var2) {
         ;
      }

   }

   public native void nativeInit(int var1, String var2);

   public void nativeMsgProcessor(String var1) {
      iv.a().a(var1);
   }

   public native void nativeCall();
}
