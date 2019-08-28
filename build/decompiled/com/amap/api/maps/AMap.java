package com.amap.api.maps;

import android.location.Location;
import android.util.Log;
import android.util.Pair;
import com.amap.api.maps.model.AMapGestureListener;
import com.amap.api.maps.model.Arc;
import com.amap.api.maps.model.ArcOptions;
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
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MultiPointOverlay;
import com.amap.api.maps.model.MultiPointOverlayOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.MyTrafficStyle;
import com.amap.api.maps.model.NavigateArrow;
import com.amap.api.maps.model.NavigateArrowOptions;
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
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import java.util.ArrayList;
import java.util.List;

public final class AMap {
   public static final int MAP_TYPE_NORMAL = 1;
   public static final int MAP_TYPE_SATELLITE = 2;
   public static final int MAP_TYPE_NIGHT = 3;
   public static final int MAP_TYPE_NAVI = 4;
   public static final int MAP_TYPE_BUS = 5;
   /** @deprecated */
   public static final int LOCATION_TYPE_LOCATE = 1;
   /** @deprecated */
   public static final int LOCATION_TYPE_MAP_FOLLOW = 2;
   /** @deprecated */
   public static final int LOCATION_TYPE_MAP_ROTATE = 3;
   public static final int MASK_LAYER_NONE = -1;
   public static final int MASK_LAYER_UNDER_MARKER = 0;
   public static final String CHINESE = "zh_cn";
   public static final String ENGLISH = "en";
   public static final int MASK_LAYER_UNDER_LINE = 1;
   private final IAMap a;
   private UiSettings b;
   private Projection c;
   private MyTrafficStyle d;

   protected AMap(IAMap var1) {
      this.a = var1;
   }

   public final CameraPosition getCameraPosition() {
      try {
         return this.a.getCameraPosition();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public final float getMaxZoomLevel() {
      return this.a.getMaxZoomLevel();
   }

   public final float getMinZoomLevel() {
      return this.a.getMinZoomLevel();
   }

   public final void moveCamera(CameraUpdate var1) {
      try {
         this.a.moveCamera(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void animateCamera(CameraUpdate var1) {
      try {
         this.a.animateCamera(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void animateCamera(CameraUpdate var1, AMap$CancelableCallback var2) {
      try {
         this.a.animateCameraWithCallback(var1, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public final void animateCamera(CameraUpdate var1, long var2, AMap$CancelableCallback var4) {
      try {
         if (var2 <= 0L) {
            Log.w("AMap", "durationMs must be positive");
         }

         this.a.animateCameraWithDurationAndCallback(var1, var2, var4);
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

   }

   public final void stopAnimation() {
      try {
         this.a.stopAnimation();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public final NavigateArrow addNavigateArrow(NavigateArrowOptions var1) {
      try {
         return this.a.addNavigateArrow(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public final Polyline addPolyline(PolylineOptions var1) {
      try {
         return this.a.addPolyline(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public final BuildingOverlay addBuildingOverlay() {
      try {
         return this.a.addBuildingOverlay();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public final Circle addCircle(CircleOptions var1) {
      try {
         return this.a.addCircle(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public final Arc addArc(ArcOptions var1) {
      try {
         return this.a.addArc(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public final Polygon addPolygon(PolygonOptions var1) {
      try {
         return this.a.addPolygon(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public final GroundOverlay addGroundOverlay(GroundOverlayOptions var1) {
      try {
         return this.a.addGroundOverlay(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public final Marker addMarker(MarkerOptions var1) {
      try {
         return this.a.addMarker(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public GL3DModel addGL3DModel(GL3DModelOptions var1) {
      try {
         return this.a.addGLModel(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public final Text addText(TextOptions var1) {
      try {
         return this.a.addText(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public final ArrayList<Marker> addMarkers(ArrayList<MarkerOptions> var1, boolean var2) {
      try {
         return this.a.addMarkers(var1, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public final List<Marker> getMapScreenMarkers() {
      try {
         return this.a.getMapScreenMarkers();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public final TileOverlay addTileOverlay(TileOverlayOptions var1) {
      try {
         return this.a.addTileOverlay(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public MultiPointOverlay addMultiPointOverlay(MultiPointOverlayOptions var1) {
      try {
         return this.a.addMultiPointOverlay(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public ParticleOverlay addParticleOverlay(ParticleOverlayOptions var1) {
      try {
         return this.a.addParticleOverlay(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public final void clear() {
      try {
         this.a.clear();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public final void clear(boolean var1) {
      try {
         this.a.clear(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final int getMapType() {
      try {
         return this.a.getMapType();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 1;
      }
   }

   public final void setMapType(int var1) {
      try {
         this.a.setMapType(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final boolean isTrafficEnabled() {
      try {
         return this.a.isTrafficEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public void setTrafficEnabled(boolean var1) {
      try {
         this.a.setTrafficEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void showMapText(boolean var1) {
      try {
         this.a.setMapTextEnable(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void showIndoorMap(boolean var1) {
      try {
         this.a.setIndoorEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void showBuildings(boolean var1) {
      try {
         this.a.set3DBuildingEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setMyTrafficStyle(MyTrafficStyle var1) {
      try {
         this.d = var1;
         this.a.setMyTrafficStyle(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public MyTrafficStyle getMyTrafficStyle() {
      return this.d;
   }

   public final boolean isMyLocationEnabled() {
      try {
         return this.a.isMyLocationEnabled();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public final void setMyLocationEnabled(boolean var1) {
      try {
         this.a.setMyLocationEnabled(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final Location getMyLocation() {
      try {
         return this.a.getMyLocation();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public final void setLocationSource(LocationSource var1) {
      try {
         this.a.setLocationSource(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setMyLocationStyle(MyLocationStyle var1) {
      try {
         this.a.setMyLocationStyle(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final MyLocationStyle getMyLocationStyle() {
      try {
         return this.a.getMyLocationStyle();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   /** @deprecated */
   public final void setMyLocationType(int var1) {
      try {
         this.a.setMyLocationType(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   /** @deprecated */
   public final void setMyLocationRotateAngle(float var1) {
      try {
         this.a.setMyLocationRotateAngle(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final UiSettings getUiSettings() {
      try {
         if (this.b == null) {
            this.b = this.a.getAMapUiSettings();
         }

         return this.b;
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public final Projection getProjection() {
      try {
         if (this.c == null) {
            this.c = this.a.getAMapProjection();
         }

         return this.c;
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public final void setOnCameraChangeListener(AMap$OnCameraChangeListener var1) {
      try {
         this.a.setOnCameraChangeListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnMapClickListener(AMap$OnMapClickListener var1) {
      try {
         this.a.setOnMapClickListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnMapTouchListener(AMap$OnMapTouchListener var1) {
      try {
         this.a.setOnMapTouchListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnPOIClickListener(AMap$OnPOIClickListener var1) {
      try {
         this.a.setOnPOIClickListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnMyLocationChangeListener(AMap$OnMyLocationChangeListener var1) {
      try {
         this.a.setOnMyLocationChangeListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnMapLongClickListener(AMap$OnMapLongClickListener var1) {
      try {
         this.a.setOnMapLongClickListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnMarkerClickListener(AMap$OnMarkerClickListener var1) {
      try {
         this.a.setOnMarkerClickListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnPolylineClickListener(AMap$OnPolylineClickListener var1) {
      try {
         this.a.setOnPolylineClickListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnMarkerDragListener(AMap$OnMarkerDragListener var1) {
      try {
         this.a.setOnMarkerDragListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnInfoWindowClickListener(AMap$OnInfoWindowClickListener var1) {
      try {
         this.a.setOnInfoWindowClickListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setInfoWindowAdapter(AMap$InfoWindowAdapter var1) {
      try {
         this.a.setInfoWindowAdapter(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setCommonInfoWindowAdapter(AMap$CommonInfoWindowAdapter var1) {
      try {
         this.a.setInfoWindowAdapter(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnMapLoadedListener(AMap$OnMapLoadedListener var1) {
      try {
         this.a.setOnMaploadedListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setOnIndoorBuildingActiveListener(AMap$OnIndoorBuildingActiveListener var1) {
      try {
         this.a.setOnIndoorBuildingActiveListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setOnMultiPointClickListener(AMap$OnMultiPointClickListener var1) {
      try {
         this.a.setOnMultiPointClickListener(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   /** @deprecated */
   public void getMapPrintScreen(AMap$onMapPrintScreenListener var1) {
      this.a.getMapPrintScreen(var1);
   }

   public void getMapScreenShot(AMap$OnMapScreenShotListener var1) {
      this.a.getMapScreenShot(var1);
   }

   public float getScalePerPixel() {
      try {
         return this.a.getScalePerPixel();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0.0F;
      }
   }

   public void runOnDrawFrame() {
      this.a.setRunLowFrame(false);
   }

   public void removecache() {
      try {
         this.a.removecache();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void removecache(AMap$OnCacheRemoveListener var1) {
      try {
         this.a.removecache(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setCustomRenderer(CustomRenderer var1) {
      try {
         this.a.setCustomRenderer(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setPointToCenter(int var1, int var2) {
      try {
         this.a.setCenterToPixel(var1, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public final void setMapTextZIndex(int var1) {
      try {
         this.a.setMapTextZIndex(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final void setLoadOfflineData(boolean var1) {
      try {
         this.a.setLoadOfflineData(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public final int getMapTextZIndex() {
      try {
         return this.a.getMapTextZIndex();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   /** @deprecated */
   @Deprecated
   public static String getVersion() {
      return "6.9.2";
   }

   public void reloadMap() {
      this.a.reloadMap();
   }

   public void setRenderFps(int var1) {
      this.a.setRenderFps(var1);
   }

   public void setIndoorBuildingInfo(IndoorBuildingInfo var1) {
      try {
         this.a.setIndoorBuildingInfo(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setAMapGestureListener(AMapGestureListener var1) {
      this.a.setAMapGestureListener(var1);
   }

   public float getZoomToSpanLevel(LatLng var1, LatLng var2) {
      return this.a.getZoomToSpanLevel(var1, var2);
   }

   public Pair<Float, LatLng> calculateZoomToSpanLevel(int var1, int var2, int var3, int var4, LatLng var5, LatLng var6) {
      return this.a.calculateZoomToSpanLevel(var1, var2, var3, var4, var5, var6);
   }

   public final InfoWindowAnimationManager getInfoWindowAnimationManager() {
      return this.a.getInfoWindowAnimationManager();
   }

   public void setMaskLayerParams(int var1, int var2, int var3, int var4, int var5, long var6) {
      this.a.setMaskLayerParams(var1, var2, var3, var4, var5, var6);
   }

   public void setMaxZoomLevel(float var1) {
      this.a.setMaxZoomLevel(var1);
   }

   public void setMinZoomLevel(float var1) {
      this.a.setMinZoomLevel(var1);
   }

   public void resetMinMaxZoomPreference() {
      this.a.resetMinMaxZoomPreference();
   }

   public void setMapStatusLimits(LatLngBounds var1) {
      try {
         this.a.setMapStatusLimits(var1);
         this.moveCamera(CameraUpdateFactory.newLatLngBounds(var1, 0));
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public CrossOverlay addCrossOverlay(CrossOverlayOptions var1) {
      try {
         return this.a.addCrossVector(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public RouteOverlay addRouteOverlay() {
      return this.a.addNaviRouteOverlay();
   }

   public float[] getViewMatrix() {
      return this.a.getViewMatrix();
   }

   public float[] getProjectionMatrix() {
      return this.a.getProjectionMatrix();
   }

   /** @deprecated */
   public void setMapCustomEnable(boolean var1) {
      this.a.setMapCustomEnable(var1);
   }

   /** @deprecated */
   public void setCustomMapStylePath(String var1) {
      this.a.setCustomMapStylePath(var1);
   }

   public void setCustomMapStyle(CustomMapStyleOptions var1) {
      this.a.setCustomMapStyle(var1);
   }

   /** @deprecated */
   public void setCustomMapStyleID(String var1) {
      this.a.setCustomMapStyleID(var1);
   }

   /** @deprecated */
   public void setCustomTextureResourcePath(String var1) {
      this.a.setCustomTextureResourcePath(var1);
   }

   public void setRenderMode(int var1) {
      this.a.setRenderMode(var1);
   }

   public void getP20MapCenter(IPoint var1) {
      try {
         if (var1 == null) {
            var1 = new IPoint();
         }

         var1.x = this.a.getMapConfig().getSX();
         var1.y = this.a.getMapConfig().getSY();
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public String getMapContentApprovalNumber() {
      try {
         return this.a.getMapContentApprovalNumber();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public String getSatelliteImageApprovalNumber() {
      try {
         return this.a.getSatelliteImageApprovalNumber();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setMapLanguage(String var1) {
      try {
         this.a.setMapLanguage(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void setRoadArrowEnable(boolean var1) {
      try {
         this.a.setRoadArrowEnable(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }
}
