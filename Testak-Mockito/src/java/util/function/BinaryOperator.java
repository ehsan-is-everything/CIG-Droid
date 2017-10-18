/*    */ package java.util.function;
/*    */ 
/*    */ import java.util.Comparator;
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
/*    */ public abstract interface BinaryOperator<T>
/*    */   extends BiFunction<T, T, T>
/*    */ {
/* 30 */   public static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); }
/* 31 */   public static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\function\BinaryOperator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */