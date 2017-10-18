/*    */ package java.util.concurrent;
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
/*    */ public class FutureTask<V>
/*    */   implements RunnableFuture<V>
/*    */ {
/* 40 */   public FutureTask(Callable<V> callable) { throw new RuntimeException("Stub!"); }
/* 41 */   public FutureTask(Runnable runnable, V result) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isCancelled() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isDone() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); }
/* 45 */   public V get() throws InterruptedException, ExecutionException { throw new RuntimeException("Stub!"); }
/* 46 */   public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException { throw new RuntimeException("Stub!"); }
/* 47 */   protected void done() { throw new RuntimeException("Stub!"); }
/* 48 */   protected void set(V v) { throw new RuntimeException("Stub!"); }
/* 49 */   protected void setException(Throwable t) { throw new RuntimeException("Stub!"); }
/* 50 */   public void run() { throw new RuntimeException("Stub!"); }
/* 51 */   protected boolean runAndReset() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\FutureTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */