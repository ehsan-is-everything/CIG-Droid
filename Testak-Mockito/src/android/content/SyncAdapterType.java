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
/*    */ public class SyncAdapterType
/*    */   implements Parcelable
/*    */ {
/* 21 */   public SyncAdapterType(String authority, String accountType, boolean userVisible, boolean supportsUploading) { throw new RuntimeException("Stub!"); }
/* 22 */   public SyncAdapterType(Parcel source) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean supportsUploading() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isUserVisible() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean allowParallelSyncs() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isAlwaysSyncable() { throw new RuntimeException("Stub!"); }
/* 27 */   public String getSettingsActivity() { throw new RuntimeException("Stub!"); }
/* 28 */   public static SyncAdapterType newKey(String authority, String accountType) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 30 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 31 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 32 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 33 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 38 */   public static final Parcelable.Creator<SyncAdapterType> CREATOR = null;
/*    */   public final String accountType;
/*    */   public final String authority;
/*    */   public final boolean isKey;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\SyncAdapterType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */