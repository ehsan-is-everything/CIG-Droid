/*    */ package android.app.job;
/*    */ 
/*    */ import android.content.ClipData;
/*    */ import android.content.ComponentName;
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
/*    */ public class JobInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int BACKOFF_POLICY_EXPONENTIAL = 1;
/*    */   public static final int BACKOFF_POLICY_LINEAR = 0;
/*    */   
/*    */   public static final class TriggerContentUri
/*    */     implements Parcelable
/*    */   {
/* 24 */     public TriggerContentUri(Uri uri, int flags) { throw new RuntimeException("Stub!"); }
/* 25 */     public Uri getUri() { throw new RuntimeException("Stub!"); }
/* 26 */     public int getFlags() { throw new RuntimeException("Stub!"); }
/* 27 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 28 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 29 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 30 */     public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/* 33 */     public static final Parcelable.Creator<TriggerContentUri> CREATOR = null;
/*    */     public static final int FLAG_NOTIFY_FOR_DESCENDANTS = 1;
/*    */   }
/*    */   
/* 37 */   public static final class Builder { public Builder(int jobId, ComponentName jobService) { throw new RuntimeException("Stub!"); }
/* 38 */     public Builder setExtras(PersistableBundle extras) { throw new RuntimeException("Stub!"); }
/* 39 */     public Builder setTransientExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 40 */     public Builder setClipData(ClipData clip, int grantFlags) { throw new RuntimeException("Stub!"); }
/* 41 */     public Builder setRequiredNetworkType(int networkType) { throw new RuntimeException("Stub!"); }
/* 42 */     public Builder setRequiresCharging(boolean requiresCharging) { throw new RuntimeException("Stub!"); }
/* 43 */     public Builder setRequiresBatteryNotLow(boolean batteryNotLow) { throw new RuntimeException("Stub!"); }
/* 44 */     public Builder setRequiresDeviceIdle(boolean requiresDeviceIdle) { throw new RuntimeException("Stub!"); }
/* 45 */     public Builder setRequiresStorageNotLow(boolean storageNotLow) { throw new RuntimeException("Stub!"); }
/* 46 */     public Builder addTriggerContentUri(JobInfo.TriggerContentUri uri) { throw new RuntimeException("Stub!"); }
/* 47 */     public Builder setTriggerContentUpdateDelay(long durationMs) { throw new RuntimeException("Stub!"); }
/* 48 */     public Builder setTriggerContentMaxDelay(long durationMs) { throw new RuntimeException("Stub!"); }
/* 49 */     public Builder setPeriodic(long intervalMillis) { throw new RuntimeException("Stub!"); }
/* 50 */     public Builder setPeriodic(long intervalMillis, long flexMillis) { throw new RuntimeException("Stub!"); }
/* 51 */     public Builder setMinimumLatency(long minLatencyMillis) { throw new RuntimeException("Stub!"); }
/* 52 */     public Builder setOverrideDeadline(long maxExecutionDelayMillis) { throw new RuntimeException("Stub!"); }
/* 53 */     public Builder setBackoffCriteria(long initialBackoffMillis, int backoffPolicy) { throw new RuntimeException("Stub!"); }
/* 54 */     public Builder setPersisted(boolean isPersisted) { throw new RuntimeException("Stub!"); }
/* 55 */     public JobInfo build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 57 */   JobInfo() { throw new RuntimeException("Stub!"); }
/* 58 */   public static final long getMinPeriodMillis() { throw new RuntimeException("Stub!"); }
/* 59 */   public static final long getMinFlexMillis() { throw new RuntimeException("Stub!"); }
/* 60 */   public int getId() { throw new RuntimeException("Stub!"); }
/* 61 */   public PersistableBundle getExtras() { throw new RuntimeException("Stub!"); }
/* 62 */   public Bundle getTransientExtras() { throw new RuntimeException("Stub!"); }
/* 63 */   public ClipData getClipData() { throw new RuntimeException("Stub!"); }
/* 64 */   public int getClipGrantFlags() { throw new RuntimeException("Stub!"); }
/* 65 */   public ComponentName getService() { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean isRequireCharging() { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean isRequireBatteryNotLow() { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean isRequireDeviceIdle() { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean isRequireStorageNotLow() { throw new RuntimeException("Stub!"); }
/* 70 */   public TriggerContentUri[] getTriggerContentUris() { throw new RuntimeException("Stub!"); }
/* 71 */   public long getTriggerContentUpdateDelay() { throw new RuntimeException("Stub!"); }
/* 72 */   public long getTriggerContentMaxDelay() { throw new RuntimeException("Stub!"); }
/* 73 */   public int getNetworkType() { throw new RuntimeException("Stub!"); }
/* 74 */   public long getMinLatencyMillis() { throw new RuntimeException("Stub!"); }
/* 75 */   public long getMaxExecutionDelayMillis() { throw new RuntimeException("Stub!"); }
/* 76 */   public boolean isPeriodic() { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean isPersisted() { throw new RuntimeException("Stub!"); }
/* 78 */   public long getIntervalMillis() { throw new RuntimeException("Stub!"); }
/* 79 */   public long getFlexMillis() { throw new RuntimeException("Stub!"); }
/* 80 */   public long getInitialBackoffMillis() { throw new RuntimeException("Stub!"); }
/* 81 */   public int getBackoffPolicy() { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 83 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 84 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 85 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 86 */   public String toString() { throw new RuntimeException("Stub!"); }
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
/* 97 */   public static final Parcelable.Creator<JobInfo> CREATOR = null;
/*    */   public static final long DEFAULT_INITIAL_BACKOFF_MILLIS = 30000L;
/*    */   public static final long MAX_BACKOFF_DELAY_MILLIS = 18000000L;
/*    */   public static final int NETWORK_TYPE_ANY = 1;
/*    */   public static final int NETWORK_TYPE_METERED = 4;
/*    */   public static final int NETWORK_TYPE_NONE = 0;
/*    */   public static final int NETWORK_TYPE_NOT_ROAMING = 3;
/*    */   public static final int NETWORK_TYPE_UNMETERED = 2;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\job\JobInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */