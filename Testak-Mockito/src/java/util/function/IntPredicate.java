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
/*    */ 
/*    */ @FunctionalInterface
/*    */ public abstract interface IntPredicate
/*    */ {
/*    */   public abstract boolean test(int paramInt);
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
/* 30 */   public IntPredicate and(IntPredicate other) { throw new RuntimeException("Stub!"); }
/* 31 */   public IntPredicate negate() { throw new RuntimeException("Stub!"); }
/* 32 */   public IntPredicate or(IntPredicate other) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\function\IntPredicate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */