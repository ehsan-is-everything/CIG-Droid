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
/*    */ public class PeriodicSync
/*    */   implements Parcelable
/*    */ {
/* 21 */   public PeriodicSync(Account account, String authority, Bundle extras, long periodInSeconds) { throw new RuntimeException("Stub!"); }
/* 22 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 23 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 25 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 31 */   public static final Parcelable.Creator<PeriodicSync> CREATOR = null;
/*    */   public final Account account;
/*    */   public final String authority;
/*    */   public final Bundle extras;
/*    */   public final long period;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\PeriodicSync.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */