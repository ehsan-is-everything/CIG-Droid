/*    */ package java.util.stream;
/*    */ 
/*    */ import java.util.OptionalDouble;
/*    */ import java.util.function.DoubleBinaryOperator;
/*    */ import java.util.function.DoubleConsumer;
/*    */ import java.util.function.DoubleFunction;
/*    */ import java.util.function.DoublePredicate;
/*    */ 
/*    */ public abstract interface DoubleStream
/*    */   extends BaseStream<Double, DoubleStream>
/*    */ {
/*    */   public abstract DoubleStream filter(DoublePredicate paramDoublePredicate);
/*    */   
/*    */   public abstract DoubleStream map(java.util.function.DoubleUnaryOperator paramDoubleUnaryOperator);
/*    */   
/*    */   public abstract <U> Stream<U> mapToObj(DoubleFunction<? extends U> paramDoubleFunction);
/*    */   
/*    */   public abstract IntStream mapToInt(java.util.function.DoubleToIntFunction paramDoubleToIntFunction);
/*    */   
/*    */   public abstract LongStream mapToLong(java.util.function.DoubleToLongFunction paramDoubleToLongFunction);
/*    */   
/*    */   public abstract DoubleStream flatMap(DoubleFunction<? extends DoubleStream> paramDoubleFunction);
/*    */   
/*    */   public abstract DoubleStream distinct();
/*    */   
/*    */   public abstract DoubleStream sorted();
/*    */   
/*    */   public static abstract interface Builder
/*    */     extends DoubleConsumer
/*    */   {
/*    */     public abstract void accept(double paramDouble);
/*    */     
/* 33 */     public Builder add(double t) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract DoubleStream build(); }
/*    */   
/*    */   public abstract DoubleStream peek(DoubleConsumer paramDoubleConsumer);
/*    */   
/*    */   public abstract DoubleStream limit(long paramLong);
/*    */   
/*    */   public abstract DoubleStream skip(long paramLong);
/*    */   
/*    */   public abstract void forEach(DoubleConsumer paramDoubleConsumer);
/*    */   
/*    */   public abstract void forEachOrdered(DoubleConsumer paramDoubleConsumer);
/*    */   
/*    */   public abstract double[] toArray();
/*    */   
/*    */   public abstract double reduce(double paramDouble, DoubleBinaryOperator paramDoubleBinaryOperator);
/*    */   
/*    */   public abstract OptionalDouble reduce(DoubleBinaryOperator paramDoubleBinaryOperator);
/*    */   public abstract <R> R collect(java.util.function.Supplier<R> paramSupplier, java.util.function.ObjDoubleConsumer<R> paramObjDoubleConsumer, java.util.function.BiConsumer<R, R> paramBiConsumer);
/*    */   public abstract double sum();
/*    */   public abstract OptionalDouble min();
/*    */   public abstract OptionalDouble max();
/*    */   public abstract long count();
/*    */   public abstract OptionalDouble average();
/*    */   public abstract java.util.DoubleSummaryStatistics summaryStatistics();
/*    */   public abstract boolean anyMatch(DoublePredicate paramDoublePredicate);
/*    */   public abstract boolean allMatch(DoublePredicate paramDoublePredicate);
/*    */   public abstract boolean noneMatch(DoublePredicate paramDoublePredicate);
/*    */   public abstract OptionalDouble findFirst();
/*    */   public abstract OptionalDouble findAny();
/*    */   public abstract Stream<Double> boxed();
/*    */   public abstract DoubleStream sequential();
/*    */   public abstract DoubleStream parallel();
/*    */   public abstract java.util.PrimitiveIterator.OfDouble iterator();
/*    */   public abstract java.util.Spliterator.OfDouble spliterator();
/* 69 */   public static Builder builder() { throw new RuntimeException("Stub!"); }
/* 70 */   public static DoubleStream empty() { throw new RuntimeException("Stub!"); }
/* 71 */   public static DoubleStream of(double t) { throw new RuntimeException("Stub!"); }
/* 72 */   public static DoubleStream of(double... values) { throw new RuntimeException("Stub!"); }
/* 73 */   public static DoubleStream iterate(double seed, java.util.function.DoubleUnaryOperator f) { throw new RuntimeException("Stub!"); }
/* 74 */   public static DoubleStream generate(java.util.function.DoubleSupplier s) { throw new RuntimeException("Stub!"); }
/* 75 */   public static DoubleStream concat(DoubleStream a, DoubleStream b) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\stream\DoubleStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */