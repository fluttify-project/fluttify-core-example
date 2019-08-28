package com.amap.api.mapcore.util;

public class gl extends Exception {
   private String a = "";
   private int b = 1000;

   public gl(String var1) {
      super(var1);
      this.a = var1;
      this.a(var1);
   }

   public gl() {
   }

   public String a() {
      return this.a;
   }

   private void a(String var1) {
      if ("用户签名未通过".equals(var1)) {
         this.b = 1001;
      } else if ("用户key不正确或过期".equals(var1)) {
         this.b = 1002;
      } else if ("请求服务不存在".equals(var1)) {
         this.b = 1003;
      } else if ("访问已超出日访问量".equals(var1)) {
         this.b = 1004;
      } else if ("用户访问过于频繁".equals(var1)) {
         this.b = 1005;
      } else if ("用户IP无效".equals(var1)) {
         this.b = 1006;
      } else if ("用户域名无效".equals(var1)) {
         this.b = 1007;
      } else if ("用户MD5安全码未通过".equals(var1)) {
         this.b = 1008;
      } else if ("请求key与绑定平台不符".equals(var1)) {
         this.b = 1009;
      } else if ("IP访问超限".equals(var1)) {
         this.b = 1010;
      } else if ("服务不支持https请求".equals(var1)) {
         this.b = 1011;
      } else if ("权限不足，服务请求被拒绝".equals(var1)) {
         this.b = 1012;
      } else if ("开发者删除了key，key被删除后无法正常使用".equals(var1)) {
         this.b = 1013;
      } else if ("请求服务响应错误".equals(var1)) {
         this.b = 1100;
      } else if ("引擎返回数据异常".equals(var1)) {
         this.b = 1101;
      } else if ("服务端请求链接超时".equals(var1)) {
         this.b = 1102;
      } else if ("读取服务结果超时".equals(var1)) {
         this.b = 1103;
      } else if ("请求参数非法".equals(var1)) {
         this.b = 1200;
      } else if ("缺少必填参数".equals(var1)) {
         this.b = 1201;
      } else if ("请求协议非法".equals(var1)) {
         this.b = 1202;
      } else if ("其他未知错误".equals(var1)) {
         this.b = 1203;
      } else if ("协议解析错误 - ProtocolException".equals(var1)) {
         this.b = 1801;
      } else if ("socket 连接超时 - SocketTimeoutException".equals(var1)) {
         this.b = 1802;
      } else if ("url异常 - MalformedURLException".equals(var1)) {
         this.b = 1803;
      } else if ("未知主机 - UnKnowHostException".equals(var1)) {
         this.b = 1804;
      } else if ("未知错误".equals(var1)) {
         this.b = 1900;
      } else if ("无效的参数 - IllegalArgumentException".equals(var1)) {
         this.b = 1901;
      } else if ("http或socket连接失败 - ConnectionException".equals(var1)) {
         this.b = 1806;
      } else if ("IO 操作异常 - IOException".equals(var1)) {
         this.b = 1902;
      } else if ("空指针异常 - NullPointException".equals(var1)) {
         this.b = 1903;
      } else {
         this.b = 1800;
      }

   }
}
