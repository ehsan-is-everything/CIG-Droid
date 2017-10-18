/*    */ package android.text.style;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Paint;
/*    */ import android.os.Parcel;
/*    */ import android.text.Layout;
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
/*    */ 
/*    */ public abstract interface LeadingMarginSpan
/*    */   extends ParagraphStyle
/*    */ {
/*    */   public abstract int getLeadingMargin(boolean paramBoolean);
/*    */   
/*    */   public abstract void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout);
/*    */   
/*    */   public static class Standard
/*    */     implements LeadingMarginSpan, ParcelableSpan
/*    */   {
/* 29 */     public Standard(int first, int rest) { throw new RuntimeException("Stub!"); }
/* 30 */     public Standard(int every) { throw new RuntimeException("Stub!"); }
/* 31 */     public Standard(Parcel src) { throw new RuntimeException("Stub!"); }
/* 32 */     public int getSpanTypeId() { throw new RuntimeException("Stub!"); }
/* 33 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 34 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 35 */     public int getLeadingMargin(boolean first) { throw new RuntimeException("Stub!"); }
/* 36 */     public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract interface LeadingMarginSpan2
/*    */     extends LeadingMarginSpan, WrapTogetherSpan
/*    */   {
/*    */     public abstract int getLeadingMarginLineCount();
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\style\LeadingMarginSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */