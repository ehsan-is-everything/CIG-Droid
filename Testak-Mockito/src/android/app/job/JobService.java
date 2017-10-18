/*    */ package android.app.job;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
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
/*    */ public abstract class JobService
/*    */   extends Service
/*    */ {
/*    */   public static final String PERMISSION_BIND = "android.permission.BIND_JOB_SERVICE";
/*    */   
/* 21 */   public JobService() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean onStartJob(JobParameters paramJobParameters);
/*    */   public abstract boolean onStopJob(JobParameters paramJobParameters);
/* 24 */   public final void jobFinished(JobParameters params, boolean needsReschedule) { throw new RuntimeException("Stub!"); }
/* 25 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\job\JobService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */