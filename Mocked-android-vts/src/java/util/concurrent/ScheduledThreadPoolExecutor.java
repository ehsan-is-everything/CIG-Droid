/*    */ package java.util.concurrent;
/*    */ 
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
/*    */ public class ScheduledThreadPoolExecutor
/*    */   extends ThreadPoolExecutor
/*    */   implements ScheduledExecutorService
/*    */ {
/*    */   public ScheduledThreadPoolExecutor(int corePoolSize)
/*    */   {
/* 41 */     super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null);throw new RuntimeException("Stub!"); }
/* 42 */   public ScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory) { super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null);throw new RuntimeException("Stub!"); }
/* 43 */   public ScheduledThreadPoolExecutor(int corePoolSize, RejectedExecutionHandler handler) { super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null);throw new RuntimeException("Stub!"); }
/* 44 */   public ScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory, RejectedExecutionHandler handler) { super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null);throw new RuntimeException("Stub!"); }
/* 45 */   protected <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> task) { throw new RuntimeException("Stub!"); }
/* 46 */   protected <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> task) { throw new RuntimeException("Stub!"); }
/* 47 */   public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) { throw new RuntimeException("Stub!"); }
/* 48 */   public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) { throw new RuntimeException("Stub!"); }
/* 49 */   public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) { throw new RuntimeException("Stub!"); }
/* 50 */   public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) { throw new RuntimeException("Stub!"); }
/* 51 */   public void execute(Runnable command) { throw new RuntimeException("Stub!"); }
/* 52 */   public Future<?> submit(Runnable task) { throw new RuntimeException("Stub!"); }
/* 53 */   public <T> Future<T> submit(Runnable task, T result) { throw new RuntimeException("Stub!"); }
/* 54 */   public <T> Future<T> submit(Callable<T> task) { throw new RuntimeException("Stub!"); }
/* 55 */   public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean value) { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean value) { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setRemoveOnCancelPolicy(boolean value) { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean getRemoveOnCancelPolicy() { throw new RuntimeException("Stub!"); }
/* 61 */   public void shutdown() { throw new RuntimeException("Stub!"); }
/* 62 */   public List<Runnable> shutdownNow() { throw new RuntimeException("Stub!"); }
/* 63 */   public BlockingQueue<Runnable> getQueue() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\ScheduledThreadPoolExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */