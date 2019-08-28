package com.amap.api.maps.model;

import android.graphics.Typeface;
import com.autonavi.amap.mapcore.interfaces.IText;

public final class Text {
   public static final int ALIGN_LEFT = 1;
   public static final int ALIGN_RIGHT = 2;
   public static final int ALIGN_CENTER_HORIZONTAL = 4;
   public static final int ALIGN_TOP = 8;
   public static final int ALIGN_BOTTOM = 16;
   public static final int ALIGN_CENTER_VERTICAL = 32;
   private IText textDelegate;

   public Text(IText var1) {
      this.textDelegate = var1;
   }

   public void remove() {
      try {
         this.textDelegate.remove();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void destroy() {
      try {
         if (this.textDelegate != null) {
            this.textDelegate.destroy(true);
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public String getId() {
      try {
         return this.textDelegate.getId();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setPosition(LatLng var1) {
      try {
         this.textDelegate.setPosition(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public LatLng getPosition() {
      try {
         return this.textDelegate.getPosition();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setText(String var1) {
      try {
         this.textDelegate.setText(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public String getText() {
      try {
         return this.textDelegate.getText();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setBackgroundColor(int var1) {
      try {
         this.textDelegate.setBackgroundColor(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getBackgroundColor() {
      try {
         return this.textDelegate.getBackgroundColor();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setFontColor(int var1) {
      try {
         this.textDelegate.setFontColor(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getFontColor() {
      try {
         return this.textDelegate.getFontColor();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setFontSize(int var1) {
      try {
         this.textDelegate.setFontSize(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public int getFontSize() {
      try {
         return this.textDelegate.getFontSize();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setTypeface(Typeface var1) {
      try {
         this.textDelegate.setTypeface(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public Typeface getTypeface() {
      try {
         return this.textDelegate.getTypeface();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public void setAlign(int var1, int var2) {
      try {
         this.textDelegate.setAlign(var1, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public int getAlignX() {
      try {
         return this.textDelegate.getAlignX();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public int getAlignY() {
      try {
         return this.textDelegate.getAlignY();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return 0;
      }
   }

   public void setVisible(boolean var1) {
      try {
         this.textDelegate.setVisible(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean isVisible() {
      try {
         return this.textDelegate.isVisible();
      } catch (Throwable var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public boolean equals(Object var1) {
      try {
         return !(var1 instanceof Text) ? false : this.textDelegate.equalsRemote(((Text)var1).textDelegate);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return false;
      }
   }

   public int hashCode() {
      return this.textDelegate.hashCodeRemote();
   }

   public void setObject(Object var1) {
      this.textDelegate.setObject(var1);
   }

   public Object getObject() {
      return this.textDelegate.getObject();
   }

   public void setRotate(float var1) {
      try {
         this.textDelegate.setRotateAngle(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public float getRotate() {
      return this.textDelegate.getRotateAngle();
   }

   public void setZIndex(float var1) {
      this.textDelegate.setZIndex(var1);
   }

   public float getZIndex() {
      return this.textDelegate.getZIndex();
   }
}
