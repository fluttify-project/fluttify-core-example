package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import java.io.File;

public class fm$a {
   public int a = 5242880;
   public long b = 10485760L;
   public File c;
   public CompressFormat d = fm.e();
   public int e = 100;
   public boolean f = true;
   public boolean g = true;
   public boolean h = false;
   public boolean i = true;
   public String j = null;

   public fm$a(Context var1, String var2) {
      this.j = var2;
      this.c = fm.a(var1, var2, (String)null);
   }

   public fm$a(Context var1, String var2, String var3) {
      this.j = var2;
      this.c = fm.a(var1, var2, var3);
   }

   public void a(int var1) {
      this.a = var1;
   }

   public void a(long var1) {
      if (var1 <= 0L) {
         this.g = false;
      }

      this.b = var1;
   }

   public void a(String var1) {
      this.c = new File(var1);
   }

   public void a(boolean var1) {
      this.f = var1;
   }

   public void b(boolean var1) {
      this.g = var1;
   }

   public void b(String var1) {
      this.c = fm.a(z.a, this.j, var1);
   }
}
