/*     */ package java.lang;
/*     */ 
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Thread
/*     */   implements Runnable
/*     */ {
/*     */   public static final int MAX_PRIORITY = 10;
/*     */   public static final int MIN_PRIORITY = 1;
/*     */   public static final int NORM_PRIORITY = 5;
/*     */   
/*     */   @FunctionalInterface
/*     */   public static abstract interface UncaughtExceptionHandler
/*     */   {
/*     */     public abstract void uncaughtException(Thread paramThread, Throwable paramThrowable);
/*     */   }
/*     */   
/*     */   public static enum State
/*     */   {
/*  33 */     BLOCKED, 
/*  34 */     NEW, 
/*  35 */     RUNNABLE, 
/*  36 */     TERMINATED, 
/*  37 */     TIMED_WAITING, 
/*  38 */     WAITING;
/*     */     
/*     */ 
/*     */     private State() {}
/*     */   }
/*     */   
/*     */ 
/*  45 */   public Thread() { throw new RuntimeException("Stub!"); }
/*  46 */   public Thread(Runnable target) { throw new RuntimeException("Stub!"); }
/*  47 */   public Thread(ThreadGroup group, Runnable target) { throw new RuntimeException("Stub!"); }
/*  48 */   public Thread(String name) { throw new RuntimeException("Stub!"); }
/*  49 */   public Thread(ThreadGroup group, String name) { throw new RuntimeException("Stub!"); }
/*  50 */   public Thread(Runnable target, String name) { throw new RuntimeException("Stub!"); }
/*  51 */   public Thread(ThreadGroup group, Runnable target, String name) { throw new RuntimeException("Stub!"); }
/*  52 */   public Thread(ThreadGroup group, Runnable target, String name, long stackSize) { throw new RuntimeException("Stub!"); }
/*     */   public static native Thread currentThread();
/*     */   public static native void yield();
/*  55 */   public static void sleep(long millis) throws InterruptedException { throw new RuntimeException("Stub!"); }
/*  56 */   public static void sleep(long millis, int nanos) throws InterruptedException { throw new RuntimeException("Stub!"); }
/*  57 */   protected Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*  58 */   public synchronized void start() { throw new RuntimeException("Stub!"); }
/*  59 */   public void run() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  61 */   public final void stop() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  63 */   public final void stop(Throwable obj) { throw new RuntimeException("Stub!"); }
/*  64 */   public void interrupt() { throw new RuntimeException("Stub!"); }
/*     */   public static native boolean interrupted();
/*     */   public native boolean isInterrupted();
/*     */   @Deprecated
/*  68 */   public void destroy() { throw new RuntimeException("Stub!"); }
/*  69 */   public final boolean isAlive() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  71 */   public final void suspend() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  73 */   public final void resume() { throw new RuntimeException("Stub!"); }
/*  74 */   public final void setPriority(int newPriority) { throw new RuntimeException("Stub!"); }
/*  75 */   public final int getPriority() { throw new RuntimeException("Stub!"); }
/*  76 */   public final void setName(String name) { throw new RuntimeException("Stub!"); }
/*  77 */   public final String getName() { throw new RuntimeException("Stub!"); }
/*  78 */   public final ThreadGroup getThreadGroup() { throw new RuntimeException("Stub!"); }
/*  79 */   public static int activeCount() { throw new RuntimeException("Stub!"); }
/*  80 */   public static int enumerate(Thread[] tarray) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  82 */   public int countStackFrames() { throw new RuntimeException("Stub!"); }
/*  83 */   public final void join(long millis) throws InterruptedException { throw new RuntimeException("Stub!"); }
/*  84 */   public final void join(long millis, int nanos) throws InterruptedException { throw new RuntimeException("Stub!"); }
/*  85 */   public final void join() throws InterruptedException { throw new RuntimeException("Stub!"); }
/*  86 */   public static void dumpStack() { throw new RuntimeException("Stub!"); }
/*  87 */   public final void setDaemon(boolean on) { throw new RuntimeException("Stub!"); }
/*  88 */   public final boolean isDaemon() { throw new RuntimeException("Stub!"); }
/*  89 */   public final void checkAccess() { throw new RuntimeException("Stub!"); }
/*  90 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  91 */   public ClassLoader getContextClassLoader() { throw new RuntimeException("Stub!"); }
/*  92 */   public void setContextClassLoader(ClassLoader cl) { throw new RuntimeException("Stub!"); }
/*  93 */   public static boolean holdsLock(Object obj) { throw new RuntimeException("Stub!"); }
/*  94 */   public StackTraceElement[] getStackTrace() { throw new RuntimeException("Stub!"); }
/*  95 */   public static Map<Thread, StackTraceElement[]> getAllStackTraces() { throw new RuntimeException("Stub!"); }
/*  96 */   public long getId() { throw new RuntimeException("Stub!"); }
/*  97 */   public State getState() { throw new RuntimeException("Stub!"); }
/*  98 */   public static void setDefaultUncaughtExceptionHandler(UncaughtExceptionHandler eh) { throw new RuntimeException("Stub!"); }
/*  99 */   public static UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() { throw new RuntimeException("Stub!"); }
/* 100 */   public UncaughtExceptionHandler getUncaughtExceptionHandler() { throw new RuntimeException("Stub!"); }
/* 101 */   public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\Thread.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */