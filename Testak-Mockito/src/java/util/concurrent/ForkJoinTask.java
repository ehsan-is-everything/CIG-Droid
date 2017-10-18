/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public abstract class ForkJoinTask<V>
/*    */   implements Future<V>, Serializable
/*    */ {
/* 40 */   public ForkJoinTask() { throw new RuntimeException("Stub!"); }
/* 41 */   public final ForkJoinTask<V> fork() { throw new RuntimeException("Stub!"); }
/* 42 */   public final V join() { throw new RuntimeException("Stub!"); }
/* 43 */   public final V invoke() { throw new RuntimeException("Stub!"); }
/* 44 */   public static void invokeAll(ForkJoinTask<?> t1, ForkJoinTask<?> t2) { throw new RuntimeException("Stub!"); }
/* 45 */   public static void invokeAll(ForkJoinTask<?>... tasks) { throw new RuntimeException("Stub!"); }
/* 46 */   public static <T extends ForkJoinTask<?>> Collection<T> invokeAll(Collection<T> tasks) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); }
/* 48 */   public final boolean isDone() { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean isCancelled() { throw new RuntimeException("Stub!"); }
/* 50 */   public final boolean isCompletedAbnormally() { throw new RuntimeException("Stub!"); }
/* 51 */   public final boolean isCompletedNormally() { throw new RuntimeException("Stub!"); }
/* 52 */   public final Throwable getException() { throw new RuntimeException("Stub!"); }
/* 53 */   public void completeExceptionally(Throwable ex) { throw new RuntimeException("Stub!"); }
/* 54 */   public void complete(V value) { throw new RuntimeException("Stub!"); }
/* 55 */   public final void quietlyComplete() { throw new RuntimeException("Stub!"); }
/* 56 */   public final V get() throws InterruptedException, ExecutionException { throw new RuntimeException("Stub!"); }
/* 57 */   public final V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException { throw new RuntimeException("Stub!"); }
/* 58 */   public final void quietlyJoin() { throw new RuntimeException("Stub!"); }
/* 59 */   public final void quietlyInvoke() { throw new RuntimeException("Stub!"); }
/* 60 */   public static void helpQuiesce() { throw new RuntimeException("Stub!"); }
/* 61 */   public void reinitialize() { throw new RuntimeException("Stub!"); }
/* 62 */   public static ForkJoinPool getPool() { throw new RuntimeException("Stub!"); }
/* 63 */   public static boolean inForkJoinPool() { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean tryUnfork() { throw new RuntimeException("Stub!"); }
/* 65 */   public static int getQueuedTaskCount() { throw new RuntimeException("Stub!"); }
/* 66 */   public static int getSurplusQueuedTaskCount() { throw new RuntimeException("Stub!"); }
/*    */   public abstract V getRawResult();
/*    */   protected abstract void setRawResult(V paramV);
/*    */   protected abstract boolean exec();
/* 70 */   protected static ForkJoinTask<?> peekNextLocalTask() { throw new RuntimeException("Stub!"); }
/* 71 */   protected static ForkJoinTask<?> pollNextLocalTask() { throw new RuntimeException("Stub!"); }
/* 72 */   protected static ForkJoinTask<?> pollTask() { throw new RuntimeException("Stub!"); }
/* 73 */   public final short getForkJoinTaskTag() { throw new RuntimeException("Stub!"); }
/* 74 */   public final short setForkJoinTaskTag(short newValue) { throw new RuntimeException("Stub!"); }
/* 75 */   public final boolean compareAndSetForkJoinTaskTag(short expect, short update) { throw new RuntimeException("Stub!"); }
/* 76 */   public static ForkJoinTask<?> adapt(Runnable runnable) { throw new RuntimeException("Stub!"); }
/* 77 */   public static <T> ForkJoinTask<T> adapt(Runnable runnable, T result) { throw new RuntimeException("Stub!"); }
/* 78 */   public static <T> ForkJoinTask<T> adapt(Callable<? extends T> callable) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\ForkJoinTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */