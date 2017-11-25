/*    */ package android.content.pm;
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
/*    */ @Deprecated
/*    */ public class PackageStats
/*    */   implements Parcelable
/*    */ {
/* 22 */   public PackageStats(String pkgName) { throw new RuntimeException("Stub!"); }
/* 23 */   public PackageStats(Parcel source) { throw new RuntimeException("Stub!"); }
/* 24 */   public PackageStats(PackageStats pStats) { throw new RuntimeException("Stub!"); }
/* 25 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 29 */   public int hashCode() { throw new RuntimeException("Stub!"); }
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
/* 40 */   public static final Parcelable.Creator<PackageStats> CREATOR = null;
/*    */   public long cacheSize;
/*    */   public long codeSize;
/*    */   public long dataSize;
/*    */   public long externalCacheSize;
/*    */   public long externalCodeSize;
/*    */   public long externalDataSize;
/*    */   public long externalMediaSize;
/*    */   public long externalObbSize;
/*    */   public String packageName;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\PackageStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */