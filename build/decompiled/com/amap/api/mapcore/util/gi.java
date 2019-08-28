package com.amap.api.mapcore.util;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AutoCompleteTextView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.AbsListView.OnScrollListener;
import android.widget.RelativeLayout.LayoutParams;
import com.amap.api.maps.offlinemap.DownLoadExpandListView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapManager$OfflineLoadedListener;
import com.amap.api.maps.offlinemap.OfflineMapManager$OfflineMapDownloadListener;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class gi extends com.amap.api.offlineservice.a implements TextWatcher, OnTouchListener, OnScrollListener, OfflineMapManager$OfflineLoadedListener, OfflineMapManager$OfflineMapDownloadListener {
   private ImageView b;
   private RelativeLayout c;
   private DownLoadExpandListView d;
   private ListView e;
   private ExpandableListView f;
   private ImageView g;
   private ImageView h;
   private AutoCompleteTextView i;
   private RelativeLayout j;
   private RelativeLayout k;
   private ImageView l;
   private ImageView m;
   private RelativeLayout n;
   private List<OfflineMapProvince> o = new ArrayList();
   private gc p;
   private OfflineMapManager q = null;
   private gb r;
   private gd s;
   private boolean t = true;
   private boolean u = true;
   private int v = -1;
   private long w = 0L;
   private ge x;
   private boolean y = true;

   public gi() {
   }

   public void a() {
      View var1 = gk.a(this.a, 2130903040, (ViewGroup)null);
      this.d = (DownLoadExpandListView)var1.findViewById(2131165187);
      this.d.setOnTouchListener(this);
      this.j = (RelativeLayout)var1.findViewById(2131165184);
      this.g = (ImageView)var1.findViewById(2131165186);
      this.j.setOnClickListener(this.a);
      this.k = (RelativeLayout)var1.findViewById(2131165189);
      this.h = (ImageView)var1.findViewById(2131165190);
      this.k.setOnClickListener(this.a);
      this.n = (RelativeLayout)var1.findViewById(2131165188);
      this.b = (ImageView)this.c.findViewById(2131165205);
      this.b.setOnClickListener(this.a);
      this.m = (ImageView)this.c.findViewById(2131165207);
      this.l = (ImageView)this.c.findViewById(2131165209);
      this.l.setOnClickListener(new gi$1(this));
      this.c.findViewById(2131165210).setOnTouchListener(this);
      this.i = (AutoCompleteTextView)this.c.findViewById(2131165208);
      this.i.addTextChangedListener(this);
      this.i.setOnTouchListener(this);
      this.e = (ListView)this.c.findViewById(2131165212);
      this.f = (ExpandableListView)this.c.findViewById(2131165211);
      this.f.addHeaderView(var1);
      this.f.setOnTouchListener(this);
      this.f.setOnScrollListener(this);
      this.q = new OfflineMapManager(this.a, this);
      this.q.setOnOfflineLoadedListener(this);
      this.l();
      this.p = new gc(this.o, this.q, this.a);
      this.f.setAdapter(this.p);
      this.f.setOnGroupCollapseListener(this.p);
      this.f.setOnGroupExpandListener(this.p);
      this.f.setGroupIndicator((Drawable)null);
      if (this.t) {
         this.h.setBackgroundResource(2130837504);
         this.f.setVisibility(0);
      } else {
         this.h.setBackgroundResource(2130837508);
         this.f.setVisibility(8);
      }

      if (this.u) {
         this.g.setBackgroundResource(2130837504);
         this.d.setVisibility(0);
      } else {
         this.g.setBackgroundResource(2130837508);
         this.d.setVisibility(8);
      }

   }

   private void j() {
      try {
         LayoutParams var1 = (LayoutParams)this.m.getLayoutParams();
         var1.leftMargin = this.a(18.0F);
         this.m.setLayoutParams(var1);
         this.i.setPadding(this.a(30.0F), 0, 0, 0);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public void a(View var1) {
      try {
         int var2 = var1.getId();
         if (var2 == 2131165205) {
            this.a.closeScr();
         } else if (var2 == 2131165184) {
            if (this.u) {
               this.d.setVisibility(8);
               this.g.setBackgroundResource(2130837508);
               this.u = false;
            } else {
               this.d.setVisibility(0);
               this.g.setBackgroundResource(2130837504);
               this.u = true;
            }
         } else if (var2 == 2131165189) {
            if (this.t) {
               this.p.b();
               this.h.setBackgroundResource(2130837508);
               this.t = false;
            } else {
               this.p.a();
               this.h.setBackgroundResource(2130837504);
               this.t = true;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public RelativeLayout c() {
      if (this.c == null) {
         this.c = (RelativeLayout)gk.a(this.a, 2130903044, (ViewGroup)null);
      }

      return this.c;
   }

   public void d() {
      this.q.destroy();
   }

   private void k() {
      this.l();
      this.s = new gd(this.o, this.q, this.a);
      this.e.setAdapter(this.s);
   }

   public void i() {
      this.r = new gb(this.a, this, this.q, this.o);
      this.d.setAdapter(this.r);
      this.r.notifyDataSetChanged();
   }

   public void a(OfflineMapCity var1) {
      try {
         if (this.x == null) {
            this.x = new ge(this.a, this.q);
         }

         this.x.a(var1.getState(), var1.getCity());
         this.x.show();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   private void l() {
      ArrayList var1 = this.q.getOfflineMapProvinceList();
      this.o.clear();
      this.o.add((Object)null);
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();

      OfflineMapProvince var6;
      for(int var5 = 0; var5 < var1.size(); ++var5) {
         var6 = (OfflineMapProvince)var1.get(var5);
         if (var6.getCityList().size() != 1) {
            this.o.add(var5 + 1, var6);
         } else {
            String var7 = var6.getProvinceName();
            if (var7.contains("香港")) {
               var3.addAll(var6.getCityList());
            } else if (var7.contains("澳门")) {
               var3.addAll(var6.getCityList());
            } else if (var7.contains("全国概要图")) {
               var4.addAll(0, var6.getCityList());
            } else {
               var4.addAll(var6.getCityList());
            }
         }
      }

      OfflineMapProvince var8 = new OfflineMapProvince();
      var8.setProvinceName("基本功能包+直辖市");
      var8.setCityList(var4);
      this.o.set(0, var8);
      var6 = new OfflineMapProvince();
      var6.setProvinceName("直辖市");
      var6.setCityList(var2);
      OfflineMapProvince var9 = new OfflineMapProvince();
      var9.setProvinceName("港澳");
      var9.setCityList(var3);
      this.o.add(var9);
   }

   public void onDownload(int var1, int var2, String var3) {
      try {
         switch(var1) {
         case 101:
            Toast.makeText(this.a, "网络异常", 0).show();
            this.q.pause();
         case -1:
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 102:
         case 103:
         default:
            if (var1 == 2) {
               this.r.a();
            }

            if (this.v != var1) {
               if (this.p != null) {
                  this.p.notifyDataSetChanged();
               }

               if (this.r != null) {
                  this.r.notifyDataSetChanged();
               }

               if (this.s != null) {
                  this.s.notifyDataSetChanged();
               }

               this.v = var1;
            } else {
               short var4 = 1200;
               if (System.currentTimeMillis() - this.w > (long)var4) {
                  Log.i("SHIXIN", "UPDATE_DOWNLOAD_LIST");
                  if (this.y) {
                     this.r.notifyDataSetChanged();
                  }

                  this.w = System.currentTimeMillis();
               }
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void onCheckUpdate(boolean var1, String var2) {
   }

   public void onRemove(boolean var1, String var2, String var3) {
      if (this.r != null) {
         this.r.b();
      }

   }

   public void onVerifyComplete() {
      this.k();
      this.i();
   }

   public boolean b() {
      try {
         if (this.e.getVisibility() == 0) {
            this.i.setText("");
            this.l.setVisibility(8);
            this.a(false);
            return false;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      return super.b();
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      this.m();
      if (var1.getId() == 2131165208) {
         this.j();
      }

      return false;
   }

   public void beforeTextChanged(CharSequence var1, int var2, int var3, int var4) {
   }

   public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      if (TextUtils.isEmpty(var1)) {
         this.a(false);
         this.l.setVisibility(8);
      } else {
         this.l.setVisibility(0);
         ArrayList var5 = new ArrayList();
         if (this.o != null && this.o.size() > 0) {
            ArrayList var6 = new ArrayList();
            Iterator var7 = this.o.iterator();

            while(var7.hasNext()) {
               OfflineMapProvince var8 = (OfflineMapProvince)var7.next();
               var6.addAll(var8.getCityList());
            }

            var7 = var6.iterator();

            label41:
            while(true) {
               while(true) {
                  if (!var7.hasNext()) {
                     break label41;
                  }

                  OfflineMapCity var12 = (OfflineMapCity)var7.next();
                  String var9 = var12.getCity();
                  String var10 = var12.getPinyin();
                  String var11 = var12.getJianpin();
                  if (var1.length() == 1) {
                     if (var11.startsWith(String.valueOf(var1))) {
                        var5.add(var12);
                     }
                  } else if (var11.startsWith(String.valueOf(var1)) || var10.startsWith(String.valueOf(var1)) || var9.startsWith(String.valueOf(var1))) {
                     var5.add(var12);
                  }
               }
            }
         }

         if (var5.size() > 0) {
            this.a(true);
            Collections.sort(var5, new gi$2(this));
            this.s.a((List)var5);
            this.s.notifyDataSetChanged();
         } else {
            Toast.makeText(this.a, "未找到相关城市", 0).show();
         }

      }
   }

   public void afterTextChanged(Editable var1) {
   }

   public void a(boolean var1) {
      if (var1) {
         this.j.setVisibility(8);
         this.k.setVisibility(8);
         this.d.setVisibility(8);
         this.f.setVisibility(8);
         this.n.setVisibility(8);
         this.e.setVisibility(0);
      } else {
         this.j.setVisibility(0);
         this.k.setVisibility(0);
         this.n.setVisibility(0);
         this.d.setVisibility(this.u ? 0 : 8);
         this.f.setVisibility(this.t ? 0 : 8);
         this.e.setVisibility(8);
      }

   }

   private void m() {
      if (this.i != null && this.i.isFocused()) {
         this.i.clearFocus();
         InputMethodManager var1 = (InputMethodManager)this.a.getSystemService("input_method");
         boolean var2 = false;
         if (var1 != null) {
            var2 = var1.isActive();
         }

         if (var2) {
            var1.hideSoftInputFromWindow(this.i.getWindowToken(), 2);
         }
      }

   }

   public void onScrollStateChanged(AbsListView var1, int var2) {
      byte var3 = 2;
      if (var2 == var3) {
         this.y = false;
      } else {
         this.y = true;
      }

   }

   public void onScroll(AbsListView var1, int var2, int var3, int var4) {
   }
}
