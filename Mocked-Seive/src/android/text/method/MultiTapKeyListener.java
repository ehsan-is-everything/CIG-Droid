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
/*    */ public class MultiTapKeyListener
/*    */   extends BaseKeyListener
/*    */   implements SpanWatcher
/*    */ {
/* 22 */   public MultiTapKeyListener(TextKeyListener.Capitalize cap, boolean autotext) { throw new RuntimeException("Stub!"); }
/* 23 */   public static MultiTapKeyListener getInstance(boolean autotext, TextKeyListener.Capitalize cap) { throw new RuntimeException("Stub!"); }
/* 24 */   public int getInputType() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onSpanChanged(Spannable buf, Object what, int s, int e, int start, int stop) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onSpanAdded(Spannable s, Object what, int start, int end) { throw new RuntimeException("Stub!"); }
/* 28 */   public void onSpanRemoved(Spannable s, Object what, int start, int end) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\method\MultiTapKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */