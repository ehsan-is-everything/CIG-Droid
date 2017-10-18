/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Parcelable;
/*     */ import android.text.Editable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ActionMode;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.view.ViewDebug.ExportedProperty;
/*     */ import android.view.ViewGroup.LayoutParams;
/*     */ import android.view.accessibility.AccessibilityNodeInfo;
/*     */ import android.view.inputmethod.EditorInfo;
/*     */ import android.view.inputmethod.InputConnection;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public abstract class AbsListView extends AdapterView<ListAdapter> implements android.text.TextWatcher, android.view.ViewTreeObserver.OnGlobalLayoutListener, Filter.FilterListener, android.view.ViewTreeObserver.OnTouchModeChangeListener
/*     */ {
/*     */   public static final int CHOICE_MODE_MULTIPLE = 2;
/*     */   public static final int CHOICE_MODE_MULTIPLE_MODAL = 3;
/*     */   public static final int CHOICE_MODE_NONE = 0;
/*     */   public static final int CHOICE_MODE_SINGLE = 1;
/*     */   public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = 2;
/*     */   public static final int TRANSCRIPT_MODE_DISABLED = 0;
/*     */   public static final int TRANSCRIPT_MODE_NORMAL = 1;
/*     */   
/*     */   public static abstract interface RecyclerListener
/*     */   {
/*     */     public abstract void onMovedToScrapHeap(View paramView);
/*     */   }
/*     */   
/*     */   public static class LayoutParams extends ViewGroup.LayoutParams
/*     */   {
/*     */     public LayoutParams(Context c, AttributeSet attrs)
/*     */     {
/*  42 */       super();throw new RuntimeException("Stub!"); }
/*  43 */     public LayoutParams(int w, int h) { super();throw new RuntimeException("Stub!"); }
/*  44 */     public LayoutParams(int w, int h, int viewType) { super();throw new RuntimeException("Stub!"); }
/*  45 */     public LayoutParams(ViewGroup.LayoutParams source) { super();throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public AbsListView(Context context)
/*     */   {
/*  51 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  52 */   public AbsListView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  53 */   public AbsListView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  54 */   public AbsListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  55 */   public void setOverScrollMode(int mode) { throw new RuntimeException("Stub!"); }
/*  56 */   public void setAdapter(ListAdapter adapter) { throw new RuntimeException("Stub!"); }
/*  57 */   public int getCheckedItemCount() { throw new RuntimeException("Stub!"); }
/*  58 */   public boolean isItemChecked(int position) { throw new RuntimeException("Stub!"); }
/*  59 */   public int getCheckedItemPosition() { throw new RuntimeException("Stub!"); }
/*  60 */   public android.util.SparseBooleanArray getCheckedItemPositions() { throw new RuntimeException("Stub!"); }
/*  61 */   public long[] getCheckedItemIds() { throw new RuntimeException("Stub!"); }
/*  62 */   public void clearChoices() { throw new RuntimeException("Stub!"); }
/*  63 */   public void setItemChecked(int position, boolean value) { throw new RuntimeException("Stub!"); }
/*  64 */   public boolean performItemClick(View view, int position, long id) { throw new RuntimeException("Stub!"); }
/*  65 */   public int getChoiceMode() { throw new RuntimeException("Stub!"); }
/*  66 */   public void setChoiceMode(int choiceMode) { throw new RuntimeException("Stub!"); }
/*  67 */   public void setMultiChoiceModeListener(MultiChoiceModeListener listener) { throw new RuntimeException("Stub!"); }
/*  68 */   public void setFastScrollEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*  69 */   public void setFastScrollStyle(int styleResId) { throw new RuntimeException("Stub!"); }
/*  70 */   public void setFastScrollAlwaysVisible(boolean alwaysShow) { throw new RuntimeException("Stub!"); }
/*  71 */   public boolean isFastScrollAlwaysVisible() { throw new RuntimeException("Stub!"); }
/*  72 */   public int getVerticalScrollbarWidth() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/*  74 */   public boolean isFastScrollEnabled() { throw new RuntimeException("Stub!"); }
/*  75 */   public void setVerticalScrollbarPosition(int position) { throw new RuntimeException("Stub!"); }
/*  76 */   public void setScrollBarStyle(int style) { throw new RuntimeException("Stub!"); }
/*  77 */   public void setSmoothScrollbarEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/*  79 */   public boolean isSmoothScrollbarEnabled() { throw new RuntimeException("Stub!"); }
/*  80 */   public void setOnScrollListener(OnScrollListener l) { throw new RuntimeException("Stub!"); }
/*  81 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/*  83 */   public boolean isScrollingCacheEnabled() { throw new RuntimeException("Stub!"); }
/*  84 */   public void setScrollingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*  85 */   public void setTextFilterEnabled(boolean textFilterEnabled) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/*  87 */   public boolean isTextFilterEnabled() { throw new RuntimeException("Stub!"); }
/*  88 */   public void getFocusedRect(Rect r) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/*  90 */   public boolean isStackFromBottom() { throw new RuntimeException("Stub!"); }
/*  91 */   public void setStackFromBottom(boolean stackFromBottom) { throw new RuntimeException("Stub!"); }
/*  92 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/*  93 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/*  94 */   public void setFilterText(String filterText) { throw new RuntimeException("Stub!"); }
/*  95 */   public CharSequence getTextFilter() { throw new RuntimeException("Stub!"); }
/*  96 */   protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/*  97 */   public void requestLayout() { throw new RuntimeException("Stub!"); }
/*  98 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
/*  99 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); }
/* 100 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
/* 101 */   protected float getTopFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 102 */   protected float getBottomFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 103 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 104 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 105 */   protected void layoutChildren() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 107 */   public View getSelectedView() { throw new RuntimeException("Stub!"); }
/* 108 */   public int getListPaddingTop() { throw new RuntimeException("Stub!"); }
/* 109 */   public int getListPaddingBottom() { throw new RuntimeException("Stub!"); }
/* 110 */   public int getListPaddingLeft() { throw new RuntimeException("Stub!"); }
/* 111 */   public int getListPaddingRight() { throw new RuntimeException("Stub!"); }
/* 112 */   public void onInitializeAccessibilityNodeInfoForItem(View view, int position, AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/* 113 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 114 */   protected boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); }
/* 115 */   protected int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 116 */   protected int getTopPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 117 */   protected int getRightPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 118 */   protected int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 119 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
/* 120 */   public void setDrawSelectorOnTop(boolean onTop) { throw new RuntimeException("Stub!"); }
/* 121 */   public void setSelector(int resID) { throw new RuntimeException("Stub!"); }
/* 122 */   public void setSelector(Drawable sel) { throw new RuntimeException("Stub!"); }
/* 123 */   public Drawable getSelector() { throw new RuntimeException("Stub!"); }
/* 124 */   public void setScrollIndicators(View up, View down) { throw new RuntimeException("Stub!"); }
/* 125 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); }
/* 126 */   public boolean verifyDrawable(Drawable dr) { throw new RuntimeException("Stub!"); }
/* 127 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
/* 128 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 129 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 130 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
/* 131 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 132 */   public void onCancelPendingInputEvents() { throw new RuntimeException("Stub!"); }
/* 133 */   protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() { throw new RuntimeException("Stub!"); }
/* 134 */   public boolean showContextMenu() { throw new RuntimeException("Stub!"); }
/* 135 */   public boolean showContextMenu(float x, float y) { throw new RuntimeException("Stub!"); }
/* 136 */   public boolean showContextMenuForChild(View originalView) { throw new RuntimeException("Stub!"); }
/* 137 */   public boolean showContextMenuForChild(View originalView, float x, float y) { throw new RuntimeException("Stub!"); }
/* 138 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 139 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 140 */   protected void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); }
/* 141 */   public void dispatchDrawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
/* 142 */   public int pointToPosition(int x, int y) { throw new RuntimeException("Stub!"); }
/* 143 */   public long pointToRowId(int x, int y) { throw new RuntimeException("Stub!"); }
/* 144 */   public void onTouchModeChanged(boolean isInTouchMode) { throw new RuntimeException("Stub!"); }
/* 145 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 146 */   protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); }
/* 147 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 148 */   public void fling(int velocityY) { throw new RuntimeException("Stub!"); }
/* 149 */   public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) { throw new RuntimeException("Stub!"); }
/* 150 */   public void onNestedScrollAccepted(View child, View target, int axes) { throw new RuntimeException("Stub!"); }
/* 151 */   public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) { throw new RuntimeException("Stub!"); }
/* 152 */   public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) { throw new RuntimeException("Stub!"); }
/* 153 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 154 */   public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) { throw new RuntimeException("Stub!"); }
/* 155 */   public boolean onInterceptHoverEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 156 */   public android.view.PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) { throw new RuntimeException("Stub!"); }
/* 157 */   public boolean onInterceptTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 158 */   public void addTouchables(ArrayList<View> views) { throw new RuntimeException("Stub!"); }
/* 159 */   public void setFriction(float friction) { throw new RuntimeException("Stub!"); }
/* 160 */   public void setVelocityScale(float scale) { throw new RuntimeException("Stub!"); }
/* 161 */   public void smoothScrollToPosition(int position) { throw new RuntimeException("Stub!"); }
/* 162 */   public void smoothScrollToPositionFromTop(int position, int offset, int duration) { throw new RuntimeException("Stub!"); }
/* 163 */   public void smoothScrollToPositionFromTop(int position, int offset) { throw new RuntimeException("Stub!"); }
/* 164 */   public void smoothScrollToPosition(int position, int boundPosition) { throw new RuntimeException("Stub!"); }
/* 165 */   public void smoothScrollBy(int distance, int duration) { throw new RuntimeException("Stub!"); }
/* 166 */   public void scrollListBy(int y) { throw new RuntimeException("Stub!"); }
/* 167 */   public boolean canScrollList(int direction) { throw new RuntimeException("Stub!"); }
/* 168 */   public void invalidateViews() { throw new RuntimeException("Stub!"); }
/* 169 */   protected void handleDataChanged() { throw new RuntimeException("Stub!"); }
/* 170 */   protected void onDisplayHint(int hint) { throw new RuntimeException("Stub!"); }
/* 171 */   protected boolean isInFilterMode() { throw new RuntimeException("Stub!"); }
/* 172 */   public InputConnection onCreateInputConnection(EditorInfo outAttrs) { throw new RuntimeException("Stub!"); }
/* 173 */   public boolean checkInputConnectionProxy(View view) { throw new RuntimeException("Stub!"); }
/* 174 */   public void clearTextFilter() { throw new RuntimeException("Stub!"); }
/* 175 */   public boolean hasTextFilter() { throw new RuntimeException("Stub!"); }
/* 176 */   public void onGlobalLayout() { throw new RuntimeException("Stub!"); }
/* 177 */   public void beforeTextChanged(CharSequence s, int start, int count, int after) { throw new RuntimeException("Stub!"); }
/* 178 */   public void onTextChanged(CharSequence s, int start, int before, int count) { throw new RuntimeException("Stub!"); }
/* 179 */   public void afterTextChanged(Editable s) { throw new RuntimeException("Stub!"); }
/* 180 */   public void onFilterComplete(int count) { throw new RuntimeException("Stub!"); }
/* 181 */   protected ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 182 */   protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 183 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 184 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 185 */   public void setTranscriptMode(int mode) { throw new RuntimeException("Stub!"); }
/* 186 */   public int getTranscriptMode() { throw new RuntimeException("Stub!"); }
/* 187 */   public int getSolidColor() { throw new RuntimeException("Stub!"); }
/* 188 */   public void setCacheColorHint(int color) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 190 */   public int getCacheColorHint() { throw new RuntimeException("Stub!"); }
/* 191 */   public void reclaimViews(List<View> views) { throw new RuntimeException("Stub!"); }
/* 192 */   public void setRemoteViewsAdapter(Intent intent) { throw new RuntimeException("Stub!"); }
/* 193 */   public void deferNotifyDataSetChanged() { throw new RuntimeException("Stub!"); }
/* 194 */   public boolean onRemoteAdapterConnected() { throw new RuntimeException("Stub!"); }
/* 195 */   public void onRemoteAdapterDisconnected() { throw new RuntimeException("Stub!"); }
/* 196 */   public void setRecyclerListener(RecyclerListener listener) { throw new RuntimeException("Stub!"); }
/* 197 */   public void setSelectionFromTop(int position, int y) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static abstract interface MultiChoiceModeListener
/*     */     extends android.view.ActionMode.Callback
/*     */   {
/*     */     public abstract void onItemCheckedStateChanged(ActionMode paramActionMode, int paramInt, long paramLong, boolean paramBoolean);
/*     */   }
/*     */   
/*     */   public static abstract interface SelectionBoundsAdjuster
/*     */   {
/*     */     public abstract void adjustListItemSelectionBounds(Rect paramRect);
/*     */   }
/*     */   
/*     */   public static abstract interface OnScrollListener
/*     */   {
/*     */     public static final int SCROLL_STATE_FLING = 2;
/*     */     public static final int SCROLL_STATE_IDLE = 0;
/*     */     public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
/*     */     
/*     */     public abstract void onScrollStateChanged(AbsListView paramAbsListView, int paramInt);
/*     */     
/*     */     public abstract void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3);
/*     */   }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\AbsListView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */