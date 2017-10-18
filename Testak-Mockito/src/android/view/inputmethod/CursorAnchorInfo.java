/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.graphics.Matrix;
/*    */ import android.graphics.RectF;
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
/*    */ public final class CursorAnchorInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setSelectionRange(int newStart, int newEnd) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setComposingText(int composingTextStart, CharSequence composingText) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setInsertionMarkerLocation(float horizontalPosition, float lineTop, float lineBaseline, float lineBottom, int flags) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder addCharacterBounds(int index, float left, float top, float right, float bottom, int flags) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setMatrix(Matrix matrix) { throw new RuntimeException("Stub!"); }
/* 29 */     public CursorAnchorInfo build() { throw new RuntimeException("Stub!"); }
/* 30 */     public void reset() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 32 */   public CursorAnchorInfo(Parcel source) { throw new RuntimeException("Stub!"); }
/* 33 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 34 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 36 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getSelectionStart() { throw new RuntimeException("Stub!"); }
/* 38 */   public int getSelectionEnd() { throw new RuntimeException("Stub!"); }
/* 39 */   public int getComposingTextStart() { throw new RuntimeException("Stub!"); }
/* 40 */   public CharSequence getComposingText() { throw new RuntimeException("Stub!"); }
/* 41 */   public int getInsertionMarkerFlags() { throw new RuntimeException("Stub!"); }
/* 42 */   public float getInsertionMarkerHorizontal() { throw new RuntimeException("Stub!"); }
/* 43 */   public float getInsertionMarkerTop() { throw new RuntimeException("Stub!"); }
/* 44 */   public float getInsertionMarkerBaseline() { throw new RuntimeException("Stub!"); }
/* 45 */   public float getInsertionMarkerBottom() { throw new RuntimeException("Stub!"); }
/* 46 */   public RectF getCharacterBounds(int index) { throw new RuntimeException("Stub!"); }
/* 47 */   public int getCharacterBoundsFlags(int index) { throw new RuntimeException("Stub!"); }
/* 48 */   public Matrix getMatrix() { throw new RuntimeException("Stub!"); }
/* 49 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 54 */   public static final Parcelable.Creator<CursorAnchorInfo> CREATOR = null;
/*    */   public static final int FLAG_HAS_INVISIBLE_REGION = 2;
/*    */   public static final int FLAG_HAS_VISIBLE_REGION = 1;
/*    */   public static final int FLAG_IS_RTL = 4;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\inputmethod\CursorAnchorInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */