/*    */ package java.util.concurrent.locks;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.TimeUnit;
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
/*    */ public class ReentrantLock
/*    */   implements Lock, Serializable
/*    */ {
/* 40 */   public ReentrantLock() { throw new RuntimeException("Stub!"); }
/* 41 */   public ReentrantLock(boolean fair) { throw new RuntimeException("Stub!"); }
/* 42 */   public void lock() { throw new RuntimeException("Stub!"); }
/* 43 */   public void lockInterruptibly() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean tryLock() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 46 */   public void unlock() { throw new RuntimeException("Stub!"); }
/* 47 */   public Condition newCondition() { throw new RuntimeException("Stub!"); }
/* 48 */   public int getHoldCount() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean isHeldByCurrentThread() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isLocked() { throw new RuntimeException("Stub!"); }
/* 51 */   public final boolean isFair() { throw new RuntimeException("Stub!"); }
/* 52 */   protected Thread getOwner() { throw new RuntimeException("Stub!"); }
/* 53 */   public final boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
/* 54 */   public final boolean hasQueuedThread(Thread thread) { throw new RuntimeException("Stub!"); }
/* 55 */   public final int getQueueLength() { throw new RuntimeException("Stub!"); }
/* 56 */   protected Collection<Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean hasWaiters(Condition condition) { throw new RuntimeException("Stub!"); }
/* 58 */   public int getWaitQueueLength(Condition condition) { throw new RuntimeException("Stub!"); }
/* 59 */   protected Collection<Thread> getWaitingThreads(Condition condition) { throw new RuntimeException("Stub!"); }
/* 60 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\locks\ReentrantLock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */