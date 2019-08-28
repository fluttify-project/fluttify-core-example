package com.amap.api.mapcore.util;

import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;

final class mj$1 extends AsyncTask<Void, Void, Void> {
   mj$1(Editor var1) {
      this.a = var1;
   }

   private Void a() {
      try {
         if (this.a != null) {
            this.a.commit();
         }
      } catch (Throwable var1) {
         mg.a(var1, "SpUtil", "commit");
      }

      return null;
   }
}
