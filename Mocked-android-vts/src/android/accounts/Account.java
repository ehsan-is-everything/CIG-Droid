/*    */ package android.accounts;
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
/*    */ public class Account
/*    */   implements Parcelable
/*    */ {
/* 21 */   public Account(String name, String type) { throw new RuntimeException("Stub!"); }
/* 22 */   public Account(Parcel in) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 24 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/* 31 */   public static final Parcelable.Creator<Account> CREATOR = null;
/*    */   public final String name;
/*    */   public final String type;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\accounts\Account.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */