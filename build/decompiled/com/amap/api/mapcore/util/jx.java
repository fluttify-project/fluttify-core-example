package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class jx extends kb {
   private Context a;
   private String b;
   private hk e;
   private Object[] f;

   public jx(Context var1, kb var2, hk var3, String var4, Object... var5) {
      super(var2);
      this.a = var1;
      this.b = var4;
      this.e = var3;
      this.f = var5;
   }

   protected byte[] a(byte[] var1) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
      String var2 = hg.a(var1);
      if (TextUtils.isEmpty(var2)) {
         return null;
      } else {
         String var3 = this.b(this.a);
         StringBuilder var4 = new StringBuilder();
         var4.append("{\"pinfo\":\"").append(var3).append("\",\"els\":[");
         var4.append(var2);
         var4.append("]}");
         return hg.a(var4.toString());
      }
   }

   private String a(Context var1) {
      String var2 = "";

      try {
         var2 = String.format(hg.c(this.b), this.f);
      } catch (Throwable var4) {
         var4.printStackTrace();
         ht.c(var4, "ofm", "gpj");
      }

      return var2;
   }

   private String b(Context var1) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
      String var2 = this.a(var1);
      String var3 = hg.a(this.e.b(hg.a(var2)));
      return var3;
   }
}
