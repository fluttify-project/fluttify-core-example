package com.amap.api.mapcore.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class gb extends BaseExpandableListAdapter implements OnGroupCollapseListener, OnGroupExpandListener {
   private boolean[] b;
   private Context c;
   private gg d;
   private List<OfflineMapProvince> e = new ArrayList();
   List<OfflineMapProvince> a = new ArrayList();
   private gi f;
   private OfflineMapManager g;

   public gb(Context var1, gi var2, OfflineMapManager var3, List<OfflineMapProvince> var4) {
      this.c = var1;
      this.f = var2;
      this.g = var3;
      if (var4 != null && var4.size() > 0) {
         this.e.clear();
         this.e.addAll(var4);
         Iterator var5 = this.e.iterator();

         while(var5.hasNext()) {
            OfflineMapProvince var6 = (OfflineMapProvince)var5.next();
            if (var6 != null && var6.getDownloadedCityList().size() > 0) {
               this.a.add(var6);
            }
         }
      }

      this.b = new boolean[this.a.size()];
   }

   public void a() {
      Iterator var1 = this.e.iterator();

      while(var1.hasNext()) {
         OfflineMapProvince var2 = (OfflineMapProvince)var1.next();
         if (var2.getDownloadedCityList().size() > 0 && !this.a.contains(var2)) {
            this.a.add(var2);
         }
      }

      this.b = new boolean[this.a.size()];
      this.notifyDataSetChanged();
   }

   public void b() {
      try {
         for(int var1 = this.a.size(); var1 > 0; --var1) {
            OfflineMapProvince var2 = (OfflineMapProvince)this.a.get(var1 - 1);
            if (var2.getDownloadedCityList().size() == 0) {
               this.a.remove(var2);
            }
         }

         this.b = new boolean[this.a.size()];
         this.notifyDataSetChanged();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public int getGroupCount() {
      return this.a.size();
   }

   public int getChildrenCount(int var1) {
      return ((OfflineMapProvince)this.a.get(var1)).getDownloadedCityList().size();
   }

   public Object getGroup(int var1) {
      return ((OfflineMapProvince)this.a.get(var1)).getProvinceName();
   }

   public Object getChild(int var1, int var2) {
      return ((OfflineMapProvince)this.a.get(var1)).getDownloadedCityList().get(var2);
   }

   public long getGroupId(int var1) {
      return (long)var1;
   }

   public long getChildId(int var1, int var2) {
      return (long)var2;
   }

   public boolean hasStableIds() {
      return false;
   }

   public View getGroupView(int var1, boolean var2, View var3, ViewGroup var4) {
      if (var3 == null) {
         var3 = (RelativeLayout)gk.a(this.c, 2130903043, (ViewGroup)null);
      }

      TextView var5 = (TextView)((View)var3).findViewById(2131165201);
      ImageView var6 = (ImageView)((View)var3).findViewById(2131165202);
      var5.setText(((OfflineMapProvince)this.a.get(var1)).getProvinceName());
      if (this.b[var1]) {
         var6.setImageDrawable(gk.a().getDrawable(2130837509));
      } else {
         var6.setImageDrawable(gk.a().getDrawable(2130837510));
      }

      return (View)var3;
   }

   public View getChildView(int var1, int var2, boolean var3, View var4, ViewGroup var5) {
      gb$a var6;
      if (var4 != null) {
         var6 = (gb$a)var4.getTag();
      } else {
         var6 = new gb$a(this);
         this.d = new gg(this.c, this.g);
         this.d.a(2);
         var4 = this.d.a();
         var6.a = this.d;
         var4.setTag(var6);
      }

      OfflineMapProvince var7 = (OfflineMapProvince)this.a.get(var1);
      int var8 = var7.getDownloadedCityList().size();
      if (var2 < var8) {
         OfflineMapCity var9 = (OfflineMapCity)var7.getDownloadedCityList().get(var2);
         var6.a.a(var9);
         var4.setOnClickListener(new gb$1(this, var9));
      }

      return var4;
   }

   public boolean isChildSelectable(int var1, int var2) {
      return true;
   }

   public void onGroupCollapse(int var1) {
      this.b[var1] = false;
   }

   public void onGroupExpand(int var1) {
      this.b[var1] = true;
   }
}
