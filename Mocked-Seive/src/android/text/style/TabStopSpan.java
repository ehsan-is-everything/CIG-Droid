/*    */ package android.text.style;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface TabStopSpan
/*    */   extends ParagraphStyle
/*    */ {
/*    */   public abstract int getTabStop();
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static class Standard
/*    */     implements TabStopSpan
/*    */   {
/* 24 */     public Standard(int where) { throw new RuntimeException("Stub!"); }
/* 25 */     public int getTabStop() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\style\TabStopSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */