/*    */ package java.util;
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
/*    */ public abstract class TimerTask
/*    */   implements Runnable
/*    */ {
/* 30 */   protected TimerTask() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void run();
/* 32 */   public boolean cancel() { throw new RuntimeException("Stub!"); }
/* 33 */   public long scheduledExecutionTime() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\TimerTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */