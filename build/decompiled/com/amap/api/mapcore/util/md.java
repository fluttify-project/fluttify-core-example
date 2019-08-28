package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.Map;

public final class md extends je {
   Map<String, String> f = null;
   private String n = "";
   String g = "";
   byte[] h = null;
   byte[] i = null;
   boolean j = false;
   String k = null;
   Map<String, String> l = null;
   boolean m = false;

   public final Map<String, String> getParams() {
      return this.l;
   }

   public final void a(Map<String, String> var1) {
      this.l = var1;
   }

   public final void a(String var1) {
      this.k = var1;
   }

   public final boolean g() {
      return this.j;
   }

   public final void a() {
      this.j = true;
   }

   public final void b(byte[] var1) {
      this.h = var1;
   }

   public final void b(String var1) {
      this.g = var1;
   }

   public final void b(Map<String, String> var1) {
      this.f = var1;
   }

   public md(Context var1, hf var2) {
      super(var1, var2);
   }

   public final byte[] d() {
      return this.h;
   }

   public final Map<String, String> getRequestHead() {
      return this.f;
   }

   public final byte[] e() {
      return this.i;
   }

   public final String getURL() {
      return this.g;
   }

   public final String i() {
      return this.k;
   }

   public final void k() {
      this.m = true;
   }

   protected final boolean j() {
      return this.m;
   }

   protected final String getIPDNSName() {
      return this.n;
   }
}
