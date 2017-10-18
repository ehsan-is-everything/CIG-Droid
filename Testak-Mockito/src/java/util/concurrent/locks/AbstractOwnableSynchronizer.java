/*    */ package java.util.concurrent.locks;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public abstract class AbstractOwnableSynchronizer
/*    */   implements Serializable
/*    */ {
/* 40 */   protected AbstractOwnableSynchronizer() { throw new RuntimeException("Stub!"); }
/* 41 */   protected final void setExclusiveOwnerThread(Thread thread) { throw new RuntimeException("Stub!"); }
/* 42 */   protected final Thread getExclusiveOwnerThread() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\locks\AbstractOwnableSynchronizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */