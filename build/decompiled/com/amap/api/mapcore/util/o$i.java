package com.amap.api.mapcore.util;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

class o$i extends Thread {
   private boolean a;
   private boolean b;
   private boolean c;
   private boolean d;
   private boolean e;
   private boolean f;
   private boolean g;
   private boolean h;
   private boolean i;
   private boolean j;
   private boolean k;
   private int l = 0;
   private int m = 0;
   private int n = 1;
   private boolean o = true;
   private boolean p;
   private ArrayList<Runnable> q = new ArrayList();
   private boolean r = true;
   private o$h s;
   private WeakReference<o> t;

   o$i(WeakReference<o> var1) {
      this.t = var1;
   }

   public void run() {
      this.setName("GLThread " + this.getId());

      try {
         this.l();
      } catch (InterruptedException var6) {
         ;
      } finally {
         com.amap.api.mapcore.util.o.e().a(this);
      }

   }

   private void j() {
      if (this.i) {
         this.i = false;
         this.s.e();
      }

   }

   private void k() {
      if (this.h) {
         this.s.f();
         this.h = false;
         com.amap.api.mapcore.util.o.e().c(this);
      }

   }

   private void l() throws InterruptedException {
      this.s = new o$h(this.t);
      this.h = false;
      this.i = false;

      try {
         GL10 var1 = null;
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         boolean var5 = false;
         boolean var6 = false;
         boolean var7 = false;
         boolean var8 = false;
         boolean var9 = false;
         int var10 = 0;
         int var11 = 0;
         Runnable var12 = null;

         while(true) {
            while(true) {
               synchronized(com.amap.api.mapcore.util.o.e()) {
                  while(true) {
                     if (this.a) {
                        return;
                     }

                     if (!this.q.isEmpty()) {
                        var12 = (Runnable)this.q.remove(0);
                        break;
                     }

                     boolean var14 = false;
                     if (this.d != this.c) {
                        var14 = this.c;
                        this.d = this.c;
                        com.amap.api.mapcore.util.o.e().notifyAll();
                     }

                     if (this.k) {
                        this.j();
                        this.k();
                        this.k = false;
                        var9 = true;
                     }

                     if (var5) {
                        this.j();
                        this.k();
                        var5 = false;
                     }

                     if (var14 && this.i) {
                        this.j();
                     }

                     if (var14 && this.h) {
                        o var15 = (o)this.t.get();
                        boolean var16 = var15 == null ? false : com.amap.api.mapcore.util.o.g(var15);
                        if (!var16 || com.amap.api.mapcore.util.o.e().a()) {
                           this.k();
                        }
                     }

                     if (var14 && com.amap.api.mapcore.util.o.e().b()) {
                        this.s.f();
                     }

                     if (!this.e && !this.g) {
                        if (this.i) {
                           this.j();
                        }

                        this.g = true;
                        this.f = false;
                        com.amap.api.mapcore.util.o.e().notifyAll();
                     }

                     if (this.e && this.g) {
                        this.g = false;
                        com.amap.api.mapcore.util.o.e().notifyAll();
                     }

                     if (var8) {
                        var7 = false;
                        var8 = false;
                        this.p = true;
                        com.amap.api.mapcore.util.o.e().notifyAll();
                     }

                     if (this.m()) {
                        if (!this.h) {
                           if (var9) {
                              var9 = false;
                           } else if (com.amap.api.mapcore.util.o.e().b(this)) {
                              try {
                                 this.s.a();
                              } catch (RuntimeException var37) {
                                 com.amap.api.mapcore.util.o.e().c(this);
                                 throw var37;
                              }

                              this.h = true;
                              var2 = true;
                              com.amap.api.mapcore.util.o.e().notifyAll();
                           }
                        }

                        if (this.h && !this.i) {
                           this.i = true;
                           var3 = true;
                           var4 = true;
                           var6 = true;
                        }

                        if (this.i) {
                           if (this.r) {
                              var6 = true;
                              var10 = this.l;
                              var11 = this.m;
                              var7 = true;
                              var3 = true;
                              this.r = false;
                           }

                           this.o = false;
                           com.amap.api.mapcore.util.o.e().notifyAll();
                           break;
                        }
                     }

                     com.amap.api.mapcore.util.o.e().wait();
                  }
               }

               if (var12 != null) {
                  var12.run();
                  var12 = null;
               } else {
                  if (var3) {
                     if (!this.s.b()) {
                        synchronized(com.amap.api.mapcore.util.o.e()) {
                           this.j = true;
                           this.f = true;
                           com.amap.api.mapcore.util.o.e().notifyAll();
                           continue;
                        }
                     }

                     synchronized(com.amap.api.mapcore.util.o.e()) {
                        this.j = true;
                        com.amap.api.mapcore.util.o.e().notifyAll();
                     }

                     var3 = false;
                  }

                  if (var4) {
                     var1 = (GL10)this.s.c();
                     com.amap.api.mapcore.util.o.e().a(var1);
                     var4 = false;
                  }

                  o var13;
                  if (var2) {
                     var13 = (o)this.t.get();
                     if (var13 != null) {
                        com.amap.api.mapcore.util.o.h(var13).onSurfaceCreated(var1, this.s.d);
                     }

                     var2 = false;
                  }

                  if (var6) {
                     var13 = (o)this.t.get();
                     if (var13 != null) {
                        com.amap.api.mapcore.util.o.h(var13).onSurfaceChanged(var1, var10, var11);
                     }

                     var6 = false;
                  }

                  var13 = (o)this.t.get();
                  if (var13 != null) {
                     com.amap.api.mapcore.util.o.h(var13).onDrawFrame(var1);
                  }

                  int var40 = this.s.d();
                  switch(var40) {
                  case 12288:
                     break;
                  case 12302:
                     var5 = true;
                     break;
                  default:
                     o$h.a("GLThread", "eglSwapBuffers", var40);
                     synchronized(com.amap.api.mapcore.util.o.e()) {
                        this.f = true;
                        com.amap.api.mapcore.util.o.e().notifyAll();
                     }
                  }

                  if (var7) {
                     var8 = true;
                  }
               }
            }
         }
      } finally {
         synchronized(com.amap.api.mapcore.util.o.e()) {
            this.j();
            this.k();
         }
      }
   }

   public boolean a() {
      return this.h && this.i && this.m();
   }

   private boolean m() {
      return !this.d && this.e && !this.f && this.l > 0 && this.m > 0 && (this.o || this.n == 1);
   }

   public void a(int var1) {
      if (0 <= var1 && var1 <= 1) {
         synchronized(com.amap.api.mapcore.util.o.e()) {
            this.n = var1;
            com.amap.api.mapcore.util.o.e().notifyAll();
         }
      } else {
         throw new IllegalArgumentException("renderMode");
      }
   }

   public int b() {
      synchronized(com.amap.api.mapcore.util.o.e()) {
         return this.n;
      }
   }

   public void c() {
      synchronized(com.amap.api.mapcore.util.o.e()) {
         this.o = true;
         com.amap.api.mapcore.util.o.e().notifyAll();
      }
   }

   public void d() {
      synchronized(com.amap.api.mapcore.util.o.e()) {
         this.e = true;
         this.j = false;
         com.amap.api.mapcore.util.o.e().notifyAll();

         while(this.g && !this.j && !this.b) {
            try {
               com.amap.api.mapcore.util.o.e().wait();
            } catch (InterruptedException var4) {
               Thread.currentThread().interrupt();
            }
         }

      }
   }

   public void e() {
      synchronized(com.amap.api.mapcore.util.o.e()) {
         this.e = false;
         com.amap.api.mapcore.util.o.e().notifyAll();

         while(!this.g && !this.b) {
            try {
               com.amap.api.mapcore.util.o.e().wait();
            } catch (InterruptedException var4) {
               Thread.currentThread().interrupt();
            }
         }

      }
   }

   public void f() {
      synchronized(com.amap.api.mapcore.util.o.e()) {
         this.c = true;
         com.amap.api.mapcore.util.o.e().notifyAll();

         while(!this.b && !this.d) {
            try {
               com.amap.api.mapcore.util.o.e().wait();
            } catch (InterruptedException var4) {
               Thread.currentThread().interrupt();
            }
         }

      }
   }

   public void g() {
      synchronized(com.amap.api.mapcore.util.o.e()) {
         this.c = false;
         this.o = true;
         this.p = false;
         com.amap.api.mapcore.util.o.e().notifyAll();

         while(!this.b && this.d && !this.p) {
            try {
               com.amap.api.mapcore.util.o.e().wait();
            } catch (InterruptedException var4) {
               Thread.currentThread().interrupt();
            }
         }

      }
   }

   public void a(int var1, int var2) {
      synchronized(com.amap.api.mapcore.util.o.e()) {
         this.l = var1;
         this.m = var2;
         this.r = true;
         this.o = true;
         this.p = false;
         com.amap.api.mapcore.util.o.e().notifyAll();

         while(!this.b && !this.d && !this.p && this.a()) {
            try {
               com.amap.api.mapcore.util.o.e().wait();
            } catch (InterruptedException var6) {
               Thread.currentThread().interrupt();
            }
         }

      }
   }

   public void h() {
      synchronized(com.amap.api.mapcore.util.o.e()) {
         this.a = true;
         com.amap.api.mapcore.util.o.e().notifyAll();

         while(!this.b) {
            try {
               com.amap.api.mapcore.util.o.e().wait();
            } catch (InterruptedException var4) {
               Thread.currentThread().interrupt();
            }
         }

      }
   }

   public void i() {
      this.k = true;
      com.amap.api.mapcore.util.o.e().notifyAll();
   }

   public void a(Runnable var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("r must not be null");
      } else {
         synchronized(com.amap.api.mapcore.util.o.e()) {
            this.q.add(var1);
            com.amap.api.mapcore.util.o.e().notifyAll();
         }
      }
   }
}
