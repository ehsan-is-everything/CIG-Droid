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
/*    */ public abstract interface Spliterator<T>
/*    */ {
/*    */   public static final int CONCURRENT = 4096;
/*    */   public static final int DISTINCT = 1;
/*    */   public static final int IMMUTABLE = 1024;
/*    */   public static final int NONNULL = 256;
/*    */   public static final int ORDERED = 16;
/*    */   public static final int SIZED = 64;
/*    */   public static final int SORTED = 4;
/*    */   public static final int SUBSIZED = 16384;
/*    */   public abstract boolean tryAdvance(Consumer<? super T> paramConsumer);
/*    */   
/*    */   public static abstract interface OfPrimitive<T, T_CONS, T_SPLITR extends OfPrimitive<T, T_CONS, T_SPLITR>>
/*    */     extends Spliterator<T>
/*    */   {
/*    */     public abstract T_SPLITR trySplit();
/*    */     
/*    */     public abstract boolean tryAdvance(T_CONS paramT_CONS);
/*    */     
/* 35 */     public void forEachRemaining(T_CONS action) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract interface OfInt extends Spliterator.OfPrimitive<Integer, IntConsumer, OfInt> { public abstract OfInt trySplit();
/*    */     
/*    */     public abstract boolean tryAdvance(IntConsumer paramIntConsumer);
/*    */     
/* 42 */     public void forEachRemaining(IntConsumer action) { throw new RuntimeException("Stub!"); }
/* 43 */     public boolean tryAdvance(Consumer<? super Integer> action) { throw new RuntimeException("Stub!"); }
/* 44 */     public void forEachRemaining(Consumer<? super Integer> action) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract interface OfLong extends Spliterator.OfPrimitive<Long, LongConsumer, OfLong> { public abstract OfLong trySplit();
/*    */     
/*    */     public abstract boolean tryAdvance(LongConsumer paramLongConsumer);
/*    */     
/* 51 */     public void forEachRemaining(LongConsumer action) { throw new RuntimeException("Stub!"); }
/* 52 */     public boolean tryAdvance(Consumer<? super Long> action) { throw new RuntimeException("Stub!"); }
/* 53 */     public void forEachRemaining(Consumer<? super Long> action) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract interface OfDouble extends Spliterator.OfPrimitive<Double, DoubleConsumer, OfDouble> { public abstract OfDouble trySplit();
/*    */     
/*    */     public abstract boolean tryAdvance(DoubleConsumer paramDoubleConsumer);
/*    */     
/* 60 */     public void forEachRemaining(DoubleConsumer action) { throw new RuntimeException("Stub!"); }
/* 61 */     public boolean tryAdvance(Consumer<? super Double> action) { throw new RuntimeException("Stub!"); }
/* 62 */     public void forEachRemaining(Consumer<? super Double> action) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/* 65 */   public void forEachRemaining(Consumer<? super T> action) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Spliterator<T> trySplit();
/*    */   public abstract long estimateSize();
/* 68 */   public long getExactSizeIfKnown() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int characteristics();
/* 70 */   public boolean hasCharacteristics(int characteristics) { throw new RuntimeException("Stub!"); }
/* 71 */   public Comparator<? super T> getComparator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Spliterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */