/*    */ package android.graphics;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Rect
/*    */   implements Parcelable
/*    */ {
/* 21 */   public Rect() { throw new RuntimeException("Stub!"); }
/* 22 */   public Rect(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 23 */   public Rect(Rect r) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 25 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 27 */   public String toShortString() { throw new RuntimeException("Stub!"); }
/* 28 */   public String flattenToString() { throw new RuntimeException("Stub!"); }
/* 29 */   public static Rect unflattenFromString(String str) { throw new RuntimeException("Stub!"); }
/* 30 */   public final boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 31 */   public final int width() { throw new RuntimeException("Stub!"); }
/* 32 */   public final int height() { throw new RuntimeException("Stub!"); }
/* 33 */   public final int centerX() { throw new RuntimeException("Stub!"); }
/* 34 */   public final int centerY() { throw new RuntimeException("Stub!"); }
/* 35 */   public final float exactCenterX() { throw new RuntimeException("Stub!"); }
/* 36 */   public final float exactCenterY() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setEmpty() { throw new RuntimeException("Stub!"); }
/* 38 */   public void set(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 39 */   public void set(Rect src) { throw new RuntimeException("Stub!"); }
/* 40 */   public void offset(int dx, int dy) { throw new RuntimeException("Stub!"); }
/* 41 */   public void offsetTo(int newLeft, int newTop) { throw new RuntimeException("Stub!"); }
/* 42 */   public void inset(int dx, int dy) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean contains(int x, int y) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean contains(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean contains(Rect r) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean intersect(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean intersect(Rect r) { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean setIntersect(Rect a, Rect b) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean intersects(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 50 */   public static boolean intersects(Rect a, Rect b) { throw new RuntimeException("Stub!"); }
/* 51 */   public void union(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 52 */   public void union(Rect r) { throw new RuntimeException("Stub!"); }
/* 53 */   public void union(int x, int y) { throw new RuntimeException("Stub!"); }
/* 54 */   public void sort() { throw new RuntimeException("Stub!"); }
/* 55 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 56 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 57 */   public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 63 */   public static final Parcelable.Creator<Rect> CREATOR = null;
/*    */   public int bottom;
/*    */   public int left;
/*    */   public int right;
/*    */   public int top;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\Rect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */