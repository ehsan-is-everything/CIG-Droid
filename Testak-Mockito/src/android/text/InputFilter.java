/*    */ package android.text;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface InputFilter
/*    */ {
/*    */   public abstract CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4);
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static class AllCaps
/*    */     implements InputFilter
/*    */   {
/* 23 */     public AllCaps() { throw new RuntimeException("Stub!"); }
/* 24 */     public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class LengthFilter
/*    */     implements InputFilter {
/* 29 */     public LengthFilter(int max) { throw new RuntimeException("Stub!"); }
/* 30 */     public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
/* 31 */     public int getMax() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\InputFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */