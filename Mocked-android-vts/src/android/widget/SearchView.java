/*    */ package android.widget;
/*    */ 
/*    */ import android.app.SearchableInfo;
/*    */ import android.content.Context;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.CollapsibleActionView;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View.OnClickListener;
/*    */ import android.view.View.OnFocusChangeListener;
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
/*    */ 
/*    */ public class SearchView
/*    */   extends LinearLayout
/*    */   implements CollapsibleActionView
/*    */ {
/*    */   public SearchView(Context context)
/*    */   {
/* 36 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 37 */   public SearchView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 38 */   public SearchView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 39 */   public SearchView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 40 */   public void setSearchableInfo(SearchableInfo searchable) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setImeOptions(int imeOptions) { throw new RuntimeException("Stub!"); }
/* 42 */   public int getImeOptions() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setInputType(int inputType) { throw new RuntimeException("Stub!"); }
/* 44 */   public int getInputType() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setOnQueryTextListener(OnQueryTextListener listener) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setOnCloseListener(OnCloseListener listener) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setOnSuggestionListener(OnSuggestionListener listener) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setOnSearchClickListener(View.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 50 */   public CharSequence getQuery() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setQuery(CharSequence query, boolean submit) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setQueryHint(CharSequence hint) { throw new RuntimeException("Stub!"); }
/* 53 */   public CharSequence getQueryHint() { throw new RuntimeException("Stub!"); }
/* 54 */   public void setIconifiedByDefault(boolean iconified) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean isIconfiedByDefault() { throw new RuntimeException("Stub!"); }
/* 56 */   public void setIconified(boolean iconify) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean isIconified() { throw new RuntimeException("Stub!"); }
/* 58 */   public void setSubmitButtonEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean isSubmitButtonEnabled() { throw new RuntimeException("Stub!"); }
/* 60 */   public void setQueryRefinementEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean isQueryRefinementEnabled() { throw new RuntimeException("Stub!"); }
/* 62 */   public void setSuggestionsAdapter(CursorAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 63 */   public CursorAdapter getSuggestionsAdapter() { throw new RuntimeException("Stub!"); }
/* 64 */   public void setMaxWidth(int maxpixels) { throw new RuntimeException("Stub!"); }
/* 65 */   public int getMaxWidth() { throw new RuntimeException("Stub!"); }
/* 66 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 67 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 68 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 70 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
/* 71 */   public void onActionViewCollapsed() { throw new RuntimeException("Stub!"); }
/* 72 */   public void onActionViewExpanded() { throw new RuntimeException("Stub!"); }
/* 73 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 74 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 75 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnSuggestionListener
/*    */   {
/*    */     public abstract boolean onSuggestionSelect(int paramInt);
/*    */     
/*    */     public abstract boolean onSuggestionClick(int paramInt);
/*    */   }
/*    */   
/*    */   public static abstract interface OnCloseListener
/*    */   {
/*    */     public abstract boolean onClose();
/*    */   }
/*    */   
/*    */   public static abstract interface OnQueryTextListener
/*    */   {
/*    */     public abstract boolean onQueryTextSubmit(String paramString);
/*    */     
/*    */     public abstract boolean onQueryTextChange(String paramString);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\SearchView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */