/*    */ package android.content;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ public class SyncStats
/*    */   implements Parcelable
/*    */ {
/* 21 */   public SyncStats() { throw new RuntimeException("Stub!"); }
/* 22 */   public SyncStats(Parcel in) { throw new RuntimeException("Stub!"); }
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 24 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
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
/* 37 */   public static final Parcelable.Creator<SyncStats> CREATOR = null;
/*    */   public long numAuthExceptions;
/*    */   public long numConflictDetectedExceptions;
/*    */   public long numDeletes;
/*    */   public long numEntries;
/*    */   public long numInserts;
/*    */   public long numIoExceptions;
/*    */   public long numParseExceptions;
/*    */   public long numSkippedEntries;
/*    */   public long numUpdates;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\SyncStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */