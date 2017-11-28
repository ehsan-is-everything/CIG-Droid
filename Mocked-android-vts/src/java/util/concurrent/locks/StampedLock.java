/*    */ package java.util.concurrent.locks;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ 
/*    */ public class StampedLock
/*    */   implements Serializable
/*    */ {
/* 40 */   public StampedLock() { throw new RuntimeException("Stub!"); }
/* 41 */   public long writeLock() { throw new RuntimeException("Stub!"); }
/* 42 */   public long tryWriteLock() { throw new RuntimeException("Stub!"); }
/* 43 */   public long tryWriteLock(long time, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 44 */   public long writeLockInterruptibly() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 45 */   public long readLock() { throw new RuntimeException("Stub!"); }
/* 46 */   public long tryReadLock() { throw new RuntimeException("Stub!"); }
/* 47 */   public long tryReadLock(long time, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 48 */   public long readLockInterruptibly() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 49 */   public long tryOptimisticRead() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean validate(long stamp) { throw new RuntimeException("Stub!"); }
/* 51 */   public void unlockWrite(long stamp) { throw new RuntimeException("Stub!"); }
/* 52 */   public void unlockRead(long stamp) { throw new RuntimeException("Stub!"); }
/* 53 */   public void unlock(long stamp) { throw new RuntimeException("Stub!"); }
/* 54 */   public long tryConvertToWriteLock(long stamp) { throw new RuntimeException("Stub!"); }
/* 55 */   public long tryConvertToReadLock(long stamp) { throw new RuntimeException("Stub!"); }
/* 56 */   public long tryConvertToOptimisticRead(long stamp) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean tryUnlockWrite() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean tryUnlockRead() { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean isWriteLocked() { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean isReadLocked() { throw new RuntimeException("Stub!"); }
/* 61 */   public int getReadLockCount() { throw new RuntimeException("Stub!"); }
/* 62 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 63 */   public Lock asReadLock() { throw new RuntimeException("Stub!"); }
/* 64 */   public Lock asWriteLock() { throw new RuntimeException("Stub!"); }
/* 65 */   public ReadWriteLock asReadWriteLock() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\locks\StampedLock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */