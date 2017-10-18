/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentSender;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.UserHandle;
/*    */ import android.util.AndroidException;
/*    */ 
/*    */ public final class PendingIntent
/*    */   implements Parcelable
/*    */ {
/*    */   public static abstract interface OnFinished
/*    */   {
/*    */     public abstract void onSendFinished(PendingIntent paramPendingIntent, Intent paramIntent, int paramInt, String paramString, Bundle paramBundle);
/*    */   }
/*    */   
/*    */   public static class CanceledException
/*    */     extends AndroidException
/*    */   {
/* 24 */     public CanceledException() { throw new RuntimeException("Stub!"); }
/* 25 */     public CanceledException(String name) { throw new RuntimeException("Stub!"); }
/* 26 */     public CanceledException(Exception cause) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 32 */   PendingIntent() { throw new RuntimeException("Stub!"); }
/* 33 */   public static PendingIntent getActivity(Context context, int requestCode, Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/* 34 */   public static PendingIntent getActivity(Context context, int requestCode, Intent intent, int flags, Bundle options) { throw new RuntimeException("Stub!"); }
/* 35 */   public static PendingIntent getActivities(Context context, int requestCode, Intent[] intents, int flags) { throw new RuntimeException("Stub!"); }
/* 36 */   public static PendingIntent getActivities(Context context, int requestCode, Intent[] intents, int flags, Bundle options) { throw new RuntimeException("Stub!"); }
/* 37 */   public static PendingIntent getBroadcast(Context context, int requestCode, Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/* 38 */   public static PendingIntent getService(Context context, int requestCode, Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/* 39 */   public static PendingIntent getForegroundService(Context context, int requestCode, Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/* 40 */   public IntentSender getIntentSender() { throw new RuntimeException("Stub!"); }
/* 41 */   public void cancel() { throw new RuntimeException("Stub!"); }
/* 42 */   public void send() throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
/* 43 */   public void send(int code) throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
/* 44 */   public void send(Context context, int code, Intent intent) throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
/* 45 */   public void send(int code, OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
/* 46 */   public void send(Context context, int code, Intent intent, OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
/* 47 */   public void send(Context context, int code, Intent intent, OnFinished onFinished, Handler handler, String requiredPermission) throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
/* 48 */   public void send(Context context, int code, Intent intent, OnFinished onFinished, Handler handler, String requiredPermission, Bundle options) throws PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 50 */   public String getTargetPackage() { throw new RuntimeException("Stub!"); }
/* 51 */   public String getCreatorPackage() { throw new RuntimeException("Stub!"); }
/* 52 */   public int getCreatorUid() { throw new RuntimeException("Stub!"); }
/* 53 */   public UserHandle getCreatorUserHandle() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean equals(Object otherObj) { throw new RuntimeException("Stub!"); }
/* 55 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 56 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 57 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 58 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 59 */   public static void writePendingIntentOrNullToParcel(PendingIntent sender, Parcel out) { throw new RuntimeException("Stub!"); }
/* 60 */   public static PendingIntent readPendingIntentOrNullFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 67 */   public static final android.os.Parcelable.Creator<PendingIntent> CREATOR = null;
/*    */   public static final int FLAG_CANCEL_CURRENT = 268435456;
/*    */   public static final int FLAG_IMMUTABLE = 67108864;
/*    */   public static final int FLAG_NO_CREATE = 536870912;
/*    */   public static final int FLAG_ONE_SHOT = 1073741824;
/*    */   public static final int FLAG_UPDATE_CURRENT = 134217728;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\PendingIntent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */