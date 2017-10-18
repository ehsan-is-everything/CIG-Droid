/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.security.PrivilegedAction;
/*    */ import java.security.PrivilegedExceptionAction;
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
/*    */ public class Executors
/*    */ {
/* 39 */   Executors() { throw new RuntimeException("Stub!"); }
/* 40 */   public static ExecutorService newFixedThreadPool(int nThreads) { throw new RuntimeException("Stub!"); }
/* 41 */   public static ExecutorService newWorkStealingPool(int parallelism) { throw new RuntimeException("Stub!"); }
/* 42 */   public static ExecutorService newWorkStealingPool() { throw new RuntimeException("Stub!"); }
/* 43 */   public static ExecutorService newFixedThreadPool(int nThreads, ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); }
/* 44 */   public static ExecutorService newSingleThreadExecutor() { throw new RuntimeException("Stub!"); }
/* 45 */   public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); }
/* 46 */   public static ExecutorService newCachedThreadPool() { throw new RuntimeException("Stub!"); }
/* 47 */   public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); }
/* 48 */   public static ScheduledExecutorService newSingleThreadScheduledExecutor() { throw new RuntimeException("Stub!"); }
/* 49 */   public static ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); }
/* 50 */   public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) { throw new RuntimeException("Stub!"); }
/* 51 */   public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); }
/* 52 */   public static ExecutorService unconfigurableExecutorService(ExecutorService executor) { throw new RuntimeException("Stub!"); }
/* 53 */   public static ScheduledExecutorService unconfigurableScheduledExecutorService(ScheduledExecutorService executor) { throw new RuntimeException("Stub!"); }
/* 54 */   public static ThreadFactory defaultThreadFactory() { throw new RuntimeException("Stub!"); }
/* 55 */   public static ThreadFactory privilegedThreadFactory() { throw new RuntimeException("Stub!"); }
/* 56 */   public static <T> Callable<T> callable(Runnable task, T result) { throw new RuntimeException("Stub!"); }
/* 57 */   public static Callable<Object> callable(Runnable task) { throw new RuntimeException("Stub!"); }
/* 58 */   public static Callable<Object> callable(PrivilegedAction<?> action) { throw new RuntimeException("Stub!"); }
/* 59 */   public static Callable<Object> callable(PrivilegedExceptionAction<?> action) { throw new RuntimeException("Stub!"); }
/* 60 */   public static <T> Callable<T> privilegedCallable(Callable<T> callable) { throw new RuntimeException("Stub!"); }
/* 61 */   public static <T> Callable<T> privilegedCallableUsingCurrentClassLoader(Callable<T> callable) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\Executors.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */