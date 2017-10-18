/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View.OnClickListener;
/*    */ import android.view.inputmethod.CompletionInfo;
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
/*    */ public class AutoCompleteTextView
/*    */   extends EditText
/*    */   implements Filter.FilterListener
/*    */ {
/*    */   public AutoCompleteTextView(Context context)
/*    */   {
/* 31 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 32 */   public AutoCompleteTextView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 33 */   public AutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 34 */   public AutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 35 */   public AutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, Resources.Theme popupTheme) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 36 */   public void setOnClickListener(View.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setCompletionHint(CharSequence hint) { throw new RuntimeException("Stub!"); }
/* 38 */   public CharSequence getCompletionHint() { throw new RuntimeException("Stub!"); }
/* 39 */   public int getDropDownWidth() { throw new RuntimeException("Stub!"); }
/* 40 */   public void setDropDownWidth(int width) { throw new RuntimeException("Stub!"); }
/* 41 */   public int getDropDownHeight() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setDropDownHeight(int height) { throw new RuntimeException("Stub!"); }
/* 43 */   public int getDropDownAnchor() { throw new RuntimeException("Stub!"); }
/* 44 */   public void setDropDownAnchor(int id) { throw new RuntimeException("Stub!"); }
/* 45 */   public Drawable getDropDownBackground() { throw new RuntimeException("Stub!"); }
/* 46 */   public void setDropDownBackgroundDrawable(Drawable d) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setDropDownBackgroundResource(int id) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setDropDownVerticalOffset(int offset) { throw new RuntimeException("Stub!"); }
/* 49 */   public int getDropDownVerticalOffset() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setDropDownHorizontalOffset(int offset) { throw new RuntimeException("Stub!"); }
/* 51 */   public int getDropDownHorizontalOffset() { throw new RuntimeException("Stub!"); }
/* 52 */   public int getThreshold() { throw new RuntimeException("Stub!"); }
/* 53 */   public void setThreshold(int threshold) { throw new RuntimeException("Stub!"); }
/* 54 */   public void setOnItemClickListener(AdapterView.OnItemClickListener l) { throw new RuntimeException("Stub!"); }
/* 55 */   public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener l) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 57 */   public AdapterView.OnItemClickListener getItemClickListener() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 59 */   public AdapterView.OnItemSelectedListener getItemSelectedListener() { throw new RuntimeException("Stub!"); }
/* 60 */   public AdapterView.OnItemClickListener getOnItemClickListener() { throw new RuntimeException("Stub!"); }
/* 61 */   public AdapterView.OnItemSelectedListener getOnItemSelectedListener() { throw new RuntimeException("Stub!"); }
/* 62 */   public void setOnDismissListener(OnDismissListener dismissListener) { throw new RuntimeException("Stub!"); }
/* 63 */   public ListAdapter getAdapter() { throw new RuntimeException("Stub!"); }
/* 64 */   public <T extends ListAdapter,  extends Filterable> void setAdapter(T adapter) { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean onKeyPreIme(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean enoughToFilter() { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean isPopupShowing() { throw new RuntimeException("Stub!"); }
/* 70 */   protected CharSequence convertSelectionToString(Object selectedItem) { throw new RuntimeException("Stub!"); }
/* 71 */   public void clearListSelection() { throw new RuntimeException("Stub!"); }
/* 72 */   public void setListSelection(int position) { throw new RuntimeException("Stub!"); }
/* 73 */   public int getListSelection() { throw new RuntimeException("Stub!"); }
/*    */   
/* 75 */   protected void performFiltering(CharSequence text, int keyCode) { throw new RuntimeException("Stub!"); }
/* 76 */   public void performCompletion() { throw new RuntimeException("Stub!"); }
/* 77 */   public void onCommitCompletion(CompletionInfo completion) { throw new RuntimeException("Stub!"); }
/* 78 */   public boolean isPerformingCompletion() { throw new RuntimeException("Stub!"); }
/* 79 */   public void setText(CharSequence text, boolean filter) { throw new RuntimeException("Stub!"); }
/* 80 */   protected void replaceText(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 81 */   public void onFilterComplete(int count) { throw new RuntimeException("Stub!"); }
/* 82 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
/* 83 */   protected void onDisplayHint(int hint) { throw new RuntimeException("Stub!"); }
/* 84 */   protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 85 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 86 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 87 */   public void dismissDropDown() { throw new RuntimeException("Stub!"); }
/* 88 */   protected boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 89 */   public void showDropDown() { throw new RuntimeException("Stub!"); }
/* 90 */   public void setValidator(Validator validator) { throw new RuntimeException("Stub!"); }
/* 91 */   public Validator getValidator() { throw new RuntimeException("Stub!"); }
/* 92 */   public void performValidation() { throw new RuntimeException("Stub!"); }
/* 93 */   protected Filter getFilter() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnDismissListener
/*    */   {
/*    */     public abstract void onDismiss();
/*    */   }
/*    */   
/*    */   public static abstract interface Validator
/*    */   {
/*    */     public abstract boolean isValid(CharSequence paramCharSequence);
/*    */     
/*    */     public abstract CharSequence fixText(CharSequence paramCharSequence);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\AutoCompleteTextView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */