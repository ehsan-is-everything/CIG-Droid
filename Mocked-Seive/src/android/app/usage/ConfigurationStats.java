/*    */ package android.app.usage;
/*    */ 
/*    */ import android.content.res.Configuration;
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
/*    */ public final class ConfigurationStats
/*    */   implements Parcelable
/*    */ {
/* 20 */   public ConfigurationStats(ConfigurationStats stats) { throw new RuntimeException("Stub!"); }
/* 21 */   public Configuration getConfiguration() { throw new RuntimeException("Stub!"); }
/* 22 */   public long getFirstTimeStamp() { throw new RuntimeException("Stub!"); }
/* 23 */   public long getLastTimeStamp() { throw new RuntimeException("Stub!"); }
/* 24 */   public long getLastTimeActive() { throw new RuntimeException("Stub!"); }
/* 25 */   public long getTotalTimeActive() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getActivationCount() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 30 */   public static final Parcelable.Creator<ConfigurationStats> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\usage\ConfigurationStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */