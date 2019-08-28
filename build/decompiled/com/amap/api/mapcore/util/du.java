package com.amap.api.mapcore.util;

import android.graphics.Rect;
import android.opengl.GLES20;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.TileOverlayOptions;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.ITileOverlay;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class du implements dl {
   private ah b;
   private TileProvider c;
   private Float d;
   private boolean e;
   private boolean f = false;
   private u g;
   private static int h = 0;
   private int i = 256;
   private int j = 256;
   private int k = -1;
   private fj l;
   private List<du$a> m = new ArrayList();
   private boolean n = false;
   private du$b o = null;
   private String p = null;
   private FloatBuffer q = null;
   dw$f a;

   private static String b(String var0) {
      ++h;
      return var0 + h;
   }

   public du(TileOverlayOptions var1, ah var2, boolean var3) {
      this.b = var2;
      this.c = var1.getTileProvider();
      this.i = this.c.getTileWidth();
      this.j = this.c.getTileHeight();
      this.q = fi.a(new float[]{0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F});
      this.d = var1.getZIndex();
      this.e = var1.isVisible();
      this.f = var3;
      if (this.f) {
         this.p = "TileOverlay0";
      } else {
         this.p = this.getId();
      }

      this.g = this.b.a();
      this.k = Integer.parseInt(this.p.substring("TileOverlay".length()));

      try {
         fm$a var4;
         if (var3) {
            var4 = new fm$a(this.b.e(), this.p, var2.a().getMapConfig().getMapLanguage());
         } else {
            var4 = new fm$a(this.b.e(), this.p);
         }

         var4.a(var1.getMemoryCacheEnabled());
         if (this.f) {
            var4.i = false;
         }

         var4.b(var1.getDiskCacheEnabled());
         var4.a(var1.getMemCacheSize());
         var4.a(var1.getDiskCacheSize());
         String var5 = var1.getDiskCacheDir();
         if (var5 != null && !"".equals(var5)) {
            var4.a(var5);
         }

         this.l = new fj(this.b.e(), this.i, this.j);
         this.l.a(this.c);
         this.l.a((fm$a)var4);
         this.l.a((fl$c)(new du$1(this)));
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

   }

   public void remove() {
      this.b.b(this);
      this.g.setRunLowFrame(false);
   }

   public void destroy(boolean var1) {
      this.d();
      List var2 = this.m;
      synchronized(this.m) {
         int var3 = this.m.size();
         int var5 = 0;

         while(true) {
            if (var5 >= var3) {
               this.m.clear();
               break;
            }

            du$a var4 = (du$a)this.m.get(var5);
            var4.b();
            ++var5;
         }
      }

      if (this.l != null) {
         this.l.c(var1);
         this.l.a(true);
         this.l.a((TileProvider)null);
      }

   }

   public void clearTileCache() {
      if (this.l != null) {
         this.l.f();
      }

   }

   public String getId() {
      if (this.p == null) {
         this.p = b("TileOverlay");
      }

      return this.p;
   }

   public void setZIndex(float var1) {
      this.d = var1;
      this.b.d();
   }

   public float getZIndex() {
      return this.d.floatValue();
   }

   public void setVisible(boolean var1) {
      this.e = var1;
      this.g.setRunLowFrame(false);
      if (var1) {
         this.a(true);
      }

   }

   public boolean isVisible() {
      return this.e;
   }

   public boolean equalsRemote(ITileOverlay var1) {
      return this.equals(var1) || var1.getId().equals(this.getId());
   }

   public int hashCodeRemote() {
      return super.hashCode();
   }

   private boolean a(du$a var1) {
      float var2 = (float)var1.c;
      int var3 = this.i;
      int var4 = this.j;
      int var5 = var1.e.x;
      int var6 = var1.e.y + (1 << 20 - (int)var2) * var4;
      MapConfig var7 = this.g.getMapConfig();
      float[] var8 = new float[]{(float)(var5 - var7.getSX()), (float)(var6 - var7.getSY()), 0.0F, (float)(var5 + (1 << 20 - (int)var2) * var3 - var7.getSX()), (float)(var6 - var7.getSY()), 0.0F, (float)(var5 + (1 << 20 - (int)var2) * var3 - var7.getSX()), (float)(var6 - (1 << 20 - (int)var2) * var4 - var7.getSY()), 0.0F, (float)(var5 - var7.getSX()), (float)(var6 - (1 << 20 - (int)var2) * var4 - var7.getSY()), 0.0F};
      if (var1.h == null) {
         var1.h = fi.a(var8);
      } else {
         var1.h = fi.a(var8, var1.h);
      }

      Object var9 = null;
      return true;
   }

   public void a() {
      if (this.m != null) {
         List var1 = this.m;
         synchronized(this.m) {
            if (this.m.size() == 0) {
               return;
            }

            int var2 = this.m.size();

            for(int var4 = 0; var4 < var2; ++var4) {
               du$a var3 = (du$a)this.m.get(var4);
               if (!var3.g) {
                  try {
                     IPoint var5 = var3.e;
                     if (var3.i != null && !var3.i.isRecycled() && var5 != null) {
                        var3.f = fi.a(var3.i);
                        if (var3.f != 0) {
                           var3.g = true;
                        }

                        var3.i = null;
                     }
                  } catch (Throwable var7) {
                     ht.c(var7, "TileOverlayDelegateImp", "drawTiles");
                  }
               }

               if (var3.g) {
                  this.a(var3);
                  this.a(var3.f, var3.h, this.q);
               }
            }
         }
      }

   }

   private static ArrayList<du$a> b(u var0, int var1, int var2, int var3, int var4, ah var5, fj var6) {
      GLMapState var7 = var0.c();
      int var8 = var1;
      boolean var9 = false;
      boolean var10 = false;
      IPoint var11 = null;
      int var12 = Integer.MAX_VALUE;
      byte var13 = 0;
      int var14 = Integer.MAX_VALUE;
      byte var15 = 0;
      Rect var16 = var0.getMapConfig().getGeoRectangle().getRect();
      IPoint var17 = IPoint.obtain();
      IPoint var18 = IPoint.obtain();
      var17.x = var16.left;
      var17.y = var16.top;
      var12 = Math.min(var12, var17.x);
      int var33 = Math.max(var13, var17.x);
      var14 = Math.min(var14, var17.y);
      int var34 = Math.max(var15, var17.y);
      var17.x = var16.right;
      var17.y = var16.top;
      var12 = Math.min(var12, var17.x);
      var33 = Math.max(var33, var17.x);
      var14 = Math.min(var14, var17.y);
      var34 = Math.max(var34, var17.y);
      var17.x = var16.left;
      var17.y = var16.bottom;
      var12 = Math.min(var12, var17.x);
      var33 = Math.max(var33, var17.x);
      var14 = Math.min(var14, var17.y);
      var34 = Math.max(var34, var17.y);
      var17.x = var16.right;
      var17.y = var16.bottom;
      var12 = Math.min(var12, var17.x);
      var33 = Math.max(var33, var17.x);
      var14 = Math.min(var14, var17.y);
      var34 = Math.max(var34, var17.y);
      var12 -= (1 << 20 - var1) * var2;
      var14 -= (1 << 20 - var1) * var3;
      var7.getMapGeoCenter(var18);
      int var19 = (var18.x >> 20 - var1) / var2;
      int var20 = (var18.y >> 20 - var1) / var3;
      int var21 = (var19 << 20 - var1) * var2;
      int var22 = (var20 << 20 - var1) * var3;
      du$a var23 = new du$a(var19, var20, var1, var4, var0, var5, var6);
      var23.e = IPoint.obtain(var21, var22);
      var17.recycle();
      var18.recycle();
      ArrayList var24 = new ArrayList();
      var24.add(var23);
      int var31 = var19;
      int var32 = var20;
      boolean var25 = false;
      boolean var26 = false;
      boolean var27 = false;
      du$a var28 = null;
      int var29 = 1;

      while(true) {
         var25 = false;

         int var30;
         for(var30 = var31 - var29; var30 <= var31 + var29; ++var30) {
            int var36 = var32 + var29;
            var11 = new IPoint((var30 << 20 - var8) * var2, (var36 << 20 - var8) * var3);
            if (var11.x < var33 && var11.x > var12 && var11.y < var34 && var11.y > var14) {
               if (!var25) {
                  var25 = true;
               }

               var28 = new du$a(var30, var36, var8, var4, var0, var5, var6);
               var28.e = var11;
               var24.add(var28);
            }

            var36 = var32 - var29;
            var11 = new IPoint((var30 << 20 - var8) * var2, (var36 << 20 - var8) * var3);
            if (var11.x < var33 && var11.x > var12 && var11.y < var34 && var11.y > var14) {
               if (!var25) {
                  var25 = true;
               }

               var28 = new du$a(var30, var36, var8, var4, var0, var5, var6);
               var28.e = var11;
               var24.add(var28);
            }
         }

         for(var30 = var32 + var29 - 1; var30 > var32 - var29; --var30) {
            int var35 = var31 + var29;
            var11 = new IPoint((var35 << 20 - var8) * var2, (var30 << 20 - var8) * var3);
            if (var11.x < var33 && var11.x > var12 && var11.y < var34 && var11.y > var14) {
               if (!var25) {
                  var25 = true;
               }

               var28 = new du$a(var35, var30, var8, var4, var0, var5, var6);
               var28.e = var11;
               var24.add(var28);
            }

            var35 = var31 - var29;
            var11 = new IPoint((var35 << 20 - var8) * var2, (var30 << 20 - var8) * var3);
            if (var11.x < var33 && var11.x > var12 && var11.y < var34 && var11.y > var14) {
               if (!var25) {
                  var25 = true;
               }

               var28 = new du$a(var35, var30, var8, var4, var0, var5, var6);
               var28.e = var11;
               var24.add(var28);
            }
         }

         if (!var25) {
            return var24;
         }

         ++var29;
      }
   }

   public void b() {
      if (this.m != null) {
         List var1 = this.m;
         synchronized(this.m) {
            this.m.clear();
         }
      }

   }

   private static boolean b(u var0, List<du$a> var1, int var2, boolean var3, List<du$a> var4, boolean var5, ah var6, fj var7) {
      if (var1 == null) {
         return false;
      } else if (var4 == null) {
         return false;
      } else {
         Iterator var9;
         synchronized(var4) {
            var9 = var4.iterator();

            while(var9.hasNext()) {
               du$a var10 = (du$a)var9.next();
               boolean var11 = false;
               Iterator var12 = var1.iterator();

               while(var12.hasNext()) {
                  du$a var13 = (du$a)var12.next();
                  if (var10.equals(var13) && var10.g) {
                     var13.g = var10.g;
                     var13.f = var10.f;
                     var11 = true;
                     break;
                  }
               }

               if (!var11) {
                  var10.b();
               }
            }

            var4.clear();
         }

         if (var2 <= (int)var0.getMaxZoomLevel() && var2 >= (int)var0.getMinZoomLevel()) {
            int var8 = var1.size();
            if (var8 <= 0) {
               return false;
            } else {
               var9 = null;

               for(int var17 = 0; var17 < var8; ++var17) {
                  du$a var16 = (du$a)var1.get(var17);
                  if (var16 != null) {
                     if (var5) {
                        if (var6.a().getMapConfig().getMapLanguage().equals("zh_cn")) {
                           if (!MapsInitializer.isLoadWorldGridMap() || var16.c < 7 || fb.a(var16.a, var16.b, var16.c)) {
                              continue;
                           }
                        } else if (!MapsInitializer.isLoadWorldGridMap() && var16.c >= 7 && !fb.a(var16.a, var16.b, var16.c)) {
                           continue;
                        }
                     }

                     var4.add(var16);
                     if (!var16.g && var7 != null) {
                        var7.a(var3, var16);
                     }
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }

   public void a(boolean var1) {
      if (!this.n) {
         this.d();
         this.c(var1);
      }
   }

   private void d() {
      if (this.o != null && this.o.a() == ei$e.b) {
         this.o.a(true);
      }

   }

   private void c(boolean var1) {
      this.o = new du$b(var1, this.g, this.i, this.j, this.k, this.m, this.f, this.b, this.l);
      this.o.c(new Void[0]);
   }

   public void c() {
      this.d();
      List var1 = this.m;
      synchronized(this.m) {
         int var2 = this.m.size();

         for(int var4 = 0; var4 < var2; ++var4) {
            du$a var3 = (du$a)this.m.get(var4);
            var3.b();
         }

         this.m.clear();
      }
   }

   public void b(boolean var1) {
      if (this.n != var1) {
         this.n = var1;
         if (this.l != null) {
            this.l.a(var1);
         }
      }

   }

   public void a(String var1) {
      this.d();
      this.b();
      if (this.l != null) {
         this.l.a(true);
         this.l.a((String)var1);
         this.l.a(false);
      }

      this.c(true);
   }

   private void e() {
      if (this.b != null && this.b.a() != null) {
         u var1 = this.b.a();
         this.a = (dw$f)var1.u(0);
      }

   }

   private void a(int var1, FloatBuffer var2, FloatBuffer var3) {
      if (var2 != null && var3 != null && var1 != 0) {
         if (this.a == null || this.a.c()) {
            this.e();
         }

         this.a.a();
         GLES20.glEnable(3042);
         GLES20.glBlendFunc(1, 771);
         GLES20.glBlendColor(1.0F, 1.0F, 1.0F, 1.0F);
         GLES20.glActiveTexture(33984);
         GLES20.glBindTexture(3553, var1);
         GLES20.glEnableVertexAttribArray(this.a.b);
         GLES20.glVertexAttribPointer(this.a.b, 3, 5126, false, 12, var2);
         GLES20.glEnableVertexAttribArray(this.a.c);
         GLES20.glVertexAttribPointer(this.a.c, 2, 5126, false, 8, var3);
         GLES20.glUniformMatrix4fv(this.a.a, 1, false, this.b.g(), 0);
         GLES20.glDrawArrays(6, 0, 4);
         GLES20.glDisableVertexAttribArray(this.a.b);
         GLES20.glDisableVertexAttribArray(this.a.c);
         GLES20.glBindTexture(3553, 0);
         GLES20.glUseProgram(0);
         GLES20.glDisable(3042);
      }
   }
}
