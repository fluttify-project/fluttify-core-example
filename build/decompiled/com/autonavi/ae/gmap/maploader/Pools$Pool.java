package com.autonavi.ae.gmap.maploader;

public interface Pools$Pool<T> {
   T acquire();

   boolean release(T var1);

   void destory();
}
