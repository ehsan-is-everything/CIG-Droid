/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
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
/*    */ public class TaskStackBuilder
/*    */ {
/* 20 */   TaskStackBuilder() { throw new RuntimeException("Stub!"); }
/* 21 */   public static TaskStackBuilder create(Context context) { throw new RuntimeException("Stub!"); }
/* 22 */   public TaskStackBuilder addNextIntent(Intent nextIntent) { throw new RuntimeException("Stub!"); }
/* 23 */   public TaskStackBuilder addNextIntentWithParentStack(Intent nextIntent) { throw new RuntimeException("Stub!"); }
/* 24 */   public TaskStackBuilder addParentStack(Activity sourceActivity) { throw new RuntimeException("Stub!"); }
/* 25 */   public TaskStackBuilder addParentStack(Class<?> sourceActivityClass) { throw new RuntimeException("Stub!"); }
/* 26 */   public TaskStackBuilder addParentStack(ComponentName sourceActivityName) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getIntentCount() { throw new RuntimeException("Stub!"); }
/* 28 */   public Intent editIntentAt(int index) { throw new RuntimeException("Stub!"); }
/* 29 */   public void startActivities() { throw new RuntimeException("Stub!"); }
/* 30 */   public void startActivities(Bundle options) { throw new RuntimeException("Stub!"); }
/* 31 */   public PendingIntent getPendingIntent(int requestCode, int flags) { throw new RuntimeException("Stub!"); }
/* 32 */   public PendingIntent getPendingIntent(int requestCode, int flags, Bundle options) { throw new RuntimeException("Stub!"); }
/* 33 */   public Intent[] getIntents() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\TaskStackBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */