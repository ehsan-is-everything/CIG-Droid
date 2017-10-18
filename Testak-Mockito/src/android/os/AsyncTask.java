/*    */ package android.os;
/*    */ 
/*    */ import java.util.concurrent.ExecutionException;
/*    */ import java.util.concurrent.Executor;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import java.util.concurrent.TimeoutException;
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
/*    */ public abstract class AsyncTask<Params, Progress, Result>
/*    */ {
/*    */   public static enum Status
/*    */   {
/* 22 */     FINISHED, 
/* 23 */     PENDING, 
/* 24 */     RUNNING;
/*    */     private Status() {} }
/* 26 */   public AsyncTask() { throw new RuntimeException("Stub!"); }
/* 27 */   public final Status getStatus() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract Result doInBackground(Params... paramVarArgs);
/* 29 */   protected void onPreExecute() { throw new RuntimeException("Stub!"); }
/*    */   
/* 31 */   protected void onPostExecute(Result result) { throw new RuntimeException("Stub!"); }
/*    */   
/* 33 */   protected void onProgressUpdate(Progress... values) { throw new RuntimeException("Stub!"); }
/*    */   
/* 35 */   protected void onCancelled(Result result) { throw new RuntimeException("Stub!"); }
/* 36 */   protected void onCancelled() { throw new RuntimeException("Stub!"); }
/* 37 */   public final boolean isCancelled() { throw new RuntimeException("Stub!"); }
/* 38 */   public final boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); }
/* 39 */   public final Result get() throws InterruptedException, ExecutionException { throw new RuntimeException("Stub!"); }
/* 40 */   public final Result get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException { throw new RuntimeException("Stub!"); }
/* 41 */   public final AsyncTask<Params, Progress, Result> execute(Params... params) { throw new RuntimeException("Stub!"); }
/* 42 */   public final AsyncTask<Params, Progress, Result> executeOnExecutor(Executor exec, Params... params) { throw new RuntimeException("Stub!"); }
/* 43 */   public static void execute(Runnable runnable) { throw new RuntimeException("Stub!"); }
/* 44 */   protected final void publishProgress(Progress... values) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 47 */   public static final Executor THREAD_POOL_EXECUTOR = null; public static final Executor SERIAL_EXECUTOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\AsyncTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */