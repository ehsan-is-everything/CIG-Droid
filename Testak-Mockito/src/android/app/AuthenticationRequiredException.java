/*    */ package android.app;
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
/*    */ public final class AuthenticationRequiredException
/*    */   extends SecurityException
/*    */   implements Parcelable
/*    */ {
/* 22 */   public AuthenticationRequiredException(Throwable cause, PendingIntent userAction) { throw new RuntimeException("Stub!"); }
/* 23 */   public PendingIntent getUserAction() { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 27 */   public static final Parcelable.Creator<AuthenticationRequiredException> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\AuthenticationRequiredException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */