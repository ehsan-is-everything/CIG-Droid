/*    */ package android.text.style;
/*    */ 
/*    */ import android.text.TextPaint;
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
/*    */ 
/*    */ public abstract class CharacterStyle
/*    */ {
/* 20 */   public CharacterStyle() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void updateDrawState(TextPaint paramTextPaint);
/* 22 */   public static CharacterStyle wrap(CharacterStyle cs) { throw new RuntimeException("Stub!"); }
/* 23 */   public CharacterStyle getUnderlying() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\style\CharacterStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */