/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ListPopupWindow
/*    */ {
/*    */   public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
/*    */   public static final int INPUT_METHOD_NEEDED = 1;
/*    */   public static final int INPUT_METHOD_NOT_NEEDED = 2;
/*    */   public static final int MATCH_PARENT = -1;
/*    */   public static final int POSITION_PROMPT_ABOVE = 0;
/*    */   public static final int POSITION_PROMPT_BELOW = 1;
/*    */   public static final int WRAP_CONTENT = -2;
/*    */   
/* 20 */   public ListPopupWindow(Context context) { throw new RuntimeException("Stub!"); }
/* 21 */   public ListPopupWindow(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 22 */   public ListPopupWindow(Context context, AttributeSet attrs, int defStyleAttr) { throw new RuntimeException("Stub!"); }
/* 23 */   public ListPopupWindow(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); }
/* 24 */   public void setAdapter(ListAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 25 */   public void setPromptPosition(int position) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getPromptPosition() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setModal(boolean modal) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean isModal() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setSoftInputMode(int mode) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getSoftInputMode() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setListSelector(android.graphics.drawable.Drawable selector) { throw new RuntimeException("Stub!"); }
/* 32 */   public android.graphics.drawable.Drawable getBackground() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setBackgroundDrawable(android.graphics.drawable.Drawable d) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setAnimationStyle(int animationStyle) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getAnimationStyle() { throw new RuntimeException("Stub!"); }
/* 36 */   public View getAnchorView() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setAnchorView(View anchor) { throw new RuntimeException("Stub!"); }
/* 38 */   public int getHorizontalOffset() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setHorizontalOffset(int offset) { throw new RuntimeException("Stub!"); }
/* 40 */   public int getVerticalOffset() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setVerticalOffset(int offset) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setDropDownGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 43 */   public int getWidth() { throw new RuntimeException("Stub!"); }
/* 44 */   public void setWidth(int width) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setContentWidth(int width) { throw new RuntimeException("Stub!"); }
/* 46 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/* 47 */   public void setHeight(int height) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setWindowLayoutType(int layoutType) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setOnItemClickListener(AdapterView.OnItemClickListener clickListener) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener selectedListener) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setPromptView(View prompt) { throw new RuntimeException("Stub!"); }
/* 52 */   public void postShow() { throw new RuntimeException("Stub!"); }
/* 53 */   public void show() { throw new RuntimeException("Stub!"); }
/* 54 */   public void dismiss() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setOnDismissListener(PopupWindow.OnDismissListener listener) { throw new RuntimeException("Stub!"); }
/* 56 */   public void setInputMethodMode(int mode) { throw new RuntimeException("Stub!"); }
/* 57 */   public int getInputMethodMode() { throw new RuntimeException("Stub!"); }
/* 58 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); }
/* 59 */   public void clearListSelection() { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean isShowing() { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean isInputMethodNotNeeded() { throw new RuntimeException("Stub!"); }
/* 62 */   public boolean performItemClick(int position) { throw new RuntimeException("Stub!"); }
/* 63 */   public Object getSelectedItem() { throw new RuntimeException("Stub!"); }
/* 64 */   public int getSelectedItemPosition() { throw new RuntimeException("Stub!"); }
/* 65 */   public long getSelectedItemId() { throw new RuntimeException("Stub!"); }
/* 66 */   public View getSelectedView() { throw new RuntimeException("Stub!"); }
/* 67 */   public ListView getListView() { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean onKeyPreIme(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 71 */   public android.view.View.OnTouchListener createDragToOpenListener(View src) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\ListPopupWindow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */