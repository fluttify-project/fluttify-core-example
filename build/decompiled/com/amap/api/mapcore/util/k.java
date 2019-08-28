package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.amap.api.maps.MapsInitializer;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public class k extends Thread {
   private Context b;
   WeakReference<u> a = null;

   public k(Context var1, u var2) {
      this.b = var1;
      WeakReference var3 = new WeakReference(var2);
      this.a = var3;
   }

   public void run() {
      try {
         if (!MapsInitializer.getNetWorkEnable()) {
            return;
         }

         hb.a().a(this.b);
         StringBuilder var1 = new StringBuilder();
         var1.append("14S");
         var1.append(";");
         var1.append("11K");
         var1.append(";");
         var1.append("001");
         var1.append(";");
         var1.append("14M");
         var1.append(";");
         var1.append("14L");
         var1.append(";");
         var1.append("151");
         var1.append(";");
         var1.append("14Z");
         var1.append(";");
         var1.append("154");
         var1.append(";");
         var1.append("156");
         var1.append(";");
         var1.append("15C");
         var1.append(";");
         var1.append("15S");
         String var2 = var1.toString();
         gv$a var3 = gv.a(this.b, fi.e(), var2, (Map)null);
         if (gv.a != 1 && var3 != null && this.a != null && this.a.get() != null) {
            Message var4 = ((u)this.a.get()).getMainHandler().obtainMessage();
            var4.what = 2;
            if (var3.a != null) {
               var4.obj = var3.a;
            }

            ((u)this.a.get()).getMainHandler().sendMessage(var4);
         }

         String var7;
         String var8;
         if (var3 != null && var3.w != null) {
            JSONObject var18 = var3.w.optJSONObject("154");
            if (var18 != null) {
               String var5 = var18.getString("able");
               boolean var6 = gv.a(var5, true);
               if (var6) {
                  var7 = var18.optString("mc");
                  var8 = var18.optString("si");
                  if (!TextUtils.isEmpty(var7)) {
                     ey.a(this.b, "approval_number", "mc", (Object)var7);
                  }

                  if (!TextUtils.isEmpty(var8)) {
                     ey.a(this.b, "approval_number", "si", (Object)var8);
                  }
               }
            }
         }

         if (var3 != null && var3.x != null) {
            hf var19 = fi.e();
            if (var19 != null) {
               var19.a(var3.x.a);
            }
         }

         if (MapsInitializer.isDownloadCoordinateConvertLibrary() && var3 != null && var3.B != null) {
            gy var20 = new gy(this.b, "3dmap", var3.B.a, var3.B.b);
            var20.a(var3.a());
            var20.a();
         }

         if (var3 != null) {
            this.a(var3);
         }

         String var21 = "able";

         String var9;
         JSONObject var22;
         String var24;
         boolean var26;
         try {
            if (var3 != null && var3.w != null) {
               var22 = var3.w.optJSONObject("14M");
               if (var22 != null && var22.has(var21)) {
                  var24 = var22.getString(var21);
                  var26 = gv.a(var24, true);
                  if (var26) {
                     int var27 = 2592000;
                     var9 = "time";
                     if (var22.has(var9)) {
                        var27 = var22.getInt(var9);
                        var27 = Math.max(60, var27);
                     }

                     long var10 = ey.a(this.b, "Map3DCache", "time", 0L).longValue();
                     long var12 = System.currentTimeMillis();
                     short var14 = 1000;
                     if (var12 - var10 > (long)(var27 * var14) && this.a != null && this.a.get() != null) {
                        ((u)this.a.get()).b();
                     }
                  }
               }
            }
         } catch (Throwable var16) {
            var16.printStackTrace();
         }

         if (var3 != null && var3.w != null) {
            try {
               var22 = var3.w.optJSONObject("14L");
               if (var22 != null && var22.has(var21)) {
                  var24 = var22.getString(var21);
                  var26 = gv.a(var24, false);
                  if (this.a != null && this.a.get() != null) {
                     ((u)this.a.get()).i(!var26);
                  }
               }
            } catch (Throwable var15) {
               var15.printStackTrace();
            }
         }

         if (var3 != null && var3.y != null) {
            gv$a$d var23 = var3.y;
            if (null != var23) {
               var24 = var23.b;
               var7 = var23.a;
               var8 = var23.c;
               if (!TextUtils.isEmpty(var24) && !TextUtils.isEmpty(var7) && !TextUtils.isEmpty(var8)) {
                  if var29 = new if(var7, var24, var8, var3.a());
                  ie var30 = new ie(this.b, var29, fi.e());
                  var30.a();
               } else {
                  ie var28 = new ie(this.b, (if)null, fi.e());
                  var28.a();
               }
            } else {
               ie var25 = new ie(this.b, (if)null, fi.e());
               var25.a();
            }
         }

         if (var3 != null && var3.w != null) {
            var22 = var3.w.optJSONObject("156");
            if (var22 != null) {
               var24 = var22.optString("able");
               var26 = gv.a(var24, false);
               es.a(var26);
            }
         }

         if (var3 != null && var3.w != null) {
            var22 = var3.w.optJSONObject("15C");
            if (var22 != null) {
               var24 = var22.optString("able");
               var26 = gv.a(var24, false);
               var8 = var22.optString("logo_day_url");
               var9 = var22.optString("logo_day_md5");
               String var31 = var22.optString("logo_night_url");
               String var11 = var22.optString("logo_night_md5");
               fh.a().a(new k$1(this, var9, var8, var26, var11, var31));
            }
         }

         if (var3 != null && var3.w != null) {
            this.a(this.b, fi.e(), var3);
         }

         ht.a(this.b, fi.e());
         this.interrupt();
         if (this.a != null && this.a.get() != null) {
            ((u)this.a.get()).setRunLowFrame(false);
         }
      } catch (Throwable var17) {
         this.interrupt();
         ht.c(var17, "AMapDelegateImpGLSurfaceView", "mVerfy");
         var17.printStackTrace();
      }

   }

   private void a(Context var1, hf var2, gv$a var3) {
      if (var3 != null && var3.w != null) {
         try {
            JSONObject var4 = var3.w.optJSONObject("15S");
            String var5 = var4.optString("url", "");
            String var6 = var4.optString("md5", "");
            boolean var7 = gv.a(var4.optString("able", ""), false);
            boolean var8 = gv.a(var4.optString("on", ""), false);
            boolean var9 = gv.a(var4.optString("mobileable", ""), false);
            boolean var10 = gv.a(var4.optString("di", ""), false);
            String var11 = var4.optString("dis", "");
            if (var10 && !hg.f(var11)) {
               return;
            }

            String var12 = var4.optString("cg");
            this.b(this.b, fi.e(), var3);
            it var13 = it.a(fi.e(), var5, var6, var7, var8, var9, var12);
            is.a().a(this.b, var2, var13, var3.a());
         } catch (Throwable var14) {
            ;
         }

      }
   }

   private void b(Context var1, hf var2, gv$a var3) {
      if (var3 != null && var3.w != null) {
         try {
            JSONObject var4 = var3.w.optJSONObject("151");
            boolean var5 = gv.a(var4.optString("able", ""), false);
            is.a().a(var1, var2, var5);
         } catch (Throwable var6) {
            ;
         }

      }
   }

   private void a(gv$a var1) {
      try {
         gv$a$a var2 = var1.x;
         if (null != var2) {
            boolean var3 = var2.a;
            ff.a(this.b, "maploc", "ue", var3);
            JSONObject var4 = var2.c;
            int var5 = var4.optInt("fn", 1000);
            int var6 = var4.optInt("mpn", 0);
            short var7 = 500;
            byte var8 = 30;
            if (var6 > var7) {
               var6 = var7;
            }

            if (var6 < var8) {
               var6 = var8;
            }

            boolean var9 = gv.a(var4.optString("igu"), false);
            jr.a(var5, var9);
            ff.a(this.b, "maploc", "opn", var6);
         }
      } catch (Throwable var10) {
         ht.c(var10, "AuthUtil", "loadConfigDataUploadException");
      }

   }
}
