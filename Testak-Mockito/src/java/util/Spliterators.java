/*    */ package java.util;
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
/*    */ 
/*    */ 
/*    */ public final class Spliterators
/*    */ {
/*    */   public static abstract class AbstractSpliterator<T>
/*    */     implements Spliterator<T>
/*    */   {
/* 31 */     protected AbstractSpliterator(long est, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 32 */     public Spliterator<T> trySplit() { throw new RuntimeException("Stub!"); }
/* 33 */     public long estimateSize() { throw new RuntimeException("Stub!"); }
/* 34 */     public int characteristics() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class AbstractIntSpliterator
/*    */     implements Spliterator.OfInt {
/* 39 */     protected AbstractIntSpliterator(long est, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 40 */     public Spliterator.OfInt trySplit() { throw new RuntimeException("Stub!"); }
/* 41 */     public long estimateSize() { throw new RuntimeException("Stub!"); }
/* 42 */     public int characteristics() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class AbstractLongSpliterator
/*    */     implements Spliterator.OfLong {
/* 47 */     protected AbstractLongSpliterator(long est, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 48 */     public Spliterator.OfLong trySplit() { throw new RuntimeException("Stub!"); }
/* 49 */     public long estimateSize() { throw new RuntimeException("Stub!"); }
/* 50 */     public int characteristics() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class AbstractDoubleSpliterator
/*    */     implements Spliterator.OfDouble {
/* 55 */     protected AbstractDoubleSpliterator(long est, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 56 */     public Spliterator.OfDouble trySplit() { throw new RuntimeException("Stub!"); }
/* 57 */     public long estimateSize() { throw new RuntimeException("Stub!"); }
/* 58 */     public int characteristics() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 60 */   Spliterators() { throw new RuntimeException("Stub!"); }
/*    */   
/* 62 */   public static <T> Spliterator<T> emptySpliterator() { throw new RuntimeException("Stub!"); }
/* 63 */   public static Spliterator.OfInt emptyIntSpliterator() { throw new RuntimeException("Stub!"); }
/* 64 */   public static Spliterator.OfLong emptyLongSpliterator() { throw new RuntimeException("Stub!"); }
/* 65 */   public static Spliterator.OfDouble emptyDoubleSpliterator() { throw new RuntimeException("Stub!"); }
/* 66 */   public static <T> Spliterator<T> spliterator(Object[] array, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 67 */   public static <T> Spliterator<T> spliterator(Object[] array, int fromIndex, int toIndex, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 68 */   public static Spliterator.OfInt spliterator(int[] array, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 69 */   public static Spliterator.OfInt spliterator(int[] array, int fromIndex, int toIndex, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 70 */   public static Spliterator.OfLong spliterator(long[] array, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 71 */   public static Spliterator.OfLong spliterator(long[] array, int fromIndex, int toIndex, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 72 */   public static Spliterator.OfDouble spliterator(double[] array, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 73 */   public static Spliterator.OfDouble spliterator(double[] array, int fromIndex, int toIndex, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
/* 74 */   public static <T> Spliterator<T> spliterator(Collection<? extends T> c, int characteristics) { throw new RuntimeException("Stub!"); }
/* 75 */   public static <T> Spliterator<T> spliterator(Iterator<? extends T> iterator, long size, int characteristics) { throw new RuntimeException("Stub!"); }
/* 76 */   public static <T> Spliterator<T> spliteratorUnknownSize(Iterator<? extends T> iterator, int characteristics) { throw new RuntimeException("Stub!"); }
/* 77 */   public static Spliterator.OfInt spliterator(PrimitiveIterator.OfInt iterator, long size, int characteristics) { throw new RuntimeException("Stub!"); }
/* 78 */   public static Spliterator.OfInt spliteratorUnknownSize(PrimitiveIterator.OfInt iterator, int characteristics) { throw new RuntimeException("Stub!"); }
/* 79 */   public static Spliterator.OfLong spliterator(PrimitiveIterator.OfLong iterator, long size, int characteristics) { throw new RuntimeException("Stub!"); }
/* 80 */   public static Spliterator.OfLong spliteratorUnknownSize(PrimitiveIterator.OfLong iterator, int characteristics) { throw new RuntimeException("Stub!"); }
/* 81 */   public static Spliterator.OfDouble spliterator(PrimitiveIterator.OfDouble iterator, long size, int characteristics) { throw new RuntimeException("Stub!"); }
/* 82 */   public static Spliterator.OfDouble spliteratorUnknownSize(PrimitiveIterator.OfDouble iterator, int characteristics) { throw new RuntimeException("Stub!"); }
/* 83 */   public static <T> Iterator<T> iterator(Spliterator<? extends T> spliterator) { throw new RuntimeException("Stub!"); }
/* 84 */   public static PrimitiveIterator.OfInt iterator(Spliterator.OfInt spliterator) { throw new RuntimeException("Stub!"); }
/* 85 */   public static PrimitiveIterator.OfLong iterator(Spliterator.OfLong spliterator) { throw new RuntimeException("Stub!"); }
/* 86 */   public static PrimitiveIterator.OfDouble iterator(Spliterator.OfDouble spliterator) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Spliterators.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */