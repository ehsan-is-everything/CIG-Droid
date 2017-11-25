/*    */ package android.appwidget;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.content.Context;
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
/*    */ 
/*    */ public class AppWidgetHost
/*    */ {
/* 20 */   public AppWidgetHost(Context context, int hostId) { throw new RuntimeException("Stub!"); }
/* 21 */   public void startListening() { throw new RuntimeException("Stub!"); }
/* 22 */   public void stopListening() { throw new RuntimeException("Stub!"); }
/* 23 */   public int allocateAppWidgetId() { throw new RuntimeException("Stub!"); }
/* 24 */   public final void startAppWidgetConfigureActivityForResult(Activity activity, int appWidgetId, int intentFlags, int requestCode, Bundle options) { throw new RuntimeException("Stub!"); }
/* 25 */   public int[] getAppWidgetIds() { throw new RuntimeException("Stub!"); }
/* 26 */   public void deleteAppWidgetId(int appWidgetId) { throw new RuntimeException("Stub!"); }
/* 27 */   public void deleteHost() { throw new RuntimeException("Stub!"); }
/* 28 */   public static void deleteAllHosts() { throw new RuntimeException("Stub!"); }
/* 29 */   public final AppWidgetHostView createView(Context context, int appWidgetId, AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); }
/* 30 */   protected AppWidgetHostView onCreateView(Context context, int appWidgetId, AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); }
/* 31 */   protected void onProviderChanged(int appWidgetId, AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); }
/* 32 */   protected void onProvidersChanged() { throw new RuntimeException("Stub!"); }
/* 33 */   protected void clearViews() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\appwidget\AppWidgetHost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */