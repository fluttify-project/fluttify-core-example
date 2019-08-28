package com.autonavi.amap.mapcore;

public enum AbstractCameraUpdateMessage$Type {
   none,
   zoomIn,
   changeCenter,
   changeTilt,
   changeBearing,
   changeBearingGeoCenter,
   changeGeoCenterZoom,
   zoomOut,
   zoomTo,
   zoomBy,
   scrollBy,
   newCameraPosition,
   newLatLngBounds,
   newLatLngBoundsWithSize,
   changeGeoCenterZoomTiltBearing;

   private AbstractCameraUpdateMessage$Type() {
   }
}
