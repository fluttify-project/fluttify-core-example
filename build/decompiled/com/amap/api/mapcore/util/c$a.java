package com.amap.api.mapcore.util;

abstract class c$a implements Runnable {
   boolean b;
   boolean c;
   int d;
   int e;
   int f;
   int g;

   private c$a() {
      this.b = false;
      this.c = false;
   }

   public void run() {
      this.b = false;
   }
}
