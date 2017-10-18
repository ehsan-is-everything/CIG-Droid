/*    */ package android.app.admin;
/*    */ 
/*    */ import android.content.Context;
/*    */ 
/*    */ public class DeviceAdminReceiver extends android.content.BroadcastReceiver { public static final String ACTION_DEVICE_ADMIN_DISABLED = "android.app.action.DEVICE_ADMIN_DISABLED";
/*    */   public static final String ACTION_DEVICE_ADMIN_DISABLE_REQUESTED = "android.app.action.DEVICE_ADMIN_DISABLE_REQUESTED";
/*    */   public static final String ACTION_DEVICE_ADMIN_ENABLED = "android.app.action.DEVICE_ADMIN_ENABLED";
/*    */   public static final String ACTION_LOCK_TASK_ENTERING = "android.app.action.LOCK_TASK_ENTERING";
/*    */   public static final String ACTION_LOCK_TASK_EXITING = "android.app.action.LOCK_TASK_EXITING";
/*    */   public static final String ACTION_PASSWORD_CHANGED = "android.app.action.ACTION_PASSWORD_CHANGED";
/*    */   public static final String ACTION_PASSWORD_EXPIRING = "android.app.action.ACTION_PASSWORD_EXPIRING";
/*    */   public static final String ACTION_PASSWORD_FAILED = "android.app.action.ACTION_PASSWORD_FAILED";
/*    */   public static final String ACTION_PASSWORD_SUCCEEDED = "android.app.action.ACTION_PASSWORD_SUCCEEDED";
/*    */   public static final String ACTION_PROFILE_PROVISIONING_COMPLETE = "android.app.action.PROFILE_PROVISIONING_COMPLETE";
/*    */   public static final int BUGREPORT_FAILURE_FAILED_COMPLETING = 0;
/*    */   public static final int BUGREPORT_FAILURE_FILE_NO_LONGER_AVAILABLE = 1;
/*    */   public static final String DEVICE_ADMIN_META_DATA = "android.app.device_admin";
/*    */   public static final String EXTRA_DISABLE_WARNING = "android.app.extra.DISABLE_WARNING";
/*    */   public static final String EXTRA_LOCK_TASK_PACKAGE = "android.app.extra.LOCK_TASK_PACKAGE";
/*    */   
/* 21 */   public DeviceAdminReceiver() { throw new RuntimeException("Stub!"); }
/* 22 */   public DevicePolicyManager getManager(Context context) { throw new RuntimeException("Stub!"); }
/* 23 */   public android.content.ComponentName getWho(Context context) { throw new RuntimeException("Stub!"); }
/* 24 */   public void onEnabled(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 25 */   public CharSequence onDisableRequested(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onDisabled(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 28 */   public void onPasswordChanged(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 29 */   public void onPasswordChanged(Context context, android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 31 */   public void onPasswordFailed(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 32 */   public void onPasswordFailed(Context context, android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public void onPasswordSucceeded(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 35 */   public void onPasswordSucceeded(Context context, android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public void onPasswordExpiring(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 38 */   public void onPasswordExpiring(Context context, android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
/* 39 */   public void onProfileProvisioningComplete(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 41 */   public void onReadyForUserInitialization(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 42 */   public void onLockTaskModeEntering(Context context, android.content.Intent intent, String pkg) { throw new RuntimeException("Stub!"); }
/* 43 */   public void onLockTaskModeExiting(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 44 */   public String onChoosePrivateKeyAlias(Context context, android.content.Intent intent, int uid, android.net.Uri uri, String alias) { throw new RuntimeException("Stub!"); }
/* 45 */   public void onSystemUpdatePending(Context context, android.content.Intent intent, long receivedTime) { throw new RuntimeException("Stub!"); }
/* 46 */   public void onBugreportSharingDeclined(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 47 */   public void onBugreportShared(Context context, android.content.Intent intent, String bugreportHash) { throw new RuntimeException("Stub!"); }
/* 48 */   public void onBugreportFailed(Context context, android.content.Intent intent, int failureCode) { throw new RuntimeException("Stub!"); }
/* 49 */   public void onSecurityLogsAvailable(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 50 */   public void onNetworkLogsAvailable(Context context, android.content.Intent intent, long batchToken, int networkLogsCount) { throw new RuntimeException("Stub!"); }
/* 51 */   public void onUserAdded(Context context, android.content.Intent intent, android.os.UserHandle newUser) { throw new RuntimeException("Stub!"); }
/* 52 */   public void onUserRemoved(Context context, android.content.Intent intent, android.os.UserHandle removedUser) { throw new RuntimeException("Stub!"); }
/* 53 */   public void onReceive(Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\admin\DeviceAdminReceiver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */