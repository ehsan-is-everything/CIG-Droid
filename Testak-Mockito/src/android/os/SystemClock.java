/*    */ package android.os;
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
/*    */ public final class SystemClock
/*    */ {
/* 20 */   SystemClock() { throw new RuntimeException("Stub!"); }
/* 21 */   public static void sleep(long ms) { throw new RuntimeException("Stub!"); }
/* 22 */   public static boolean setCurrentTimeMillis(long millis) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static native long uptimeMillis();
/*    */   
/*    */   public static native long elapsedRealtime();
/*    */   
/*    */   public static native long elapsedRealtimeNanos();
/*    */   
/*    */   public static native long currentThreadTimeMillis();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\SystemClock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */