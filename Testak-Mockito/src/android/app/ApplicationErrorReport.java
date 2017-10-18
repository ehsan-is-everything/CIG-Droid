/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.util.Printer;
/*    */ 
/*    */ 
/*    */ public class ApplicationErrorReport
/*    */   implements Parcelable
/*    */ {
/*    */   public static class CrashInfo
/*    */   {
/*    */     public String exceptionClassName;
/*    */     public String exceptionMessage;
/*    */     public String stackTrace;
/*    */     public String throwClassName;
/*    */     public String throwFileName;
/*    */     public int throwLineNumber;
/*    */     public String throwMethodName;
/*    */     
/* 23 */     public CrashInfo() { throw new RuntimeException("Stub!"); }
/* 24 */     public CrashInfo(Throwable tr) { throw new RuntimeException("Stub!"); }
/* 25 */     public CrashInfo(Parcel in) { throw new RuntimeException("Stub!"); }
/* 26 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 27 */     public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */   public static class AnrInfo
/*    */   {
/*    */     public String activity;
/*    */     
/*    */     public String cause;
/*    */     public String info;
/*    */     
/* 38 */     public AnrInfo() { throw new RuntimeException("Stub!"); }
/* 39 */     public AnrInfo(Parcel in) { throw new RuntimeException("Stub!"); }
/* 40 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 41 */     public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static class BatteryInfo { public String checkinDetails;
/*    */     public long durationMicros;
/*    */     public String usageDetails;
/*    */     public int usagePercent;
/*    */     
/* 48 */     public BatteryInfo() { throw new RuntimeException("Stub!"); }
/* 49 */     public BatteryInfo(Parcel in) { throw new RuntimeException("Stub!"); }
/* 50 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 51 */     public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */   public static class RunningServiceInfo {
/*    */     public long durationMillis;
/*    */     public String serviceDetails;
/*    */     
/* 59 */     public RunningServiceInfo() { throw new RuntimeException("Stub!"); }
/* 60 */     public RunningServiceInfo(Parcel in) { throw new RuntimeException("Stub!"); }
/* 61 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 62 */     public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/* 66 */   public ApplicationErrorReport() { throw new RuntimeException("Stub!"); }
/* 67 */   public static ComponentName getErrorReportReceiver(Context context, String packageName, int appFlags) { throw new RuntimeException("Stub!"); }
/* 68 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 69 */   public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
/* 70 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 71 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 88 */   public static final android.os.Parcelable.Creator<ApplicationErrorReport> CREATOR = null;
/*    */   public static final int TYPE_ANR = 2;
/*    */   public static final int TYPE_BATTERY = 3;
/*    */   public static final int TYPE_CRASH = 1;
/*    */   public static final int TYPE_NONE = 0;
/*    */   public static final int TYPE_RUNNING_SERVICE = 5;
/*    */   public AnrInfo anrInfo;
/*    */   public BatteryInfo batteryInfo;
/*    */   public CrashInfo crashInfo;
/*    */   public String installerPackageName;
/*    */   public String packageName;
/*    */   public String processName;
/*    */   public RunningServiceInfo runningServiceInfo;
/*    */   public boolean systemApp;
/*    */   public long time;
/*    */   public int type;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\ApplicationErrorReport.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */