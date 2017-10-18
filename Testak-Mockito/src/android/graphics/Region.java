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
/*    */ public class Region
/*    */   implements Parcelable
/*    */ {
/*    */   public static enum Op
/*    */   {
/* 23 */     DIFFERENCE, 
/* 24 */     INTERSECT, 
/* 25 */     REPLACE, 
/* 26 */     REVERSE_DIFFERENCE, 
/* 27 */     UNION, 
/* 28 */     XOR;
/*    */     private Op() {} }
/* 30 */   public Region() { throw new RuntimeException("Stub!"); }
/* 31 */   public Region(Region region) { throw new RuntimeException("Stub!"); }
/* 32 */   public Region(Rect r) { throw new RuntimeException("Stub!"); }
/* 33 */   public Region(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setEmpty() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean set(Region region) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean set(Rect r) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean set(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean setPath(Path path, Region clip) { throw new RuntimeException("Stub!"); }
/*    */   public native boolean isEmpty();
/*    */   public native boolean isRect();
/*    */   public native boolean isComplex();
/* 42 */   public Rect getBounds() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean getBounds(Rect r) { throw new RuntimeException("Stub!"); }
/* 44 */   public Path getBoundaryPath() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean getBoundaryPath(Path path) { throw new RuntimeException("Stub!"); }
/*    */   public native boolean contains(int paramInt1, int paramInt2);
/* 47 */   public boolean quickContains(Rect r) { throw new RuntimeException("Stub!"); }
/*    */   public native boolean quickContains(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/* 49 */   public boolean quickReject(Rect r) { throw new RuntimeException("Stub!"); }
/*    */   public native boolean quickReject(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   public native boolean quickReject(Region paramRegion);
/* 52 */   public void translate(int dx, int dy) { throw new RuntimeException("Stub!"); }
/*    */   public native void translate(int paramInt1, int paramInt2, Region paramRegion);
/* 54 */   public final boolean union(Rect r) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean op(Rect r, Op op) { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean op(int left, int top, int right, int bottom, Op op) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean op(Region region, Op op) { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean op(Rect rect, Region region, Op op) { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean op(Region region1, Region region2, Op op) { throw new RuntimeException("Stub!"); }
/* 60 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 61 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 62 */   public void writeToParcel(Parcel p, int flags) { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 64 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */   
/* 66 */   public static final Parcelable.Creator<Region> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\Region.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */