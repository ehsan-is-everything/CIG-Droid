/*    */ package android.content;
/*    */ 
/*    */ import android.net.Uri;
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
/*    */ public final class UriPermission
/*    */   implements Parcelable
/*    */ {
/* 21 */   UriPermission() { throw new RuntimeException("Stub!"); }
/* 22 */   public Uri getUri() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isReadPermission() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isWritePermission() { throw new RuntimeException("Stub!"); }
/* 25 */   public long getPersistedTime() { throw new RuntimeException("Stub!"); }
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 31 */   public static final Parcelable.Creator<UriPermission> CREATOR = null;
/*    */   public static final long INVALID_TIME = Long.MIN_VALUE;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\UriPermission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */