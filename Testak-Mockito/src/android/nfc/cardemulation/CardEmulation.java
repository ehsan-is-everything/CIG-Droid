/*    */ package android.nfc.cardemulation;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.content.ComponentName;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class CardEmulation
/*    */ {
/*    */   public static final String ACTION_CHANGE_DEFAULT = "android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT";
/*    */   public static final String CATEGORY_OTHER = "other";
/*    */   public static final String CATEGORY_PAYMENT = "payment";
/*    */   public static final String EXTRA_CATEGORY = "category";
/*    */   public static final String EXTRA_SERVICE_COMPONENT = "component";
/*    */   public static final int SELECTION_MODE_ALWAYS_ASK = 1;
/*    */   public static final int SELECTION_MODE_ASK_IF_CONFLICT = 2;
/*    */   public static final int SELECTION_MODE_PREFER_DEFAULT = 0;
/*    */   
/* 20 */   CardEmulation() { throw new RuntimeException("Stub!"); }
/* 21 */   public static synchronized CardEmulation getInstance(android.nfc.NfcAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean isDefaultServiceForCategory(ComponentName service, String category) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isDefaultServiceForAid(ComponentName service, String aid) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean categoryAllowsForegroundPreference(String category) { throw new RuntimeException("Stub!"); }
/* 25 */   public int getSelectionModeForCategory(String category) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean registerAidsForService(ComponentName service, String category, List<String> aids) { throw new RuntimeException("Stub!"); }
/* 27 */   public List<String> getAidsForService(ComponentName service, String category) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean removeAidsForService(ComponentName service, String category) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean setPreferredService(Activity activity, ComponentName service) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean unsetPreferredService(Activity activity) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean supportsAidPrefixRegistration() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\nfc\cardemulation\CardEmulation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */