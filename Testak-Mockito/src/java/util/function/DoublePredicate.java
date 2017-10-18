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
/*    */ public abstract interface DoublePredicate
/*    */ {
/*    */   public abstract boolean test(double paramDouble);
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
/* 30 */   public DoublePredicate and(DoublePredicate other) { throw new RuntimeException("Stub!"); }
/* 31 */   public DoublePredicate negate() { throw new RuntimeException("Stub!"); }
/* 32 */   public DoublePredicate or(DoublePredicate other) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\function\DoublePredicate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */