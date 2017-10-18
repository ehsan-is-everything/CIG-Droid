/*    */ package android.appwidget;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.graphics.drawable.Drawable;
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
/*    */ public class AppWidgetProviderInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public AppWidgetProviderInfo() { throw new RuntimeException("Stub!"); }
/*    */   
/* 23 */   public AppWidgetProviderInfo(Parcel in) { throw new RuntimeException("Stub!"); }
/* 24 */   public final String loadLabel(PackageManager packageManager) { throw new RuntimeException("Stub!"); }
/* 25 */   public final Drawable loadIcon(Context context, int density) { throw new RuntimeException("Stub!"); }
/* 26 */   public final Drawable loadPreviewImage(Context context, int density) { throw new RuntimeException("Stub!"); }
/* 27 */   public final UserHandle getProfile() { throw new RuntimeException("Stub!"); }
/*    */   
/* 29 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 31 */   public AppWidgetProviderInfo clone() { throw new RuntimeException("Stub!"); }
/* 32 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 33 */   public String toString() { throw new RuntimeException("Stub!"); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 58 */   public static final Parcelable.Creator<AppWidgetProviderInfo> CREATOR = null;
/*    */   public static final int RESIZE_BOTH = 3;
/*    */   public static final int RESIZE_HORIZONTAL = 1;
/*    */   public static final int RESIZE_NONE = 0;
/*    */   public static final int RESIZE_VERTICAL = 2;
/*    */   public static final int WIDGET_CATEGORY_HOME_SCREEN = 1;
/*    */   public static final int WIDGET_CATEGORY_KEYGUARD = 2;
/*    */   public static final int WIDGET_CATEGORY_SEARCHBOX = 4;
/*    */   public int autoAdvanceViewId;
/*    */   public ComponentName configure;
/*    */   public int icon;
/*    */   public int initialKeyguardLayout;
/*    */   public int initialLayout;
/*    */   @Deprecated
/*    */   public String label;
/*    */   public int minHeight;
/*    */   public int minResizeHeight;
/*    */   public int minResizeWidth;
/*    */   public int minWidth;
/*    */   public int previewImage;
/*    */   public ComponentName provider;
/*    */   public int resizeMode;
/*    */   public int updatePeriodMillis;
/*    */   public int widgetCategory;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\appwidget\AppWidgetProviderInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */