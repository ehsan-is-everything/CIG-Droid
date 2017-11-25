/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ForkJoinPool
/*    */   extends AbstractExecutorService
/*    */ {
/* 49 */   public ForkJoinPool() { throw new RuntimeException("Stub!"); }
/* 50 */   public ForkJoinPool(int parallelism) { throw new RuntimeException("Stub!"); }
/* 51 */   public ForkJoinPool(int parallelism, ForkJoinWorkerThreadFactory factory, Thread.UncaughtExceptionHandler handler, boolean asyncMode) { throw new RuntimeException("Stub!"); }
/* 52 */   public static ForkJoinPool commonPool() { throw new RuntimeException("Stub!"); }
/* 53 */   public <T> T invoke(ForkJoinTask<T> task) { throw new RuntimeException("Stub!"); }
/* 54 */   public void execute(ForkJoinTask<?> task) { throw new RuntimeException("Stub!"); }
/* 55 */   public void execute(Runnable task) { throw new RuntimeException("Stub!"); }
/* 56 */   public <T> ForkJoinTask<T> submit(ForkJoinTask<T> task) { throw new RuntimeException("Stub!"); }
/* 57 */   public <T> ForkJoinTask<T> submit(Callable<T> task) { throw new RuntimeException("Stub!"); }
/* 58 */   public <T> ForkJoinTask<T> submit(Runnable task, T result) { throw new RuntimeException("Stub!"); }
/* 59 */   public ForkJoinTask<?> submit(Runnable task) { throw new RuntimeException("Stub!"); }
/* 60 */   public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) { throw new RuntimeException("Stub!"); }
/* 61 */   public ForkJoinWorkerThreadFactory getFactory() { throw new RuntimeException("Stub!"); }
/* 62 */   public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() { throw new RuntimeException("Stub!"); }
/* 63 */   public int getParallelism() { throw new RuntimeException("Stub!"); }
/* 64 */   public static int getCommonPoolParallelism() { throw new RuntimeException("Stub!"); }
/* 65 */   public int getPoolSize() { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean getAsyncMode() { throw new RuntimeException("Stub!"); }
/* 67 */   public int getRunningThreadCount() { throw new RuntimeException("Stub!"); }
/* 68 */   public int getActiveThreadCount() { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean isQuiescent() { throw new RuntimeException("Stub!"); }
/* 70 */   public long getStealCount() { throw new RuntimeException("Stub!"); }
/* 71 */   public long getQueuedTaskCount() { throw new RuntimeException("Stub!"); }
/* 72 */   public int getQueuedSubmissionCount() { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean hasQueuedSubmissions() { throw new RuntimeException("Stub!"); }
/* 74 */   protected ForkJoinTask<?> pollSubmission() { throw new RuntimeException("Stub!"); }
/* 75 */   protected int drainTasksTo(Collection<? super ForkJoinTask<?>> c) { throw new RuntimeException("Stub!"); }
/* 76 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 77 */   public void shutdown() { throw new RuntimeException("Stub!"); }
/* 78 */   public List<Runnable> shutdownNow() { throw new RuntimeException("Stub!"); }
/* 79 */   public boolean isTerminated() { throw new RuntimeException("Stub!"); }
/* 80 */   public boolean isTerminating() { throw new RuntimeException("Stub!"); }
/* 81 */   public boolean isShutdown() { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 83 */   public boolean awaitQuiescence(long timeout, TimeUnit unit) { throw new RuntimeException("Stub!"); }
/* 84 */   public static void managedBlock(ManagedBlocker blocker) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 85 */   protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) { throw new RuntimeException("Stub!"); }
/* 86 */   protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) { throw new RuntimeException("Stub!"); }
/*    */   
/* 88 */   public static final ForkJoinWorkerThreadFactory defaultForkJoinWorkerThreadFactory = null;
/*    */   
/*    */   public static abstract interface ManagedBlocker
/*    */   {
/*    */     public abstract boolean block()
/*    */       throws InterruptedException;
/*    */     
/*    */     public abstract boolean isReleasable();
/*    */   }
/*    */   
/*    */   public static abstract interface ForkJoinWorkerThreadFactory
/*    */   {
/*    */     public abstract ForkJoinWorkerThread newThread(ForkJoinPool paramForkJoinPool);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\ForkJoinPool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */