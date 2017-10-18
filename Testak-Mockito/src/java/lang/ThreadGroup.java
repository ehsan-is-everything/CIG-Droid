/*    */ package java.lang;
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
/*    */ public class ThreadGroup
/*    */   implements Thread.UncaughtExceptionHandler
/*    */ {
/* 31 */   public ThreadGroup(String name) { throw new RuntimeException("Stub!"); }
/* 32 */   public ThreadGroup(ThreadGroup parent, String name) { throw new RuntimeException("Stub!"); }
/* 33 */   public final String getName() { throw new RuntimeException("Stub!"); }
/* 34 */   public final ThreadGroup getParent() { throw new RuntimeException("Stub!"); }
/* 35 */   public final int getMaxPriority() { throw new RuntimeException("Stub!"); }
/* 36 */   public final boolean isDaemon() { throw new RuntimeException("Stub!"); }
/* 37 */   public synchronized boolean isDestroyed() { throw new RuntimeException("Stub!"); }
/* 38 */   public final void setDaemon(boolean daemon) { throw new RuntimeException("Stub!"); }
/* 39 */   public final void setMaxPriority(int pri) { throw new RuntimeException("Stub!"); }
/* 40 */   public final boolean parentOf(ThreadGroup g) { throw new RuntimeException("Stub!"); }
/* 41 */   public final void checkAccess() { throw new RuntimeException("Stub!"); }
/* 42 */   public int activeCount() { throw new RuntimeException("Stub!"); }
/* 43 */   public int enumerate(Thread[] list) { throw new RuntimeException("Stub!"); }
/* 44 */   public int enumerate(Thread[] list, boolean recurse) { throw new RuntimeException("Stub!"); }
/* 45 */   public int activeGroupCount() { throw new RuntimeException("Stub!"); }
/* 46 */   public int enumerate(ThreadGroup[] list) { throw new RuntimeException("Stub!"); }
/* 47 */   public int enumerate(ThreadGroup[] list, boolean recurse) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 49 */   public final void stop() { throw new RuntimeException("Stub!"); }
/* 50 */   public final void interrupt() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/* 53 */   public final void suspend() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/* 56 */   public final void resume() { throw new RuntimeException("Stub!"); }
/* 57 */   public final void destroy() { throw new RuntimeException("Stub!"); }
/* 58 */   public void list() { throw new RuntimeException("Stub!"); }
/* 59 */   public void uncaughtException(Thread t, Throwable e) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 61 */   public boolean allowThreadSuspension(boolean b) { throw new RuntimeException("Stub!"); }
/* 62 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\ThreadGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */