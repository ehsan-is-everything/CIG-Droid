/*    */ package android.content;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ public final class SyncResult
/*    */   implements Parcelable
/*    */ {
/*    */   public boolean tooManyRetries;
/*    */   public boolean tooManyDeletions;
/*    */   public final boolean syncAlreadyInProgress;
/*    */   public final SyncStats stats;
/*    */   public boolean partialSyncUnavailable;
/*    */   public boolean moreRecordsToGet;
/*    */   public boolean fullSyncRequested;
/*    */   public long delayUntil;
/*    */   public boolean databaseError;
/*    */   
/* 21 */   public SyncResult() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean hasHardError() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean hasSoftError() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean hasError() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean madeSomeProgress() { throw new RuntimeException("Stub!"); }
/* 26 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 29 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 30 */   public String toDebugString() { throw new RuntimeException("Stub!"); }
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
/* 42 */   public static final Parcelable.Creator<SyncResult> CREATOR = null; public static final SyncResult ALREADY_IN_PROGRESS = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\SyncResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */