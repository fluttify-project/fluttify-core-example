package com.autonavi.amap.mapcore.tools;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.text.TextPaint;
import java.nio.ByteBuffer;

public class TextTextureGenerator {
   public static final int CHAR_MAX = 256;
   public static final int MIN_DIFF_SIZE = 4;
   private int textFontsize = -1;
   private int textFontsizeTrue = -1;
   static final int AN_LABEL_MAXCHARINLINE = 7;
   static final int AN_LABEL_MULITYLINE_SPAN = 2;
   private static final int ALIGNCENTER = 51;
   private static final int ALIGNLEFT = 49;
   private static final int ALIGNRIGHT = 50;
   private float baseLine = 0.0F;
   private float startX = 0.0F;
   private Paint textPaint = null;

   public static int getNearstSize2N(int var0) {
      int var1;
      for(var1 = 1; var0 > var1; var1 *= 2) {
         ;
      }

      return var1;
   }

   public TextTextureGenerator() {
      this.createTextParam();
   }

   private void createTextParam() {
      this.textFontsizeTrue = this.textFontsize - 2;
      this.textPaint = newPaint((String)null, this.textFontsizeTrue, 49);
      float var1 = (float)(this.textFontsize - this.textFontsizeTrue) / 2.0F;
      this.startX = var1;
      float var2 = 7.3242188F;
      float var3 = -27.832031F;

      try {
         FontMetrics var4 = this.textPaint.getFontMetrics();
         var2 = var4.descent;
         var3 = var4.ascent;
      } catch (Exception var5) {
         ;
      }

      this.baseLine = ((float)this.textFontsizeTrue - (var2 + var3)) / 2.0F + var1 + 0.5F;
   }

   public byte[] getTextPixelBuffer(int var1, int var2) {
      if (this.textFontsize != var2) {
         this.textFontsize = var2;
         this.createTextParam();
      }

      try {
         char[] var3 = new char[]{(char)var1};
         float var6 = this.baseLine;
         Bitmap var4 = Bitmap.createBitmap(this.textFontsize, this.textFontsize, Config.ALPHA_8);
         Canvas var5 = new Canvas(var4);
         byte[] var7 = new byte[this.textFontsize * this.textFontsize];
         ByteBuffer var8 = ByteBuffer.wrap(var7);
         float var9 = this.textPaint.measureText(String.valueOf((char)var1));
         if (var3[0] > 0 && var3[0] < 256) {
            --var6;
         }

         Align var10 = this.textPaint.getTextAlign();
         float var11 = var9 - (float)this.textFontsizeTrue;
         if (var10 != Align.CENTER && var11 >= 4.0F) {
            this.textPaint.setTextAlign(Align.CENTER);
            this.textPaint.setTextSize((float)this.textFontsizeTrue - var11);
            var5.drawText(var3, 0, 1, ((float)this.textFontsizeTrue - var11) / 2.0F, var6, this.textPaint);
            this.textPaint.setTextAlign(var10);
         } else {
            var5.drawText(var3, 0, 1, this.startX, var6, this.textPaint);
         }

         var4.copyPixelsToBuffer(var8);
         var4.recycle();
         var4 = null;
         var8 = null;
         return var7;
      } catch (OutOfMemoryError var12) {
         ;
      } catch (Exception var13) {
         ;
      }

      return null;
   }

   public byte[] getCharsWidths(int[] var1) {
      int var2 = var1.length;
      byte[] var3 = new byte[var2];
      float[] var4 = new float[1];

      for(int var5 = 0; var5 < var2; ++var5) {
         var4[0] = this.textPaint.measureText((char)var1[var5] + "");
         var3[var5] = (byte)((int)(var4[0] + (float)(this.textFontsize - this.textFontsizeTrue)));
      }

      return var3;
   }

   private static Paint newPaint(String var0, int var1, int var2) {
      TextPaint var3 = new TextPaint();
      var3.setColor(-1);
      var3.setTextSize((float)var1);
      var3.setAntiAlias(true);
      var3.setFilterBitmap(true);
      var3.setTypeface(Typeface.DEFAULT);
      switch(var2) {
      case 49:
         var3.setTextAlign(Align.LEFT);
         break;
      case 50:
         var3.setTextAlign(Align.RIGHT);
         break;
      case 51:
         var3.setTextAlign(Align.CENTER);
         break;
      default:
         var3.setTextAlign(Align.LEFT);
      }

      return var3;
   }

   public static float getFontlength(Paint var0, String var1) {
      return var0.measureText(var1);
   }

   public static float getFontHeight(Paint var0) {
      FontMetrics var1 = var0.getFontMetrics();
      return var1.descent - var1.ascent;
   }
}
