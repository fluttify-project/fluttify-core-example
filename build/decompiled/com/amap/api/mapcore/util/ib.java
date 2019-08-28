package com.amap.api.mapcore.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class ib extends SQLiteOpenHelper {
   private hx a;
   private static boolean b = true;
   private static boolean c = false;

   public ib(Context var1, String var2, CursorFactory var3, int var4, hx var5) {
      super(var1, var2, var3, var4);
      this.a = var5;
   }

   public void onCreate(SQLiteDatabase var1) {
      this.a.a(var1);
   }

   public void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
      this.a.a(var1, var2, var3);
   }
}
