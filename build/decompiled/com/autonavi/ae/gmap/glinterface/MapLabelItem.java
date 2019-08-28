package com.autonavi.ae.gmap.glinterface;

public class MapLabelItem {
   public static final int LABEL_TYPE_NORMAL = 0;
   public static final int LABEL_TYPE_SCENIC = 1;
   public static final int LABEL_TYPE_INDOOR = 2;
   public static final int LABEL_TYPE_SEARCH_RESULT = 3;
   public static final int LABEL_TYPE_OPENLAYER = 6;
   public String name;
   public String poiid;
   public int x;
   public int y;
   public int angle;
   public int strWidth;
   public int strHeight;
   public int iconID;
   public int labelx;
   public int labely;
   public int pixel20X;
   public int pixel20Y;
   public int pixel20Z;
   public int fontColor;
   public int borderColor;
   public int type;
   public int anchor;
   public int fontSize;
   public int mSublayerId;
   public boolean mIsFouces;
   public int timeStamp = 0;

   public MapLabelItem() {
   }
}
