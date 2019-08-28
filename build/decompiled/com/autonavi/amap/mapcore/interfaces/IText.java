package com.autonavi.amap.mapcore.interfaces;

import android.graphics.Typeface;
import android.os.RemoteException;

public interface IText extends IOverlayImage {
   void setText(String var1) throws RemoteException;

   String getText() throws RemoteException;

   void setBackgroundColor(int var1) throws RemoteException;

   int getBackgroundColor() throws RemoteException;

   void setFontColor(int var1) throws RemoteException;

   int getFontColor() throws RemoteException;

   void setFontSize(int var1) throws RemoteException;

   int getFontSize() throws RemoteException;

   void setTypeface(Typeface var1) throws RemoteException;

   Typeface getTypeface() throws RemoteException;

   void setAlign(int var1, int var2) throws RemoteException;

   int getAlignX() throws RemoteException;

   int getAlignY() throws RemoteException;
}
