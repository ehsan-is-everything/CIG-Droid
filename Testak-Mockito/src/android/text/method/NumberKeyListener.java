/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.text.InputFilter;
/*    */ import android.text.Spannable;
/*    */ import android.text.Spanned;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class NumberKeyListener
/*    */   extends BaseKeyListener
/*    */   implements InputFilter
/*    */ {
/* 22 */   public NumberKeyListener() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract char[] getAcceptedChars();
/* 24 */   protected int lookup(KeyEvent event, Spannable content) { throw new RuntimeException("Stub!"); }
/* 25 */   public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
/* 26 */   protected static boolean ok(char[] accept, char c) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\method\NumberKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */