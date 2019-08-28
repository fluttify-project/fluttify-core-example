package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.MyTrafficStyle;
import com.autonavi.ae.gmap.style.StyleItem;
import com.autonavi.amap.mapcore.FileUtil;
import com.autonavi.amap.mapcore.MapConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements dy$a {
   private u a;
   private CustomMapStyleOptions b;
   private boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private boolean f = false;
   private int g = 1;
   private Context h;
   private byte[] i = null;
   private byte[] j = null;
   private byte[] k = null;
   private byte[] l = null;
   private byte[] m = null;
   private boolean n = false;
   private boolean o = false;
   private boolean p = false;
   private boolean q = false;
   private boolean r = false;
   private dy s;
   private dy t;
   private byte[] u = null;
   private byte[] v = null;
   private boolean w = false;
   private MyTrafficStyle x = new MyTrafficStyle();

   public b(u var1, Context var2) {
      this.a = var1;
      this.h = var2;
      this.n = false;
      this.o = false;
   }

   public void a() {
      if (this.b != null) {
         if (!this.o) {
            try {
               MapConfig var1 = this.a.getMapConfig();
               if (var1 == null) {
                  return;
               }

               synchronized(this) {
                  if (var1.isHideLogoEnable() && this.a != null && this.a.h() != null) {
                     if (this.a.h().isLogoEnable()) {
                        if (this.b.isEnable()) {
                           if (this.q) {
                              this.a.h().setLogoEnable(false);
                           }
                        } else {
                           this.a.h().setLogoEnable(true);
                        }
                     } else if (!this.q) {
                        this.a.h().setLogoEnable(true);
                     }
                  }

                  if (this.c) {
                     if (!this.b.isEnable()) {
                        this.a.a().setNativeMapModeAndStyle(this.g, var1.getMapStyleMode(), var1.getMapStyleTime(), var1.getMapStyleState(), false, false, (StyleItem[])null);
                        this.q = false;
                        if (var1.isCustomStyleEnable()) {
                           if (var1.getMapStyleMode() == 0 && var1.getMapStyleTime() == 0 && var1.getMapStyleState() == 0) {
                              this.g();
                           }

                           this.h();
                           if (this.r) {
                              this.f();
                           }

                           var1.setCustomStyleEnable(false);
                        }

                        this.c = false;
                        return;
                     }

                     this.a.a().setNativeMapModeAndStyle(this.g, 0, 0, 0, false, false, (StyleItem[])null);
                     var1.setCustomStyleEnable(true);
                     this.c = false;
                  }

                  String var3;
                  byte[] var4;
                  if (this.e) {
                     var3 = this.b.getStyleTexturePath();
                     if (this.b.getStyleTextureData() == null && !TextUtils.isEmpty(var3)) {
                        var4 = FileUtil.readFileContents(var3);
                        this.b.setStyleTextureData(var4);
                     }

                     if (this.b.getStyleTextureData() != null) {
                        this.w = true;
                        if (var1.isProFunctionAuthEnable()) {
                           this.p = true;
                           this.a.a().setCustomStyleTexture(this.g, this.b.getStyleTextureData());
                           var1.setUseProFunction(true);
                        } else {
                           this.h();
                        }
                     } else {
                        this.h();
                        this.w = false;
                     }

                     this.e = false;
                  }

                  if (this.d) {
                     var3 = this.b.getStyleDataPath();
                     if (this.b.getStyleData() == null && !TextUtils.isEmpty(var3)) {
                        var4 = FileUtil.readFileContents(var3);
                        this.b.setStyleData(var4);
                     }

                     if (this.b.getStyleData() == null && this.u == null) {
                        if (this.q) {
                           this.c = true;
                           this.b.setEnable(false);
                        }
                     } else {
                        if (this.m == null) {
                           this.m = a(FileUtil.readFileContentsFromAssets(this.h, "map_assets" + File.separator + "style_0_14_1527582292_for_custom.data"));
                        }

                        var4 = this.u != null ? this.u : this.b.getStyleData();
                        boolean var5 = this.c(var4);
                        if (!var5) {
                           ek.a();
                        } else {
                           this.a.a().setCustomStyleData(this.g, var4, this.m);
                           this.q = true;
                           if (this.a != null) {
                              this.a.resetRenderTime();
                           }
                        }
                     }

                     this.d = false;
                  }

                  if (this.f) {
                     var3 = this.b.getStyleExtraPath();
                     if (this.b.getStyleExtraData() == null && !TextUtils.isEmpty(var3)) {
                        var4 = FileUtil.readFileContents(var3);
                        this.b.setStyleExtraData(var4);
                     }

                     if (this.b.getStyleExtraData() != null || this.v != null) {
                        var4 = this.v != null ? this.v : this.b.getStyleExtraData();
                        if (var4 != null) {
                           this.b(var4);
                           this.r = true;
                        }
                     }

                     this.f = false;
                  }
               }
            } catch (Throwable var8) {
               ht.c(var8, "AMapCustomStyleManager", "updateStyle");
            }

         }
      }
   }

   private void b(byte[] var1) {
      if (var1 != null) {
         ec var2 = ef.a(var1);
         if (var2 != null && var2.a() != null) {
            try {
               JSONObject var3 = new JSONObject(var2.a());
               if (var3 != null) {
                  JSONObject var4 = var3.optJSONObject("bg");
                  boolean var5 = true;
                  String var6 = null;
                  if (var4 != null) {
                     var5 = var4.optBoolean("visible", true);
                     var6 = var4.optString("lineColor", (String)null);
                  }

                  this.a(var6, var5);
                  JSONObject var7 = var3.optJSONObject("traffic");
                  if (var7 != null) {
                     JSONObject var8 = var7.optJSONObject("multiFillColors");
                     if (var8 != null) {
                        int var9 = ef.a(var8.optString("smooth"));
                        int var10 = ef.a(var8.optString("slow"));
                        int var11 = ef.a(var8.optString("congested"));
                        int var12 = ef.a(var8.optString("seriousCongested"));
                        this.x.setSmoothColor(var9);
                        this.x.setSlowColor(var10);
                        this.x.setCongestedColor(var11);
                        this.x.setSeriousCongestedColor(var12);
                        if (this.a != null && this.a.a() != null) {
                           this.a.a().setTrafficStyle(this.g, this.x.getSmoothColor(), this.x.getSlowColor(), this.x.getCongestedColor(), this.x.getSeriousCongestedColor(), true);
                        }
                     }
                  }

                  return;
               }
            } catch (Throwable var13) {
               ht.c(var13, "AMapCustomStyleManager", "setExtraStyle");
            }
         }
      }

   }

   private void a(String var1, boolean var2) {
      byte var3 = 0;
      int var4 = Integer.MIN_VALUE;
      if (!TextUtils.isEmpty(var1)) {
         var4 = ef.a(var1);
      }

      if (this.a != null && this.a.a() != null) {
         if (this.k == null) {
            this.k = FileUtil.readFileContentsFromAssets(this.h, "map_assets" + File.separator + "bktile.data");
         }

         if (this.k != null) {
            boolean var5 = true;
            if (!var2) {
               var4 = var3;
               var5 = false;
            } else if (var4 == Integer.MIN_VALUE) {
               var5 = true;
            } else {
               var5 = false;
            }

            byte[] var6 = fi.a((byte[])this.k.clone(), var3, var4, var5);
            this.a.a().setBackgroundTexture(this.g, var6);
         }
      }

   }

   private void f() {
      if (this.a != null && this.a.a() != null && this.k != null) {
         this.a.a().setBackgroundTexture(this.g, this.k);
      }

      if (this.a != null && this.a.a() != null) {
         this.a.a().setTrafficStyle(this.g, 0, 0, 0, 0, false);
      }

      this.r = false;
   }

   private boolean c(byte[] var1) {
      if (var1 == null) {
         return true;
      } else {
         try {
            short var2 = 10240;
            if (var1.length < var2) {
               byte[] var3 = (byte[])var1.clone();
               ec var4 = ef.a(var3);
               if (var4 != null && var4.a() != null) {
                  try {
                     JSONObject var5 = new JSONObject(var4.a());
                     if (var5 != null) {
                        return false;
                     }
                  } catch (JSONException var6) {
                     ht.c(var6, "AMapCustomStyleManager", "checkData");
                  }
               }
            }
         } catch (Throwable var7) {
            ht.c(var7, "AMapCustomStyleManager", "checkData");
         }

         return true;
      }
   }

   private void g() {
      if (this.j == null) {
         this.j = a(FileUtil.readFileContentsFromAssets(this.h, "map_assets" + File.separator + "style_1_14_1536235157.data"));
      }

      if (this.i == null) {
         ;
      }

      this.a.a().setCustomStyleData(this.g, this.j, this.i);
      this.q = false;
   }

   private void h() {
      if (this.p) {
         if (this.l == null) {
            this.l = FileUtil.readFileContentsFromAssets(this.h, "map_assets" + File.separator + "icons_5_14_for_custom.data");
         }

         this.p = false;
         this.a.a().setCustomStyleTexture(this.g, this.l);
      }

   }

   public void a(CustomMapStyleOptions var1) {
      if (this.b != null) {
         if (var1 != null) {
            synchronized(this) {
               if (!this.n) {
                  this.n = true;
                  if (this.b.isEnable()) {
                     this.c = true;
                  }
               }

               if (this.b.isEnable() != var1.isEnable()) {
                  this.b.setEnable(var1.isEnable());
                  this.c = true;
               }

               boolean var3 = this.b.isEnable();
               if (var3) {
                  if (!TextUtils.equals(this.b.getStyleId(), var1.getStyleId())) {
                     this.b.setStyleId(var1.getStyleId());
                     String var4 = this.b.getStyleId();
                     if (!TextUtils.isEmpty(var4) && this.a != null && this.a.getMapConfig() != null && this.a.getMapConfig().isProFunctionAuthEnable()) {
                        if (this.s == null) {
                           this.s = new dy(this.h, this, 1);
                        }

                        this.s.a(var4);
                        this.s.b();
                        if (this.t == null) {
                           this.t = new dy(this.h, this, 0);
                        }

                        this.t.a(var4);
                        this.t.b();
                     }
                  }

                  if (!TextUtils.equals(this.b.getStyleDataPath(), var1.getStyleDataPath())) {
                     this.b.setStyleDataPath(var1.getStyleDataPath());
                     this.d = true;
                  }

                  if (this.b.getStyleData() != var1.getStyleData()) {
                     this.b.setStyleData(var1.getStyleData());
                     this.d = true;
                  }

                  if (!TextUtils.equals(this.b.getStyleTexturePath(), var1.getStyleTexturePath())) {
                     this.b.setStyleTexturePath(var1.getStyleTexturePath());
                     this.e = true;
                  }

                  if (this.b.getStyleTextureData() != var1.getStyleTextureData()) {
                     this.b.setStyleTextureData(var1.getStyleTextureData());
                     this.e = true;
                  }

                  if (!TextUtils.equals(this.b.getStyleExtraPath(), var1.getStyleExtraPath())) {
                     this.b.setStyleExtraPath(var1.getStyleExtraPath());
                     this.f = true;
                  }

                  if (this.b.getStyleExtraData() != var1.getStyleExtraData()) {
                     this.b.setStyleExtraData(var1.getStyleExtraData());
                     this.f = true;
                  }

                  fg.a(this.h, true);
               } else {
                  this.i();
                  fg.a(this.h, false);
               }

            }
         }
      }
   }

   public void b() {
      if (this.b != null) {
         synchronized(this) {
            if (this.a != null && this.a.getMapConfig() != null && !this.a.getMapConfig().isProFunctionAuthEnable()) {
               this.b.setStyleId((String)null);
               this.u = null;
               this.v = null;
            }

            this.e = true;
            this.d = true;
            if (this.r) {
               this.f = true;
            }

            this.c = true;
         }
      }
   }

   public static byte[] a(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         ByteArrayInputStream var2 = new ByteArrayInputStream(var0);

         try {
            GZIPInputStream var3 = new GZIPInputStream(var2);
            byte[] var4 = new byte[256];

            int var5;
            while((var5 = var3.read(var4)) >= 0) {
               var1.write(var4, 0, var5);
            }

            return var1.toByteArray();
         } catch (Throwable var6) {
            var6.printStackTrace();
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(byte[] var1, int var2) {
      if (this.b != null) {
         synchronized(this) {
            if (this.a != null) {
               MapConfig var4 = this.a.getMapConfig();
               if (var4 != null && var4.isProFunctionAuthEnable()) {
                  var4.setUseProFunction(true);
                  if (var2 == 1) {
                     this.u = var1;
                     this.d = true;
                  } else if (var2 == 0) {
                     this.v = var1;
                     this.f = true;
                  }
               }
            }
         }
      }

   }

   public void c() {
      if (this.b == null) {
         this.b = new CustomMapStyleOptions();
      }

   }

   public boolean d() {
      return this.b != null;
   }

   public void e() {
      synchronized(this) {
         if (this.b != null) {
            this.b.setEnable(false);
            this.i();
            this.c = true;
         }

      }
   }

   private void i() {
      if (this.b != null) {
         this.b.setStyleId((String)null);
         this.b.setStyleDataPath((String)null);
         this.b.setStyleData((byte[])null);
         this.b.setStyleTexturePath((String)null);
         this.b.setStyleTextureData((byte[])null);
         this.b.setStyleExtraData((byte[])null);
         this.b.setStyleExtraPath((String)null);
      }

   }
}
