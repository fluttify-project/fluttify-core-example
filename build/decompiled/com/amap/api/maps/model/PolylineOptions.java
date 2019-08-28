package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolylineOptions extends BaseOptions implements Parcelable {
   public static final PolylineOptionsCreator CREATOR = new PolylineOptionsCreator();
   public static final int DOTTEDLINE_TYPE_SQUARE = 0;
   public static final int DOTTEDLINE_TYPE_CIRCLE = 1;
   private final List<LatLng> points;
   private float width = 10.0F;
   private int color = -16777216;
   private float zIndex = 0.0F;
   private boolean isVisible = true;
   String a;
   private BitmapDescriptor customTexture;
   private List<BitmapDescriptor> customTextureList;
   private List<Integer> colorValues;
   private List<Integer> customIndexs;
   private boolean isUseTexture = true;
   private boolean isGeodesic = false;
   private boolean isDottedLine = false;
   private boolean isGradient = false;
   private float transparency = 1.0F;
   private boolean isAboveMaskLayer = false;
   private int dottedLineType = 0;
   private PolylineOptions$LineCapType lineCapType;
   private PolylineOptions$LineJoinType lineJoinType;
   private int nLineCapType;
   private int nLineJoinType;
   private float shownRatio;
   private float shownRangeBegin;
   private float shownRangeEnd;
   private final String type;
   private int[] jniColorValues;
   private int[] jniCustomIndexes;
   private List<String> bitmapSymbolList;
   private String bitmapSymbol;
   private boolean isPointsUpdated;
   private boolean isCustomTextureListUpdated;
   private boolean isColorValuesUpdated;
   private boolean isCustomIndexesUpdated;
   private double[] pointList;

   public PolylineOptions() {
      this.lineCapType = PolylineOptions$LineCapType.LineCapRound;
      this.lineJoinType = PolylineOptions$LineJoinType.LineJoinBevel;
      this.nLineCapType = 3;
      this.nLineJoinType = 0;
      this.shownRatio = -1.0F;
      this.shownRangeBegin = -1.0F;
      this.shownRangeEnd = -1.0F;
      this.type = "PolylineOptions";
      this.isPointsUpdated = false;
      this.isCustomTextureListUpdated = false;
      this.isColorValuesUpdated = false;
      this.isCustomIndexesUpdated = false;
      this.points = new ArrayList();
   }

   public PolylineOptions setUseTexture(boolean var1) {
      this.isUseTexture = var1;
      return this;
   }

   public PolylineOptions setCustomTexture(BitmapDescriptor var1) {
      this.customTexture = var1;
      if (var1 != null) {
         this.bitmapSymbol = var1.getId();
      }

      return this;
   }

   public BitmapDescriptor getCustomTexture() {
      return this.customTexture;
   }

   public PolylineOptions setCustomTextureList(List<BitmapDescriptor> var1) {
      this.customTextureList = var1;

      try {
         if (var1 != null) {
            this.bitmapSymbolList = new ArrayList();

            for(int var2 = 0; var2 < var1.size(); ++var2) {
               this.bitmapSymbolList.add(((BitmapDescriptor)var1.get(var2)).getId());
            }

            this.isCustomTextureListUpdated = true;
         }
      } catch (Throwable var3) {
         ;
      }

      return this;
   }

   public List<BitmapDescriptor> getCustomTextureList() {
      return this.customTextureList;
   }

   public PolylineOptions setCustomTextureIndex(List<Integer> var1) {
      try {
         this.customIndexs = var1;
         this.jniCustomIndexes = new int[var1.size()];

         for(int var2 = 0; var2 < this.jniCustomIndexes.length; ++var2) {
            this.jniCustomIndexes[var2] = ((Integer)var1.get(var2)).intValue();
         }

         this.isCustomIndexesUpdated = true;
      } catch (Throwable var3) {
         ;
      }

      return this;
   }

   public List<Integer> getCustomTextureIndex() {
      return this.customIndexs;
   }

   public PolylineOptions colorValues(List<Integer> var1) {
      try {
         this.colorValues = var1;
         this.jniColorValues = new int[var1.size()];

         for(int var2 = 0; var2 < this.jniColorValues.length; ++var2) {
            this.jniColorValues[var2] = ((Integer)var1.get(var2)).intValue();
         }

         this.isColorValuesUpdated = true;
      } catch (Throwable var3) {
         ;
      }

      return this;
   }

   public List<Integer> getColorValues() {
      return this.colorValues;
   }

   public PolylineOptions useGradient(boolean var1) {
      this.isGradient = var1;
      return this;
   }

   public boolean isUseGradient() {
      return this.isGradient;
   }

   public boolean isUseTexture() {
      return this.isUseTexture;
   }

   public boolean isGeodesic() {
      return this.isGeodesic;
   }

   public PolylineOptions add(LatLng var1) {
      if (var1 != null) {
         try {
            this.points.add(var1);
            this.isPointsUpdated = true;
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

      return this;
   }

   public PolylineOptions add(LatLng... var1) {
      if (var1 != null) {
         try {
            this.points.addAll(Arrays.asList(var1));
            this.isPointsUpdated = true;
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

      return this;
   }

   public PolylineOptions addAll(Iterable<LatLng> var1) {
      if (var1 != null) {
         try {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               LatLng var3 = (LatLng)var2.next();
               this.points.add(var3);
            }

            this.isPointsUpdated = true;
         } catch (Throwable var4) {
            var4.printStackTrace();
         }
      }

      return this;
   }

   public PolylineOptions width(float var1) {
      this.width = var1;
      return this;
   }

   public PolylineOptions color(int var1) {
      this.color = var1;
      return this;
   }

   public PolylineOptions zIndex(float var1) {
      this.zIndex = var1;
      return this;
   }

   public PolylineOptions visible(boolean var1) {
      this.isVisible = var1;
      return this;
   }

   public PolylineOptions geodesic(boolean var1) {
      this.isGeodesic = var1;
      return this;
   }

   public PolylineOptions setDottedLine(boolean var1) {
      this.isDottedLine = var1;
      return this;
   }

   public boolean isDottedLine() {
      return this.isDottedLine;
   }

   public PolylineOptions setDottedLineType(int var1) {
      this.dottedLineType = var1 == 0 ? 0 : 1;
      return this;
   }

   public PolylineOptions lineCapType(PolylineOptions$LineCapType var1) {
      if (var1 != null) {
         this.lineCapType = var1;
         this.nLineCapType = var1.getTypeValue();
      }

      return this;
   }

   public PolylineOptions lineJoinType(PolylineOptions$LineJoinType var1) {
      if (var1 != null) {
         this.lineJoinType = var1;
         this.nLineJoinType = var1.getTypeValue();
      }

      return this;
   }

   public PolylineOptions$LineCapType getLineCapType() {
      return this.lineCapType;
   }

   public PolylineOptions$LineJoinType getLineJoinType() {
      return this.lineJoinType;
   }

   public int getDottedLineType() {
      return this.dottedLineType;
   }

   public List<LatLng> getPoints() {
      return this.points;
   }

   public float getWidth() {
      return this.width;
   }

   public int getColor() {
      return this.color;
   }

   public float getZIndex() {
      return this.zIndex;
   }

   public boolean isVisible() {
      return this.isVisible;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeTypedList(this.points);
      var1.writeFloat(this.width);
      var1.writeInt(this.color);
      var1.writeInt(this.dottedLineType);
      var1.writeFloat(this.zIndex);
      var1.writeFloat(this.transparency);
      var1.writeString(this.a);
      var1.writeInt(this.lineCapType.getTypeValue());
      var1.writeInt(this.lineJoinType.getTypeValue());
      var1.writeBooleanArray(new boolean[]{this.isVisible, this.isDottedLine, this.isGeodesic, this.isGradient, this.isAboveMaskLayer});
      if (this.customTexture != null) {
         var1.writeParcelable(this.customTexture, var2);
      }

      if (this.customTextureList != null) {
         var1.writeList(this.customTextureList);
      }

      if (this.customIndexs != null) {
         var1.writeList(this.customIndexs);
      }

      if (this.colorValues != null) {
         var1.writeList(this.colorValues);
      }

      var1.writeFloat(this.shownRatio);
   }

   public PolylineOptions transparency(float var1) {
      this.transparency = var1;
      return this;
   }

   public float getTransparency() {
      return this.transparency;
   }

   public PolylineOptions aboveMaskLayer(boolean var1) {
      this.isAboveMaskLayer = var1;
      return this;
   }

   public boolean isAboveMaskLayer() {
      return this.isAboveMaskLayer;
   }

   public void setPoints(List<LatLng> var1) {
      if (var1 != null && this.points != var1) {
         try {
            this.points.clear();
            this.points.addAll(var1);
            this.isPointsUpdated = true;
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

   }

   public float getShownRatio() {
      return this.shownRatio;
   }

   /** @deprecated */
   public PolylineOptions setShownRatio(float var1) {
      this.shownRatio = var1;
      return this;
   }

   public PolylineOptions setShownRange(float var1, float var2) {
      this.shownRangeBegin = var1;
      this.shownRangeEnd = var2;
      return this;
   }

   public float getShownRangeBegin() {
      return this.shownRangeBegin;
   }

   public float getShownRangeEnd() {
      return this.shownRangeEnd;
   }
}
