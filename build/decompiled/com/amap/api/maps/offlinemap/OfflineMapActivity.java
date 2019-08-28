package com.amap.api.maps.offlinemap;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import com.amap.api.mapcore.util.gh;
import com.amap.api.mapcore.util.gi;
import com.amap.api.mapcore.util.gk;
import com.amap.api.offlineservice.AMapPermissionActivity;
import com.amap.api.offlineservice.a;

public class OfflineMapActivity extends AMapPermissionActivity implements OnClickListener {
   private static int a = 0;
   private a b;
   private gh c;
   private gh[] d = new gh[32];
   private int e = -1;
   private gi f;

   public OfflineMapActivity() {
   }

   protected void onCreate(Bundle var1) {
      try {
         super.onCreate(var1);
         this.getWindow().setSoftInputMode(32);
         this.getWindow().setFormat(-3);
         this.requestWindowFeature(1);
         gk.a(this.getApplicationContext());
         this.e = -1;
         a = 0;
         this.b(new gh(1, (Bundle)null));
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void showScr() {
      try {
         this.setContentView(this.b.c());
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   private void a(gh var1) {
      try {
         if (this.b != null) {
            this.b.d();
            this.b = null;
         }

         this.b = this.c(var1);
         if (this.b != null) {
            this.c = var1;
            this.b.a(this);
            this.b.a(this.c.b);
            this.b.a();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   private void b(gh var1) {
      try {
         ++a;
         this.a(var1);
         this.e = (this.e + 1) % 32;
         this.d[this.e] = var1;
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   private a c(gh var1) {
      try {
         switch(var1.a) {
         case 1:
            if (this.f == null) {
               this.f = new gi();
            }

            return this.f;
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return null;
   }

   protected void onStart() {
      try {
         super.onStart();
         if (this.b != null) {
            this.b.e();
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   protected void onResume() {
      try {
         super.onResume();
         if (this.b != null) {
            this.b.f();
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   protected void onPause() {
      try {
         super.onPause();
         if (this.b != null) {
            this.b.h();
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   protected void onStop() {
      try {
         super.onStop();
         if (this.b != null) {
            this.b.g();
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void onConfigurationChanged(Configuration var1) {
      try {
         super.onConfigurationChanged(var1);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public void closeScr() {
      try {
         if (!this.a((Bundle)null)) {
            if (this.b != null) {
               this.b.d();
            }

            this.finish();
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void closeScr(Bundle var1) {
      try {
         if (!this.a(var1)) {
            if (this.b != null) {
               this.b.d();
            }

            this.finish();
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   private boolean a(Bundle var1) {
      try {
         if (a == 1 && this.b != null) {
            return false;
         }

         if (a > 1) {
            --a;
            this.e = (this.e - 1 + 32) % 32;
            gh var2 = this.d[this.e];
            var2.b = var1;
            this.a(var2);
            return true;
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return false;
   }

   protected void onDestroy() {
      try {
         super.onDestroy();
         if (this.b != null) {
            this.b.d();
            this.b = null;
         }

         this.c = null;
         this.d = null;
         if (this.f != null) {
            this.f.d();
            this.f = null;
         }
      } catch (Throwable var2) {
         var2.printStackTrace();
      }

   }

   public void onClick(View var1) {
      try {
         if (this.b != null) {
            this.b.a(var1);
         }
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      try {
         if (var1 == 4) {
            if (this.b != null && !this.b.b()) {
               return true;
            }

            if (this.a((Bundle)null)) {
               return false;
            }

            if (var2 == null) {
               if (a == 1) {
                  this.finish();
               }

               return false;
            }

            this.e = -1;
            a = 0;
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

      return super.onKeyDown(var1, var2);
   }
}
