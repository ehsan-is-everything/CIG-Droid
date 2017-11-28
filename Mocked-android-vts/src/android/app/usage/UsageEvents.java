/*    */ package android.app.usage;
/*    */ 
/*    */ import android.content.res.Configuration;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class UsageEvents
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Event
/*    */   {
/*    */     public static final int CONFIGURATION_CHANGE = 5;
/*    */     public static final int MOVE_TO_BACKGROUND = 2;
/*    */     public static final int MOVE_TO_FOREGROUND = 1;
/*    */     public static final int NONE = 0;
/*    */     public static final int SHORTCUT_INVOCATION = 8;
/*    */     public static final int USER_INTERACTION = 7;
/*    */     
/* 22 */     public Event() { throw new RuntimeException("Stub!"); }
/* 23 */     public String getPackageName() { throw new RuntimeException("Stub!"); }
/* 24 */     public String getClassName() { throw new RuntimeException("Stub!"); }
/* 25 */     public long getTimeStamp() { throw new RuntimeException("Stub!"); }
/* 26 */     public int getEventType() { throw new RuntimeException("Stub!"); }
/* 27 */     public Configuration getConfiguration() { throw new RuntimeException("Stub!"); }
/* 28 */     public String getShortcutId() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 36 */   UsageEvents() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean hasNextEvent() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean getNextEvent(Event eventOut) { throw new RuntimeException("Stub!"); }
/* 39 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 40 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 42 */   public static final Parcelable.Creator<UsageEvents> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\usage\UsageEvents.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */