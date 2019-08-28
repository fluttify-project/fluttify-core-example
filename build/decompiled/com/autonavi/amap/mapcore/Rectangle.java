package com.autonavi.amap.mapcore;

import android.graphics.Rect;

public class Rectangle {
   public float left;
   public float right;
   public float bottom;
   public float top;
   public Rect rect = new Rect();
   private int beyond180Mode = 0;
   public IPoint[] clipRect = null;
   public FPoint[] clipMapRect = null;

   public int getBeyond180Mode() {
      return this.beyond180Mode;
   }

   public Rectangle() {
   }

   public Rectangle(Rect var1, int var2, int var3) {
      this.rect = var1;
      if (var1 != null) {
         this.updateRect(var1, var2, var3);
         this.updateClipRect();
         this.updateClipMapRect(var1.centerX(), var1.centerY());
      }

   }

   public void updateRect(Rect var1, int var2, int var3) {
      if (var1 != null) {
         this.rect = var1;
         this.rect.inset(-var1.width() / 8, -var1.height() / 8);
         float var4 = 100000.0F;
         if ((float)this.rect.left / var4 * ((float)this.rect.right / var4) < 0.0F) {
            this.beyond180Mode = -1;
         } else if (this.rect.right > 268435456) {
            this.beyond180Mode = 1;
         } else {
            this.beyond180Mode = 0;
         }

         this.updateClipRect();
         this.updateClipMapRect(var2, var3);
      }

   }

   private void updateClipRect() {
      if (this.clipRect == null) {
         this.clipRect = new IPoint[4];
         this.clipRect[0] = IPoint.obtain(0, 0);
         this.clipRect[1] = IPoint.obtain(0, 0);
         this.clipRect[2] = IPoint.obtain(0, 0);
         this.clipRect[3] = IPoint.obtain(0, 0);
      }

      if (this.rect != null) {
         this.clipRect[0].x = this.rect.left;
         this.clipRect[0].y = this.rect.top;
         this.clipRect[1].x = this.rect.right;
         this.clipRect[1].y = this.rect.top;
         this.clipRect[2].x = this.rect.right;
         this.clipRect[2].y = this.rect.bottom;
         this.clipRect[3].x = this.rect.left;
         this.clipRect[3].y = this.rect.bottom;
      }

   }

   private void updateClipMapRect(int var1, int var2) {
      if (this.clipMapRect == null) {
         this.clipMapRect = new FPoint[4];
         this.clipMapRect[0] = FPoint.obtain(0.0F, 0.0F);
         this.clipMapRect[1] = FPoint.obtain(0.0F, 0.0F);
         this.clipMapRect[2] = FPoint.obtain(0.0F, 0.0F);
         this.clipMapRect[3] = FPoint.obtain(0.0F, 0.0F);
      }

      if (this.rect != null) {
         this.clipMapRect[0].x = (float)(this.rect.left - var1);
         this.clipMapRect[0].y = (float)(this.rect.top - var2);
         this.clipMapRect[1].x = (float)(this.rect.right - var1);
         this.clipMapRect[1].y = (float)(this.rect.top - var2);
         this.clipMapRect[2].x = (float)(this.rect.right - var1);
         this.clipMapRect[2].y = (float)(this.rect.bottom - var2);
         this.clipMapRect[3].x = (float)(this.rect.left - var1);
         this.clipMapRect[3].y = (float)(this.rect.bottom - var2);
      }

   }

   public Rect getRect() {
      return this.rect;
   }

   public IPoint[] getClipRect() {
      return this.clipRect;
   }

   public FPoint[] getClipMapRect() {
      return this.clipMapRect;
   }

   public boolean contains(int var1, int var2) {
      if (this.rect != null) {
         boolean var3 = this.rect.contains(var1, var2);
         if (var3) {
            return true;
         }

         if (this.beyond180Mode != 0) {
            var3 = this.rect.contains(var1 - 268435456, var2);
            if (var3) {
               return true;
            }

            var3 = this.rect.contains(var1 + 268435456, var2);
            if (var3) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean contains(IPoint var1) {
      return var1 == null ? false : this.contains(var1.x, var1.y);
   }

   public boolean contains(Rect var1) {
      return var1 == null ? false : this.rect.contains(var1);
   }

   public boolean isOverlap(Rect var1) {
      if (this.rect != null && var1 != null) {
         return this.rect.left + this.rect.width() > var1.left && var1.left + var1.width() > this.rect.left && this.rect.top + this.rect.height() > var1.top && var1.top + var1.height() > this.rect.top;
      } else {
         return false;
      }
   }

   public boolean isOverlap(int var1, int var2, int var3, int var4) {
      if (this.rect == null) {
         return false;
      } else {
         return this.rect.left + this.rect.width() > var1 && var1 + var3 > this.rect.left && this.rect.top + this.rect.height() > var2 && var2 + var4 > this.rect.top;
      }
   }

   public Rectangle(float var1, float var2, float var3, float var4) {
      if (var1 < var2 && var4 > var3) {
         this.left = var1;
         this.right = var2;
         this.top = var4;
         this.bottom = var3;
      }
   }
}
