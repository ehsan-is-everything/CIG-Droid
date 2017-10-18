/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
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
/*    */ 
/*    */ 
/*    */ public abstract class BaseKeyListener
/*    */   extends MetaKeyKeyListener
/*    */   implements KeyListener
/*    */ {
/* 22 */   public BaseKeyListener() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean backspace(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean forwardDelete(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean onKeyOther(View view, Editable content, KeyEvent event) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\method\BaseKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */