/*    */ package android.app.admin;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SecurityLog
/*    */ {
/*    */   public static final int TAG_ADB_SHELL_CMD = 210002;
/*    */   public static final int TAG_ADB_SHELL_INTERACTIVE = 210001;
/*    */   public static final int TAG_APP_PROCESS_START = 210005;
/*    */   public static final int TAG_KEYGUARD_DISMISSED = 210006;
/*    */   public static final int TAG_KEYGUARD_DISMISS_AUTH_ATTEMPT = 210007;
/*    */   public static final int TAG_KEYGUARD_SECURED = 210008;
/*    */   public static final int TAG_SYNC_RECV_FILE = 210003;
/*    */   public static final int TAG_SYNC_SEND_FILE = 210004;
/*    */   
/*    */   public static final class SecurityEvent
/*    */     implements Parcelable
/*    */   {
/* 23 */     SecurityEvent() { throw new RuntimeException("Stub!"); }
/* 24 */     public long getTimeNanos() { throw new RuntimeException("Stub!"); }
/* 25 */     public int getTag() { throw new RuntimeException("Stub!"); }
/* 26 */     public Object getData() { throw new RuntimeException("Stub!"); }
/* 27 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */     
/* 30 */     public static final Parcelable.Creator<SecurityEvent> CREATOR = null; }
/*    */   
/* 32 */   public SecurityLog() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\admin\SecurityLog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */