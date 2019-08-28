package com.amap.api.mapcore.util;

import android.database.sqlite.SQLiteDatabase;

public class ii implements hx {
   private static ii a;

   public static synchronized ii a() {
      if (a == null) {
         a = new ii();
      }

      return a;
   }

   private ii() {
   }

   public String b() {
      return "dafile.db";
   }

   public int c() {
      return 1;
   }

   public void a(SQLiteDatabase var1) {
      try {
         var1.execSQL("CREATE TABLE IF NOT EXISTS file (_id integer primary key autoincrement, sname  varchar(20), fname varchar(100),md varchar(20),version varchar(20),dversion varchar(20),status varchar(20),reservedfield varchar(20));");
      } catch (Throwable var3) {
         in.a(var3, "DynamicFileDBCreator", "onCreate");
      }

   }

   public void a(SQLiteDatabase var1, int var2, int var3) {
   }
}
