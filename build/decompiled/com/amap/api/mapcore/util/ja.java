package com.amap.api.mapcore.util;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ja implements Closeable {
   private final InputStream a;
   private final Charset b;
   private byte[] c;
   private int d;
   private int e;

   public ja(InputStream var1, Charset var2) {
      this(var1, 8192, var2);
   }

   public ja(InputStream var1, int var2, Charset var3) {
      if (var1 != null && var3 != null) {
         if (var2 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
         } else if (!var3.equals(jb.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
         } else {
            this.a = var1;
            this.b = var3;
            this.c = new byte[var2];
         }
      } else {
         throw new NullPointerException();
      }
   }

   public void close() throws IOException {
      InputStream var1 = this.a;
      synchronized(this.a) {
         if (this.c != null) {
            this.c = null;
            this.a.close();
         }

      }
   }

   public String a() throws IOException {
      InputStream var1 = this.a;
      synchronized(this.a) {
         if (this.c == null) {
            throw new IOException("LineReader is closed");
         } else {
            if (this.d >= this.e) {
               this.b();
            }

            int var3;
            for(int var2 = this.d; var2 != this.e; ++var2) {
               if (this.c[var2] == 10) {
                  var3 = var2 != this.d && this.c[var2 - 1] == 13 ? var2 - 1 : var2;
                  String var4 = new String(this.c, this.d, var3 - this.d, this.b.name());
                  this.d = var2 + 1;
                  return var4;
               }
            }

            ja$1 var7 = new ja$1(this, this.e - this.d + 80);

            while(true) {
               var7.write(this.c, this.d, this.e - this.d);
               this.e = -1;
               this.b();

               for(var3 = this.d; var3 != this.e; ++var3) {
                  if (this.c[var3] == 10) {
                     if (var3 != this.d) {
                        var7.write(this.c, this.d, var3 - this.d);
                     }

                     this.d = var3 + 1;
                     return var7.toString();
                  }
               }
            }
         }
      }
   }

   private void b() throws IOException {
      int var1 = this.a.read(this.c, 0, this.c.length);
      if (var1 == -1) {
         throw new EOFException();
      } else {
         this.d = 0;
         this.e = var1;
      }
   }
}
