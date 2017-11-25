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
/*    */ public class AuthenticatorDescription
/*    */   implements Parcelable
/*    */ {
/* 21 */   public AuthenticatorDescription(String type, String packageName, int labelId, int iconId, int smallIconId, int prefId, boolean customTokens) { throw new RuntimeException("Stub!"); }
/* 22 */   public AuthenticatorDescription(String type, String packageName, int labelId, int iconId, int smallIconId, int prefId) { throw new RuntimeException("Stub!"); }
/* 23 */   public static AuthenticatorDescription newKey(String type) { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 37 */   public static final Parcelable.Creator<AuthenticatorDescription> CREATOR = null;
/*    */   public final int accountPreferencesId;
/*    */   public final boolean customTokens;
/*    */   public final int iconId;
/*    */   public final int labelId;
/*    */   public final String packageName;
/*    */   public final int smallIconId;
/*    */   public final String type;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\accounts\AuthenticatorDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */