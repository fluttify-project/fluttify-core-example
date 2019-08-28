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
import java.util.List;

public class gc extends BaseExpandableListAdapter implements OnGroupCollapseListener, OnGroupExpandListener {
   private boolean[] a;
   private int b = -1;
   private List<OfflineMapProvince> c = null;
   private OfflineMapManager d;
   private Context e;

   public gc(List<OfflineMapProvince> var1, OfflineMapManager var2, Context var3) {
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.a = new boolean[var1.size()];
   }

   public int getGroupCount() {
      return this.b == -1 ? this.c.size() : this.b;
   }

   public Object getGroup(int var1) {
      return ((OfflineMapProvince)this.c.get(var1)).getProvinceName();
   }

   public long getGroupId(int var1) {
      return (long)var1;
   }

   public int getChildrenCount(int var1) {
      return this.a(var1) ? ((OfflineMapProvince)this.c.get(var1)).getCityList().size() : ((OfflineMapProvince)this.c.get(var1)).getCityList().size();
   }

   public Object getChild(int var1, int var2) {
      return null;
   }

   public long getChildId(int var1, int var2) {
      return (long)var2;
   }

   public boolean hasStableIds() {
      return true;
   }

   public View getGroupView(int var1, boolean var2, View var3, ViewGroup var4) {
      if (var3 == null) {
         var3 = (RelativeLayout)gk.a(this.e, 2130903043, (ViewGroup)null);
      }

      TextView var5 = (TextView)((View)var3).findViewById(2131165201);
      ImageView var6 = (ImageView)((View)var3).findViewById(2131165202);
      var5.setText(((OfflineMapProvince)this.c.get(var1)).getProvinceName());
      if (this.a[var1]) {
         var6.setImageDrawable(gk.a().getDrawable(2130837509));
      } else {
         var6.setImageDrawable(gk.a().getDrawable(2130837510));
      }

      return (View)var3;
   }

   public View getChildView(int var1, int var2, boolean var3, View var4, ViewGroup var5) {
      gc$a var6;
      gg var7;
      if (var4 != null) {
         var6 = (gc$a)var4.getTag();
      } else {
         var6 = new gc$a(this);
         var7 = new gg(this.e, this.d);
         var7.a(1);
         var4 = var7.a();
         var6.a = var7;
         var4.setTag(var6);
      }

      var7 = null;
      OfflineMapCity var8 = (OfflineMapCity)((OfflineMapProvince)this.c.get(var1)).getCityList().get(var2);
      var6.a.a(var8);
      return var4;
   }

   private boolean a(int var1) {
      return var1 != 0 && var1 != this.getGroupCount() - 1;
   }

   public boolean isChildSelectable(int var1, int var2) {
      return true;
   }

   public void a() {
      this.b = -1;
      this.notifyDataSetChanged();
   }

   public void b() {
      this.b = 0;
      this.notifyDataSetChanged();
   }

   public void onGroupCollapse(int var1) {
      this.a[var1] = false;
   }

   public void onGroupExpand(int var1) {
      this.a[var1] = true;
   }
}
