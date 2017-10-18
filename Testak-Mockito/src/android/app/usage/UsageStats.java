/*    */ package android.app.usage;
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
/*    */ public final class UsageStats
/*    */   implements Parcelable
/*    */ {
/* 21 */   public UsageStats(UsageStats stats) { throw new RuntimeException("Stub!"); }
/* 22 */   public String getPackageName() { throw new RuntimeException("Stub!"); }
/* 23 */   public long getFirstTimeStamp() { throw new RuntimeException("Stub!"); }
/* 24 */   public long getLastTimeStamp() { throw new RuntimeException("Stub!"); }
/* 25 */   public long getLastTimeUsed() { throw new RuntimeException("Stub!"); }
/* 26 */   public long getTotalTimeInForeground() { throw new RuntimeException("Stub!"); }
/* 27 */   public void add(UsageStats right) { throw new RuntimeException("Stub!"); }
/* 28 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 29 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 31 */   public static final Parcelable.Creator<UsageStats> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\usage\UsageStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */