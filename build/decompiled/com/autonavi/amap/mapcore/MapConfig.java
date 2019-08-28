package com.autonavi.amap.mapcore;

import android.opengl.Matrix;
import com.amap.api.maps.model.LatLngBounds;
import java.util.concurrent.atomic.AtomicInteger;

public class MapConfig implements Cloneable {
   public static final int MSG_AUTH_FAILURE = 2;
   public static final int MSG_CAMERAUPDATE_CHANGE = 10;
   public static final int MSG_CAMERAUPDATE_FINISH = 11;
   public static final int MSG_ZOOMVIEW_CHANGESTATE = 12;
   public static final int MSG_COMPASSVIEW_CHANGESTATE = 13;
   public static final int MSG_CALLBACK_ONTOUCHEVENT = 14;
   public static final int MSG_CALLBACK_SCREENSHOT = 15;
   public static final int MSG_CALLBACK_MAPLOADED = 16;
   public static final int MSG_TILEOVERLAY_REFRESH = 17;
   public static final int MSG_INFOWINDOW_UPDATE = 18;
   public static final int MSG_ACTION_ONMAPCLICK = 19;
   public static final int MSG_ACTION_ONBASEPOICLICK = 20;
   public static final float MAX_ZOOM = 20.0F;
   public static final float MAX_ZOOM_INDOOR = 20.0F;
   public static final float MIN_ZOOM = 3.0F;
   public float maxZoomLevel = 20.0F;
   public float minZoomLevel = 3.0F;
   private String mCustomStylePath;
   private String mCustomStyleID;
   private FPoint[] mapRect = null;
   private Rectangle geoRectangle = new Rectangle();
   private boolean isIndoorEnable = false;
   private boolean isBuildingEnable = true;
   private boolean isMapTextEnable = true;
   private boolean isTrafficEnabled = false;
   private boolean isCustomStyleEnabled = false;
   private int sX = 221010267;
   private int sY = 101697799;
   private IPoint mapGeoCenter;
   private float sZ;
   private float sC;
   private float sR;
   private int mapWidth;
   private int mapHeight;
   private static final int TILE_SIZE_POW = 8;
   private static final int GEO_POINT_ZOOM = 20;
   MapConfig lastMapconfig;
   private boolean isCenterChanged;
   private boolean isZoomChanged;
   private boolean isTiltChanged;
   private boolean isBearingChanged;
   private boolean isNeedUpdateZoomControllerState;
   private boolean isNeedUpdateMapRectNextFrame;
   private boolean isSetLimitZoomLevel;
   private IPoint[] limitIPoints;
   private LatLngBounds limitLatLngBounds;
   private int mMapStyleMode;
   private int mMapStyleTime;
   private int mMapStyleState;
   private int anchorX;
   private String mMapLanguage;
   private boolean isHideLogoEnable;
   private boolean isWorldMapEnable;
   float[] viewMatrix;
   float[] projectionMatrix;
   float[] mvpMatrix;
   int[] tilsIDs;
   private float skyHeight;
   private int anchorY;
   private float mapPerPixelUnitLength;
   private String customTextureResourcePath;
   private boolean isProFunctionAuthEnable;
   private boolean isUseProFunction;
   private int customBackgroundColor;
   private float mapZoomScale;
   private AtomicInteger changedCounter;
   private volatile double changeRatio;
   private volatile double changeGridRatio;
   public static final int DEFAULT_RATIO = 1;
   private int gridX;
   private int gridY;

   public int getAnchorY() {
      return this.anchorY;
   }

   public void setAnchorY(int var1) {
      this.anchorY = var1;
   }

   public int getAnchorX() {
      return this.anchorX;
   }

   public void setAnchorX(int var1) {
      this.anchorX = var1;
   }

   public MapConfig(boolean var1) {
      this.mapGeoCenter = new IPoint(this.sX, this.sY);
      this.sZ = 10.0F;
      this.sC = 0.0F;
      this.sR = 0.0F;
      this.lastMapconfig = null;
      this.isCenterChanged = false;
      this.isZoomChanged = false;
      this.isTiltChanged = false;
      this.isBearingChanged = false;
      this.isNeedUpdateZoomControllerState = false;
      this.isNeedUpdateMapRectNextFrame = false;
      this.mMapStyleMode = 0;
      this.mMapStyleTime = 0;
      this.mMapStyleState = 0;
      this.anchorX = 0;
      this.mMapLanguage = "zh_cn";
      this.isHideLogoEnable = true;
      this.isWorldMapEnable = false;
      this.viewMatrix = new float[16];
      this.projectionMatrix = new float[16];
      this.mvpMatrix = new float[16];
      this.tilsIDs = new int[100];
      this.anchorY = 0;
      this.isProFunctionAuthEnable = true;
      this.isUseProFunction = false;
      this.customBackgroundColor = -1;
      this.mapZoomScale = 1.0F;
      this.changedCounter = new AtomicInteger(0);
      this.changeRatio = 1.0D;
      this.changeGridRatio = 1.0D;
      this.gridX = 0;
      this.gridY = 0;
      if (var1) {
         this.lastMapconfig = new MapConfig(false);
         this.lastMapconfig.setGridXY(0, 0);
         this.lastMapconfig.setSX(0);
         this.lastMapconfig.setSY(0);
         this.lastMapconfig.setSZ(0.0F);
         this.lastMapconfig.setSC(0.0F);
         this.lastMapconfig.setSR(0.0F);
      }

   }

   public int getChangedCounter() {
      return this.changedCounter.get();
   }

   public void resetChangedCounter() {
      this.changedCounter.set(0);
   }

   public boolean isMapStateChange() {
      boolean var1 = false;
      if (this.lastMapconfig != null) {
         int var2 = this.lastMapconfig.getSX();
         int var3 = this.lastMapconfig.getSY();
         float var4 = this.lastMapconfig.getSZ();
         float var5 = this.lastMapconfig.getSC();
         float var6 = this.lastMapconfig.getSR();
         this.isCenterChanged = var2 != this.sX;
         this.isCenterChanged = var3 != this.sY ? true : this.isCenterChanged;
         this.isZoomChanged = var4 != this.sZ;
         if (this.isZoomChanged) {
            if (var4 > this.minZoomLevel && this.sZ > this.minZoomLevel && var4 < this.maxZoomLevel && this.sZ < this.maxZoomLevel) {
               this.isNeedUpdateZoomControllerState = false;
            } else {
               this.isNeedUpdateZoomControllerState = true;
            }
         }

         this.isTiltChanged = var5 != this.sC;
         this.isBearingChanged = var6 != this.sR;
         var1 = this.isCenterChanged || this.isZoomChanged || this.isTiltChanged || this.isBearingChanged || this.isNeedUpdateMapRectNextFrame;
         if (var1) {
            this.isNeedUpdateMapRectNextFrame = false;
            this.changedCounter.incrementAndGet();
            int var7 = (int)this.sZ;
            int var8 = this.sX >> 20 - var7 + 8;
            int var9 = this.sY >> 20 - var7 + 8;
            this.setGridXY(var8, var9);
            this.changeRatio();
         }
      }

      byte var10 = 45;
      return this.sC >= (float)var10 && this.skyHeight == 0.0F ? true : var1;
   }

   protected void setGridXY(int var1, int var2) {
      if (this.lastMapconfig != null) {
         this.lastMapconfig.setGridXY(this.gridX, this.gridY);
      }

      this.gridX = var1;
      this.gridY = var2;
   }

   protected int getGridX() {
      return this.gridX;
   }

   protected int getGridY() {
      return this.gridY;
   }

   public double getChangeRatio() {
      return this.changeRatio;
   }

   public double getChangeGridRatio() {
      return this.changeGridRatio;
   }

   private void changeRatio() {
      int var1 = this.lastMapconfig.getSX();
      int var2 = this.lastMapconfig.getSY();
      float var3 = this.lastMapconfig.getSZ();
      float var4 = this.lastMapconfig.getSC();
      float var5 = this.lastMapconfig.getSR();
      this.changeRatio = (double)(Math.abs(this.sX - var1) + Math.abs(this.sY - var2));
      this.changeRatio = this.changeRatio == 0.0D ? 1.0D : this.changeRatio * 2.0D;
      this.changeRatio *= var3 == this.sZ ? 1.0D : (double)Math.abs(var3 - this.sZ);
      float var6 = var4 == this.sC ? 1.0F : Math.abs(var4 - this.sC);
      float var7 = var5 == this.sR ? 1.0F : Math.abs(var5 - this.sR);
      this.changeRatio *= (double)var6;
      this.changeRatio *= (double)var7;
      this.changeGridRatio = (double)(Math.abs(this.lastMapconfig.getGridX() - this.gridX) + (this.lastMapconfig.getGridY() - this.gridY));
      this.changeGridRatio = this.changeGridRatio == 0.0D ? 1.0D : this.changeGridRatio * 2.0D;
      this.changeGridRatio *= (double)var6;
      this.changeGridRatio *= (double)var7;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(" sX: ");
      var1.append(this.sX);
      var1.append(" sY: ");
      var1.append(this.sY);
      var1.append(" sZ: ");
      var1.append(this.sZ);
      var1.append(" sC: ");
      var1.append(this.sC);
      var1.append(" sR: ");
      var1.append(this.sR);
      var1.append(" skyHeight: ");
      var1.append(this.skyHeight);
      return var1.toString();
   }

   public boolean isZoomChanged() {
      return this.isZoomChanged;
   }

   public boolean isTiltChanged() {
      return this.isTiltChanged;
   }

   public boolean isBearingChanged() {
      return this.isBearingChanged;
   }

   public boolean isIndoorEnable() {
      return this.isIndoorEnable;
   }

   public void setIndoorEnable(boolean var1) {
      this.isIndoorEnable = var1;
   }

   public boolean isBuildingEnable() {
      return this.isBuildingEnable;
   }

   public void setBuildingEnable(boolean var1) {
      this.isBuildingEnable = var1;
   }

   public boolean isMapTextEnable() {
      return this.isMapTextEnable;
   }

   public void setMapTextEnable(boolean var1) {
      this.isMapTextEnable = var1;
   }

   public boolean isTrafficEnabled() {
      return this.isTrafficEnabled;
   }

   public void setTrafficEnabled(boolean var1) {
      this.isTrafficEnabled = var1;
   }

   public boolean isNeedUpdateZoomControllerState() {
      return this.isNeedUpdateZoomControllerState;
   }

   public int getSX() {
      return this.sX;
   }

   public void setSX(int var1) {
      if (this.lastMapconfig != null) {
         this.lastMapconfig.setSX(this.sX);
      }

      this.sX = var1;
      this.mapGeoCenter.x = this.sX;
   }

   public int getSY() {
      return this.sY;
   }

   public void setSY(int var1) {
      if (this.lastMapconfig != null) {
         this.lastMapconfig.setSY(this.sY);
      }

      this.sY = var1;
      this.mapGeoCenter.x = this.sY;
   }

   public IPoint getMapGeoCenter() {
      return this.mapGeoCenter;
   }

   public float getSZ() {
      return this.sZ;
   }

   public void setSZ(float var1) {
      if (this.lastMapconfig != null) {
         this.lastMapconfig.setSZ(this.sZ);
      }

      this.sZ = var1;
   }

   public float getSC() {
      return this.sC;
   }

   public void setSC(float var1) {
      if (this.lastMapconfig != null) {
         this.lastMapconfig.setSC(this.sC);
      }

      this.sC = var1;
   }

   public float getSR() {
      return this.sR;
   }

   public void setSR(float var1) {
      if (this.lastMapconfig != null) {
         this.lastMapconfig.setSR(this.sR);
      }

      this.sR = var1;
   }

   public FPoint[] getMapRect() {
      return this.mapRect;
   }

   public void setMapRect(FPoint[] var1) {
      if (this.lastMapconfig != null) {
         this.lastMapconfig.setMapRect(var1);
      }

      this.mapRect = var1;
   }

   public Rectangle getGeoRectangle() {
      return this.geoRectangle;
   }

   public void setMaxZoomLevel(float var1) {
      if (var1 > 20.0F) {
         var1 = 20.0F;
      }

      if (var1 < 3.0F) {
         var1 = 3.0F;
      }

      if (var1 < this.getMinZoomLevel()) {
         var1 = this.getMinZoomLevel();
      }

      this.isSetLimitZoomLevel = true;
      this.maxZoomLevel = var1;
   }

   public void setMinZoomLevel(float var1) {
      if (var1 < 3.0F) {
         var1 = 3.0F;
      }

      if (var1 > 20.0F) {
         var1 = 20.0F;
      }

      if (var1 > this.getMaxZoomLevel()) {
         var1 = this.getMaxZoomLevel();
      }

      this.isSetLimitZoomLevel = true;
      this.minZoomLevel = var1;
   }

   public float getMaxZoomLevel() {
      return this.maxZoomLevel;
   }

   public float getMinZoomLevel() {
      return this.minZoomLevel;
   }

   public IPoint[] getLimitIPoints() {
      return this.limitIPoints;
   }

   public void setLimitIPoints(IPoint[] var1) {
      this.limitIPoints = var1;
   }

   public boolean isSetLimitZoomLevel() {
      return this.isSetLimitZoomLevel;
   }

   public LatLngBounds getLimitLatLngBounds() {
      return this.limitLatLngBounds;
   }

   public void setLimitLatLngBounds(LatLngBounds var1) {
      this.limitLatLngBounds = var1;
      if (var1 == null) {
         this.resetMinMaxZoomPreference();
      }

   }

   public void resetMinMaxZoomPreference() {
      this.minZoomLevel = 3.0F;
      this.maxZoomLevel = 20.0F;
      this.isSetLimitZoomLevel = false;
   }

   public void updateMapRectNextFrame(boolean var1) {
      this.isNeedUpdateMapRectNextFrame = var1;
   }

   public void setMapPerPixelUnitLength(float var1) {
      this.mapPerPixelUnitLength = var1;
   }

   public float getMapPerPixelUnitLength() {
      return this.mapPerPixelUnitLength;
   }

   public void setCustomStylePath(String var1) {
      this.mCustomStylePath = var1;
   }

   public String getCustomStylePath() {
      return this.mCustomStylePath;
   }

   public String getCustomStyleID() {
      return this.mCustomStyleID;
   }

   public void setCustomStyleID(String var1) {
      this.mCustomStyleID = var1;
   }

   public void setCustomStyleEnable(boolean var1) {
      this.isCustomStyleEnabled = var1;
   }

   public boolean isCustomStyleEnable() {
      return this.isCustomStyleEnabled;
   }

   public int getMapStyleTime() {
      return this.mMapStyleTime;
   }

   public void setMapStyleTime(int var1) {
      this.mMapStyleTime = var1;
   }

   public int getMapStyleMode() {
      return this.mMapStyleMode;
   }

   public void setMapStyleMode(int var1) {
      this.mMapStyleMode = var1;
   }

   public int getMapStyleState() {
      return this.mMapStyleState;
   }

   public void setMapStyleState(int var1) {
      this.mMapStyleState = var1;
   }

   public void setCustomTextureResourcePath(String var1) {
      this.customTextureResourcePath = var1;
   }

   public String getCustomTextureResourcePath() {
      return this.customTextureResourcePath;
   }

   public boolean isProFunctionAuthEnable() {
      return this.isProFunctionAuthEnable;
   }

   public void setProFunctionAuthEnable(boolean var1) {
      this.isProFunctionAuthEnable = var1;
   }

   public boolean isUseProFunction() {
      return this.isUseProFunction;
   }

   public void setUseProFunction(boolean var1) {
      this.isUseProFunction = var1;
   }

   public void setCustomBackgroundColor(int var1) {
      this.customBackgroundColor = var1;
   }

   public int getCustomBackgroundColor() {
      return this.customBackgroundColor;
   }

   public void setMapZoomScale(float var1) {
      this.mapZoomScale = var1;
   }

   public float getMapZoomScale() {
      return this.mapZoomScale;
   }

   public void setMapWidth(int var1) {
      this.mapWidth = var1;
   }

   public int getMapWidth() {
      return this.mapWidth;
   }

   public void setMapHeight(int var1) {
      this.mapHeight = var1;
   }

   public int getMapHeight() {
      return this.mapHeight;
   }

   public void setMapLanguage(String var1) {
      this.mMapLanguage = var1;
   }

   public String getMapLanguage() {
      return this.mMapLanguage;
   }

   public void setHideLogoEnble(boolean var1) {
      this.isHideLogoEnable = var1;
   }

   public boolean isHideLogoEnable() {
      return this.isHideLogoEnable;
   }

   public void setWorldMapEnable(boolean var1) {
      this.isWorldMapEnable = var1;
   }

   public boolean isWorldMapEnable() {
      return this.isWorldMapEnable;
   }

   public float getSkyHeight() {
      return this.skyHeight;
   }

   public void setSkyHeight(float var1) {
      this.skyHeight = var1;
   }

   public float[] getViewMatrix() {
      return this.viewMatrix;
   }

   public float[] getProjectionMatrix() {
      return this.projectionMatrix;
   }

   public float[] getMvpMatrix() {
      return this.mvpMatrix;
   }

   public void updateFinalMatrix() {
      Matrix.multiplyMM(this.mvpMatrix, 0, this.projectionMatrix, 0, this.viewMatrix, 0);
   }

   public int[] getCurTileIds() {
      return this.tilsIDs;
   }
}
