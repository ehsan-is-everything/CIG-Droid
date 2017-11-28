/*    */ package android.text.style;
/*    */ 
/*    */ import android.text.TextPaint;
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
/*    */ 
/*    */ public abstract class ClickableSpan
/*    */   extends CharacterStyle
/*    */   implements UpdateAppearance
/*    */ {
/* 22 */   public ClickableSpan() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onClick(View paramView);
/* 24 */   public void updateDrawState(TextPaint ds) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\style\ClickableSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */