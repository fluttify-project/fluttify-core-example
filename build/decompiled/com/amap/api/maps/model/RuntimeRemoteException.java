package com.amap.api.maps.model;

import android.os.RemoteException;

public final class RuntimeRemoteException extends RuntimeException {
   private static final long serialVersionUID = -3541841807100437802L;

   public RuntimeRemoteException(String var1) {
      super(var1);
   }

   public RuntimeRemoteException(RemoteException var1) {
      super(var1);
   }
}
