/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.content.IntentSender;
/*    */ import java.util.List;
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
/*    */ public class ShortcutManager
/*    */ {
/* 19 */   ShortcutManager() { throw new RuntimeException("Stub!"); }
/* 20 */   public boolean setDynamicShortcuts(List<ShortcutInfo> shortcutInfoList) { throw new RuntimeException("Stub!"); }
/* 21 */   public List<ShortcutInfo> getDynamicShortcuts() { throw new RuntimeException("Stub!"); }
/* 22 */   public List<ShortcutInfo> getManifestShortcuts() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean addDynamicShortcuts(List<ShortcutInfo> shortcutInfoList) { throw new RuntimeException("Stub!"); }
/* 24 */   public void removeDynamicShortcuts(List<String> shortcutIds) { throw new RuntimeException("Stub!"); }
/* 25 */   public void removeAllDynamicShortcuts() { throw new RuntimeException("Stub!"); }
/* 26 */   public List<ShortcutInfo> getPinnedShortcuts() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean updateShortcuts(List<ShortcutInfo> shortcutInfoList) { throw new RuntimeException("Stub!"); }
/* 28 */   public void disableShortcuts(List<String> shortcutIds) { throw new RuntimeException("Stub!"); }
/* 29 */   public void disableShortcuts(List<String> shortcutIds, CharSequence disabledMessage) { throw new RuntimeException("Stub!"); }
/* 30 */   public void enableShortcuts(List<String> shortcutIds) { throw new RuntimeException("Stub!"); }
/* 31 */   public int getMaxShortcutCountPerActivity() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isRateLimitingActive() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getIconMaxWidth() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getIconMaxHeight() { throw new RuntimeException("Stub!"); }
/* 35 */   public void reportShortcutUsed(String shortcutId) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isRequestPinShortcutSupported() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean requestPinShortcut(ShortcutInfo shortcut, IntentSender resultIntent) { throw new RuntimeException("Stub!"); }
/* 38 */   public Intent createShortcutResultIntent(ShortcutInfo shortcut) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\pm\ShortcutManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */