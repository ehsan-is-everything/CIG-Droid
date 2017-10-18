/*    */ package android.content;
/*    */ 
/*    */ import android.accounts.Account;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SyncInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public final Account account;
/*    */   public final String authority;
/*    */   public final long startTime;
/*    */   
/* 21 */   SyncInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 23 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\SyncInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */