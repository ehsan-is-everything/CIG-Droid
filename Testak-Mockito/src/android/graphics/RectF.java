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
/*    */ public class RectF
/*    */   implements Parcelable
/*    */ {
/* 21 */   public RectF() { throw new RuntimeException("Stub!"); }
/* 22 */   public RectF(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
/* 23 */   public RectF(RectF r) { throw new RuntimeException("Stub!"); }
/* 24 */   public RectF(Rect r) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 26 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 28 */   public String toShortString() { throw new RuntimeException("Stub!"); }
/* 29 */   public final boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 30 */   public final float width() { throw new RuntimeException("Stub!"); }
/* 31 */   public final float height() { throw new RuntimeException("Stub!"); }
/* 32 */   public final float centerX() { throw new RuntimeException("Stub!"); }
/* 33 */   public final float centerY() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setEmpty() { throw new RuntimeException("Stub!"); }
/* 35 */   public void set(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
/* 36 */   public void set(RectF src) { throw new RuntimeException("Stub!"); }
/* 37 */   public void set(Rect src) { throw new RuntimeException("Stub!"); }
/* 38 */   public void offset(float dx, float dy) { throw new RuntimeException("Stub!"); }
/* 39 */   public void offsetTo(float newLeft, float newTop) { throw new RuntimeException("Stub!"); }
/* 40 */   public void inset(float dx, float dy) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean contains(float x, float y) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean contains(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean contains(RectF r) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean intersect(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean intersect(RectF r) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean setIntersect(RectF a, RectF b) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean intersects(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
/* 48 */   public static boolean intersects(RectF a, RectF b) { throw new RuntimeException("Stub!"); }
/* 49 */   public void round(Rect dst) { throw new RuntimeException("Stub!"); }
/* 50 */   public void roundOut(Rect dst) { throw new RuntimeException("Stub!"); }
/* 51 */   public void union(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
/* 52 */   public void union(RectF r) { throw new RuntimeException("Stub!"); }
/* 53 */   public void union(float x, float y) { throw new RuntimeException("Stub!"); }
/* 54 */   public void sort() { throw new RuntimeException("Stub!"); }
/* 55 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 56 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 57 */   public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 63 */   public static final Parcelable.Creator<RectF> CREATOR = null;
/*    */   public float bottom;
/*    */   public float left;
/*    */   public float right;
/*    */   public float top;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\RectF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */