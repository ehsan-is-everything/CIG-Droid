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
/*    */ public class ReentrantReadWriteLock
/*    */   implements ReadWriteLock, Serializable
/*    */ {
/*    */   public static class ReadLock
/*    */     implements Lock, Serializable
/*    */   {
/* 43 */     protected ReadLock(ReentrantReadWriteLock lock) { throw new RuntimeException("Stub!"); }
/* 44 */     public void lock() { throw new RuntimeException("Stub!"); }
/* 45 */     public void lockInterruptibly() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 46 */     public boolean tryLock() { throw new RuntimeException("Stub!"); }
/* 47 */     public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 48 */     public void unlock() { throw new RuntimeException("Stub!"); }
/* 49 */     public Condition newCondition() { throw new RuntimeException("Stub!"); }
/* 50 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class WriteLock
/*    */     implements Lock, Serializable {
/* 55 */     protected WriteLock(ReentrantReadWriteLock lock) { throw new RuntimeException("Stub!"); }
/* 56 */     public void lock() { throw new RuntimeException("Stub!"); }
/* 57 */     public void lockInterruptibly() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 58 */     public boolean tryLock() { throw new RuntimeException("Stub!"); }
/* 59 */     public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 60 */     public void unlock() { throw new RuntimeException("Stub!"); }
/* 61 */     public Condition newCondition() { throw new RuntimeException("Stub!"); }
/* 62 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 63 */     public boolean isHeldByCurrentThread() { throw new RuntimeException("Stub!"); }
/* 64 */     public int getHoldCount() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 66 */   public ReentrantReadWriteLock() { throw new RuntimeException("Stub!"); }
/* 67 */   public ReentrantReadWriteLock(boolean fair) { throw new RuntimeException("Stub!"); }
/* 68 */   public WriteLock writeLock() { throw new RuntimeException("Stub!"); }
/* 69 */   public ReadLock readLock() { throw new RuntimeException("Stub!"); }
/* 70 */   public final boolean isFair() { throw new RuntimeException("Stub!"); }
/* 71 */   protected Thread getOwner() { throw new RuntimeException("Stub!"); }
/* 72 */   public int getReadLockCount() { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean isWriteLocked() { throw new RuntimeException("Stub!"); }
/* 74 */   public boolean isWriteLockedByCurrentThread() { throw new RuntimeException("Stub!"); }
/* 75 */   public int getWriteHoldCount() { throw new RuntimeException("Stub!"); }
/* 76 */   public int getReadHoldCount() { throw new RuntimeException("Stub!"); }
/* 77 */   protected Collection<Thread> getQueuedWriterThreads() { throw new RuntimeException("Stub!"); }
/* 78 */   protected Collection<Thread> getQueuedReaderThreads() { throw new RuntimeException("Stub!"); }
/* 79 */   public final boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
/* 80 */   public final boolean hasQueuedThread(Thread thread) { throw new RuntimeException("Stub!"); }
/* 81 */   public final int getQueueLength() { throw new RuntimeException("Stub!"); }
/* 82 */   protected Collection<Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
/* 83 */   public boolean hasWaiters(Condition condition) { throw new RuntimeException("Stub!"); }
/* 84 */   public int getWaitQueueLength(Condition condition) { throw new RuntimeException("Stub!"); }
/* 85 */   protected Collection<Thread> getWaitingThreads(Condition condition) { throw new RuntimeException("Stub!"); }
/* 86 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\locks\ReentrantReadWriteLock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */