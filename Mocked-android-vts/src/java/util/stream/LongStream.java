/*    */ package java.util.stream;
/*    */ 
/*    */ import java.util.OptionalLong;
/*    */ import java.util.function.LongBinaryOperator;
/*    */ import java.util.function.LongConsumer;
/*    */ import java.util.function.LongPredicate;
/*    */ import java.util.function.LongUnaryOperator;
/*    */ 
/*    */ public abstract interface LongStream
/*    */   extends BaseStream<Long, LongStream>
/*    */ {
/*    */   public abstract LongStream filter(LongPredicate paramLongPredicate);
/*    */   
/*    */   public abstract LongStream map(LongUnaryOperator paramLongUnaryOperator);
/*    */   
/*    */   public abstract <U> Stream<U> mapToObj(java.util.function.LongFunction<? extends U> paramLongFunction);
/*    */   
/*    */   public abstract IntStream mapToInt(java.util.function.LongToIntFunction paramLongToIntFunction);
/*    */   
/*    */   public abstract DoubleStream mapToDouble(java.util.function.LongToDoubleFunction paramLongToDoubleFunction);
/*    */   
/*    */   public abstract LongStream flatMap(java.util.function.LongFunction<? extends LongStream> paramLongFunction);
/*    */   
/*    */   public abstract LongStream distinct();
/*    */   
/*    */   public abstract LongStream sorted();
/*    */   
/*    */   public static abstract interface Builder
/*    */     extends LongConsumer
/*    */   {
/*    */     public abstract void accept(long paramLong);
/*    */     
/* 33 */     public Builder add(long t) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract LongStream build(); }
/*    */   
/*    */   public abstract LongStream peek(LongConsumer paramLongConsumer);
/*    */   
/*    */   public abstract LongStream limit(long paramLong);
/*    */   
/*    */   public abstract LongStream skip(long paramLong);
/*    */   
/*    */   public abstract void forEach(LongConsumer paramLongConsumer);
/*    */   
/*    */   public abstract void forEachOrdered(LongConsumer paramLongConsumer);
/*    */   
/*    */   public abstract long[] toArray();
/*    */   
/*    */   public abstract long reduce(long paramLong, LongBinaryOperator paramLongBinaryOperator);
/*    */   
/*    */   public abstract OptionalLong reduce(LongBinaryOperator paramLongBinaryOperator);
/*    */   public abstract <R> R collect(java.util.function.Supplier<R> paramSupplier, java.util.function.ObjLongConsumer<R> paramObjLongConsumer, java.util.function.BiConsumer<R, R> paramBiConsumer);
/*    */   public abstract long sum();
/*    */   public abstract OptionalLong min();
/*    */   public abstract OptionalLong max();
/*    */   public abstract long count();
/*    */   public abstract java.util.OptionalDouble average();
/*    */   public abstract java.util.LongSummaryStatistics summaryStatistics();
/*    */   public abstract boolean anyMatch(LongPredicate paramLongPredicate);
/*    */   public abstract boolean allMatch(LongPredicate paramLongPredicate);
/*    */   public abstract boolean noneMatch(LongPredicate paramLongPredicate);
/*    */   public abstract OptionalLong findFirst();
/*    */   public abstract OptionalLong findAny();
/*    */   public abstract DoubleStream asDoubleStream();
/*    */   public abstract Stream<Long> boxed();
/*    */   public abstract LongStream sequential();
/*    */   public abstract LongStream parallel();
/*    */   public abstract java.util.PrimitiveIterator.OfLong iterator();
/*    */   public abstract java.util.Spliterator.OfLong spliterator();
/* 70 */   public static Builder builder() { throw new RuntimeException("Stub!"); }
/* 71 */   public static LongStream empty() { throw new RuntimeException("Stub!"); }
/* 72 */   public static LongStream of(long t) { throw new RuntimeException("Stub!"); }
/* 73 */   public static LongStream of(long... values) { throw new RuntimeException("Stub!"); }
/* 74 */   public static LongStream iterate(long seed, LongUnaryOperator f) { throw new RuntimeException("Stub!"); }
/* 75 */   public static LongStream generate(java.util.function.LongSupplier s) { throw new RuntimeException("Stub!"); }
/* 76 */   public static LongStream range(long startInclusive, long endExclusive) { throw new RuntimeException("Stub!"); }
/* 77 */   public static LongStream rangeClosed(long startInclusive, long endInclusive) { throw new RuntimeException("Stub!"); }
/* 78 */   public static LongStream concat(LongStream a, LongStream b) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\stream\LongStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */