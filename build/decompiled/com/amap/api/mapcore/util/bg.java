package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import org.json.JSONException;

public class bg {
   private Context i;
   private boolean j = true;
   public static String a = "";
   public static boolean b = false;
   List<bf> c = new Vector();
   private static volatile bg k;
   private bg$a l;
   private bp m;
   public static String d = "";
   private bv n;
   private ExecutorService o = null;
   private ExecutorService p = null;
   private ExecutorService q = null;
   bg$b e = null;
   public bk f;
   bm g;
   bj h = null;
   private boolean r = true;

   private bg(Context var1) {
      this.i = var1;
   }

   public static bg a(Context var0) {
      if (k == null) {
         Class var1 = bg.class;
         synchronized(bg.class) {
            if (k == null && !b) {
               k = new bg(var0.getApplicationContext());
            }
         }
      }

      return k;
   }

   public void a() {
      this.n = bv.a(this.i.getApplicationContext());
      this.h();
      Looper var1 = this.i.getMainLooper();
      this.e = new bg$b(this, var1);
      this.f = new bk(this.i, this.e);
      this.m = bp.a(1);
      g(fi.c(this.i));

      try {
         this.i();
      } catch (Throwable var8) {
         var8.printStackTrace();
      }

      List var2 = this.c;
      synchronized(this.c) {
         Iterator var3 = this.f.a().iterator();

         while(var3.hasNext()) {
            OfflineMapProvince var4 = (OfflineMapProvince)var3.next();
            Iterator var5 = var4.getCityList().iterator();

            while(var5.hasNext()) {
               OfflineMapCity var6 = (OfflineMapCity)var5.next();
               if (var6 != null) {
                  this.c.add(new bf(this.i, var6));
               }
            }
         }
      }

      this.h = new bj(this.i);
      this.h.start();
   }

   private void h() {
      try {
         String var1 = "000001";
         bq var2 = this.n.a(var1);
         if (var2 != null) {
            this.n.c(var1);
            var2.c("100000");
            this.n.a(var2);
         }
      } catch (Throwable var3) {
         ht.c(var3, "OfflineDownloadManager", "changeBadCase");
      }

   }

   private void i() {
      if (!"".equals(fi.c(this.i))) {
         File var1 = new File(fi.c(this.i) + "offlinemapv4.png");
         String var2 = null;
         if (!var1.exists()) {
            var2 = cd.a(this.i, "offlinemapv4.png");
         } else {
            var2 = cd.c(var1);
         }

         if (var2 != null) {
            try {
               this.h(var2);
            } catch (JSONException var4) {
               if (var1.exists()) {
                  var1.delete();
               }

               ht.c(var4, "MapDownloadManager", "paseJson io");
               var4.printStackTrace();
            }
         }

      }
   }

   private void h(String var1) throws JSONException {
      List var2 = cd.a(var1, this.i.getApplicationContext());
      if (var2 != null && var2.size() != 0) {
         if (this.f != null) {
            this.f.a(var2);
         }

      }
   }

   private void j() {
      ArrayList var1 = this.n.a();
      Iterator var2 = var1.iterator();

      while(true) {
         bq var3;
         bf var4;
         do {
            do {
               do {
                  do {
                     if (!var2.hasNext()) {
                        return;
                     }

                     var3 = (bq)var2.next();
                  } while(var3 == null);
               } while(var3.d() == null);
            } while(var3.f().length() < 1);

            if (var3.l != 4 && var3.l != 7 && var3.l >= 0) {
               var3.l = 3;
            }

            var4 = this.i(var3.d());
         } while(var4 == null);

         String var5 = var3.e();
         if (var5 != null && this.a(d, var5)) {
            var4.a(7);
         } else {
            var4.a(var3.l);
            var4.setCompleteCode(var3.h());
         }

         if (var3.e().length() > 0) {
            var4.setVersion(var3.e());
         }

         List var6 = this.n.b(var3.f());
         StringBuffer var7 = new StringBuffer();
         Iterator var8 = var6.iterator();

         while(var8.hasNext()) {
            String var9 = (String)var8.next();
            var7.append(var9);
            var7.append(";");
         }

         var4.a(var7.toString());
         if (this.f != null) {
            this.f.a(var4);
         }
      }
   }

   public void a(ArrayList<bq> var1) {
      this.j();
      if (this.l != null) {
         try {
            this.l.a();
         } catch (Throwable var3) {
            ht.c(var3, "OfflineDownloadManager", "verifyCallBack");
         }
      }

   }

   public void a(String var1) {
      try {
         if (var1 == null) {
            if (this.l != null) {
               this.l.b((bf)null);
            }

            return;
         }

         if (this.o == null) {
            LinkedBlockingQueue var2 = new LinkedBlockingQueue();
            byte var3 = 1;
            byte var4 = 1;
            TimeUnit var5 = TimeUnit.SECONDS;
            this.o = new ThreadPoolExecutor(var3, var3 * 2, (long)var4, var5, var2, new ev("AMapOfflineCheckUpdate"), new AbortPolicy());
         }

         this.o.execute(new bg$1(this, var1));
      } catch (Throwable var6) {
         ht.c(var6, "OfflineDownloadManager", "checkUpdate");
      }

   }

   private void k() throws AMapException {
      if (!fi.d(this.i)) {
         throw new AMapException("http连接失败 - ConnectionException");
      }
   }

   protected void b() throws AMapException {
      if (this.f != null) {
         bn var1 = new bn(this.i, "");
         var1.a(this.i);
         List var2 = (List)var1.c();
         if (this.c != null) {
            this.f.a(var2);
         }

         if (this.c != null) {
            List var3 = this.c;
            synchronized(this.c) {
               Iterator var4 = this.f.a().iterator();

               while(var4.hasNext()) {
                  OfflineMapProvince var5 = (OfflineMapProvince)var4.next();
                  Iterator var6 = var5.getCityList().iterator();

                  label55:
                  while(var6.hasNext()) {
                     OfflineMapCity var7 = (OfflineMapCity)var6.next();
                     Iterator var8 = this.c.iterator();

                     while(true) {
                        while(true) {
                           bf var9;
                           do {
                              if (!var8.hasNext()) {
                                 continue label55;
                              }

                              var9 = (bf)var8.next();
                           } while(!var7.getPinyin().equals(var9.getPinyin()));

                           String var10 = var9.getVersion();
                           if (var9.getState() == 4 && d.length() > 0 && this.a(d, var10)) {
                              var9.j();
                              var9.setUrl(var7.getUrl());
                              var9.t();
                           } else {
                              var9.setCity(var7.getCity());
                              var9.setUrl(var7.getUrl());
                              var9.t();
                              var9.setAdcode(var7.getAdcode());
                              var9.setVersion(var7.getVersion());
                              var9.setSize(var7.getSize());
                              var9.setCode(var7.getCode());
                              var9.setJianpin(var7.getJianpin());
                              var9.setPinyin(var7.getPinyin());
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   private boolean a(String var1, String var2) {
      try {
         for(int var3 = 0; var3 < var2.length(); ++var3) {
            if (var1.charAt(var3) > var2.charAt(var3)) {
               return true;
            }

            if (var1.charAt(var3) < var2.charAt(var3)) {
               return false;
            }
         }
      } catch (Throwable var4) {
         ;
      }

      return false;
   }

   public boolean b(String var1) {
      bf var2 = this.i(var1);
      return var2 != null;
   }

   public void c(String var1) {
      bf var2 = this.i(var1);
      if (var2 == null) {
         if (this.l != null) {
            try {
               this.l.c(var2);
            } catch (Throwable var4) {
               ht.c(var4, "OfflineDownloadManager", "remove");
            }
         }

      } else {
         this.d(var2);
         this.a(var2, true);
      }
   }

   public void a(bf var1) {
      this.a(var1, false);
   }

   private void a(bf var1, boolean var2) {
      if (this.g == null) {
         this.g = new bm(this.i);
      }

      if (this.p == null) {
         LinkedBlockingQueue var3 = new LinkedBlockingQueue();
         byte var4 = 1;
         byte var5 = 1;
         TimeUnit var6 = TimeUnit.SECONDS;
         this.p = new ThreadPoolExecutor(var4, var4 * 2, (long)var5, var6, var3, new ev("AMapOfflineRemove"), new AbortPolicy());
      }

      try {
         this.p.execute(new bg$2(this, var1, var2));
      } catch (Throwable var7) {
         ht.c(var7, "requestDelete", "removeExcecRunnable");
      }

   }

   public void b(bf var1) {
      try {
         if (this.m != null) {
            this.m.a(var1, this.i, (AMap)null);
         }
      } catch (gt var3) {
         var3.printStackTrace();
      }

   }

   public void c(bf var1) {
      if (this.f != null) {
         this.f.a(var1);
      }

      if (this.e != null) {
         Message var2 = this.e.obtainMessage();
         var2.obj = var1;
         this.e.sendMessage(var2);
      }

   }

   public void c() {
      List var1 = this.c;
      synchronized(this.c) {
         Iterator var2 = this.c.iterator();

         while(true) {
            bf var3;
            do {
               if (!var2.hasNext()) {
                  return;
               }

               var3 = (bf)var2.next();
            } while(!var3.c().equals(var3.c) && !var3.c().equals(var3.b));

            this.d(var3);
            var3.g();
         }
      }
   }

   public void d() {
      List var1 = this.c;
      synchronized(this.c) {
         Iterator var2 = this.c.iterator();

         while(var2.hasNext()) {
            bf var3 = (bf)var2.next();
            if (var3.c().equals(var3.c)) {
               var3.g();
               break;
            }
         }

      }
   }

   public void e() {
      if (this.o != null && !this.o.isShutdown()) {
         this.o.shutdownNow();
      }

      if (this.q != null && !this.q.isShutdown()) {
         this.q.shutdownNow();
      }

      if (this.h != null) {
         if (this.h.isAlive()) {
            this.h.interrupt();
         }

         this.h = null;
      }

      if (this.e != null) {
         this.e.removeCallbacksAndMessages((Object)null);
         this.e = null;
      }

      if (this.m != null) {
         this.m.b();
      }

      if (this.f != null) {
         this.f.g();
      }

      f();
      this.j = true;
      this.g();
   }

   public static void f() {
      k = null;
      b = true;
   }

   private bf i(String var1) {
      if (var1 != null && var1.length() >= 1) {
         List var2 = this.c;
         synchronized(this.c) {
            Iterator var3 = this.c.iterator();

            bf var4;
            do {
               if (!var3.hasNext()) {
                  return null;
               }

               var4 = (bf)var3.next();
            } while(!var1.equals(var4.getCity()) && !var1.equals(var4.getPinyin()));

            return var4;
         }
      } else {
         return null;
      }
   }

   private bf j(String var1) {
      if (var1 != null && var1.length() >= 1) {
         List var2 = this.c;
         synchronized(this.c) {
            Iterator var3 = this.c.iterator();

            bf var4;
            do {
               if (!var3.hasNext()) {
                  return null;
               }

               var4 = (bf)var3.next();
            } while(!var1.equals(var4.getCode()));

            return var4;
         }
      } else {
         return null;
      }
   }

   public void d(String var1) throws AMapException {
      bf var2 = this.i(var1);
      if (var1 != null && var1.length() >= 1 && var2 != null) {
         this.f(var2);
      } else {
         throw new AMapException("无效的参数 - IllegalArgumentException");
      }
   }

   public void e(String var1) throws AMapException {
      bf var2 = this.j(var1);
      if (var2 != null) {
         this.f(var2);
      } else {
         throw new AMapException("无效的参数 - IllegalArgumentException");
      }
   }

   private void f(bf var1) throws AMapException {
      this.k();
      if (var1 == null) {
         throw new AMapException("无效的参数 - IllegalArgumentException");
      } else {
         if (this.q == null) {
            LinkedBlockingQueue var2 = new LinkedBlockingQueue();
            byte var3 = 1;
            byte var4 = 1;
            TimeUnit var5 = TimeUnit.SECONDS;
            this.q = new ThreadPoolExecutor(var3, var3 * 2, (long)var4, var5, var2, new ev("AMapOfflineDownload"), new AbortPolicy());
         }

         try {
            this.q.execute(new bg$3(this, var1));
         } catch (Throwable var6) {
            ht.c(var6, "startDownload", "downloadExcecRunnable");
         }

      }
   }

   public void d(bf var1) {
      if (this.m != null) {
         this.m.a(var1);
      }

   }

   public void e(bf var1) {
      if (this.m != null) {
         this.m.b(var1);
      }

   }

   public void a(bg$a var1) {
      this.l = var1;
   }

   public void g() {
      synchronized(this) {
         this.l = null;
      }
   }

   public String f(String var1) {
      String var2 = "";
      if (var1 == null) {
         return var2;
      } else {
         bf var3 = this.i(var1);
         if (var3 == null) {
            return var2;
         } else {
            var2 = var3.getAdcode();
            return var2;
         }
      }
   }

   public static void g(String var0) {
      a = var0;
   }
}
