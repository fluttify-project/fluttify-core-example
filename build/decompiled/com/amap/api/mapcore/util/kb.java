package com.amap.api.mapcore.util;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public abstract class kb {
   kb c;
   byte[] d = null;

   kb() {
   }

   kb(kb var1) {
      this.c = var1;
   }

   public byte[] a() throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
      byte[] var1 = this.a(this.d);
      if (this.c != null) {
         this.c.c(var1);
         return this.c.a();
      } else {
         return var1;
      }
   }

   protected abstract byte[] a(byte[] var1) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException;

   void c(byte[] var1) {
      this.d = var1;
   }

   public void b(byte[] var1) {
   }
}
