/*    */ package android.service.notification;
/*    */ 
/*    */ import android.app.Notification;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.UserHandle;
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
/*    */ public class StatusBarNotification
/*    */   implements Parcelable
/*    */ {
/*    */   @Deprecated
/* 22 */   public StatusBarNotification(String pkg, String opPkg, int id, String tag, int uid, int initialPid, int score, Notification notification, UserHandle user, long postTime) { throw new RuntimeException("Stub!"); }
/* 23 */   public StatusBarNotification(Parcel in) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isGroup() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */   public StatusBarNotification clone() { throw new RuntimeException("Stub!"); }
/* 28 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isOngoing() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isClearable() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 32 */   public int getUserId() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getPackageName() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getId() { throw new RuntimeException("Stub!"); }
/* 35 */   public String getTag() { throw new RuntimeException("Stub!"); }
/* 36 */   public Notification getNotification() { throw new RuntimeException("Stub!"); }
/* 37 */   public UserHandle getUser() { throw new RuntimeException("Stub!"); }
/* 38 */   public long getPostTime() { throw new RuntimeException("Stub!"); }
/* 39 */   public String getKey() { throw new RuntimeException("Stub!"); }
/* 40 */   public String getGroupKey() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setOverrideGroupKey(String overrideGroupKey) { throw new RuntimeException("Stub!"); }
/* 42 */   public String getOverrideGroupKey() { throw new RuntimeException("Stub!"); }
/*    */   
/* 44 */   public static final Parcelable.Creator<StatusBarNotification> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\notification\StatusBarNotification.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */