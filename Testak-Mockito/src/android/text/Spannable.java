/*    */ package android.text;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface Spannable
/*    */   extends Spanned
/*    */ {
/*    */   public abstract void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public abstract void removeSpan(Object paramObject);
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static class Factory
/*    */   {
/* 23 */     public Factory() { throw new RuntimeException("Stub!"); }
/* 24 */     public static Factory getInstance() { throw new RuntimeException("Stub!"); }
/* 25 */     public Spannable newSpannable(CharSequence source) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\Spannable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */