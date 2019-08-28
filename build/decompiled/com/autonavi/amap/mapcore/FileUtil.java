package com.autonavi.amap.mapcore;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.os.Environment;
import android.os.Build.VERSION;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.amap.api.mapcore.util.ht;
import com.amap.api.maps.MapsInitializer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class FileUtil {
   private static final char UNIX_SEPARATOR = '/';
   private static final char WINDOWS_SEPARATOR = '\\';
   private static final String TAG = "FileUtil";

   public FileUtil() {
   }

   public static void copy(Context var0, String var1, File var2) throws Exception {
      var2.delete();
      InputStream var3 = var0.getAssets().open(var1);
      byte[] var4 = new byte[var3.available()];
      var3.read(var4);
      var3.close();
      FileOutputStream var5 = new FileOutputStream(var2);
      var5.write(var4);
      var5.close();
   }

   public static boolean deleteFile(File var0) {
      if (var0 != null && var0.exists()) {
         if (var0.isDirectory()) {
            File[] var1 = var0.listFiles();
            if (var1 != null) {
               for(int var2 = 0; var2 < var1.length; ++var2) {
                  if (var1[var2].isFile()) {
                     if (!var1[var2].delete()) {
                        return false;
                     }
                  } else {
                     if (!deleteFile(var1[var2])) {
                        return false;
                     }

                     var1[var2].delete();
                  }
               }
            }
         }

         var0.delete();
         return true;
      } else {
         return false;
      }
   }

   public static String getMapBaseStorage(Context var0) {
      if (var0 == null) {
         return null;
      } else {
         int var1 = VERSION.SDK_INT;
         String var2 = "map_base_path";
         byte var3 = 18;
         if (var1 > var3) {
            var2 = "map_base_path_v44";
         }

         String var4 = "";
         SharedPreferences var5 = var0.getSharedPreferences("base_path", 0);
         if (MapsInitializer.sdcardDir != null && MapsInitializer.sdcardDir.trim().length() > 0) {
            var4 = MapsInitializer.sdcardDir + File.separatorChar;
         } else {
            var4 = var5.getString(var2, "");
         }

         byte var6 = 2;
         File var7;
         if (var4 != null && var4.length() > var6) {
            var7 = new File(var4);
            if (!var7.exists()) {
               var7.mkdir();
            }

            if (var7.isDirectory()) {
               if (checkCanWrite(var7)) {
                  return var4;
               }

               var4 = var0.getCacheDir().toString() + "/amap/";
               if (var4 != null && var4.length() > var6) {
                  var7 = new File(var4);
                  if (!var7.exists()) {
                     var7.mkdir();
                  }

                  if (var7.isDirectory()) {
                     return var4;
                  }
               }
            }
         }

         var4 = getExternalStroragePath(var0) + "/amap/";
         if (var4 != null && var4.length() > var6) {
            var7 = new File(var4);
            if (!var7.exists()) {
               var7.mkdir();
            }

            if (var7.isDirectory() && var7.canWrite()) {
               Editor var8 = var5.edit();
               var8.putString(var2, var4);
               var8.commit();
               createNoMediaFileIfNotExist(var4);
               return var4;
            }
         }

         var4 = var0.getCacheDir().toString() + "/amap/";
         if (var4 != null && var4.length() > var6) {
            var7 = new File(var4);
            if (!var7.exists()) {
               var7.mkdir();
            }

            if (var7.isDirectory()) {
               return var4;
            }
         }

         return var4;
      }
   }

   public static boolean checkCanWrite(File var0) {
      if (var0 == null) {
         return false;
      } else if (!var0.canWrite()) {
         return false;
      } else {
         File var1 = new File(var0, "amap.tmp");

         try {
            var1.createNewFile();
         } catch (IOException var4) {
            var4.printStackTrace();
            return false;
         }

         if (var1 != null && var1.exists()) {
            try {
               var1.delete();
               return true;
            } catch (Exception var3) {
               var3.printStackTrace();
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public static String getExternalStroragePath(Context var0) {
      int var1 = VERSION.SDK_INT;
      byte var2 = 12;
      if (var1 >= var2) {
         try {
            StorageManager var24 = (StorageManager)var0.getSystemService("storage");
            Method var25 = StorageManager.class.getMethod("getVolumeList");
            Method var5 = StorageManager.class.getMethod("getVolumeState", String.class);
            Object[] var6 = (Object[])((Object[])var25.invoke(var24));
            String var7 = null;
            String var8 = null;
            Boolean var9 = false;
            String var10 = "";
            String var11 = "";
            String var12 = "";
            String var13 = "";
            String var14 = null;
            Object[] var15 = var6;
            int var16 = var6.length;

            for(int var17 = 0; var17 < var16; ++var17) {
               Object var18 = var15[var17];
               Method var19 = var18.getClass().getMethod("getPath");
               Method var20 = var18.getClass().getMethod("isRemovable");
               var8 = (String)var19.invoke(var18);
               var7 = (String)var5.invoke(var24, var19.invoke(var18));
               var9 = (Boolean)var20.invoke(var18);
               if (TextUtils.isEmpty(var8) || !var8.toLowerCase().contains("private")) {
                  if (var9.booleanValue()) {
                     if (null != var8 && null != var7 && var7.equals("mounted")) {
                        if (var1 <= 18) {
                           var14 = var8;
                        } else {
                           try {
                              File[] var21 = var0.getExternalFilesDirs((String)null);
                              if (var21 != null) {
                                 if (var21.length > 1) {
                                    var14 = var21[1].getAbsolutePath();
                                 } else {
                                    var14 = var8;
                                 }
                              }
                           } catch (Exception var22) {
                              var14 = var8;
                           }
                        }
                        break;
                     }
                  } else {
                     var11 = var8;
                     var13 = var7;
                  }
               }
            }

            byte var26 = 18;
            if (var1 <= var26) {
               if (null == var14 && null != var11 && null != var13 && var13.equals("mounted")) {
                  var14 = var11;
               }

               return var14;
            }

            if (null != var11 && null != var13 && var13.equals("mounted")) {
               var14 = var11;
            }

            return var14;
         } catch (Throwable var23) {
            ;
         }
      }

      File var3 = null;
      boolean var4 = Environment.getExternalStorageState().equals("mounted");
      if (var4) {
         var3 = Environment.getExternalStorageDirectory();
         return var3.toString();
      } else {
         return null;
      }
   }

   public static void writeDatasToFile(String var0, byte[] var1) {
      ReentrantReadWriteLock var2 = new ReentrantReadWriteLock();
      WriteLock var3 = var2.writeLock();
      var3.lock();

      try {
         if (var1 != null && var1.length != 0) {
            File var4 = new File(var0);
            if (var4.exists()) {
               var4.delete();
            }

            var4.createNewFile();
            FileOutputStream var5 = new FileOutputStream(var4);
            var5.write(var1);
            var5.flush();
            var5.close();
            return;
         }
      } catch (Exception var10) {
         var10.printStackTrace();
         return;
      } finally {
         var3.unlock();
      }

   }

   public static byte[] readFileContents(String var0) {
      try {
         File var1 = new File(var0);
         if (!var1.exists()) {
            return null;
         } else {
            FileInputStream var2 = new FileInputStream(var1);
            byte[] var3 = new byte[1024];
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            boolean var5 = false;

            int var7;
            while((var7 = var2.read(var3)) != -1) {
               var4.write(var3, 0, var7);
            }

            var4.close();
            var2.close();
            return var4.toByteArray();
         }
      } catch (Throwable var6) {
         ht.c(var6, "FileUtil", "readFileContents");
         return null;
      }
   }

   public static void createNoMediaFileIfNotExist(String var0) {
   }

   public static void saveFile(String var0, String var1, boolean var2) {
      try {
         String var3 = Environment.getExternalStorageDirectory().getAbsolutePath();
         File var4 = new File(var3 + "/" + var1);
         if (!var4.exists()) {
            File var5 = new File(var4.getParent());
            var5.mkdirs();
            var4.createNewFile();
         }

         FileOutputStream var8 = new FileOutputStream(var4, var2);
         var8.write(var0.getBytes("utf-8"));
         var8.close();
      } catch (FileNotFoundException var6) {
         var6.printStackTrace();
      } catch (IOException var7) {
         var7.printStackTrace();
      }

   }

   public static byte[] readFileContentsFromAssets(Context var0, String var1) {
      AssetManager var2 = var0.getAssets();
      InputStream var3 = null;

      try {
         var3 = var2.open(var1);
         int var5 = var3.available();
         if (var5 == 0) {
            return null;
         } else {
            byte[] var6 = new byte[var5];

            for(int var7 = 0; var7 < var5; var7 += var3.read(var6, var7, var5 - var7)) {
               ;
            }

            var3.close();
            return var6;
         }
      } catch (IOException var8) {
         return null;
      } catch (OutOfMemoryError var9) {
         return null;
      }
   }

   public static String getName(String var0) {
      if (var0 == null) {
         return null;
      } else {
         int var1 = indexOfLastSeparator(var0);
         return var0.substring(var1 + 1);
      }
   }

   public static int indexOfLastSeparator(String var0) {
      if (var0 == null) {
         return -1;
      } else {
         int var1 = var0.lastIndexOf(47);
         int var2 = var0.lastIndexOf(92);
         return Math.max(var1, var2);
      }
   }
}
