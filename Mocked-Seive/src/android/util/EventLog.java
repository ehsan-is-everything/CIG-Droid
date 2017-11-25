/*    */ package android.util;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ public class EventLog
/*    */ {
/*    */   public static final class Event
/*    */   {
/* 22 */     Event() { throw new RuntimeException("Stub!"); }
/* 23 */     public int getProcessId() { throw new RuntimeException("Stub!"); }
/* 24 */     public int getThreadId() { throw new RuntimeException("Stub!"); }
/* 25 */     public long getTimeNanos() { throw new RuntimeException("Stub!"); }
/* 26 */     public int getTag() { throw new RuntimeException("Stub!"); }
/* 27 */     public synchronized Object getData() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 29 */   EventLog() { throw new RuntimeException("Stub!"); }
/*    */   public static native int writeEvent(int paramInt1, int paramInt2);
/*    */   public static native int writeEvent(int paramInt, long paramLong);
/*    */   public static native int writeEvent(int paramInt, float paramFloat);
/*    */   public static native int writeEvent(int paramInt, String paramString);
/*    */   public static native int writeEvent(int paramInt, Object... paramVarArgs);
/*    */   public static native void readEvents(int[] paramArrayOfInt, Collection<Event> paramCollection) throws IOException;
/* 36 */   public static String getTagName(int tag) { throw new RuntimeException("Stub!"); }
/* 37 */   public static int getTagCode(String name) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\util\EventLog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */