/*     */ package android.view;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcelable;
/*     */ import android.util.Property;
/*     */ import android.util.SparseArray;
/*     */ import android.view.accessibility.AccessibilityEvent;
/*     */ import android.view.accessibility.AccessibilityNodeInfo;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ public class View
/*     */   implements android.graphics.drawable.Drawable.Callback, KeyEvent.Callback, android.view.accessibility.AccessibilityEventSource
/*     */ {
/*     */   public static abstract interface OnScrollChangeListener
/*     */   {
/*     */     public abstract void onScrollChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   }
/*     */   
/*     */   public static abstract interface OnLayoutChangeListener
/*     */   {
/*     */     public abstract void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
/*     */   }
/*     */   
/*     */   public static class DragShadowBuilder
/*     */   {
/*  31 */     public DragShadowBuilder(View view) { throw new RuntimeException("Stub!"); }
/*  32 */     public DragShadowBuilder() { throw new RuntimeException("Stub!"); }
/*     */     
/*  34 */     public final View getView() { throw new RuntimeException("Stub!"); }
/*  35 */     public void onProvideShadowMetrics(android.graphics.Point outShadowSize, android.graphics.Point outShadowTouchPoint) { throw new RuntimeException("Stub!"); }
/*  36 */     public void onDrawShadow(Canvas canvas) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static abstract interface OnCapturedPointerListener { public abstract boolean onCapturedPointer(View paramView, MotionEvent paramMotionEvent); }
/*     */   
/*     */   public static class MeasureSpec { public static final int AT_MOST = Integer.MIN_VALUE;
/*     */     public static final int EXACTLY = 1073741824;
/*     */     public static final int UNSPECIFIED = 0;
/*     */     
/*  44 */     public MeasureSpec() { throw new RuntimeException("Stub!"); }
/*  45 */     public static int makeMeasureSpec(int size, int mode) { throw new RuntimeException("Stub!"); }
/*  46 */     public static int getMode(int measureSpec) { throw new RuntimeException("Stub!"); }
/*  47 */     public static int getSize(int measureSpec) { throw new RuntimeException("Stub!"); }
/*  48 */     public static String toString(int measureSpec) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static abstract interface OnKeyListener
/*     */   {
/*     */     public abstract boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent);
/*     */   }
/*     */   
/*     */   public static abstract interface OnTouchListener
/*     */   {
/*     */     public abstract boolean onTouch(View paramView, MotionEvent paramMotionEvent);
/*     */   }
/*     */   
/*     */   public static abstract interface OnHoverListener {
/*     */     public abstract boolean onHover(View paramView, MotionEvent paramMotionEvent);
/*     */   }
/*     */   
/*     */   public static abstract interface OnGenericMotionListener {
/*     */     public abstract boolean onGenericMotion(View paramView, MotionEvent paramMotionEvent);
/*     */   }
/*     */   
/*     */   public static abstract interface OnLongClickListener {
/*     */     public abstract boolean onLongClick(View paramView);
/*     */   }
/*     */   
/*     */   public static abstract interface OnDragListener {
/*     */     public abstract boolean onDrag(View paramView, DragEvent paramDragEvent);
/*     */   }
/*     */   
/*     */   public static abstract interface OnFocusChangeListener {
/*     */     public abstract void onFocusChange(View paramView, boolean paramBoolean);
/*     */   }
/*     */   
/*     */   public static abstract interface OnClickListener {
/*     */     public abstract void onClick(View paramView);
/*     */   }
/*     */   
/*     */   public static abstract interface OnContextClickListener {
/*     */     public abstract boolean onContextClick(View paramView);
/*     */   }
/*     */   
/*     */   public static abstract interface OnCreateContextMenuListener {
/*     */     public abstract void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo);
/*     */   }
/*     */   
/*     */   public static abstract interface OnSystemUiVisibilityChangeListener {
/*     */     public abstract void onSystemUiVisibilityChange(int paramInt);
/*     */   }
/*     */   
/*     */   public static abstract interface OnAttachStateChangeListener {
/*     */     public abstract void onViewAttachedToWindow(View paramView);
/*     */     
/*     */     public abstract void onViewDetachedFromWindow(View paramView);
/*     */   }
/*     */   
/*     */   public static abstract interface OnApplyWindowInsetsListener {
/*     */     public abstract WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets);
/*     */   }
/*     */   
/*     */   public static class BaseSavedState extends AbsSavedState {
/*     */     public BaseSavedState(android.os.Parcel source) {
/* 109 */       super((ClassLoader)null);throw new RuntimeException("Stub!"); }
/* 110 */     public BaseSavedState(android.os.Parcel source, ClassLoader loader) { super((ClassLoader)null);throw new RuntimeException("Stub!"); }
/* 111 */     public BaseSavedState(Parcelable superState) { super((ClassLoader)null);throw new RuntimeException("Stub!"); }
/* 112 */     public void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*     */     
/* 114 */     public static final android.os.Parcelable.Creator<BaseSavedState> CREATOR = null;
/*     */   }
/*     */   
/*     */   public static class AccessibilityDelegate {
/* 118 */     public AccessibilityDelegate() { throw new RuntimeException("Stub!"); }
/* 119 */     public void sendAccessibilityEvent(View host, int eventType) { throw new RuntimeException("Stub!"); }
/* 120 */     public boolean performAccessibilityAction(View host, int action, Bundle args) { throw new RuntimeException("Stub!"); }
/* 121 */     public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 122 */     public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 123 */     public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 124 */     public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 125 */     public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/* 126 */     public void addExtraDataToAccessibilityNodeInfo(View host, AccessibilityNodeInfo info, String extraDataKey, Bundle arguments) { throw new RuntimeException("Stub!"); }
/* 127 */     public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 128 */     public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(View host) { throw new RuntimeException("Stub!"); } }
/*     */   
/* 130 */   public View(Context context) { throw new RuntimeException("Stub!"); }
/* 131 */   public View(Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 132 */   public View(Context context, android.util.AttributeSet attrs, int defStyleAttr) { throw new RuntimeException("Stub!"); }
/* 133 */   public View(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); }
/* 134 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 135 */   public int getVerticalFadingEdgeLength() { throw new RuntimeException("Stub!"); }
/* 136 */   public void setFadingEdgeLength(int length) { throw new RuntimeException("Stub!"); }
/* 137 */   public int getHorizontalFadingEdgeLength() { throw new RuntimeException("Stub!"); }
/* 138 */   public int getVerticalScrollbarWidth() { throw new RuntimeException("Stub!"); }
/* 139 */   protected int getHorizontalScrollbarHeight() { throw new RuntimeException("Stub!"); }
/* 140 */   public void setVerticalScrollbarPosition(int position) { throw new RuntimeException("Stub!"); }
/* 141 */   public int getVerticalScrollbarPosition() { throw new RuntimeException("Stub!"); }
/* 142 */   public void setScrollIndicators(int indicators) { throw new RuntimeException("Stub!"); }
/* 143 */   public void setScrollIndicators(int indicators, int mask) { throw new RuntimeException("Stub!"); }
/* 144 */   public int getScrollIndicators() { throw new RuntimeException("Stub!"); }
/* 145 */   public void setOnScrollChangeListener(OnScrollChangeListener l) { throw new RuntimeException("Stub!"); }
/* 146 */   public void setOnFocusChangeListener(OnFocusChangeListener l) { throw new RuntimeException("Stub!"); }
/* 147 */   public void addOnLayoutChangeListener(OnLayoutChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 148 */   public void removeOnLayoutChangeListener(OnLayoutChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 149 */   public void addOnAttachStateChangeListener(OnAttachStateChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 150 */   public void removeOnAttachStateChangeListener(OnAttachStateChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 151 */   public OnFocusChangeListener getOnFocusChangeListener() { throw new RuntimeException("Stub!"); }
/* 152 */   public void setOnClickListener(OnClickListener l) { throw new RuntimeException("Stub!"); }
/* 153 */   public boolean hasOnClickListeners() { throw new RuntimeException("Stub!"); }
/* 154 */   public void setOnLongClickListener(OnLongClickListener l) { throw new RuntimeException("Stub!"); }
/* 155 */   public void setOnContextClickListener(OnContextClickListener l) { throw new RuntimeException("Stub!"); }
/* 156 */   public void setOnCreateContextMenuListener(OnCreateContextMenuListener l) { throw new RuntimeException("Stub!"); }
/* 157 */   public boolean performClick() { throw new RuntimeException("Stub!"); }
/* 158 */   public boolean callOnClick() { throw new RuntimeException("Stub!"); }
/* 159 */   public boolean performLongClick() { throw new RuntimeException("Stub!"); }
/* 160 */   public boolean performLongClick(float x, float y) { throw new RuntimeException("Stub!"); }
/* 161 */   public boolean performContextClick(float x, float y) { throw new RuntimeException("Stub!"); }
/* 162 */   public boolean performContextClick() { throw new RuntimeException("Stub!"); }
/* 163 */   public boolean showContextMenu() { throw new RuntimeException("Stub!"); }
/* 164 */   public boolean showContextMenu(float x, float y) { throw new RuntimeException("Stub!"); }
/* 165 */   public ActionMode startActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); }
/* 166 */   public ActionMode startActionMode(ActionMode.Callback callback, int type) { throw new RuntimeException("Stub!"); }
/* 167 */   public void setOnKeyListener(OnKeyListener l) { throw new RuntimeException("Stub!"); }
/* 168 */   public void setOnTouchListener(OnTouchListener l) { throw new RuntimeException("Stub!"); }
/* 169 */   public void setOnGenericMotionListener(OnGenericMotionListener l) { throw new RuntimeException("Stub!"); }
/* 170 */   public void setOnHoverListener(OnHoverListener l) { throw new RuntimeException("Stub!"); }
/* 171 */   public void setOnDragListener(OnDragListener l) { throw new RuntimeException("Stub!"); }
/* 172 */   public final void setRevealOnFocusHint(boolean revealOnFocus) { throw new RuntimeException("Stub!"); }
/* 173 */   public final boolean getRevealOnFocusHint() { throw new RuntimeException("Stub!"); }
/* 174 */   public boolean requestRectangleOnScreen(Rect rectangle) { throw new RuntimeException("Stub!"); }
/* 175 */   public boolean requestRectangleOnScreen(Rect rectangle, boolean immediate) { throw new RuntimeException("Stub!"); }
/* 176 */   public void clearFocus() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="focus")
/* 178 */   public boolean hasFocus() { throw new RuntimeException("Stub!"); }
/* 179 */   public boolean hasFocusable() { throw new RuntimeException("Stub!"); }
/* 180 */   public boolean hasExplicitFocusable() { throw new RuntimeException("Stub!"); }
/* 181 */   protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 182 */   public void sendAccessibilityEvent(int eventType) { throw new RuntimeException("Stub!"); }
/* 183 */   public void announceForAccessibility(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 184 */   public void sendAccessibilityEventUnchecked(AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 185 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 186 */   public void onPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 187 */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 188 */   public AccessibilityNodeInfo createAccessibilityNodeInfo() { throw new RuntimeException("Stub!"); }
/* 189 */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/* 190 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 191 */   public void onProvideStructure(ViewStructure structure) { throw new RuntimeException("Stub!"); }
/* 192 */   public void onProvideAutofillStructure(ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
/* 193 */   public void onProvideVirtualStructure(ViewStructure structure) { throw new RuntimeException("Stub!"); }
/* 194 */   public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
/*     */   
/* 196 */   public void autofill(android.view.autofill.AutofillValue value) { throw new RuntimeException("Stub!"); }
/*     */   
/* 198 */   public void autofill(SparseArray<android.view.autofill.AutofillValue> values) { throw new RuntimeException("Stub!"); }
/* 199 */   public final android.view.autofill.AutofillId getAutofillId() { throw new RuntimeException("Stub!"); }
/* 200 */   public int getAutofillType() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 202 */   public String[] getAutofillHints() { throw new RuntimeException("Stub!"); }
/* 203 */   public android.view.autofill.AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(mapping={@ViewDebug.IntToString(from=0, to="auto"), @ViewDebug.IntToString(from=1, to="yes"), @ViewDebug.IntToString(from=2, to="no"), @ViewDebug.IntToString(from=4, to="yesExcludeDescendants"), @ViewDebug.IntToString(from=8, to="noExcludeDescendants")})
/* 205 */   public int getImportantForAutofill() { throw new RuntimeException("Stub!"); }
/* 206 */   public void setImportantForAutofill(int mode) { throw new RuntimeException("Stub!"); }
/* 207 */   public final boolean isImportantForAutofill() { throw new RuntimeException("Stub!"); }
/* 208 */   public void dispatchProvideStructure(ViewStructure structure) { throw new RuntimeException("Stub!"); }
/* 209 */   public void dispatchProvideAutofillStructure(ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
/* 210 */   public void addExtraDataToAccessibilityNodeInfo(AccessibilityNodeInfo info, String extraDataKey, Bundle arguments) { throw new RuntimeException("Stub!"); }
/* 211 */   public void setAccessibilityDelegate(AccessibilityDelegate delegate) { throw new RuntimeException("Stub!"); }
/* 212 */   public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="accessibility")
/* 214 */   public CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
/* 215 */   public void setContentDescription(CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
/* 216 */   public void setAccessibilityTraversalBefore(int beforeId) { throw new RuntimeException("Stub!"); }
/* 217 */   public int getAccessibilityTraversalBefore() { throw new RuntimeException("Stub!"); }
/* 218 */   public void setAccessibilityTraversalAfter(int afterId) { throw new RuntimeException("Stub!"); }
/* 219 */   public int getAccessibilityTraversalAfter() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="accessibility")
/* 221 */   public int getLabelFor() { throw new RuntimeException("Stub!"); }
/* 222 */   public void setLabelFor(int id) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="focus")
/* 224 */   public boolean isFocused() { throw new RuntimeException("Stub!"); }
/* 225 */   public View findFocus() { throw new RuntimeException("Stub!"); }
/* 226 */   public boolean isScrollContainer() { throw new RuntimeException("Stub!"); }
/* 227 */   public void setScrollContainer(boolean isScrollContainer) { throw new RuntimeException("Stub!"); }
/* 228 */   public int getDrawingCacheQuality() { throw new RuntimeException("Stub!"); }
/* 229 */   public void setDrawingCacheQuality(int quality) { throw new RuntimeException("Stub!"); }
/* 230 */   public boolean getKeepScreenOn() { throw new RuntimeException("Stub!"); }
/* 231 */   public void setKeepScreenOn(boolean keepScreenOn) { throw new RuntimeException("Stub!"); }
/* 232 */   public int getNextFocusLeftId() { throw new RuntimeException("Stub!"); }
/* 233 */   public void setNextFocusLeftId(int nextFocusLeftId) { throw new RuntimeException("Stub!"); }
/* 234 */   public int getNextFocusRightId() { throw new RuntimeException("Stub!"); }
/* 235 */   public void setNextFocusRightId(int nextFocusRightId) { throw new RuntimeException("Stub!"); }
/* 236 */   public int getNextFocusUpId() { throw new RuntimeException("Stub!"); }
/* 237 */   public void setNextFocusUpId(int nextFocusUpId) { throw new RuntimeException("Stub!"); }
/* 238 */   public int getNextFocusDownId() { throw new RuntimeException("Stub!"); }
/* 239 */   public void setNextFocusDownId(int nextFocusDownId) { throw new RuntimeException("Stub!"); }
/* 240 */   public int getNextFocusForwardId() { throw new RuntimeException("Stub!"); }
/* 241 */   public void setNextFocusForwardId(int nextFocusForwardId) { throw new RuntimeException("Stub!"); }
/* 242 */   public int getNextClusterForwardId() { throw new RuntimeException("Stub!"); }
/* 243 */   public void setNextClusterForwardId(int nextClusterForwardId) { throw new RuntimeException("Stub!"); }
/* 244 */   public boolean isShown() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 246 */   protected boolean fitSystemWindows(Rect insets) { throw new RuntimeException("Stub!"); }
/* 247 */   public WindowInsets onApplyWindowInsets(WindowInsets insets) { throw new RuntimeException("Stub!"); }
/* 248 */   public void setOnApplyWindowInsetsListener(OnApplyWindowInsetsListener listener) { throw new RuntimeException("Stub!"); }
/* 249 */   public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) { throw new RuntimeException("Stub!"); }
/* 250 */   public WindowInsets getRootWindowInsets() { throw new RuntimeException("Stub!"); }
/* 251 */   public WindowInsets computeSystemWindowInsets(WindowInsets in, Rect outLocalInsets) { throw new RuntimeException("Stub!"); }
/* 252 */   public void setFitsSystemWindows(boolean fitSystemWindows) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 254 */   public boolean getFitsSystemWindows() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 256 */   public void requestFitSystemWindows() { throw new RuntimeException("Stub!"); }
/* 257 */   public void requestApplyInsets() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(mapping={@ViewDebug.IntToString(from=0, to="VISIBLE"), @ViewDebug.IntToString(from=4, to="INVISIBLE"), @ViewDebug.IntToString(from=8, to="GONE")})
/* 259 */   public int getVisibility() { throw new RuntimeException("Stub!"); }
/* 260 */   public void setVisibility(int visibility) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 262 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 263 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 264 */   public void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); }
/* 265 */   public void setFocusable(int focusable) { throw new RuntimeException("Stub!"); }
/* 266 */   public void setFocusableInTouchMode(boolean focusableInTouchMode) { throw new RuntimeException("Stub!"); }
/* 267 */   public void setAutofillHints(String... autofillHints) { throw new RuntimeException("Stub!"); }
/* 268 */   public void setSoundEffectsEnabled(boolean soundEffectsEnabled) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 270 */   public boolean isSoundEffectsEnabled() { throw new RuntimeException("Stub!"); }
/* 271 */   public void setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 273 */   public boolean isHapticFeedbackEnabled() { throw new RuntimeException("Stub!"); }
/* 274 */   public void setLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="layout", mapping={@ViewDebug.IntToString(from=0, to="RESOLVED_DIRECTION_LTR"), @ViewDebug.IntToString(from=1, to="RESOLVED_DIRECTION_RTL")})
/* 276 */   public int getLayoutDirection() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="layout")
/* 278 */   public boolean hasTransientState() { throw new RuntimeException("Stub!"); }
/* 279 */   public void setHasTransientState(boolean hasTransientState) { throw new RuntimeException("Stub!"); }
/* 280 */   public boolean isAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 281 */   public boolean isLaidOut() { throw new RuntimeException("Stub!"); }
/* 282 */   public void setWillNotDraw(boolean willNotDraw) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 284 */   public boolean willNotDraw() { throw new RuntimeException("Stub!"); }
/* 285 */   public void setWillNotCacheDrawing(boolean willNotCacheDrawing) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 287 */   public boolean willNotCacheDrawing() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 289 */   public boolean isClickable() { throw new RuntimeException("Stub!"); }
/* 290 */   public void setClickable(boolean clickable) { throw new RuntimeException("Stub!"); }
/* 291 */   public boolean isLongClickable() { throw new RuntimeException("Stub!"); }
/* 292 */   public void setLongClickable(boolean longClickable) { throw new RuntimeException("Stub!"); }
/* 293 */   public boolean isContextClickable() { throw new RuntimeException("Stub!"); }
/* 294 */   public void setContextClickable(boolean contextClickable) { throw new RuntimeException("Stub!"); }
/* 295 */   public void setPressed(boolean pressed) { throw new RuntimeException("Stub!"); }
/* 296 */   protected void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 298 */   public boolean isPressed() { throw new RuntimeException("Stub!"); }
/* 299 */   public boolean isSaveEnabled() { throw new RuntimeException("Stub!"); }
/* 300 */   public void setSaveEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 302 */   public boolean getFilterTouchesWhenObscured() { throw new RuntimeException("Stub!"); }
/* 303 */   public void setFilterTouchesWhenObscured(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 304 */   public boolean isSaveFromParentEnabled() { throw new RuntimeException("Stub!"); }
/* 305 */   public void setSaveFromParentEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="focus")
/* 307 */   public final boolean isFocusable() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(mapping={@ViewDebug.IntToString(from=0, to="NOT_FOCUSABLE"), @ViewDebug.IntToString(from=1, to="FOCUSABLE"), @ViewDebug.IntToString(from=16, to="FOCUSABLE_AUTO")}, category="focus")
/* 309 */   public int getFocusable() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="focus")
/* 311 */   public final boolean isFocusableInTouchMode() { throw new RuntimeException("Stub!"); }
/* 312 */   public View focusSearch(int direction) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="focus")
/* 314 */   public final boolean isKeyboardNavigationCluster() { throw new RuntimeException("Stub!"); }
/* 315 */   public void setKeyboardNavigationCluster(boolean isCluster) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="focus")
/* 317 */   public final boolean isFocusedByDefault() { throw new RuntimeException("Stub!"); }
/* 318 */   public void setFocusedByDefault(boolean isFocusedByDefault) { throw new RuntimeException("Stub!"); }
/* 319 */   public View keyboardNavigationClusterSearch(View currentCluster, int direction) { throw new RuntimeException("Stub!"); }
/* 320 */   public boolean dispatchUnhandledMove(View focused, int direction) { throw new RuntimeException("Stub!"); }
/* 321 */   public void setDefaultFocusHighlightEnabled(boolean defaultFocusHighlightEnabled) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="focus")
/* 323 */   public final boolean getDefaultFocusHighlightEnabled() { throw new RuntimeException("Stub!"); }
/* 324 */   public ArrayList<View> getFocusables(int direction) { throw new RuntimeException("Stub!"); }
/* 325 */   public void addFocusables(ArrayList<View> views, int direction) { throw new RuntimeException("Stub!"); }
/* 326 */   public void addFocusables(ArrayList<View> views, int direction, int focusableMode) { throw new RuntimeException("Stub!"); }
/* 327 */   public void addKeyboardNavigationClusters(java.util.Collection<View> views, int direction) { throw new RuntimeException("Stub!"); }
/* 328 */   public void findViewsWithText(ArrayList<View> outViews, CharSequence searched, int flags) { throw new RuntimeException("Stub!"); }
/* 329 */   public ArrayList<View> getTouchables() { throw new RuntimeException("Stub!"); }
/* 330 */   public void addTouchables(ArrayList<View> views) { throw new RuntimeException("Stub!"); }
/* 331 */   public boolean isAccessibilityFocused() { throw new RuntimeException("Stub!"); }
/* 332 */   public final boolean requestFocus() { throw new RuntimeException("Stub!"); }
/* 333 */   public boolean restoreDefaultFocus() { throw new RuntimeException("Stub!"); }
/* 334 */   public final boolean requestFocus(int direction) { throw new RuntimeException("Stub!"); }
/* 335 */   public boolean requestFocus(int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 336 */   public final boolean requestFocusFromTouch() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="accessibility", mapping={@ViewDebug.IntToString(from=0, to="auto"), @ViewDebug.IntToString(from=1, to="yes"), @ViewDebug.IntToString(from=2, to="no"), @ViewDebug.IntToString(from=4, to="noHideDescendants")})
/* 338 */   public int getImportantForAccessibility() { throw new RuntimeException("Stub!"); }
/* 339 */   public void setAccessibilityLiveRegion(int mode) { throw new RuntimeException("Stub!"); }
/* 340 */   public int getAccessibilityLiveRegion() { throw new RuntimeException("Stub!"); }
/* 341 */   public void setImportantForAccessibility(int mode) { throw new RuntimeException("Stub!"); }
/* 342 */   public boolean isImportantForAccessibility() { throw new RuntimeException("Stub!"); }
/* 343 */   public ViewParent getParentForAccessibility() { throw new RuntimeException("Stub!"); }
/* 344 */   public void addChildrenForAccessibility(ArrayList<View> outChildren) { throw new RuntimeException("Stub!"); }
/* 345 */   public boolean dispatchNestedPrePerformAccessibilityAction(int action, Bundle arguments) { throw new RuntimeException("Stub!"); }
/* 346 */   public boolean performAccessibilityAction(int action, Bundle arguments) { throw new RuntimeException("Stub!"); }
/* 347 */   public final boolean isTemporarilyDetached() { throw new RuntimeException("Stub!"); }
/* 348 */   public void dispatchStartTemporaryDetach() { throw new RuntimeException("Stub!"); }
/* 349 */   public void onStartTemporaryDetach() { throw new RuntimeException("Stub!"); }
/* 350 */   public void dispatchFinishTemporaryDetach() { throw new RuntimeException("Stub!"); }
/* 351 */   public void onFinishTemporaryDetach() { throw new RuntimeException("Stub!"); }
/* 352 */   public KeyEvent.DispatcherState getKeyDispatcherState() { throw new RuntimeException("Stub!"); }
/* 353 */   public boolean dispatchKeyEventPreIme(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 354 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 355 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 356 */   public boolean dispatchTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 357 */   public boolean onFilterTouchEventForSecurity(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 358 */   public boolean dispatchTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 359 */   public boolean dispatchCapturedPointerEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 360 */   public boolean dispatchGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 361 */   protected boolean dispatchHoverEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 362 */   protected boolean dispatchGenericPointerEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 363 */   protected boolean dispatchGenericFocusedEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 364 */   public void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
/* 365 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
/* 366 */   public boolean hasWindowFocus() { throw new RuntimeException("Stub!"); }
/* 367 */   protected void dispatchVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); }
/* 368 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); }
/* 369 */   public void dispatchDisplayHint(int hint) { throw new RuntimeException("Stub!"); }
/* 370 */   protected void onDisplayHint(int hint) { throw new RuntimeException("Stub!"); }
/* 371 */   public void dispatchWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
/* 372 */   protected void onWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
/* 373 */   public void onVisibilityAggregated(boolean isVisible) { throw new RuntimeException("Stub!"); }
/* 374 */   public int getWindowVisibility() { throw new RuntimeException("Stub!"); }
/* 375 */   public void getWindowVisibleDisplayFrame(Rect outRect) { throw new RuntimeException("Stub!"); }
/* 376 */   public void dispatchConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 377 */   protected void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 379 */   public boolean isInTouchMode() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.CapturedViewProperty
/* 381 */   public final Context getContext() { throw new RuntimeException("Stub!"); }
/* 382 */   public boolean onKeyPreIme(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 383 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 384 */   public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 385 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 386 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 387 */   public boolean onKeyShortcut(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 388 */   public boolean onCheckIsTextEditor() { throw new RuntimeException("Stub!"); }
/* 389 */   public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) { throw new RuntimeException("Stub!"); }
/* 390 */   public boolean checkInputConnectionProxy(View view) { throw new RuntimeException("Stub!"); }
/* 391 */   public void createContextMenu(ContextMenu menu) { throw new RuntimeException("Stub!"); }
/* 392 */   protected ContextMenu.ContextMenuInfo getContextMenuInfo() { throw new RuntimeException("Stub!"); }
/* 393 */   protected void onCreateContextMenu(ContextMenu menu) { throw new RuntimeException("Stub!"); }
/* 394 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 395 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 396 */   public boolean onHoverEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 398 */   public boolean isHovered() { throw new RuntimeException("Stub!"); }
/* 399 */   public void setHovered(boolean hovered) { throw new RuntimeException("Stub!"); }
/* 400 */   public void onHoverChanged(boolean hovered) { throw new RuntimeException("Stub!"); }
/* 401 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 402 */   public void cancelLongPress() { throw new RuntimeException("Stub!"); }
/* 403 */   public void setTouchDelegate(TouchDelegate delegate) { throw new RuntimeException("Stub!"); }
/* 404 */   public TouchDelegate getTouchDelegate() { throw new RuntimeException("Stub!"); }
/* 405 */   public final void requestUnbufferedDispatch(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 406 */   public void bringToFront() { throw new RuntimeException("Stub!"); }
/* 407 */   protected void onScrollChanged(int l, int t, int oldl, int oldt) { throw new RuntimeException("Stub!"); }
/* 408 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
/* 409 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 410 */   public final ViewParent getParent() { throw new RuntimeException("Stub!"); }
/* 411 */   public void setScrollX(int value) { throw new RuntimeException("Stub!"); }
/* 412 */   public void setScrollY(int value) { throw new RuntimeException("Stub!"); }
/* 413 */   public final int getScrollX() { throw new RuntimeException("Stub!"); }
/* 414 */   public final int getScrollY() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="layout")
/* 416 */   public final int getWidth() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="layout")
/* 418 */   public final int getHeight() { throw new RuntimeException("Stub!"); }
/* 419 */   public void getDrawingRect(Rect outRect) { throw new RuntimeException("Stub!"); }
/* 420 */   public final int getMeasuredWidth() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="measurement", flagMapping={@ViewDebug.FlagToString(mask=-16777216, equals=16777216, name="MEASURED_STATE_TOO_SMALL")})
/* 422 */   public final int getMeasuredWidthAndState() { throw new RuntimeException("Stub!"); }
/* 423 */   public final int getMeasuredHeight() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="measurement", flagMapping={@ViewDebug.FlagToString(mask=-16777216, equals=16777216, name="MEASURED_STATE_TOO_SMALL")})
/* 425 */   public final int getMeasuredHeightAndState() { throw new RuntimeException("Stub!"); }
/* 426 */   public final int getMeasuredState() { throw new RuntimeException("Stub!"); }
/* 427 */   public android.graphics.Matrix getMatrix() { throw new RuntimeException("Stub!"); }
/* 428 */   public float getCameraDistance() { throw new RuntimeException("Stub!"); }
/* 429 */   public void setCameraDistance(float distance) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 431 */   public float getRotation() { throw new RuntimeException("Stub!"); }
/* 432 */   public void setRotation(float rotation) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 434 */   public float getRotationY() { throw new RuntimeException("Stub!"); }
/* 435 */   public void setRotationY(float rotationY) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 437 */   public float getRotationX() { throw new RuntimeException("Stub!"); }
/* 438 */   public void setRotationX(float rotationX) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 440 */   public float getScaleX() { throw new RuntimeException("Stub!"); }
/* 441 */   public void setScaleX(float scaleX) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 443 */   public float getScaleY() { throw new RuntimeException("Stub!"); }
/* 444 */   public void setScaleY(float scaleY) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 446 */   public float getPivotX() { throw new RuntimeException("Stub!"); }
/* 447 */   public void setPivotX(float pivotX) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 449 */   public float getPivotY() { throw new RuntimeException("Stub!"); }
/* 450 */   public void setPivotY(float pivotY) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 452 */   public float getAlpha() { throw new RuntimeException("Stub!"); }
/* 453 */   public void forceHasOverlappingRendering(boolean hasOverlappingRendering) { throw new RuntimeException("Stub!"); }
/* 454 */   public final boolean getHasOverlappingRendering() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 456 */   public boolean hasOverlappingRendering() { throw new RuntimeException("Stub!"); }
/* 457 */   public void setAlpha(float alpha) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.CapturedViewProperty
/* 459 */   public final int getTop() { throw new RuntimeException("Stub!"); }
/* 460 */   public final void setTop(int top) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.CapturedViewProperty
/* 462 */   public final int getBottom() { throw new RuntimeException("Stub!"); }
/* 463 */   public boolean isDirty() { throw new RuntimeException("Stub!"); }
/* 464 */   public final void setBottom(int bottom) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.CapturedViewProperty
/* 466 */   public final int getLeft() { throw new RuntimeException("Stub!"); }
/* 467 */   public final void setLeft(int left) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.CapturedViewProperty
/* 469 */   public final int getRight() { throw new RuntimeException("Stub!"); }
/* 470 */   public final void setRight(int right) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 472 */   public float getX() { throw new RuntimeException("Stub!"); }
/* 473 */   public void setX(float x) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 475 */   public float getY() { throw new RuntimeException("Stub!"); }
/* 476 */   public void setY(float y) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 478 */   public float getZ() { throw new RuntimeException("Stub!"); }
/* 479 */   public void setZ(float z) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 481 */   public float getElevation() { throw new RuntimeException("Stub!"); }
/* 482 */   public void setElevation(float elevation) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 484 */   public float getTranslationX() { throw new RuntimeException("Stub!"); }
/* 485 */   public void setTranslationX(float translationX) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 487 */   public float getTranslationY() { throw new RuntimeException("Stub!"); }
/* 488 */   public void setTranslationY(float translationY) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 490 */   public float getTranslationZ() { throw new RuntimeException("Stub!"); }
/* 491 */   public void setTranslationZ(float translationZ) { throw new RuntimeException("Stub!"); }
/* 492 */   public android.animation.StateListAnimator getStateListAnimator() { throw new RuntimeException("Stub!"); }
/* 493 */   public void setStateListAnimator(android.animation.StateListAnimator stateListAnimator) { throw new RuntimeException("Stub!"); }
/* 494 */   public final boolean getClipToOutline() { throw new RuntimeException("Stub!"); }
/* 495 */   public void setClipToOutline(boolean clipToOutline) { throw new RuntimeException("Stub!"); }
/* 496 */   public void setOutlineProvider(ViewOutlineProvider provider) { throw new RuntimeException("Stub!"); }
/* 497 */   public ViewOutlineProvider getOutlineProvider() { throw new RuntimeException("Stub!"); }
/* 498 */   public void invalidateOutline() { throw new RuntimeException("Stub!"); }
/* 499 */   public void getHitRect(Rect outRect) { throw new RuntimeException("Stub!"); }
/* 500 */   public void getFocusedRect(Rect r) { throw new RuntimeException("Stub!"); }
/* 501 */   public boolean getGlobalVisibleRect(Rect r, android.graphics.Point globalOffset) { throw new RuntimeException("Stub!"); }
/* 502 */   public final boolean getGlobalVisibleRect(Rect r) { throw new RuntimeException("Stub!"); }
/* 503 */   public final boolean getLocalVisibleRect(Rect r) { throw new RuntimeException("Stub!"); }
/* 504 */   public void offsetTopAndBottom(int offset) { throw new RuntimeException("Stub!"); }
/* 505 */   public void offsetLeftAndRight(int offset) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(deepExport=true, prefix="layout_")
/* 507 */   public ViewGroup.LayoutParams getLayoutParams() { throw new RuntimeException("Stub!"); }
/* 508 */   public void setLayoutParams(ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 509 */   public void scrollTo(int x, int y) { throw new RuntimeException("Stub!"); }
/* 510 */   public void scrollBy(int x, int y) { throw new RuntimeException("Stub!"); }
/* 511 */   protected boolean awakenScrollBars() { throw new RuntimeException("Stub!"); }
/* 512 */   protected boolean awakenScrollBars(int startDelay) { throw new RuntimeException("Stub!"); }
/* 513 */   protected boolean awakenScrollBars(int startDelay, boolean invalidate) { throw new RuntimeException("Stub!"); }
/* 514 */   public void invalidate(Rect dirty) { throw new RuntimeException("Stub!"); }
/* 515 */   public void invalidate(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 516 */   public void invalidate() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 518 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); }
/* 519 */   public android.os.Handler getHandler() { throw new RuntimeException("Stub!"); }
/* 520 */   public boolean post(Runnable action) { throw new RuntimeException("Stub!"); }
/* 521 */   public boolean postDelayed(Runnable action, long delayMillis) { throw new RuntimeException("Stub!"); }
/* 522 */   public void postOnAnimation(Runnable action) { throw new RuntimeException("Stub!"); }
/* 523 */   public void postOnAnimationDelayed(Runnable action, long delayMillis) { throw new RuntimeException("Stub!"); }
/* 524 */   public boolean removeCallbacks(Runnable action) { throw new RuntimeException("Stub!"); }
/* 525 */   public void postInvalidate() { throw new RuntimeException("Stub!"); }
/* 526 */   public void postInvalidate(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 527 */   public void postInvalidateDelayed(long delayMilliseconds) { throw new RuntimeException("Stub!"); }
/* 528 */   public void postInvalidateDelayed(long delayMilliseconds, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 529 */   public void postInvalidateOnAnimation() { throw new RuntimeException("Stub!"); }
/* 530 */   public void postInvalidateOnAnimation(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 531 */   public void computeScroll() { throw new RuntimeException("Stub!"); }
/* 532 */   public boolean isHorizontalFadingEdgeEnabled() { throw new RuntimeException("Stub!"); }
/* 533 */   public void setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) { throw new RuntimeException("Stub!"); }
/* 534 */   public boolean isVerticalFadingEdgeEnabled() { throw new RuntimeException("Stub!"); }
/* 535 */   public void setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) { throw new RuntimeException("Stub!"); }
/* 536 */   protected float getTopFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 537 */   protected float getBottomFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 538 */   protected float getLeftFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 539 */   protected float getRightFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 540 */   public boolean isHorizontalScrollBarEnabled() { throw new RuntimeException("Stub!"); }
/* 541 */   public void setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) { throw new RuntimeException("Stub!"); }
/* 542 */   public boolean isVerticalScrollBarEnabled() { throw new RuntimeException("Stub!"); }
/* 543 */   public void setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) { throw new RuntimeException("Stub!"); }
/* 544 */   public void setScrollbarFadingEnabled(boolean fadeScrollbars) { throw new RuntimeException("Stub!"); }
/* 545 */   public boolean isScrollbarFadingEnabled() { throw new RuntimeException("Stub!"); }
/* 546 */   public int getScrollBarDefaultDelayBeforeFade() { throw new RuntimeException("Stub!"); }
/* 547 */   public void setScrollBarDefaultDelayBeforeFade(int scrollBarDefaultDelayBeforeFade) { throw new RuntimeException("Stub!"); }
/* 548 */   public int getScrollBarFadeDuration() { throw new RuntimeException("Stub!"); }
/* 549 */   public void setScrollBarFadeDuration(int scrollBarFadeDuration) { throw new RuntimeException("Stub!"); }
/* 550 */   public int getScrollBarSize() { throw new RuntimeException("Stub!"); }
/* 551 */   public void setScrollBarSize(int scrollBarSize) { throw new RuntimeException("Stub!"); }
/* 552 */   public void setScrollBarStyle(int style) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(mapping={@ViewDebug.IntToString(from=0, to="INSIDE_OVERLAY"), @ViewDebug.IntToString(from=16777216, to="INSIDE_INSET"), @ViewDebug.IntToString(from=33554432, to="OUTSIDE_OVERLAY"), @ViewDebug.IntToString(from=50331648, to="OUTSIDE_INSET")})
/* 554 */   public int getScrollBarStyle() { throw new RuntimeException("Stub!"); }
/* 555 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
/* 556 */   protected int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); }
/* 557 */   protected int computeHorizontalScrollExtent() { throw new RuntimeException("Stub!"); }
/* 558 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
/* 559 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); }
/* 560 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
/* 561 */   public boolean canScrollHorizontally(int direction) { throw new RuntimeException("Stub!"); }
/* 562 */   public boolean canScrollVertically(int direction) { throw new RuntimeException("Stub!"); }
/* 563 */   protected final void onDrawScrollBars(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 564 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 565 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 566 */   public void onScreenStateChanged(int screenState) { throw new RuntimeException("Stub!"); }
/* 567 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 568 */   public boolean canResolveLayoutDirection() { throw new RuntimeException("Stub!"); }
/* 569 */   public boolean isLayoutDirectionResolved() { throw new RuntimeException("Stub!"); }
/* 570 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 571 */   protected int getWindowAttachCount() { throw new RuntimeException("Stub!"); }
/* 572 */   public android.os.IBinder getWindowToken() { throw new RuntimeException("Stub!"); }
/* 573 */   public WindowId getWindowId() { throw new RuntimeException("Stub!"); }
/* 574 */   public android.os.IBinder getApplicationWindowToken() { throw new RuntimeException("Stub!"); }
/* 575 */   public Display getDisplay() { throw new RuntimeException("Stub!"); }
/* 576 */   public final void cancelPendingInputEvents() { throw new RuntimeException("Stub!"); }
/* 577 */   public void onCancelPendingInputEvents() { throw new RuntimeException("Stub!"); }
/* 578 */   public void saveHierarchyState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 579 */   protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 580 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 581 */   public void restoreHierarchyState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 582 */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 583 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 584 */   public long getDrawingTime() { throw new RuntimeException("Stub!"); }
/* 585 */   public void setDuplicateParentStateEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 586 */   public boolean isDuplicateParentStateEnabled() { throw new RuntimeException("Stub!"); }
/* 587 */   public void setLayerType(int layerType, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
/* 588 */   public void setLayerPaint(android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
/* 589 */   public int getLayerType() { throw new RuntimeException("Stub!"); }
/* 590 */   public void buildLayer() { throw new RuntimeException("Stub!"); }
/* 591 */   public void setDrawingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 593 */   public boolean isDrawingCacheEnabled() { throw new RuntimeException("Stub!"); }
/* 594 */   public android.graphics.Bitmap getDrawingCache() { throw new RuntimeException("Stub!"); }
/* 595 */   public android.graphics.Bitmap getDrawingCache(boolean autoScale) { throw new RuntimeException("Stub!"); }
/* 596 */   public void destroyDrawingCache() { throw new RuntimeException("Stub!"); }
/* 597 */   public void setDrawingCacheBackgroundColor(int color) { throw new RuntimeException("Stub!"); }
/* 598 */   public int getDrawingCacheBackgroundColor() { throw new RuntimeException("Stub!"); }
/* 599 */   public void buildDrawingCache() { throw new RuntimeException("Stub!"); }
/* 600 */   public void buildDrawingCache(boolean autoScale) { throw new RuntimeException("Stub!"); }
/* 601 */   public boolean isInEditMode() { throw new RuntimeException("Stub!"); }
/* 602 */   protected boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); }
/* 603 */   protected int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 604 */   protected int getRightPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 605 */   protected int getTopPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 606 */   protected int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 608 */   public boolean isHardwareAccelerated() { throw new RuntimeException("Stub!"); }
/* 609 */   public void setClipBounds(Rect clipBounds) { throw new RuntimeException("Stub!"); }
/* 610 */   public Rect getClipBounds() { throw new RuntimeException("Stub!"); }
/* 611 */   public boolean getClipBounds(Rect outRect) { throw new RuntimeException("Stub!"); }
/* 612 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 613 */   public ViewOverlay getOverlay() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="drawing")
/* 615 */   public int getSolidColor() { throw new RuntimeException("Stub!"); }
/* 616 */   public boolean isLayoutRequested() { throw new RuntimeException("Stub!"); }
/*     */   
/* 618 */   public void layout(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 619 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 620 */   protected void onFinishInflate() { throw new RuntimeException("Stub!"); }
/* 621 */   public android.content.res.Resources getResources() { throw new RuntimeException("Stub!"); }
/* 622 */   public void invalidateDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 623 */   public void scheduleDrawable(Drawable who, Runnable what, long when) { throw new RuntimeException("Stub!"); }
/* 624 */   public void unscheduleDrawable(Drawable who, Runnable what) { throw new RuntimeException("Stub!"); }
/* 625 */   public void unscheduleDrawable(Drawable who) { throw new RuntimeException("Stub!"); }
/* 626 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); }
/* 627 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); }
/* 628 */   public void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
/* 629 */   public void dispatchDrawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
/* 630 */   public void refreshDrawableState() { throw new RuntimeException("Stub!"); }
/* 631 */   public final int[] getDrawableState() { throw new RuntimeException("Stub!"); }
/* 632 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
/* 633 */   protected static int[] mergeDrawableStates(int[] baseState, int[] additionalState) { throw new RuntimeException("Stub!"); }
/* 634 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
/* 635 */   public void setBackgroundColor(int color) { throw new RuntimeException("Stub!"); }
/* 636 */   public void setBackgroundResource(int resid) { throw new RuntimeException("Stub!"); }
/* 637 */   public void setBackground(Drawable background) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 639 */   public void setBackgroundDrawable(Drawable background) { throw new RuntimeException("Stub!"); }
/* 640 */   public Drawable getBackground() { throw new RuntimeException("Stub!"); }
/* 641 */   public void setBackgroundTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 642 */   public android.content.res.ColorStateList getBackgroundTintList() { throw new RuntimeException("Stub!"); }
/* 643 */   public void setBackgroundTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 644 */   public android.graphics.PorterDuff.Mode getBackgroundTintMode() { throw new RuntimeException("Stub!"); }
/* 645 */   public Drawable getForeground() { throw new RuntimeException("Stub!"); }
/* 646 */   public void setForeground(Drawable foreground) { throw new RuntimeException("Stub!"); }
/* 647 */   public int getForegroundGravity() { throw new RuntimeException("Stub!"); }
/* 648 */   public void setForegroundGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 649 */   public void setForegroundTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 650 */   public android.content.res.ColorStateList getForegroundTintList() { throw new RuntimeException("Stub!"); }
/* 651 */   public void setForegroundTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 652 */   public android.graphics.PorterDuff.Mode getForegroundTintMode() { throw new RuntimeException("Stub!"); }
/* 653 */   public void onDrawForeground(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 654 */   public void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 655 */   public void setPaddingRelative(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); }
/* 656 */   public int getPaddingTop() { throw new RuntimeException("Stub!"); }
/* 657 */   public int getPaddingBottom() { throw new RuntimeException("Stub!"); }
/* 658 */   public int getPaddingLeft() { throw new RuntimeException("Stub!"); }
/* 659 */   public int getPaddingStart() { throw new RuntimeException("Stub!"); }
/* 660 */   public int getPaddingRight() { throw new RuntimeException("Stub!"); }
/* 661 */   public int getPaddingEnd() { throw new RuntimeException("Stub!"); }
/* 662 */   public boolean isPaddingRelative() { throw new RuntimeException("Stub!"); }
/* 663 */   public void setSelected(boolean selected) { throw new RuntimeException("Stub!"); }
/* 664 */   protected void dispatchSetSelected(boolean selected) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 666 */   public boolean isSelected() { throw new RuntimeException("Stub!"); }
/* 667 */   public void setActivated(boolean activated) { throw new RuntimeException("Stub!"); }
/* 668 */   protected void dispatchSetActivated(boolean activated) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 670 */   public boolean isActivated() { throw new RuntimeException("Stub!"); }
/* 671 */   public ViewTreeObserver getViewTreeObserver() { throw new RuntimeException("Stub!"); }
/* 672 */   public View getRootView() { throw new RuntimeException("Stub!"); }
/* 673 */   public void getLocationOnScreen(int[] outLocation) { throw new RuntimeException("Stub!"); }
/* 674 */   public void getLocationInWindow(int[] outLocation) { throw new RuntimeException("Stub!"); }
/* 675 */   public final <T extends View> T findViewById(int id) { throw new RuntimeException("Stub!"); }
/* 676 */   public final <T extends View> T findViewWithTag(Object tag) { throw new RuntimeException("Stub!"); }
/* 677 */   public void setId(int id) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.CapturedViewProperty
/* 679 */   public int getId() { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 681 */   public Object getTag() { throw new RuntimeException("Stub!"); }
/* 682 */   public void setTag(Object tag) { throw new RuntimeException("Stub!"); }
/* 683 */   public Object getTag(int key) { throw new RuntimeException("Stub!"); }
/* 684 */   public void setTag(int key, Object tag) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="layout")
/* 686 */   public int getBaseline() { throw new RuntimeException("Stub!"); }
/* 687 */   public boolean isInLayout() { throw new RuntimeException("Stub!"); }
/* 688 */   public void requestLayout() { throw new RuntimeException("Stub!"); }
/* 689 */   public void forceLayout() { throw new RuntimeException("Stub!"); }
/* 690 */   public final void measure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 691 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 692 */   protected final void setMeasuredDimension(int measuredWidth, int measuredHeight) { throw new RuntimeException("Stub!"); }
/* 693 */   public static int combineMeasuredStates(int curState, int newState) { throw new RuntimeException("Stub!"); }
/* 694 */   public static int resolveSize(int size, int measureSpec) { throw new RuntimeException("Stub!"); }
/* 695 */   public static int resolveSizeAndState(int size, int measureSpec, int childMeasuredState) { throw new RuntimeException("Stub!"); }
/* 696 */   public static int getDefaultSize(int size, int measureSpec) { throw new RuntimeException("Stub!"); }
/* 697 */   protected int getSuggestedMinimumHeight() { throw new RuntimeException("Stub!"); }
/* 698 */   protected int getSuggestedMinimumWidth() { throw new RuntimeException("Stub!"); }
/* 699 */   public int getMinimumHeight() { throw new RuntimeException("Stub!"); }
/* 700 */   public void setMinimumHeight(int minHeight) { throw new RuntimeException("Stub!"); }
/* 701 */   public int getMinimumWidth() { throw new RuntimeException("Stub!"); }
/* 702 */   public void setMinimumWidth(int minWidth) { throw new RuntimeException("Stub!"); }
/* 703 */   public android.view.animation.Animation getAnimation() { throw new RuntimeException("Stub!"); }
/* 704 */   public void startAnimation(android.view.animation.Animation animation) { throw new RuntimeException("Stub!"); }
/* 705 */   public void clearAnimation() { throw new RuntimeException("Stub!"); }
/* 706 */   public void setAnimation(android.view.animation.Animation animation) { throw new RuntimeException("Stub!"); }
/* 707 */   protected void onAnimationStart() { throw new RuntimeException("Stub!"); }
/* 708 */   protected void onAnimationEnd() { throw new RuntimeException("Stub!"); }
/* 709 */   protected boolean onSetAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/* 710 */   public void playSoundEffect(int soundConstant) { throw new RuntimeException("Stub!"); }
/* 711 */   public boolean performHapticFeedback(int feedbackConstant) { throw new RuntimeException("Stub!"); }
/* 712 */   public boolean performHapticFeedback(int feedbackConstant, int flags) { throw new RuntimeException("Stub!"); }
/* 713 */   public void setSystemUiVisibility(int visibility) { throw new RuntimeException("Stub!"); }
/* 714 */   public int getSystemUiVisibility() { throw new RuntimeException("Stub!"); }
/* 715 */   public int getWindowSystemUiVisibility() { throw new RuntimeException("Stub!"); }
/* 716 */   public void onWindowSystemUiVisibilityChanged(int visible) { throw new RuntimeException("Stub!"); }
/* 717 */   public void dispatchWindowSystemUiVisiblityChanged(int visible) { throw new RuntimeException("Stub!"); }
/* 718 */   public void setOnSystemUiVisibilityChangeListener(OnSystemUiVisibilityChangeListener l) { throw new RuntimeException("Stub!"); }
/* 719 */   public void dispatchSystemUiVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 721 */   public final boolean startDrag(android.content.ClipData data, DragShadowBuilder shadowBuilder, Object myLocalState, int flags) { throw new RuntimeException("Stub!"); }
/* 722 */   public final boolean startDragAndDrop(android.content.ClipData data, DragShadowBuilder shadowBuilder, Object myLocalState, int flags) { throw new RuntimeException("Stub!"); }
/* 723 */   public final void cancelDragAndDrop() { throw new RuntimeException("Stub!"); }
/* 724 */   public final void updateDragShadow(DragShadowBuilder shadowBuilder) { throw new RuntimeException("Stub!"); }
/* 725 */   public boolean onDragEvent(DragEvent event) { throw new RuntimeException("Stub!"); }
/* 726 */   public boolean dispatchDragEvent(DragEvent event) { throw new RuntimeException("Stub!"); }
/* 727 */   public static View inflate(Context context, int resource, ViewGroup root) { throw new RuntimeException("Stub!"); }
/*     */   
/* 729 */   protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) { throw new RuntimeException("Stub!"); }
/* 730 */   protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); }
/* 731 */   public int getOverScrollMode() { throw new RuntimeException("Stub!"); }
/* 732 */   public void setOverScrollMode(int overScrollMode) { throw new RuntimeException("Stub!"); }
/* 733 */   public void setNestedScrollingEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 734 */   public boolean isNestedScrollingEnabled() { throw new RuntimeException("Stub!"); }
/* 735 */   public boolean startNestedScroll(int axes) { throw new RuntimeException("Stub!"); }
/* 736 */   public void stopNestedScroll() { throw new RuntimeException("Stub!"); }
/* 737 */   public boolean hasNestedScrollingParent() { throw new RuntimeException("Stub!"); }
/* 738 */   public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) { throw new RuntimeException("Stub!"); }
/* 739 */   public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) { throw new RuntimeException("Stub!"); }
/* 740 */   public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) { throw new RuntimeException("Stub!"); }
/* 741 */   public boolean dispatchNestedPreFling(float velocityX, float velocityY) { throw new RuntimeException("Stub!"); }
/* 742 */   public void setTextDirection(int textDirection) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="text", mapping={@ViewDebug.IntToString(from=0, to="INHERIT"), @ViewDebug.IntToString(from=1, to="FIRST_STRONG"), @ViewDebug.IntToString(from=2, to="ANY_RTL"), @ViewDebug.IntToString(from=3, to="LTR"), @ViewDebug.IntToString(from=4, to="RTL"), @ViewDebug.IntToString(from=5, to="LOCALE"), @ViewDebug.IntToString(from=6, to="FIRST_STRONG_LTR"), @ViewDebug.IntToString(from=7, to="FIRST_STRONG_RTL")})
/* 744 */   public int getTextDirection() { throw new RuntimeException("Stub!"); }
/* 745 */   public boolean canResolveTextDirection() { throw new RuntimeException("Stub!"); }
/* 746 */   public boolean isTextDirectionResolved() { throw new RuntimeException("Stub!"); }
/* 747 */   public void setTextAlignment(int textAlignment) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty(category="text", mapping={@ViewDebug.IntToString(from=0, to="INHERIT"), @ViewDebug.IntToString(from=1, to="GRAVITY"), @ViewDebug.IntToString(from=2, to="TEXT_START"), @ViewDebug.IntToString(from=3, to="TEXT_END"), @ViewDebug.IntToString(from=4, to="CENTER"), @ViewDebug.IntToString(from=5, to="VIEW_START"), @ViewDebug.IntToString(from=6, to="VIEW_END")})
/* 749 */   public int getTextAlignment() { throw new RuntimeException("Stub!"); }
/* 750 */   public boolean canResolveTextAlignment() { throw new RuntimeException("Stub!"); }
/* 751 */   public boolean isTextAlignmentResolved() { throw new RuntimeException("Stub!"); }
/* 752 */   public static int generateViewId() { throw new RuntimeException("Stub!"); }
/* 753 */   public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) { throw new RuntimeException("Stub!"); }
/* 754 */   public void setPointerIcon(PointerIcon pointerIcon) { throw new RuntimeException("Stub!"); }
/* 755 */   public PointerIcon getPointerIcon() { throw new RuntimeException("Stub!"); }
/* 756 */   public boolean hasPointerCapture() { throw new RuntimeException("Stub!"); }
/* 757 */   public void requestPointerCapture() { throw new RuntimeException("Stub!"); }
/* 758 */   public void releasePointerCapture() { throw new RuntimeException("Stub!"); }
/* 759 */   public void onPointerCaptureChange(boolean hasCapture) { throw new RuntimeException("Stub!"); }
/* 760 */   public void dispatchPointerCaptureChanged(boolean hasCapture) { throw new RuntimeException("Stub!"); }
/* 761 */   public boolean onCapturedPointerEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 762 */   public void setOnCapturedPointerListener(OnCapturedPointerListener l) { throw new RuntimeException("Stub!"); }
/* 763 */   public ViewPropertyAnimator animate() { throw new RuntimeException("Stub!"); }
/* 764 */   public final void setTransitionName(String transitionName) { throw new RuntimeException("Stub!"); }
/*     */   @ViewDebug.ExportedProperty
/* 766 */   public String getTransitionName() { throw new RuntimeException("Stub!"); }
/* 767 */   public void setTooltipText(CharSequence tooltipText) { throw new RuntimeException("Stub!"); }
/* 768 */   public CharSequence getTooltipText() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 801 */   protected static final int[] EMPTY_STATE_SET = null;
/* 802 */   protected static final int[] ENABLED_FOCUSED_SELECTED_STATE_SET = null;
/* 803 */   protected static final int[] ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 804 */   protected static final int[] ENABLED_FOCUSED_STATE_SET = null;
/* 805 */   protected static final int[] ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 806 */   protected static final int[] ENABLED_SELECTED_STATE_SET = null;
/* 807 */   protected static final int[] ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 808 */   protected static final int[] ENABLED_STATE_SET = null;
/* 809 */   protected static final int[] ENABLED_WINDOW_FOCUSED_STATE_SET = null;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 816 */   protected static final int[] FOCUSED_SELECTED_STATE_SET = null;
/* 817 */   protected static final int[] FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 818 */   protected static final int[] FOCUSED_STATE_SET = null;
/* 819 */   protected static final int[] FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 855 */   protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET = null;
/* 856 */   protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 857 */   protected static final int[] PRESSED_ENABLED_FOCUSED_STATE_SET = null;
/* 858 */   protected static final int[] PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 859 */   protected static final int[] PRESSED_ENABLED_SELECTED_STATE_SET = null;
/* 860 */   protected static final int[] PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 861 */   protected static final int[] PRESSED_ENABLED_STATE_SET = null;
/* 862 */   protected static final int[] PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET = null;
/* 863 */   protected static final int[] PRESSED_FOCUSED_SELECTED_STATE_SET = null;
/* 864 */   protected static final int[] PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 865 */   protected static final int[] PRESSED_FOCUSED_STATE_SET = null;
/* 866 */   protected static final int[] PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 867 */   protected static final int[] PRESSED_SELECTED_STATE_SET = null;
/* 868 */   protected static final int[] PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 869 */   protected static final int[] PRESSED_STATE_SET = null;
/* 870 */   protected static final int[] PRESSED_WINDOW_FOCUSED_STATE_SET = null;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 894 */   protected static final int[] SELECTED_STATE_SET = null;
/* 895 */   protected static final int[] SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 933 */   protected static final int[] WINDOW_FOCUSED_STATE_SET = null;
/*     */   
/*     */ 
/*     */ 
/* 937 */   public static final Property<View, Float> ALPHA = null; public static final Property<View, Float> ROTATION = null; public static final Property<View, Float> ROTATION_X = null; public static final Property<View, Float> ROTATION_Y = null; public static final Property<View, Float> SCALE_X = null; public static final Property<View, Float> SCALE_Y = null; public static final Property<View, Float> TRANSLATION_X = null; public static final Property<View, Float> TRANSLATION_Y = null; public static final Property<View, Float> TRANSLATION_Z = null; public static final Property<View, Float> X = null; public static final Property<View, Float> Y = null; public static final Property<View, Float> Z = null;
/*     */   public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
/*     */   public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
/*     */   public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
/*     */   public static final int AUTOFILL_FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 1;
/*     */   public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE = "creditCardExpirationDate";
/*     */   public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY = "creditCardExpirationDay";
/*     */   public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH = "creditCardExpirationMonth";
/*     */   public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR = "creditCardExpirationYear";
/*     */   public static final String AUTOFILL_HINT_CREDIT_CARD_NUMBER = "creditCardNumber";
/*     */   public static final String AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE = "creditCardSecurityCode";
/*     */   public static final String AUTOFILL_HINT_EMAIL_ADDRESS = "emailAddress";
/*     */   public static final String AUTOFILL_HINT_NAME = "name";
/*     */   public static final String AUTOFILL_HINT_PASSWORD = "password";
/*     */   public static final String AUTOFILL_HINT_PHONE = "phone";
/*     */   public static final String AUTOFILL_HINT_POSTAL_ADDRESS = "postalAddress";
/*     */   public static final String AUTOFILL_HINT_POSTAL_CODE = "postalCode";
/*     */   public static final String AUTOFILL_HINT_USERNAME = "username";
/*     */   public static final int AUTOFILL_TYPE_DATE = 4;
/*     */   public static final int AUTOFILL_TYPE_LIST = 3;
/*     */   public static final int AUTOFILL_TYPE_NONE = 0;
/*     */   public static final int AUTOFILL_TYPE_TEXT = 1;
/*     */   public static final int AUTOFILL_TYPE_TOGGLE = 2;
/*     */   public static final int DRAG_FLAG_GLOBAL = 256;
/*     */   public static final int DRAG_FLAG_GLOBAL_PERSISTABLE_URI_PERMISSION = 64;
/*     */   public static final int DRAG_FLAG_GLOBAL_PREFIX_URI_PERMISSION = 128;
/*     */   public static final int DRAG_FLAG_GLOBAL_URI_READ = 1;
/*     */   public static final int DRAG_FLAG_GLOBAL_URI_WRITE = 2;
/*     */   public static final int DRAG_FLAG_OPAQUE = 512;
/*     */   public static final int DRAWING_CACHE_QUALITY_AUTO = 0;
/*     */   public static final int DRAWING_CACHE_QUALITY_HIGH = 1048576;
/*     */   public static final int DRAWING_CACHE_QUALITY_LOW = 524288;
/*     */   public static final int FIND_VIEWS_WITH_CONTENT_DESCRIPTION = 2;
/*     */   public static final int FIND_VIEWS_WITH_TEXT = 1;
/*     */   public static final int FOCUSABLE = 1;
/*     */   public static final int FOCUSABLES_ALL = 0;
/*     */   public static final int FOCUSABLES_TOUCH_MODE = 1;
/*     */   public static final int FOCUSABLE_AUTO = 16;
/*     */   public static final int FOCUS_BACKWARD = 1;
/*     */   public static final int FOCUS_DOWN = 130;
/*     */   public static final int FOCUS_FORWARD = 2;
/*     */   public static final int FOCUS_LEFT = 17;
/*     */   public static final int FOCUS_RIGHT = 66;
/*     */   public static final int FOCUS_UP = 33;
/*     */   public static final int GONE = 8;
/*     */   public static final int HAPTIC_FEEDBACK_ENABLED = 268435456;
/*     */   public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
/*     */   public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
/*     */   public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
/*     */   public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
/*     */   public static final int IMPORTANT_FOR_AUTOFILL_AUTO = 0;
/*     */   public static final int IMPORTANT_FOR_AUTOFILL_NO = 2;
/*     */   public static final int IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS = 8;
/*     */   public static final int IMPORTANT_FOR_AUTOFILL_YES = 1;
/*     */   public static final int IMPORTANT_FOR_AUTOFILL_YES_EXCLUDE_DESCENDANTS = 4;
/*     */   public static final int INVISIBLE = 4;
/*     */   public static final int KEEP_SCREEN_ON = 67108864;
/*     */   public static final int LAYER_TYPE_HARDWARE = 2;
/*     */   public static final int LAYER_TYPE_NONE = 0;
/*     */   public static final int LAYER_TYPE_SOFTWARE = 1;
/*     */   public static final int LAYOUT_DIRECTION_INHERIT = 2;
/*     */   public static final int LAYOUT_DIRECTION_LOCALE = 3;
/*     */   public static final int LAYOUT_DIRECTION_LTR = 0;
/*     */   public static final int LAYOUT_DIRECTION_RTL = 1;
/*     */   public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
/*     */   public static final int MEASURED_SIZE_MASK = 16777215;
/*     */   public static final int MEASURED_STATE_MASK = -16777216;
/*     */   public static final int MEASURED_STATE_TOO_SMALL = 16777216;
/*     */   public static final int NOT_FOCUSABLE = 0;
/*     */   public static final int NO_ID = -1;
/*     */   public static final int OVER_SCROLL_ALWAYS = 0;
/*     */   public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
/*     */   public static final int OVER_SCROLL_NEVER = 2;
/*     */   public static final int SCREEN_STATE_OFF = 0;
/*     */   public static final int SCREEN_STATE_ON = 1;
/*     */   public static final int SCROLLBARS_INSIDE_INSET = 16777216;
/*     */   public static final int SCROLLBARS_INSIDE_OVERLAY = 0;
/*     */   public static final int SCROLLBARS_OUTSIDE_INSET = 50331648;
/*     */   public static final int SCROLLBARS_OUTSIDE_OVERLAY = 33554432;
/*     */   public static final int SCROLLBAR_POSITION_DEFAULT = 0;
/*     */   public static final int SCROLLBAR_POSITION_LEFT = 1;
/*     */   public static final int SCROLLBAR_POSITION_RIGHT = 2;
/*     */   public static final int SCROLL_AXIS_HORIZONTAL = 1;
/*     */   public static final int SCROLL_AXIS_NONE = 0;
/*     */   public static final int SCROLL_AXIS_VERTICAL = 2;
/*     */   public static final int SCROLL_INDICATOR_BOTTOM = 2;
/*     */   public static final int SCROLL_INDICATOR_END = 32;
/*     */   public static final int SCROLL_INDICATOR_LEFT = 4;
/*     */   public static final int SCROLL_INDICATOR_RIGHT = 8;
/*     */   public static final int SCROLL_INDICATOR_START = 16;
/*     */   public static final int SCROLL_INDICATOR_TOP = 1;
/*     */   public static final int SOUND_EFFECTS_ENABLED = 134217728;
/*     */   @Deprecated
/*     */   public static final int STATUS_BAR_HIDDEN = 1;
/*     */   @Deprecated
/*     */   public static final int STATUS_BAR_VISIBLE = 0;
/*     */   public static final int SYSTEM_UI_FLAG_FULLSCREEN = 4;
/*     */   public static final int SYSTEM_UI_FLAG_HIDE_NAVIGATION = 2;
/*     */   public static final int SYSTEM_UI_FLAG_IMMERSIVE = 2048;
/*     */   public static final int SYSTEM_UI_FLAG_IMMERSIVE_STICKY = 4096;
/*     */   public static final int SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN = 1024;
/*     */   public static final int SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION = 512;
/*     */   public static final int SYSTEM_UI_FLAG_LAYOUT_STABLE = 256;
/*     */   public static final int SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR = 16;
/*     */   public static final int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = 8192;
/*     */   public static final int SYSTEM_UI_FLAG_LOW_PROFILE = 1;
/*     */   public static final int SYSTEM_UI_FLAG_VISIBLE = 0;
/*     */   public static final int SYSTEM_UI_LAYOUT_FLAGS = 1536;
/*     */   public static final int TEXT_ALIGNMENT_CENTER = 4;
/*     */   public static final int TEXT_ALIGNMENT_GRAVITY = 1;
/*     */   public static final int TEXT_ALIGNMENT_INHERIT = 0;
/*     */   public static final int TEXT_ALIGNMENT_TEXT_END = 3;
/*     */   public static final int TEXT_ALIGNMENT_TEXT_START = 2;
/*     */   public static final int TEXT_ALIGNMENT_VIEW_END = 6;
/*     */   public static final int TEXT_ALIGNMENT_VIEW_START = 5;
/*     */   public static final int TEXT_DIRECTION_ANY_RTL = 2;
/*     */   public static final int TEXT_DIRECTION_FIRST_STRONG = 1;
/*     */   public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 6;
/*     */   public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 7;
/*     */   public static final int TEXT_DIRECTION_INHERIT = 0;
/*     */   public static final int TEXT_DIRECTION_LOCALE = 5;
/*     */   public static final int TEXT_DIRECTION_LTR = 3;
/*     */   public static final int TEXT_DIRECTION_RTL = 4;
/*     */   protected static final String VIEW_LOG_TAG = "View";
/*     */   public static final int VISIBLE = 0;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\View.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */