/*    */ package android.text.method;
/*    */ 
/*    */ import android.graphics.Rect;
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
/*    */ public abstract class ReplacementTransformationMethod
/*    */   implements TransformationMethod
/*    */ {
/* 21 */   public ReplacementTransformationMethod() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract char[] getOriginal();
/*    */   protected abstract char[] getReplacement();
/* 24 */   public CharSequence getTransformation(CharSequence source, View v) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onFocusChanged(View view, CharSequence sourceText, boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\method\ReplacementTransformationMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */