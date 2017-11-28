/*     */ package android.view;
/*     */ 
/*     */ import android.content.Context;
/*     */ 
/*     */ public abstract class ViewGroup extends View implements ViewParent, ViewManager {
/*     */   protected static final int CLIP_TO_PADDING_MASK = 34;
/*     */   public static final int FOCUS_AFTER_DESCENDANTS = 262144;
/*     */   public static final int FOCUS_BEFORE_DESCENDANTS = 131072;
/*     */   public static final int FOCUS_BLOCK_DESCENDANTS = 393216;
/*     */   public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
/*     */   public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
/*     */   public static final int PERSISTENT_ALL_CACHES = 3;
/*     */   public static final int PERSISTENT_ANIMATION_CACHE = 1;
/*     */   public static final int PERSISTENT_NO_CACHE = 0;
/*     */   public static final int PERSISTENT_SCROLLING_CACHE = 2;
/*     */   
/*     */   public static abstract interface OnHierarchyChangeListener {
/*     */     public abstract void onChildViewAdded(View paramView1, View paramView2);
/*     */     
/*     */     public abstract void onChildViewRemoved(View paramView1, View paramView2);
/*     */   }
/*     */   
/*     */   public static class LayoutParams {
/*     */     @Deprecated
/*     */     public static final int FILL_PARENT = -1;
/*     */     public static final int MATCH_PARENT = -1;
/*     */     public static final int WRAP_CONTENT = -2;
/*     */     
/*  29 */     public LayoutParams(Context c, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/*  30 */     public LayoutParams(int width, int height) { throw new RuntimeException("Stub!"); }
/*  31 */     public LayoutParams(LayoutParams source) { throw new RuntimeException("Stub!"); }
/*  32 */     protected void setBaseAttributes(android.content.res.TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!"); }
/*  33 */     public void resolveLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     @ViewDebug.ExportedProperty(category="layout", mapping={@ViewDebug.IntToString(from=-1, to="MATCH_PARENT"), @ViewDebug.IntToString(from=-2, to="WRAP_CONTENT")})
/*     */     public int height;
/*     */     public android.view.animation.LayoutAnimationController.AnimationParameters layoutAnimationParameters;
/*     */     @ViewDebug.ExportedProperty(category="layout", mapping={@ViewDebug.IntToString(from=-1, to="MATCH_PARENT"), @ViewDebug.IntToString(from=-2, to="WRAP_CONTENT")})
/*     */     public int width;
/*     */   }
/*     */   
/*     */   public static class MarginLayoutParams extends ViewGroup.LayoutParams {
/*     */     @ViewDebug.ExportedProperty(category="layout")
/*     */     public int bottomMargin;
/*     */     @ViewDebug.ExportedProperty(category="layout")
/*     */     public int leftMargin;
/*     */     
/*  48 */     public MarginLayoutParams(Context c, android.util.AttributeSet attrs) { super();throw new RuntimeException("Stub!"); }
/*  49 */     public MarginLayoutParams(int width, int height) { super();throw new RuntimeException("Stub!"); }
/*  50 */     public MarginLayoutParams(MarginLayoutParams source) { super();throw new RuntimeException("Stub!"); }
/*  51 */     public MarginLayoutParams(ViewGroup.LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/*  52 */     public void setMargins(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/*  53 */     public void setMarginStart(int start) { throw new RuntimeException("Stub!"); }
/*  54 */     public int getMarginStart() { throw new RuntimeException("Stub!"); }
/*  55 */     public void setMarginEnd(int end) { throw new RuntimeException("Stub!"); }
/*  56 */     public int getMarginEnd() { throw new RuntimeException("Stub!"); }
/*  57 */     public boolean isMarginRelative() { throw new RuntimeException("Stub!"); }
/*  58 */     public void setLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*  59 */     public int getLayoutDirection() { throw new RuntimeException("Stub!"); }
/*  60 */     public void resolveLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     @ViewDebug.ExportedProperty(category="layout")
/*     */     public int rightMargin;
/*     */     @ViewDebug.ExportedProperty(category="layout")
/*     */     public int topMargin;
/*     */   }
/*     */   
/*     */   public ViewGroup(Context context)
/*     */   {
/*  70 */     super((Context)null, (android.util.AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  71 */   public ViewGroup(Context context, android.util.AttributeSet attrs) { super((Context)null, (android.util.AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  72 */   public ViewGroup(Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((Context)null, (android.util.AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  73 */   public ViewGroup(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (android.util.AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="focus", mapping={@ViewDebug.IntToString(from=131072, to="FOCUS_BEFORE_DESCENDANTS"), @ViewDebug.IntToString(from=262144, to="FOCUS_AFTER_DESCENDANTS"), @ViewDebug.IntToString(from=393216, to="FOCUS_BLOCK_DESCENDANTS")})
/*  75 */   public int getDescendantFocusability() { throw new RuntimeException("Stub!"); }
/*  76 */   public void setDescendantFocusability(int focusability) { throw new RuntimeException("Stub!"); }
/*  77 */   public void requestChildFocus(View child, View focused) { throw new RuntimeException("Stub!"); }
/*  78 */   public void focusableViewAvailable(View v) { throw new RuntimeException("Stub!"); }
/*  79 */   public boolean showContextMenuForChild(View originalView) { throw new RuntimeException("Stub!"); }
/*  80 */   public boolean showContextMenuForChild(View originalView, float x, float y) { throw new RuntimeException("Stub!"); }
/*  81 */   public ActionMode startActionModeForChild(View originalView, ActionMode.Callback callback) { throw new RuntimeException("Stub!"); }
/*  82 */   public ActionMode startActionModeForChild(View originalView, ActionMode.Callback callback, int type) { throw new RuntimeException("Stub!"); }
/*  83 */   public View focusSearch(View focused, int direction) { throw new RuntimeException("Stub!"); }
/*  84 */   public boolean requestChildRectangleOnScreen(View child, android.graphics.Rect rectangle, boolean immediate) { throw new RuntimeException("Stub!"); }
/*  85 */   public boolean requestSendAccessibilityEvent(View child, android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/*  86 */   public boolean onRequestSendAccessibilityEvent(View child, android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/*  87 */   public void childHasTransientStateChanged(View child, boolean childHasTransientState) { throw new RuntimeException("Stub!"); }
/*  88 */   public boolean hasTransientState() { throw new RuntimeException("Stub!"); }
/*  89 */   public boolean dispatchUnhandledMove(View focused, int direction) { throw new RuntimeException("Stub!"); }
/*  90 */   public void clearChildFocus(View child) { throw new RuntimeException("Stub!"); }
/*  91 */   public void clearFocus() { throw new RuntimeException("Stub!"); }
/*  92 */   public View getFocusedChild() { throw new RuntimeException("Stub!"); }
/*  93 */   public boolean hasFocus() { throw new RuntimeException("Stub!"); }
/*  94 */   public View findFocus() { throw new RuntimeException("Stub!"); }
/*  95 */   public void addFocusables(java.util.ArrayList<View> views, int direction, int focusableMode) { throw new RuntimeException("Stub!"); }
/*  96 */   public void addKeyboardNavigationClusters(java.util.Collection<View> views, int direction) { throw new RuntimeException("Stub!"); }
/*  97 */   public void setTouchscreenBlocksFocus(boolean touchscreenBlocksFocus) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="focus")
/*  99 */   public boolean getTouchscreenBlocksFocus() { throw new RuntimeException("Stub!"); }
/* 100 */   public void findViewsWithText(java.util.ArrayList<View> outViews, CharSequence text, int flags) { throw new RuntimeException("Stub!"); }
/* 101 */   public void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
/* 102 */   public void addTouchables(java.util.ArrayList<View> views) { throw new RuntimeException("Stub!"); }
/* 103 */   public void dispatchDisplayHint(int hint) { throw new RuntimeException("Stub!"); }
/* 104 */   protected void dispatchVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); }
/* 105 */   public void dispatchWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
/* 106 */   public void dispatchConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 107 */   public void recomputeViewAttributes(View child) { throw new RuntimeException("Stub!"); }
/* 108 */   public void bringChildToFront(View child) { throw new RuntimeException("Stub!"); }
/* 109 */   public boolean dispatchDragEvent(DragEvent event) { throw new RuntimeException("Stub!"); }
/* 110 */   public void dispatchWindowSystemUiVisiblityChanged(int visible) { throw new RuntimeException("Stub!"); }
/* 111 */   public void dispatchSystemUiVisibilityChanged(int visible) { throw new RuntimeException("Stub!"); }
/* 112 */   public boolean dispatchKeyEventPreIme(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 113 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 114 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 115 */   public boolean dispatchTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 116 */   public boolean dispatchCapturedPointerEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 117 */   public void dispatchPointerCaptureChanged(boolean hasCapture) { throw new RuntimeException("Stub!"); }
/* 118 */   public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) { throw new RuntimeException("Stub!"); }
/*     */   
/* 120 */   protected boolean dispatchHoverEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 121 */   public void addChildrenForAccessibility(java.util.ArrayList<View> outChildren) { throw new RuntimeException("Stub!"); }
/* 122 */   public boolean onInterceptHoverEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 123 */   protected boolean dispatchGenericPointerEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 124 */   protected boolean dispatchGenericFocusedEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 125 */   public boolean dispatchTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 126 */   public void setMotionEventSplittingEnabled(boolean split) { throw new RuntimeException("Stub!"); }
/* 127 */   public boolean isMotionEventSplittingEnabled() { throw new RuntimeException("Stub!"); }
/* 128 */   public boolean isTransitionGroup() { throw new RuntimeException("Stub!"); }
/* 129 */   public void setTransitionGroup(boolean isTransitionGroup) { throw new RuntimeException("Stub!"); }
/* 130 */   public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) { throw new RuntimeException("Stub!"); }
/* 131 */   public boolean onInterceptTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 132 */   public boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/*     */   
/* 134 */   protected boolean onRequestFocusInDescendants(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 135 */   public boolean restoreDefaultFocus() { throw new RuntimeException("Stub!"); }
/* 136 */   public void dispatchProvideStructure(ViewStructure structure) { throw new RuntimeException("Stub!"); }
/* 137 */   public void dispatchProvideAutofillStructure(ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
/* 138 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 139 */   public void notifySubtreeAccessibilityStateChanged(View child, View source, int changeType) { throw new RuntimeException("Stub!"); }
/* 140 */   public boolean onNestedPrePerformAccessibilityAction(View target, int action, android.os.Bundle args) { throw new RuntimeException("Stub!"); }
/* 141 */   protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 142 */   protected void dispatchFreezeSelfOnly(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 143 */   protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 144 */   protected void dispatchThawSelfOnly(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 145 */   protected void setChildrenDrawingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 146 */   protected void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 147 */   public ViewGroupOverlay getOverlay() { throw new RuntimeException("Stub!"); }
/* 148 */   protected int getChildDrawingOrder(int childCount, int i) { throw new RuntimeException("Stub!"); }
/* 149 */   protected boolean drawChild(android.graphics.Canvas canvas, View child, long drawingTime) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 151 */   public boolean getClipChildren() { throw new RuntimeException("Stub!"); }
/* 152 */   public void setClipChildren(boolean clipChildren) { throw new RuntimeException("Stub!"); }
/* 153 */   public void setClipToPadding(boolean clipToPadding) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 155 */   public boolean getClipToPadding() { throw new RuntimeException("Stub!"); }
/* 156 */   public void dispatchSetSelected(boolean selected) { throw new RuntimeException("Stub!"); }
/* 157 */   public void dispatchSetActivated(boolean activated) { throw new RuntimeException("Stub!"); }
/* 158 */   protected void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); }
/* 159 */   public void dispatchDrawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
/* 160 */   protected void setStaticTransformationsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 161 */   protected boolean getChildStaticTransformation(View child, android.view.animation.Transformation t) { throw new RuntimeException("Stub!"); }
/* 162 */   public void addView(View child) { throw new RuntimeException("Stub!"); }
/* 163 */   public void addView(View child, int index) { throw new RuntimeException("Stub!"); }
/* 164 */   public void addView(View child, int width, int height) { throw new RuntimeException("Stub!"); }
/* 165 */   public void addView(View child, LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 166 */   public void addView(View child, int index, LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 167 */   public void updateViewLayout(View view, LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 168 */   protected boolean checkLayoutParams(LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 169 */   public void setOnHierarchyChangeListener(OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 170 */   public void onViewAdded(View child) { throw new RuntimeException("Stub!"); }
/* 171 */   public void onViewRemoved(View child) { throw new RuntimeException("Stub!"); }
/* 172 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 173 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 174 */   protected boolean addViewInLayout(View child, int index, LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 175 */   protected boolean addViewInLayout(View child, int index, LayoutParams params, boolean preventRequestLayout) { throw new RuntimeException("Stub!"); }
/* 176 */   protected void cleanupLayoutState(View child) { throw new RuntimeException("Stub!"); }
/* 177 */   protected void attachLayoutAnimationParameters(View child, LayoutParams params, int index, int count) { throw new RuntimeException("Stub!"); }
/* 178 */   public void removeView(View view) { throw new RuntimeException("Stub!"); }
/* 179 */   public void removeViewInLayout(View view) { throw new RuntimeException("Stub!"); }
/* 180 */   public void removeViewsInLayout(int start, int count) { throw new RuntimeException("Stub!"); }
/* 181 */   public void removeViewAt(int index) { throw new RuntimeException("Stub!"); }
/* 182 */   public void removeViews(int start, int count) { throw new RuntimeException("Stub!"); }
/* 183 */   public void setLayoutTransition(android.animation.LayoutTransition transition) { throw new RuntimeException("Stub!"); }
/* 184 */   public android.animation.LayoutTransition getLayoutTransition() { throw new RuntimeException("Stub!"); }
/* 185 */   public void removeAllViews() { throw new RuntimeException("Stub!"); }
/* 186 */   public void removeAllViewsInLayout() { throw new RuntimeException("Stub!"); }
/* 187 */   protected void removeDetachedView(View child, boolean animate) { throw new RuntimeException("Stub!"); }
/* 188 */   protected void attachViewToParent(View child, int index, LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 189 */   protected void detachViewFromParent(View child) { throw new RuntimeException("Stub!"); }
/* 190 */   protected void detachViewFromParent(int index) { throw new RuntimeException("Stub!"); }
/* 191 */   protected void detachViewsFromParent(int start, int count) { throw new RuntimeException("Stub!"); }
/* 192 */   protected void detachAllViewsFromParent() { throw new RuntimeException("Stub!"); }
/* 193 */   public void onDescendantInvalidated(View child, View target) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 195 */   public final void invalidateChild(View child, android.graphics.Rect dirty) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 197 */   public ViewParent invalidateChildInParent(int[] location, android.graphics.Rect dirty) { throw new RuntimeException("Stub!"); }
/* 198 */   public final void offsetDescendantRectToMyCoords(View descendant, android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
/* 199 */   public final void offsetRectIntoDescendantCoords(View descendant, android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
/* 200 */   public boolean getChildVisibleRect(View child, android.graphics.Rect r, android.graphics.Point offset) { throw new RuntimeException("Stub!"); }
/* 201 */   public final void layout(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/*     */   protected abstract void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/* 203 */   protected boolean canAnimate() { throw new RuntimeException("Stub!"); }
/* 204 */   public void startLayoutAnimation() { throw new RuntimeException("Stub!"); }
/* 205 */   public void scheduleLayoutAnimation() { throw new RuntimeException("Stub!"); }
/* 206 */   public void setLayoutAnimation(android.view.animation.LayoutAnimationController controller) { throw new RuntimeException("Stub!"); }
/* 207 */   public android.view.animation.LayoutAnimationController getLayoutAnimation() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 209 */   public boolean isAnimationCacheEnabled() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 211 */   public void setAnimationCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 213 */   public boolean isAlwaysDrawnWithCacheEnabled() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 215 */   public void setAlwaysDrawnWithCacheEnabled(boolean always) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 217 */   protected boolean isChildrenDrawnWithCacheEnabled() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 219 */   protected void setChildrenDrawnWithCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 221 */   protected boolean isChildrenDrawingOrderEnabled() { throw new RuntimeException("Stub!"); }
/* 222 */   protected void setChildrenDrawingOrderEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing", mapping={@ViewDebug.IntToString(from=0, to="NONE"), @ViewDebug.IntToString(from=1, to="ANIMATION"), @ViewDebug.IntToString(from=2, to="SCROLLING"), @ViewDebug.IntToString(from=3, to="ALL")})
/* 224 */   public int getPersistentDrawingCache() { throw new RuntimeException("Stub!"); }
/* 225 */   public void setPersistentDrawingCache(int drawingCacheToKeep) { throw new RuntimeException("Stub!"); }
/* 226 */   public int getLayoutMode() { throw new RuntimeException("Stub!"); }
/* 227 */   public void setLayoutMode(int layoutMode) { throw new RuntimeException("Stub!"); }
/* 228 */   public LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 229 */   protected LayoutParams generateLayoutParams(LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 230 */   protected LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 231 */   protected void debug(int depth) { throw new RuntimeException("Stub!"); }
/* 232 */   public int indexOfChild(View child) { throw new RuntimeException("Stub!"); }
/* 233 */   public int getChildCount() { throw new RuntimeException("Stub!"); }
/* 234 */   public View getChildAt(int index) { throw new RuntimeException("Stub!"); }
/* 235 */   protected void measureChildren(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 236 */   protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 237 */   protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) { throw new RuntimeException("Stub!"); }
/* 238 */   public static int getChildMeasureSpec(int spec, int padding, int childDimension) { throw new RuntimeException("Stub!"); }
/* 239 */   public void clearDisappearingChildren() { throw new RuntimeException("Stub!"); }
/* 240 */   public void startViewTransition(View view) { throw new RuntimeException("Stub!"); }
/* 241 */   public void endViewTransition(View view) { throw new RuntimeException("Stub!"); }
/* 242 */   public boolean gatherTransparentRegion(android.graphics.Region region) { throw new RuntimeException("Stub!"); }
/* 243 */   public void requestTransparentRegion(View child) { throw new RuntimeException("Stub!"); }
/* 244 */   public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) { throw new RuntimeException("Stub!"); }
/* 245 */   public android.view.animation.Animation.AnimationListener getLayoutAnimationListener() { throw new RuntimeException("Stub!"); }
/* 246 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); }
/* 247 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
/* 248 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
/* 249 */   public void setAddStatesFromChildren(boolean addsStates) { throw new RuntimeException("Stub!"); }
/* 250 */   public boolean addStatesFromChildren() { throw new RuntimeException("Stub!"); }
/* 251 */   public void childDrawableStateChanged(View child) { throw new RuntimeException("Stub!"); }
/* 252 */   public void setLayoutAnimationListener(android.view.animation.Animation.AnimationListener animationListener) { throw new RuntimeException("Stub!"); }
/* 253 */   public boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
/* 254 */   public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) { throw new RuntimeException("Stub!"); }
/* 255 */   public void onNestedScrollAccepted(View child, View target, int axes) { throw new RuntimeException("Stub!"); }
/* 256 */   public void onStopNestedScroll(View child) { throw new RuntimeException("Stub!"); }
/* 257 */   public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) { throw new RuntimeException("Stub!"); }
/* 258 */   public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) { throw new RuntimeException("Stub!"); }
/* 259 */   public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) { throw new RuntimeException("Stub!"); }
/* 260 */   public boolean onNestedPreFling(View target, float velocityX, float velocityY) { throw new RuntimeException("Stub!"); }
/* 261 */   public int getNestedScrollAxes() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\ViewGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */