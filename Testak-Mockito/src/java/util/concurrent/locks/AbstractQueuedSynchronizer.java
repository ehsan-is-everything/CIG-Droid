/*    */ package java.util.concurrent.locks;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Collection;
/*    */ import java.util.Date;
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
/*    */ public abstract class AbstractQueuedSynchronizer
/*    */   extends AbstractOwnableSynchronizer
/*    */   implements Serializable
/*    */ {
/*    */   public class ConditionObject
/*    */     implements Condition, Serializable
/*    */   {
/* 44 */     public ConditionObject() { throw new RuntimeException("Stub!"); }
/* 45 */     public final void signal() { throw new RuntimeException("Stub!"); }
/* 46 */     public final void signalAll() { throw new RuntimeException("Stub!"); }
/* 47 */     public final void awaitUninterruptibly() { throw new RuntimeException("Stub!"); }
/* 48 */     public final void await() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 49 */     public final long awaitNanos(long nanosTimeout) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 50 */     public final boolean awaitUntil(Date deadline) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 51 */     public final boolean await(long time, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 52 */     protected final boolean hasWaiters() { throw new RuntimeException("Stub!"); }
/* 53 */     protected final int getWaitQueueLength() { throw new RuntimeException("Stub!"); }
/* 54 */     protected final Collection<Thread> getWaitingThreads() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 56 */   protected AbstractQueuedSynchronizer() { throw new RuntimeException("Stub!"); }
/* 57 */   protected final int getState() { throw new RuntimeException("Stub!"); }
/* 58 */   protected final void setState(int newState) { throw new RuntimeException("Stub!"); }
/* 59 */   protected final boolean compareAndSetState(int expect, int update) { throw new RuntimeException("Stub!"); }
/* 60 */   protected boolean tryAcquire(int arg) { throw new RuntimeException("Stub!"); }
/* 61 */   protected boolean tryRelease(int arg) { throw new RuntimeException("Stub!"); }
/* 62 */   protected int tryAcquireShared(int arg) { throw new RuntimeException("Stub!"); }
/* 63 */   protected boolean tryReleaseShared(int arg) { throw new RuntimeException("Stub!"); }
/* 64 */   protected boolean isHeldExclusively() { throw new RuntimeException("Stub!"); }
/* 65 */   public final void acquire(int arg) { throw new RuntimeException("Stub!"); }
/* 66 */   public final void acquireInterruptibly(int arg) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 67 */   public final boolean tryAcquireNanos(int arg, long nanosTimeout) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 68 */   public final boolean release(int arg) { throw new RuntimeException("Stub!"); }
/* 69 */   public final void acquireShared(int arg) { throw new RuntimeException("Stub!"); }
/* 70 */   public final void acquireSharedInterruptibly(int arg) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 71 */   public final boolean tryAcquireSharedNanos(int arg, long nanosTimeout) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 72 */   public final boolean releaseShared(int arg) { throw new RuntimeException("Stub!"); }
/* 73 */   public final boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
/* 74 */   public final boolean hasContended() { throw new RuntimeException("Stub!"); }
/* 75 */   public final Thread getFirstQueuedThread() { throw new RuntimeException("Stub!"); }
/* 76 */   public final boolean isQueued(Thread thread) { throw new RuntimeException("Stub!"); }
/* 77 */   public final boolean hasQueuedPredecessors() { throw new RuntimeException("Stub!"); }
/* 78 */   public final int getQueueLength() { throw new RuntimeException("Stub!"); }
/* 79 */   public final Collection<Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
/* 80 */   public final Collection<Thread> getExclusiveQueuedThreads() { throw new RuntimeException("Stub!"); }
/* 81 */   public final Collection<Thread> getSharedQueuedThreads() { throw new RuntimeException("Stub!"); }
/* 82 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 83 */   public final boolean owns(ConditionObject condition) { throw new RuntimeException("Stub!"); }
/* 84 */   public final boolean hasWaiters(ConditionObject condition) { throw new RuntimeException("Stub!"); }
/* 85 */   public final int getWaitQueueLength(ConditionObject condition) { throw new RuntimeException("Stub!"); }
/* 86 */   public final Collection<Thread> getWaitingThreads(ConditionObject condition) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\locks\AbstractQueuedSynchronizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */