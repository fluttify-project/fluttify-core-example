package com.amap.api.mapcore.util;

import android.database.sqlite.SQLiteDatabase;

public class ic implements hx {
   public ic() {
   }

   public void a(SQLiteDatabase var1) {
      try {
         var1.execSQL("CREATE TABLE IF NOT EXISTS a (_id integer primary key autoincrement, a1  varchar(20), a2 varchar(10),a3 varchar(50),a4 varchar(100),a5 varchar(20),a6 integer);");
         var1.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id integer primary key autoincrement,b1 varchar(40), b2 integer,b3  integer,a1  varchar(20));", "b"));
         var1.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id integer primary key autoincrement,b1 varchar(40), b2 integer,b3  integer,a1  varchar(20));", "c"));
         var1.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id integer primary key autoincrement,b1 varchar(40), b2 integer,b3  integer,a1  varchar(20));", "d"));
         var1.execSQL("CREATE TABLE IF NOT EXISTS e (_id integer primary key autoincrement,c1 integer,c2 integer,c3 integer);");
      } catch (Throwable var3) {
         hq.a(var3, "DB", "onCreate");
      }

   }

   public void a(SQLiteDatabase var1, int var2, int var3) {
   }

   public String b() {
      return "logdb.db";
   }

   public int c() {
      return 1;
   }
}
