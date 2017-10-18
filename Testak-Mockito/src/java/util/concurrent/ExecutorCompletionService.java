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
/*    */ public class ExecutorCompletionService<V>
/*    */   implements CompletionService<V>
/*    */ {
/* 40 */   public ExecutorCompletionService(Executor executor) { throw new RuntimeException("Stub!"); }
/* 41 */   public ExecutorCompletionService(Executor executor, BlockingQueue<Future<V>> completionQueue) { throw new RuntimeException("Stub!"); }
/* 42 */   public Future<V> submit(Callable<V> task) { throw new RuntimeException("Stub!"); }
/* 43 */   public Future<V> submit(Runnable task, V result) { throw new RuntimeException("Stub!"); }
/* 44 */   public Future<V> take() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 45 */   public Future<V> poll() { throw new RuntimeException("Stub!"); }
/* 46 */   public Future<V> poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\ExecutorCompletionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */