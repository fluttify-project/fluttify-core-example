package com.amap.api.mapcore.util;

import android.content.Context;

public abstract class gm<T, V> extends eh {
   protected T d;
   protected int e = 1;
   protected Context f;
   protected String g;

   public gm(Context var1, T var2) {
      this.a(var1, var2);
   }

   private void a(Context var1, T var2) {
      this.f = var1;
      this.d = var2;
      this.e = 1;
      this.setSoTimeout(30000);
      this.setConnectionTimeout(30000);
   }

   protected V b(byte[] var1) throws gl {
      String var2 = null;

      try {
         var2 = new String(var1, "utf-8");
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 != null && !"".equals(var2)) {
         go.a(var2, this.g);
         return this.b(var2);
      } else {
         return null;
      }
   }

   protected abstract V b(String var1) throws gl;

   public V a() throws gl {
      return null != this.d ? this.e() : null;
   }

   private V e() throws gl {
      Object var1 = null;
      int var2 = 0;

      while(var2 < this.e) {
         try {
            this.setProxy(hd.a(this.f));
            byte[] var3 = this.makeHttpRequest();
            var1 = this.a(var3);
            var2 = this.e;
         } catch (gt var6) {
            ++var2;
            if (var2 >= this.e) {
               var1 = this.d();
               if (!"http连接失败 - ConnectionException".equals(var6.getMessage()) && !"socket 连接异常 - SocketException".equals(var6.getMessage()) && !"未知的错误".equals(var6.a()) && !"服务器连接失败 - UnknownServiceException".equals(var6.getMessage())) {
                  throw new gl(var6.a());
               }

               throw new gl("http或socket连接失败 - ConnectionException");
            }

            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var5) {
               if (!"http连接失败 - ConnectionException".equals(var6.getMessage()) && !"socket 连接异常 - SocketException".equals(var6.getMessage()) && !"服务器连接失败 - UnknownServiceException".equals(var6.getMessage())) {
                  throw new gl(var6.a());
               }

               throw new gl("http或socket连接失败 - ConnectionException");
            }
         } catch (gl var7) {
            ++var2;
            if (var2 >= this.e) {
               var1 = null;
               throw new gl(var7.a());
            }
         } catch (Throwable var8) {
            throw new gl("未知错误");
         }
      }

      return var1;
   }

   private V a(byte[] var1) throws gl {
      return this.b(var1);
   }

   protected V d() {
      return null;
   }
}
