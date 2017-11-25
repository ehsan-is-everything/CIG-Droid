/*    */ package android.os.storage;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
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
/*    */ public final class StorageVolume
/*    */   implements Parcelable
/*    */ {
/* 21 */   StorageVolume() { throw new RuntimeException("Stub!"); }
/* 22 */   public String getDescription(Context context) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isPrimary() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isRemovable() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isEmulated() { throw new RuntimeException("Stub!"); }
/* 26 */   public String getUuid() { throw new RuntimeException("Stub!"); }
/* 27 */   public String getState() { throw new RuntimeException("Stub!"); }
/* 28 */   public Intent createAccessIntent(String directoryName) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 30 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 31 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 32 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 33 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 36 */   public static final Parcelable.Creator<StorageVolume> CREATOR = null;
/*    */   public static final String EXTRA_STORAGE_VOLUME = "android.os.storage.extra.STORAGE_VOLUME";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\storage\StorageVolume.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */