/*    */ package android.app.job;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.os.IBinder;
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
/*    */ public abstract class JobServiceEngine
/*    */ {
/* 20 */   public JobServiceEngine(Service service) { throw new RuntimeException("Stub!"); }
/* 21 */   public final IBinder getBinder() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean onStartJob(JobParameters paramJobParameters);
/*    */   public abstract boolean onStopJob(JobParameters paramJobParameters);
/* 24 */   public void jobFinished(JobParameters params, boolean needsReschedule) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\job\JobServiceEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */