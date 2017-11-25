/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Rect;
/*    */ import android.os.Bundle;
/*    */ import android.util.Pair;
/*    */ import android.view.View;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ActivityOptions
/*    */ {
/*    */   public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
/*    */   public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";
/*    */   
/* 20 */   ActivityOptions() { throw new RuntimeException("Stub!"); }
/* 21 */   public static ActivityOptions makeCustomAnimation(Context context, int enterResId, int exitResId) { throw new RuntimeException("Stub!"); }
/* 22 */   public static ActivityOptions makeScaleUpAnimation(View source, int startX, int startY, int width, int height) { throw new RuntimeException("Stub!"); }
/* 23 */   public static ActivityOptions makeClipRevealAnimation(View source, int startX, int startY, int width, int height) { throw new RuntimeException("Stub!"); }
/* 24 */   public static ActivityOptions makeThumbnailScaleUpAnimation(View source, Bitmap thumbnail, int startX, int startY) { throw new RuntimeException("Stub!"); }
/* 25 */   public static ActivityOptions makeSceneTransitionAnimation(Activity activity, View sharedElement, String sharedElementName) { throw new RuntimeException("Stub!"); }
/*    */   @SafeVarargs
/* 27 */   public static ActivityOptions makeSceneTransitionAnimation(Activity activity, Pair<View, String>... sharedElements) { throw new RuntimeException("Stub!"); }
/* 28 */   public static ActivityOptions makeTaskLaunchBehind() { throw new RuntimeException("Stub!"); }
/* 29 */   public static ActivityOptions makeBasic() { throw new RuntimeException("Stub!"); }
/* 30 */   public ActivityOptions setLaunchBounds(Rect screenSpacePixelRect) { throw new RuntimeException("Stub!"); }
/* 31 */   public Rect getLaunchBounds() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getLaunchDisplayId() { throw new RuntimeException("Stub!"); }
/* 33 */   public ActivityOptions setLaunchDisplayId(int launchDisplayId) { throw new RuntimeException("Stub!"); }
/* 34 */   public void update(ActivityOptions otherOptions) { throw new RuntimeException("Stub!"); }
/* 35 */   public Bundle toBundle() { throw new RuntimeException("Stub!"); }
/* 36 */   public void requestUsageTimeReport(PendingIntent receiver) { throw new RuntimeException("Stub!"); }
/* 37 */   public ActivityOptions setAppVerificationBundle(Bundle bundle) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\ActivityOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */