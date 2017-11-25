/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import android.os.UserHandle;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LauncherApps
/*    */ {
/*    */   public static final String ACTION_CONFIRM_PIN_APPWIDGET = "android.content.pm.action.CONFIRM_PIN_APPWIDGET";
/*    */   public static final String ACTION_CONFIRM_PIN_SHORTCUT = "android.content.pm.action.CONFIRM_PIN_SHORTCUT";
/*    */   public static final String EXTRA_PIN_ITEM_REQUEST = "android.content.pm.extra.PIN_ITEM_REQUEST";
/*    */   
/*    */   public static abstract class Callback
/*    */   {
/* 22 */     public Callback() { throw new RuntimeException("Stub!"); }
/*    */     public abstract void onPackageRemoved(String paramString, UserHandle paramUserHandle);
/*    */     public abstract void onPackageAdded(String paramString, UserHandle paramUserHandle);
/*    */     public abstract void onPackageChanged(String paramString, UserHandle paramUserHandle);
/*    */     public abstract void onPackagesAvailable(String[] paramArrayOfString, UserHandle paramUserHandle, boolean paramBoolean);
/*    */     public abstract void onPackagesUnavailable(String[] paramArrayOfString, UserHandle paramUserHandle, boolean paramBoolean);
/* 28 */     public void onPackagesSuspended(String[] packageNames, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 29 */     public void onPackagesUnsuspended(String[] packageNames, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 30 */     public void onShortcutsChanged(String packageName, List<ShortcutInfo> shortcuts, UserHandle user) { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static class ShortcutQuery { public static final int FLAG_GET_KEY_FIELDS_ONLY = 4;
/*    */     
/* 34 */     public ShortcutQuery() { throw new RuntimeException("Stub!"); }
/* 35 */     public ShortcutQuery setChangedSince(long changedSince) { throw new RuntimeException("Stub!"); }
/* 36 */     public ShortcutQuery setPackage(String packageName) { throw new RuntimeException("Stub!"); }
/* 37 */     public ShortcutQuery setShortcutIds(List<String> shortcutIds) { throw new RuntimeException("Stub!"); }
/* 38 */     public ShortcutQuery setActivity(ComponentName activity) { throw new RuntimeException("Stub!"); }
/* 39 */     public ShortcutQuery setQueryFlags(int queryFlags) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static final int FLAG_MATCH_DYNAMIC = 1;
/*    */     public static final int FLAG_MATCH_MANIFEST = 8;
/*    */     public static final int FLAG_MATCH_PINNED = 2;
/*    */   }
/*    */   
/*    */   public static final class PinItemRequest implements android.os.Parcelable {
/*    */     PinItemRequest() {
/* 48 */       throw new RuntimeException("Stub!"); }
/* 49 */     public int getRequestType() { throw new RuntimeException("Stub!"); }
/* 50 */     public ShortcutInfo getShortcutInfo() { throw new RuntimeException("Stub!"); }
/* 51 */     public android.appwidget.AppWidgetProviderInfo getAppWidgetProviderInfo(Context context) { throw new RuntimeException("Stub!"); }
/* 52 */     public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 53 */     public boolean isValid() { throw new RuntimeException("Stub!"); }
/* 54 */     public boolean accept(Bundle options) { throw new RuntimeException("Stub!"); }
/* 55 */     public boolean accept() { throw new RuntimeException("Stub!"); }
/* 56 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 57 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/* 61 */     public static final android.os.Parcelable.Creator<PinItemRequest> CREATOR = null;
/*    */     public static final int REQUEST_TYPE_APPWIDGET = 2; public static final int REQUEST_TYPE_SHORTCUT = 1; }
/* 63 */   LauncherApps() { throw new RuntimeException("Stub!"); }
/* 64 */   public List<UserHandle> getProfiles() { throw new RuntimeException("Stub!"); }
/* 65 */   public List<LauncherActivityInfo> getActivityList(String packageName, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 66 */   public LauncherActivityInfo resolveActivity(Intent intent, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 67 */   public void startMainActivity(ComponentName component, UserHandle user, Rect sourceBounds, Bundle opts) { throw new RuntimeException("Stub!"); }
/* 68 */   public void startAppDetailsActivity(ComponentName component, UserHandle user, Rect sourceBounds, Bundle opts) { throw new RuntimeException("Stub!"); }
/* 69 */   public List<LauncherActivityInfo> getShortcutConfigActivityList(String packageName, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 70 */   public android.content.IntentSender getShortcutConfigActivityIntent(LauncherActivityInfo info) { throw new RuntimeException("Stub!"); }
/* 71 */   public boolean isPackageEnabled(String packageName, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 72 */   public ApplicationInfo getApplicationInfo(String packageName, int flags, UserHandle user) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean isActivityEnabled(ComponentName component, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 74 */   public boolean hasShortcutHostPermission() { throw new RuntimeException("Stub!"); }
/* 75 */   public List<ShortcutInfo> getShortcuts(ShortcutQuery query, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 76 */   public void pinShortcuts(String packageName, List<String> shortcutIds, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 77 */   public Drawable getShortcutIconDrawable(ShortcutInfo shortcut, int density) { throw new RuntimeException("Stub!"); }
/* 78 */   public Drawable getShortcutBadgedIconDrawable(ShortcutInfo shortcut, int density) { throw new RuntimeException("Stub!"); }
/* 79 */   public void startShortcut(String packageName, String shortcutId, Rect sourceBounds, Bundle startActivityOptions, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 80 */   public void startShortcut(ShortcutInfo shortcut, Rect sourceBounds, Bundle startActivityOptions) { throw new RuntimeException("Stub!"); }
/* 81 */   public void registerCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 82 */   public void registerCallback(Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 83 */   public void unregisterCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 84 */   public PinItemRequest getPinItemRequest(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\LauncherApps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */