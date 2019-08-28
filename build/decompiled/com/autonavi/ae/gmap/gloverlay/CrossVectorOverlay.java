package com.autonavi.ae.gmap.gloverlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.TypedValue;
import com.amap.api.mapcore.util.ae;
import com.amap.api.mapcore.util.ae$a;
import com.amap.api.mapcore.util.u;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener;

public class CrossVectorOverlay extends BaseMapOverlay<GLCrossVector, Object> implements ae$a {
   private ae pluginTexture;
   private boolean isImageMode = false;
   private CrossOverlay$GenerateCrossImageListener imageListener;
   GLCrossVector$AVectorCrossAttr attr = null;

   public CrossVectorOverlay(int var1, Context var2, u var3) {
      super(var1, var2, var3);
   }

   protected void iniGLOverlay() {
      this.mGLOverlay = new GLCrossVector(this.mEngineID, this.mMapView, this.hashCode());
   }

   public void addItem(Object var1) {
   }

   public void resumeMarker(Bitmap var1) {
      short var2 = 12345;
      this.AddOverlayTexture(var1, var2, 4);
      ((GLCrossVector)this.mGLOverlay).setArrowResId(false, var2);
      ((GLCrossVector)this.mGLOverlay).setCarResId(var2);
      char var5 = '퐱';
      BitmapDescriptor var3 = BitmapDescriptorFactory.fromAsset("cross/crossing_nigth_bk.data");
      Bitmap var4 = null;
      if (var3 != null) {
         var4 = var3.getBitmap();
      }

      this.AddOverlayTexture(var4, var5, 0);
      ((GLCrossVector)this.mGLOverlay).setBackgroundResId(var5);
   }

   public void AddOverlayTexture(Bitmap var1, int var2, int var3) {
      GLTextureProperty var4 = new GLTextureProperty();
      var4.mId = var2;
      var4.mAnchor = var3;
      var4.mBitmap = var1;
      var4.mXRatio = 0.0F;
      var4.mYRatio = 0.0F;
      var4.isGenMimps = true;
      this.mMapView.addOverlayTexture(this.mEngineID, var4);
   }

   public int dipToPixel(Context var1, int var2) {
      if (var1 == null) {
         return var2;
      } else {
         try {
            float var3 = TypedValue.applyDimension(1, (float)var2, var1.getResources().getDisplayMetrics());
            return (int)var3;
         } catch (Exception var4) {
            return var2;
         }
      }
   }

   public void setAttribute(GLCrossVector$AVectorCrossAttr var1) {
      this.attr = var1;
   }

   public int setData(byte[] var1) {
      if (VERSION.SDK_INT < 21) {
         return -1;
      } else {
         int var2 = -1;
         if (this.attr == null) {
            this.attr = new GLCrossVector$AVectorCrossAttr();
            this.attr.stAreaRect = new Rect(0, 0, this.mMapView.getMapWidth(), this.mMapView.getMapHeight() * 4 / 11);
            this.attr.stAreaColor = Color.argb(217, 95, 95, 95);
            this.attr.fArrowBorderWidth = this.dipToPixel(this.mContext, 22);
            this.attr.stArrowBorderColor = Color.argb(0, 0, 50, 20);
            this.attr.fArrowLineWidth = this.dipToPixel(this.mContext, 18);
            this.attr.stArrowLineColor = Color.argb(255, 255, 253, 65);
            this.attr.dayMode = false;
         }

         if (null != var1 && this.attr != null) {
            int var3 = this.mMapView.getMapWidth();
            int var4 = this.mMapView.getMapHeight();
            if (this.isImageMode && this.imageListener != null) {
               this.initImageMode(var3, var4);
            }

            var2 = ((GLCrossVector)this.mGLOverlay).addVectorItem(this.attr, var1, var1.length);
            ((GLCrossVector)this.mGLOverlay).setVisible(true);
            if (this.isImageMode && this.imageListener != null) {
               this.mMapView.queueEvent(new CrossVectorOverlay$1(this, var3, var4));
            }
         }

         if (var2 == -1) {
            this.drawVectorFailed(var2);
         }

         return var2;
      }
   }

   private void drawVectorFailed(int var1) {
      if (this.pluginTexture != null) {
         this.pluginTexture.b();
      }

      if (this.imageListener != null) {
         this.imageListener.onGenerateComplete((Bitmap)null, var1);
      }

   }

   private void initImageMode(int var1, int var2) {
      if (this.pluginTexture == null) {
         this.pluginTexture = new ae(this.mMapView);
         this.pluginTexture.a(this.imageListener);
         this.pluginTexture.a((ae$a)this);
         int var3 = this.attr.stAreaRect.width();
         int var4 = this.attr.stAreaRect.height();
         this.pluginTexture.b(var3, var4);
      }

      if (this.mGLOverlay != null) {
         ((GLCrossVector)this.mGLOverlay).initFBOTexture(var1, var2);
      }

   }

   public void remove() {
      if (this.pluginTexture != null) {
         this.pluginTexture.b();
         this.pluginTexture = null;
      }

      this.imageListener = null;
      this.setVisible(false);
      this.releaseInstance();
   }

   public void setImageMode(boolean var1) {
      this.isImageMode = var1;
   }

   public void setGenerateCrossImageListener(CrossOverlay$GenerateCrossImageListener var1) {
      this.imageListener = var1;
      if (this.pluginTexture != null) {
         this.pluginTexture.a(this.imageListener);
      }

   }

   public int getTextureID() {
      return ((GLCrossVector)this.mGLOverlay).getFBOTextureId();
   }
}
