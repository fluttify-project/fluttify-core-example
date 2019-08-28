package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class bj extends Thread {
   private Context a;
   private bv b;

   public bj(Context var1) {
      this.a = var1;
      this.b = bv.a(var1);
   }

   public void run() {
      try {
         this.a();
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   private bq a(File var1) {
      String var2 = fi.a(var1);
      bq var3 = new bq();
      var3.b(var2);
      return var3;
   }

   private void a() {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = this.b.a();
      this.a(var1, "vmap/");
      this.a(var1, "map/");
      this.b(var1, "map/");
      ArrayList var3 = this.b();
      Iterator var4 = var2.iterator();

      while(true) {
         bq var5;
         boolean var6;
         String var7;
         int var8;
         do {
            label105:
            do {
               while(true) {
                  while(true) {
                     do {
                        do {
                           if (!var4.hasNext()) {
                              var4 = var1.iterator();

                              while(var4.hasNext()) {
                                 String var10 = (String)var4.next();
                                 if (!this.a(var10, var2)) {
                                    bq var11 = this.a(var10);
                                    if (var11 != null) {
                                       this.b.a(var11);
                                    }
                                 }
                              }

                              bg var9 = bg.a(this.a);
                              if (var9 != null) {
                                 var9.a((ArrayList)null);
                              }

                              return;
                           }

                           var5 = (bq)var4.next();
                        } while(var5 == null);
                     } while(var5.d() == null);

                     if (var5.l != 4 && var5.l != 7) {
                        if (var5.l != 0 && var5.l != 1) {
                           continue label105;
                        }

                        var6 = var3.contains(var5.f()) || var3.contains(var5.i());
                        if (!var6) {
                           var7 = cd.c(var5.g());
                           if (var7 != null) {
                              var8 = var3.indexOf(var7);
                              if (var8 != -1) {
                                 var6 = true;
                                 var3.set(var8, var5.i());
                              }
                           }
                        }

                        if (!var6) {
                           this.b.b(var5);
                        }
                     } else {
                        var6 = var1.contains(var5.i());
                        if (!var6) {
                           var7 = cd.c(var5.g());
                           if (var7 != null) {
                              var8 = var1.indexOf(var7);
                              if (var8 != -1) {
                                 var6 = true;
                                 var1.set(var8, var5.i());
                              }
                           }
                        }

                        if (!var6) {
                           this.b.b(var5);
                        }
                     }
                  }
               }
            } while(var5.l != 3);
         } while(var5.h() == 0);

         var6 = var3.contains(var5.f()) || var3.contains(var5.i());
         if (!var6) {
            var7 = cd.c(var5.g());
            if (var7 != null) {
               var8 = var3.indexOf(var7);
               if (var8 != -1) {
                  var6 = true;
                  var3.set(var8, var5.i());
               }
            }
         }

         if (!var6) {
            this.b.b(var5);
         }
      }
   }

   private bq a(String var1) {
      if (var1.equals("quanguo")) {
         var1 = "quanguogaiyaotu";
      }

      bg var2 = bg.a(this.a);
      if (var2 == null) {
         return null;
      } else {
         String var3 = var2.f(var1);
         bq var4 = null;
         File[] var5 = (new File(fi.c(this.a))).listFiles();
         if (var5 == null) {
            return null;
         } else {
            File[] var6 = var5;
            int var7 = var5.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               File var9 = var6[var8];
               boolean var10 = (var9.getName().contains(var3) || var9.getName().contains(var1)) && var9.getName().endsWith(".zip.tmp.dt");
               if (var10) {
                  var4 = this.a(var9);
                  if (var4 != null && var4.d() != null) {
                     return var4;
                  }
               }
            }

            return var4;
         }
      }
   }

   private boolean a(String var1, ArrayList<bq> var2) {
      Iterator var3 = var2.iterator();

      bq var4;
      do {
         if (!var3.hasNext()) {
            return false;
         }

         var4 = (bq)var3.next();
      } while(!var1.equals(var4.i()));

      return true;
   }

   private void a(ArrayList<String> var1, String var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append(fi.b(this.a));
      var3.append(var2);
      File var4 = new File(var3.toString());
      if (var4.exists()) {
         File[] var5 = var4.listFiles();
         if (var5 != null) {
            File[] var6 = var5;
            int var7 = var5.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               File var9 = var6[var8];
               if (var9.getName().endsWith(".dat")) {
                  String var10 = var9.getName();
                  int var11 = var10.lastIndexOf(46);
                  if (var11 > -1 && var11 < var10.length()) {
                     String var12 = var10.substring(0, var11);
                     if (!var1.contains(var12)) {
                        var1.add(var12);
                     }
                  }
               }
            }

         }
      }
   }

   private void b(ArrayList<String> var1, String var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append(fi.a(this.a));
      var3.append(var2);
      File var4 = new File(var3.toString());
      if (var4.exists()) {
         File[] var5 = var4.listFiles();
         if (var5 != null) {
            File[] var6 = var5;
            int var7 = var5.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               File var9 = var6[var8];
               if (var9.isDirectory()) {
                  String var10 = var9.getName();
                  if (!TextUtils.isEmpty(var10)) {
                     String[] var11 = var9.list();
                     if (var11 != null && var11.length >= 1 && !var1.contains(var10)) {
                        boolean var12 = false;
                        if (var10.equals("a0")) {
                           String[] var13 = var11;
                           int var14 = var11.length;

                           for(int var15 = 0; var15 < var14; ++var15) {
                              String var16 = var13[var15];
                              if ("m1.ans".equals(var16)) {
                                 var12 = true;
                                 break;
                              }
                           }
                        } else {
                           boolean var19 = false;
                           boolean var20 = false;
                           String[] var21 = var11;
                           int var22 = var11.length;

                           for(int var17 = 0; var17 < var22; ++var17) {
                              String var18 = var21[var17];
                              if ("m1.ans".equals(var18)) {
                                 var19 = true;
                              }

                              if ("m3.ans".equals(var18)) {
                                 var20 = true;
                              }
                           }

                           if (var19 && var20) {
                              var12 = true;
                           }
                        }

                        if (var12) {
                           var1.add(var10);
                        }
                     }
                  }
               }
            }

         }
      }
   }

   private ArrayList<String> b() {
      ArrayList var1 = new ArrayList();
      StringBuilder var2 = new StringBuilder();
      var2.append(fi.c(this.a));
      File var3 = new File(var2.toString());
      if (!var3.exists()) {
         return var1;
      } else {
         File[] var4 = var3.listFiles();
         if (var4 == null) {
            return var1;
         } else {
            File[] var5 = var4;
            int var6 = var4.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               File var8 = var5[var7];
               if (var8.getName().endsWith(".zip")) {
                  String var9 = var8.getName();
                  int var10 = var9.lastIndexOf(46);
                  if (var10 > -1 && var10 < var9.length()) {
                     var1.add(var9.substring(0, var10));
                  }
               }
            }

            return var1;
         }
      }
   }
}
