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
/*    */ public class LinkMovementMethod
/*    */   extends ScrollingMovementMethod
/*    */ {
/* 21 */   public LinkMovementMethod() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean canSelectArbitrarily() { throw new RuntimeException("Stub!"); }
/* 23 */   protected boolean handleMovementKey(TextView widget, Spannable buffer, int keyCode, int movementMetaState, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 24 */   protected boolean up(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 25 */   protected boolean down(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 26 */   protected boolean left(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 27 */   protected boolean right(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 29 */   public void initialize(TextView widget, Spannable text) { throw new RuntimeException("Stub!"); }
/* 30 */   public void onTakeFocus(TextView view, Spannable text, int dir) { throw new RuntimeException("Stub!"); }
/* 31 */   public static MovementMethod getInstance() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\method\LinkMovementMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */