package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.List;
import org.json.JSONObject;

public final class lv {
   private StringBuilder a = new StringBuilder();

   public lv() {
   }

   public final ls a(byte[] var1) {
      ByteBuffer var3 = null;

      ls var2;
      label391: {
         ls var7;
         try {
            var2 = new ls("");
            if (var1 == null) {
               var2.setErrorCode(5);
               this.a.append("byte[] is null");
               var2.setLocationDetail(this.a.toString());
               this.a.delete(0, this.a.length());
               return var2;
            }

            if ((var3 = ByteBuffer.wrap(var1)).get() != 0) {
               double var44 = mk.a((double)var3.getInt() / 1000000.0D);
               var2.setLongitude(var44);
               double var9 = mk.a((double)var3.getInt() / 1000000.0D);
               var2.setLatitude(var9);
               var2.setAccuracy((float)var3.getShort());
               var2.c(String.valueOf(var3.get()));
               var2.d(String.valueOf(var3.get()));
               if (var3.get() == 1) {
                  String var4 = "";
                  String var5 = "";
                  String var6 = "";
                  String var45 = "";
                  String var8 = "";
                  String var46 = "";
                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var2.setCountry(new String(var1, "UTF-8"));
                  } catch (Throwable var38) {
                     ;
                  }

                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var4 = new String(var1, "UTF-8");
                     var2.setProvince(var4);
                  } catch (Throwable var37) {
                     ;
                  }

                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var5 = new String(var1, "UTF-8");
                     var2.setCity(var5);
                  } catch (Throwable var36) {
                     ;
                  }

                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var6 = new String(var1, "UTF-8");
                     var2.setDistrict(var6);
                  } catch (Throwable var35) {
                     ;
                  }

                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var45 = new String(var1, "UTF-8");
                     var2.setStreet(var45);
                     var2.setRoad(var45);
                  } catch (Throwable var34) {
                     ;
                  }

                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var2.setNumber(new String(var1, "UTF-8"));
                  } catch (Throwable var33) {
                     ;
                  }

                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var8 = new String(var1, "UTF-8");
                     var2.setPoiName(var8);
                  } catch (Throwable var32) {
                     ;
                  }

                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var2.setAoiName(new String(var1, "UTF-8"));
                  } catch (Throwable var31) {
                     ;
                  }

                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var46 = new String(var1, "UTF-8");
                     var2.setAdCode(var46);
                  } catch (Throwable var30) {
                     ;
                  }

                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var2.setCityCode(new String(var1, "UTF-8"));
                  } catch (Throwable var29) {
                     ;
                  }

                  StringBuilder var42 = new StringBuilder();
                  if (!TextUtils.isEmpty(var4)) {
                     var42.append(var4).append(" ");
                  }

                  if (!TextUtils.isEmpty(var5) && (!var4.contains("市") || !var4.equals(var5))) {
                     var42.append(var5).append(" ");
                  }

                  if (!TextUtils.isEmpty(var6)) {
                     var42.append(var6).append(" ");
                  }

                  if (!TextUtils.isEmpty(var45)) {
                     var42.append(var45).append(" ");
                  }

                  if (!TextUtils.isEmpty(var8)) {
                     if (!TextUtils.isEmpty(var46)) {
                        var42.append("靠近");
                     }

                     var42.append(var8).append(" ");
                  }

                  Bundle var43;
                  (var43 = new Bundle()).putString("citycode", var2.getCityCode());
                  var43.putString("desc", var42.toString());
                  var43.putString("adcode", var2.getAdCode());
                  var2.setExtras(var43);
                  var2.e(var42.toString());
                  if ((var4 = var2.getAdCode()) != null && var4.trim().length() > 0) {
                     var2.setAddress(var42.toString().replace(" ", ""));
                  } else {
                     var2.setAddress(var42.toString());
                  }
               }

               var1 = new byte[var3.get() & 255];
               var3.get(var1);
               if (var3.get() == 1) {
                  var3.getInt();
                  var3.getInt();
                  var3.getShort();
               }

               if (var3.get() == 1) {
                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var2.setBuildingId(new String(var1, "UTF-8"));
                  } catch (Throwable var28) {
                     ;
                  }

                  var1 = new byte[var3.get() & 255];
                  var3.get(var1);

                  try {
                     var2.setFloor(new String(var1, "UTF-8"));
                  } catch (Throwable var27) {
                     ;
                  }
               }

               if (var3.get() == 1) {
                  var3.get();
                  var3.getInt();
                  var3.get();
               }

               if (var3.get() == 1) {
                  var2.setTime(var3.getLong());
               }

               var1 = new byte[var3.getShort()];
               var3.get(var1);

               try {
                  var2.a(new String(var1, "UTF-8"));
               } catch (Throwable var26) {
                  ;
               }
               break label391;
            }

            short var41 = var3.getShort();
            var2.b(String.valueOf(var41));
            var3.clear();
            var7 = var2;
         } catch (Throwable var39) {
            (var2 = new ls("")).setErrorCode(5);
            this.a.append("parser data error:" + var39.getMessage());
            var2.setLocationDetail(this.a.toString());
            break label391;
         } finally {
            if (var3 != null) {
               var3.clear();
            }

         }

         return var7;
      }

      if (this.a.length() > 0) {
         this.a.delete(0, this.a.length());
      }

      return var2;
   }

   public final ls a(String var1, Context var2, jk var3) {
      ls var4;
      (var4 = new ls("")).setErrorCode(7);

      String var8;
      try {
         JSONObject var5;
         if (!(var5 = new JSONObject(var1)).has("status") || !var5.has("info")) {
            this.a.append("json is error " + var1);
         }

         var1 = var5.getString("status");
         var8 = var5.getString("info");
         if (var1.equals("0")) {
            this.a.append("auth fail:" + var8);
         }
      } catch (Throwable var7) {
         this.a.append("json exception error:" + var7.getMessage());
         mg.a(var7, "MapParser", "paseAuthFailurJson");
      }

      try {
         this.a.append("#SHA1AndPackage#").append(gu.e(var2));
         if (!TextUtils.isEmpty(var8 = (String)((List)var3.b.get("gsid")).get(0))) {
            this.a.append(" #gsid#").append(var8);
         }

         var1 = var3.c;
         if (!TextUtils.isEmpty(var3.c)) {
            this.a.append(" #csid#" + var1);
         }
      } catch (Throwable var6) {
         ;
      }

      var4.setLocationDetail(this.a.toString());
      if (this.a.length() > 0) {
         this.a.delete(0, this.a.length());
      }

      return var4;
   }
}
