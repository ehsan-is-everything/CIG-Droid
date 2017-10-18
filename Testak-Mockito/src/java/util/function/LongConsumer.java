/*    */ package java.util.function;
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
/*    */ @FunctionalInterface
/*    */ public abstract interface LongConsumer
/*    */ {
/*    */   public abstract void accept(long paramLong);
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
/*    */   public LongConsumer andThen(LongConsumer after)
/*    */   {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\function\LongConsumer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */