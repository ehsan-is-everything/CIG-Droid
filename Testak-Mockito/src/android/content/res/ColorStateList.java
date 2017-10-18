/*    */ package android.content.res;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ColorStateList
/*    */   implements Parcelable
/*    */ {
/* 21 */   public ColorStateList(int[][] states, int[] colors) { throw new RuntimeException("Stub!"); }
/* 22 */   public static ColorStateList valueOf(int color) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 24 */   public static ColorStateList createFromXml(Resources r, XmlPullParser parser) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public static ColorStateList createFromXml(Resources r, XmlPullParser parser, Resources.Theme theme) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public ColorStateList withAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getColorForState(int[] stateSet, int defaultColor) { throw new RuntimeException("Stub!"); }
/* 31 */   public int getDefaultColor() { throw new RuntimeException("Stub!"); }
/* 32 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 36 */   public static final Parcelable.Creator<ColorStateList> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\res\ColorStateList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */