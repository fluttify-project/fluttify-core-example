package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.autonavi.ae.gmap.style.StyleElement;
import com.autonavi.ae.gmap.style.StyleItem;
import com.autonavi.amap.mapcore.Convert;
import com.autonavi.amap.mapcore.FileUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ef {
   private int b = 0;
   private int c = -1;
   private static final int[] d = new int[]{1};
   List<eb> a = null;

   public ef(Context var1) {
   }

   public eg a(String var1, boolean var2) {
      if (var1 != null && !"".equals(var1)) {
         eg var3 = this.b(var1, var2);
         return var3;
      } else {
         return null;
      }
   }

   public eg a(byte[] var1, boolean var2) {
      if (var1 != null && var1.length != 0) {
         eg var3 = this.b(var1, var2);
         return var3;
      } else {
         return null;
      }
   }

   public eg b(byte[] var1, boolean var2) {
      eg var3 = new eg();

      try {
         if (!this.a(var3.a(), var1)) {
            this.a(var3, var1, var2);
         }

         this.a(var3);
         var3.b();
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

      return var3;
   }

   protected void a(eg var1) {
      if (this.c != -1) {
         Map var2 = var1.a();
         List var3 = this.a("roads", "trafficRoadBackgroundColor");

         StyleElement var7;
         for(Iterator var4 = var3.iterator(); var4.hasNext(); var7.value = this.c) {
            eb var5 = (eb)var4.next();
            StyleElement var6 = this.a(var2, var5.d, ed.a("fillColor"), var5);
            var6.value = this.c;
            var7 = this.a(var2, var5.d, ed.a("strokeColor"), var5);
         }
      }

   }

   public eg b(String var1, boolean var2) {
      try {
         byte[] var3 = FileUtil.readFileContents(var1);
         return this.b(var3, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private void a(eg var1, byte[] var2, boolean var3) {
      ec var4 = a(var2);
      if (var4 != null && var4.a() != null) {
         try {
            JSONObject var5 = new JSONObject(var4.a());
            if (var5 != null) {
               JSONArray var6 = var5.names();
               JSONObject var7 = null;
               String var8 = null;

               for(int var9 = 0; var9 < var6.length(); ++var9) {
                  var8 = var6.getString(var9);
                  if (var8 == null || !var8.trim().equals("sdkTextures")) {
                     if (var8 != null && var8.trim().equals("background")) {
                        String var10 = var5.optString("background");
                        int var11 = a("#" + var10);
                        this.b = var11;
                     } else {
                        var7 = var5.optJSONObject(var8);
                        if (var7 != null) {
                           this.a(var8, var1.a(), var7, var3);
                        }
                     }
                  }
               }
            }
         } catch (Throwable var12) {
            var12.printStackTrace();
         }
      }

   }

   private void a(String var1, Map<Integer, StyleItem> var2, JSONObject var3, boolean var4) throws JSONException {
      if (var3 != null) {
         JSONObject var5 = var3.optJSONObject("subType");
         if (var5 == null) {
            this.a(var1, var1, var2, var3, var4);
         } else {
            JSONArray var6 = var5.names();
            String var7 = null;

            for(int var8 = 0; var8 < var6.length(); ++var8) {
               var7 = var6.optString(var8);
               JSONObject var9 = var5.optJSONObject(var7);
               if (var9.has("detailedType")) {
                  JSONObject var10 = var9.optJSONObject("detailedType");
                  if (var10 != null) {
                     JSONArray var11 = var10.names();

                     for(int var12 = 0; var12 < var11.length(); ++var12) {
                        String var13 = var11.optString(var12);
                        JSONObject var14 = var10.optJSONObject(var13);
                        if (var14 != null) {
                           this.a(var1, var13, var2, var14, var4);
                        }
                     }
                  }
               } else {
                  this.a(var1, var7, var2, var9, var4);
               }
            }
         }

      }
   }

   public void a(int var1) {
      this.c = var1;
   }

   private List<eb> b() {
      this.a = new ArrayList();

      try {
         JSONArray var1 = new JSONArray("[{\n\t\"regions\": {\n\t\t\"name\": \"区域面\",\n\t\t\"subType\": {\n\t\t\t\"land\": {\n\t\t\t\t\"name\": \"陆地\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30001,\n\t\t\t\t\t\"subkey\": [1, 4, 5]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"green\": {\n\t\t\t\t\"name\": \"绿地\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30001,\n\t\t\t\t\t\"subkey\": [3, 7, 8, 9, 10, 12]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"edu\": {\n\t\t\t\t\"name\": \"教育体育\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [3, 31]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"public\": {\n\t\t\t\t\"name\": \"公共设施\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [4, 12, 22, 32]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"traffic\": {\n\t\t\t\t\"name\": \"交通枢纽\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [6, 14, 40]\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 30004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"scenicSpot\": {\n\t\t\t\t\"name\": \"景区\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [5, 33]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"culture\": {\n\t\t\t\t\"name\": \"文化\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [7, 35]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"health\": {\n\t\t\t\t\"name\": \"医疗卫生\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [8, 36]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"sports\": {\n\t\t\t\t\"name\": \"运动场所\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [9, 10, 13, 19, 20, 21, 34, 37, 39]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"business\": {\n\t\t\t\t\"name\": \"商业场所\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [11, 23, 24, 25, 26, 27, 28, 29, 30, 38]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"parkingLot\": {\n\t\t\t\t\"name\": \"停车场\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [1]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subway\": {\n\t\t\t\t\"name\": \"地铁设施\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30003\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"water\": {\n\t\t\"name\": \"水系\",\n\t\t\"styleMap\": [{\n\t\t\t\"mainkey\": 30001,\n\t\t\t\"subkey\": [2, 6, 11, 13]\n\t\t}, {\n\t\t\t\"mainkey\": 20014\n\t\t}, {\n\t\t\t\"mainkey\": 10002,\n\t\t\t\"subkey\": [13]\n\t\t}]\n\t},\n\t\"buildings\": {\n\t\t\"name\": \"建筑物\",\n\t\t\"styleMap\": [{\n\t\t\t\"mainkey\": 50001\n\t\t}, {\n\t\t\t\"mainkey\": 50002\n\t\t}, {\n\t\t\t\"mainkey\": 50003\n\t\t}, {\n\t\t\t\"mainkey\": 50004\n\t\t}, {\n\t\t\t\"mainkey\": 30002,\n\t\t\t\"subkey\": [2, 15, 16, 17, 18]\n\t\t}]\n\t},\n\t\"roads\": {\n\t\t\"name\": \"道路\",\n\t\t\"subType\": {\n\t\t\t\"highWay\": {\n\t\t\t\t\"name\": \"高速公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20001\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"ringRoad\": {\n\t\t\t\t\"name\": \"城市环线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20002\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"nationalRoad\": {\n\t\t\t\t\"name\": \"国道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20003\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"provincialRoad\": {\n\t\t\t\t\"name\": \"省道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"secondaryRoad\": {\n\t\t\t\t\"name\": \"二级公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20007\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"levelThreeRoad\": {\n\t\t\t\t\"name\": \"三级公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20008\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"levelFourRoad\": {\n\t\t\t\t\"name\": \"四级道路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20009\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"roadsBeingBuilt\": {\n\t\t\t\t\"name\": \"在建道路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20018\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"railway\": {\n\t\t\t\t\"name\": \"铁路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20010,\n\t\t\t\t\t\"subkey\": [1]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"highSpeedRailway\": {\n\t\t\t\t\"name\": \"高铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20010,\n\t\t\t\t\t\"subkey\": [2]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subway\": {\n\t\t\t\t\"name\": \"地铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20015\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subwayBeingBuilt\": {\n\t\t\t\t\"name\": \"在建地铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20015,\n\t\t\t\t\t\"subkey\": [1, 2]\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20019\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"overPass\": {\n\t\t\t\t\"name\": \"天桥\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20012\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"underPass\": {\n\t\t\t\t\"name\": \"地道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20013\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"other\": {\n\t\t\t\t\"name\": \"其他线条\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20011\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20017\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20020\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20024\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20028\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"guideBoards\": {\n\t\t\t\t\"name\": \"道路路牌\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 40001\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"labels\": {\n\t\t\"name\": \"标注\",\n\t\t\"subType\": {\n\t\t\t\"pois\": {\n\t\t\t\t\"name\": \"兴趣点\",\n\t\t\t\t\"subType\": {\n\t\t\t\t\t\"hotel\": {\n\t\t\t\t\t\t\"name\": \"住宿\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 0,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [9, 133, 134, 135, 136, 155, 156, 157, 158, 159, 160, 161, 162, 186]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [31, 32, 33, 34, 35, 36, 37, 38, 39, 164, 165]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"restaurant\": {\n\t\t\t\t\t\t\"name\": \"餐饮\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 1,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [19, 20, 21, 22, 114, 115, 116, 117, 118, 119, 183, 187]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [1, 2, 3, 4, 166, 167, 168, 179, 180, 181, 203, 205, 206, 215]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"shop\": {\n\t\t\t\t\t\t\"name\": \"购物\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 2,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [7, 8, 68, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [5, 6, 7, 8, 9, 10, 11, 12, 13, 175, 200, 201, 202, 204]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"scenicSpot\": {\n\t\t\t\t\t\t\"name\": \"风景名胜\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 3,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [4, 12, 14, 38, 69, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 120, 167, 171, 188, 189, 190, 191, 192]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10008\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 187, 188, 190, 192, 193, 194, 195, 196, 198, 216, 217, 218, 219, 220, 221, 223, 224, 225]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"traffic\": {\n\t\t\t\t\t\t\"name\": \"交通设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 4,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [23, 24, 25, 26, 31, 36, 148, 154, 168, 172, 175, 176, 177, 178]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [11, 16]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10009\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"bank\": {\n\t\t\t\t\t\t\"name\": \"金融保险\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 5,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [42, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 144, 145, 146, 147]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"edu\": {\n\t\t\t\t\t\t\"name\": \"科教文化\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 6,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [10, 11, 13, 35, 138, 139, 140, 141, 142, 143, 163, 164, 165, 166, 170]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [43, 44, 45, 46, 47, 176, 177]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"live\": {\n\t\t\t\t\t\t\"name\": \"生活服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 7,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [58, 63, 64, 65, 66, 67, 121, 122, 123]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [28, 29, 30]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"hospital\": {\n\t\t\t\t\t\t\"name\": \"医疗保健\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 8,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [32, 33, 57, 70, 131, 132, 169, 193, 206, 207, 208, 209, 210]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [170, 209]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"pe\": {\n\t\t\t\t\t\t\"name\": \"休闲体育\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 9,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [15, 16, 17, 37, 60, 61, 62, 73, 124, 125, 126, 127, 128, 129, 130, 180, 181, 182, 184, 185, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 213, 214]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [169, 171, 172, 173, 174, 178, 197, 207]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"public\": {\n\t\t\t\t\t\t\"name\": \"公共设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 10,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [59, 173, 215]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"buidling\": {\n\t\t\t\t\t\t\"name\": \"商务住宅\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 11,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [5, 6, 74, 75, 76, 77, 78, 79, 80, 81, 179]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [189, 191]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"gov\": {\n\t\t\t\t\t\t\"name\": \"政府机构及社会团体\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 12,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [3, 34, 43, 137]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"moto\": {\n\t\t\t\t\t\t\"name\": \"摩托车服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 13,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [113]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"vehicle\": {\n\t\t\t\t\t\t\"name\": \"汽车服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 14,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [39, 40, 41, 71, 72, 151, 152, 153]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [40, 41, 42, 182, 183, 184, 185, 186]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"pass\": {\n\t\t\t\t\t\t\"name\": \"通行设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 15,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [27, 28, 149, 150, 174]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [21]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"subway\": {\n\t\t\t\t\t\t\"name\": \"地铁站\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 16,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10005\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10006\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"roadFacilities\": {\n\t\t\t\t\t\t\"name\": \"道路附属设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 17,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [2, 29, 30]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10017\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"address\": {\n\t\t\t\t\t\t\"name\": \"地名\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 18,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [18]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [10, 12, 14, 15, 23, 36]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"other\": {\n\t\t\t\t\t\t\"name\": \"其他\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 19,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [1, 211, 212]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [28]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [208, 210, 211, 212, 213, 214]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10010\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10011\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10012\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10013\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10014\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10015\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10016\n\t\t\t\t\t\t}]\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t},\n\t\t\t\"aois\": {\n\t\t\t\t\"name\": \"区域标注\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"continent\": {\n\t\t\t\t\"name\": \"大洲\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [20]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"country\": {\n\t\t\t\t\"name\": \"国家\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [18, 19, 29]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"province\": {\n\t\t\t\t\"name\": \"省/直辖市/自治区/特别行政区\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [22, 26, 33]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"city\": {\n\t\t\t\t\"name\": \"城市\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [1, 2, 3, 4, 5, 7, 24, 25, 27, 30, 31, 32, 34, 35]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"district\": {\n\t\t\t\t\"name\": \"区县\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [6, 8, 37]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"town\": {\n\t\t\t\t\"name\": \"乡镇\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [9]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"village\": {\n\t\t\t\t\"name\": \"村庄\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [17]\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"borders\": {\n\t\t\"name\": \"行政区边界\",\n\t\t\"subType\": {\n\t\t\t\"China\": {\n\t\t\t\t\"name\": \"中国国界\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [1, 2, 9]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"foreign\": {\n\t\t\t\t\"name\": \"外国国界/停火线/主张线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [3, 4, 8, 10, 11]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"provincial\": {\n\t\t\t\t\"name\": \"省界线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [5, 6, 7, 12]\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t}\n}]");
         if (var1 == null || var1.length() == 0) {
            return this.a;
         }

         JSONObject var2 = var1.optJSONObject(0);
         if (var2 == null) {
            return this.a;
         }

         JSONArray var3 = var2.names();
         int var4 = var3.length();

         for(int var5 = 0; var5 < var4; ++var5) {
            String var6 = var3.optString(var5);
            JSONObject var7 = var2.optJSONObject(var6);
            if (var7 != null) {
               String var8 = var7.optString("name");
               if (var7.has("styleMap")) {
                  JSONArray var9 = var7.optJSONArray("styleMap");
                  this.a(var9, var6, (String)null, var8, this.a);
               } else if (var7.has("subType")) {
                  JSONObject var25 = var7.optJSONObject("subType");
                  if (var25 == null) {
                     continue;
                  }

                  JSONArray var10 = var25.names();
                  int var11 = var10.length();

                  for(int var12 = 0; var12 < var11; ++var12) {
                     String var13 = var10.optString(var12);
                     JSONObject var14 = var25.optJSONObject(var13);
                     if (var14 != null) {
                        String var15 = var14.optString("name");
                        if (var14.has("styleMap")) {
                           JSONArray var27 = var14.optJSONArray("styleMap");
                           this.a(var27, var6, var13, var8 + "-" + var15, this.a);
                        } else if (var14.has("subType")) {
                           JSONObject var16 = var14.optJSONObject("subType");
                           if (var16 != null) {
                              JSONArray var17 = var16.names();
                              int var18 = var17.length();

                              for(int var19 = 0; var19 < var18; ++var19) {
                                 String var20 = var17.optString(var19);
                                 JSONObject var21 = var16.optJSONObject(var20);
                                 if (var21 != null) {
                                    String var22 = var21.optString("name");
                                    if (var21.has("styleMap")) {
                                       JSONArray var23 = var21.optJSONArray("styleMap");
                                       this.a(var23, var6, var13 + "-" + var20, var8 + "-" + var15 + "-" + var22, this.a);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               eb var26 = new eb(20021, d, "roads", "trafficRoadBackgroundColor", (String)null);
               this.a.add(var26);
            }
         }
      } catch (JSONException var24) {
         var24.printStackTrace();
      }

      return this.a;
   }

   private void a(JSONArray var1, String var2, String var3, String var4, List<eb> var5) {
      if (var1 != null) {
         int var6 = var1.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            JSONObject var8 = var1.optJSONObject(var7);
            if (var8 != null) {
               int var9 = var8.optInt("mainkey");
               int[] var10 = new int[0];
               JSONArray var11 = var8.optJSONArray("subkey");
               if (var11 != null) {
                  int var12 = var11.length();
                  var10 = new int[var12];

                  for(int var13 = 0; var13 < var12; ++var13) {
                     int var14 = var11.optInt(var13);
                     var10[var13] = var14;
                  }
               }

               eb var15 = new eb(var9, var10, var2, var3, var4);
               var5.add(var15);
            }
         }

      }
   }

   private List<eb> a(String var1, String var2) {
      ArrayList var3 = new ArrayList();
      Iterator var4 = this.a.iterator();

      while(true) {
         while(true) {
            eb var5;
            do {
               if (!var4.hasNext()) {
                  return var3;
               }

               var5 = (eb)var4.next();
            } while(var5 == null);

            if (var5.e != null && var5.e.equals(var2)) {
               var3.add(var5);
            } else if (var5.e != null && var5.e.equals(var1) && var5.f != null && var5.f.contains(var2)) {
               var3.add(var5);
            }
         }
      }
   }

   private void a(String var1, String var2, Map<Integer, StyleItem> var3, JSONObject var4, boolean var5) throws JSONException {
      if (null != var4) {
         if (this.a == null) {
            this.a = this.b();
         }

         List var6 = this.a(var1, var2);
         Iterator var7 = var6.iterator();

         while(var7.hasNext()) {
            eb var8 = (eb)var7.next();
            if (var8 == null || var8.c == -1000) {
               return;
            }

            int var9 = var8.d;
            StyleElement var10;
            if (!var4.optBoolean("visible", true)) {
               var10 = this.a(var3, var9, ed.a("visible"), var8);
               var10.textureId = -1;
               var10.visible = 0;
            } else {
               if (!var4.optBoolean("showIcon", true)) {
                  var10 = this.a(var3, var9, ed.a("textFillColor"), var8);
                  var10.textureId = -1;
               }

               if (!var4.optBoolean("showLabel", true)) {
                  var10 = this.a(var3, var9, ed.a("textFillColor"), var8);
                  var10.opacity = 0.0F;
                  var10 = this.a(var3, var9, ed.a("textStrokeColor"), var8);
                  var10.opacity = 0.0F;
                  var10.visible = 0;
                  var10.textureId = -1;
               }

               this.a(var3, var4, "color", "opacity", var9, var8);
               this.a(var3, var4, "fillColor", "fillOpacity", var9, var8);
               this.a(var3, var4, "strokeColor", "strokeOpacity", var9, var8);
               this.a(var3, var4, "textFillColor", "textFillOpacity", var9, var8);
               this.a(var3, var4, "textStrokeColor", "textStrokeOpacity", var9, var8);
               this.a(var3, var4, "backgroundColor", "backgroundOpacity", var9, var8);
               if (var5) {
                  this.a(var3, var4, "textureName", var9, var8);
               }
            }
         }

         var6.clear();
         var6 = null;
      }
   }

   private void a(Map<Integer, StyleItem> var1, JSONObject var2, String var3, String var4, int var5, eb var6) {
      try {
         String var7 = var2.optString(var3, (String)null);
         float var8 = 1.0F;
         int var9 = 0;
         if (TextUtils.isEmpty(var7)) {
            var8 = (float)var2.optDouble(var4, 1.0D);
         } else {
            var9 = a("#" + var7);
         }

         if (var9 == 0 && (double)var8 == 1.0D) {
            return;
         }

         int var10 = ed.a(var3);
         StyleElement var11 = this.a(var1, var5, var10, var6);
         var11.value = var9;
         var11.opacity = var8;
         if (var6.f != null && var6.f.equals("China")) {
            var11 = this.a(var1, var5, var10, var6);
            var11.opacity = 0.0F;
         } else if (var6.e != null && var6.e.equals("water") && var10 == 3) {
            var11 = this.a(var1, var5, 2, var6);
            var11.value = var9;
            var11.opacity = var8;
         }
      } catch (Throwable var12) {
         var12.printStackTrace();
      }

   }

   private void a(Map<Integer, StyleItem> var1, JSONObject var2, String var3, int var4, eb var5) {
      try {
         int var6 = var2.optInt(var3, 0);
         if (var6 == 0) {
            return;
         }

         int var7 = ed.a(var3);
         StyleElement var8 = this.a(var1, var4, var7, var5);
         var8.textureId = var6;
      } catch (Throwable var9) {
         var9.printStackTrace();
      }

   }

   public static ec a(byte[] var0) {
      ec var1 = null;

      try {
         var1 = new ec();
         byte[] var2 = "l".getBytes("utf-8");
         int var3 = var0.length;
         int var4 = var2.length;
         boolean var6 = false;

         int var7;
         for(var7 = 0; var7 < var3; ++var7) {
            int var15 = var7 % var4;
            byte var5 = (byte)(var0[var7] ^ var2[var15]);
            var0[var7] = var5;
         }

         byte var16 = 0;
         String var8 = Convert.getString(var0, var16, 4);
         var7 = var16 + 4;
         var1.a(var8);
         String var9 = Convert.getString(var0, var7, 32);
         var7 += 32;
         var1.b(var9);
         String var10 = Convert.getString(var0, var7, 10);
         var7 += 10;
         var1.c(var10);
         byte[] var11 = Convert.getSubBytes(var0, var7, 16);
         var7 += 16;
         byte[] var12 = Convert.getSubBytes(var0, var7, 16);
         var7 += 16;
         byte[] var13 = Convert.getSubBytes(var0, var7, var3 - var7);
         var1.d(a(var13, var11, var12));
      } catch (Throwable var14) {
         var14.printStackTrace();
      }

      return var1;
   }

   public static String a(byte[] var0, byte[] var1, byte[] var2) {
      try {
         IvParameterSpec var3 = new IvParameterSpec(var2);
         SecretKeySpec var4 = new SecretKeySpec(var1, "AES");
         Cipher var5 = Cipher.getInstance("AES/CBC/NoPadding");
         var5.init(2, var4, var3);
         byte[] var6 = var5.doFinal(var0);
         return new String(var6, "utf-8");
      } catch (Throwable var7) {
         var7.printStackTrace();
         return null;
      }
   }

   private boolean a(Map<Integer, StyleItem> var1, byte[] var2) {
      try {
         String var3 = new String(var2, "UTF-8");
         JSONArray var4 = new JSONArray(var3);
         if (var4 != null) {
            for(int var6 = 0; var6 < var4.length(); ++var6) {
               JSONObject var7 = var4.optJSONObject(var6);
               String var5 = var7.optString("featureType");
               if (!TextUtils.isEmpty(var5)) {
                  if ("background".equals(var5)) {
                     JSONObject var8 = var7.optJSONObject("stylers");
                     if (var8 != null) {
                        int var9 = a(var8.optString("color"));
                        if (var9 != 0) {
                           this.b = var9;
                        }
                     }
                  } else {
                     String var14 = ee.b(var5);
                     if (var14 != null) {
                        String[] var15 = ee.a(var5);
                        if (var15 != null && var15.length != 0) {
                           String var10 = var7.optString("elementType");
                           if (!TextUtils.isEmpty(var10)) {
                              int var11 = ed.a(var10);
                              if (var11 != -1) {
                                 this.a(var1, var7, var14, var15, var11);
                              }
                           }
                        }
                     }
                  }
               }
            }

            return true;
         }
      } catch (JSONException var12) {
         ;
      } catch (Throwable var13) {
         var13.printStackTrace();
      }

      return false;
   }

   private void a(Map<Integer, StyleItem> var1, JSONObject var2, String var3, String[] var4, int var5) throws JSONException {
      for(int var6 = 0; var6 < var4.length; ++var6) {
         String var7 = var4[var6];
         if (this.a == null) {
            this.a = this.b();
         }

         List var8 = this.a(var3, var7);
         Iterator var9 = var8.iterator();

         while(var9.hasNext()) {
            eb var10 = (eb)var9.next();
            this.a(var1, var2, var10.d, var5, var10);
         }
      }

   }

   private void a(Map<Integer, StyleItem> var1, JSONObject var2, int var3, int var4, eb var5) throws JSONException {
      StyleElement var6 = this.a(var1, var3, var4, var5);
      JSONObject var7 = var2.optJSONObject("stylers");
      if (var7 != null) {
         int var8 = a(var7.optString("color"));
         if (var8 == 0) {
            return;
         }

         var6.value = var8;
         var6.textureId = var7.optInt("textureName", 0);
         var6.lineWidth = var7.optInt("lineWidth", 0);
         if (var3 >= 30 && var3 <= 38) {
            var6 = this.a(var1, var3, 4, var5);
            var6.opacity = 0.1F;
         } else if (var5.e != null && var5.e.equals("water") && var4 == 3) {
            var6 = this.a(var1, var3, 2, var5);
            var6.value = var8;
         }
      }

   }

   private StyleElement a(Map<Integer, StyleItem> var1, int var2, int var3, eb var4) {
      StyleItem var5 = (StyleItem)var1.get(var2);
      if (var5 == null) {
         var5 = new StyleItem(var4.c);
         var5.mainKey = var4.a;
         var5.subKey = var4.b;
         var1.put(var2, var5);
      }

      StyleElement var6 = var5.get(var3);
      if (var6 == null) {
         var6 = new StyleElement();
         var6.styleElementType = var3;
         var5.put(var3, var6);
      }

      return var6;
   }

   public static int a(String var0) {
      if (TextUtils.isEmpty(var0)) {
         return 0;
      } else {
         int var1 = 0;

         try {
            if (!var0.startsWith("#")) {
               var0 = "#" + var0;
            }

            var1 = Color.parseColor(var0);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

         return var1;
      }
   }

   public int a() {
      return this.b;
   }
}
