/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Collection;
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
/*    */ 
/*    */ 
/*    */ public class Semaphore
/*    */   implements Serializable
/*    */ {
/* 40 */   public Semaphore(int permits) { throw new RuntimeException("Stub!"); }
/* 41 */   public Semaphore(int permits, boolean fair) { throw new RuntimeException("Stub!"); }
/* 42 */   public void acquire() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 43 */   public void acquireUninterruptibly() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean tryAcquire() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean tryAcquire(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 46 */   public void release() { throw new RuntimeException("Stub!"); }
/* 47 */   public void acquire(int permits) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 48 */   public void acquireUninterruptibly(int permits) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean tryAcquire(int permits) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean tryAcquire(int permits, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 51 */   public void release(int permits) { throw new RuntimeException("Stub!"); }
/* 52 */   public int availablePermits() { throw new RuntimeException("Stub!"); }
/* 53 */   public int drainPermits() { throw new RuntimeException("Stub!"); }
/* 54 */   protected void reducePermits(int reduction) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean isFair() { throw new RuntimeException("Stub!"); }
/* 56 */   public final boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
/* 57 */   public final int getQueueLength() { throw new RuntimeException("Stub!"); }
/* 58 */   protected Collection<Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\Semaphore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */