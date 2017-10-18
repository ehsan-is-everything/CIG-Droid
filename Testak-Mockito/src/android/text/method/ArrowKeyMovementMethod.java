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
/*    */ public class ArrowKeyMovementMethod
/*    */   extends BaseMovementMethod
/*    */   implements MovementMethod
/*    */ {
/* 22 */   public ArrowKeyMovementMethod() { throw new RuntimeException("Stub!"); }
/* 23 */   protected boolean handleMovementKey(TextView widget, Spannable buffer, int keyCode, int movementMetaState, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 24 */   protected boolean left(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 25 */   protected boolean right(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 26 */   protected boolean up(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 27 */   protected boolean down(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 28 */   protected boolean pageUp(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 29 */   protected boolean pageDown(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 30 */   protected boolean top(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 31 */   protected boolean bottom(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 32 */   protected boolean lineStart(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 33 */   protected boolean lineEnd(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 34 */   protected boolean home(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 35 */   protected boolean end(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean canSelectArbitrarily() { throw new RuntimeException("Stub!"); }
/* 38 */   public void initialize(TextView widget, Spannable text) { throw new RuntimeException("Stub!"); }
/* 39 */   public void onTakeFocus(TextView view, Spannable text, int dir) { throw new RuntimeException("Stub!"); }
/* 40 */   public static MovementMethod getInstance() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\method\ArrowKeyMovementMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */