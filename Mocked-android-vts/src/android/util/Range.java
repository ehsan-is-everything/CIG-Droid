/*    */ package android.util;
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
/*    */ public final class Range<T extends Comparable<? super T>>
/*    */ {
/* 20 */   public Range(T lower, T upper) { throw new RuntimeException("Stub!"); }
/* 21 */   public static <T extends Comparable<? super T>> Range<T> create(T lower, T upper) { throw new RuntimeException("Stub!"); }
/* 22 */   public T getLower() { throw new RuntimeException("Stub!"); }
/* 23 */   public T getUpper() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean contains(T value) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean contains(Range<T> range) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 27 */   public T clamp(T value) { throw new RuntimeException("Stub!"); }
/* 28 */   public Range<T> intersect(Range<T> range) { throw new RuntimeException("Stub!"); }
/* 29 */   public Range<T> intersect(T lower, T upper) { throw new RuntimeException("Stub!"); }
/* 30 */   public Range<T> extend(Range<T> range) { throw new RuntimeException("Stub!"); }
/* 31 */   public Range<T> extend(T lower, T upper) { throw new RuntimeException("Stub!"); }
/* 32 */   public Range<T> extend(T value) { throw new RuntimeException("Stub!"); }
/* 33 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 34 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\util\Range.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */