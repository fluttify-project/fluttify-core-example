package com.amap.api.mapcore.util;

import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.PushbackInputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class jg {
   private int a;
   private int b;
   private boolean c;
   private SSLContext d;
   private Proxy e;
   private volatile boolean f;
   private long g;
   private long h;
   private String i;
   private jg$a j;
   private jd$a k;

   private void b() {
      try {
         UUID var1 = UUID.randomUUID();
         String var2 = var1.toString();
         this.i = var2.replaceAll("-", "").toLowerCase();
      } catch (Throwable var3) {
         hq.a(var3, "ht", "ic");
      }

   }

   jg(int var1, int var2, Proxy var3, boolean var4) {
      this(var1, var2, var3, var4, (jd$a)null);
   }

   jg(int var1, int var2, Proxy var3, boolean var4, jd$a var5) {
      this.f = false;
      this.g = -1L;
      this.h = 0L;
      this.a = var1;
      this.b = var2;
      this.e = var3;
      this.c = hb.a().b(var4);
      if (hb.c()) {
         this.c = false;
      }

      this.k = var5;
      this.b();
      if (this.c) {
         try {
            SSLContext var6 = SSLContext.getInstance("TLS");
            var6.init((KeyManager[])null, (TrustManager[])null, (SecureRandom)null);
            this.d = var6;
         } catch (Throwable var7) {
            hq.a(var7, "ht", "ne");
         }
      }

      this.j = new jg$a((jg$1)null);
   }

   void a() {
      this.f = true;
   }

   void a(long var1) {
      this.h = var1;
   }

   void b(long var1) {
      this.g = var1;
   }

   void a(String var1, boolean var2, String var3, Map<String, String> var4, Map<String, String> var5, byte[] var6, jf$a var7) {
      InputStream var8 = null;
      HttpURLConnection var9 = null;

      try {
         if (var7 != null) {
            String var10 = a(var5);
            StringBuffer var11 = new StringBuffer();
            var11.append(var1);
            if (var10 != null) {
               var11.append("?").append(var10);
            }

            boolean var12 = var6 != null && var6.length > 0;
            var9 = this.a(var11.toString(), var2, var3, var4, var12);
            String var13 = "bytes=" + this.h + "-";
            var9.setRequestProperty("RANGE", var13);
            if (var12) {
               DataOutputStream var14 = new DataOutputStream(var9.getOutputStream());
               var14.write(var6);
               var14.close();
            }

            var9.connect();
            int var39 = var9.getResponseCode();
            if (var39 != 200 & var39 != 206) {
               var7.onException(new gt("网络异常原因：" + var9.getResponseMessage() + " 网络异常状态码：" + var39));
            }

            var8 = var9.getInputStream();

            int var16;
            for(byte[] var15 = new byte[1024]; !Thread.interrupted() && !this.f && (var16 = var8.read(var15, 0, 1024)) > 0 && (this.g == -1L || this.h < this.g); this.h += (long)var16) {
               if (var16 == 1024) {
                  var7.onDownload(var15, this.h);
               } else {
                  byte[] var17 = new byte[var16];
                  System.arraycopy(var15, 0, var17, 0, var16);
                  var7.onDownload(var17, this.h);
               }
            }

            if (this.f) {
               var7.onStop();
            } else {
               var7.onFinish();
            }

            return;
         }
      } catch (Throwable var37) {
         var7.onException(var37);
         return;
      } finally {
         if (var8 != null) {
            try {
               var8.close();
            } catch (IOException var35) {
               hq.a((Throwable)var35, "ht", "mdr");
            } catch (Throwable var36) {
               hq.a(var36, "ht", "mdr");
            }
         }

         if (var9 != null) {
            try {
               var9.disconnect();
            } catch (Throwable var34) {
               hq.a(var34, "ht", "mdr");
            }
         }

      }

   }

   Map<String, String> a(String var1, boolean var2, String var3, Map<String, String> var4, Map<String, String> var5, boolean var6) throws gt {
      HttpURLConnection var7 = null;

      try {
         String var8 = a(var5);
         StringBuffer var9 = new StringBuffer();
         var9.append(var1);
         if (var8 != null) {
            var9.append("?").append(var8);
         }

         var7 = this.a(var9.toString(), var2, var3, var4, false);
         int var10 = var7.getResponseCode();
         short var11 = 400;
         if (var10 >= var11) {
            throw new gt("http读取header失败");
         } else {
            HashMap var13 = new HashMap();
            int var14 = 0;

            while(true) {
               if (var14 < 50) {
                  String var12 = var7.getHeaderFieldKey(var14);
                  if (var12 != null) {
                     String var15 = var7.getHeaderField(var12);
                     var13.put(var12.toLowerCase(), var15);
                     ++var14;
                     continue;
                  }
               }

               HashMap var41 = var13;
               return var41;
            }
         }
      } catch (ConnectException var31) {
         throw new gt("http连接失败 - ConnectionException");
      } catch (MalformedURLException var32) {
         throw new gt("url异常 - MalformedURLException");
      } catch (UnknownHostException var33) {
         throw new gt("未知主机 - UnKnowHostException");
      } catch (SocketException var34) {
         throw new gt("socket 连接异常 - SocketException");
      } catch (SocketTimeoutException var35) {
         throw new gt("socket 连接超时 - SocketTimeoutException");
      } catch (InterruptedIOException var36) {
         throw new gt("未知的错误");
      } catch (IOException var37) {
         throw new gt("IO 操作异常 - IOException");
      } catch (gt var38) {
         throw var38;
      } catch (Throwable var39) {
         var39.printStackTrace();
         throw new gt("未知的错误");
      } finally {
         if (var7 != null) {
            try {
               var7.disconnect();
            } catch (Throwable var30) {
               hq.a(var30, "hth", "mgr");
            }
         }

      }
   }

   jk b(String var1, boolean var2, String var3, Map<String, String> var4, Map<String, String> var5, boolean var6) throws gt {
      HttpURLConnection var7 = null;

      jk var10;
      try {
         String var8 = a(var5);
         StringBuffer var9 = new StringBuffer();
         var9.append(var1);
         if (var8 != null) {
            var9.append("?").append(var8);
         }

         var7 = this.a(var9.toString(), var2, var3, var4, false);
         var10 = this.a(var7, var6);
      } catch (ConnectException var27) {
         throw new gt("http连接失败 - ConnectionException");
      } catch (MalformedURLException var28) {
         throw new gt("url异常 - MalformedURLException");
      } catch (UnknownHostException var29) {
         throw new gt("未知主机 - UnKnowHostException");
      } catch (SocketException var30) {
         throw new gt("socket 连接异常 - SocketException");
      } catch (SocketTimeoutException var31) {
         throw new gt("socket 连接超时 - SocketTimeoutException");
      } catch (InterruptedIOException var32) {
         throw new gt("未知的错误");
      } catch (IOException var33) {
         throw new gt("IO 操作异常 - IOException");
      } catch (gt var34) {
         throw var34;
      } catch (Throwable var35) {
         var35.printStackTrace();
         throw new gt("未知的错误");
      } finally {
         if (var7 != null) {
            try {
               var7.disconnect();
            } catch (Throwable var26) {
               hq.a(var26, "ht", "mgr");
            }
         }

      }

      return var10;
   }

   jk a(String var1, boolean var2, String var3, Map<String, String> var4, byte[] var5, boolean var6) throws gt {
      HttpURLConnection var7 = null;

      jk var35;
      try {
         var7 = this.a(var1, var2, var3, var4, true);
         if (var5 != null && var5.length > 0) {
            DataOutputStream var8 = new DataOutputStream(var7.getOutputStream());
            var8.write(var5);
            var8.close();
         }

         var35 = this.a(var7, var6);
      } catch (ConnectException var25) {
         var25.printStackTrace();
         throw new gt("http连接失败 - ConnectionException");
      } catch (MalformedURLException var26) {
         var26.printStackTrace();
         throw new gt("url异常 - MalformedURLException");
      } catch (UnknownHostException var27) {
         var27.printStackTrace();
         throw new gt("未知主机 - UnKnowHostException");
      } catch (SocketException var28) {
         var28.printStackTrace();
         throw new gt("socket 连接异常 - SocketException");
      } catch (SocketTimeoutException var29) {
         var29.printStackTrace();
         throw new gt("socket 连接超时 - SocketTimeoutException");
      } catch (InterruptedIOException var30) {
         throw new gt("未知的错误");
      } catch (IOException var31) {
         var31.printStackTrace();
         throw new gt("IO 操作异常 - IOException");
      } catch (gt var32) {
         hq.a((Throwable)var32, "ht", "mPt");
         throw var32;
      } catch (Throwable var33) {
         hq.a(var33, "ht", "mPt");
         throw new gt("未知的错误");
      } finally {
         if (var7 != null) {
            try {
               var7.disconnect();
            } catch (Throwable var24) {
               hq.a(var24, "ht", "mPt");
            }
         }

      }

      return var35;
   }

   private String a(int var1, String var2, Map<String, String> var3) {
      String var4 = "";
      switch(var1) {
      case 1:
         var4 = jd.b;
      default:
         if (TextUtils.isEmpty(var4)) {
            return var2;
         } else {
            Uri var5 = Uri.parse(var2);
            String var6 = var5.getHost();
            Uri var7 = var5.buildUpon().encodedAuthority(var4).build();
            var2 = var7.toString();
            if (var3 != null) {
               var3.put("targetHost", var6);
            }

            if (this.c) {
               this.j.b(var4);
            }

            return var2;
         }
      }
   }

   HttpURLConnection a(String var1, boolean var2, String var3, Map<String, String> var4, boolean var5) throws IOException {
      gz.b();
      URLConnection var7 = null;
      if (var4 == null) {
         var4 = new HashMap();
      }

      jg$b var8 = this.j.a();
      if (var2 && !TextUtils.isEmpty(var3)) {
         var8 = this.j.a(var3);
      }

      var1 = this.a(jd.a, var1, (Map)var4);
      if (this.c) {
         var1 = hb.a(var1);
      }

      URL var9 = new URL(var1);
      if (this.k != null) {
         var7 = this.k.a(this.e, var9);
      }

      if (var7 == null) {
         if (this.e != null) {
            var7 = var9.openConnection(this.e);
         } else {
            var7 = var9.openConnection();
         }
      }

      Object var6;
      if (this.c) {
         var6 = (HttpsURLConnection)var7;
         ((HttpsURLConnection)var6).setSSLSocketFactory(this.d.getSocketFactory());
         ((HttpsURLConnection)var6).setHostnameVerifier(var8);
      } else {
         var6 = (HttpURLConnection)var7;
      }

      if (VERSION.SDK != null && VERSION.SDK_INT > 13) {
         ((HttpURLConnection)var6).setRequestProperty("Connection", "close");
      }

      this.a((Map)var4, (HttpURLConnection)var6);
      if (var5) {
         ((HttpURLConnection)var6).setRequestMethod("POST");
         ((HttpURLConnection)var6).setUseCaches(false);
         ((HttpURLConnection)var6).setDoInput(true);
         ((HttpURLConnection)var6).setDoOutput(true);
      } else {
         ((HttpURLConnection)var6).setRequestMethod("GET");
         ((HttpURLConnection)var6).setDoInput(true);
      }

      return (HttpURLConnection)var6;
   }

   private jk a(HttpURLConnection var1, boolean var2) throws gt, IOException {
      ByteArrayOutputStream var3 = null;
      InputStream var4 = null;
      Object var5 = null;
      PushbackInputStream var6 = null;
      String var7 = "";

      jk var14;
      try {
         var1.connect();
         Map var8 = var1.getHeaderFields();
         int var9 = var1.getResponseCode();
         if (var8 != null) {
            List var10 = (List)var8.get("gsid");
            if (var10 != null && var10.size() > 0) {
               var7 = (String)var10.get(0);
            }
         }

         if (var9 != 200) {
            gt var35 = new gt("网络异常原因：" + var1.getResponseMessage() + " 网络异常状态码：" + var9 + "  " + var7 + " " + this.i, var7);
            var35.a(var9);
            throw var35;
         }

         var3 = new ByteArrayOutputStream();
         var4 = var1.getInputStream();
         var6 = new PushbackInputStream(var4, 2);
         byte[] var34 = new byte[2];
         var6.read(var34);
         var6.unread(var34);
         if (var34[0] == 31 && var34[1] == -117 && !var2) {
            var5 = new GZIPInputStream(var6);
         } else {
            var5 = var6;
         }

         boolean var11 = false;
         byte[] var12 = new byte[1024];

         int var36;
         while((var36 = ((InputStream)var5).read(var12)) != -1) {
            var3.write(var12, 0, var36);
         }

         ht.c();
         jk var13 = new jk();
         var13.a = var3.toByteArray();
         var13.b = var8;
         var13.c = this.i;
         var13.d = var7;
         var14 = var13;
      } catch (IOException var32) {
         throw new gt("IO 操作异常 - IOException", var7);
      } finally {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var31) {
               hq.a(var31, "ht", "par");
            }
         }

         if (var4 != null) {
            try {
               var4.close();
            } catch (Throwable var30) {
               hq.a(var30, "ht", "par");
            }
         }

         if (var6 != null) {
            try {
               var6.close();
            } catch (Throwable var29) {
               hq.a(var29, "ht", "par");
            }
         }

         if (var5 != null) {
            try {
               ((InputStream)var5).close();
            } catch (Throwable var28) {
               hq.a(var28, "ht", "par");
            }
         }

      }

      return var14;
   }

   private void a(Map<String, String> var1, HttpURLConnection var2) {
      if (var1 != null) {
         Iterator var3 = var1.keySet().iterator();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            var2.addRequestProperty(var4, (String)var1.get(var4));
         }
      }

      try {
         var2.addRequestProperty("csid", this.i);
      } catch (Throwable var5) {
         hq.a(var5, "ht", "adh");
      }

      var2.setConnectTimeout(this.a);
      var2.setReadTimeout(this.b);
   }

   static String a(Map<String, String> var0) {
      if (var0 != null) {
         StringBuilder var1 = new StringBuilder();
         Iterator var2 = var0.entrySet().iterator();

         while(var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            String var4 = (String)var3.getKey();
            String var5 = (String)var3.getValue();
            if (var5 == null) {
               var5 = "";
            }

            if (var1.length() > 0) {
               var1.append("&");
            }

            var1.append(URLEncoder.encode(var4));
            var1.append("=");
            var1.append(URLEncoder.encode(var5));
         }

         return var1.toString();
      } else {
         return null;
      }
   }
}
