package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.amap.api.maps.AMap$CancelableCallback;
import com.amap.api.maps.AMap$CommonInfoWindowAdapter;
import com.amap.api.maps.AMap$InfoWindowAdapter;
import com.amap.api.maps.AMap$OnCacheRemoveListener;
import com.amap.api.maps.AMap$OnCameraChangeListener;
import com.amap.api.maps.AMap$OnIndoorBuildingActiveListener;
import com.amap.api.maps.AMap$OnInfoWindowClickListener;
import com.amap.api.maps.AMap$OnMapClickListener;
import com.amap.api.maps.AMap$OnMapLoadedListener;
import com.amap.api.maps.AMap$OnMapLongClickListener;
import com.amap.api.maps.AMap$OnMapScreenShotListener;
import com.amap.api.maps.AMap$OnMapTouchListener;
import com.amap.api.maps.AMap$OnMarkerClickListener;
import com.amap.api.maps.AMap$OnMarkerDragListener;
import com.amap.api.maps.AMap$OnMultiPointClickListener;
import com.amap.api.maps.AMap$OnMyLocationChangeListener;
import com.amap.api.maps.AMap$OnPOIClickListener;
import com.amap.api.maps.AMap$OnPolylineClickListener;
import com.amap.api.maps.AMap$onMapPrintScreenListener;
import com.amap.api.maps.CameraUpdate;
import com.amap.api.maps.CustomRenderer;
import com.amap.api.maps.InfoWindowAnimationManager;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.Projection;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.AMapCameraInfo;
import com.amap.api.maps.model.AMapGestureListener;
import com.amap.api.maps.model.Arc;
import com.amap.api.maps.model.ArcOptions;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BuildingOverlay;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.Circle;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.CrossOverlay;
import com.amap.api.maps.model.CrossOverlayOptions;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.GL3DModelOptions;
import com.amap.api.maps.model.GroundOverlay;
import com.amap.api.maps.model.GroundOverlayOptions;
import com.amap.api.maps.model.IndoorBuildingInfo;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.LatLngBounds$Builder;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MultiPointOverlay;
import com.amap.api.maps.model.MultiPointOverlayOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.MyTrafficStyle;
import com.amap.api.maps.model.NavigateArrow;
import com.amap.api.maps.model.NavigateArrowOptions;
import com.amap.api.maps.model.Poi;
import com.amap.api.maps.model.Polygon;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.RouteOverlay;
import com.amap.api.maps.model.Text;
import com.amap.api.maps.model.TextOptions;
import com.amap.api.maps.model.TileOverlay;
import com.amap.api.maps.model.TileOverlayOptions;
import com.amap.api.maps.model.particle.ParticleOverlay;
import com.amap.api.maps.model.particle.ParticleOverlayOptions;
import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.ae.gmap.GLMapEngine$InitParam;
import com.autonavi.ae.gmap.GLMapEngine$MapViewInitParam;
import com.autonavi.ae.gmap.GLMapRender;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.ae.gmap.glinterface.MapLabelItem;
import com.autonavi.ae.gmap.gloverlay.BaseMapOverlay;
import com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay;
import com.autonavi.ae.gmap.gloverlay.GLOverlayBundle;
import com.autonavi.ae.gmap.gloverlay.GLTextureProperty;
import com.autonavi.ae.gmap.listener.AMapWidgetListener;
import com.autonavi.ae.gmap.style.StyleItem;
import com.autonavi.amap.mapcore.AMapNativeRenderer;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type;
import com.autonavi.amap.mapcore.AeUtil;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.FPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.Rectangle;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import com.autonavi.amap.mapcore.animation.GLAlphaAnimation;
import com.autonavi.amap.mapcore.interfaces.IAMapListener;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay;
import com.autonavi.amap.mapcore.message.AbstractGestureMapMessage;
import com.autonavi.amap.mapcore.tools.GLConvertUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class c implements ea$a, u, IAMapListener {
   private AMap$OnMarkerClickListener u;
   private AMap$OnPolylineClickListener v;
   private AMap$OnMarkerDragListener w;
   private AMap$OnMapLoadedListener x;
   private AMap$OnCameraChangeListener y;
   private AMap$OnMapClickListener z;
   private AMap$OnMapTouchListener A;
   private AMap$OnPOIClickListener B;
   private AMap$OnMapLongClickListener C;
   private AMap$OnInfoWindowClickListener D;
   private AMap$OnIndoorBuildingActiveListener E;
   private AMap$OnMyLocationChangeListener F;
   private h G;
   private AMap$onMapPrintScreenListener H = null;
   private AMap$OnMapScreenShotListener I = null;
   private AMapGestureListener J;
   private ay K;
   private ds L = null;
   private UiSettings M;
   private w N;
   private final ai O;
   protected boolean a = false;
   private boolean P = false;
   private final v Q;
   private fv R;
   private ah S = null;
   protected final aa b;
   private final s T;
   private boolean U = false;
   private int V;
   private boolean W = false;
   private p X;
   private AMapWidgetListener Y;
   private boolean Z = false;
   protected MapConfig c = new MapConfig(true);
   private boolean aa = false;
   private boolean ab = false;
   protected aw d;
   private dn ac;
   private LocationSource ad;
   private boolean ae = false;
   private Marker af = null;
   private m ag = null;
   private boolean ah = false;
   private boolean ai = false;
   private boolean aj = false;
   private boolean ak = false;
   private boolean al = false;
   private boolean am = true;
   private Rect an = new Rect();
   private int ao = 1;
   private MyTrafficStyle ap = null;
   private Thread aq;
   private Thread ar;
   private boolean as = false;
   private boolean at = false;
   private boolean au = false;
   private int av = 0;
   private CustomRenderer aw;
   private final ab ax;
   private int ay = -1;
   private int az = -1;
   private List<ad> aA = new ArrayList();
   private dy aB;
   private ea aC;
   ez e = null;
   protected Context f;
   private g aD;
   protected GLMapEngine g;
   private GLMapRender aE;
   private q aF;
   private boolean aG = false;
   public int h;
   public int i;
   private float aH = 0.0F;
   private float aI = 1.0F;
   private float aJ = 1.0F;
   private boolean aK = true;
   private boolean aL = false;
   private boolean aM = false;
   private int aN = 0;
   private volatile boolean aO = false;
   private volatile boolean aP = false;
   private boolean aQ = false;
   private boolean aR = false;
   private Lock aS = new ReentrantLock();
   private int aT = 0;
   private int aU;
   private int aV;
   private c$b aW;
   private dw aX;
   private t aY;
   private bd aZ;
   private b ba;
   protected final Handler j = new c$1(this, Looper.getMainLooper());
   private c$a bb = new c$11(this);
   private c$a bc = new c$21(this);
   private c$a bd = new c$30(this);
   private c$a be = new c$31(this);
   private c$a bf = new c$32(this);
   private c$a bg = new c$33(this);
   private c$a bh = new c$34(this);
   private c$a bi = new c$35(this);
   private c$a bj = new c$2(this);
   private Runnable bk = new c$3(this);
   private c$a bl = new c$4(this);
   private c$a bm = new c$5(this);
   private EAMapPlatformGestureInfo bn = new EAMapPlatformGestureInfo();
   Point k = new Point();
   Rect l = new Rect();
   private long bo = 0L;
   protected String m = null;
   private aw bp = null;
   float[] n = new float[16];
   float[] o = new float[16];
   float[] p = new float[16];
   private IPoint[] bq = null;
   float[] q = new float[12];
   String r = "precision highp float;\nattribute vec3 aVertex;//顶点数组,三维坐标\nuniform mat4 aMVPMatrix;//mvp矩阵\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}";
   String s = "//有颜色 没有纹理\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(1.0,0,0,1.0);\n}";
   int t = -1;

   public void a(AMapWidgetListener var1) {
      this.Y = var1;
   }

   private void a(CameraPosition var1) {
      if (this.c.getMapLanguage().equals("en")) {
         boolean var2 = this.b(var1);
         if (var2 != this.am) {
            this.am = var2;
            this.b(1, this.am);
         }
      } else if (!this.am) {
         this.am = true;
         this.b(1, this.am);
      }

   }

   private boolean b(CameraPosition var1) {
      if (var1.zoom < 7.0F) {
         return false;
      } else {
         boolean var2 = false;
         if (!var1.isAbroad) {
            if (this.c != null) {
               try {
                  var2 = !fb.a(this.c.getGeoRectangle().getClipRect());
               } catch (Throwable var4) {
                  var4.printStackTrace();
               }
            }
         } else {
            var2 = true;
         }

         return var2;
      }
   }

   public void setVisibilityEx(int var1) {
      if (this.Q != null) {
         try {
            this.Q.setVisibility(var1);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

   }

   public void onActivityPause() {
      this.Z = true;
      this.p(this.V);
   }

   public void onActivityResume() {
      this.Z = false;
      int var1 = this.V;
      if (var1 == 0) {
         var1 = this.g.getEngineIDWithType(0);
      }

      this.q(var1);
   }

   public void queueEvent(Runnable var1) {
      try {
         if (this.g != null) {
            this.Q.queueEvent(var1);
         }
      } catch (Throwable var3) {
         ht.c(var3, "AMapdelegateImp", "queueEvent");
      }

   }

   public c(v var1, Context var2, AttributeSet var3) {
      this.f = var2;
      this.aD = new g(var2, this, var1);
      ht.a(this.f);
      es.a().a(this.f);
      com.amap.api.mapcore.util.n.b = gu.c(var2);
      ej.a(this.f);
      this.aF = new q(this);
      this.g = new GLMapEngine(this.f, this);
      this.aE = new GLMapRender(this);
      this.Q = var1;
      var1.setRenderer(this.aE);
      this.O = new ai(this);
      this.R = new fv(this.f, this);
      this.R.a((ft$a)(new c$c(this, (c$1)null)));
      this.aW = new c$b(this);
      this.T = new s(this);
      if (!MapsInitializer.isTileOverlayClosed()) {
         this.S = new ah(this.f, this);
      }

      this.b = new aa(this.f, this);
      this.X = new p(this.f, this);
      this.Q.setRenderMode(0);
      this.aE.setRenderFps(15.0F);
      this.g.setMapListener(this);
      this.N = new af(this);
      this.G = new h(this);
      this.L = new ds(this, var2);
      this.K = new ay(this.f);
      this.K.a((ax)this.R);
      this.K.b((ax)this.L);
      this.ax = new ab();
      this.aq = new k(this.f, this);
      this.ad = new az(this.f);
      this.aZ = new bd(this);
      this.aY = new t();
      this.aB = new dy(this.f, this);
      this.aC = new ea(this.f);
      this.aC.a((ea$a)this);
      this.ba = new b(this, this.f);
   }

   public GLMapEngine a() {
      return this.g;
   }

   public void a(int var1, int var2) {
      if (this.aT == 0 || var2 != 5) {
         this.aT = var2;
      }
   }

   public float a(int var1) {
      return this.c != null ? this.c.getSZ() : 0.0F;
   }

   public float b(int var1) {
      return this.c != null ? this.getMapConfig().getSZ() : 0.0F;
   }

   public boolean a(int var1, int var2, int var3) {
      if (!this.aO) {
         return false;
      } else {
         float var4 = this.b(var1);
         if ((float)((int)var4) < this.c.getMaxZoomLevel()) {
            AbstractCameraUpdateMessage var5 = null;

            try {
               if (this.aa) {
                  var5 = com.amap.api.mapcore.util.an.a(1.0F, (Point)null);
               } else if (!this.O.isZoomInByScreenCenter()) {
                  this.k.x = var2;
                  this.k.y = var3;
                  var5 = com.amap.api.mapcore.util.an.a(1.0F, this.k);
               } else {
                  var5 = com.amap.api.mapcore.util.an.a(1.0F, (Point)null);
               }

               this.b(var5);
            } catch (Throwable var7) {
               ht.c(var7, "AMapDelegateImp", "onDoubleTap");
               var7.printStackTrace();
            }

            this.resetRenderTime();
            return true;
         } else {
            return false;
         }
      }
   }

   public void c(int var1) {
      if (this.aO) {
         float var2 = this.b(var1);
         if ((float)((int)var2) > this.c.getMinZoomLevel()) {
            try {
               AbstractCameraUpdateMessage var3 = com.amap.api.mapcore.util.an.b();
               this.b(var3);
            } catch (Throwable var4) {
               ht.c(var4, "AMapDelegateImp", "onDoubleTap");
               var4.printStackTrace();
            }

            this.resetRenderTime();
         }

      }
   }

   public boolean d(int var1) {
      return false;
   }

   public boolean e(int var1) {
      return this.c(var1, 7);
   }

   private void w(int var1) {
      if (this.aO) {
         this.aF.a();
         this.aG = true;
         this.aL = true;

         try {
            this.stopAnimation();
         } catch (RemoteException var3) {
            ;
         }

         this.queueEvent(new c$6(this, var1));
      }
   }

   private void x(int var1) {
      this.aG = true;
      this.aL = false;
      if (this.ai) {
         this.ai = false;
      }

      if (this.ah) {
         this.ah = false;
      }

      if (this.aj) {
         this.aj = false;
      }

      this.ae = false;
      if (this.w != null && this.af != null) {
         try {
            this.w.onMarkerDragEnd(this.af);
         } catch (Throwable var3) {
            ht.c(var3, "AMapDelegateImp", "OnMarkerDragListener.onMarkerDragEnd");
            var3.printStackTrace();
         }

         this.af = null;
      }

      this.Q.postDelayed(new c$7(this), 300L);
   }

   private void a(MotionEvent var1) throws RemoteException {
      if (this.ae && this.af != null && this.ag != null) {
         int var2 = (int)var1.getX();
         int var3 = (int)(var1.getY() - 60.0F);
         LatLng var4 = this.ag.b();
         if (var4 != null) {
            LatLng var5 = this.ag.getPosition();
            DPoint var6 = DPoint.obtain();
            this.b(var2, var3, var6);
            LatLng var7 = new LatLng(var5.latitude + var6.y - var4.latitude, var5.longitude + var6.x - var4.longitude);
            var6.recycle();
            this.af.setPosition(var7);
            if (this.w != null) {
               this.w.onMarkerDrag(this.af);
            }
         }
      }

   }

   public void b() {
      if (this.S != null && !MapsInitializer.isTileOverlayClosed()) {
         this.S.h();
      }

   }

   public GLMapState c() {
      return this.g != null ? this.g.getMapState(1) : null;
   }

   public int d() {
      return this.aY != null ? this.aY.a() : 0;
   }

   public int f(int var1) {
      return this.aY != null ? this.aY.a(var1) : 0;
   }

   public int e() {
      return this.aY != null ? this.aY.b() : 0;
   }

   public void a(Location var1) throws RemoteException {
      if (var1 != null) {
         try {
            if (!this.U || this.ad == null) {
               if (this.ac != null) {
                  this.ac.b();
               }

               this.ac = null;
               return;
            }

            if (this.ac == null) {
               this.ac = new dn(this, this.f);
            }

            if (var1.getLongitude() != 0.0D && var1.getLatitude() != 0.0D) {
               this.ac.a(var1);
            }

            if (this.F != null) {
               this.F.onMyLocationChange(var1);
            }

            this.resetRenderTime();
         } catch (Throwable var3) {
            ht.c(var3, "AMapDelegateImp", "showMyLocationOverlay");
            var3.printStackTrace();
         }

      }
   }

   public boolean a(String var1) throws RemoteException {
      this.resetRenderTime();
      return this.T.removeOverlay(var1);
   }

   public boolean b(String var1) {
      try {
         this.X.a(var1);
      } catch (Throwable var3) {
         ht.c(var3, "AMapDelegateImp", "removeGLModel");
         var3.printStackTrace();
      }

      return false;
   }

   public void f() {
      this.T.e();
   }

   public void a(double var1, double var3, IPoint var5) {
      Point var6 = VirtualEarthProjection.latLongToPixels(var1, var3, 20);
      var5.x = var6.x;
      var5.y = var6.y;
   }

   public void a(int var1, int var2, FPoint var3) {
      var3.x = (float)(var1 - this.c.getSX());
      var3.y = (float)(var2 - this.c.getSY());
   }

   public void a(int var1, int var2, DPoint var3) {
      DPoint var4 = VirtualEarthProjection.pixelsToLatLong((long)var1, (long)var2, 20);
      var3.x = var4.x;
      var3.y = var4.y;
      var4.recycle();
   }

   public float g() {
      return this.b(this.V);
   }

   public x h() {
      return this.O;
   }

   public void a(m var1) throws RemoteException {
      if (var1 != null) {
         if (this.K != null) {
            try {
               this.K.a(var1);
            } catch (RemoteException var3) {
               var3.printStackTrace();
            }
         }

      }
   }

   public void i() {
      if (this.K != null) {
         this.K.e();
      }

   }

   public void a(double var1, double var3, FPoint var5) {
      IPoint var6 = IPoint.obtain();
      this.a(var1, var3, var6);
      this.a(var6.x, var6.y, var5);
      var6.recycle();
   }

   public void b(int var1, int var2, DPoint var3) {
      if (this.aO && this.g != null) {
         GLMapState var4 = this.g.getMapState(1);
         if (var4 != null) {
            IPoint var5 = IPoint.obtain();
            var4.screenToP20Point(var1, var2, var5);
            DPoint var6 = VirtualEarthProjection.pixelsToLatLong((long)var5.x, (long)var5.y, 20);
            var3.x = var6.x;
            var3.y = var6.y;
            var5.recycle();
            var6.recycle();
         }
      }

   }

   protected void a(GLMapState var1, int var2, int var3, DPoint var4) {
      if (this.aO && this.g != null) {
         Point var5 = new Point();
         var1.screenToP20Point(var2, var3, var5);
         DPoint var6 = VirtualEarthProjection.pixelsToLatLong((long)var5.x, (long)var5.y, 20);
         var4.x = var6.x;
         var4.y = var6.y;
         var6.recycle();
      }

   }

   public void b(double var1, double var3, IPoint var5) {
      if (this.aO && this.g != null) {
         try {
            Point var6 = VirtualEarthProjection.latLongToPixels(var1, var3, 20);
            FPoint var7 = FPoint.obtain();
            this.b(var6.x, var6.y, var7);
            short var8 = -10000;
            if (var7.x == (float)var8 && var7.y == (float)var8) {
               GLMapState var9 = this.g.getNewMapState(1);
               var9.setCameraDegree(0.0F);
               var9.recalculate();
               var9.p20ToScreenPoint(var6.x, var6.y, var7);
               var9.recycle();
            }

            var5.x = (int)var7.x;
            var5.y = (int)var7.y;
            var7.recycle();
         } catch (Throwable var10) {
            var10.printStackTrace();
         }
      }

   }

   public void a(int var1, int var2, IPoint var3) {
      if (this.aO && this.g != null) {
         GLMapState var4 = this.g.getMapState(1);
         if (var4 != null) {
            var4.screenToP20Point(var1, var2, var3);
         }
      }

   }

   public void b(int var1, int var2, FPoint var3) {
      if (this.aO && this.g != null) {
         GLMapState var4 = this.g.getMapState(1);
         if (var4 != null) {
            var4.p20ToScreenPoint(var1, var2, var3);
         }
      }

   }

   public void j() {
      if (this.aO) {
         this.j.sendEmptyMessage(18);
      }

   }

   public void a(boolean var1) {
      if (!this.W && this.R != null) {
         this.R.b(var1);
      }

   }

   public void b(boolean var1) {
      if (!this.W && this.R != null) {
         this.R.a(var1);
      }

   }

   public void c(boolean var1) {
      if (!this.W && this.R != null) {
         this.R.c(var1);
      }

   }

   public void d(boolean var1) {
      if (!this.W && this.R != null) {
         this.R.d(var1);
      }

   }

   public void e(boolean var1) {
      if (!this.W && this.R != null) {
         this.R.e(var1);
      }

   }

   public void g(int var1) {
      if (!this.W && this.R != null) {
         this.R.a(var1);
      }

   }

   public LatLngBounds a(LatLng var1, float var2, float var3, float var4) {
      int var5 = this.getMapWidth();
      int var6 = this.getMapHeight();
      if (var5 > 0 && var6 > 0 && !this.W) {
         float var7 = fi.a(this.c, var2);
         GLMapState var8 = new GLMapState(1, this.g.getNativeInstance());
         if (var1 != null) {
            IPoint var9 = IPoint.obtain();
            this.a(var1.latitude, var1.longitude, var9);
            var8.setCameraDegree(var4);
            var8.setMapAngle(var3);
            var8.setMapGeoCenter(var9.x, var9.y);
            var8.setMapZoomer(var7);
            var8.recalculate();
            var9.recycle();
         }

         DPoint var12 = DPoint.obtain();
         this.a(var8, 0, 0, var12);
         LatLng var10 = new LatLng(var12.y, var12.x, false);
         this.a(var8, var5, var6, var12);
         LatLng var11 = new LatLng(var12.y, var12.x, false);
         var12.recycle();
         var8.recycle();
         return LatLngBounds.builder().include(var11).include(var10).build();
      } else {
         return null;
      }
   }

   public boolean onTouchEvent(MotionEvent var1) {
      if (!this.Z && this.aO && this.aK) {
         this.bn.mGestureState = 3;
         this.bn.mGestureType = 8;
         this.bn.mLocation = new float[]{var1.getX(), var1.getY()};
         int var2 = this.a(this.bn);
         this.r();
         switch(var1.getAction() & 255) {
         case 0:
            this.s();
            this.w(var2);
            break;
         case 1:
            this.x(var2);
         case 2:
         }

         if (var1.getAction() == 2 && this.ae) {
            try {
               this.a(var1);
            } catch (Throwable var4) {
               ht.c(var4, "AMapDelegateImp", "onDragMarker");
               var4.printStackTrace();
            }

            return true;
         } else {
            if (this.aG) {
               try {
                  this.aF.a(var1);
               } catch (Throwable var5) {
                  var5.printStackTrace();
               }
            }

            if (this.A != null) {
               this.j.removeMessages(14);
               Message var3 = this.j.obtainMessage();
               var3.what = 14;
               var3.obj = MotionEvent.obtain(var1);
               var3.sendToTarget();
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void a(int var1, int var2, PointF var3) {
      if (this.aO && !this.Z && this.g != null) {
         IPoint var4 = IPoint.obtain();
         this.a(var1, var2, var4);
         var3.x = (float)(var4.x - this.c.getSX());
         var3.y = (float)(var4.y - this.c.getSY());
         var4.recycle();
      }

   }

   public void a(float var1, float var2, IPoint var3) {
      var3.x = (int)(var1 + (float)this.c.getSX());
      var3.y = (int)(var2 + (float)this.c.getSY());
   }

   public float h(int var1) {
      return this.aO && !this.Z && this.g != null ? this.g.getMapState(1).getGLUnitWithWin(var1) : 0.0F;
   }

   public CameraPosition f(boolean var1) {
      try {
         if (this.c == null) {
            return null;
         } else {
            DPoint var2;
            if (this.aO && !this.Z && this.g != null) {
               var2 = null;
               LatLng var5;
               if (var1) {
                  DPoint var6 = DPoint.obtain();
                  this.b(this.c.getAnchorX(), this.c.getAnchorY(), var6);
                  var5 = new LatLng(var6.y, var6.x, false);
                  var6.recycle();
               } else {
                  var5 = this.A();
               }

               return CameraPosition.builder().target(var5).bearing(this.c.getSR()).tilt(this.c.getSC()).zoom(this.c.getSZ()).build();
            } else {
               var2 = DPoint.obtain();
               this.a(this.c.getSX(), this.c.getSY(), var2);
               LatLng var3 = new LatLng(var2.y, var2.x);
               var2.recycle();
               return CameraPosition.builder().target(var3).bearing(this.c.getSR()).tilt(this.c.getSC()).zoom(this.c.getSZ()).build();
            }
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private LatLng A() {
      if (this.c != null) {
         DPoint var1 = VirtualEarthProjection.pixelsToLatLong((long)this.c.getSX(), (long)this.c.getSY(), 20);
         LatLng var2 = new LatLng(var1.y, var1.x, false);
         var1.recycle();
         return var2;
      } else {
         return null;
      }
   }

   public boolean k() {
      return this.aa;
   }

   public Point l() {
      return this.R != null ? this.R.c() : new Point();
   }

   public View m() {
      return this.Q instanceof View ? (View)this.Q : null;
   }

   public boolean n() {
      byte var1 = 17;
      if (this.g() >= (float)var1 && this.d != null && this.d.g != null) {
         FPoint var2 = FPoint.obtain();
         this.b(this.d.g.x, this.d.g.y, var2);
         if (this.an.contains((int)var2.x, (int)var2.y)) {
            return true;
         }
      }

      return false;
   }

   private synchronized void B() {
      List var1 = this.aA;
      synchronized(this.aA) {
         int var2 = this.aA.size();

         for(int var3 = 0; var3 < var2; ++var3) {
            ((ad)this.aA.get(var3)).j().recycle();
         }

         this.aA.clear();
      }
   }

   public void a(ad var1) {
      if (var1 != null) {
         if (var1.k() != 0) {
            List var2 = this.aA;
            synchronized(this.aA) {
               this.aA.add(var1);
            }
         }
      }
   }

   public void c(String var1) {
      List var2 = this.aA;
      synchronized(this.aA) {
         int var3 = this.aA.size();
         int var4 = -1;

         for(int var5 = 0; var5 < var3; ++var5) {
            if (((ad)this.aA.get(var5)).o().equals(var1)) {
               var4 = var5;
               break;
            }
         }

         if (var4 >= 0) {
            this.aA.remove(var4);
         }

      }
   }

   public ad a(BitmapDescriptor var1) {
      return this.a(var1, false);
   }

   public ad a(BitmapDescriptor var1, boolean var2) {
      if (var1 != null && var1.getBitmap() != null && !var1.getBitmap().isRecycled()) {
         List var3 = this.aA;
         synchronized(this.aA) {
            ad var4 = null;

            for(int var5 = 0; var5 < this.aA.size(); ++var5) {
               var4 = (ad)this.aA.get(var5);
               if ((!var2 || var4.k() != this.e()) && var4.j().equals(var1)) {
                  return var4;
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public int a(IMarkerAction var1, Rect var2) {
      return 0;
   }

   public void i(int var1) {
      if (this.R != null) {
         this.R.b(var1);
      }

   }

   public void j(int var1) {
      if (this.R != null) {
         this.R.c(var1);
      }

   }

   public void k(int var1) {
      if (this.R != null) {
         this.R.d(var1);
      }

   }

   public float l(int var1) {
      return this.R != null ? this.R.a(var1) : 0.0F;
   }

   public void a(int var1, float var2) {
      if (this.R != null) {
         this.R.a(var1, var2);
      }

   }

   public int o() {
      return this.ay;
   }

   public void a(Runnable var1) {
      if (this.Q != null) {
         this.Q.post(var1);
      }

   }

   public void a(int var1, MotionEvent var2) {
      try {
         this.ah = false;
         this.m(var1);
         this.ag = this.b.a(var2);
         if (this.ag != null && this.ag.isDraggable()) {
            this.af = new Marker((dm)this.ag);
            LatLng var11 = this.af.getPosition();
            LatLng var4 = this.ag.b();
            if (var11 != null && var4 != null) {
               IPoint var5 = IPoint.obtain();
               this.b(var4.latitude, var4.longitude, var5);
               var5.y -= 60;
               DPoint var6 = DPoint.obtain();
               this.b(var5.x, var5.y, var6);
               LatLng var7 = new LatLng(var11.latitude + var6.y - var4.latitude, var11.longitude + var6.x - var4.longitude);
               this.af.setPosition(var7);
               this.b.a((dd)((dm)this.ag));

               try {
                  if (this.w != null) {
                     this.w.onMarkerDragStart(this.af);
                  }
               } catch (Throwable var9) {
                  ht.c(var9, "AMapDelegateImp", "onMarkerDragStart");
                  var9.printStackTrace();
               }

               this.ae = true;
               var5.recycle();
               var6.recycle();
            }
         } else if (this.C != null) {
            DPoint var3 = DPoint.obtain();
            this.b((int)var2.getX(), (int)var2.getY(), var3);
            this.C.onMapLongClick(new LatLng(var3.y, var3.x));
            this.ai = true;
            var3.recycle();
         }

         this.aE.resetTickCount(30);
      } catch (Throwable var10) {
         ht.c(var10, "AMapDelegateImp", "onLongPress");
         var10.printStackTrace();
      }

   }

   public boolean b(int var1, MotionEvent var2) {
      if (!this.aO) {
         return false;
      } else {
         int var3 = (int)var2.getX();
         int var4 = (int)var2.getY();
         this.a(var1, var3, var4);
         return false;
      }
   }

   public boolean c(int var1, MotionEvent var2) {
      if (!this.aO) {
         return false;
      } else {
         try {
            if (this.g(var2)) {
               return true;
            } else if (this.e(var2)) {
               return true;
            } else if (this.f(var2)) {
               return true;
            } else if (this.d(var2)) {
               return true;
            } else {
               this.b(var2);
               return true;
            }
         } catch (Throwable var4) {
            ht.c(var4, "AMapDelegateImp", "onSingleTapUp");
            var4.printStackTrace();
            return true;
         }
      }
   }

   private void b(MotionEvent var1) {
      this.queueEvent(new c$8(this, var1));
   }

   private void c(MotionEvent var1) {
      this.j.post(new c$9(this, var1));
   }

   private boolean d(MotionEvent var1) {
      if (this.v != null) {
         DPoint var2 = DPoint.obtain();
         this.b((int)var1.getX(), (int)var1.getY(), var2);
         LatLng var3 = new LatLng(var2.y, var2.x);
         var2.recycle();
         if (var3 != null) {
            df var4 = this.T.a(var3);
            if (var4 != null) {
               this.v.onPolylineClick(new Polyline((dj)var4));
               return false;
            }
         }
      }

      return false;
   }

   private boolean e(MotionEvent var1) throws RemoteException {
      boolean var2 = this.b.b(var1);
      if (var2) {
         m var3 = this.b.d();
         if (var3 == null) {
            return true;
         }

         try {
            Marker var4 = new Marker((dm)var3);
            this.b.a((dd)((dm)var3));
            boolean var5 = false;
            if (this.u != null) {
               var5 = this.u.onMarkerClick(var4);
               if (var5 || this.b.g() <= 0) {
                  return true;
               }
            } else {
               var5 = true;
            }

            this.a((m)((dm)var3));
            if (!var3.g()) {
               LatLng var6 = var3.b();
               if (var6 != null) {
                  IPoint var7 = IPoint.obtain();
                  this.a(var6.latitude, var6.longitude, var7);
                  this.a(com.amap.api.mapcore.util.an.a((Point)var7));
               }
            }

            return var5;
         } catch (Throwable var8) {
            ht.c(var8, "AMapDelegateImp", "onMarkerTap");
            var8.printStackTrace();
         }
      }

      return false;
   }

   private boolean f(MotionEvent var1) {
      if (this.aZ != null) {
         IPoint var2 = IPoint.obtain();
         if (this.g != null) {
            this.a((int)var1.getX(), (int)var1.getY(), var2);
         }

         boolean var3 = this.aZ.a(var2);
         var2.recycle();
         return var3;
      } else {
         return false;
      }
   }

   private boolean g(MotionEvent var1) throws RemoteException {
      if (this.K != null && this.K.a(var1)) {
         if (this.D != null) {
            m var2 = this.b.d();
            if (!var2.isVisible() && var2.isInfoWindowEnable()) {
               return true;
            }

            Marker var3 = new Marker((dm)var2);
            this.D.onInfoWindowClick(var3);
         }

         return true;
      } else {
         return false;
      }
   }

   public void drawFrame(GL10 var1) {
      if (!this.W && this.g != null) {
         this.a(1, (GL10)var1);
         this.g.renderAMap();
         this.g.pushRendererState();
         if (this.aw != null) {
            this.aw.onDrawFrame(var1);
         }

         if (this.ba != null) {
            this.ba.a();
         }

         this.a(var1);
         this.D();
         if (!this.aQ) {
            this.aQ = true;
         }

         this.g.popRendererState();
         if (this.aD != null) {
            this.aD.a(new ac(153));
         }

         if (ez.a()) {
            try {
               if (this.Q instanceof f) {
                  if (this.e == null) {
                     this.e = new ez();
                  }

                  this.e.c();
                  if (this.e.d() && !this.e.b()) {
                     Bitmap var2 = ((f)this.Q).getBitmap();
                     boolean var3 = this.e.a(var2);
                     if (var3) {
                        this.removecache();
                     }
                  }
               }
            } catch (Throwable var4) {
               ht.c(var4, "AMapDelegateImp", "PureScreenCheckTool.checkBlackScreen");
            }
         }

      }
   }

   private void a(int var1, GL10 var2) {
      if (this.az != -1) {
         this.aE.setRenderFps((float)this.az);
         this.resetRenderTime();
      } else if (!this.g.isInMapAction(var1) && !this.aL) {
         if (this.g.isInMapAnimation(var1)) {
            this.aE.setRenderFps(30.0F);
            this.aE.resetTickCount(15);
         } else {
            this.aE.setRenderFps(15.0F);
         }
      } else {
         this.aE.setRenderFps(40.0F);
      }

      if (this.c.isWorldMapEnable() != MapsInitializer.isLoadWorldGridMap()) {
         this.g(true);
         this.c.setWorldMapEnable(MapsInitializer.isLoadWorldGridMap());
      }

   }

   private void a(GL10 var1) {
      if (this.al) {
         int var2 = this.g.canStopMapRender(1) ? 1 : 0;
         Bitmap var3 = fi.a(0, 0, this.getMapWidth(), this.getMapHeight());
         Message var4 = this.j.obtainMessage(15, var3);
         var4.arg1 = var2;
         var4.sendToTarget();
         this.al = false;
      }

   }

   public void p() {
      if (this.c.getMapRect() == null || this.au) {
         this.C();
         this.au = false;
      }

      this.g.getCurTileIDs(1, this.c.getCurTileIds());
      GLMapState var1 = this.g.getMapState(1);
      if (var1 != null) {
         var1.getViewMatrix(this.c.getViewMatrix());
         var1.getProjectionMatrix(this.c.getProjectionMatrix());
         this.c.updateFinalMatrix();
         Point var2 = var1.getMapGeoCenter();
         this.c.setSX(var2.x);
         this.c.setSY(var2.y);
         this.c.setSZ(var1.getMapZoomer());
         this.c.setSC(var1.getCameraDegree());
         this.c.setSR(var1.getMapAngle());
         if (this.c.isMapStateChange()) {
            this.c.setSkyHeight(var1.getSkyHeight());
            DPoint var3 = VirtualEarthProjection.pixelsToLatLong((long)var2.x, (long)var2.y, 20);
            CameraPosition var4 = new CameraPosition(new LatLng(var3.y, var3.x, false), this.c.getSZ(), this.c.getSC(), this.c.getSR());
            var3.recycle();
            Message var5 = this.j.obtainMessage();
            var5.what = 10;
            var5.obj = var4;
            this.j.sendMessage(var5);
            this.aM = true;
            this.j();
            this.C();

            try {
               if (this.O.isZoomControlsEnabled() && this.c.isNeedUpdateZoomControllerState() && this.Y != null) {
                  this.Y.invalidateZoomController(this.c.getSZ());
               }

               if (this.c.getChangeGridRatio() != 1.0D) {
                  this.g(true);
               }

               boolean var6 = this.O.isCompassEnabled() && (this.c.isTiltChanged() || this.c.isBearingChanged());
               if (var6 && this.Y != null) {
                  this.Y.invalidateCompassView();
               }

               if (this.O.isScaleControlsEnabled() && this.Y != null) {
                  this.Y.invalidateScaleView();
               }
            } catch (Throwable var7) {
               var7.printStackTrace();
            }
         } else if (!this.aL && this.g.getAnimateionsCount() == 0 && this.g.getStateMessageCount() == 0) {
            this.onChangeFinish();
         }
      }

   }

   private void C() {
      try {
         this.c.setMapRect(fi.a((u)this, true));
         GLMapState var1 = this.g.getNewMapState(1);
         if (var1 != null) {
            var1.recalculate();
            var1.getPixel20Bound(this.l, this.getMapWidth(), this.getMapHeight());
            this.c.getGeoRectangle().updateRect(this.l, this.c.getSX(), this.c.getSY());
            float var2 = var1.getGLUnitWithWin(1);
            this.c.setMapPerPixelUnitLength(var2);
            var1.recycle();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   private void D() {
      byte var1 = 2;
      if (this.bo < (long)var1) {
         ++this.bo;
      } else {
         fr var2 = this.R.f();
         if (var2 != null && var2.getVisibility() != 8) {
            if (!this.ab) {
               this.j.sendEmptyMessage(16);
               this.ab = true;
               this.g(true);
            }

            this.j.post(new c$10(this, var2));
         }

      }
   }

   void g(boolean var1) {
      this.j.obtainMessage(17, var1 ? 1 : 0, 0).sendToTarget();
   }

   public void m(int var1) {
      this.queueEvent(new c$12(this, var1));
   }

   private Poi b(int var1, int var2, int var3) {
      if (!this.aO) {
         return null;
      } else {
         try {
            MapLabelItem var4 = null;
            ArrayList var5 = this.a(1, var1, var2, var3);
            if (var5 != null && var5.size() > 0) {
               var4 = (MapLabelItem)var5.get(0);
            }

            if (var4 != null) {
               DPoint var6 = VirtualEarthProjection.pixelsToLatLong((long)var4.pixel20X, (long)var4.pixel20Y, 20);
               Poi var7 = new Poi(var4.name, new LatLng(var6.y, var6.x, false), var4.poiid);
               var6.recycle();
               return var7;
            } else {
               return null;
            }
         } catch (Throwable var8) {
            return null;
         }
      }
   }

   public ArrayList<MapLabelItem> a(int var1, int var2, int var3, int var4) {
      if (!this.aO) {
         return null;
      } else {
         ArrayList var5 = new ArrayList();
         byte[] var6 = this.g.getLabelBuffer(var1, var2, var3, var4);
         if (var6 == null) {
            return null;
         } else {
            byte var7 = 0;
            int var8 = GLConvertUtil.getInt(var6, var7);
            int var17 = var7 + 4;
            int var9 = var8 >= 1 ? 1 : 0;

            for(int var10 = 0; var10 < var9; ++var10) {
               MapLabelItem var11 = new MapLabelItem();
               int var12 = GLConvertUtil.getInt(var6, var17);
               var17 += 4;
               int var13 = GLConvertUtil.getInt(var6, var17);
               var17 += 4;
               var11.x = var12;
               var11.y = this.Q.getHeight() - var13;
               var11.pixel20X = GLConvertUtil.getInt(var6, var17);
               var17 += 4;
               var11.pixel20Y = GLConvertUtil.getInt(var6, var17);
               var17 += 4;
               var11.pixel20Z = GLConvertUtil.getInt(var6, var17);
               var17 += 4;
               var11.type = GLConvertUtil.getInt(var6, var17);
               var17 += 4;
               var11.mSublayerId = GLConvertUtil.getInt(var6, var17);
               var17 += 4;
               var11.timeStamp = GLConvertUtil.getInt(var6, var17);
               var17 += 4;
               var11.mIsFouces = var6[var17] != 0;
               ++var17;
               if (var6[var17] == 0) {
                  var11.poiid = null;
               } else {
                  String var14 = "";

                  for(int var15 = 0; var15 < 20 && var6[var15 + var17] != 0; ++var15) {
                     var14 = var14 + (char)var6[var15 + var17];
                  }

                  var11.poiid = var14;
               }

               var17 += 20;
               byte var18 = var6[var17++];
               StringBuffer var19 = new StringBuffer();

               for(int var16 = 0; var16 < var18; ++var16) {
                  var19.append((char)GLConvertUtil.getShort(var6, var17));
                  var17 += 2;
               }

               var11.name = var19.toString();
               var5.add(var11);
            }

            return var5;
         }
      }
   }

   public float n(int var1) {
      return this.c != null ? this.c.getSR() : 0.0F;
   }

   public void a(int var1, IPoint var2) {
      if (this.c != null) {
         var2.x = this.c.getSX();
         var2.y = this.c.getSY();
      }

   }

   public float o(int var1) {
      return this.c != null ? this.c.getSC() : 0.0F;
   }

   public void a(int var1, AbstractGestureMapMessage var2) {
      if (this.aO && this.g != null) {
         try {
            var2.isUseAnchor = this.aa;
            var2.anchorX = this.c.getAnchorX();
            var2.anchorY = this.c.getAnchorY();
            this.g.addGestureMessage(var1, var2, this.O.isGestureScaleByMapCenter(), this.c.getAnchorX(), this.c.getAnchorY());
         } catch (RemoteException var4) {
            ;
         }
      }

   }

   public void p(int var1) {
      if (this.aE != null) {
         this.aE.renderPause();
      }

      this.s(var1);
   }

   public void q(int var1) {
      this.s(var1);
      if (this.aE != null) {
         this.aE.renderResume();
      }

   }

   public void q() {
      if (this.aE != null) {
         this.aE.resetTickCount(30);
      }

   }

   public void resetRenderTime() {
      if (this.aE != null) {
         this.aE.resetTickCount(2);
      }

   }

   public void r() {
      if (this.aE != null) {
         this.aE.resetTickCount(2);
      }

   }

   public void s() {
      if (this.aO && this.aE != null && !this.aE.isRenderPause()) {
         this.requestRender();
      }

   }

   public void requestRender() {
      if (this.aE != null && !this.aE.isRenderPause()) {
         this.Q.requestRender();
      }

   }

   public int getRenderMode() {
      return this.Q.getRenderMode();
   }

   private void E() {
      if (!this.as) {
         try {
            this.aq.setName("AuthThread");
            this.aq.start();
            this.as = true;
         } catch (Throwable var2) {
            var2.printStackTrace();
         }
      }

   }

   private void F() {
      if (!this.at) {
         try {
            if (this.ar == null) {
               this.ar = new i(this.f, this);
            }

            this.ar.setName("AuthProThread");
            this.ar.start();
            this.at = true;
         } catch (Throwable var2) {
            var2.printStackTrace();
         }
      }

   }

   public float t() {
      return this.aI;
   }

   public synchronized void b(int var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, false, false, (StyleItem[])null);
   }

   public synchronized void a(int var1, int var2, int var3, int var4, boolean var5, boolean var6, StyleItem[] var7) {
      if (this.aP && this.aO && this.a) {
         this.r(var3);
         this.queueEvent(new c$13(this, var1, var2, var3, var4, var5, var6, var7));
      } else {
         this.bd.g = var1;
         this.bd.d = var2;
         this.bd.e = var3;
         this.bd.f = var4;
         this.bd.b = true;
      }

   }

   protected void r(int var1) {
      if (this.R != null) {
         if (var1 == 0) {
            if (this.R.d()) {
               this.R.g(false);
               this.R.e();
            }
         } else if (!this.R.d()) {
            this.R.g(true);
            this.R.e();
         }
      }

   }

   public void s(int var1) {
      this.queueEvent(new c$14(this, var1));
   }

   public void a(int var1, boolean var2) {
      if (this.aO && this.aP) {
         this.resetRenderTime();
         this.queueEvent(new c$15(this, var1, var2));
      } else {
         this.bf.c = var2;
         this.bf.b = true;
         this.bf.g = var1;
      }

   }

   public void b(int var1, boolean var2) {
      if (this.aO && this.aP) {
         this.resetRenderTime();
         this.queueEvent(new c$16(this, var2, var1));
      } else {
         this.bi.c = var2;
         this.bi.b = true;
         this.bi.g = var1;
      }

   }

   public void c(int var1, boolean var2) {
      if (this.aO && this.aP) {
         this.resetRenderTime();
         this.queueEvent(new c$17(this, var2, var1));
      } else {
         this.bl.c = var2;
         this.bl.b = true;
         this.bl.g = var1;
      }

   }

   public synchronized void a(int var1, GL10 var2, EGLConfig var3) {
      if (this.ao == 3) {
         this.R.f().a(fr.b);
      } else {
         this.R.f().a(fr.a);
      }

      this.aP = false;
      this.h = this.Q.getWidth();
      this.i = this.Q.getHeight();
      this.aR = false;

      try {
         AeUtil.loadLib(this.f);
         GLMapEngine$InitParam var4 = AeUtil.initResource(this.f);
         this.g.createAMapInstance(var4);
         this.y(var1);
         this.aX = new dw();
         this.T.a(this.aX);
         this.aO = true;
         this.m = var2.glGetString(7937);
      } catch (Throwable var5) {
         ht.c(var5, "AMapDElegateImp", "createSurface");
      }

      GLMapState var6 = this.g.getMapState(1);
      if (var6 != null && var6.getNativeInstance() != 0L) {
         var6.setMapGeoCenter(this.c.getSX(), this.c.getSY());
         var6.setMapAngle(this.c.getSR());
         var6.setMapZoomer(this.c.getSZ());
         var6.setCameraDegree(this.c.getSC());
      }

      this.aY.a(this.f);
      this.E();
      if (this.aw != null) {
         this.aw.onSurfaceCreated(var2, var3);
      }

      this.u();
   }

   protected void u() {
      AMapNativeRenderer.nativeDrawLineInit();
   }

   public void a(int var1, GL10 var2, int var3, int var4) {
      this.aR = false;
      if (!this.aO) {
         this.a(var1, var2, (EGLConfig)null);
      }

      this.h = var3;
      this.i = var4;
      this.au = true;
      this.an = new Rect(0, 0, var3, var4);
      this.V = this.a(var1, new Rect(0, 0, this.h, this.i), this.h, this.i);
      if (!this.aP) {
         if (this.c != null) {
            this.c.setMapZoomScale(this.aI);
            this.c.setMapWidth(var3);
            this.c.setMapHeight(var4);
         }

         this.g.setIndoorEnable(this.V, false);
         this.g.setSimple3DEnable(this.V, false);
         this.g.initNativeTexture(this.V);
         this.g.setMapOpenLayer("{\"bounds\" : [{\"x2\" : 235405312,\"x1\" : 188874751,\"y2\" : 85065727,\"y1\" : 122421247}],\"sublyr\" : [{\"type\" : 4,\"sid\" : 9000006,\"zlevel\" : 2}],\"id\" : 9006,\"minzoom\" : 6,\"update_period\" : 90,\"maxzoom\" : 20,\"cachemode\" : 2,\"url\" : \"http://mpsapi.amap.com//ws/mps/lyrdata/ugc/\"}");
      }

      if (this.aD != null) {
         this.aD.a(new ac(153));
      }

      synchronized(this) {
         this.aP = true;
      }

      if (!this.aa) {
         this.c.setAnchorX(var3 >> 1);
         this.c.setAnchorY(var4 >> 1);
      } else {
         this.c.setAnchorX(Math.max(1, Math.min(this.aU, var3 - 1)));
         this.c.setAnchorY(Math.max(1, Math.min(this.aV, var4 - 1)));
      }

      this.g.setProjectionCenter(this.V, this.c.getAnchorX(), this.c.getAnchorY());
      this.a = true;
      if (this.bi.b) {
         this.bi.run();
      }

      if (this.bd.b) {
         this.bd.run();
      }

      if (this.be.b) {
         this.be.run();
      }

      if (this.bb.b) {
         this.bb.run();
      }

      if (this.bf.b) {
         this.bf.run();
      }

      if (this.bl.b) {
         this.bl.run();
      }

      if (this.bg.b) {
         this.bg.run();
      }

      if (this.bh.b) {
         this.bh.run();
      }

      if (this.bj.b) {
         this.bj.run();
      }

      if (this.bc.b) {
         this.bc.run();
      }

      if (this.bm.b) {
         this.bm.run();
      }

      if (this.aw != null) {
         this.aw.onSurfaceChanged(var2, var3, var4);
      }

      if (this.j != null) {
         this.j.post(this.bk);
      }

   }

   public void destroySurface(int var1) {
      this.aS.lock();

      try {
         if (this.aO) {
            this.g.destroyAMapEngine();
         }

         this.aO = false;
         this.aP = false;
         this.aR = false;
      } catch (Throwable var7) {
         ;
      } finally {
         this.aS.unlock();
      }

   }

   public Context v() {
      return this.f;
   }

   private void y(int var1) {
   }

   public int a(int var1, Rect var2, int var3, int var4) {
      int var5 = 0;
      if (null != this.g && var1 >= 0 && null != var2) {
         var5 = this.g.getEngineIDWithType(var1);
         boolean var6 = this.g.isEngineCreated(var5);
         if (!var6) {
            int var7 = this.f.getResources().getDisplayMetrics().densityDpi;
            float var8 = this.f.getResources().getDisplayMetrics().density;
            this.aI = GLMapState.calMapZoomScalefactor(var3, var4, var7);
            GLMapEngine$MapViewInitParam var9 = new GLMapEngine$MapViewInitParam();
            var9.engineId = var5;
            var9.x = var2.left;
            var9.y = var2.top;
            var9.width = var2.width();
            var9.height = var2.height();
            var9.screenWidth = var3;
            var9.screenHeight = var4;
            var9.screenScale = var8;
            var9.textScale = this.aJ * var8;
            var9.mapZoomScale = this.aI;
            this.g.createAMapEngineWithFrame(var9);
            GLMapState var10 = this.g.getMapState(var5);
            var10.setMapZoomer(this.c.getSZ());
            var10.setCameraDegree(this.c.getSC());
            var10.setMapAngle(this.c.getSR());
            var10.setMapGeoCenter(this.c.getSX(), this.c.getSY());
            this.g.setMapState(var5, var10);
            GLOverlayBundle var11 = new GLOverlayBundle(var5, this);
            this.g.setOvelayBundle(var5, var11);
         } else {
            this.a(var5, var2.left, var2.top, var2.width(), var2.height(), var3, var4);
         }
      }

      return var5;
   }

   public int a(EAMapPlatformGestureInfo var1) {
      return null != this.g ? this.g.getEngineIDWithGestureInfo(var1) : 1;
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (null != this.g) {
         this.g.setServiceViewRect(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   private boolean c(int var1, int var2) {
      return null != this.g ? this.g.getSrvViewStateBoolValue(var1, var2) : false;
   }

   public CameraPosition getCameraPosition() throws RemoteException {
      return this.f(this.aa);
   }

   public float getMaxZoomLevel() {
      return this.c != null ? this.c.getMaxZoomLevel() : 20.0F;
   }

   public float getMinZoomLevel() {
      return this.c != null ? this.c.getMinZoomLevel() : 3.0F;
   }

   public void moveCamera(CameraUpdate var1) throws RemoteException {
      if (var1 != null) {
         this.a(var1.getCameraUpdateFactoryDelegate());
      }
   }

   public void a(AbstractCameraUpdateMessage var1) throws RemoteException {
      if (this.g != null && !this.W) {
         if (this.Z && this.g.getStateMessageCount() > 0) {
            AbstractCameraUpdateMessage var2 = com.amap.api.mapcore.util.an.c();
            var2.nowType = AbstractCameraUpdateMessage$Type.changeGeoCenterZoomTiltBearing;
            var2.geoPoint = new Point(this.c.getSX(), this.c.getSY());
            var2.zoom = this.c.getSZ();
            var2.bearing = this.c.getSR();
            var2.tilt = this.c.getSC();
            this.g.addMessage(var1, false);

            while(this.g.getStateMessageCount() > 0) {
               AbstractCameraUpdateMessage var3 = this.g.getStateMessage();
               if (var3 != null) {
                  var3.mergeCameraUpdateDelegate(var2);
               }
            }

            var1 = var2;
         }

         this.resetRenderTime();
         this.g.clearAnimations(1, false);
         var1.isChangeFinished = true;
         this.c(var1);
         this.g.addMessage(var1, false);
      }
   }

   private void c(AbstractCameraUpdateMessage var1) {
      var1.isUseAnchor = this.aa;
      if (this.aa) {
         var1.anchorX = this.c.getAnchorX();
         var1.anchorY = this.c.getAnchorY();
      }

      if (var1.width == 0) {
         var1.width = this.getMapWidth();
      }

      if (var1.height == 0) {
         var1.height = this.getMapHeight();
      }

      var1.mapConfig = this.c;
   }

   public void animateCamera(CameraUpdate var1) throws RemoteException {
      if (var1 != null) {
         this.b(var1.getCameraUpdateFactoryDelegate());
      }
   }

   public void b(AbstractCameraUpdateMessage var1) throws RemoteException {
      this.a(var1, 250L, (AMap$CancelableCallback)null);
   }

   public void animateCameraWithCallback(CameraUpdate var1, AMap$CancelableCallback var2) throws RemoteException {
      if (var1 != null) {
         this.animateCameraWithDurationAndCallback(var1, 250L, var2);
      }
   }

   public void animateCameraWithDurationAndCallback(CameraUpdate var1, long var2, AMap$CancelableCallback var4) {
      if (var1 != null) {
         this.a(var1.getCameraUpdateFactoryDelegate(), var2, var4);
      }
   }

   public void a(AbstractCameraUpdateMessage var1, long var2, AMap$CancelableCallback var4) {
      if (var1 != null && !this.W && this.g != null) {
         var1.mCallback = var4;
         var1.mDuration = var2;
         if (!this.Z && this.getMapHeight() != 0 && this.getMapWidth() != 0) {
            try {
               this.g.interruptAnimation();
               this.resetRenderTime();
               this.c(var1);
               this.g.addMessage(var1, true);
            } catch (Throwable var6) {
               var6.printStackTrace();
            }

         } else {
            try {
               this.a(var1);
               if (var1.mCallback != null) {
                  var1.mCallback.onFinish();
               }
            } catch (Throwable var7) {
               var7.printStackTrace();
            }

         }
      }
   }

   public void stopAnimation() throws RemoteException {
      if (this.g != null) {
         this.g.interruptAnimation();
      }

      this.resetRenderTime();
   }

   public Polyline addPolyline(PolylineOptions var1) throws RemoteException {
      this.resetRenderTime();
      dj var2 = this.T.a(var1);
      return var2 != null ? new Polyline(var2) : null;
   }

   public BuildingOverlay addBuildingOverlay() {
      try {
         da var1 = this.T.a();
         if (var1 != null) {
            return new BuildingOverlay(var1);
         }
      } catch (RemoteException var2) {
         var2.printStackTrace();
      }

      return null;
   }

   public GL3DModel addGLModel(GL3DModelOptions var1) {
      return this.X.a(var1);
   }

   public ParticleOverlay addParticleOverlay(ParticleOverlayOptions var1) {
      try {
         dh var2 = this.T.a(var1);
         if (var2 != null) {
            return new ParticleOverlay(var2);
         }
      } catch (RemoteException var3) {
         var3.printStackTrace();
      }

      return null;
   }

   public NavigateArrow addNavigateArrow(NavigateArrowOptions var1) throws RemoteException {
      this.resetRenderTime();
      de var2 = this.T.a(var1);
      return var2 != null ? new NavigateArrow(var2) : null;
   }

   public Polygon addPolygon(PolygonOptions var1) throws RemoteException {
      this.resetRenderTime();
      di var2 = this.T.a(var1);
      return var2 != null ? new Polygon(var2) : null;
   }

   public Circle addCircle(CircleOptions var1) throws RemoteException {
      this.resetRenderTime();
      db var2 = this.T.a(var1);
      return var2 != null ? new Circle(var2) : null;
   }

   public Arc addArc(ArcOptions var1) throws RemoteException {
      this.resetRenderTime();
      cz var2 = this.T.a(var1);
      return var2 != null ? new Arc(var2) : null;
   }

   public GroundOverlay addGroundOverlay(GroundOverlayOptions var1) throws RemoteException {
      this.resetRenderTime();
      dc var2 = this.T.a(var1);
      return var2 != null ? new GroundOverlay(var2) : null;
   }

   public MultiPointOverlay addMultiPointOverlay(MultiPointOverlayOptions var1) throws RemoteException {
      this.resetRenderTime();
      IMultiPointOverlay var2 = this.aZ.a(var1);
      return var2 != null ? new MultiPointOverlay(var2) : null;
   }

   public Marker addMarker(MarkerOptions var1) throws RemoteException {
      this.resetRenderTime();
      return this.b.a(var1);
   }

   public Text addText(TextOptions var1) throws RemoteException {
      this.resetRenderTime();
      return this.b.a(var1);
   }

   public ArrayList<Marker> addMarkers(ArrayList<MarkerOptions> var1, boolean var2) throws RemoteException {
      this.resetRenderTime();
      return this.b.a(var1, var2);
   }

   public TileOverlay addTileOverlay(TileOverlayOptions var1) throws RemoteException {
      return this.S != null && !MapsInitializer.isTileOverlayClosed() ? this.S.a(var1) : null;
   }

   public void clear() throws RemoteException {
      try {
         this.clear(false);
      } catch (Throwable var2) {
         ht.c(var2, "AMapDelegateImp", "clear");
         var2.printStackTrace();
      }

   }

   public void clear(boolean var1) throws RemoteException {
      try {
         this.i();
         String var2 = null;
         String var3 = null;
         if (this.ac != null) {
            if (var1) {
               var2 = this.ac.c();
               var3 = this.ac.d();
            } else {
               this.ac.e();
            }
         }

         this.T.b(var3);
         if (this.S != null && !MapsInitializer.isTileOverlayClosed()) {
            this.S.c();
         }

         this.b.a(var2);
         this.X.b();
         if (this.R != null) {
            this.R.l();
         }

         if (this.aZ != null) {
            this.aZ.c();
         }

         if (this.g != null) {
            this.g.removeNativeAllOverlay(this.V);
         }

         this.resetRenderTime();
      } catch (Throwable var4) {
         ht.c(var4, "AMapDelegateImp", "clear");
         var4.printStackTrace();
      }

   }

   public int getMapType() throws RemoteException {
      return this.ao;
   }

   public void setMapType(int var1) throws RemoteException {
      if (var1 != this.ao || this.c != null && this.c.isCustomStyleEnable()) {
         if (this.aD != null) {
            this.aD.a(new ac(1, var1));
         }

         this.ao = var1;
      }
   }

   public void t(int var1) {
      this.ao = var1;

      try {
         byte var2;
         byte var3;
         byte var4;
         if (var1 == 1) {
            var2 = 0;
            var3 = 0;
            var4 = 0;
         } else if (var1 == 2) {
            var2 = 1;
            var3 = 0;
            var4 = 0;
         } else if (var1 == 3) {
            var2 = 0;
            var3 = 1;
            var4 = 4;
         } else if (var1 == 4) {
            var2 = 0;
            var3 = 0;
            var4 = 4;
         } else if (var1 == 5) {
            var2 = 2;
            var3 = 0;
            var4 = 5;
         } else {
            this.ao = 1;
            var2 = 0;
            var3 = 0;
            var4 = 0;
         }

         this.c.setMapStyleMode(var2);
         this.c.setMapStyleTime(var3);
         this.c.setMapStyleState(var4);
         if (!this.c.isCustomStyleEnable()) {
            if (this.c.getMapLanguage().equals("en")) {
               this.setMapLanguage("zh_cn");
            }

            this.b(1, var2, var3, var4);
         } else {
            if (this.ba != null && this.ba.d()) {
               this.ba.e();
            } else {
               this.a(1, var2, var3, var4, true, false, (StyleItem[])null);
               this.c.setCustomStyleEnable(false);
            }

            this.O.setLogoEnable(true);
         }

         this.resetRenderTime();
      } catch (Throwable var5) {
         ht.c(var5, "AMapDelegateImp", "setMaptype");
         var5.printStackTrace();
      }

   }

   public boolean isTrafficEnabled() throws RemoteException {
      return this.c.isTrafficEnabled();
   }

   public void setTrafficEnabled(boolean var1) throws RemoteException {
      if (this.aO && !this.W) {
         this.queueEvent(new c$18(this, var1, var1));
      } else {
         this.bb.c = var1;
         this.bb.b = true;
         this.bb.g = 1;
      }

   }

   public boolean isIndoorEnabled() throws RemoteException {
      return this.c.isIndoorEnable();
   }

   public void setIndoorEnabled(boolean var1) throws RemoteException {
      if (this.aO && !this.W) {
         this.c.setIndoorEnable(var1);
         this.resetRenderTime();
         if (var1) {
            if (this.g != null) {
               this.g.setIndoorEnable(1, true);
            }
         } else {
            if (this.g != null) {
               this.g.setIndoorEnable(1, false);
            }

            this.c.maxZoomLevel = this.c.isSetLimitZoomLevel() ? this.c.getMaxZoomLevel() : 20.0F;
            if (this.O.isZoomControlsEnabled() && this.Y != null) {
               this.Y.invalidateZoomController(this.c.getSZ());
            }
         }

         if (this.O.isIndoorSwitchEnabled()) {
            this.j.post(new c$19(this, var1));
         }
      } else {
         this.bj.c = var1;
         this.bj.b = true;
         this.bj.g = 1;
      }

   }

   public void set3DBuildingEnabled(boolean var1) throws RemoteException {
      this.p(1);
      this.a(1, var1);
      this.q(1);
   }

   public boolean isMyLocationEnabled() throws RemoteException {
      return this.U;
   }

   public void setMyLocationEnabled(boolean var1) throws RemoteException {
      if (!this.W) {
         try {
            if (this.R != null) {
               fu var2 = this.R.h();
               if (this.ad != null) {
                  if (var1) {
                     this.ad.activate(this.G);
                     this.R.h(true);
                     if (this.ac == null) {
                        this.ac = new dn(this, this.f);
                     }
                  } else {
                     if (this.ac != null) {
                        this.ac.b();
                        this.ac = null;
                     }

                     this.ad.deactivate();
                  }
               } else {
                  this.R.h(false);
               }
            }

            if (!var1) {
               this.O.setMyLocationButtonEnabled(var1);
            }

            this.U = var1;
            this.resetRenderTime();
         } catch (Throwable var3) {
            ht.c(var3, "AMapDelegateImp", "setMyLocationEnabled");
            var3.printStackTrace();
         }

      }
   }

   public void setLoadOfflineData(boolean var1) throws RemoteException {
      this.queueEvent(new c$20(this, var1));
   }

   public void setMyLocationStyle(MyLocationStyle var1) throws RemoteException {
      if (!this.W) {
         if (this.ac == null) {
            this.ac = new dn(this, this.f);
         }

         short var2 = 1000;
         if (this.ac != null) {
            if (var1.getInterval() < (long)var2) {
               var1.interval((long)var2);
            }

            if (this.ad != null && this.ad instanceof az) {
               ((az)this.ad).a(var1.getInterval());
               ((az)this.ad).a(var1.getMyLocationType());
            }

            this.ac.a(var1);
         }

      }
   }

   public void setMyLocationType(int var1) throws RemoteException {
      if (this.ac != null && this.ac.a() != null) {
         this.ac.a().myLocationType(var1);
         this.setMyLocationStyle(this.ac.a());
      }

   }

   public List<Marker> getMapScreenMarkers() throws RemoteException {
      return (List)(!fi.b(this.getMapWidth(), this.getMapHeight()) ? new ArrayList() : this.b.e());
   }

   public void setMapTextEnable(boolean var1) throws RemoteException {
      if (this.aO && this.aP) {
         this.resetRenderTime();
         this.queueEvent(new c$22(this, var1));
      } else {
         this.bg.c = var1;
         this.bg.b = true;
         this.bg.g = 1;
      }

   }

   public void setRoadArrowEnable(boolean var1) throws RemoteException {
      if (this.aO && this.aP) {
         this.resetRenderTime();
         this.queueEvent(new c$23(this, var1));
      } else {
         this.bh.c = var1;
         this.bh.b = true;
         this.bh.g = 1;
      }

   }

   public void setMyTrafficStyle(MyTrafficStyle var1) throws RemoteException {
      if (!this.W) {
         this.ap = var1;
         if (this.aO && this.aP && var1 != null) {
            this.resetRenderTime();
            this.queueEvent(new c$24(this));
         } else {
            this.bm.c = false;
            this.bm.b = true;
            this.bm.g = 1;
         }

      }
   }

   public Location getMyLocation() throws RemoteException {
      return this.ad != null ? this.G.a : null;
   }

   public void setLocationSource(LocationSource var1) throws RemoteException {
      try {
         if (this.W) {
            return;
         }

         if (this.ad != null && this.ad instanceof az) {
            this.ad.deactivate();
         }

         this.ad = var1;
         if (var1 != null) {
            this.R.h(true);
         } else {
            this.R.h(false);
         }
      } catch (Throwable var3) {
         ht.c(var3, "AMapDelegateImp", "setLocationSource");
         var3.printStackTrace();
      }

   }

   public void setMyLocationRotateAngle(float var1) throws RemoteException {
      if (this.ac != null) {
         this.ac.a(var1);
      }

   }

   public UiSettings getAMapUiSettings() throws RemoteException {
      if (this.M == null) {
         this.M = new UiSettings(this.O);
      }

      return this.M;
   }

   public Projection getAMapProjection() throws RemoteException {
      return new Projection(this.N);
   }

   public void setOnMapClickListener(AMap$OnMapClickListener var1) throws RemoteException {
      this.z = var1;
   }

   public void setOnMapTouchListener(AMap$OnMapTouchListener var1) throws RemoteException {
      this.A = var1;
   }

   public void setOnPOIClickListener(AMap$OnPOIClickListener var1) throws RemoteException {
      this.B = var1;
   }

   public void setOnMapLongClickListener(AMap$OnMapLongClickListener var1) throws RemoteException {
      this.C = var1;
   }

   public void setOnMarkerClickListener(AMap$OnMarkerClickListener var1) throws RemoteException {
      this.u = var1;
   }

   public void setOnPolylineClickListener(AMap$OnPolylineClickListener var1) throws RemoteException {
      this.v = var1;
   }

   public void setOnMarkerDragListener(AMap$OnMarkerDragListener var1) throws RemoteException {
      this.w = var1;
   }

   public void setOnMaploadedListener(AMap$OnMapLoadedListener var1) throws RemoteException {
      this.x = var1;
   }

   public void setOnCameraChangeListener(AMap$OnCameraChangeListener var1) throws RemoteException {
      this.y = var1;
   }

   public void setOnInfoWindowClickListener(AMap$OnInfoWindowClickListener var1) throws RemoteException {
      this.D = var1;
   }

   public void setOnIndoorBuildingActiveListener(AMap$OnIndoorBuildingActiveListener var1) throws RemoteException {
      this.E = var1;
   }

   public void setOnMyLocationChangeListener(AMap$OnMyLocationChangeListener var1) {
      this.F = var1;
   }

   public void setInfoWindowAdapter(AMap$InfoWindowAdapter var1) throws RemoteException {
      if (!this.W) {
         if (this.K != null) {
            this.K.a(var1);
         }

      }
   }

   public void setInfoWindowAdapter(AMap$CommonInfoWindowAdapter var1) throws RemoteException {
      if (!this.W) {
         if (this.K != null) {
            this.K.a(var1);
         }

      }
   }

   public void setOnMultiPointClickListener(AMap$OnMultiPointClickListener var1) {
      if (this.aZ != null) {
         this.aZ.a(var1);
      }

   }

   public String getMapContentApprovalNumber() {
      if (this.c != null && !this.c.isCustomStyleEnable()) {
         String var1 = ey.a(this.f, "approval_number", "mc", "");
         return !TextUtils.isEmpty(var1) ? var1 : "GS（2017）3426号 | GS（2017）2550号";
      } else {
         return null;
      }
   }

   public String getSatelliteImageApprovalNumber() {
      String var1 = ey.a(this.f, "approval_number", "si", "");
      return !TextUtils.isEmpty(var1) ? var1 : "GS（2018）984号";
   }

   public void setMapLanguage(String var1) {
      if (!TextUtils.isEmpty(var1) && this.c != null) {
         if (!this.c.isCustomStyleEnable()) {
            if (!this.c.getMapLanguage().equals(var1)) {
               boolean var2 = !var1.equals("en");
               if (var2) {
                  this.c.setMapLanguage("zh_cn");
                  this.av = 0;
               } else {
                  if (this.ao != 1) {
                     try {
                        this.setMapType(1);
                     } catch (Throwable var5) {
                        var5.printStackTrace();
                     }
                  }

                  this.c.setMapLanguage("en");
                  this.av = -10000;
               }

               try {
                  this.a(this.getCameraPosition());
               } catch (Throwable var4) {
                  var4.printStackTrace();
               }

               if (this.S != null && !MapsInitializer.isTileOverlayClosed()) {
                  this.S.a(this.c.getMapLanguage());
               }

            }
         }
      }
   }

   public void getMapPrintScreen(AMap$onMapPrintScreenListener var1) {
      this.H = var1;
      this.al = true;
      this.resetRenderTime();
   }

   public void getMapScreenShot(AMap$OnMapScreenShotListener var1) {
      this.I = var1;
      this.al = true;
      this.resetRenderTime();
   }

   public float getScalePerPixel() throws RemoteException {
      try {
         LatLng var1 = this.getCameraPosition().target;
         float var2 = this.g();
         return (float)(Math.cos(var1.latitude * 3.141592653589793D / 180.0D) * 2.0D * 3.141592653589793D * 6378137.0D / (256.0D * Math.pow(2.0D, (double)var2))) * this.t();
      } catch (Throwable var3) {
         ht.c(var3, "AMapDelegateImp", "getScalePerPixel");
         var3.printStackTrace();
         return 0.0F;
      }
   }

   public void setRunLowFrame(boolean var1) {
      if (!var1) {
         this.s();
      }

   }

   public void removecache() throws RemoteException {
      this.removecache((AMap$OnCacheRemoveListener)null);
   }

   public void removecache(AMap$OnCacheRemoveListener var1) throws RemoteException {
      if (this.j != null && this.g != null) {
         try {
            c$d var2 = new c$d(this, this.f, var1);
            this.j.removeCallbacks(var2);
            this.j.post(var2);
         } catch (Throwable var3) {
            ht.c(var3, "AMapDelegateImp", "removecache");
            var3.printStackTrace();
         }
      }

   }

   public void setCustomRenderer(CustomRenderer var1) throws RemoteException {
      this.aw = var1;
   }

   public void setCenterToPixel(int var1, int var2) throws RemoteException {
      this.aa = true;
      this.aU = var1;
      this.aV = var2;
      if (this.aP && this.aO) {
         if (this.c.getAnchorX() == this.aU && this.c.getAnchorY() == this.aV) {
            return;
         }

         this.c.setAnchorX(this.aU);
         this.c.setAnchorY(this.aV);
         this.queueEvent(new c$25(this));
      }

   }

   public void setMapTextZIndex(int var1) throws RemoteException {
      this.av = var1;
   }

   public int getMapTextZIndex() throws RemoteException {
      return this.av;
   }

   public void reloadMap() {
   }

   public void setRenderFps(int var1) {
      try {
         this.az = Math.max(10, Math.min(var1, 40));
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setIndoorBuildingInfo(IndoorBuildingInfo var1) throws RemoteException {
      if (!this.W) {
         if (var1 != null && var1.activeFloorName != null && var1.poiid != null) {
            this.d = (aw)var1;
            this.resetRenderTime();
            this.queueEvent(new c$26(this));
         }
      }
   }

   public void setAMapGestureListener(AMapGestureListener var1) {
      if (this.aF != null) {
         this.J = var1;
         this.aF.a(var1);
      }

   }

   public float getZoomToSpanLevel(LatLng var1, LatLng var2) {
      MapConfig var3 = this.getMapConfig();
      if (var1 != null && var2 != null && this.aO && !this.W) {
         LatLngBounds$Builder var4 = new LatLngBounds$Builder();
         var4.include(var1);
         var4.include(var2);
         GLMapState var5 = new GLMapState(1, this.g.getNativeInstance());
         Pair var6 = fi.a(var3, 0, 0, 0, 0, var4.build(), this.getMapWidth(), this.getMapHeight());
         var5.recycle();
         return var6 != null ? ((Float)var6.first).floatValue() : var5.getMapZoomer();
      } else {
         return var3.getSZ();
      }
   }

   public Pair<Float, LatLng> calculateZoomToSpanLevel(int var1, int var2, int var3, int var4, LatLng var5, LatLng var6) {
      if (var5 != null && var6 != null && var1 == var2 && var2 == var3 && var3 == var4 && var5.latitude == var6.latitude && var5.longitude == var6.longitude) {
         return new Pair(this.getMaxZoomLevel(), var5);
      } else {
         MapConfig var7 = this.getMapConfig();
         if (var5 != null && var6 != null && this.aO && !this.W) {
            LatLngBounds$Builder var13 = new LatLngBounds$Builder();
            var13.include(var5);
            var13.include(var6);
            GLMapState var14 = new GLMapState(1, this.g.getNativeInstance());
            Pair var10 = fi.a(var7, var1, var2, var3, var4, var13.build(), this.getMapWidth(), this.getMapHeight());
            var14.recycle();
            if (var10 != null) {
               DPoint var11 = DPoint.obtain();
               GLMapState.geo2LonLat(((IPoint)var10.second).x, ((IPoint)var10.second).y, var11);
               Pair var12 = new Pair(var10.first, new LatLng(var11.y, var11.x));
               var11.recycle();
               return var12;
            } else {
               return null;
            }
         } else {
            DPoint var8 = DPoint.obtain();
            GLMapState.geo2LonLat(var7.getSX(), var7.getSY(), var8);
            Pair var9 = new Pair(var7.getSZ(), new LatLng(var8.y, var8.x));
            var8.recycle();
            return var9;
         }
      }
   }

   public InfoWindowAnimationManager getInfoWindowAnimationManager() {
      return new InfoWindowAnimationManager(this.L);
   }

   public void setMaskLayerParams(int var1, int var2, int var3, int var4, int var5, long var6) {
      try {
         if (this.ax != null) {
            float var8 = (float)var4 / 255.0F;
            GLAlphaAnimation var9 = null;
            if (var5 == -1) {
               var9 = new GLAlphaAnimation(var8, 0.0F);
               c$27 var10 = new c$27(this, var5);
               var9.setAnimationListener(var10);
            } else {
               this.ay = var5;
               var9 = new GLAlphaAnimation(0.0F, var8);
               float var12 = 0.2F;
               if (var8 > var12) {
                  if (this.R != null) {
                     this.R.j(false);
                  }
               } else if (this.R != null) {
                  this.R.j(true);
               }
            }

            var9.setInterpolator(new LinearInterpolator());
            var9.setDuration(var6);
            this.ax.a(var1, var2, var3, var4);
            this.ax.a(var9);
         }
      } catch (Throwable var11) {
         var11.printStackTrace();
      }

   }

   public void setMaxZoomLevel(float var1) {
      this.c.setMaxZoomLevel(var1);
   }

   public void setMinZoomLevel(float var1) {
      this.c.setMinZoomLevel(var1);
   }

   public void resetMinMaxZoomPreference() {
      this.c.resetMinMaxZoomPreference();

      try {
         if (this.O.isZoomControlsEnabled() && this.c.isNeedUpdateZoomControllerState() && this.Y != null) {
            this.Y.invalidateZoomController(this.c.getSZ());
         }
      } catch (RemoteException var2) {
         ;
      }

   }

   public void setMapStatusLimits(LatLngBounds var1) {
      try {
         this.c.setLimitLatLngBounds(var1);
         this.G();
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   private boolean a(LatLngBounds var1) {
      return var1 != null && var1.northeast != null && var1.southwest != null;
   }

   private void G() {
      try {
         LatLngBounds var1 = this.c.getLimitLatLngBounds();
         if (this.g != null && this.a(var1)) {
            GLMapState var2 = new GLMapState(1, this.g.getNativeInstance());
            IPoint var3 = IPoint.obtain();
            GLMapState.lonlat2Geo(var1.northeast.longitude, var1.northeast.latitude, var3);
            IPoint var4 = IPoint.obtain();
            GLMapState.lonlat2Geo(var1.southwest.longitude, var1.southwest.latitude, var4);
            IPoint[] var5 = new IPoint[]{var3, var4};
            this.c.setLimitIPoints(var5);
            var2.recycle();
            return;
         }
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

      this.c.setLimitIPoints((IPoint[])null);
   }

   public Handler getMainHandler() {
      return this.j;
   }

   public void onChangeFinish() {
      Message var1 = this.j.obtainMessage();
      var1.what = 11;
      this.j.sendMessage(var1);
   }

   protected void a(boolean var1, CameraPosition var2) {
      if (this.c != null && this.c.getChangedCounter() != 0) {
         try {
            if (!this.aL && this.g.getAnimateionsCount() == 0 && this.g.getStateMessageCount() == 0) {
               this.c.resetChangedCounter();
               if (this.J != null) {
                  this.J.onMapStable();
               }

               if (this.y == null) {
                  return;
               }

               if (!this.Q.isEnabled()) {
                  return;
               }

               if (var2 == null) {
                  try {
                     var2 = this.getCameraPosition();
                  } catch (Throwable var4) {
                     ht.c(var4, "AMapDelegateImp", "cameraChangeFinish");
                     var4.printStackTrace();
                  }
               }

               this.y.onCameraChangeFinish(var2);
            }
         } catch (Throwable var5) {
            var5.printStackTrace();
         }

      }
   }

   public void setZoomScaleParam(float var1) {
      this.aI = var1;
   }

   public void onFling() {
      if (this.S != null && !MapsInitializer.isTileOverlayClosed()) {
         this.S.b(true);
      }

      this.ak = true;
   }

   public int getMapWidth() {
      return this.h;
   }

   public int getMapHeight() {
      return this.i;
   }

   public float getCameraAngle() {
      return this.o(this.V);
   }

   public float getSkyHeight() {
      return this.c.getSkyHeight();
   }

   public boolean isMaploaded() {
      return this.ab;
   }

   public MapConfig getMapConfig() {
      return this.c;
   }

   public View getView() throws RemoteException {
      return this.R;
   }

   public void setZOrderOnTop(boolean var1) throws RemoteException {
   }

   public void onIndoorBuildingActivity(int var1, byte[] var2) {
      aw var3 = null;

      try {
         if (null != var2) {
            var3 = new aw();
            byte var4 = 0;
            boolean var5 = false;
            int var8 = var4 + 1;
            byte var9 = var2[var4];
            var3.a = new String(var2, var8, var9, "utf-8");
            var8 += var9;
            var9 = var2[var8++];
            var3.b = new String(var2, var8, var9, "utf-8");
            var8 += var9;
            var9 = var2[var8++];
            var3.activeFloorName = new String(var2, var8, var9, "utf-8");
            var8 += var9;
            var3.activeFloorIndex = GLConvertUtil.getInt(var2, var8);
            var8 += 4;
            var9 = var2[var8++];
            var3.poiid = new String(var2, var8, var9, "utf-8");
            var8 += var9;
            var9 = var2[var8++];
            var3.h = new String(var2, var8, var9, "utf-8");
            var8 += var9;
            var3.c = GLConvertUtil.getInt(var2, var8);
            var8 += 4;
            var3.floor_indexs = new int[var3.c];
            var3.floor_names = new String[var3.c];
            var3.d = new String[var3.c];

            int var6;
            for(var6 = 0; var6 < var3.c; ++var6) {
               var3.floor_indexs[var6] = GLConvertUtil.getInt(var2, var8);
               var8 += 4;
               var9 = var2[var8++];
               if (var9 > 0) {
                  var3.floor_names[var6] = new String(var2, var8, var9, "utf-8");
                  var8 += var9;
               }

               var9 = var2[var8++];
               if (var9 > 0) {
                  var3.d[var6] = new String(var2, var8, var9, "utf-8");
                  var8 += var9;
               }
            }

            var3.e = GLConvertUtil.getInt(var2, var8);
            var8 += 4;
            if (var3.e > 0) {
               var3.f = new int[var3.e];

               for(var6 = 0; var6 < var3.e; ++var6) {
                  var3.f[var6] = GLConvertUtil.getInt(var2, var8);
                  var8 += 4;
               }
            }
         }

         this.bp = var3;
         this.a((Runnable)(new c$28(this)));
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

   }

   public AMapCameraInfo getCamerInfo() {
      return null;
   }

   public void destroy() {
      this.W = true;

      try {
         if (this.aD != null) {
            this.aD.a();
         }

         if (this.aZ != null) {
            this.aZ.b();
         }

         if (this.ad != null) {
            this.ad.deactivate();
         }

         this.ad = null;
         this.aW = null;
         if (this.aE != null) {
            this.aE.renderPause();
         }

         if (this.aY != null) {
            this.aY.d();
         }

         if (this.aF != null) {
            this.aF.a((AMapGestureListener)null);
            this.aF.b();
            this.aF = null;
         }

         if (this.T != null) {
            this.T.d();
         }

         if (this.b != null) {
            this.b.i();
         }

         if (this.S != null && !MapsInitializer.isTileOverlayClosed()) {
            this.S.f();
         }

         this.B();
         if (this.aq != null) {
            this.aq.interrupt();
            this.aq = null;
         }

         if (this.ar != null) {
            this.ar.interrupt();
            this.ar = null;
         }

         if (this.aB != null) {
            this.aB.a();
            this.aB = null;
         }

         if (this.aC != null) {
            this.aC.a((ea$a)null);
            this.aC.a();
            this.aC = null;
         }

         es.b();
         if (this.g != null) {
            this.g.setMapListener((IAMapListener)null);
            this.g.releaseNetworkState();
            this.queueEvent(new c$29(this));
            int var1 = 0;
            byte var2 = 20;

            while(this.g != null && var1++ < var2) {
               try {
                  Thread.sleep(50L);
               } catch (InterruptedException var5) {
                  ;
               }
            }
         }

         if (this.X != null) {
            this.X.c();
         }

         if (this.K != null) {
            this.K.b();
         }

         if (this.Q != null) {
            try {
               this.Q.b();
            } catch (Exception var4) {
               var4.printStackTrace();
            }
         }

         if (this.R != null) {
            this.R.k();
            this.R = null;
         }

         if (this.ac != null) {
            this.ac.b();
            this.ac = null;
         }

         this.ad = null;
         this.H();
         this.ap = null;
         ht.b();
      } catch (Throwable var6) {
         ht.c(var6, "AMapDelegateImp", "destroy");
         var6.printStackTrace();
      }

   }

   private void H() {
      this.F = null;
      this.u = null;
      this.v = null;
      this.w = null;
      this.x = null;
      this.y = null;
      this.z = null;
      this.A = null;
      this.B = null;
      this.C = null;
      this.D = null;
      this.E = null;
      this.G = null;
      this.H = null;
      this.I = null;
   }

   public void beforeDrawLabel(int var1, GLMapState var2) {
      this.p();
      if (this.g != null) {
         this.g.pushRendererState();
      }

      this.T.a(true, this.av);
      if (this.g != null) {
         this.g.popRendererState();
      }

   }

   public void afterDrawLabel(int var1, GLMapState var2) {
      this.p();
      if (this.g != null) {
         this.g.pushRendererState();
      }

      if (this.S != null && !MapsInitializer.isTileOverlayClosed()) {
         this.S.b();
      }

      this.T.a(false, this.av);
      if (this.aZ != null) {
         this.aZ.a(this.c, this.getViewMatrix(), this.getProjectionMatrix());
      }

      if (this.X != null) {
         this.X.a();
      }

      if (this.b != null) {
         this.b.a(false);
      }

      if (this.L != null) {
         this.L.b(this.getMapWidth(), this.getMapHeight());
      }

      if (this.g != null) {
         this.g.popRendererState();
      }

   }

   public void afterRendererOver(int var1, GLMapState var2) {
      if (this.g != null) {
         this.g.pushRendererState();
      }

      if (this.b != null) {
         this.b.a(true);
      }

      if (this.g != null) {
         this.g.popRendererState();
      }

   }

   public void afterDrawFrame(int var1, GLMapState var2) {
      float var3 = var2.getMapZoomer();
      boolean var4 = this.g != null && (this.g.isInMapAction(var1) || this.g.isInMapAnimation(var1));
      if (!var4) {
         if (this.az != -1) {
            this.aE.setRenderFps((float)this.az);
         } else {
            this.aE.setRenderFps(15.0F);
         }

         if (this.aN == 1) {
            this.aN = 0;
         }

         if (this.aH != var3) {
            this.aH = var3;
         }
      }

      if (!this.aR) {
         this.aR = true;
      }

   }

   public void afterAnimation() {
      this.j();
   }

   public long createGLOverlay(int var1) {
      long var2 = 0L;
      if (this.g != null) {
         var2 = this.g.createOverlay(1, var1);
      }

      return var2;
   }

   public long getGlOverlayMgrPtr() {
      long var1 = 0L;
      if (this.g != null) {
         var1 = this.g.getGlOverlayMgrPtr(1);
      }

      return var1;
   }

   public CrossOverlay addCrossVector(CrossOverlayOptions var1) {
      if (var1 != null && var1.getRes() != null) {
         CrossVectorOverlay var2 = new CrossVectorOverlay(1, this.v(), this);
         if (var1 != null) {
            var2.setAttribute(var1.getAttribute());
         }

         if (this.g != null) {
            this.g.getOverlayBundle(1).addOverlay(var2);
            var2.resumeMarker(var1.getRes());
         }

         return new CrossOverlay(var1, var2);
      } else {
         return null;
      }
   }

   public RouteOverlay addNaviRouteOverlay() {
      return null;
   }

   public void addOverlayTexture(int var1, GLTextureProperty var2) {
      if (this.g != null) {
         GLOverlayBundle var3 = this.g.getOverlayBundle(var1);
         if (null == var3) {
            return;
         }

         if (var2 == null || var2.mBitmap == null) {
            return;
         }

         this.g.addOverlayTexture(var1, var2);
         var3.addOverlayTextureItem(var2.mId, var2.mAnchor, var2.mXRatio, var2.mYRatio, var2.mBitmap.getWidth(), var2.mBitmap.getHeight());
      }

   }

   public void setCustomMapStylePath(String var1) {
      if (!TextUtils.isEmpty(var1) && !var1.equals(this.c.getCustomStylePath())) {
         this.c.setCustomStylePath(var1);
         this.P = true;
      }

   }

   public void setCustomMapStyleID(String var1) {
      if (!TextUtils.isEmpty(var1) && !var1.equals(this.c.getCustomStyleID())) {
         this.c.setCustomStyleID(var1);
         this.P = true;
      }

   }

   public void setCustomTextureResourcePath(String var1) {
      if (!TextUtils.isEmpty(var1)) {
         this.c.setCustomTextureResourcePath(var1);
      }

   }

   public void setCustomMapStyle(CustomMapStyleOptions var1) {
      if (var1 != null) {
         if (var1.isEnable()) {
            this.F();
         }

         this.ba.c();
         this.ba.a(var1);
      }

      this.resetRenderTime();
   }

   public MyLocationStyle getMyLocationStyle() throws RemoteException {
      return this.ac != null ? this.ac.a() : null;
   }

   public void w() {
      if (this.ba != null) {
         this.ba.b();
      }

   }

   public void a(boolean var1, boolean var2) {
      if (this.aO && !this.W) {
         boolean var3 = false;
         if (var2) {
            var3 = var2;
         }

         if (TextUtils.isEmpty(this.c.getCustomStylePath()) && TextUtils.isEmpty(this.c.getCustomStyleID())) {
            return;
         }

         try {
            if (var1 && this.c.isProFunctionAuthEnable() && !TextUtils.isEmpty(this.c.getCustomStyleID()) && this.aB != null) {
               this.aB.a(this.c.getCustomStyleID());
               this.aB.b();
            }

            if (var2 || this.P || this.c.isCustomStyleEnable() ^ var1) {
               this.a(var1, (byte[])null, var3);
            }

            this.P = false;
         } catch (Throwable var5) {
            var5.printStackTrace();
         }
      } else {
         this.be.b = true;
         this.be.c = var1;
      }

   }

   public void setMapCustomEnable(boolean var1) {
      if (var1) {
         this.F();
      }

      this.a(var1, false);
   }

   public void a(boolean var1, byte[] var2) {
      this.a(var1, var2, false);
   }

   public void a(boolean var1, byte[] var2, boolean var3) {
      this.c.setCustomStyleEnable(var1);
      if (this.c.isHideLogoEnable()) {
         this.O.setLogoEnable(!var1);
      }

      if (var1) {
         this.c(1, true);
         ef var4 = new ef(this.f);
         if (this.ap != null && this.ap.getTrafficRoadBackgroundColor() != -1) {
            var4.a(this.ap.getTrafficRoadBackgroundColor());
         }

         boolean var5 = false;
         if (this.c.isProFunctionAuthEnable() && !TextUtils.isEmpty(this.c.getCustomTextureResourcePath())) {
            var5 = true;
         }

         eg var6 = null;
         StyleItem[] var7 = null;
         if (var2 != null) {
            var6 = var4.a(var2, var5);
            if (var6 != null) {
               var7 = var6.c();
               if (var7 != null) {
                  this.c.setUseProFunction(true);
               }
            }
         }

         if (var7 == null) {
            var6 = var4.a(this.c.getCustomStylePath(), var5);
            if (var6 != null) {
               var7 = var6.c();
            }
         }

         if (var4.a() != 0) {
            this.c.setCustomBackgroundColor(var4.a());
         }

         if (var6 != null && var6.d() != null) {
            if (this.aC != null) {
               String var8 = (String)var6.d();
               this.aC.a(var8);
               this.aC.a(var6);
               this.aC.b();
            }
         } else {
            this.a(var7, var3);
         }
      } else {
         this.c(1, false);
         this.a(1, this.c.getMapStyleMode(), this.c.getMapStyleTime(), this.c.getMapStyleState(), true, false, (StyleItem[])null);
      }

   }

   public void a(String var1, eg var2) {
      this.setCustomTextureResourcePath(var1);
      if (this.c.isCustomStyleEnable() && var2 != null) {
         StyleItem[] var3 = var2.c();
         this.a(var3, false);
      }

   }

   protected void a(StyleItem[] var1, boolean var2) {
      boolean var3 = var2 || var1 != null && var1.length > 0;
      if (var3) {
         this.a(1, 0, 0, 0, true, true, var1);
         fg.a(this.f, true);
      } else {
         fg.a(this.f, false);
      }

   }

   public void removeEngineGLOverlay(BaseMapOverlay var1) {
      if (this.g != null) {
         this.g.getOverlayBundle(1).removeOverlay(var1);
      }

   }

   public float[] x() {
      return this.c != null ? this.c.getMvpMatrix() : this.n;
   }

   public String d(String var1) {
      return this.T != null ? this.T.a(var1) : null;
   }

   public void h(boolean var1) {
      if (!this.W) {
         this.R.f(var1);
      }

   }

   public float[] getViewMatrix() {
      return this.c != null ? this.c.getViewMatrix() : this.o;
   }

   public float[] getProjectionMatrix() {
      return this.c != null ? this.c.getProjectionMatrix() : this.p;
   }

   public void changeSurface(GL10 var1, int var2, int var3) {
      try {
         this.a(1, (GL10)var1, var2, var3);
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   public void createSurface(GL10 var1, EGLConfig var2) {
      try {
         this.a(1, var1, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public void renderSurface(GL10 var1) {
      this.drawFrame(var1);
   }

   public boolean canStopMapRender() {
      if (this.g != null) {
         this.g.canStopMapRender(1);
      }

      return true;
   }

   public void getLatLngRect(DPoint[] var1) {
      try {
         Rectangle var2 = this.c.getGeoRectangle();
         if (var2 != null) {
            IPoint[] var3 = var2.getClipRect();
            byte var4 = 4;

            for(int var5 = 0; var5 < var4; ++var5) {
               GLMapState.geo2LonLat(var3[var5].x, var3[var5].y, var1[var5]);
            }
         }
      } catch (Throwable var6) {
         ;
      }

   }

   public void checkMapState(GLMapState var1) {
      if (this.c != null && !this.W) {
         LatLngBounds var2 = this.c.getLimitLatLngBounds();

         try {
            float var13;
            float var14;
            if (var2 != null) {
               IPoint[] var3 = this.c.getLimitIPoints();
               if (var3 == null) {
                  IPoint var4 = IPoint.obtain();
                  GLMapState.lonlat2Geo(var2.northeast.longitude, var2.northeast.latitude, var4);
                  IPoint var5 = IPoint.obtain();
                  GLMapState.lonlat2Geo(var2.southwest.longitude, var2.southwest.latitude, var5);
                  var3 = new IPoint[]{var4, var5};
                  this.c.setLimitIPoints(var3);
               }

               var13 = fi.b(this.c, var3[0].x, var3[0].y, var3[1].x, var3[1].y, this.getMapWidth(), this.getMapHeight());
               var14 = var1.getMapZoomer();
               if (this.c.isSetLimitZoomLevel()) {
                  float var6 = this.c.getMaxZoomLevel();
                  float var7 = this.c.getMinZoomLevel();
                  var14 = Math.max(var13, Math.min(var14, var6));
                  if (var13 > var6) {
                     var14 = var6;
                  }

                  if (var14 < var7) {
                     var14 = var7;
                  }
               } else if (var13 > 0.0F && var14 < var13) {
                  var14 = var13;
               }

               var1.setMapZoomer(var14);
               IPoint var15 = IPoint.obtain();
               var1.getMapGeoCenter(var15);
               int var16 = var15.x;
               int var8 = var15.y;
               int[] var9 = fi.a(var3[0].x, var3[0].y, var3[1].x, var3[1].y, this.c, var1, var16, var8);
               byte var10 = 2;
               if (var9 != null && var9.length == var10) {
                  var16 = var9[0];
                  var8 = var9[1];
               }

               var1.setMapGeoCenter(var16, var8);
               var15.recycle();
            } else if (this.c.isSetLimitZoomLevel()) {
               float var12 = var1.getMapZoomer();
               var13 = this.c.getMaxZoomLevel();
               var14 = this.c.getMinZoomLevel();
               var12 = Math.max(var14, Math.min(var12, var13));
               var1.setMapZoomer(var12);
            }
         } catch (Throwable var11) {
            ;
         }

      }
   }

   public void setRenderMode(int var1) {
      if (this.Q != null) {
         this.Q.setRenderMode(var1);
      }

   }

   public dv u(int var1) {
      return this.aX == null ? null : this.aX.a(var1);
   }

   public dw y() {
      return this.aX;
   }

   public void b(int var1, int var2) {
      if (this.c != null) {
         this.h = var1;
         this.i = var2;
         this.c.setMapWidth(var1);
         this.c.setMapHeight(var2);
      }

   }

   public void i(boolean var1) {
      if (this.c != null) {
         this.c.setHideLogoEnble(var1);
         if (this.c.isCustomStyleEnable()) {
            this.O.setLogoEnable(!var1);
         }
      }

   }

   public void a(String var1, boolean var2, int var3) {
      if (this.R != null) {
         this.R.a(var1, var2, var3);
      }

      if (this.O != null) {
         this.O.requestRefreshLogo();
      }

   }

   public void z() {
      if (this.R != null) {
         this.R.e();
      }

   }

   public float v(int var1) {
      GLMapState var2 = new GLMapState(1, this.g.getNativeInstance());
      var2.setMapZoomer((float)var1);
      var2.recalculate();
      float var3 = var2.getGLUnitWithWin(1);
      var2.recycle();
      return var3;
   }
}
