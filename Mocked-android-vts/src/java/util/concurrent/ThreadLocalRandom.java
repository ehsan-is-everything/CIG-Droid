/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.util.Random;
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
/*    */ public class ThreadLocalRandom
/*    */   extends Random
/*    */ {
/* 40 */   ThreadLocalRandom() { throw new RuntimeException("Stub!"); }
/* 41 */   public static ThreadLocalRandom current() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setSeed(long seed) { throw new RuntimeException("Stub!"); }
/* 43 */   protected int next(int bits) { throw new RuntimeException("Stub!"); }
/* 44 */   public int nextInt() { throw new RuntimeException("Stub!"); }
/* 45 */   public int nextInt(int bound) { throw new RuntimeException("Stub!"); }
/* 46 */   public int nextInt(int origin, int bound) { throw new RuntimeException("Stub!"); }
/* 47 */   public long nextLong() { throw new RuntimeException("Stub!"); }
/* 48 */   public long nextLong(long bound) { throw new RuntimeException("Stub!"); }
/* 49 */   public long nextLong(long origin, long bound) { throw new RuntimeException("Stub!"); }
/* 50 */   public double nextDouble() { throw new RuntimeException("Stub!"); }
/* 51 */   public double nextDouble(double bound) { throw new RuntimeException("Stub!"); }
/* 52 */   public double nextDouble(double origin, double bound) { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean nextBoolean() { throw new RuntimeException("Stub!"); }
/* 54 */   public float nextFloat() { throw new RuntimeException("Stub!"); }
/* 55 */   public double nextGaussian() { throw new RuntimeException("Stub!"); }
/* 56 */   public IntStream ints(long streamSize) { throw new RuntimeException("Stub!"); }
/* 57 */   public IntStream ints() { throw new RuntimeException("Stub!"); }
/* 58 */   public IntStream ints(long streamSize, int randomNumberOrigin, int randomNumberBound) { throw new RuntimeException("Stub!"); }
/* 59 */   public IntStream ints(int randomNumberOrigin, int randomNumberBound) { throw new RuntimeException("Stub!"); }
/* 60 */   public LongStream longs(long streamSize) { throw new RuntimeException("Stub!"); }
/* 61 */   public LongStream longs() { throw new RuntimeException("Stub!"); }
/* 62 */   public LongStream longs(long streamSize, long randomNumberOrigin, long randomNumberBound) { throw new RuntimeException("Stub!"); }
/* 63 */   public LongStream longs(long randomNumberOrigin, long randomNumberBound) { throw new RuntimeException("Stub!"); }
/* 64 */   public DoubleStream doubles(long streamSize) { throw new RuntimeException("Stub!"); }
/* 65 */   public DoubleStream doubles() { throw new RuntimeException("Stub!"); }
/* 66 */   public DoubleStream doubles(long streamSize, double randomNumberOrigin, double randomNumberBound) { throw new RuntimeException("Stub!"); }
/* 67 */   public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\ThreadLocalRandom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */