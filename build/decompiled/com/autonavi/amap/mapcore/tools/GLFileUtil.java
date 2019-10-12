package com.autonavi.amap.mapcore.tools;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class GLFileUtil {
   public GLFileUtil() {
   }

   public static void copy(Context var0, String var1, File var2) throws Exception {
      var2.delete();
      InputStream var3 = var0.getAssets().open(var1);
      byte[] var4 = new byte[var3.available()];

      try {
         var3.read(var4);
      } finally {
         closeQuietly(var3);
      }

      FileOutputStream var5 = new FileOutputStream(var2);

      try {
         var5.write(var4);
      } finally {
         closeQuietly(var5);
      }

   }

   public static void deleteFile(File var0) {
      if (var0 != null) {
         File[] var1 = var0.listFiles();
         if (var0.isDirectory() && var1 != null) {
            int var2 = 0;

            for(int var3 = var1.length; var2 < var3; ++var2) {
               deleteFile(var1[var2]);
            }
         }

         var0.delete();
      }
   }

   public static void writeDatasToFile(String var0, byte[] var1) {
      ReentrantReadWriteLock var2 = new ReentrantReadWriteLock();
      WriteLock var3 = var2.writeLock();
      var3.lock();
      FileOutputStream var4 = null;

      try {
         if (var1 != null && var1.length != 0) {
            File var5 = new File(var0);
            File var6 = var5.getParentFile();
            if (!var6.exists()) {
               var6.mkdirs();
            }

            if (var5.exists()) {
               var5.delete();
            }

            var5.createNewFile();
            var4 = new FileOutputStream(var5);
            var4.write(var1);
            var4.flush();
            return;
         }
      } catch (Exception var11) {
         return;
      } finally {
         var3.unlock();
         closeQuietly(var4);
      }

   }

   public static void closeQuietly(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (Exception var2) {
            ;
         }
      }

   }

   public static byte[] readFileContents(String var0) {
      FileInputStream var1 = null;

      Object var3;
      try {
         File var2 = new File(var0);
         if (var2.exists()) {
            var1 = new FileInputStream(var2);
            byte[] var13 = new byte[1024];
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            boolean var5 = false;

            int var14;
            while((var14 = var1.read(var13)) != -1) {
               var4.write(var13, 0, var14);
            }

            var4.close();
            byte[] var6 = var4.toByteArray();
            return var6;
         }

         var3 = null;
      } catch (Exception var11) {
         return null;
      } finally {
         closeQuietly(var1);
      }

      return (byte[])var3;
   }

   public static File getCacheDir(Context var0) {
      File var1 = var0.getCacheDir();
      if (var1 == null) {
         var1 = var0.getDir("cache", 0);
      }

      if (var1 == null) {
         var1 = new File("/data/data/" + var0.getPackageName() + "/app_cache");
      }

      if (!var1.exists()) {
         var1.mkdirs();
      }

      return var1;
   }

   public static File getFilesDir(Context var0) {
      File var1 = var0.getFilesDir();
      if (var1 == null) {
         var1 = var0.getDir("files", 0);
      }

      if (var1 == null) {
         var1 = new File("/data/data/" + var0.getPackageName() + "/app_files");
      }

      if (!var1.exists()) {
         var1.mkdirs();
      }

      return var1;
   }
}
