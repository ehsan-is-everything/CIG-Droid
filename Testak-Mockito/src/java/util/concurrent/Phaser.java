/*    */ package java.util.concurrent;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Phaser
/*    */ {
/* 39 */   public Phaser() { throw new RuntimeException("Stub!"); }
/* 40 */   public Phaser(int parties) { throw new RuntimeException("Stub!"); }
/* 41 */   public Phaser(Phaser parent) { throw new RuntimeException("Stub!"); }
/* 42 */   public Phaser(Phaser parent, int parties) { throw new RuntimeException("Stub!"); }
/* 43 */   public int register() { throw new RuntimeException("Stub!"); }
/* 44 */   public int bulkRegister(int parties) { throw new RuntimeException("Stub!"); }
/* 45 */   public int arrive() { throw new RuntimeException("Stub!"); }
/* 46 */   public int arriveAndDeregister() { throw new RuntimeException("Stub!"); }
/* 47 */   public int arriveAndAwaitAdvance() { throw new RuntimeException("Stub!"); }
/* 48 */   public int awaitAdvance(int phase) { throw new RuntimeException("Stub!"); }
/* 49 */   public int awaitAdvanceInterruptibly(int phase) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 50 */   public int awaitAdvanceInterruptibly(int phase, long timeout, TimeUnit unit) throws InterruptedException, TimeoutException { throw new RuntimeException("Stub!"); }
/* 51 */   public void forceTermination() { throw new RuntimeException("Stub!"); }
/* 52 */   public final int getPhase() { throw new RuntimeException("Stub!"); }
/* 53 */   public int getRegisteredParties() { throw new RuntimeException("Stub!"); }
/* 54 */   public int getArrivedParties() { throw new RuntimeException("Stub!"); }
/* 55 */   public int getUnarrivedParties() { throw new RuntimeException("Stub!"); }
/* 56 */   public Phaser getParent() { throw new RuntimeException("Stub!"); }
/* 57 */   public Phaser getRoot() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean isTerminated() { throw new RuntimeException("Stub!"); }
/* 59 */   protected boolean onAdvance(int phase, int registeredParties) { throw new RuntimeException("Stub!"); }
/* 60 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\Phaser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */