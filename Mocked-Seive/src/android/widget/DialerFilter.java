/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Rect;
/*    */ import android.text.TextWatcher;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class DialerFilter
/*    */   extends RelativeLayout
/*    */ {
/*    */   public static final int DIGITS_AND_LETTERS = 1;
/*    */   public static final int DIGITS_AND_LETTERS_NO_DIGITS = 2;
/*    */   public static final int DIGITS_AND_LETTERS_NO_LETTERS = 3;
/*    */   public static final int DIGITS_ONLY = 4;
/*    */   public static final int LETTERS_ONLY = 5;
/*    */   
/*    */   public DialerFilter(Context context)
/*    */   {
/* 22 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public DialerFilter(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   protected void onFinishInflate() { throw new RuntimeException("Stub!"); }
/* 25 */   protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isQwertyKeyboard() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getMode() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setMode(int newMode) { throw new RuntimeException("Stub!"); }
/* 31 */   public CharSequence getLetters() { throw new RuntimeException("Stub!"); }
/* 32 */   public CharSequence getDigits() { throw new RuntimeException("Stub!"); }
/* 33 */   public CharSequence getFilterText() { throw new RuntimeException("Stub!"); }
/* 34 */   public void append(String text) { throw new RuntimeException("Stub!"); }
/* 35 */   public void clearText() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setLettersWatcher(TextWatcher watcher) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setDigitsWatcher(TextWatcher watcher) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setFilterWatcher(TextWatcher watcher) { throw new RuntimeException("Stub!"); }
/* 39 */   public void removeFilterWatcher(TextWatcher watcher) { throw new RuntimeException("Stub!"); }
/* 40 */   protected void onModeChange(int oldMode, int newMode) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\DialerFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */