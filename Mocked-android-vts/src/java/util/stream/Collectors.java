/*    */ package java.util.stream;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Comparator;
/*    */ import java.util.DoubleSummaryStatistics;
/*    */ import java.util.IntSummaryStatistics;
/*    */ import java.util.List;
/*    */ import java.util.LongSummaryStatistics;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.Set;
/*    */ import java.util.concurrent.ConcurrentMap;
/*    */ import java.util.function.BinaryOperator;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.function.Supplier;
/*    */ import java.util.function.ToDoubleFunction;
/*    */ import java.util.function.ToIntFunction;
/*    */ import java.util.function.ToLongFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Collectors
/*    */ {
/* 28 */   Collectors() { throw new RuntimeException("Stub!"); }
/* 29 */   public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> collectionFactory) { throw new RuntimeException("Stub!"); }
/* 30 */   public static <T> Collector<T, ?, List<T>> toList() { throw new RuntimeException("Stub!"); }
/* 31 */   public static <T> Collector<T, ?, Set<T>> toSet() { throw new RuntimeException("Stub!"); }
/* 32 */   public static Collector<CharSequence, ?, String> joining() { throw new RuntimeException("Stub!"); }
/* 33 */   public static Collector<CharSequence, ?, String> joining(CharSequence delimiter) { throw new RuntimeException("Stub!"); }
/* 34 */   public static Collector<CharSequence, ?, String> joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix) { throw new RuntimeException("Stub!"); }
/* 35 */   public static <T, U, A, R> Collector<T, ?, R> mapping(Function<? super T, ? extends U> mapper, Collector<? super U, A, R> downstream) { throw new RuntimeException("Stub!"); }
/* 36 */   public static <T, A, R, RR> Collector<T, A, RR> collectingAndThen(Collector<T, A, R> downstream, Function<R, RR> finisher) { throw new RuntimeException("Stub!"); }
/* 37 */   public static <T> Collector<T, ?, Long> counting() { throw new RuntimeException("Stub!"); }
/* 38 */   public static <T> Collector<T, ?, Optional<T>> minBy(Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); }
/* 39 */   public static <T> Collector<T, ?, Optional<T>> maxBy(Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); }
/* 40 */   public static <T> Collector<T, ?, Integer> summingInt(ToIntFunction<? super T> mapper) { throw new RuntimeException("Stub!"); }
/* 41 */   public static <T> Collector<T, ?, Long> summingLong(ToLongFunction<? super T> mapper) { throw new RuntimeException("Stub!"); }
/* 42 */   public static <T> Collector<T, ?, Double> summingDouble(ToDoubleFunction<? super T> mapper) { throw new RuntimeException("Stub!"); }
/* 43 */   public static <T> Collector<T, ?, Double> averagingInt(ToIntFunction<? super T> mapper) { throw new RuntimeException("Stub!"); }
/* 44 */   public static <T> Collector<T, ?, Double> averagingLong(ToLongFunction<? super T> mapper) { throw new RuntimeException("Stub!"); }
/* 45 */   public static <T> Collector<T, ?, Double> averagingDouble(ToDoubleFunction<? super T> mapper) { throw new RuntimeException("Stub!"); }
/* 46 */   public static <T> Collector<T, ?, T> reducing(T identity, BinaryOperator<T> op) { throw new RuntimeException("Stub!"); }
/* 47 */   public static <T> Collector<T, ?, Optional<T>> reducing(BinaryOperator<T> op) { throw new RuntimeException("Stub!"); }
/* 48 */   public static <T, U> Collector<T, ?, U> reducing(U identity, Function<? super T, ? extends U> mapper, BinaryOperator<U> op) { throw new RuntimeException("Stub!"); }
/* 49 */   public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> classifier) { throw new RuntimeException("Stub!"); }
/* 50 */   public static <T, K, A, D> Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier, Collector<? super T, A, D> downstream) { throw new RuntimeException("Stub!"); }
/* 51 */   public static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(Function<? super T, ? extends K> classifier, Supplier<M> mapFactory, Collector<? super T, A, D> downstream) { throw new RuntimeException("Stub!"); }
/* 52 */   public static <T, K> Collector<T, ?, ConcurrentMap<K, List<T>>> groupingByConcurrent(Function<? super T, ? extends K> classifier) { throw new RuntimeException("Stub!"); }
/* 53 */   public static <T, K, A, D> Collector<T, ?, ConcurrentMap<K, D>> groupingByConcurrent(Function<? super T, ? extends K> classifier, Collector<? super T, A, D> downstream) { throw new RuntimeException("Stub!"); }
/* 54 */   public static <T, K, A, D, M extends ConcurrentMap<K, D>> Collector<T, ?, M> groupingByConcurrent(Function<? super T, ? extends K> classifier, Supplier<M> mapFactory, Collector<? super T, A, D> downstream) { throw new RuntimeException("Stub!"); }
/* 55 */   public static <T> Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate) { throw new RuntimeException("Stub!"); }
/* 56 */   public static <T, D, A> Collector<T, ?, Map<Boolean, D>> partitioningBy(Predicate<? super T> predicate, Collector<? super T, A, D> downstream) { throw new RuntimeException("Stub!"); }
/* 57 */   public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper) { throw new RuntimeException("Stub!"); }
/* 58 */   public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper, BinaryOperator<U> mergeFunction) { throw new RuntimeException("Stub!"); }
/* 59 */   public static <T, K, U, M extends Map<K, U>> Collector<T, ?, M> toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier) { throw new RuntimeException("Stub!"); }
/* 60 */   public static <T, K, U> Collector<T, ?, ConcurrentMap<K, U>> toConcurrentMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper) { throw new RuntimeException("Stub!"); }
/* 61 */   public static <T, K, U> Collector<T, ?, ConcurrentMap<K, U>> toConcurrentMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper, BinaryOperator<U> mergeFunction) { throw new RuntimeException("Stub!"); }
/* 62 */   public static <T, K, U, M extends ConcurrentMap<K, U>> Collector<T, ?, M> toConcurrentMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier) { throw new RuntimeException("Stub!"); }
/* 63 */   public static <T> Collector<T, ?, IntSummaryStatistics> summarizingInt(ToIntFunction<? super T> mapper) { throw new RuntimeException("Stub!"); }
/* 64 */   public static <T> Collector<T, ?, LongSummaryStatistics> summarizingLong(ToLongFunction<? super T> mapper) { throw new RuntimeException("Stub!"); }
/* 65 */   public static <T> Collector<T, ?, DoubleSummaryStatistics> summarizingDouble(ToDoubleFunction<? super T> mapper) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\stream\Collectors.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */