package com.autonavi.amap.mapcore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.amap.api.mapcore.util.fi;
import com.amap.api.mapcore.util.gt;
import com.amap.api.mapcore.util.ht;
import com.amap.api.mapcore.util.is;
import com.amap.api.mapcore.util.iu;
import com.amap.api.mapcore.util.iw;
import com.amap.api.mapcore.util.kj;
import com.autonavi.ae.gmap.GLMapEngine$InitParam;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@SuppressLint({"NewApi"})
public class AeUtil {
   public static final boolean IS_AE = true;
   public static final String ROOTPATH = "/amap/";
   public static final String ROOT_DATA_PATH_OLD_NAME = "data";
   public static final String ROOT_DATA_PATH_NAME = "data_v6";
   public static final String CONFIGNAME = "GNaviConfig.xml";
   public static final String RESZIPNAME = "res.zip";
   public static final String SO_FILENAME = "AMapSDK_MAP_v6_9_2";
   public static final String SO_FILENAME_NAVI = "AMapSDK_NAVI_v6_5_0";
   private static final int BUFFER = 1024;

   public AeUtil() {
   }

   public static void loadLib(Context var0) {
      try {
         iu var1 = iu.a(var0);
         boolean var2 = iw.a().a(var0, fi.e(), var1.d(), "AMapSDK_MAP_v6_9_2");
         if (var2 && is.a().a(var0, fi.e())) {
            MsgProcessor var3 = new MsgProcessor();
            var3.nativeInitMsg();
         }
      } catch (Throwable var4) {
         ht.c(var4, "AeUtil", "loadLib");
      }

   }

   public static GLMapEngine$InitParam initResource(Context var0) {
      String var1 = FileUtil.getMapBaseStorage(var0);
      String var2 = var1 + "/" + "data_v6" + "/";
      File var3 = new File(var1);
      if (!var3.exists()) {
         var3.mkdir();
      }

      File var4 = new File(var2);
      if (!var4.exists()) {
         var4.mkdir();
      }

      if (Looper.myLooper() == Looper.getMainLooper()) {
         try {
            kj.a(1).a(new AeUtil$1(var1, var0));
         } catch (gt var9) {
            var9.printStackTrace();
         }
      } else {
         loadEngineRes(var1, var0);
      }

      GLMapEngine$InitParam var5 = new GLMapEngine$InitParam();
      byte[] var6 = FileUtil.readFileContentsFromAssets(var0, "ae/GNaviConfig.xml");
      var5.mRootPath = var1;
      if (var6 != null) {
         try {
            var5.mConfigContent = new String(var6, "utf-8");
            if (!var5.mConfigContent.contains("data_v6")) {
               throw new Exception("GNaviConfig.xml 和数据目录data_v6不匹配");
            }
         } catch (Throwable var8) {
            var8.printStackTrace();
         }
      }

      var5.mOfflineDataPath = var2 + "/" + "map/";
      var5.mP3dCrossPath = var2;
      return var5;
   }

   private static void loadEngineRes(String var0, Context var1) {
      File var2 = new File(var0, "res");
      if ((!var2.exists() || !var2.isDirectory()) && var2.mkdirs()) {
         ;
      }

      boolean var3 = checkEngineRes(var2);
      if (!var3) {
         InputStream var4 = null;

         try {
            var4 = var1.getAssets().open("ae/res.zip");
            decompress(var4, var2.getAbsolutePath());
         } catch (Exception var17) {
            var17.printStackTrace();
         } catch (OutOfMemoryError var18) {
            var18.printStackTrace();
         } finally {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (IOException var16) {
                  var16.printStackTrace();
               }
            }

         }
      }

   }

   private static boolean checkEngineRes(File var0) {
      File[] var1 = var0.listFiles();
      return null != var1 && var1.length >= 2;
   }

   public static void decompress(InputStream var0, String var1) throws Exception {
      decompress(var0, var1, 0L, (AeUtil$ZipCompressProgressListener)null);
   }

   private static void decompress(InputStream var0, String var1, long var2, AeUtil$ZipCompressProgressListener var4) throws Exception {
      CheckedInputStream var5 = new CheckedInputStream(var0, new CRC32());
      ZipInputStream var6 = new ZipInputStream(var5);
      decompress((File)null, new File(var1), var6, var2, var4, (AeUtil$UnZipFileBrake)null);
      var6.close();
      var5.close();
   }

   private static void decompress(File var0, File var1, ZipInputStream var2, long var3, AeUtil$ZipCompressProgressListener var5, AeUtil$UnZipFileBrake var6) throws Exception {
      ZipEntry var7 = null;
      int var8 = 0;
      boolean var9 = false;

      boolean var10;
      for(var10 = false; (var7 = var2.getNextEntry()) != null; var2.closeEntry()) {
         if (var6 != null && var6.mIsAborted) {
            var2.closeEntry();
            return;
         }

         String var11 = var7.getName();
         if (TextUtils.isEmpty(var11) || var11.contains("../")) {
            var10 = true;
            break;
         }

         String var12 = var1.getPath() + File.separator + var11;
         File var13 = new File(var12);
         fileProber(var13);
         if (var7.isDirectory()) {
            var13.mkdirs();
         } else {
            int var15 = decompressFile(var13, var2, (long)var8, var3, var5, var6);
            var8 += var15;
         }
      }

      if (var10) {
         try {
            if (null != var0) {
               var0.delete();
            }
         } catch (Exception var14) {
            ;
         }
      }

   }

   private static void fileProber(File var0) {
      File var1 = var0.getParentFile();
      if (!var1.exists()) {
         fileProber(var1);
         var1.mkdir();
      }

   }

   private static int decompressFile(File var0, ZipInputStream var1, long var2, long var4, AeUtil$ZipCompressProgressListener var6, AeUtil$UnZipFileBrake var7) throws Exception {
      int var8 = 0;
      BufferedOutputStream var9 = new BufferedOutputStream(new FileOutputStream(var0));
      byte[] var11 = new byte[1024];

      while(true) {
         long var12;
         do {
            do {
               do {
                  int var10;
                  if ((var10 = var1.read(var11, 0, 1024)) == -1) {
                     var9.close();
                     return var8;
                  }

                  if (var7 != null && var7.mIsAborted) {
                     var9.close();
                     return var8;
                  }

                  var9.write(var11, 0, var10);
                  var8 += var10;
               } while(var4 <= 0L);
            } while(var6 == null);

            var12 = (var2 + (long)var8) * 100L / var4;
         } while(var7 != null && var7.mIsAborted);

         var6.onFinishProgress(var12);
      }
   }

   public static void readAssetsFileAndSave(String var0, String var1, Context var2) {
      if (!TextUtils.isEmpty(var0)) {
         InputStream var3 = null;
         FileOutputStream var4 = null;

         try {
            var3 = var2.getAssets().open(var0);
            File var5 = new File(var1);
            if (var5.exists()) {
               var5.delete();
            }

            var5.createNewFile();
            var4 = new FileOutputStream(var5);
            short var6 = 1024;
            byte[] var7 = new byte[var6];

            int var8;
            while((var8 = var3.read(var7, 0, var6)) > 0) {
               var4.write(var7, 0, var8);
            }
         } catch (Throwable var22) {
            var22.printStackTrace();
         } finally {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (IOException var21) {
                  var21.printStackTrace();
               }
            }

            if (var4 != null) {
               try {
                  var4.close();
               } catch (IOException var20) {
                  var20.printStackTrace();
               }
            }

         }

      }
   }
}
