package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.os.Handler;
import com.amap.api.mapcore.util.bg;
import com.amap.api.mapcore.util.bg$a;
import com.amap.api.mapcore.util.bk;
import com.amap.api.mapcore.util.fi;
import com.amap.api.mapcore.util.hb;
import com.amap.api.mapcore.util.ht;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapException;
import java.util.ArrayList;
import java.util.Iterator;

public final class OfflineMapManager {
   private Context c;
   private OfflineMapManager$OfflineMapDownloadListener d;
   private OfflineMapManager$OfflineLoadedListener e;
   private Handler f;
   private Handler g;
   bk a;
   bg b;

   public OfflineMapManager(Context var1, OfflineMapManager$OfflineMapDownloadListener var2) {
      this.d = var2;
      this.c = var1.getApplicationContext();
      this.f = new Handler(this.c.getMainLooper());
      this.g = new Handler(this.c.getMainLooper());
      this.a(var1);
      hb.a().a(this.c);
   }

   public OfflineMapManager(Context var1, OfflineMapManager$OfflineMapDownloadListener var2, AMap var3) {
      this.d = var2;
      this.c = var1.getApplicationContext();
      this.f = new Handler(this.c.getMainLooper());
      this.g = new Handler(this.c.getMainLooper());

      try {
         this.a(var1);
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   private void a(Context var1) {
      this.c = var1.getApplicationContext();
      bg.b = false;
      this.b = bg.a(this.c);
      this.b.a((bg$a)(new OfflineMapManager$1(this)));

      try {
         this.b.a();
         this.a = this.b.f;
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void downloadByCityCode(String var1) throws AMapException {
      try {
         this.b.e(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void downloadByCityName(String var1) throws AMapException {
      try {
         this.b.d(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void downloadByProvinceName(String var1) throws AMapException {
      try {
         this.a();
         OfflineMapProvince var2 = null;
         var2 = this.getItemByProvinceName(var1);
         if (var2 == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
         }

         ArrayList var3 = var2.getCityList();
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            OfflineMapCity var5 = (OfflineMapCity)var4.next();
            String var6 = var5.getCity();
            this.g.post(new OfflineMapManager$2(this, var6));
         }
      } catch (Throwable var7) {
         if (var7 instanceof AMapException) {
            throw (AMapException)var7;
         }

         ht.c(var7, "OfflineMapManager", "downloadByProvinceName");
      }

   }

   public void remove(String var1) {
      try {
         if (this.b.b(var1)) {
            this.b.c(var1);
         } else {
            OfflineMapProvince var2 = this.a.c(var1);
            if (var2 == null || var2.getCityList() == null) {
               if (this.d != null) {
                  this.d.onRemove(false, var1, "没有该城市");
               }

               return;
            }

            ArrayList var3 = var2.getCityList();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               OfflineMapCity var5 = (OfflineMapCity)var4.next();
               String var6 = var5.getCity();
               this.g.post(new OfflineMapManager$3(this, var6));
            }
         }
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

   }

   public ArrayList<OfflineMapProvince> getOfflineMapProvinceList() {
      return this.a.a();
   }

   public OfflineMapCity getItemByCityCode(String var1) {
      return this.a.a(var1);
   }

   public OfflineMapCity getItemByCityName(String var1) {
      return this.a.b(var1);
   }

   public OfflineMapProvince getItemByProvinceName(String var1) {
      return this.a.c(var1);
   }

   public ArrayList<OfflineMapCity> getOfflineMapCityList() {
      return this.a.b();
   }

   public ArrayList<OfflineMapCity> getDownloadingCityList() {
      return this.a.e();
   }

   public ArrayList<OfflineMapProvince> getDownloadingProvinceList() {
      return this.a.f();
   }

   public ArrayList<OfflineMapCity> getDownloadOfflineMapCityList() {
      return this.a.c();
   }

   public ArrayList<OfflineMapProvince> getDownloadOfflineMapProvinceList() {
      return this.a.d();
   }

   private void a(String var1, String var2) throws AMapException {
      this.b.a(var1);
   }

   public void updateOfflineCityByCode(String var1) throws AMapException {
      OfflineMapCity var2 = this.getItemByCityCode(var1);
      if (var2 != null && var2.getCity() != null) {
         this.a(var2.getCity(), "cityname");
      } else {
         throw new AMapException("无效的参数 - IllegalArgumentException");
      }
   }

   public void updateOfflineCityByName(String var1) throws AMapException {
      this.a(var1, "cityname");
   }

   public void updateOfflineMapProvinceByName(String var1) throws AMapException {
      this.a(var1, "cityname");
   }

   private void a() throws AMapException {
      if (!fi.d(this.c)) {
         throw new AMapException("http连接失败 - ConnectionException");
      }
   }

   public void restart() {
   }

   public void stop() {
      this.b.c();
   }

   public void pause() {
      this.b.d();
   }

   public void destroy() {
      try {
         if (this.b != null) {
            this.b.e();
         }

         this.b();
         if (this.f != null) {
            this.f.removeCallbacksAndMessages((Object)null);
         }

         this.f = null;
         if (this.g != null) {
            this.g.removeCallbacksAndMessages((Object)null);
         }

         this.g = null;
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   private void b() {
      this.d = null;
   }

   public void setOnOfflineLoadedListener(OfflineMapManager$OfflineLoadedListener var1) {
      this.e = var1;
   }
}
