/*    */ package android.content;
/*    */ 
/*    */ import android.accounts.Account;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public class SyncRequest
/*    */   implements Parcelable
/*    */ {
/*    */   public static class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder syncOnce() { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder syncPeriodic(long pollFrequency, long beforeSeconds) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setDisallowMetered(boolean disallow) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setRequiresCharging(boolean requiresCharging) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setSyncAdapter(Account account, String authority) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setExtras(Bundle bundle) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setNoRetry(boolean noRetry) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setIgnoreSettings(boolean ignoreSettings) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder setIgnoreBackoff(boolean ignoreBackoff) { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder setManual(boolean isManual) { throw new RuntimeException("Stub!"); }
/* 34 */     public Builder setExpedited(boolean expedited) { throw new RuntimeException("Stub!"); }
/* 35 */     public SyncRequest build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 37 */   SyncRequest() { throw new RuntimeException("Stub!"); }
/* 38 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 39 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 41 */   public static final Parcelable.Creator<SyncRequest> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\SyncRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */