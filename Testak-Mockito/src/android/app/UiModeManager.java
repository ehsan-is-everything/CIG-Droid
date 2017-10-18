/*    */ package android.app;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UiModeManager
/*    */ {
/*    */   public static String ACTION_ENTER_CAR_MODE;
/*    */   
/*    */ 
/*    */   public static String ACTION_ENTER_DESK_MODE;
/*    */   public static String ACTION_EXIT_CAR_MODE;
/*    */   public static String ACTION_EXIT_DESK_MODE;
/*    */   public static final int DISABLE_CAR_MODE_GO_HOME = 1;
/*    */   public static final int ENABLE_CAR_MODE_ALLOW_SLEEP = 2;
/*    */   public static final int ENABLE_CAR_MODE_GO_CAR_HOME = 1;
/*    */   public static final int MODE_NIGHT_AUTO = 0;
/*    */   public static final int MODE_NIGHT_NO = 1;
/*    */   public static final int MODE_NIGHT_YES = 2;
/*    */   
/* 20 */   UiModeManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public void enableCarMode(int flags) { throw new RuntimeException("Stub!"); }
/* 22 */   public void disableCarMode(int flags) { throw new RuntimeException("Stub!"); }
/* 23 */   public int getCurrentModeType() { throw new RuntimeException("Stub!"); }
/* 24 */   public void setNightMode(int mode) { throw new RuntimeException("Stub!"); }
/* 25 */   public int getNightMode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\UiModeManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */