/*    */ package android.icu.util;
/*    */ 
/*    */ public abstract interface ValueIterator
/*    */ {
/*    */   public abstract boolean next(Element paramElement);
/*    */   
/*    */   public abstract void reset();
/*    */   
/*    */   public abstract void setRange(int paramInt1, int paramInt2);
/*    */   
/*    */   public static final class Element {
/*    */     public int integer;
/*    */     public Object value;
/*    */     
/*    */     public Element() {
/* 16 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\util\ValueIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */