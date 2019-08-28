package com.amap.api.mapcore.util;

import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class go {
   private static String[] a = new String[]{"com.amap.api.trace", "com.amap.api.trace.core"};

   public static void a(String var0, String var1) throws gl {
      try {
         JSONObject var2 = new JSONObject(var0);
         if (var2 != null && var2.has("errcode")) {
            int var7 = var2.getInt("errcode");
            String var8 = var2.getString("errmsg");
            a(var7, var8, var1);
         } else if (var2.has("status") && var2.has("infocode")) {
            String var3 = var2.getString("status");
            int var4 = var2.getInt("infocode");
            if (!"1".equals(var3)) {
               String var5 = var2.getString("info");
               if ("0".equals(var3)) {
                  a(var4, var5, var1);
               }
            }
         }
      } catch (JSONException var6) {
         throw new gl("协议解析错误 - ProtocolException");
      }
   }

   protected static void a(int var0, String var1, String var2) throws gl {
      switch(var0) {
      case 0:
      case 10000:
         return;
      case 10001:
         throw new gl("用户key不正确或过期");
      case 10002:
         throw new gl("请求服务不存在");
      case 10003:
         throw new gl("访问已超出日访问量");
      case 10004:
         throw new gl("用户访问过于频繁");
      case 10005:
         throw new gl("用户IP无效");
      case 10006:
         throw new gl("用户域名无效");
      case 10007:
         throw new gl("用户签名未通过");
      case 10008:
         throw new gl("用户MD5安全码未通过");
      case 10009:
         throw new gl("请求key与绑定平台不符");
      case 10010:
         throw new gl("IP访问超限");
      case 10011:
         throw new gl("服务不支持https请求");
      case 10012:
         throw new gl("权限不足，服务请求被拒绝");
      case 10013:
         throw new gl("开发者删除了key，key被删除后无法正常使用");
      case 20000:
         throw new gl("请求参数非法");
      case 20001:
         throw new gl("缺少必填参数");
      case 20002:
         throw new gl("请求协议非法");
      case 20003:
         throw new gl("其他未知错误");
      case 30000:
         throw new gl("请求服务响应错误");
      case 30001:
         throw new gl("引擎返回数据异常");
      case 30002:
         throw new gl("服务端请求链接超时");
      case 30003:
         throw new gl("读取服务结果超时");
      default:
         throw new gl(var1);
      }
   }

   public static int a(List<LatLng> var0) {
      int var1 = 0;
      if (var0 != null && var0.size() != 0) {
         for(int var2 = 0; var2 < var0.size() - 1; ++var2) {
            LatLng var3 = (LatLng)var0.get(var2);
            LatLng var4 = (LatLng)var0.get(var2 + 1);
            if (var3 == null || var4 == null) {
               return var1;
            }

            var1 = (int)((float)var1 + AMapUtils.calculateLineDistance(var3, var4));
         }

         return var1;
      } else {
         return var1;
      }
   }
}
