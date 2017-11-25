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
/*    */ public abstract class AbstractExecutorService
/*    */   implements ExecutorService
/*    */ {
/* 40 */   public AbstractExecutorService() { throw new RuntimeException("Stub!"); }
/* 41 */   protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) { throw new RuntimeException("Stub!"); }
/* 42 */   protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) { throw new RuntimeException("Stub!"); }
/* 43 */   public Future<?> submit(Runnable task) { throw new RuntimeException("Stub!"); }
/* 44 */   public <T> Future<T> submit(Runnable task, T result) { throw new RuntimeException("Stub!"); }
/* 45 */   public <T> Future<T> submit(Callable<T> task) { throw new RuntimeException("Stub!"); }
/* 46 */   public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException { throw new RuntimeException("Stub!"); }
/* 47 */   public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException { throw new RuntimeException("Stub!"); }
/* 48 */   public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 49 */   public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\AbstractExecutorService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */