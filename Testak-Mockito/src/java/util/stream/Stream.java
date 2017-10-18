/*    */ package java.util.stream;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import java.util.function.BinaryOperator;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ public abstract interface Stream<T>
/*    */   extends BaseStream<T, Stream<T>>
/*    */ {
/*    */   public abstract Stream<T> filter(Predicate<? super T> paramPredicate);
/*    */   
/*    */   public abstract <R> Stream<R> map(Function<? super T, ? extends R> paramFunction);
/*    */   
/*    */   public abstract IntStream mapToInt(java.util.function.ToIntFunction<? super T> paramToIntFunction);
/*    */   
/*    */   public abstract LongStream mapToLong(java.util.function.ToLongFunction<? super T> paramToLongFunction);
/*    */   
/*    */   public abstract DoubleStream mapToDouble(java.util.function.ToDoubleFunction<? super T> paramToDoubleFunction);
/*    */   
/*    */   public abstract <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> paramFunction);
/*    */   
/*    */   public abstract IntStream flatMapToInt(Function<? super T, ? extends IntStream> paramFunction);
/*    */   
/*    */   public abstract LongStream flatMapToLong(Function<? super T, ? extends LongStream> paramFunction);
/*    */   
/*    */   public static abstract interface Builder<T>
/*    */     extends Consumer<T>
/*    */   {
/*    */     public abstract void accept(T paramT);
/*    */     
/* 33 */     public Builder<T> add(T t) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract Stream<T> build(); }
/*    */   
/*    */   public abstract DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> paramFunction);
/*    */   
/*    */   public abstract Stream<T> distinct();
/*    */   
/*    */   public abstract Stream<T> sorted();
/*    */   
/*    */   public abstract Stream<T> sorted(Comparator<? super T> paramComparator);
/*    */   
/*    */   public abstract Stream<T> peek(Consumer<? super T> paramConsumer);
/*    */   
/*    */   public abstract Stream<T> limit(long paramLong);
/*    */   
/*    */   public abstract Stream<T> skip(long paramLong);
/*    */   
/*    */   public abstract void forEach(Consumer<? super T> paramConsumer);
/*    */   public abstract void forEachOrdered(Consumer<? super T> paramConsumer);
/*    */   public abstract Object[] toArray();
/*    */   public abstract <A> A[] toArray(java.util.function.IntFunction<A[]> paramIntFunction);
/*    */   public abstract T reduce(T paramT, BinaryOperator<T> paramBinaryOperator);
/*    */   public abstract java.util.Optional<T> reduce(BinaryOperator<T> paramBinaryOperator);
/*    */   public abstract <U> U reduce(U paramU, java.util.function.BiFunction<U, ? super T, U> paramBiFunction, BinaryOperator<U> paramBinaryOperator);
/*    */   public abstract <R> R collect(java.util.function.Supplier<R> paramSupplier, java.util.function.BiConsumer<R, ? super T> paramBiConsumer, java.util.function.BiConsumer<R, R> paramBiConsumer1);
/*    */   public abstract <R, A> R collect(Collector<? super T, A, R> paramCollector);
/*    */   public abstract java.util.Optional<T> min(Comparator<? super T> paramComparator);
/*    */   public abstract java.util.Optional<T> max(Comparator<? super T> paramComparator);
/*    */   public abstract long count();
/*    */   public abstract boolean anyMatch(Predicate<? super T> paramPredicate);
/*    */   public abstract boolean allMatch(Predicate<? super T> paramPredicate);
/*    */   public abstract boolean noneMatch(Predicate<? super T> paramPredicate);
/*    */   public abstract java.util.Optional<T> findFirst();
/*    */   public abstract java.util.Optional<T> findAny();
/* 68 */   public static <T> Builder<T> builder() { throw new RuntimeException("Stub!"); }
/* 69 */   public static <T> Stream<T> empty() { throw new RuntimeException("Stub!"); }
/* 70 */   public static <T> Stream<T> of(T t) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @SafeVarargs
/* 73 */   public static <T> Stream<T> of(T... values) { throw new RuntimeException("Stub!"); }
/* 74 */   public static <T> Stream<T> iterate(T seed, java.util.function.UnaryOperator<T> f) { throw new RuntimeException("Stub!"); }
/* 75 */   public static <T> Stream<T> generate(java.util.function.Supplier<T> s) { throw new RuntimeException("Stub!"); }
/* 76 */   public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\stream\Stream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */