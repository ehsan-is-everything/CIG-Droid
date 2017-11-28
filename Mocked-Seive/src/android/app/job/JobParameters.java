/*    */ package android.app.job;
/*    */ 
/*    */ import android.content.ClipData;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.PersistableBundle;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JobParameters
/*    */   implements Parcelable
/*    */ {
/* 21 */   JobParameters() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getJobId() { throw new RuntimeException("Stub!"); }
/* 23 */   public PersistableBundle getExtras() { throw new RuntimeException("Stub!"); }
/* 24 */   public Bundle getTransientExtras() { throw new RuntimeException("Stub!"); }
/* 25 */   public ClipData getClipData() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getClipGrantFlags() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isOverrideDeadlineExpired() { throw new RuntimeException("Stub!"); }
/* 28 */   public Uri[] getTriggeredContentUris() { throw new RuntimeException("Stub!"); }
/* 29 */   public String[] getTriggeredContentAuthorities() { throw new RuntimeException("Stub!"); }
/* 30 */   public JobWorkItem dequeueWork() { throw new RuntimeException("Stub!"); }
/* 31 */   public void completeWork(JobWorkItem work) { throw new RuntimeException("Stub!"); }
/* 32 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 33 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 35 */   public static final Parcelable.Creator<JobParameters> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\job\JobParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */