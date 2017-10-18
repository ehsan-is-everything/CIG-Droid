/*    */ package java.util;
/*    */ 
/*    */ import java.util.function.Function;
/*    */ import java.util.function.ToDoubleFunction;
/*    */ import java.util.function.ToIntFunction;
/*    */ import java.util.function.ToLongFunction;
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
/*    */ public abstract interface Comparator<T>
/*    */ {
/*    */   public abstract int compare(T paramT1, T paramT2);
/*    */   
/*    */   public abstract boolean equals(Object paramObject);
/*    */   
/* 32 */   public Comparator<T> reversed() { throw new RuntimeException("Stub!"); }
/* 33 */   public Comparator<T> thenComparing(Comparator<? super T> other) { throw new RuntimeException("Stub!"); }
/* 34 */   public <U> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor, Comparator<? super U> keyComparator) { throw new RuntimeException("Stub!"); }
/* 35 */   public <U extends Comparable<? super U>> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor) { throw new RuntimeException("Stub!"); }
/* 36 */   public Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
/* 37 */   public Comparator<T> thenComparingLong(ToLongFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
/* 38 */   public Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
/* 39 */   public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() { throw new RuntimeException("Stub!"); }
/*    */   
/* 41 */   public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() { throw new RuntimeException("Stub!"); }
/* 42 */   public static <T> Comparator<T> nullsFirst(Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); }
/* 43 */   public static <T> Comparator<T> nullsLast(Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); }
/* 44 */   public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor, Comparator<? super U> keyComparator) { throw new RuntimeException("Stub!"); }
/* 45 */   public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor) { throw new RuntimeException("Stub!"); }
/* 46 */   public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
/* 47 */   public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
/* 48 */   public static <T> Comparator<T> comparingDouble(ToDoubleFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Comparator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */