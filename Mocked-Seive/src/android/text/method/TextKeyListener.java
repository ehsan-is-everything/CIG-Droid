/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.text.SpanWatcher;
/*    */ import android.text.Spannable;
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
/*    */ 
/*    */ public class TextKeyListener
/*    */   extends BaseKeyListener
/*    */   implements SpanWatcher
/*    */ {
/*    */   public static enum Capitalize
/*    */   {
/* 24 */     CHARACTERS, 
/* 25 */     NONE, 
/* 26 */     SENTENCES, 
/* 27 */     WORDS;
/*    */     private Capitalize() {} }
/* 29 */   public TextKeyListener(Capitalize cap, boolean autotext) { throw new RuntimeException("Stub!"); }
/* 30 */   public static TextKeyListener getInstance(boolean autotext, Capitalize cap) { throw new RuntimeException("Stub!"); }
/* 31 */   public static TextKeyListener getInstance() { throw new RuntimeException("Stub!"); }
/* 32 */   public static boolean shouldCap(Capitalize cap, CharSequence cs, int off) { throw new RuntimeException("Stub!"); }
/* 33 */   public int getInputType() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean onKeyUp(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean onKeyOther(View view, Editable content, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 37 */   public static void clear(Editable e) { throw new RuntimeException("Stub!"); }
/* 38 */   public void onSpanAdded(Spannable s, Object what, int start, int end) { throw new RuntimeException("Stub!"); }
/* 39 */   public void onSpanRemoved(Spannable s, Object what, int start, int end) { throw new RuntimeException("Stub!"); }
/* 40 */   public void onSpanChanged(Spannable s, Object what, int start, int end, int st, int en) { throw new RuntimeException("Stub!"); }
/* 41 */   public void release() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\method\TextKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */