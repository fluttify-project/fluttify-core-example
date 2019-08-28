package com.amap.api.mapcore.util;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class bu implements hx {
   private static volatile bu a;

   public static bu a() {
      if (a == null) {
         Class var0 = bu.class;
         synchronized(bu.class) {
            if (a == null) {
               a = new bu();
            }
         }
      }

      return a;
   }

   private bu() {
   }

   public void a(SQLiteDatabase var1) {
      try {
         if (var1 == null) {
            return;
         }

         var1.execSQL("CREATE TABLE IF NOT EXISTS update_item (_id integer primary key autoincrement, title  TEXT, url TEXT,mAdcode TEXT,fileName TEXT,version TEXT,lLocalLength INTEGER,lRemoteLength INTEGER,localPath TEXT,mIndex INTEGER,isProvince INTEGER NOT NULL,mCompleteCode INTEGER,mCityCode TEXT,mState INTEGER,mPinyin TEXT, UNIQUE(mAdcode));");
         var1.execSQL("CREATE TABLE IF NOT EXISTS update_item_file (_id integer primary key autoincrement,mAdcode TTEXT, file TEXT);");
         var1.execSQL("CREATE TABLE IF NOT EXISTS update_item_download_info (_id integer primary key autoincrement,mAdcode TEXT,fileLength integer,splitter integer,startPos integer,endPos integer, UNIQUE(mAdcode));");
      } catch (Throwable var3) {
         ht.c(var3, "DB", "onCreate");
         var3.printStackTrace();
      }

   }

   public String b() {
      return "offlineDbV4.db";
   }

   public int c() {
      return 2;
   }

   public void a(SQLiteDatabase var1, int var2, int var3) {
      if (var1 != null) {
         switch(var2) {
         case 1:
            var1.execSQL("ALTER TABLE update_item ADD COLUMN mPinyin TEXT;");
            Cursor var4 = var1.query("update_item", (String[])null, (String)null, (String[])null, (String)null, (String)null, (String)null);
            if (var4 == null) {
               var1.close();
               var1 = null;
            }

            if (var4 != null) {
               while(var4.moveToNext()) {
                  String var5 = var4.getString(var4.getColumnIndex("url"));
                  String var6 = var5.substring(var5.lastIndexOf("/") + 1);
                  String var7 = var6.substring(0, var6.lastIndexOf("."));
                  var1.execSQL("update update_item set mPinyin=? where url =?", new String[]{var7, var5});
               }

               var4.close();
            }
         default:
         }
      }
   }
}
