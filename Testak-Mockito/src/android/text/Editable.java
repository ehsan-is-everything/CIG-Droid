/*    */ package android.text;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface Editable
/*    */   extends CharSequence, GetChars, Spannable, Appendable
/*    */ {
/*    */   public abstract Editable replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4);
/*    */   
/*    */ 
/*    */   public abstract Editable replace(int paramInt1, int paramInt2, CharSequence paramCharSequence);
/*    */   
/*    */   public abstract Editable insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3);
/*    */   
/*    */   public abstract Editable insert(int paramInt, CharSequence paramCharSequence);
/*    */   
/*    */   public abstract Editable delete(int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract Editable append(CharSequence paramCharSequence);
/*    */   
/*    */   public static class Factory
/*    */   {
/* 23 */     public Factory() { throw new RuntimeException("Stub!"); }
/* 24 */     public static Factory getInstance() { throw new RuntimeException("Stub!"); }
/* 25 */     public Editable newEditable(CharSequence source) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public abstract Editable append(CharSequence paramCharSequence, int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract Editable append(char paramChar);
/*    */   
/*    */   public abstract void clear();
/*    */   
/*    */   public abstract void clearSpans();
/*    */   
/*    */   public abstract void setFilters(InputFilter[] paramArrayOfInputFilter);
/*    */   
/*    */   public abstract InputFilter[] getFilters();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\Editable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */