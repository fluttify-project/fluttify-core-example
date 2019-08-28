package com.amap.api.mapcore.util;

public class hp {
   private final int a = 37;
   private int b = 0;

   public hp() {
      this.b = 17;
   }

   public hp a(boolean var1) {
      this.b = this.b * this.a + (var1 ? 0 : 1);
      return this;
   }

   public hp a(boolean[] var1) {
      if (var1 == null) {
         this.b *= this.a;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.a(var1[var2]);
         }
      }

      return this;
   }

   public hp a(byte var1) {
      this.b = this.b * this.a + var1;
      return this;
   }

   public hp a(byte[] var1) {
      if (var1 == null) {
         this.b *= this.a;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.a(var1[var2]);
         }
      }

      return this;
   }

   public hp a(char var1) {
      this.b = this.b * this.a + var1;
      return this;
   }

   public hp a(char[] var1) {
      if (var1 == null) {
         this.b *= this.a;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.a(var1[var2]);
         }
      }

      return this;
   }

   public hp a(double var1) {
      return this.a(Double.doubleToLongBits(var1));
   }

   public hp a(double[] var1) {
      if (var1 == null) {
         this.b *= this.a;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.a(var1[var2]);
         }
      }

      return this;
   }

   public hp a(float var1) {
      this.b = this.b * this.a + Float.floatToIntBits(var1);
      return this;
   }

   public hp a(float[] var1) {
      if (var1 == null) {
         this.b *= this.a;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.a(var1[var2]);
         }
      }

      return this;
   }

   public hp a(int var1) {
      this.b = this.b * this.a + var1;
      return this;
   }

   public hp a(int[] var1) {
      if (var1 == null) {
         this.b *= this.a;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.a(var1[var2]);
         }
      }

      return this;
   }

   public hp a(long var1) {
      this.b = this.b * this.a + (int)(var1 ^ var1 >> 32);
      return this;
   }

   public hp a(long[] var1) {
      if (var1 == null) {
         this.b *= this.a;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.a(var1[var2]);
         }
      }

      return this;
   }

   public hp a(Object var1) {
      if (var1 == null) {
         this.b *= this.a;
      } else if (var1.getClass().isArray()) {
         if (var1 instanceof long[]) {
            this.a((long[])((long[])var1));
         } else if (var1 instanceof int[]) {
            this.a((int[])((int[])var1));
         } else if (var1 instanceof short[]) {
            this.a((short[])((short[])var1));
         } else if (var1 instanceof char[]) {
            this.a((char[])((char[])var1));
         } else if (var1 instanceof byte[]) {
            this.a((byte[])((byte[])var1));
         } else if (var1 instanceof double[]) {
            this.a((double[])((double[])var1));
         } else if (var1 instanceof float[]) {
            this.a((float[])((float[])var1));
         } else if (var1 instanceof boolean[]) {
            this.a((boolean[])((boolean[])var1));
         } else {
            this.a((Object[])((Object[])var1));
         }
      } else {
         this.b = this.b * this.a + var1.hashCode();
      }

      return this;
   }

   public hp a(Object[] var1) {
      if (var1 == null) {
         this.b *= this.a;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.a(var1[var2]);
         }
      }

      return this;
   }

   public hp a(short var1) {
      this.b = this.b * this.a + var1;
      return this;
   }

   public hp a(short[] var1) {
      if (var1 == null) {
         this.b *= this.a;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.a(var1[var2]);
         }
      }

      return this;
   }

   public int a() {
      return this.b;
   }

   public int hashCode() {
      return this.a();
   }
}
