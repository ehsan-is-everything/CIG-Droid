/*     */ package android.app;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.graphics.Bitmap;
/*     */ import android.os.Parcel;
/*     */ 
/*     */ public class ActivityManager
/*     */ {
/*     */   public static final String ACTION_REPORT_HEAP_LIMIT = "android.app.action.REPORT_HEAP_LIMIT";
/*     */   public static final int LOCK_TASK_MODE_LOCKED = 1;
/*     */   public static final int LOCK_TASK_MODE_NONE = 0;
/*     */   public static final int LOCK_TASK_MODE_PINNED = 2;
/*     */   public static final String META_HOME_ALTERNATE = "android.app.home.alternate";
/*     */   public static final int MOVE_TASK_NO_USER_ACTION = 2;
/*     */   public static final int MOVE_TASK_WITH_HOME = 1;
/*     */   public static final int RECENT_IGNORE_UNAVAILABLE = 2;
/*     */   public static final int RECENT_WITH_EXCLUDED = 1;
/*     */   
/*     */   public static class TaskDescription implements android.os.Parcelable
/*     */   {
/*     */     public TaskDescription(String label, Bitmap icon, int colorPrimary)
/*     */     {
/*  23 */       throw new RuntimeException("Stub!"); }
/*  24 */     public TaskDescription(String label, Bitmap icon) { throw new RuntimeException("Stub!"); }
/*  25 */     public TaskDescription(String label) { throw new RuntimeException("Stub!"); }
/*  26 */     public TaskDescription() { throw new RuntimeException("Stub!"); }
/*  27 */     public TaskDescription(TaskDescription td) { throw new RuntimeException("Stub!"); }
/*  28 */     public String getLabel() { throw new RuntimeException("Stub!"); }
/*  29 */     public Bitmap getIcon() { throw new RuntimeException("Stub!"); }
/*  30 */     public int getPrimaryColor() { throw new RuntimeException("Stub!"); }
/*  31 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*  32 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  33 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); }
/*  34 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/*  36 */     public static final android.os.Parcelable.Creator<TaskDescription> CREATOR = null;
/*     */   }
/*     */   
/*     */   public static class RecentTaskInfo implements android.os.Parcelable {
/*     */     public RecentTaskInfo() {
/*  41 */       throw new RuntimeException("Stub!"); }
/*  42 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*  43 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  44 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  56 */     public static final android.os.Parcelable.Creator<RecentTaskInfo> CREATOR = null;
/*     */     public int affiliatedTaskId;
/*     */     public ComponentName baseActivity;
/*     */     public android.content.Intent baseIntent;
/*     */     public CharSequence description; public int id; public int numActivities; public ComponentName origActivity; public int persistentId; public ActivityManager.TaskDescription taskDescription; public ComponentName topActivity; }
/*  61 */   public static class RunningTaskInfo implements android.os.Parcelable { public RunningTaskInfo() { throw new RuntimeException("Stub!"); }
/*  62 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*  63 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  64 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */     public static final android.os.Parcelable.Creator<RunningTaskInfo> CREATOR = null;
/*     */     public ComponentName baseActivity;
/*     */     public CharSequence description;
/*     */     public int id;
/*     */     public int numActivities; public int numRunning; public Bitmap thumbnail; public ComponentName topActivity; }
/*  78 */   public static class RunningServiceInfo implements android.os.Parcelable { public RunningServiceInfo() { throw new RuntimeException("Stub!"); }
/*  79 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*  80 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  81 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */     public static final android.os.Parcelable.Creator<RunningServiceInfo> CREATOR = null;
/*     */     public static final int FLAG_FOREGROUND = 2;
/*     */     public static final int FLAG_PERSISTENT_PROCESS = 8;
/*     */     public static final int FLAG_STARTED = 1;
/*     */     public static final int FLAG_SYSTEM_PROCESS = 4; public long activeSince; public int clientCount; public int clientLabel; public String clientPackage; public int crashCount; public int flags; public boolean foreground; public long lastActivityTime; public int pid; public String process; public long restarting; public ComponentName service; public boolean started; public int uid; }
/* 106 */   public static class MemoryInfo implements android.os.Parcelable { public MemoryInfo() { throw new RuntimeException("Stub!"); }
/* 107 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 108 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 109 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */     public static final android.os.Parcelable.Creator<MemoryInfo> CREATOR = null;
/*     */     public long availMem;
/*     */     public boolean lowMemory;
/*     */     public long threshold; public long totalMem; }
/*     */   public static class ProcessErrorStateInfo implements android.os.Parcelable { public int uid;
/* 120 */     public ProcessErrorStateInfo() { throw new RuntimeException("Stub!"); }
/* 121 */     public String tag; public int describeContents() { throw new RuntimeException("Stub!"); }
/* 122 */     public String stackTrace; public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 123 */     public String shortMsg; public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */     public String processName;
/*     */     public int pid;
/*     */     public String longMsg;
/* 129 */     public byte[] crashData = null;
/*     */     
/*     */     public int condition;
/*     */     
/*     */     public static final int NO_ERROR = 0;
/*     */     
/*     */     public static final int NOT_RESPONDING = 2;
/*     */     
/* 137 */     public static final android.os.Parcelable.Creator<ProcessErrorStateInfo> CREATOR = null;
/*     */     public static final int CRASHED = 1; }
/*     */   
/*     */   public static class RunningAppProcessInfo implements android.os.Parcelable { public int uid;
/*     */     
/* 142 */     public RunningAppProcessInfo() { throw new RuntimeException("Stub!"); }
/* 143 */     public RunningAppProcessInfo(String pProcessName, int pPid, String[] pArr) { throw new RuntimeException("Stub!"); }
/* 144 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 145 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 146 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public String processName;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */     public String[] pkgList = null;
/*     */     public int pid; public int lru; public int lastTrimLevel; public int importanceReasonPid; public ComponentName importanceReasonComponent; public int importanceReasonCode; public int importance; public static final int REASON_UNKNOWN = 0; public static final int REASON_SERVICE_IN_USE = 2; public static final int REASON_PROVIDER_IN_USE = 1; public static final int IMPORTANCE_VISIBLE = 200; public static final int IMPORTANCE_TOP_SLEEPING = 150; public static final int IMPORTANCE_SERVICE = 300; public static final int IMPORTANCE_PERCEPTIBLE_PRE_26 = 130; public static final int IMPORTANCE_PERCEPTIBLE = 230; public static final int IMPORTANCE_GONE = 1000; public static final int IMPORTANCE_FOREGROUND_SERVICE = 125; public static final int IMPORTANCE_FOREGROUND = 100; @Deprecated
/*     */     public static final int IMPORTANCE_EMPTY = 500; public static final int IMPORTANCE_CACHED = 400; @Deprecated
/* 174 */     public static final int IMPORTANCE_BACKGROUND = 400; public static final android.os.Parcelable.Creator<RunningAppProcessInfo> CREATOR = null;
/*     */   }
/*     */   
/*     */   public static class AppTask {
/* 178 */     AppTask() { throw new RuntimeException("Stub!"); }
/* 179 */     public void finishAndRemoveTask() { throw new RuntimeException("Stub!"); }
/* 180 */     public ActivityManager.RecentTaskInfo getTaskInfo() { throw new RuntimeException("Stub!"); }
/* 181 */     public void moveToFront() { throw new RuntimeException("Stub!"); }
/* 182 */     public void startActivity(android.content.Context context, android.content.Intent intent, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
/* 183 */     public void setExcludeFromRecents(boolean exclude) { throw new RuntimeException("Stub!"); } }
/*     */   
/* 185 */   ActivityManager() { throw new RuntimeException("Stub!"); }
/* 186 */   public int getMemoryClass() { throw new RuntimeException("Stub!"); }
/* 187 */   public int getLargeMemoryClass() { throw new RuntimeException("Stub!"); }
/* 188 */   public boolean isLowRamDevice() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 190 */   public java.util.List<RecentTaskInfo> getRecentTasks(int maxNum, int flags) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 191 */   public java.util.List<AppTask> getAppTasks() { throw new RuntimeException("Stub!"); }
/* 192 */   public android.util.Size getAppTaskThumbnailSize() { throw new RuntimeException("Stub!"); }
/* 193 */   public int addAppTask(Activity activity, android.content.Intent intent, TaskDescription description, Bitmap thumbnail) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 195 */   public java.util.List<RunningTaskInfo> getRunningTasks(int maxNum) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 196 */   public void moveTaskToFront(int taskId, int flags) { throw new RuntimeException("Stub!"); }
/* 197 */   public void moveTaskToFront(int taskId, int flags, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 199 */   public java.util.List<RunningServiceInfo> getRunningServices(int maxNum) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 200 */   public PendingIntent getRunningServiceControlPanel(ComponentName service) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 201 */   public void getMemoryInfo(MemoryInfo outInfo) { throw new RuntimeException("Stub!"); }
/* 202 */   public boolean clearApplicationUserData() { throw new RuntimeException("Stub!"); }
/* 203 */   public java.util.List<ProcessErrorStateInfo> getProcessesInErrorState() { throw new RuntimeException("Stub!"); }
/* 204 */   public java.util.List<RunningAppProcessInfo> getRunningAppProcesses() { throw new RuntimeException("Stub!"); }
/* 205 */   public static void getMyMemoryState(RunningAppProcessInfo outState) { throw new RuntimeException("Stub!"); }
/* 206 */   public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] pids) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 208 */   public void restartPackage(String packageName) { throw new RuntimeException("Stub!"); }
/* 209 */   public void killBackgroundProcesses(String packageName) { throw new RuntimeException("Stub!"); }
/* 210 */   public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() { throw new RuntimeException("Stub!"); }
/* 211 */   public int getLauncherLargeIconDensity() { throw new RuntimeException("Stub!"); }
/* 212 */   public int getLauncherLargeIconSize() { throw new RuntimeException("Stub!"); }
/* 213 */   public static boolean isUserAMonkey() { throw new RuntimeException("Stub!"); }
/* 214 */   public static boolean isRunningInTestHarness() { throw new RuntimeException("Stub!"); }
/* 215 */   public void dumpPackageState(java.io.FileDescriptor fd, String packageName) { throw new RuntimeException("Stub!"); }
/* 216 */   public void setWatchHeapLimit(long pssSize) { throw new RuntimeException("Stub!"); }
/* 217 */   public void clearWatchHeapLimit() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 219 */   public boolean isInLockTaskMode() { throw new RuntimeException("Stub!"); }
/* 220 */   public int getLockTaskModeState() { throw new RuntimeException("Stub!"); }
/* 221 */   public static void setVrThread(int tid) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\ActivityManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */