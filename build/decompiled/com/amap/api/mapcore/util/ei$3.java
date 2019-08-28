package com.amap.api.mapcore.util;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class ei$3 extends FutureTask<Result> {
   ei$3(ei var1, Callable var2) {
      super(var2);
      this.a = var1;
   }

   protected void done() {
      try {
         ei.b(this.a, ei.b(this.a).get());
      } catch (InterruptedException var2) {
         Log.w("AbstractAsyncTask", var2);
      } catch (ExecutionException var3) {
         throw new RuntimeException("An error occured while executing doInBackground()", var3.getCause());
      } catch (CancellationException var4) {
         ei.b(this.a, (Object)null);
      }

   }
}
