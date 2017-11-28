/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.stream.DoubleStream;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.LongStream;
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
/*    */ public class Random
/*    */   implements Serializable
/*    */ {
/* 30 */   public Random() { throw new RuntimeException("Stub!"); }
/* 31 */   public Random(long seed) { throw new RuntimeException("Stub!"); }
/* 32 */   public synchronized void setSeed(long seed) { throw new RuntimeException("Stub!"); }
/* 33 */   protected int next(int bits) { throw new RuntimeException("Stub!"); }
/* 34 */   public void nextBytes(byte[] bytes) { throw new RuntimeException("Stub!"); }
/* 35 */   public int nextInt() { throw new RuntimeException("Stub!"); }
/* 36 */   public int nextInt(int bound) { throw new RuntimeException("Stub!"); }
/* 37 */   public long nextLong() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean nextBoolean() { throw new RuntimeException("Stub!"); }
/* 39 */   public float nextFloat() { throw new RuntimeException("Stub!"); }
/* 40 */   public double nextDouble() { throw new RuntimeException("Stub!"); }
/* 41 */   public synchronized double nextGaussian() { throw new RuntimeException("Stub!"); }
/* 42 */   public IntStream ints(long streamSize) { throw new RuntimeException("Stub!"); }
/* 43 */   public IntStream ints() { throw new RuntimeException("Stub!"); }
/* 44 */   public IntStream ints(long streamSize, int randomNumberOrigin, int randomNumberBound) { throw new RuntimeException("Stub!"); }
/* 45 */   public IntStream ints(int randomNumberOrigin, int randomNumberBound) { throw new RuntimeException("Stub!"); }
/* 46 */   public LongStream longs(long streamSize) { throw new RuntimeException("Stub!"); }
/* 47 */   public LongStream longs() { throw new RuntimeException("Stub!"); }
/* 48 */   public LongStream longs(long streamSize, long randomNumberOrigin, long randomNumberBound) { throw new RuntimeException("Stub!"); }
/* 49 */   public LongStream longs(long randomNumberOrigin, long randomNumberBound) { throw new RuntimeException("Stub!"); }
/* 50 */   public DoubleStream doubles(long streamSize) { throw new RuntimeException("Stub!"); }
/* 51 */   public DoubleStream doubles() { throw new RuntimeException("Stub!"); }
/* 52 */   public DoubleStream doubles(long streamSize, double randomNumberOrigin, double randomNumberBound) { throw new RuntimeException("Stub!"); }
/* 53 */   public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\Random.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */