/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Spannable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.widget.TextView;
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
/*    */ public class BaseMovementMethod
/*    */   implements MovementMethod
/*    */ {
/* 21 */   public BaseMovementMethod() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean canSelectArbitrarily() { throw new RuntimeException("Stub!"); }
/* 23 */   public void initialize(TextView widget, Spannable text) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean onKeyDown(TextView widget, Spannable text, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean onKeyOther(TextView widget, Spannable text, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean onKeyUp(TextView widget, Spannable text, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onTakeFocus(TextView widget, Spannable text, int direction) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean onTouchEvent(TextView widget, Spannable text, MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean onTrackballEvent(TextView widget, Spannable text, MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean onGenericMotionEvent(TextView widget, Spannable text, MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 31 */   protected int getMovementMetaState(Spannable buffer, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 32 */   protected boolean handleMovementKey(TextView widget, Spannable buffer, int keyCode, int movementMetaState, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 33 */   protected boolean left(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 34 */   protected boolean right(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 35 */   protected boolean up(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 36 */   protected boolean down(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 37 */   protected boolean pageUp(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 38 */   protected boolean pageDown(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 39 */   protected boolean top(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 40 */   protected boolean bottom(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 41 */   protected boolean lineStart(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 42 */   protected boolean lineEnd(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 43 */   protected boolean home(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 44 */   protected boolean end(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\method\BaseMovementMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */