/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.util.AttributeSet;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MultiAutoCompleteTextView
/*    */   extends AutoCompleteTextView
/*    */ {
/*    */   public static class CommaTokenizer
/*    */     implements MultiAutoCompleteTextView.Tokenizer
/*    */   {
/* 30 */     public CommaTokenizer() { throw new RuntimeException("Stub!"); }
/* 31 */     public int findTokenStart(CharSequence text, int cursor) { throw new RuntimeException("Stub!"); }
/* 32 */     public int findTokenEnd(CharSequence text, int cursor) { throw new RuntimeException("Stub!"); }
/* 33 */     public CharSequence terminateToken(CharSequence text) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 35 */   public MultiAutoCompleteTextView(Context context) { super((Context)null, (AttributeSet)null, 0, 0, (Resources.Theme)null);throw new RuntimeException("Stub!"); }
/* 36 */   public MultiAutoCompleteTextView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0, (Resources.Theme)null);throw new RuntimeException("Stub!"); }
/* 37 */   public MultiAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0, (Resources.Theme)null);throw new RuntimeException("Stub!"); }
/* 38 */   public MultiAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0, (Resources.Theme)null);throw new RuntimeException("Stub!"); }
/* 39 */   public void setTokenizer(Tokenizer t) { throw new RuntimeException("Stub!"); }
/* 40 */   protected void performFiltering(CharSequence text, int keyCode) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean enoughToFilter() { throw new RuntimeException("Stub!"); }
/* 42 */   public void performValidation() { throw new RuntimeException("Stub!"); }
/* 43 */   protected void performFiltering(CharSequence text, int start, int end, int keyCode) { throw new RuntimeException("Stub!"); }
/* 44 */   protected void replaceText(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 45 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface Tokenizer
/*    */   {
/*    */     public abstract int findTokenStart(CharSequence paramCharSequence, int paramInt);
/*    */     
/*    */     public abstract int findTokenEnd(CharSequence paramCharSequence, int paramInt);
/*    */     
/*    */     public abstract CharSequence terminateToken(CharSequence paramCharSequence);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\MultiAutoCompleteTextView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */