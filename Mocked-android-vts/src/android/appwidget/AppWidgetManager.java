/*    */ package android.appwidget;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ 
/*    */ public class AppWidgetManager {
/*    */   public static final String ACTION_APPWIDGET_BIND = "android.appwidget.action.APPWIDGET_BIND";
/*    */   public static final String ACTION_APPWIDGET_CONFIGURE = "android.appwidget.action.APPWIDGET_CONFIGURE";
/*    */   public static final String ACTION_APPWIDGET_DELETED = "android.appwidget.action.APPWIDGET_DELETED";
/*    */   public static final String ACTION_APPWIDGET_DISABLED = "android.appwidget.action.APPWIDGET_DISABLED";
/*    */   public static final String ACTION_APPWIDGET_ENABLED = "android.appwidget.action.APPWIDGET_ENABLED";
/*    */   public static final String ACTION_APPWIDGET_HOST_RESTORED = "android.appwidget.action.APPWIDGET_HOST_RESTORED";
/*    */   public static final String ACTION_APPWIDGET_OPTIONS_CHANGED = "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS";
/*    */   public static final String ACTION_APPWIDGET_PICK = "android.appwidget.action.APPWIDGET_PICK";
/*    */   public static final String ACTION_APPWIDGET_RESTORED = "android.appwidget.action.APPWIDGET_RESTORED";
/*    */   public static final String ACTION_APPWIDGET_UPDATE = "android.appwidget.action.APPWIDGET_UPDATE";
/*    */   public static final String EXTRA_APPWIDGET_ID = "appWidgetId";
/*    */   public static final String EXTRA_APPWIDGET_IDS = "appWidgetIds";
/*    */   public static final String EXTRA_APPWIDGET_OLD_IDS = "appWidgetOldIds";
/*    */   
/* 20 */   AppWidgetManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public static AppWidgetManager getInstance(android.content.Context context) { throw new RuntimeException("Stub!"); }
/* 22 */   public void updateAppWidget(int[] appWidgetIds, android.widget.RemoteViews views) { throw new RuntimeException("Stub!"); }
/* 23 */   public void updateAppWidgetOptions(int appWidgetId, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
/* 24 */   public android.os.Bundle getAppWidgetOptions(int appWidgetId) { throw new RuntimeException("Stub!"); }
/* 25 */   public void updateAppWidget(int appWidgetId, android.widget.RemoteViews views) { throw new RuntimeException("Stub!"); }
/* 26 */   public void partiallyUpdateAppWidget(int[] appWidgetIds, android.widget.RemoteViews views) { throw new RuntimeException("Stub!"); }
/* 27 */   public void partiallyUpdateAppWidget(int appWidgetId, android.widget.RemoteViews views) { throw new RuntimeException("Stub!"); }
/* 28 */   public void updateAppWidget(ComponentName provider, android.widget.RemoteViews views) { throw new RuntimeException("Stub!"); }
/* 29 */   public void notifyAppWidgetViewDataChanged(int[] appWidgetIds, int viewId) { throw new RuntimeException("Stub!"); }
/* 30 */   public void notifyAppWidgetViewDataChanged(int appWidgetId, int viewId) { throw new RuntimeException("Stub!"); }
/* 31 */   public java.util.List<AppWidgetProviderInfo> getInstalledProvidersForProfile(android.os.UserHandle profile) { throw new RuntimeException("Stub!"); }
/* 32 */   public java.util.List<AppWidgetProviderInfo> getInstalledProvidersForPackage(String packageName, android.os.UserHandle profile) { throw new RuntimeException("Stub!"); }
/* 33 */   public java.util.List<AppWidgetProviderInfo> getInstalledProviders() { throw new RuntimeException("Stub!"); }
/* 34 */   public AppWidgetProviderInfo getAppWidgetInfo(int appWidgetId) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean bindAppWidgetIdIfAllowed(int appWidgetId, ComponentName provider) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean bindAppWidgetIdIfAllowed(int appWidgetId, ComponentName provider, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean bindAppWidgetIdIfAllowed(int appWidgetId, android.os.UserHandle user, ComponentName provider, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
/* 38 */   public int[] getAppWidgetIds(ComponentName provider) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean isRequestPinAppWidgetSupported() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean requestPinAppWidget(ComponentName provider, android.os.Bundle extras, android.app.PendingIntent successCallback) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final String EXTRA_APPWIDGET_OPTIONS = "appWidgetOptions";
/*    */   public static final String EXTRA_APPWIDGET_PREVIEW = "appWidgetPreview";
/*    */   public static final String EXTRA_APPWIDGET_PROVIDER = "appWidgetProvider";
/*    */   public static final String EXTRA_APPWIDGET_PROVIDER_PROFILE = "appWidgetProviderProfile";
/*    */   public static final String EXTRA_CUSTOM_EXTRAS = "customExtras";
/*    */   public static final String EXTRA_CUSTOM_INFO = "customInfo";
/*    */   public static final String EXTRA_HOST_ID = "hostId";
/*    */   public static final int INVALID_APPWIDGET_ID = 0;
/*    */   public static final String META_DATA_APPWIDGET_PROVIDER = "android.appwidget.provider";
/*    */   public static final String OPTION_APPWIDGET_HOST_CATEGORY = "appWidgetCategory";
/*    */   public static final String OPTION_APPWIDGET_MAX_HEIGHT = "appWidgetMaxHeight";
/*    */   public static final String OPTION_APPWIDGET_MAX_WIDTH = "appWidgetMaxWidth";
/*    */   public static final String OPTION_APPWIDGET_MIN_HEIGHT = "appWidgetMinHeight";
/*    */   public static final String OPTION_APPWIDGET_MIN_WIDTH = "appWidgetMinWidth";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\appwidget\AppWidgetManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */