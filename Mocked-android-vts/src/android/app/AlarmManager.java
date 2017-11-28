/*    */ package android.app;
/*    */ 
/*    */ import android.os.Handler;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AlarmManager
/*    */ {
/*    */   public static final String ACTION_NEXT_ALARM_CLOCK_CHANGED = "android.app.action.NEXT_ALARM_CLOCK_CHANGED";
/*    */   public static final int ELAPSED_REALTIME = 3;
/*    */   public static final int ELAPSED_REALTIME_WAKEUP = 2;
/*    */   public static final long INTERVAL_DAY = 86400000L;
/*    */   public static final long INTERVAL_FIFTEEN_MINUTES = 900000L;
/*    */   public static final long INTERVAL_HALF_DAY = 43200000L;
/*    */   public static final long INTERVAL_HALF_HOUR = 1800000L;
/*    */   public static final long INTERVAL_HOUR = 3600000L;
/*    */   public static final int RTC = 1;
/*    */   public static final int RTC_WAKEUP = 0;
/*    */   
/*    */   public static final class AlarmClockInfo
/*    */     implements Parcelable
/*    */   {
/* 27 */     public AlarmClockInfo(long triggerTime, PendingIntent showIntent) { throw new RuntimeException("Stub!"); }
/* 28 */     public long getTriggerTime() { throw new RuntimeException("Stub!"); }
/* 29 */     public PendingIntent getShowIntent() { throw new RuntimeException("Stub!"); }
/* 30 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 31 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */     
/* 33 */     public static final Parcelable.Creator<AlarmClockInfo> CREATOR = null; }
/*    */   
/* 35 */   AlarmManager() { throw new RuntimeException("Stub!"); }
/* 36 */   public void set(int type, long triggerAtMillis, PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 37 */   public void set(int type, long triggerAtMillis, String tag, OnAlarmListener listener, Handler targetHandler) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setRepeating(int type, long triggerAtMillis, long intervalMillis, PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setWindow(int type, long windowStartMillis, long windowLengthMillis, PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setWindow(int type, long windowStartMillis, long windowLengthMillis, String tag, OnAlarmListener listener, Handler targetHandler) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setExact(int type, long triggerAtMillis, PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setExact(int type, long triggerAtMillis, String tag, OnAlarmListener listener, Handler targetHandler) { throw new RuntimeException("Stub!"); }
/* 43 */   public void setAlarmClock(AlarmClockInfo info, PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setInexactRepeating(int type, long triggerAtMillis, long intervalMillis, PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setAndAllowWhileIdle(int type, long triggerAtMillis, PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setExactAndAllowWhileIdle(int type, long triggerAtMillis, PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 47 */   public void cancel(PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 48 */   public void cancel(OnAlarmListener listener) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setTime(long millis) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setTimeZone(String timeZone) { throw new RuntimeException("Stub!"); }
/* 51 */   public AlarmClockInfo getNextAlarmClock() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnAlarmListener
/*    */   {
/*    */     public abstract void onAlarm();
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\AlarmManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */