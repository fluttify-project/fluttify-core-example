package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.HashMap;

public class fm {
   private static final CompressFormat a;
   private iy b;
   private eu<String, Bitmap> c;
   private fm$a d;
   private final Object e = new Object();
   private boolean f = true;
   private HashMap<String, WeakReference<Bitmap>> g;

   private fm(fm$a var1) {
      this.b(var1);
   }

   public static fm a(fm$a var0) {
      fm var1 = new fm(var0);
      return var1;
   }

   private void b(fm$a var1) {
      this.d = var1;
      if (this.d.f) {
         if (fn.a()) {
            this.g = new HashMap(64);
         }

         this.c = new fm$1(this, this.d.a);
      }

      if (var1.h) {
         this.a();
      }

   }

   public void a() {
      Object var1 = this.e;
      synchronized(this.e) {
         if (this.b == null || this.b.d()) {
            File var2 = this.d.c;
            if (this.d.g && var2 != null) {
               try {
                  if (var2.exists()) {
                     if (this.d.i) {
                        this.b(var2);
                        var2.mkdir();
                     }
                  } else {
                     var2.mkdirs();
                  }
               } catch (Throwable var6) {
                  ;
               }

               if (a(var2) > this.d.b) {
                  try {
                     this.b = iy.a(var2, 1, 1, this.d.b);
                  } catch (Throwable var5) {
                     this.d.c = null;
                  }
               }
            }
         }

         this.f = false;
         this.e.notifyAll();
      }
   }

   private void b(File var1) throws IOException {
      File[] var2 = var1.listFiles();
      if (var2 == null) {
         throw new IOException("not a readable directory: " + var1);
      } else {
         File[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            if (var6.isDirectory()) {
               this.b(var6);
            }

            if (!var6.delete()) {
               throw new IOException("failed to delete file: " + var6);
            }
         }

      }
   }

   public void a(String var1, Bitmap var2) {
      if (var1 != null && var2 != null && !var2.isRecycled()) {
         if (this.c != null) {
            this.c.a(var1, var2);
         }

         Object var3 = this.e;
         synchronized(this.e) {
            if (this.b != null) {
               String var4 = c(var1);
               OutputStream var5 = null;

               try {
                  iy$b var6 = this.b.a(var4);
                  if (var6 == null) {
                     iy$a var7 = this.b.b(var4);
                     if (var7 != null) {
                        var5 = var7.a(0);
                        var2.compress(this.d.d, this.d.e, var5);
                        var7.a();
                        var5.close();
                     }
                  } else {
                     var6.a(0).close();
                  }
               } catch (Throwable var19) {
                  ;
               } finally {
                  try {
                     if (var5 != null) {
                        var5.close();
                     }
                  } catch (Throwable var18) {
                     ;
                  }

               }
            }

         }
      }
   }

   public Bitmap a(String var1) {
      Bitmap var2 = null;
      if (fi.c() && this.g != null) {
         WeakReference var3 = (WeakReference)this.g.get(var1);
         if (var3 != null) {
            var2 = (Bitmap)var3.get();
            if (var2 == null || var2.isRecycled()) {
               var2 = null;
            }

            this.g.remove(var1);
         }
      }

      if (var2 == null && this.c != null) {
         var2 = (Bitmap)this.c.a(var1);
      }

      return var2 != null && !var2.isRecycled() ? var2 : null;
   }

   public Bitmap b(String var1) {
      String var2 = c(var1);
      Bitmap var3 = null;
      Object var4 = this.e;
      synchronized(this.e) {
         while(this.f) {
            try {
               this.e.wait();
            } catch (Throwable var22) {
               ;
            }
         }

         if (this.b != null) {
            InputStream var5 = null;

            try {
               iy$b var6 = this.b.a(var2);
               if (var6 != null) {
                  var5 = var6.a(0);
                  if (var5 != null) {
                     FileDescriptor var7 = ((FileInputStream)var5).getFD();
                     var3 = fk.a(var7, Integer.MAX_VALUE, Integer.MAX_VALUE, this);
                  }
               }
            } catch (Throwable var20) {
               ;
            } finally {
               try {
                  if (var5 != null) {
                     var5.close();
                  }
               } catch (Throwable var19) {
                  ;
               }

            }
         }

         return var3;
      }
   }

   public void b() {
      if (fi.c() && this.g != null) {
         this.g.clear();
      }

      if (this.c != null) {
         this.c.a();
      }

      Object var1 = this.e;
      synchronized(this.e) {
         this.f = true;
         if (this.b != null && !this.b.d()) {
            try {
               this.b.close();
               this.b(a(z.a, this.d.j, (String)null));
            } catch (Throwable var4) {
               ;
            }

            this.b = null;
            this.a();
         }

      }
   }

   public void c() {
      Object var1 = this.e;
      synchronized(this.e) {
         if (this.b != null) {
            try {
               this.b.e();
            } catch (Throwable var4) {
               ;
            }
         }

      }
   }

   public void a(boolean var1) {
      if (fi.c() && this.g != null) {
         this.g.clear();
      }

      if (this.c != null) {
         this.c.a();
      }

      Object var2 = this.e;
      synchronized(this.e) {
         if (this.b != null) {
            try {
               if (!this.b.d()) {
                  if (var1) {
                     this.b.f();
                  } else {
                     this.b.close();
                  }

                  this.b = null;
               }
            } catch (Throwable var5) {
               ;
            }
         }

      }
   }

   public static File a(Context var0, String var1, String var2) {
      File var3 = a(var0);
      String var4 = ("mounted".equals(Environment.getExternalStorageState()) || !d()) && var3 != null ? var3.getPath() : var0.getCacheDir().getPath();
      StringBuilder var5 = new StringBuilder();
      var5.append(var4).append(File.separator).append(var1);
      if (!TextUtils.isEmpty(var2)) {
         var5.append(File.separator).append(var2);
      }

      return new File(var5.toString());
   }

   public static String c(String var0) {
      String var1;
      try {
         MessageDigest var2 = MessageDigest.getInstance("MD5");
         var2.update(var0.getBytes("utf-8"));
         var1 = a(var2.digest());
      } catch (Throwable var3) {
         var1 = String.valueOf(var0.hashCode());
      }

      return var1;
   }

   private static String a(byte[] var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = Integer.toHexString(255 & var0[var2]);
         if (var3.length() == 1) {
            var1.append('0');
         }

         var1.append(var3);
      }

      return var1.toString();
   }

   public static int a(Bitmap var0) {
      return fi.d() ? var0.getByteCount() : var0.getRowBytes() * var0.getHeight();
   }

   public static boolean d() {
      return fi.b() ? Environment.isExternalStorageRemovable() : true;
   }

   public static File a(Context var0) {
      try {
         if (fi.a()) {
            return var0.getExternalCacheDir();
         } else {
            String var1 = "/Android/data/" + var0.getPackageName() + "/cache/";
            return new File(Environment.getExternalStorageDirectory().getPath() + var1);
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static long a(File var0) {
      if (fi.b()) {
         return var0.getUsableSpace();
      } else {
         StatFs var1 = new StatFs(var0.getPath());
         return (long)var1.getBlockSize() * (long)var1.getAvailableBlocks();
      }
   }

   static {
      a = CompressFormat.PNG;
   }
}
