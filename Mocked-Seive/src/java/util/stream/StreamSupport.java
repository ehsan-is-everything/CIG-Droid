/*    */ package java.util.stream;
/*    */ 
/*    */ import java.util.Spliterator;
/*    */ import java.util.Spliterator.OfDouble;
/*    */ import java.util.Spliterator.OfInt;
/*    */ import java.util.Spliterator.OfLong;
/*    */ import java.util.function.Supplier;
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
/*    */ public final class StreamSupport
/*    */ {
/* 28 */   StreamSupport() { throw new RuntimeException("Stub!"); }
/* 29 */   public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean parallel) { throw new RuntimeException("Stub!"); }
/* 30 */   public static <T> Stream<T> stream(Supplier<? extends Spliterator<T>> supplier, int characteristics, boolean parallel) { throw new RuntimeException("Stub!"); }
/* 31 */   public static IntStream intStream(Spliterator.OfInt spliterator, boolean parallel) { throw new RuntimeException("Stub!"); }
/* 32 */   public static IntStream intStream(Supplier<? extends Spliterator.OfInt> supplier, int characteristics, boolean parallel) { throw new RuntimeException("Stub!"); }
/* 33 */   public static LongStream longStream(Spliterator.OfLong spliterator, boolean parallel) { throw new RuntimeException("Stub!"); }
/* 34 */   public static LongStream longStream(Supplier<? extends Spliterator.OfLong> supplier, int characteristics, boolean parallel) { throw new RuntimeException("Stub!"); }
/* 35 */   public static DoubleStream doubleStream(Spliterator.OfDouble spliterator, boolean parallel) { throw new RuntimeException("Stub!"); }
/* 36 */   public static DoubleStream doubleStream(Supplier<? extends Spliterator.OfDouble> supplier, int characteristics, boolean parallel) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\stream\StreamSupport.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */