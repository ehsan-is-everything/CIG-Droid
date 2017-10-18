/*    */ package android.text.style;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.text.Layout.Alignment;
/*    */ import android.text.ParcelableSpan;
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
/*    */ public abstract interface AlignmentSpan
/*    */   extends ParagraphStyle
/*    */ {
/*    */   public abstract Layout.Alignment getAlignment();
/*    */   
/*    */   public static class Standard
/*    */     implements AlignmentSpan, ParcelableSpan
/*    */   {
/* 24 */     public Standard(Layout.Alignment align) { throw new RuntimeException("Stub!"); }
/* 25 */     public Standard(Parcel src) { throw new RuntimeException("Stub!"); }
/* 26 */     public int getSpanTypeId() { throw new RuntimeException("Stub!"); }
/* 27 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 29 */     public Layout.Alignment getAlignment() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\style\AlignmentSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */