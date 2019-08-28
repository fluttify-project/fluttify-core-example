package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import java.io.File;

public class bf extends OfflineMapCity implements bo, cf {
   public final cj a;
   public final cj b;
   public final cj c;
   public final cj d;
   public final cj e;
   public final cj f;
   public final cj g;
   public final cj h;
   public final cj i;
   public final cj j;
   public final cj k;
   cj l;
   Context m;
   private String p;
   private String q;
   boolean n;
   private long r;
   public static final Creator<bf> o = new bf$2();

   public void a(String var1) {
      this.q = var1;
   }

   public String a() {
      return this.q;
   }

   public String b() {
      return this.getUrl();
   }

   public bf(Context var1, OfflineMapCity var2) {
      this(var1, var2.getState());
      this.setCity(var2.getCity());
      this.setUrl(var2.getUrl());
      this.setState(var2.getState());
      this.setCompleteCode(var2.getcompleteCode());
      this.setAdcode(var2.getAdcode());
      this.setVersion(var2.getVersion());
      this.setSize(var2.getSize());
      this.setCode(var2.getCode());
      this.setJianpin(var2.getJianpin());
      this.setPinyin(var2.getPinyin());
      this.t();
   }

   public bf(Context var1, int var2) {
      this.a = new cl(6, this);
      this.b = new cs(2, this);
      this.c = new co(0, this);
      this.d = new cq(3, this);
      this.e = new cr(1, this);
      this.f = new ck(4, this);
      this.g = new cp(7, this);
      this.h = new cm(-1, this);
      this.i = new cm(101, this);
      this.j = new cm(102, this);
      this.k = new cm(103, this);
      this.p = null;
      this.q = "";
      this.n = false;
      this.r = 0L;
      this.m = var1;
      this.a(var2);
   }

   public void a(int var1) {
      switch(var1) {
      case -1:
         this.l = this.h;
         break;
      case 0:
         this.l = this.c;
         break;
      case 1:
         this.l = this.e;
         break;
      case 2:
         this.l = this.b;
         break;
      case 3:
         this.l = this.d;
         break;
      case 4:
         this.l = this.f;
         break;
      case 6:
         this.l = this.a;
         break;
      case 7:
         this.l = this.g;
         break;
      case 101:
         this.l = this.i;
         break;
      case 102:
         this.l = this.j;
         break;
      case 103:
         this.l = this.k;
         break;
      default:
         if (var1 < 0) {
            this.l = this.h;
         }
      }

      this.setState(var1);
   }

   public void a(cj var1) {
      this.l = var1;
      this.setState(var1.b());
   }

   public cj c() {
      return this.l;
   }

   public void d() {
      bg var1 = bg.a(this.m);
      if (var1 != null) {
         var1.c(this);
      }

   }

   public void e() {
      bg var1 = bg.a(this.m);
      if (var1 != null) {
         var1.e(this);
         this.d();
      }

   }

   public void f() {
      cd.a("CityOperation current State==>" + this.c().b());
      if (this.l.equals(this.d)) {
         this.l.d();
      } else if (this.l.equals(this.c)) {
         this.l.e();
      } else if (!this.l.equals(this.g) && !this.l.equals(this.h)) {
         if (!this.l.equals(this.j) && !this.l.equals(this.i) && !this.l.a(this.k)) {
            this.c().h();
         } else {
            this.l.c();
         }
      } else {
         this.k();
         this.n = true;
      }

   }

   public void g() {
      this.l.e();
   }

   public void h() {
      this.l.a(this.k.b());
   }

   public void i() {
      this.l.a();
      if (this.n) {
         this.l.h();
      }

      this.n = false;
   }

   public void j() {
      if (!this.l.equals(this.f)) {
         ;
      }

      this.l.f();
   }

   public void k() {
      bg var1 = bg.a(this.m);
      if (var1 != null) {
         var1.a(this);
      }

   }

   public void l() {
      bg var1 = bg.a(this.m);
      if (var1 != null) {
         var1.b(this);
      }

   }

   public void m() {
      bg var1 = bg.a(this.m);
      if (var1 != null) {
         var1.d(this);
      }

   }

   public void n() {
      this.r = 0L;
      if (!this.l.equals(this.b)) {
         cd.a("state must be waiting when download onStart");
      }

      this.l.c();
   }

   public void a(long var1, long var3) {
      long var5 = var3 * 100L / var1;
      if ((int)var5 != this.getcompleteCode()) {
         this.setCompleteCode((int)var5);
         this.d();
      }

   }

   public void o() {
      if (!this.l.equals(this.c)) {
         cd.a("state must be Loading when download onFinish");
      }

      this.l.g();
   }

   public void a(cg$a var1) {
      int var2 = 6;
      switch(bf$3.a[var1.ordinal()]) {
      case 1:
         var2 = this.j.b();
         break;
      case 2:
         var2 = this.k.b();
         break;
      case 3:
         var2 = this.i.b();
      }

      if (this.l.equals(this.c) || this.l.equals(this.b)) {
         this.l.a(var2);
      }
   }

   public void p() {
      this.e();
   }

   public void q() {
      this.r = 0L;
      this.setCompleteCode(0);
      if (!this.l.equals(this.e)) {
         ;
      }

      this.l.c();
   }

   public void r() {
      if (!this.l.equals(this.e)) {
         ;
      }

      this.l.a(this.h.b());
   }

   public void a(long var1) {
      long var3 = System.currentTimeMillis();
      long var5 = 500L;
      if (var3 - this.r > var5) {
         if ((int)var1 > this.getcompleteCode()) {
            this.setCompleteCode((int)var1);
            this.d();
         }

         this.r = var3;
      }

   }

   public void b(String var1) {
      if (!this.l.equals(this.e)) {
         ;
      }

      this.q = var1;
      String var2 = this.u();
      String var3 = this.v();
      if (!TextUtils.isEmpty(var2) && !TextUtils.isEmpty(var3)) {
         File var4 = new File(var3 + "/");
         File var5 = new File(fi.a(this.m) + File.separator + "map/");
         File var6 = new File(fi.a(this.m));
         if (var6.exists() || var6.mkdir()) {
            if (var5.exists() || var5.mkdir()) {
               this.a(var4, var5, var2);
            }
         }
      } else {
         this.r();
      }
   }

   public void s() {
      this.e();
   }

   protected void t() {
      String var1 = bg.a;
      String var2 = cd.c(this.getUrl());
      if (var2 != null) {
         this.p = var1 + var2 + ".zip.tmp";
      } else {
         this.p = var1 + this.getPinyin() + ".zip.tmp";
      }

   }

   public String u() {
      return TextUtils.isEmpty(this.p) ? null : this.p.substring(0, this.p.lastIndexOf("."));
   }

   public String v() {
      if (TextUtils.isEmpty(this.p)) {
         return null;
      } else {
         String var1 = this.u();
         return var1.substring(0, var1.lastIndexOf(46));
      }
   }

   private void a(File var1, File var2, String var3) {
      bx var4 = new bx();
      long var5 = cd.a(var1);
      var4.a(var1, var2, -1L, var5, new bf$1(this, var3, var1));
   }

   public boolean w() {
      return (double)cd.a() < (double)this.getSize() * 2.5D - (double)((long)this.getcompleteCode() * this.getSize()) ? false : false;
   }

   public bq x() {
      this.setState(this.l.b());
      bq var1 = new bq(this, this.m);
      var1.a(this.a());
      cd.a("vMapFileNames: " + this.a());
      return var1;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeString(this.q);
   }

   public bf(Parcel var1) {
      super(var1);
      this.a = new cl(6, this);
      this.b = new cs(2, this);
      this.c = new co(0, this);
      this.d = new cq(3, this);
      this.e = new cr(1, this);
      this.f = new ck(4, this);
      this.g = new cp(7, this);
      this.h = new cm(-1, this);
      this.i = new cm(101, this);
      this.j = new cm(102, this);
      this.k = new cm(103, this);
      this.p = null;
      this.q = "";
      this.n = false;
      this.r = 0L;
      this.q = var1.readString();
   }

   public boolean y() {
      return this.w();
   }

   public String z() {
      StringBuffer var1 = new StringBuffer();
      String var2 = cd.c(this.getUrl());
      if (var2 != null) {
         var1.append(var2);
      } else {
         var1.append(this.getPinyin());
      }

      var1.append(".zip");
      return var1.toString();
   }

   public String A() {
      return this.getAdcode();
   }

   public String B() {
      return this.u();
   }

   public String C() {
      return this.v();
   }

   public cj b(int var1) {
      switch(var1) {
      case 101:
         return this.i;
      case 102:
         return this.j;
      case 103:
         return this.k;
      default:
         return this.h;
      }
   }
}
