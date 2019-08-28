package com.amap.api.mapcore.util;

public class gt extends Exception {
   private String a;
   private String b;
   private String c;
   private String d;
   private int e;

   public gt(String var1) {
      super(var1);
      this.a = "未知的错误";
      this.b = "";
      this.c = "1900";
      this.d = "UnknownError";
      this.e = -1;
      this.a = var1;
      this.a(var1);
   }

   public gt(String var1, String var2) {
      this(var1);
      this.b = var2;
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public String d() {
      return this.b;
   }

   public void a(int var1) {
      this.e = var1;
   }

   private void a(String var1) {
      if ("IO 操作异常 - IOException".equals(var1)) {
         this.e = 21;
         this.c = "1902";
         this.d = "IOException";
      } else if ("socket 连接异常 - SocketException".equals(var1)) {
         this.e = 22;
      } else if ("socket 连接超时 - SocketTimeoutException".equals(var1)) {
         this.e = 23;
         this.c = "1802";
         this.d = "SocketTimeoutException";
      } else if ("无效的参数 - IllegalArgumentException".equals(var1)) {
         this.e = 24;
         this.c = "1901";
         this.d = "IllegalArgumentException";
      } else if ("空指针异常 - NullPointException".equals(var1)) {
         this.e = 25;
         this.c = "1903";
         this.d = "NullPointException";
      } else if ("url异常 - MalformedURLException".equals(var1)) {
         this.e = 26;
         this.c = "1803";
         this.d = "MalformedURLException";
      } else if ("未知主机 - UnKnowHostException".equals(var1)) {
         this.e = 27;
         this.c = "1804";
         this.d = "UnknownHostException";
      } else if ("服务器连接失败 - UnknownServiceException".equals(var1)) {
         this.e = 28;
         this.c = "1805";
         this.d = "CannotConnectToHostException";
      } else if ("协议解析错误 - ProtocolException".equals(var1)) {
         this.e = 29;
         this.c = "1801";
         this.d = "ProtocolException";
      } else if ("http连接失败 - ConnectionException".equals(var1)) {
         this.e = 30;
         this.c = "1806";
         this.d = "ConnectionException";
      } else if ("未知的错误".equals(var1)) {
         this.e = 31;
      } else if ("key鉴权失败".equals(var1)) {
         this.e = 32;
      } else if ("requeust is null".equals(var1)) {
         this.e = 1;
      } else if ("request url is empty".equals(var1)) {
         this.e = 2;
      } else if ("response is null".equals(var1)) {
         this.e = 3;
      } else if ("thread pool has exception".equals(var1)) {
         this.e = 4;
      } else if ("sdk name is invalid".equals(var1)) {
         this.e = 5;
      } else if ("sdk info is null".equals(var1)) {
         this.e = 6;
      } else if ("sdk packages is null".equals(var1)) {
         this.e = 7;
      } else if ("线程池为空".equals(var1)) {
         this.e = 8;
      } else if ("获取对象错误".equals(var1)) {
         this.e = 101;
      } else {
         this.e = -1;
      }

   }
}
