/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.text.Spannable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class MetaKeyKeyListener
/*    */ {
/*    */   public static final int META_ALT_LOCKED = 512;
/*    */   public static final int META_ALT_ON = 2;
/*    */   public static final int META_CAP_LOCKED = 256;
/*    */   public static final int META_SHIFT_ON = 1;
/*    */   public static final int META_SYM_LOCKED = 1024;
/*    */   public static final int META_SYM_ON = 4;
/*    */   
/* 20 */   public MetaKeyKeyListener() { throw new RuntimeException("Stub!"); }
/* 21 */   public static void resetMetaState(Spannable text) { throw new RuntimeException("Stub!"); }
/* 22 */   public static final int getMetaState(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 23 */   public static final int getMetaState(CharSequence text, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 24 */   public static final int getMetaState(CharSequence text, int meta) { throw new RuntimeException("Stub!"); }
/* 25 */   public static final int getMetaState(CharSequence text, int meta, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 26 */   public static void adjustMetaAfterKeypress(Spannable content) { throw new RuntimeException("Stub!"); }
/* 27 */   public static boolean isMetaTracker(CharSequence text, Object what) { throw new RuntimeException("Stub!"); }
/* 28 */   public static boolean isSelectingMetaTracker(CharSequence text, Object what) { throw new RuntimeException("Stub!"); }
/* 29 */   protected static void resetLockedMeta(Spannable content) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean onKeyUp(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 32 */   public void clearMetaKeyState(View view, Editable content, int states) { throw new RuntimeException("Stub!"); }
/* 33 */   public static void clearMetaKeyState(Editable content, int states) { throw new RuntimeException("Stub!"); }
/* 34 */   public static long resetLockedMeta(long state) { throw new RuntimeException("Stub!"); }
/* 35 */   public static final int getMetaState(long state) { throw new RuntimeException("Stub!"); }
/* 36 */   public static final int getMetaState(long state, int meta) { throw new RuntimeException("Stub!"); }
/* 37 */   public static long adjustMetaAfterKeypress(long state) { throw new RuntimeException("Stub!"); }
/* 38 */   public static long handleKeyDown(long state, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 39 */   public static long handleKeyUp(long state, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 40 */   public long clearMetaKeyState(long state, int which) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\method\MetaKeyKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */