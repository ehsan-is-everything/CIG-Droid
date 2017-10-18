/*    */ package android.content;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.UserHandle;
/*    */ import android.util.AndroidException;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class IntentSender
/*    */   implements Parcelable
/*    */ {
/*    */   public static abstract interface OnFinished
/*    */   {
/*    */     public abstract void onSendFinished(IntentSender paramIntentSender, Intent paramIntent, int paramInt, String paramString, Bundle paramBundle);
/*    */   }
/*    */   
/*    */   public static class SendIntentException
/*    */     extends AndroidException
/*    */   {
/* 24 */     public SendIntentException() { throw new RuntimeException("Stub!"); }
/* 25 */     public SendIntentException(String name) { throw new RuntimeException("Stub!"); }
/* 26 */     public SendIntentException(Exception cause) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 32 */   IntentSender() { throw new RuntimeException("Stub!"); }
/* 33 */   public void sendIntent(Context context, int code, Intent intent, OnFinished onFinished, Handler handler) throws IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/* 34 */   public void sendIntent(Context context, int code, Intent intent, OnFinished onFinished, Handler handler, String requiredPermission) throws IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public String getTargetPackage() { throw new RuntimeException("Stub!"); }
/* 37 */   public String getCreatorPackage() { throw new RuntimeException("Stub!"); }
/* 38 */   public int getCreatorUid() { throw new RuntimeException("Stub!"); }
/* 39 */   public UserHandle getCreatorUserHandle() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean equals(Object otherObj) { throw new RuntimeException("Stub!"); }
/* 41 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 43 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 44 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 45 */   public static void writeIntentSenderOrNullToParcel(IntentSender sender, Parcel out) { throw new RuntimeException("Stub!"); }
/* 46 */   public static IntentSender readIntentSenderOrNullFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
/*    */   
/* 48 */   public static final Parcelable.Creator<IntentSender> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\IntentSender.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */