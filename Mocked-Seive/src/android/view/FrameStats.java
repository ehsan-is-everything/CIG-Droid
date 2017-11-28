/*    */ package android.view;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class FrameStats
/*    */ {
/*    */   public static final long UNDEFINED_TIME_NANO = -1L;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 20 */   public FrameStats() { throw new RuntimeException("Stub!"); }
/* 21 */   public final long getRefreshPeriodNano() { throw new RuntimeException("Stub!"); }
/* 22 */   public final int getFrameCount() { throw new RuntimeException("Stub!"); }
/* 23 */   public final long getStartTimeNano() { throw new RuntimeException("Stub!"); }
/* 24 */   public final long getEndTimeNano() { throw new RuntimeException("Stub!"); }
/* 25 */   public final long getFramePresentedTimeNano(int index) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\FrameStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */