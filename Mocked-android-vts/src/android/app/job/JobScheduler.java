/*    */ package android.app.job;
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
/*    */ public abstract class JobScheduler
/*    */ {
/*    */   public static final int RESULT_FAILURE = 0;
/*    */   public static final int RESULT_SUCCESS = 1;
/*    */   
/*    */   public JobScheduler()
/*    */   {
/* 20 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract int schedule(JobInfo paramJobInfo);
/*    */   
/*    */   public abstract int enqueue(JobInfo paramJobInfo, JobWorkItem paramJobWorkItem);
/*    */   
/*    */   public abstract void cancel(int paramInt);
/*    */   
/*    */   public abstract void cancelAll();
/*    */   
/*    */   public abstract List<JobInfo> getAllPendingJobs();
/*    */   
/*    */   public abstract JobInfo getPendingJob(int paramInt);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\job\JobScheduler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */