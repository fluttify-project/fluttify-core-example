package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bk {
   public ArrayList<OfflineMapProvince> a = new ArrayList();
   private bv b;
   private Context c;

   public bk(Context var1, Handler var2) {
      this.c = var1;
      this.b = bv.a(var1);
   }

   private void a(bq var1) {
      if (this.b != null && var1 != null) {
         this.b.a(var1);
      }

   }

   private void b(bq var1) {
      if (this.b != null) {
         this.b.b(var1);
      }

   }

   private boolean a(int var1, int var2) {
      return var2 != 1 || var1 <= 2 || var1 >= 98;
   }

   private boolean b(int var1) {
      return var1 == 4;
   }

   private boolean a(OfflineMapProvince var1) {
      if (var1 == null) {
         return false;
      } else {
         ArrayList var2 = var1.getCityList();
         Iterator var3 = var2.iterator();

         OfflineMapCity var4;
         do {
            if (!var3.hasNext()) {
               return true;
            }

            var4 = (OfflineMapCity)var3.next();
         } while(var4.getState() == 4);

         return false;
      }
   }

   public ArrayList<OfflineMapProvince> a() {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = this.a;
      synchronized(this.a) {
         Iterator var3 = this.a.iterator();

         while(var3.hasNext()) {
            OfflineMapProvince var4 = (OfflineMapProvince)var3.next();
            var1.add(var4);
         }

         return var1;
      }
   }

   public OfflineMapCity a(String var1) {
      if (var1 != null && !"".equals(var1)) {
         ArrayList var2 = this.a;
         synchronized(this.a) {
            Iterator var3 = this.a.iterator();

            while(var3.hasNext()) {
               OfflineMapProvince var4 = (OfflineMapProvince)var3.next();
               Iterator var5 = var4.getCityList().iterator();

               while(var5.hasNext()) {
                  OfflineMapCity var6 = (OfflineMapCity)var5.next();
                  if (var6.getCode().equals(var1)) {
                     return var6;
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public OfflineMapCity b(String var1) {
      if (var1 != null && !"".equals(var1)) {
         ArrayList var2 = this.a;
         synchronized(this.a) {
            Iterator var3 = this.a.iterator();

            while(var3.hasNext()) {
               OfflineMapProvince var4 = (OfflineMapProvince)var3.next();
               Iterator var5 = var4.getCityList().iterator();

               while(var5.hasNext()) {
                  OfflineMapCity var6 = (OfflineMapCity)var5.next();
                  String var7 = var6.getCity();
                  if (var7.trim().equalsIgnoreCase(var1.trim())) {
                     return var6;
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public OfflineMapProvince c(String var1) {
      if (var1 != null && !"".equals(var1)) {
         ArrayList var2 = this.a;
         synchronized(this.a) {
            Iterator var3 = this.a.iterator();

            OfflineMapProvince var4;
            String var5;
            do {
               if (!var3.hasNext()) {
                  return null;
               }

               var4 = (OfflineMapProvince)var3.next();
               var5 = var4.getProvinceName();
            } while(!var5.trim().equalsIgnoreCase(var1.trim()));

            return var4;
         }
      } else {
         return null;
      }
   }

   public ArrayList<OfflineMapCity> b() {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = this.a;
      synchronized(this.a) {
         Iterator var3 = this.a.iterator();

         while(var3.hasNext()) {
            OfflineMapProvince var4 = (OfflineMapProvince)var3.next();
            Iterator var5 = var4.getCityList().iterator();

            while(var5.hasNext()) {
               OfflineMapCity var6 = (OfflineMapCity)var5.next();
               var1.add(var6);
            }
         }

         return var1;
      }
   }

   public void a(List<OfflineMapProvince> var1) {
      ArrayList var2 = this.a;
      synchronized(this.a) {
         OfflineMapProvince var4;
         if (this.a.size() > 0) {
            for(int var3 = 0; var3 < this.a.size(); ++var3) {
               var4 = (OfflineMapProvince)this.a.get(var3);
               OfflineMapProvince var5 = null;
               Iterator var6 = var1.iterator();

               label67:
               while(true) {
                  OfflineMapProvince var7;
                  do {
                     if (!var6.hasNext()) {
                        break label67;
                     }

                     var7 = (OfflineMapProvince)var6.next();
                     if (var4.getPinyin().equals(var7.getPinyin())) {
                        var5 = var7;
                        break label67;
                     }
                  } while(!var4.getPinyin().equals("quanguogaiyaotu") && !var4.getProvinceCode().equals("000001") && !var4.getProvinceCode().equals("100000"));

                  if (var7.getPinyin().equals("quanguogaiyaotu")) {
                     var5 = var7;
                     break;
                  }
               }

               if (var5 != null) {
                  this.a(var4, var5);
                  ArrayList var16 = var4.getCityList();
                  ArrayList var17 = var5.getCityList();

                  for(int var8 = 0; var8 < var16.size(); ++var8) {
                     OfflineMapCity var9 = (OfflineMapCity)var16.get(var8);
                     OfflineMapCity var10 = null;
                     Iterator var11 = var17.iterator();

                     while(var11.hasNext()) {
                        OfflineMapCity var12 = (OfflineMapCity)var11.next();
                        if (var9.getPinyin().equals(var12.getPinyin())) {
                           var10 = var12;
                           break;
                        }
                     }

                     if (var10 != null) {
                        this.a(var9, var10);
                     }
                  }
               }
            }
         } else {
            Iterator var15 = var1.iterator();

            while(var15.hasNext()) {
               var4 = (OfflineMapProvince)var15.next();
               this.a.add(var4);
            }
         }

      }
   }

   private void a(OfflineMapCity var1, OfflineMapCity var2) {
      var1.setUrl(var2.getUrl());
      var1.setVersion(var2.getVersion());
      var1.setSize(var2.getSize());
      var1.setCode(var2.getCode());
      var1.setPinyin(var2.getPinyin());
      var1.setJianpin(var2.getJianpin());
   }

   private void a(OfflineMapProvince var1, OfflineMapProvince var2) {
      var1.setUrl(var2.getUrl());
      var1.setVersion(var2.getVersion());
      var1.setSize(var2.getSize());
      var1.setPinyin(var2.getPinyin());
      var1.setJianpin(var2.getJianpin());
   }

   public ArrayList<OfflineMapCity> c() {
      ArrayList var1 = this.a;
      synchronized(this.a) {
         ArrayList var2 = new ArrayList();
         Iterator var3 = this.a.iterator();

         label39:
         while(true) {
            OfflineMapProvince var4;
            do {
               if (!var3.hasNext()) {
                  return var2;
               }

               var4 = (OfflineMapProvince)var3.next();
            } while(var4 == null);

            ArrayList var5 = var4.getCityList();
            Iterator var6 = var5.iterator();

            while(true) {
               OfflineMapCity var7;
               do {
                  if (!var6.hasNext()) {
                     continue label39;
                  }

                  var7 = (OfflineMapCity)var6.next();
               } while(var7.getState() != 4 && var7.getState() != 7);

               var2.add(var7);
            }
         }
      }
   }

   public ArrayList<OfflineMapProvince> d() {
      ArrayList var1 = this.a;
      synchronized(this.a) {
         ArrayList var2 = new ArrayList();
         Iterator var3 = this.a.iterator();

         while(true) {
            OfflineMapProvince var4;
            do {
               do {
                  if (!var3.hasNext()) {
                     return var2;
                  }

                  var4 = (OfflineMapProvince)var3.next();
               } while(var4 == null);
            } while(var4.getState() != 4 && var4.getState() != 7);

            var2.add(var4);
         }
      }
   }

   public ArrayList<OfflineMapCity> e() {
      ArrayList var1 = this.a;
      synchronized(this.a) {
         ArrayList var2 = new ArrayList();
         Iterator var3 = this.a.iterator();

         while(true) {
            OfflineMapProvince var4;
            do {
               if (!var3.hasNext()) {
                  return var2;
               }

               var4 = (OfflineMapProvince)var3.next();
            } while(var4 == null);

            ArrayList var5 = var4.getCityList();
            Iterator var6 = var5.iterator();

            while(var6.hasNext()) {
               OfflineMapCity var7 = (OfflineMapCity)var6.next();
               if (this.a(var7.getState())) {
                  var2.add(var7);
               }
            }
         }
      }
   }

   public ArrayList<OfflineMapProvince> f() {
      ArrayList var1 = this.a;
      synchronized(this.a) {
         ArrayList var2 = new ArrayList();
         Iterator var3 = this.a.iterator();

         while(var3.hasNext()) {
            OfflineMapProvince var4 = (OfflineMapProvince)var3.next();
            if (var4 != null && this.a(var4.getState())) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   public boolean a(int var1) {
      return var1 == 0 || var1 == 2 || var1 == 3 || var1 == 1 || var1 == 102 || var1 == 101 || var1 == 103 || var1 == -1;
   }

   public void a(bf var1) {
      String var2 = var1.getPinyin();
      ArrayList var3 = this.a;
      synchronized(this.a) {
         Iterator var4 = this.a.iterator();

         while(var4.hasNext()) {
            OfflineMapProvince var5 = (OfflineMapProvince)var4.next();
            if (var5 != null) {
               ArrayList var6 = var5.getCityList();
               Iterator var7 = var6.iterator();

               while(var7.hasNext()) {
                  OfflineMapCity var8 = (OfflineMapCity)var7.next();
                  if (var8.getPinyin().trim().equals(var2.trim())) {
                     this.a(var1, var8);
                     this.a(var1, var5);
                     return;
                  }
               }
            }
         }

      }
   }

   private void a(bf var1, OfflineMapCity var2) {
      int var3 = var1.c().b();
      if (var1.c().equals(var1.a)) {
         this.b(var1.x());
      } else {
         if (var1.c().equals(var1.f)) {
            cd.a("saveJSONObjectToFile  CITY " + var1.getCity());
            this.b(var1);
            var1.x().c();
         }

         if (this.a(var1.getcompleteCode(), var1.c().b())) {
            this.a(var1.x());
         }
      }

      var2.setState(var3);
      var2.setCompleteCode(var1.getcompleteCode());
   }

   private void b(bf var1) {
      File[] var2 = (new File(fi.c(this.c))).listFiles();
      if (var2 != null) {
         File[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            if (var6.isFile() && var6.exists() && var6.getName().contains(var1.getAdcode()) && var6.getName().endsWith(".zip.tmp.dt")) {
               var6.delete();
            }
         }

      }
   }

   private void a(bf var1, OfflineMapProvince var2) {
      int var3 = var1.c().b();
      if (var3 == 6) {
         var2.setState(var3);
         var2.setCompleteCode(0);
         this.b(new bq(var2, this.c));

         try {
            cd.b(var2.getProvinceCode(), this.c);
         } catch (IOException var5) {
            var5.printStackTrace();
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      } else if (this.b(var3) && this.a(var2)) {
         bq var4;
         if (var1.getPinyin().equals(var2.getPinyin())) {
            var2.setState(var3);
            var2.setCompleteCode(var1.getcompleteCode());
            var2.setVersion(var1.getVersion());
            var2.setUrl(var1.getUrl());
            var4 = new bq(var2, this.c);
            var4.a(var1.a());
            var4.d(var1.getCode());
         } else {
            var2.setState(var3);
            var2.setCompleteCode(100);
            var4 = new bq(var2, this.c);
         }

         var4.c();
         this.a(var4);
         cd.a("saveJSONObjectToFile  province " + var4.d());
      }

   }

   public void g() {
      this.h();
      this.b = null;
      this.c = null;
   }

   public void h() {
      if (this.a != null) {
         ArrayList var1 = this.a;
         synchronized(this.a) {
            this.a.clear();
         }
      }

   }
}
