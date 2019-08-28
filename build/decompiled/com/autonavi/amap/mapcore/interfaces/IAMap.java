package com.autonavi.amap.mapcore.interfaces;

import android.location.Location;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
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
import com.amap.api.maps.Projection;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.AMapCameraInfo;
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
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.ae.gmap.gloverlay.BaseMapOverlay;
import com.autonavi.ae.gmap.gloverlay.GLTextureProperty;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.MapConfig;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public interface IAMap {
   CameraPosition getCameraPosition() throws RemoteException;

   float getMaxZoomLevel();

   float getMinZoomLevel();

   void moveCamera(CameraUpdate var1) throws RemoteException;

   void animateCamera(CameraUpdate var1) throws RemoteException;

   void animateCameraWithCallback(CameraUpdate var1, AMap$CancelableCallback var2) throws RemoteException;

   void animateCameraWithDurationAndCallback(CameraUpdate var1, long var2, AMap$CancelableCallback var4) throws RemoteException;

   void stopAnimation() throws RemoteException;

   NavigateArrow addNavigateArrow(NavigateArrowOptions var1) throws RemoteException;

   Polyline addPolyline(PolylineOptions var1) throws RemoteException;

   Circle addCircle(CircleOptions var1) throws RemoteException;

   Arc addArc(ArcOptions var1) throws RemoteException;

   Polygon addPolygon(PolygonOptions var1) throws RemoteException;

   GroundOverlay addGroundOverlay(GroundOverlayOptions var1) throws RemoteException;

   MultiPointOverlay addMultiPointOverlay(MultiPointOverlayOptions var1) throws RemoteException;

   Marker addMarker(MarkerOptions var1) throws RemoteException;

   ArrayList<Marker> addMarkers(ArrayList<MarkerOptions> var1, boolean var2) throws RemoteException;

   Text addText(TextOptions var1) throws RemoteException;

   TileOverlay addTileOverlay(TileOverlayOptions var1) throws RemoteException;

   void clear() throws RemoteException;

   void clear(boolean var1) throws RemoteException;

   int getMapType() throws RemoteException;

   void setMapType(int var1) throws RemoteException;

   boolean isTrafficEnabled() throws RemoteException;

   void setTrafficEnabled(boolean var1) throws RemoteException;

   boolean isIndoorEnabled() throws RemoteException;

   void setIndoorEnabled(boolean var1) throws RemoteException;

   void set3DBuildingEnabled(boolean var1) throws RemoteException;

   boolean isMyLocationEnabled() throws RemoteException;

   void setMyLocationEnabled(boolean var1) throws RemoteException;

   void setLoadOfflineData(boolean var1) throws RemoteException;

   void setMyLocationStyle(MyLocationStyle var1) throws RemoteException;

   void setMyLocationType(int var1) throws RemoteException;

   List<Marker> getMapScreenMarkers() throws RemoteException;

   void setMapTextEnable(boolean var1) throws RemoteException;

   void setRoadArrowEnable(boolean var1) throws RemoteException;

   void setMyTrafficStyle(MyTrafficStyle var1) throws RemoteException;

   Location getMyLocation() throws RemoteException;

   void setLocationSource(LocationSource var1) throws RemoteException;

   /** @deprecated */
   void setMyLocationRotateAngle(float var1) throws RemoteException;

   UiSettings getAMapUiSettings() throws RemoteException;

   Projection getAMapProjection() throws RemoteException;

   void setOnCameraChangeListener(AMap$OnCameraChangeListener var1) throws RemoteException;

   void setOnMapClickListener(AMap$OnMapClickListener var1) throws RemoteException;

   void setOnMapTouchListener(AMap$OnMapTouchListener var1) throws RemoteException;

   void setOnMapLongClickListener(AMap$OnMapLongClickListener var1) throws RemoteException;

   void setOnMarkerClickListener(AMap$OnMarkerClickListener var1) throws RemoteException;

   void setOnPolylineClickListener(AMap$OnPolylineClickListener var1) throws RemoteException;

   void setOnMarkerDragListener(AMap$OnMarkerDragListener var1) throws RemoteException;

   void setOnMaploadedListener(AMap$OnMapLoadedListener var1) throws RemoteException;

   void setOnInfoWindowClickListener(AMap$OnInfoWindowClickListener var1) throws RemoteException;

   void setOnMyLocationChangeListener(AMap$OnMyLocationChangeListener var1) throws RemoteException;

   void setOnPOIClickListener(AMap$OnPOIClickListener var1) throws RemoteException;

   void setInfoWindowAdapter(AMap$InfoWindowAdapter var1) throws RemoteException;

   void setInfoWindowAdapter(AMap$CommonInfoWindowAdapter var1) throws RemoteException;

   void setOnIndoorBuildingActiveListener(AMap$OnIndoorBuildingActiveListener var1) throws RemoteException;

   void getMapPrintScreen(AMap$onMapPrintScreenListener var1);

   void getMapScreenShot(AMap$OnMapScreenShotListener var1);

   float getScalePerPixel() throws RemoteException;

   void setRunLowFrame(boolean var1);

   void removecache() throws RemoteException;

   void removecache(AMap$OnCacheRemoveListener var1) throws RemoteException;

   void setCustomRenderer(CustomRenderer var1) throws RemoteException;

   void setCenterToPixel(int var1, int var2) throws RemoteException;

   void setMapTextZIndex(int var1) throws RemoteException;

   int getMapTextZIndex() throws RemoteException;

   void reloadMap();

   void setRenderFps(int var1);

   void setIndoorBuildingInfo(IndoorBuildingInfo var1) throws RemoteException;

   void setAMapGestureListener(AMapGestureListener var1);

   float getZoomToSpanLevel(LatLng var1, LatLng var2);

   Pair<Float, LatLng> calculateZoomToSpanLevel(int var1, int var2, int var3, int var4, LatLng var5, LatLng var6);

   InfoWindowAnimationManager getInfoWindowAnimationManager();

   void setMaskLayerParams(int var1, int var2, int var3, int var4, int var5, long var6);

   void setMaxZoomLevel(float var1);

   void setMinZoomLevel(float var1);

   void resetMinMaxZoomPreference();

   void setMapStatusLimits(LatLngBounds var1);

   void setCustomMapStylePath(String var1);

   void setMapCustomEnable(boolean var1);

   Handler getMainHandler();

   void onChangeFinish();

   void setZoomScaleParam(float var1);

   void onFling();

   int getMapWidth();

   int getMapHeight();

   float getCameraAngle();

   float getSkyHeight();

   boolean isMaploaded();

   MapConfig getMapConfig();

   View getView() throws RemoteException;

   void setZOrderOnTop(boolean var1) throws RemoteException;

   void destroy();

   void setVisibilityEx(int var1);

   void onActivityPause();

   void onActivityResume();

   void queueEvent(Runnable var1);

   long createGLOverlay(int var1);

   long getGlOverlayMgrPtr();

   CrossOverlay addCrossVector(CrossOverlayOptions var1);

   RouteOverlay addNaviRouteOverlay();

   void removeEngineGLOverlay(BaseMapOverlay var1);

   float[] getViewMatrix();

   float[] getProjectionMatrix();

   void addOverlayTexture(int var1, GLTextureProperty var2);

   void renderSurface(GL10 var1);

   void changeSurface(GL10 var1, int var2, int var3);

   void createSurface(GL10 var1, EGLConfig var2);

   boolean onTouchEvent(MotionEvent var1);

   boolean canStopMapRender();

   void getLatLngRect(DPoint[] var1);

   void setCustomTextureResourcePath(String var1);

   MyLocationStyle getMyLocationStyle() throws RemoteException;

   int getRenderMode();

   void destroySurface(int var1);

   void drawFrame(GL10 var1);

   void requestRender();

   void resetRenderTime();

   void onIndoorBuildingActivity(int var1, byte[] var2);

   AMapCameraInfo getCamerInfo();

   void checkMapState(GLMapState var1);

   void setRenderMode(int var1);

   void setOnMultiPointClickListener(AMap$OnMultiPointClickListener var1);

   String getMapContentApprovalNumber();

   String getSatelliteImageApprovalNumber();

   void setMapLanguage(String var1);

   void setCustomMapStyleID(String var1);

   BuildingOverlay addBuildingOverlay();

   GL3DModel addGLModel(GL3DModelOptions var1);

   ParticleOverlay addParticleOverlay(ParticleOverlayOptions var1);

   void setCustomMapStyle(CustomMapStyleOptions var1);
}
