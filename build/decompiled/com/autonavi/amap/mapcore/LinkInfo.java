package com.autonavi.amap.mapcore;

public class LinkInfo {
   private int state = 0;
   private int time = 0;
   private int length = 0;

   public LinkInfo() {
   }

   public int getState() {
      return this.state;
   }

   public void setState(int var1) {
      this.state = var1;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int var1) {
      this.time = var1;
   }

   public int getLength() {
      return this.length;
   }

   public void setLength(int var1) {
      this.length = var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("状态：").append(this.state).append("|");
      var1.append("时间：").append(this.time).append("|");
      var1.append("长度：").append(this.length);
      return var1.toString();
   }
}
