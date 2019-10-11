package com.amap.api.mapcore.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class hy {
   private ib a;
   private SQLiteDatabase b;
   private hx c;
   private static Map<Class<? extends hx>, hx> d = new HashMap();

   public static synchronized hx a(Class<? extends hx> var0) throws IllegalAccessException, InstantiationException {
      if (d.get(var0) == null) {
         d.put(var0, var0.newInstance());
      }

      return (hx)d.get(var0);
   }

   public hy(Context var1, hx var2) {
      try {
         this.a = new ib(var1.getApplicationContext(), var2.b(), (CursorFactory)null, var2.c(), var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

      this.c = var2;
   }

   public static String a(Map<String, String> var0) {
      if (var0 == null) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder();
         boolean var2 = true;
         Iterator var3 = var0.keySet().iterator();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            if (var2) {
               var1.append(var4).append(" = '").append((String)var0.get(var4)).append("'");
               var2 = false;
            } else {
               var1.append(" and ").append(var4).append(" = '").append((String)var0.get(var4)).append("'");
            }
         }

         return var1.toString();
      }
   }

   public <T> void a(String var1, Class<T> var2) {
      hx var3 = this.c;
      synchronized(this.c) {
         hz var4 = this.b(var2);
         String var5 = this.a(var4);
         if (!TextUtils.isEmpty(var5)) {
            this.b = this.b(false);
            if (this.b != null) {
               try {
                  this.b.delete(var5, var1, (String[])null);
               } catch (Throwable var13) {
                  hq.a(var13, "dbs", "dld");
               } finally {
                  if (this.b != null) {
                     this.b.close();
                     this.b = null;
                  }

               }

            }
         }
      }
   }

   public <T> void a(String var1, Object var2, boolean var3) {
      hx var4 = this.c;
      synchronized(this.c) {
         if (var2 != null) {
            hz var5 = this.b(var2.getClass());
            String var6 = this.a(var5);
            if (!TextUtils.isEmpty(var6)) {
               ContentValues var7 = this.a(var2, var5);
               if (var7 != null) {
                  this.b = this.b(var3);
                  if (this.b != null) {
                     try {
                        this.b.update(var6, var7, var1, (String[])null);
                     } catch (Throwable var15) {
                        if (!var3) {
                           hq.a(var15, "dbs", "udd");
                        } else {
                           var15.printStackTrace();
                        }
                     } finally {
                        if (this.b != null) {
                           this.b.close();
                           this.b = null;
                        }

                     }

                  }
               }
            }
         }
      }
   }

   public <T> void a(String var1, Object var2) {
      this.a(var1, var2, false);
   }

   public void a(Object var1, String var2) {
      hx var3 = this.c;
      synchronized(this.c) {
         List var4 = this.b(var2, var1.getClass());
         if (var4 != null && var4.size() != 0) {
            this.a(var2, var1);
         } else {
            this.a(var1);
         }

      }
   }

   public <T> void a(T var1) {
      this.a(var1, false);
   }

   public <T> void a(T var1, boolean var2) {
      hx var3 = this.c;
      synchronized(this.c) {
         this.b = this.b(var2);
         if (this.b != null) {
            try {
               this.a(this.b, var1);
            } catch (Throwable var11) {
               hq.a(var11, "dbs", "itd");
            } finally {
               if (this.b != null) {
                  this.b.close();
                  this.b = null;
               }

            }

         }
      }
   }

   private <T> void a(SQLiteDatabase var1, T var2) {
      hz var3 = this.b(var2.getClass());
      String var4 = this.a(var3);
      if (!TextUtils.isEmpty(var4)) {
         if (var2 != null && var1 != null) {
            ContentValues var5 = this.a(var2, var3);
            if (var5 != null) {
               var1.insert(var4, (String)null, var5);
            }
         }
      }
   }

   public <T> void a(List<T> var1) {
      hx var2 = this.c;
      synchronized(this.c) {
         if (var1 != null && var1.size() != 0) {
            this.b = this.b(false);
            if (this.b != null) {
               try {
                  this.b.beginTransaction();
                  Iterator var3 = var1.iterator();

                  while(var3.hasNext()) {
                     Object var4 = var3.next();
                     this.a(this.b, var4);
                  }

                  this.b.setTransactionSuccessful();
               } catch (Throwable var20) {
                  hq.a(var20, "dbs", "ild");
               } finally {
                  try {
                     if (this.b.inTransaction()) {
                        this.b.endTransaction();
                     }
                  } catch (Throwable var19) {
                     hq.a(var19, "dbs", "ild");
                  }

                  try {
                     this.b.close();
                     this.b = null;
                  } catch (Throwable var18) {
                     hq.a(var18, "dbs", "ild");
                  }

               }

            }
         }
      }
   }

   public <T> List<T> a(String var1, Class<T> var2, boolean var3) {
      hx var4 = this.c;
      synchronized(this.c) {
         ArrayList var5 = new ArrayList();
         Cursor var6 = null;
         hz var7 = this.b(var2);
         String var8 = this.a(var7);
         if (this.b == null) {
            this.b = this.a(var3);
         }

         if (this.b != null && !TextUtils.isEmpty(var8) && var1 != null) {
            ArrayList var9;
            try {
               var6 = this.b.query(var8, (String[])null, var1, (String[])null, (String)null, (String)null, (String)null);
               if (var6 != null) {
                  while(var6.moveToNext()) {
                     var5.add(this.a(var6, var2, var7));
                  }

                  return var5;
               }

               this.b.close();
               this.b = null;
               var9 = var5;
            } catch (Throwable var27) {
               if (!var3) {
                  hq.a(var27, "dbs", "sld");
               }

               return var5;
            } finally {
               try {
                  if (var6 != null) {
                     var6.close();
                  }
               } catch (Throwable var26) {
                  if (!var3) {
                     hq.a(var26, "dbs", "sld");
                  }
               }

               try {
                  if (this.b != null) {
                     this.b.close();
                     this.b = null;
                  }
               } catch (Throwable var25) {
                  if (!var3) {
                     hq.a(var25, "dbs", "sld");
                  }
               }

            }

            return var9;
         } else {
            return var5;
         }
      }
   }

   public <T> List<T> b(String var1, Class<T> var2) {
      return this.a(var1, var2, false);
   }

   private <T> T a(Cursor var1, Class<T> var2, hz var3) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
      Field[] var4 = this.a(var2, var3.b());
      Constructor var5 = var2.getDeclaredConstructor();
      var5.setAccessible(true);
      Object var6 = var5.newInstance();
      Field[] var7 = var4;
      int var8 = var4.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         Field var10 = var7[var9];
         var10.setAccessible(true);
         Annotation var11 = var10.getAnnotation(ia.class);
         if (var11 != null) {
            ia var12 = (ia)var11;
            int var13 = var12.b();
            String var14 = var12.a();
            int var15 = var1.getColumnIndex(var14);
            switch(var13) {
            case 1:
               short var17 = var1.getShort(var15);
               var10.set(var6, var17);
               break;
            case 2:
               int var16 = var1.getInt(var15);
               var10.set(var6, var16);
               break;
            case 3:
               float var23 = var1.getFloat(var15);
               var10.set(var6, var23);
               break;
            case 4:
               double var20 = var1.getDouble(var15);
               var10.set(var6, var20);
               break;
            case 5:
               long var18 = var1.getLong(var15);
               var10.set(var6, var18);
               break;
            case 6:
               String var22 = var1.getString(var15);
               var10.set(var6, var22);
               break;
            case 7:
               byte[] var24 = var1.getBlob(var15);
               var10.set(var6, var24);
            }
         }
      }

      return var6;
   }

   private void a(Object var1, Field var2, ContentValues var3) {
      Annotation var4 = var2.getAnnotation(ia.class);
      if (var4 != null) {
         ia var5 = (ia)var4;
         int var6 = var5.b();

         try {
            switch(var6) {
            case 1:
               boolean var8 = false;
               short var19 = var2.getShort(var1);
               var3.put(var5.a(), var19);
               break;
            case 2:
               boolean var7 = false;
               int var18 = var2.getInt(var1);
               var3.put(var5.a(), var18);
               break;
            case 3:
               float var14 = 0.0F;
               var14 = var2.getFloat(var1);
               var3.put(var5.a(), var14);
               break;
            case 4:
               double var11 = 0.0D;
               var11 = var2.getDouble(var1);
               var3.put(var5.a(), var11);
               break;
            case 5:
               long var9 = 0L;
               var9 = var2.getLong(var1);
               var3.put(var5.a(), var9);
               break;
            case 6:
               String var13 = "";
               var13 = (String)var2.get(var1);
               var3.put(var5.a(), var13);
               break;
            case 7:
               Object var15 = null;
               byte[] var17 = (byte[])((byte[])var2.get(var1));
               var3.put(var5.a(), var17);
            }
         } catch (IllegalAccessException var16) {
            var16.printStackTrace();
         }

      }
   }

   private ContentValues a(Object var1, hz var2) {
      ContentValues var3 = new ContentValues();
      Field[] var4 = this.a(var1.getClass(), var2.b());
      Field[] var5 = var4;
      int var6 = var4.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         Field var8 = var5[var7];
         var8.setAccessible(true);
         this.a(var1, var8, var3);
      }

      return var3;
   }

   private Field[] a(Class<?> var1, boolean var2) {
      if (var1 == null) {
         return null;
      } else if (var2) {
         Class var3 = var1.getSuperclass();
         return var3.getDeclaredFields();
      } else {
         return var1.getDeclaredFields();
      }
   }

   private SQLiteDatabase a(boolean var1) {
      try {
         if (this.b == null) {
            this.b = this.a.getReadableDatabase();
         }
      } catch (Throwable var3) {
         if (!var1) {
            hq.a(var3, "dbs", "grd");
         } else {
            var3.printStackTrace();
         }
      }

      return this.b;
   }

   private SQLiteDatabase b(boolean var1) {
      try {
         if (this.b == null || this.b.isReadOnly()) {
            if (this.b != null) {
               this.b.close();
            }

            this.b = this.a.getWritableDatabase();
         }
      } catch (Throwable var3) {
         hq.a(var3, "dbs", "gwd");
      }

      return this.b;
   }

   private boolean a(Annotation var1) {
      return var1 != null;
   }

   private <T> String a(hz var1) {
      if (var1 == null) {
         return null;
      } else {
         String var2 = var1.a();
         return var2;
      }
   }

   private <T> hz b(Class<T> var1) {
      Annotation var2 = var1.getAnnotation(hz.class);
      if (!this.a(var2)) {
         return null;
      } else {
         hz var3 = (hz)var2;
         return var3;
      }
   }
}
