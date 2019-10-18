package com.autonavi.ae.gmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import com.amap.api.mapcore.util.fh;
import com.amap.api.mapcore.util.fi;
import com.amap.api.mapcore.util.ht;
import com.amap.api.mapcore.util.u;
import com.amap.api.maps.AMap$CancelableCallback;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.ae.gmap.glanimation.AdglMapAnimFling;
import com.autonavi.ae.gmap.glanimation.AdglMapAnimGroup;
import com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr;
import com.autonavi.ae.gmap.gloverlay.BaseMapOverlay;
import com.autonavi.ae.gmap.gloverlay.GLOverlayBundle;
import com.autonavi.ae.gmap.gloverlay.GLTextureProperty;
import com.autonavi.ae.gmap.style.StyleItem;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.FileUtil;
import com.autonavi.amap.mapcore.IAMapEngineCallback;
import com.autonavi.amap.mapcore.interfaces.IAMapListener;
import com.autonavi.amap.mapcore.maploader.AMapLoader;
import com.autonavi.amap.mapcore.maploader.AMapLoader$ADataRequestParam;
import com.autonavi.amap.mapcore.maploader.NetworkState;
import com.autonavi.amap.mapcore.maploader.NetworkState$NetworkChangeListener;
import com.autonavi.amap.mapcore.message.AbstractGestureMapMessage;
import com.autonavi.amap.mapcore.message.HoverGestureMapMessage;
import com.autonavi.amap.mapcore.message.MoveGestureMapMessage;
import com.autonavi.amap.mapcore.message.RotateGestureMapMessage;
import com.autonavi.amap.mapcore.message.ScaleGestureMapMessage;
import com.autonavi.amap.mapcore.tools.GLConvertUtil;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.autonavi.amap.mapcore.tools.TextTextureGenerator;
import java.io.File;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GLMapEngine implements IAMapEngineCallback, NetworkState$NetworkChangeListener {
   private Context context;
   private long mNativeMapengineInstance = 0L;
   private TextTextureGenerator mTextTextureGenerator;
   private String userAgent;
   private IAMapListener mMapListener;
   private u mGlMapView = null;
   private List<AbstractCameraUpdateMessage> mStateMessageList = new Vector();
   private List<AbstractGestureMapMessage> mGestureMessageList = new Vector();
   private List<AbstractGestureMapMessage> mGestureEndMessageList = new Vector();
   private List<AbstractCameraUpdateMessage> mAnimateStateMessageList = new Vector();
   boolean isMoveCameraStep = false;
   boolean isGestureStep = false;
   private int mapGestureCount = 0;
   private AdglMapAnimationMgr mapAnimationMgr = null;
   private GLMapState copyGLMapState = null;
   private Lock mLock = new ReentrantLock();
   private Object mutLock = new Object();
   private NetworkState mNetworkState = null;
   GLOverlayBundle<BaseMapOverlay<?, ?>> bundle = null;
   private boolean isEngineRenderComplete = false;
   Hashtable<Long, AMapLoader> aMapLoaderHashtable = new Hashtable();
   boolean mRequestDestroy = false;
   private AtomicInteger mRequestID = new AtomicInteger(1);
   GLMapState state;

   public byte[] requireMapResource(int var1, String var2) {
      if (var2 == null) {
         return null;
      } else {
         byte[] var3 = null;
         String var4 = "map_assets/" + var2;

         try {
            String var5 = "icons_5";
            String var6 = "bktile";
            if (this.mGlMapView.getMapConfig().isCustomStyleEnable()) {
               if (var2.startsWith(var5)) {
                  var3 = FileUtil.readFileContents(this.mGlMapView.getMapConfig().getCustomTextureResourcePath());
               } else if (var2.startsWith(var6)) {
                  var3 = FileUtil.readFileContentsFromAssets(this.context, var4);
                  int var7 = this.mGlMapView.getMapConfig().getCustomBackgroundColor();
                  if (var7 != 0) {
                     var3 = fi.a(var3, var7);
                  }
               }

               if (var3 != null) {
                  return var3;
               }
            }

            var3 = FileUtil.readFileContentsFromAssets(this.context, var4);
            return var3;
         } catch (Throwable var8) {
            return null;
         }
      }
   }

   public void reloadMapResource(int var1, String var2, int var3) {
   }

   public int generateRequestId() {
      return this.mRequestID.incrementAndGet();
   }

   public int requireMapDataAsyn(int var1, byte[] var2) {
      if (this.mRequestDestroy) {
         return 0;
      } else {
         AMapLoader$ADataRequestParam var3 = null;
         if (null != var2) {
            var3 = new AMapLoader$ADataRequestParam();
            byte var4 = 0;
            boolean var5 = false;
            int var15 = GLConvertUtil.getInt(var2, var4);
            int var14 = var4 + 4;
            var3.requestBaseUrl = GLConvertUtil.getString(var2, var14, var15);
            var14 += var15;
            var15 = GLConvertUtil.getInt(var2, var14);
            var14 += 4;
            var3.requestUrl = GLConvertUtil.getString(var2, var14, var15);
            var14 += var15;
            var3.handler = GLConvertUtil.getLong(var2, var14);
            var14 += 8;
            var3.nRequestType = GLConvertUtil.getInt(var2, var14);
            var14 += 4;
            var15 = GLConvertUtil.getInt(var2, var14);
            var14 += 4;
            var3.enCodeString = GLConvertUtil.getSubBytes(var2, var14, var15);
            var14 += var15;
            var3.nCompress = GLConvertUtil.getInt(var2, var14);
            AMapLoader$ADataRequestParam var6 = var3;
            AMapLoader var7 = new AMapLoader(var1, this, var3);
            synchronized(this) {
               this.aMapLoaderHashtable.put(var6.handler, var7);
            }

            var7.isFinish = false;

            try {
               fh.a().a(new GLMapEngine$1(this, var7));
               synchronized(var7) {
                  while(!var7.isFinish) {
                     var7.wait();
                  }
               }
            } catch (Throwable var13) {
               ht.c(var13, "download Thread", "requireMapData");
            }
         }

         return 0;
      }
   }

   public void requireMapData(int var1, byte[] var2) {
   }

   public void cancelRequireMapData(Object var1) {
      if (var1 != null && var1 instanceof AMapLoader) {
         ((AMapLoader)var1).doCancel();
      }

   }

   public byte[] requireCharBitmap(int var1, int var2, int var3) {
      byte[] var4 = this.mTextTextureGenerator.getTextPixelBuffer(var2, var3);
      return var4;
   }

   public byte[] requireCharsWidths(int var1, int[] var2, int var3, int var4) {
      return this.mTextTextureGenerator.getCharsWidths(var2);
   }

   public void requireMapRender(int var1, int var2, int var3) {
   }

   public void onMapRender(int var1, int var2) {
      try {
         switch(var2) {
         case 5:
            if (this.mMapListener != null) {
               this.mMapListener.beforeDrawLabel(var1, this.getMapState(var1));
            }
            break;
         case 6:
            if (this.mMapListener != null) {
               this.mMapListener.afterDrawLabel(var1, this.getMapState(var1));
            }
            break;
         case 7:
            if (this.mMapListener != null) {
               this.mMapListener.afterRendererOver(var1, this.getMapState(var1));
            }
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         default:
            break;
         case 13:
            this.isEngineRenderComplete = true;
         }
      } catch (Throwable var4) {
         ;
      }

   }

   public void OnIndoorBuildingActivity(int var1, byte[] var2) {
      if (this.mGlMapView != null) {
         try {
            this.mGlMapView.onIndoorBuildingActivity(var1, var2);
         } catch (Throwable var4) {
            var4.printStackTrace();
         }
      }

   }

   public synchronized void receiveNetData(int var1, long var2, byte[] var4, int var5) {
      if (!this.mRequestDestroy) {
         if (this.mNativeMapengineInstance != 0L) {
            nativeReceiveNetData(var1, this.mNativeMapengineInstance, var4, var2, var5);
         }

      }
   }

   public boolean getMapDataTaskIsCancel(int var1, long var2) {
      return !this.aMapLoaderHashtable.containsKey(var2);
   }

   public synchronized void finishDownLoad(int var1, long var2) {
      if (this.aMapLoaderHashtable.containsKey(var2)) {
         if (this.mNativeMapengineInstance != 0L) {
            nativeFinishDownLoad(var1, this.mNativeMapengineInstance, var2);
         }

         this.aMapLoaderHashtable.remove(var2);
      }
   }

   public synchronized void netError(int var1, long var2, int var4) {
      if (this.aMapLoaderHashtable.containsKey(var2)) {
         if (this.mNativeMapengineInstance != 0L) {
            nativeFinishDownLoad(var1, this.mNativeMapengineInstance, var2);
         }

         this.aMapLoaderHashtable.remove(var2);
      }
   }

   public void setMapLoaderToTask(int var1, long var2, AMapLoader var4) {
   }

   public Context getContext() {
      return this.context;
   }

   public String getUserAgent() {
      return this.userAgent;
   }

   public void setParamater(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.mLock.lock();

      try {
         if (this.mNativeMapengineInstance != 0L) {
            nativeSetParameter(var1, this.mNativeMapengineInstance, var2, var3, var4, var5, var6);
         }
      } finally {
         this.mLock.unlock();
      }

   }

   public void onClearCache(int var1) {
   }

   public boolean isInMapAction(int var1) {
      return false;
   }

   public long getNativeInstance() {
      return this.mNativeMapengineInstance;
   }

   public boolean canStopMapRender(int var1) {
      return this.isEngineRenderComplete;
   }

   public int getEngineIDWithType(int var1) {
      return 1;
   }

   public boolean isEngineCreated(int var1) {
      return this.mNativeMapengineInstance != 0L ? nativeIsEngineCreated(this.mNativeMapengineInstance, var1) : false;
   }

   public long getMapStateInstance(int var1) {
      return 0L;
   }

   public int getEngineIDWithGestureInfo(EAMapPlatformGestureInfo var1) {
      if (this.mNativeMapengineInstance != 0L) {
         ;
      }

      return 1;
   }

   public void setServiceViewRect(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      nativeSetServiceViewRect(var1, this.mNativeMapengineInstance, var2, var3, var4, var5, var6, var7);
   }

   public void setSrvViewStateBoolValue(int var1, int var2, boolean var3) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetSrvViewStateBoolValue(var1, this.mNativeMapengineInstance, var2, var3);
      }

   }

   public boolean getSrvViewStateBoolValue(int var1, int var2) {
      return this.mNativeMapengineInstance != 0L ? nativeGetSrvViewStateBoolValue(var1, this.mNativeMapengineInstance, var2) : false;
   }

   public boolean getIsProcessBuildingMark(int var1) {
      return false;
   }

   public void setIndoorBuildingToBeActive(int var1, String var2, int var3, String var4) {
      if (!TextUtils.isEmpty(var2) && !TextUtils.isEmpty(var4)) {
         if (this.mNativeMapengineInstance != 0L) {
            nativeSetIndoorBuildingToBeActive(var1, this.mNativeMapengineInstance, var2, var3, var4);
         }

      }
   }

   public void setMapListener(IAMapListener var1) {
      this.mMapListener = var1;
   }

   public void setInternaltexture(int var1, byte[] var2, int var3) {
   }

   public GLMapState getMapState(int var1) {
      this.mLock.lock();

      try {
         if (this.mNativeMapengineInstance != 0L && this.state == null) {
            long var2 = nativeGetCurrentMapState(var1, this.mNativeMapengineInstance);
            if (var2 != 0L) {
               this.state = new GLMapState(this.mNativeMapengineInstance, var2);
            }
         }
      } finally {
         this.mLock.unlock();
      }

      return this.state;
   }

   public GLMapState getNewMapState(int var1) {
      this.mLock.lock();

      GLMapState var2;
      try {
         if (this.mNativeMapengineInstance == 0L) {
            return null;
         }

         var2 = new GLMapState(var1, this.mNativeMapengineInstance);
      } finally {
         this.mLock.unlock();
      }

      return var2;
   }

   public synchronized GLMapState getCloneMapState() {
      this.mLock.lock();

      try {
         if (this.mNativeMapengineInstance != 0L) {
            if (this.copyGLMapState == null) {
               this.copyGLMapState = new GLMapState(1, this.mNativeMapengineInstance);
            }

            this.copyGLMapState.setMapZoomer(this.mGlMapView.getMapConfig().getSZ());
            this.copyGLMapState.setCameraDegree(this.mGlMapView.getMapConfig().getSC());
            this.copyGLMapState.setMapAngle(this.mGlMapView.getMapConfig().getSR());
            this.copyGLMapState.setMapGeoCenter(this.mGlMapView.getMapConfig().getSX(), this.mGlMapView.getMapConfig().getSY());
         }
      } finally {
         this.mLock.unlock();
      }

      return this.copyGLMapState;
   }

   public void setMapState(int var1, GLMapState var2) {
      this.setMapState(var1, var2, true);
   }

   public void setMapState(int var1, GLMapState var2, boolean var3) {
      if (this.mNativeMapengineInstance != 0L) {
         if (var3 && this.mGlMapView != null && this.mGlMapView.getMapConfig() != null) {
            this.mGlMapView.checkMapState(var2);
         }

         this.mLock.lock();

         try {
            var2.setNativeMapengineState(var1, this.mNativeMapengineInstance);
         } finally {
            this.mLock.unlock();
         }
      }

   }

   private void initAnimation() {
      if (this.mStateMessageList.size() <= 0) {
         if (this.mAnimateStateMessageList.size() > 0) {
            AbstractCameraUpdateMessage var1 = (AbstractCameraUpdateMessage)this.mAnimateStateMessageList.remove(0);
            if (var1 != null) {
               var1.generateMapAnimation(this);
            }
         }

      }
   }

   public synchronized void addGestureMessage(int var1, AbstractGestureMapMessage var2, boolean var3, int var4, int var5) {
      if (var2 != null) {
         var2.isGestureScaleByMapCenter = var3;
         this.mGestureMessageList.add(var2);
      }
   }

   private boolean processMessage() {
      try {
         GLMapState var1 = this.getNewMapState(1);
         boolean var2 = this.processGestureMessage(var1);
         if (this.mGestureMessageList.size() <= 0) {
            var2 = var2 || this.processStateMapMessage(var1);
         } else if (this.mStateMessageList.size() > 0) {
            this.mStateMessageList.clear();
         }

         var2 = var2 || this.processAnimations(var1);
         if (var2) {
            this.setMapState(1, var1);
         }

         var1.recycle();
         return var2;
      } catch (Exception var3) {
         var3.printStackTrace();
         return false;
      }
   }

   private boolean processGestureMessage(GLMapState var1) {
      if (this.mGestureMessageList.size() <= 0) {
         if (this.isGestureStep) {
            this.isGestureStep = false;
         }

         return false;
      } else {
         this.isGestureStep = true;
         if (var1 == null) {
            return false;
         } else {
            for(AbstractGestureMapMessage var2 = null; this.mGestureMessageList.size() > 0 && (var2 = (AbstractGestureMapMessage)this.mGestureMessageList.remove(0)) != null; this.mGestureEndMessageList.add(var2)) {
               if (var2.width == 0) {
                  var2.width = this.mGlMapView.getMapWidth();
               }

               if (var2.height == 0) {
                  var2.height = this.mGlMapView.getMapHeight();
               }

               int var3 = var2.getMapGestureState();
               if (var3 == 100) {
                  this.gestureBegin();
               } else if (var3 == 101) {
                  var2.runCameraUpdate(var1);
               } else if (var3 == 102) {
                  this.gestureEnd();
               }
            }

            if (this.mGestureEndMessageList.size() == 1) {
               this.recycleMessage();
            }

            return true;
         }
      }
   }

   private boolean processAnimations(GLMapState var1) {
      try {
         if (this.mapAnimationMgr.getAnimationsCount() > 0) {
            var1.recalculate();
            this.mapAnimationMgr.doAnimations(var1);
            return true;
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return false;
   }

   public void interruptAnimation() {
      if (this.isInMapAnimation(1)) {
         try {
            this.doMapAnimationCancelCallback(this.mapAnimationMgr.getCancelCallback());
            this.clearAnimations(1, false);
         } catch (Throwable var2) {
            ht.c(var2, this.getClass().getName(), "CancelableCallback.onCancel");
            var2.printStackTrace();
         }
      }

   }

   public void addGroupAnimation(int var1, int var2, float var3, int var4, int var5, int var6, int var7, AMap$CancelableCallback var8) {
      AdglMapAnimGroup var9 = new AdglMapAnimGroup(var2);
      var9.setToCameraDegree((float)var5, 0);
      var9.setToMapAngle((float)var4, 0);
      var9.setToMapLevel(var3, 0);
      var9.setToMapCenterGeo(var6, var7, 0);
      if (this.mapAnimationMgr != null && var9 != null && var9.isValid()) {
         this.mapAnimationMgr.addAnimation(var9, var8);
      }

   }

   private void doMapAnimationCancelCallback(AMap$CancelableCallback var1) {
      if (var1 != null) {
         if (this.mGlMapView != null) {
            this.mGlMapView.getMainHandler().post(new GLMapEngine$2(this, var1));
         }

      }
   }

   private void doMapAnimationFinishCallback(AMap$CancelableCallback var1) {
      if (this.mMapListener != null) {
         this.mMapListener.afterAnimation();
      }

      if (var1 != null) {
         if (this.mGlMapView != null) {
            this.mGlMapView.getMainHandler().post(new GLMapEngine$3(this, var1));
         }

      }
   }

   public boolean isInMapAnimation(int var1) {
      return this.getAnimateionsCount() > 0;
   }

   public int getAnimateionsCount() {
      return this.mNativeMapengineInstance != 0L ? this.mapAnimationMgr.getAnimationsCount() : 0;
   }

   public void clearAllMessages(int var1) {
   }

   public void clearAnimations(int var1, boolean var2) {
      this.mapAnimationMgr.clearAnimations();
   }

   public void clearAnimations(int var1, boolean var2, int var3) {
      this.mapAnimationMgr.clearAnimations();
   }

   public void startMapSlidAnim(int var1, Point var2, float var3, float var4) {
      if (var2 != null) {
         try {
            this.clearAnimations(var1, true);
            GLMapState var5 = this.getCloneMapState();
            var5.reset();
            var5.recalculate();
            short var6 = 12000;
            float var7 = var3;
            float var8 = var4;
            float var9 = Math.abs(var3);
            float var10 = Math.abs(var4);
            float var11 = var9 > var10 ? var9 : var10;
            if (var11 > (float)var6) {
               if (var9 > var10) {
                  var7 = var3 > 0.0F ? (float)var6 : (float)(-var6);
                  var8 = (float)var6 / var9 * var4;
               } else {
                  var7 = (float)var6 / var10 * var3;
                  var8 = var4 > 0.0F ? (float)var6 : (float)(-var6);
               }
            }

            int var12 = this.mGlMapView.getMapWidth() >> 1;
            int var13 = this.mGlMapView.getMapHeight() >> 1;
            if (this.mGlMapView.k()) {
               var12 = this.mGlMapView.getMapConfig().getAnchorX();
               var13 = this.mGlMapView.getMapConfig().getAnchorY();
            }

            AdglMapAnimFling var14 = new AdglMapAnimFling(500, var12, var13);
            var14.setPositionAndVelocity(var7, var8);
            var14.commitAnimation(var5);
            this.mapAnimationMgr.addAnimation(var14, (AMap$CancelableCallback)null);
         } catch (Throwable var15) {
            var15.printStackTrace();
         }

      }
   }

   public void startPivotZoomRotateAnim(int var1, Point var2, float var3, int var4, int var5) {
      if (var3 != -9999.0F || var4 != -9999) {
         if (var4 != -9999 && var4 < 0) {
            var4 += 360;
         }

      }
   }

   private void gestureBegin() {
      ++this.mapGestureCount;
   }

   private void gestureEnd() {
      --this.mapGestureCount;
      if (this.mapGestureCount == 0) {
         this.recycleMessage();
      }

   }

   public int getStateMessageCount() {
      return this.mStateMessageList.size();
   }

   public void addMessage(AbstractCameraUpdateMessage var1, boolean var2) {
      if (var2) {
         if (this.mAnimateStateMessageList != null) {
            this.mAnimateStateMessageList.clear();
            this.mAnimateStateMessageList.add(var1);
         }
      } else if (this.mStateMessageList != null) {
         this.mStateMessageList.add(var1);
      }

   }

   public synchronized AbstractCameraUpdateMessage getStateMessage() {
      if (this.mStateMessageList != null && this.mStateMessageList.size() != 0) {
         AbstractCameraUpdateMessage var1 = (AbstractCameraUpdateMessage)this.mStateMessageList.get(0);
         this.mStateMessageList.remove(var1);
         return var1;
      } else {
         return null;
      }
   }

   private void recycleMessage() {
      AbstractGestureMapMessage var1;
      for(; this.mGestureEndMessageList.size() > 0 && (var1 = (AbstractGestureMapMessage)this.mGestureEndMessageList.remove(0)) != null; var1 = null) {
         if (var1 instanceof MoveGestureMapMessage) {
            ((MoveGestureMapMessage)var1).recycle();
         } else if (var1 instanceof HoverGestureMapMessage) {
            ((HoverGestureMapMessage)var1).recycle();
         } else if (var1 instanceof RotateGestureMapMessage) {
            ((RotateGestureMapMessage)var1).recycle();
         } else if (var1 instanceof ScaleGestureMapMessage) {
            ((ScaleGestureMapMessage)var1).recycle();
         }
      }

   }

   private boolean processStateMapMessage(GLMapState var1) {
      if (this.mStateMessageList.size() <= 0) {
         if (this.isMoveCameraStep) {
            this.isMoveCameraStep = false;
         }

         return false;
      } else {
         this.isMoveCameraStep = true;
         if (var1 == null) {
            return false;
         } else {
            AbstractCameraUpdateMessage var2 = null;

            while(this.mStateMessageList.size() > 0 && (var2 = (AbstractCameraUpdateMessage)this.mStateMessageList.remove(0)) != null) {
               if (var2.width == 0) {
                  var2.width = this.mGlMapView.getMapWidth();
               }

               if (var2.height == 0) {
                  var2.height = this.mGlMapView.getMapHeight();
               }

               var1.recalculate();
               var2.runCameraUpdate(var1);
            }

            return true;
         }
      }
   }

   public void setMapOpenLayer(String var1) {
      if (this.mNativeMapengineInstance != 0L && var1 != null) {
         nativesetMapOpenLayer(1, this.mNativeMapengineInstance, var1.getBytes());
      }

   }

   public void pushRendererState() {
      if (this.mNativeMapengineInstance != 0L) {
         nativePushRendererState(1, this.mNativeMapengineInstance);
      }

   }

   public void popRendererState() {
      if (this.mNativeMapengineInstance != 0L) {
         nativePopRenderState(1, this.mNativeMapengineInstance);
      }

   }

   public int[] getMapModeState(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeGetMapModeState(var1, this.mNativeMapengineInstance, var2);
      }

      return null;
   }

   public boolean setNativeMapModeAndStyle(int var1, int var2, int var3, int var4, boolean var5, boolean var6, StyleItem[] var7) {
      if (this.mNativeMapengineInstance == 0L) {
         return false;
      } else {
         int[] var8 = new int[]{var2, var3, var4, 0, 0};
         return nativeSetMapModeAndStyle(var1, this.mNativeMapengineInstance, var8, var5, var6, var7);
      }
   }

   public boolean setMapModeAndStyle(int var1, int var2, int var3, int var4, boolean var5, boolean var6, StyleItem[] var7) {
      if (this.mNativeMapengineInstance == 0L) {
         return false;
      } else {
         boolean var8 = this.setNativeMapModeAndStyle(var1, var2, var3, var4, var5, var6, var7);
         if (var7 != null && var6) {
            int var12 = this.mGlMapView.getMapConfig().getCustomBackgroundColor();
            if (var12 != 0) {
               byte[] var10 = FileUtil.readFileContentsFromAssets(this.context, "map_assets" + File.separator + "bktile.data");
               var10 = fi.a(var10, var12);
               this.setBackgroundTexture(var1, var10);
            }

            String var13 = this.mGlMapView.getMapConfig().getCustomTextureResourcePath();
            if (this.mGlMapView.getMapConfig().isProFunctionAuthEnable() && !TextUtils.isEmpty(var13)) {
               this.mGlMapView.getMapConfig().setUseProFunction(true);
               byte[] var11 = FileUtil.readFileContents(var13);
               this.setCustomStyleTexture(var1, var11);
            }
         } else if (var2 == 0 && var3 == 0 && var4 == 0) {
            byte[] var9 = FileUtil.readFileContentsFromAssets(this.context, "map_assets" + File.separator + "bktile.data");
            this.setBackgroundTexture(var1, var9);
            var9 = FileUtil.readFileContentsFromAssets(this.context, "map_assets" + File.separator + "icons_5_14_1527583408.data");
            this.setCustomStyleTexture(var1, var9);
         }

         return var8;
      }
   }

   public void putResourceData(int var1, byte[] var2) {
   }

   public void networkStateChanged(Context var1) {
      if (!this.mRequestDestroy) {
         if (this.mNativeMapengineInstance != 0L) {
            boolean var2 = NetworkState.isNetworkConnected(var1);
            this.mGlMapView.queueEvent(new GLMapEngine$4(this, var2));
         }

      }
   }

   public byte[] getLabelBuffer(int var1, int var2, int var3, int var4) {
      this.mLock.lock();
      Object var5 = null;

      byte[] var9;
      try {
         var9 = new byte[3072];
         if (this.mNativeMapengineInstance != 0L) {
            nativeSelectMapPois(var1, this.mNativeMapengineInstance, var2, var3, var4, var9);
         }
      } finally {
         this.mLock.unlock();
      }

      return var9;
   }

   public long createOverlay(int var1, int var2) {
      return this.mNativeMapengineInstance != 0L ? nativeCreateOverlay(var1, this.mNativeMapengineInstance, var2) : 0L;
   }

   public String addNativeOverlay(int var1, int var2, int var3) {
      if (this.mNativeMapengineInstance != 0L) {
         String var4 = nativeAddNativeOverlay(var1, this.mNativeMapengineInstance, var2, var3);
         return TextUtils.isEmpty(var4) ? null : var4;
      } else {
         return null;
      }
   }

   public long getGlOverlayMgrPtr(int var1) {
      return this.mNativeMapengineInstance != 0L ? nativeGetGlOverlayMgrPtr(var1, this.mNativeMapengineInstance) : 0L;
   }

   public void setOvelayBundle(int var1, GLOverlayBundle<BaseMapOverlay<?, ?>> var2) {
      this.bundle = var2;
   }

   public void addOverlayTexture(int var1, GLTextureProperty var2) {
      if (this.mNativeMapengineInstance != 0L && null != var2 && null != var2.mBitmap && !var2.mBitmap.isRecycled()) {
         nativeAddOverlayTexture(var1, this.mNativeMapengineInstance, var2.mId, var2.mAnchor, var2.mXRatio, var2.mYRatio, var2.mBitmap, var2.isGenMimps, var2.isRepeat);
      }

   }

   public GLOverlayBundle getOverlayBundle(int var1) {
      return this.bundle;
   }

   public static void destroyOverlay(int var0, long var1) {
      Class var3 = GLMapEngine.class;
      synchronized(GLMapEngine.class) {
         nativeDestroyOverlay(var0, var1);
      }
   }

   public void setSimple3DEnable(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetSimple3DEnable(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void setRoadArrowEnable(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetRoadArrowEnable(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void setSkyTexture(int var1, byte[] var2) {
      if (var2 != null) {
         if (this.mNativeMapengineInstance != 0L) {
            nativeSetSkyTexture(var1, this.mNativeMapengineInstance, var2);
         }

      }
   }

   public void setBackgroundTexture(int var1, byte[] var2) {
      if (var2 != null) {
         if (this.mNativeMapengineInstance != 0L) {
            nativeSetSetBackgroundTexture(var1, this.mNativeMapengineInstance, var2);
         }

      }
   }

   public void setCustomStyleTexture(int var1, byte[] var2) {
      if (var2 != null) {
         if (this.mNativeMapengineInstance != 0L) {
            nativeSetCustomStyleTexture(var1, this.mNativeMapengineInstance, var2);
         }

      }
   }

   public void setCustomStyleData(int var1, byte[] var2, byte[] var3) {
      if (var2 != null) {
         if (this.mNativeMapengineInstance != 0L) {
            nativeSetCustomStyleData(var1, this.mNativeMapengineInstance, var2, var3);
         }

      }
   }

   public void setTrafficEnable(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetTrafficEnable(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void setBuildingEnable(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetBuildingEnable(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void setLabelEnable(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetLabelEnable(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void setAllContentEnable(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetAllContentEnable(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void setProjectionCenter(int var1, int var2, int var3) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetProjectionCenter(var1, this.mNativeMapengineInstance, (float)var2, (float)var3);
      }

   }

   public void setTrafficStyle(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.mNativeMapengineInstance != 0L) {
         byte[] var7 = FileUtil.readFileContentsFromAssets(this.context, "map_assets" + File.separator + "tmc_allinone.data");
         if (var6) {
            byte[] var8 = fi.a(var7, new int[]{var4, var5, var3, var2});
            nativeSetTrafficTextureAllInOne(var1, this.mNativeMapengineInstance, var8);
         } else {
            nativeSetTrafficTextureAllInOne(var1, this.mNativeMapengineInstance, var7);
         }
      }

   }

   public void setTrafficStyle(int var1, int var2, int var3, int var4, int var5) {
      this.setTrafficStyle(var1, var2, var3, var4, var5, true);
   }

   public void startCheckEngineRenderComplete() {
      this.isEngineRenderComplete = false;
   }

   public void getCurTileIDs(int var1, int[] var2) {
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = 0;
         }

         nativeGetCurTileIDs(var1, this.mNativeMapengineInstance, var2, var2.length);
      }

   }

   public void setIndoorEnable(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetIndoorEnable(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void setOfflineDataEnable(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetOfflineDataEnable(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void setHighlightSubwayEnable(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetHighlightSubwayEnable(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void setBuildingTextureEnable(int var1, boolean var2) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetBuildingTextureEnable(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void initNativeTexture(int var1) {
      try {
         BitmapDescriptor var2 = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_inner.png");
         Bitmap var3 = null;
         if (var2 != null) {
            var3 = var2.getBitmap();
         }

         BitmapDescriptor var4 = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_outer.png");
         Bitmap var5 = null;
         if (var4 != null) {
            var5 = var4.getBitmap();
         }

         BitmapDescriptor var6 = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_shadow.png");
         Bitmap var7 = null;
         if (var6 != null) {
            var7 = var6.getBitmap();
         }

         this.AddOverlayTexture(var1, var3, 111, 4);
         this.AddOverlayTexture(var1, var5, 222, 4);
         this.AddOverlayTexture(var1, var7, 333, 4);
      } catch (Throwable var8) {
         var8.printStackTrace();
      }

   }

   public void AddOverlayTexture(int var1, Bitmap var2, int var3, int var4) {
      GLTextureProperty var5 = new GLTextureProperty();
      var5.mId = var3;
      var5.mAnchor = var4;
      var5.mBitmap = var2;
      var5.mXRatio = 0.0F;
      var5.mYRatio = 0.0F;
      var5.isGenMimps = true;
      this.addOverlayTexture(var1, var5);
   }

   public void updateNativeArrowOverlay(int var1, String var2, int[] var3, int[] var4, int var5, int var6, int var7, float var8, int var9, int var10, int var11, boolean var12) {
      if (this.mNativeMapengineInstance != 0L && var2 != null) {
         nativeUpdateNativeArrowOverlay(var1, this.mNativeMapengineInstance, var2, var3, var4, var5, var6, var7, var8, var12, var9, var10, var11);
      }

   }

   public void removeNativeOverlay(int var1, String var2) {
      if (this.mNativeMapengineInstance != 0L && var2 != null) {
         nativeRemoveNativeOverlay(var1, this.mNativeMapengineInstance, var2);
      }

   }

   public void removeNativeAllOverlay(int var1) {
      if (this.mNativeMapengineInstance != 0L) {
         nativeRemoveNativeAllOverlay(var1, this.mNativeMapengineInstance);
      }

   }

   public GLMapEngine(Context var1, u var2) {
      this.mRequestDestroy = false;
      if (var1 != null) {
         this.context = var1.getApplicationContext();
         this.mGlMapView = var2;
         this.mTextTextureGenerator = new TextTextureGenerator();
         this.mapAnimationMgr = new AdglMapAnimationMgr();
         this.mapAnimationMgr.setMapAnimationListener(new GLMapEngine$5(this));
         this.userAgent = System.getProperty("http.agent") + " amap/" + GlMapUtil.getAppVersionName(var1);
      }
   }

   public void createAMapInstance(GLMapEngine$InitParam var1) {
      if (var1 != null) {
         Class var2 = GLMapEngine.class;
         synchronized(GLMapEngine.class) {
            nativeInitParam(var1.mRootPath, var1.mConfigContent, var1.mOfflineDataPath, var1.mP3dCrossPath);
            String var3 = "http://mpsapi.amap.com/";
            String var4 = "http://m5.amap.com/";
            this.mNativeMapengineInstance = nativeCreateAMapInstance("", var3, var4);
            nativeInitAMapEngineCallback(this.mNativeMapengineInstance, this);
            this.initNetworkState();
         }
      }
   }

   private void initNetworkState() {
      this.mNetworkState = new NetworkState();
      this.mNetworkState.setNetworkListener(this);
      this.mNetworkState.registerNetChangeReceiver(this.context.getApplicationContext(), true);
      boolean var1 = NetworkState.isNetworkConnected(this.context.getApplicationContext());
      if (this.mNativeMapengineInstance != 0L) {
         nativeSetNetStatus(this.mNativeMapengineInstance, var1 ? 1 : 0);
      }

   }

   public void createAMapEngineWithFrame(GLMapEngine$MapViewInitParam var1) {
      if (this.mNativeMapengineInstance != 0L) {
         Class var2 = GLMapEngine.class;
         synchronized(GLMapEngine.class) {
            nativeCreateAMapEngineWithFrame(this.mNativeMapengineInstance, var1.engineId, var1.x, var1.y, var1.width, var1.height, var1.screenWidth, var1.screenHeight, var1.screenScale, var1.textScale, var1.mapZoomScale);
         }
      }

   }

   public void changeSurface(int var1, int var2) {
   }

   public void renderAMap() {
      if (this.mNativeMapengineInstance != 0L) {
         boolean var1 = this.processMessage();
         Class var2 = GLMapEngine.class;
         synchronized(GLMapEngine.class) {
            nativeRenderAMap(this.mNativeMapengineInstance, 1);
            nativePostRenderAMap(this.mNativeMapengineInstance, 1);
         }

         this.initAnimation();
         if (var1) {
            this.startCheckEngineRenderComplete();
         }

         if (!this.isEngineRenderComplete) {
            nativeSetRenderListenerStatus(1, this.mNativeMapengineInstance);
         }
      }

   }

   public void releaseNetworkState() {
      if (this.mNetworkState != null) {
         this.mNetworkState.registerNetChangeReceiver(this.context.getApplicationContext(), false);
         this.mNetworkState.setNetworkListener((NetworkState$NetworkChangeListener)null);
         this.mNetworkState = null;
      }

   }

   public void cancelAllAMapDownload() {
      try {
         Hashtable var1 = this.aMapLoaderHashtable;
         synchronized(this.aMapLoaderHashtable) {
            Iterator var2 = this.aMapLoaderHashtable.entrySet().iterator();

            while(var2.hasNext()) {
               Entry var3 = (Entry)var2.next();
               AMapLoader var4 = (AMapLoader)var3.getValue();
               var4.doCancel();
               if (!var4.isFinish) {
                  synchronized(var4) {
                     if (!var4.isFinish) {
                        var4.notify();
                        var4.isFinish = true;
                     }
                  }
               }
            }

            this.aMapLoaderHashtable.clear();
         }
      } catch (Throwable var10) {
         var10.printStackTrace();
      }

   }

   public void destroyAMapEngine() {
      try {
         this.mRequestDestroy = true;
         this.cancelAllAMapDownload();
         Object var1 = this.mutLock;
         synchronized(this.mutLock) {
            if (this.mNativeMapengineInstance != 0L) {
               synchronized(this) {
                  if (this.copyGLMapState != null) {
                     this.copyGLMapState.recycle();
                  }
               }

               nativeDestroyCurrentState(this.mNativeMapengineInstance, this.state.getNativeInstance());
               nativeDestroy(this.mNativeMapengineInstance);
            }

            this.mNativeMapengineInstance = 0L;
         }

         this.mGlMapView = null;
         this.mStateMessageList.clear();
         this.mAnimateStateMessageList.clear();
         this.mGestureEndMessageList.clear();
         this.mGestureMessageList.clear();
         this.mMapListener = null;
         fh.b();
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

   }

   private static native void nativeInitParam(String var0, String var1, String var2, String var3);

   private static native void nativeInitAMapEngineCallback(long var0, Object var2);

   private static native long nativeCreateAMapInstance(String var0, String var1, String var2);

   private static native void nativeSetNetStatus(long var0, int var2);

   private static native void nativeCreateAMapEngineWithFrame(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11);

   private static native void nativeSetServiceViewRect(int var0, long var1, int var3, int var4, int var5, int var6, int var7, int var8);

   private static native void nativeRenderAMap(long var0, int var2);

   private static native void nativePostRenderAMap(long var0, int var2);

   private static native boolean nativeIsEngineCreated(long var0, int var2);

   private static native void nativeDestroy(long var0);

   private static native long nativeGetCurrentMapState(int var0, long var1);

   private static native void nativeDestroyCurrentState(long var0, long var2);

   private static native void nativeReceiveNetData(int var0, long var1, byte[] var3, long var4, int var6);

   private static native void nativeFinishDownLoad(int var0, long var1, long var3);

   private static native void nativesetMapOpenLayer(int var0, long var1, byte[] var3);

   private static native void nativePushRendererState(int var0, long var1);

   private static native void nativePopRenderState(int var0, long var1);

   private static native int[] nativeGetMapModeState(int var0, long var1, boolean var3);

   private static native boolean nativeSetMapModeAndStyle(int var0, long var1, int[] var3, boolean var4, boolean var5, StyleItem[] var6);

   private static native void nativeSetParameter(int var0, long var1, int var3, int var4, int var5, int var6, int var7);

   private static native boolean nativeGetSrvViewStateBoolValue(int var0, long var1, int var3);

   private static native void nativeSetSrvViewStateBoolValue(int var0, long var1, int var3, boolean var4);

   private static native void nativeSelectMapPois(int var0, long var1, int var3, int var4, int var5, byte[] var6);

   protected static native long nativeCreateOverlay(int var0, long var1, int var3);

   protected static native void nativeDestroyOverlay(int var0, long var1);

   protected static native String nativeAddNativeOverlay(int var0, long var1, int var3, int var4);

   protected static native void nativeUpdateNativeArrowOverlay(int var0, long var1, String var3, int[] var4, int[] var5, int var6, int var7, int var8, float var9, boolean var10, int var11, int var12, int var13);

   protected static native void nativeRemoveNativeOverlay(int var0, long var1, String var3);

   protected static native void nativeRemoveNativeAllOverlay(int var0, long var1);

   private static native long nativeGetGlOverlayMgrPtr(int var0, long var1);

   private static native boolean nativeAddOverlayTexture(int var0, long var1, int var3, int var4, float var5, float var6, Bitmap var7, boolean var8, boolean var9);

   private static native void nativeSetIndoorBuildingToBeActive(int var0, long var1, String var3, int var4, String var5);

   private static native void nativeSetSimple3DEnable(int var0, long var1, boolean var3);

   private static native void nativeSetRoadArrowEnable(int var0, long var1, boolean var3);

   private static native void nativeSetSkyTexture(int var0, long var1, byte[] var3);

   private static native void nativeSetSetBackgroundTexture(int var0, long var1, byte[] var3);

   private static native void nativeSetCustomStyleTexture(int var0, long var1, byte[] var3);

   private static native void nativeSetCustomStyleData(int var0, long var1, byte[] var3, byte[] var4);

   private static native void nativeSetTrafficTexture(int var0, long var1, byte[] var3, byte[] var4, byte[] var5, byte[] var6);

   private static native void nativeSetTrafficTextureAllInOne(int var0, long var1, byte[] var3);

   private static native void nativeSetTrafficEnable(int var0, long var1, boolean var3);

   private static native void nativeSetLabelEnable(int var0, long var1, boolean var3);

   private static native void nativeSetAllContentEnable(int var0, long var1, boolean var3);

   private static native void nativeSetProjectionCenter(int var0, long var1, float var3, float var4);

   private static native void nativeSetRenderListenerStatus(int var0, long var1);

   private static native void nativeSetBuildingEnable(int var0, long var1, boolean var3);

   private static native void nativeSetIndoorEnable(int var0, long var1, boolean var3);

   private static native void nativeSetOfflineDataEnable(int var0, long var1, boolean var3);

   private static native void nativeSetHighlightSubwayEnable(int var0, long var1, boolean var3);

   private static native void nativeSetBuildingTextureEnable(int var0, long var1, boolean var3);

   private static native void nativeGetCurTileIDs(int var0, long var1, int[] var3, int var4);

   public static native String nativeGetMapEngineVersion(int var0);
}
