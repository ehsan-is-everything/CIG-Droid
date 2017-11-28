/*     */ package java.util.concurrent;
/*     */ 
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ThreadPoolExecutor
/*     */   extends AbstractExecutorService
/*     */ {
/*     */   public static class CallerRunsPolicy
/*     */     implements RejectedExecutionHandler
/*     */   {
/*  43 */     public CallerRunsPolicy() { throw new RuntimeException("Stub!"); }
/*  44 */     public void rejectedExecution(Runnable r, ThreadPoolExecutor e) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class AbortPolicy
/*     */     implements RejectedExecutionHandler {
/*  49 */     public AbortPolicy() { throw new RuntimeException("Stub!"); }
/*  50 */     public void rejectedExecution(Runnable r, ThreadPoolExecutor e) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class DiscardPolicy
/*     */     implements RejectedExecutionHandler {
/*  55 */     public DiscardPolicy() { throw new RuntimeException("Stub!"); }
/*  56 */     public void rejectedExecution(Runnable r, ThreadPoolExecutor e) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class DiscardOldestPolicy
/*     */     implements RejectedExecutionHandler {
/*  61 */     public DiscardOldestPolicy() { throw new RuntimeException("Stub!"); }
/*  62 */     public void rejectedExecution(Runnable r, ThreadPoolExecutor e) { throw new RuntimeException("Stub!"); } }
/*     */   
/*  64 */   public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) { throw new RuntimeException("Stub!"); }
/*  65 */   public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); }
/*  66 */   public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) { throw new RuntimeException("Stub!"); }
/*  67 */   public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) { throw new RuntimeException("Stub!"); }
/*  68 */   public void execute(Runnable command) { throw new RuntimeException("Stub!"); }
/*  69 */   public void shutdown() { throw new RuntimeException("Stub!"); }
/*  70 */   public List<Runnable> shutdownNow() { throw new RuntimeException("Stub!"); }
/*  71 */   public boolean isShutdown() { throw new RuntimeException("Stub!"); }
/*  72 */   public boolean isTerminating() { throw new RuntimeException("Stub!"); }
/*  73 */   public boolean isTerminated() { throw new RuntimeException("Stub!"); }
/*  74 */   public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/*  75 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*  76 */   public void setThreadFactory(ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); }
/*  77 */   public ThreadFactory getThreadFactory() { throw new RuntimeException("Stub!"); }
/*  78 */   public void setRejectedExecutionHandler(RejectedExecutionHandler handler) { throw new RuntimeException("Stub!"); }
/*  79 */   public RejectedExecutionHandler getRejectedExecutionHandler() { throw new RuntimeException("Stub!"); }
/*  80 */   public void setCorePoolSize(int corePoolSize) { throw new RuntimeException("Stub!"); }
/*  81 */   public int getCorePoolSize() { throw new RuntimeException("Stub!"); }
/*  82 */   public boolean prestartCoreThread() { throw new RuntimeException("Stub!"); }
/*  83 */   public int prestartAllCoreThreads() { throw new RuntimeException("Stub!"); }
/*  84 */   public boolean allowsCoreThreadTimeOut() { throw new RuntimeException("Stub!"); }
/*  85 */   public void allowCoreThreadTimeOut(boolean value) { throw new RuntimeException("Stub!"); }
/*  86 */   public void setMaximumPoolSize(int maximumPoolSize) { throw new RuntimeException("Stub!"); }
/*  87 */   public int getMaximumPoolSize() { throw new RuntimeException("Stub!"); }
/*  88 */   public void setKeepAliveTime(long time, TimeUnit unit) { throw new RuntimeException("Stub!"); }
/*  89 */   public long getKeepAliveTime(TimeUnit unit) { throw new RuntimeException("Stub!"); }
/*  90 */   public BlockingQueue<Runnable> getQueue() { throw new RuntimeException("Stub!"); }
/*  91 */   public boolean remove(Runnable task) { throw new RuntimeException("Stub!"); }
/*  92 */   public void purge() { throw new RuntimeException("Stub!"); }
/*  93 */   public int getPoolSize() { throw new RuntimeException("Stub!"); }
/*  94 */   public int getActiveCount() { throw new RuntimeException("Stub!"); }
/*  95 */   public int getLargestPoolSize() { throw new RuntimeException("Stub!"); }
/*  96 */   public long getTaskCount() { throw new RuntimeException("Stub!"); }
/*  97 */   public long getCompletedTaskCount() { throw new RuntimeException("Stub!"); }
/*  98 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  99 */   protected void beforeExecute(Thread t, Runnable r) { throw new RuntimeException("Stub!"); }
/* 100 */   protected void afterExecute(Runnable r, Throwable t) { throw new RuntimeException("Stub!"); }
/* 101 */   protected void terminated() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\ThreadPoolExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */