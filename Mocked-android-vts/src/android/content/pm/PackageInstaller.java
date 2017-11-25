/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.IntentSender;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PackageInstaller
/*    */ {
/*    */   public static final String ACTION_SESSION_COMMITTED = "android.content.pm.action.SESSION_COMMITTED";
/*    */   public static final String ACTION_SESSION_DETAILS = "android.content.pm.action.SESSION_DETAILS";
/*    */   public static final String EXTRA_OTHER_PACKAGE_NAME = "android.content.pm.extra.OTHER_PACKAGE_NAME";
/*    */   public static final String EXTRA_PACKAGE_NAME = "android.content.pm.extra.PACKAGE_NAME";
/*    */   public static final String EXTRA_SESSION = "android.content.pm.extra.SESSION";
/*    */   public static final String EXTRA_SESSION_ID = "android.content.pm.extra.SESSION_ID";
/*    */   public static final String EXTRA_STATUS = "android.content.pm.extra.STATUS";
/*    */   public static final String EXTRA_STATUS_MESSAGE = "android.content.pm.extra.STATUS_MESSAGE";
/*    */   public static final String EXTRA_STORAGE_PATH = "android.content.pm.extra.STORAGE_PATH";
/*    */   
/*    */   public static abstract class SessionCallback
/*    */   {
/* 22 */     public SessionCallback() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract void onCreated(int paramInt);
/*    */     
/*    */     public abstract void onBadgingChanged(int paramInt);
/*    */     
/*    */     public abstract void onActiveChanged(int paramInt, boolean paramBoolean);
/*    */     
/*    */     public abstract void onProgressChanged(int paramInt, float paramFloat);
/*    */     public abstract void onFinished(int paramInt, boolean paramBoolean); }
/* 32 */   public static class Session implements java.io.Closeable { Session() { throw new RuntimeException("Stub!"); }
/* 33 */     public void setStagingProgress(float progress) { throw new RuntimeException("Stub!"); }
/* 34 */     public java.io.OutputStream openWrite(String name, long offsetBytes, long lengthBytes) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */     public void fsync(java.io.OutputStream out) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */     public String[] getNames() throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */     public java.io.InputStream openRead(String name) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */     public void removeSplit(String splitName) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */     public void commit(IntentSender statusReceiver) { throw new RuntimeException("Stub!"); }
/* 40 */     public void close() { throw new RuntimeException("Stub!"); }
/* 41 */     public void abandon() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static final int STATUS_FAILURE = 1;
/*    */   public static final int STATUS_FAILURE_ABORTED = 3;
/*    */   
/* 46 */   public static class SessionParams implements android.os.Parcelable { public SessionParams(int mode) { throw new RuntimeException("Stub!"); }
/* 47 */     public void setInstallLocation(int installLocation) { throw new RuntimeException("Stub!"); }
/* 48 */     public void setSize(long sizeBytes) { throw new RuntimeException("Stub!"); }
/* 49 */     public void setAppPackageName(String appPackageName) { throw new RuntimeException("Stub!"); }
/* 50 */     public void setAppIcon(android.graphics.Bitmap appIcon) { throw new RuntimeException("Stub!"); }
/* 51 */     public void setAppLabel(CharSequence appLabel) { throw new RuntimeException("Stub!"); }
/* 52 */     public void setOriginatingUri(android.net.Uri originatingUri) { throw new RuntimeException("Stub!"); }
/* 53 */     public void setOriginatingUid(int originatingUid) { throw new RuntimeException("Stub!"); }
/* 54 */     public void setReferrerUri(android.net.Uri referrerUri) { throw new RuntimeException("Stub!"); }
/* 55 */     public void setInstallReason(int installReason) { throw new RuntimeException("Stub!"); }
/* 56 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 57 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/* 61 */     public static final android.os.Parcelable.Creator<SessionParams> CREATOR = null;
/*    */     public static final int MODE_FULL_INSTALL = 1;
/*    */     public static final int MODE_INHERIT_EXISTING = 2;
/*    */   }
/*    */   
/* 66 */   public static class SessionInfo implements android.os.Parcelable { SessionInfo() { throw new RuntimeException("Stub!"); }
/* 67 */     public int getSessionId() { throw new RuntimeException("Stub!"); }
/* 68 */     public String getInstallerPackageName() { throw new RuntimeException("Stub!"); }
/* 69 */     public float getProgress() { throw new RuntimeException("Stub!"); }
/* 70 */     public boolean isActive() { throw new RuntimeException("Stub!"); }
/* 71 */     public boolean isSealed() { throw new RuntimeException("Stub!"); }
/* 72 */     public int getInstallReason() { throw new RuntimeException("Stub!"); }
/* 73 */     public String getAppPackageName() { throw new RuntimeException("Stub!"); }
/* 74 */     public android.graphics.Bitmap getAppIcon() { throw new RuntimeException("Stub!"); }
/* 75 */     public CharSequence getAppLabel() { throw new RuntimeException("Stub!"); }
/* 76 */     public android.content.Intent createDetailsIntent() { throw new RuntimeException("Stub!"); }
/* 77 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 78 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */     
/* 80 */     public static final android.os.Parcelable.Creator<SessionInfo> CREATOR = null; }
/*    */   
/* 82 */   PackageInstaller() { throw new RuntimeException("Stub!"); }
/* 83 */   public int createSession(SessionParams params) throws IOException { throw new RuntimeException("Stub!"); }
/* 84 */   public Session openSession(int sessionId) throws IOException { throw new RuntimeException("Stub!"); }
/* 85 */   public void updateSessionAppIcon(int sessionId, android.graphics.Bitmap appIcon) { throw new RuntimeException("Stub!"); }
/* 86 */   public void updateSessionAppLabel(int sessionId, CharSequence appLabel) { throw new RuntimeException("Stub!"); }
/* 87 */   public void abandonSession(int sessionId) { throw new RuntimeException("Stub!"); }
/* 88 */   public SessionInfo getSessionInfo(int sessionId) { throw new RuntimeException("Stub!"); }
/* 89 */   public java.util.List<SessionInfo> getAllSessions() { throw new RuntimeException("Stub!"); }
/* 90 */   public java.util.List<SessionInfo> getMySessions() { throw new RuntimeException("Stub!"); }
/* 91 */   public void uninstall(String packageName, IntentSender statusReceiver) { throw new RuntimeException("Stub!"); }
/* 92 */   public void uninstall(VersionedPackage versionedPackage, IntentSender statusReceiver) { throw new RuntimeException("Stub!"); }
/* 93 */   public void registerSessionCallback(SessionCallback callback) { throw new RuntimeException("Stub!"); }
/* 94 */   public void registerSessionCallback(SessionCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 95 */   public void unregisterSessionCallback(SessionCallback callback) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int STATUS_FAILURE_BLOCKED = 2;
/*    */   public static final int STATUS_FAILURE_CONFLICT = 5;
/*    */   public static final int STATUS_FAILURE_INCOMPATIBLE = 7;
/*    */   public static final int STATUS_FAILURE_INVALID = 4;
/*    */   public static final int STATUS_FAILURE_STORAGE = 6;
/*    */   public static final int STATUS_PENDING_USER_ACTION = -1;
/*    */   public static final int STATUS_SUCCESS = 0;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\PackageInstaller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */