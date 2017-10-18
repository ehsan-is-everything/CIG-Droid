/*    */ package java.util;
/*    */ 
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.DoubleConsumer;
/*    */ import java.util.function.IntConsumer;
/*    */ import java.util.function.LongConsumer;
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
/*    */ public abstract interface PrimitiveIterator<T, T_CONS>
/*    */   extends Iterator<T>
/*    */ {
/*    */   public abstract void forEachRemaining(T_CONS paramT_CONS);
/*    */   
/*    */   public static abstract interface OfInt
/*    */     extends PrimitiveIterator<Integer, IntConsumer>
/*    */   {
/*    */     public abstract int nextInt();
/*    */     
/* 33 */     public void forEachRemaining(IntConsumer action) { throw new RuntimeException("Stub!"); }
/* 34 */     public Integer next() { throw new RuntimeException("Stub!"); }
/* 35 */     public void forEachRemaining(Consumer<? super Integer> action) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract interface OfLong extends PrimitiveIterator<Long, LongConsumer> {
/*    */     public abstract long nextLong();
/*    */     
/* 41 */     public void forEachRemaining(LongConsumer action) { throw new RuntimeException("Stub!"); }
/* 42 */     public Long next() { throw new RuntimeException("Stub!"); }
/* 43 */     public void forEachRemaining(Consumer<? super Long> action) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract interface OfDouble extends PrimitiveIterator<Double, DoubleConsumer> {
/*    */     public abstract double nextDouble();
/*    */     
/* 49 */     public void forEachRemaining(DoubleConsumer action) { throw new RuntimeException("Stub!"); }
/* 50 */     public Double next() { throw new RuntimeException("Stub!"); }
/* 51 */     public void forEachRemaining(Consumer<? super Double> action) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\PrimitiveIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */