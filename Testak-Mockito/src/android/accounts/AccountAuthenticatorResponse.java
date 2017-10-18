/*    */ package android.accounts;
/*    */ 
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
/*    */ 
/*    */ public class AccountAuthenticatorResponse
/*    */   implements Parcelable
/*    */ {
/* 21 */   public AccountAuthenticatorResponse(Parcel parcel) { throw new RuntimeException("Stub!"); }
/* 22 */   public void onResult(Bundle result) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onRequestContinued() { throw new RuntimeException("Stub!"); }
/* 24 */   public void onError(int errorCode, String errorMessage) { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 28 */   public static final Parcelable.Creator<AccountAuthenticatorResponse> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\accounts\AccountAuthenticatorResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */