/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.ColorStateList;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.Typeface;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Bundle;
/*     */ import android.os.LocaleList;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ActionMode.Callback;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ 
/*     */ @RemoteViews.RemoteView
/*     */ public class TextView extends View implements android.view.ViewTreeObserver.OnPreDrawListener
/*     */ {
/*     */   public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
/*     */   public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
/*     */   
/*     */   public static abstract interface OnEditorActionListener
/*     */   {
/*     */     public abstract boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent);
/*     */   }
/*     */   
/*     */   public static enum BufferType
/*     */   {
/*  29 */     EDITABLE, 
/*  30 */     NORMAL, 
/*  31 */     SPANNABLE;
/*     */     
/*     */     private BufferType() {}
/*     */   }
/*     */   
/*  36 */   public static class SavedState extends android.view.View.BaseSavedState { SavedState() { super();throw new RuntimeException("Stub!"); }
/*  37 */     public void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*  38 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*  41 */     public static final android.os.Parcelable.Creator<SavedState> CREATOR = null; }
/*     */   
/*  43 */   public TextView(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  44 */   public TextView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  45 */   public TextView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*     */   
/*  47 */   public TextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  48 */   public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) { throw new RuntimeException("Stub!"); }
/*  49 */   public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) { throw new RuntimeException("Stub!"); }
/*  50 */   public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) { throw new RuntimeException("Stub!"); }
/*  51 */   public int getAutoSizeTextType() { throw new RuntimeException("Stub!"); }
/*  52 */   public int getAutoSizeStepGranularity() { throw new RuntimeException("Stub!"); }
/*  53 */   public int getAutoSizeMinTextSize() { throw new RuntimeException("Stub!"); }
/*  54 */   public int getAutoSizeMaxTextSize() { throw new RuntimeException("Stub!"); }
/*  55 */   public int[] getAutoSizeTextAvailableSizes() { throw new RuntimeException("Stub!"); }
/*  56 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*  57 */   public void setTypeface(Typeface tf, int style) { throw new RuntimeException("Stub!"); }
/*  58 */   protected boolean getDefaultEditable() { throw new RuntimeException("Stub!"); }
/*  59 */   protected android.text.method.MovementMethod getDefaultMovementMethod() { throw new RuntimeException("Stub!"); }
/*     */   @android.view.ViewDebug.CapturedViewProperty
/*  61 */   public CharSequence getText() { throw new RuntimeException("Stub!"); }
/*  62 */   public int length() { throw new RuntimeException("Stub!"); }
/*  63 */   public android.text.Editable getEditableText() { throw new RuntimeException("Stub!"); }
/*  64 */   public int getLineHeight() { throw new RuntimeException("Stub!"); }
/*  65 */   public final android.text.Layout getLayout() { throw new RuntimeException("Stub!"); }
/*  66 */   public final android.text.method.KeyListener getKeyListener() { throw new RuntimeException("Stub!"); }
/*  67 */   public void setKeyListener(android.text.method.KeyListener input) { throw new RuntimeException("Stub!"); }
/*  68 */   public final android.text.method.MovementMethod getMovementMethod() { throw new RuntimeException("Stub!"); }
/*  69 */   public final void setMovementMethod(android.text.method.MovementMethod movement) { throw new RuntimeException("Stub!"); }
/*  70 */   public final android.text.method.TransformationMethod getTransformationMethod() { throw new RuntimeException("Stub!"); }
/*  71 */   public final void setTransformationMethod(android.text.method.TransformationMethod method) { throw new RuntimeException("Stub!"); }
/*  72 */   public int getCompoundPaddingTop() { throw new RuntimeException("Stub!"); }
/*  73 */   public int getCompoundPaddingBottom() { throw new RuntimeException("Stub!"); }
/*  74 */   public int getCompoundPaddingLeft() { throw new RuntimeException("Stub!"); }
/*  75 */   public int getCompoundPaddingRight() { throw new RuntimeException("Stub!"); }
/*  76 */   public int getCompoundPaddingStart() { throw new RuntimeException("Stub!"); }
/*  77 */   public int getCompoundPaddingEnd() { throw new RuntimeException("Stub!"); }
/*  78 */   public int getExtendedPaddingTop() { throw new RuntimeException("Stub!"); }
/*  79 */   public int getExtendedPaddingBottom() { throw new RuntimeException("Stub!"); }
/*  80 */   public int getTotalPaddingLeft() { throw new RuntimeException("Stub!"); }
/*  81 */   public int getTotalPaddingRight() { throw new RuntimeException("Stub!"); }
/*  82 */   public int getTotalPaddingStart() { throw new RuntimeException("Stub!"); }
/*  83 */   public int getTotalPaddingEnd() { throw new RuntimeException("Stub!"); }
/*  84 */   public int getTotalPaddingTop() { throw new RuntimeException("Stub!"); }
/*  85 */   public int getTotalPaddingBottom() { throw new RuntimeException("Stub!"); }
/*  86 */   public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) { throw new RuntimeException("Stub!"); }
/*  87 */   public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/*  88 */   public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) { throw new RuntimeException("Stub!"); }
/*  89 */   public void setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) { throw new RuntimeException("Stub!"); }
/*  90 */   public void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); }
/*  91 */   public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) { throw new RuntimeException("Stub!"); }
/*  92 */   public Drawable[] getCompoundDrawables() { throw new RuntimeException("Stub!"); }
/*  93 */   public Drawable[] getCompoundDrawablesRelative() { throw new RuntimeException("Stub!"); }
/*  94 */   public void setCompoundDrawablePadding(int pad) { throw new RuntimeException("Stub!"); }
/*  95 */   public int getCompoundDrawablePadding() { throw new RuntimeException("Stub!"); }
/*  96 */   public void setCompoundDrawableTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/*  97 */   public ColorStateList getCompoundDrawableTintList() { throw new RuntimeException("Stub!"); }
/*  98 */   public void setCompoundDrawableTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/*  99 */   public android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() { throw new RuntimeException("Stub!"); }
/* 100 */   public void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 101 */   public void setPaddingRelative(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); }
/* 102 */   public final int getAutoLinkMask() { throw new RuntimeException("Stub!"); }
/*     */   
/* 104 */   public void setTextAppearance(int resId) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 106 */   public void setTextAppearance(Context context, int resId) { throw new RuntimeException("Stub!"); }
/* 107 */   public java.util.Locale getTextLocale() { throw new RuntimeException("Stub!"); }
/* 108 */   public LocaleList getTextLocales() { throw new RuntimeException("Stub!"); }
/* 109 */   public void setTextLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 110 */   public void setTextLocales(LocaleList locales) { throw new RuntimeException("Stub!"); }
/* 111 */   protected void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/*     */   @android.view.ViewDebug.ExportedProperty(category="text")
/* 113 */   public float getTextSize() { throw new RuntimeException("Stub!"); }
/* 114 */   public void setTextSize(float size) { throw new RuntimeException("Stub!"); }
/* 115 */   public void setTextSize(int unit, float size) { throw new RuntimeException("Stub!"); }
/* 116 */   public float getTextScaleX() { throw new RuntimeException("Stub!"); }
/* 117 */   public void setTextScaleX(float size) { throw new RuntimeException("Stub!"); }
/* 118 */   public void setTypeface(Typeface tf) { throw new RuntimeException("Stub!"); }
/* 119 */   public Typeface getTypeface() { throw new RuntimeException("Stub!"); }
/* 120 */   public void setElegantTextHeight(boolean elegant) { throw new RuntimeException("Stub!"); }
/* 121 */   public float getLetterSpacing() { throw new RuntimeException("Stub!"); }
/* 122 */   public void setLetterSpacing(float letterSpacing) { throw new RuntimeException("Stub!"); }
/* 123 */   public String getFontFeatureSettings() { throw new RuntimeException("Stub!"); }
/* 124 */   public String getFontVariationSettings() { throw new RuntimeException("Stub!"); }
/* 125 */   public void setBreakStrategy(int breakStrategy) { throw new RuntimeException("Stub!"); }
/* 126 */   public int getBreakStrategy() { throw new RuntimeException("Stub!"); }
/* 127 */   public void setHyphenationFrequency(int hyphenationFrequency) { throw new RuntimeException("Stub!"); }
/* 128 */   public int getHyphenationFrequency() { throw new RuntimeException("Stub!"); }
/* 129 */   public void setJustificationMode(int justificationMode) { throw new RuntimeException("Stub!"); }
/* 130 */   public int getJustificationMode() { throw new RuntimeException("Stub!"); }
/* 131 */   public void setFontFeatureSettings(String fontFeatureSettings) { throw new RuntimeException("Stub!"); }
/* 132 */   public boolean setFontVariationSettings(String fontVariationSettings) { throw new RuntimeException("Stub!"); }
/* 133 */   public void setTextColor(int color) { throw new RuntimeException("Stub!"); }
/* 134 */   public void setTextColor(ColorStateList colors) { throw new RuntimeException("Stub!"); }
/* 135 */   public final ColorStateList getTextColors() { throw new RuntimeException("Stub!"); }
/* 136 */   public final int getCurrentTextColor() { throw new RuntimeException("Stub!"); }
/* 137 */   public void setHighlightColor(int color) { throw new RuntimeException("Stub!"); }
/* 138 */   public int getHighlightColor() { throw new RuntimeException("Stub!"); }
/* 139 */   public final void setShowSoftInputOnFocus(boolean show) { throw new RuntimeException("Stub!"); }
/* 140 */   public final boolean getShowSoftInputOnFocus() { throw new RuntimeException("Stub!"); }
/* 141 */   public void setShadowLayer(float radius, float dx, float dy, int color) { throw new RuntimeException("Stub!"); }
/* 142 */   public float getShadowRadius() { throw new RuntimeException("Stub!"); }
/* 143 */   public float getShadowDx() { throw new RuntimeException("Stub!"); }
/* 144 */   public float getShadowDy() { throw new RuntimeException("Stub!"); }
/* 145 */   public int getShadowColor() { throw new RuntimeException("Stub!"); }
/* 146 */   public android.text.TextPaint getPaint() { throw new RuntimeException("Stub!"); }
/* 147 */   public final void setAutoLinkMask(int mask) { throw new RuntimeException("Stub!"); }
/* 148 */   public final void setLinksClickable(boolean whether) { throw new RuntimeException("Stub!"); }
/* 149 */   public final boolean getLinksClickable() { throw new RuntimeException("Stub!"); }
/* 150 */   public android.text.style.URLSpan[] getUrls() { throw new RuntimeException("Stub!"); }
/* 151 */   public final void setHintTextColor(int color) { throw new RuntimeException("Stub!"); }
/* 152 */   public final void setHintTextColor(ColorStateList colors) { throw new RuntimeException("Stub!"); }
/* 153 */   public final ColorStateList getHintTextColors() { throw new RuntimeException("Stub!"); }
/* 154 */   public final int getCurrentHintTextColor() { throw new RuntimeException("Stub!"); }
/* 155 */   public final void setLinkTextColor(int color) { throw new RuntimeException("Stub!"); }
/* 156 */   public final void setLinkTextColor(ColorStateList colors) { throw new RuntimeException("Stub!"); }
/* 157 */   public final ColorStateList getLinkTextColors() { throw new RuntimeException("Stub!"); }
/* 158 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 159 */   public int getGravity() { throw new RuntimeException("Stub!"); }
/* 160 */   public int getPaintFlags() { throw new RuntimeException("Stub!"); }
/* 161 */   public void setPaintFlags(int flags) { throw new RuntimeException("Stub!"); }
/* 162 */   public void setHorizontallyScrolling(boolean whether) { throw new RuntimeException("Stub!"); }
/* 163 */   public void setMinLines(int minLines) { throw new RuntimeException("Stub!"); }
/* 164 */   public int getMinLines() { throw new RuntimeException("Stub!"); }
/* 165 */   public void setMinHeight(int minPixels) { throw new RuntimeException("Stub!"); }
/* 166 */   public int getMinHeight() { throw new RuntimeException("Stub!"); }
/* 167 */   public void setMaxLines(int maxLines) { throw new RuntimeException("Stub!"); }
/* 168 */   public int getMaxLines() { throw new RuntimeException("Stub!"); }
/* 169 */   public void setMaxHeight(int maxPixels) { throw new RuntimeException("Stub!"); }
/* 170 */   public int getMaxHeight() { throw new RuntimeException("Stub!"); }
/* 171 */   public void setLines(int lines) { throw new RuntimeException("Stub!"); }
/* 172 */   public void setHeight(int pixels) { throw new RuntimeException("Stub!"); }
/* 173 */   public void setMinEms(int minEms) { throw new RuntimeException("Stub!"); }
/* 174 */   public int getMinEms() { throw new RuntimeException("Stub!"); }
/* 175 */   public void setMinWidth(int minPixels) { throw new RuntimeException("Stub!"); }
/* 176 */   public int getMinWidth() { throw new RuntimeException("Stub!"); }
/* 177 */   public void setMaxEms(int maxEms) { throw new RuntimeException("Stub!"); }
/* 178 */   public int getMaxEms() { throw new RuntimeException("Stub!"); }
/* 179 */   public void setMaxWidth(int maxPixels) { throw new RuntimeException("Stub!"); }
/* 180 */   public int getMaxWidth() { throw new RuntimeException("Stub!"); }
/* 181 */   public void setEms(int ems) { throw new RuntimeException("Stub!"); }
/* 182 */   public void setWidth(int pixels) { throw new RuntimeException("Stub!"); }
/* 183 */   public void setLineSpacing(float add, float mult) { throw new RuntimeException("Stub!"); }
/* 184 */   public float getLineSpacingMultiplier() { throw new RuntimeException("Stub!"); }
/* 185 */   public float getLineSpacingExtra() { throw new RuntimeException("Stub!"); }
/* 186 */   public final void append(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 187 */   public void append(CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); }
/* 188 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); }
/* 189 */   public void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
/* 190 */   public android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 191 */   public void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
/* 192 */   public void setFreezesText(boolean freezesText) { throw new RuntimeException("Stub!"); }
/* 193 */   public boolean getFreezesText() { throw new RuntimeException("Stub!"); }
/* 194 */   public final void setEditableFactory(android.text.Editable.Factory factory) { throw new RuntimeException("Stub!"); }
/* 195 */   public final void setSpannableFactory(android.text.Spannable.Factory factory) { throw new RuntimeException("Stub!"); }
/* 196 */   public final void setText(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 197 */   public final void setTextKeepState(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 198 */   public void setText(CharSequence text, BufferType type) { throw new RuntimeException("Stub!"); }
/* 199 */   public final void setText(char[] text, int start, int len) { throw new RuntimeException("Stub!"); }
/* 200 */   public final void setTextKeepState(CharSequence text, BufferType type) { throw new RuntimeException("Stub!"); }
/* 201 */   public final void setText(int resid) { throw new RuntimeException("Stub!"); }
/* 202 */   public final void setText(int resid, BufferType type) { throw new RuntimeException("Stub!"); }
/* 203 */   public final void setHint(CharSequence hint) { throw new RuntimeException("Stub!"); }
/* 204 */   public final void setHint(int resid) { throw new RuntimeException("Stub!"); }
/*     */   @android.view.ViewDebug.CapturedViewProperty
/* 206 */   public CharSequence getHint() { throw new RuntimeException("Stub!"); }
/* 207 */   public void setInputType(int type) { throw new RuntimeException("Stub!"); }
/* 208 */   public void setRawInputType(int type) { throw new RuntimeException("Stub!"); }
/* 209 */   public int getInputType() { throw new RuntimeException("Stub!"); }
/* 210 */   public void setImeOptions(int imeOptions) { throw new RuntimeException("Stub!"); }
/* 211 */   public int getImeOptions() { throw new RuntimeException("Stub!"); }
/* 212 */   public void setImeActionLabel(CharSequence label, int actionId) { throw new RuntimeException("Stub!"); }
/* 213 */   public CharSequence getImeActionLabel() { throw new RuntimeException("Stub!"); }
/* 214 */   public int getImeActionId() { throw new RuntimeException("Stub!"); }
/* 215 */   public void setOnEditorActionListener(OnEditorActionListener l) { throw new RuntimeException("Stub!"); }
/* 216 */   public void onEditorAction(int actionCode) { throw new RuntimeException("Stub!"); }
/* 217 */   public void setPrivateImeOptions(String type) { throw new RuntimeException("Stub!"); }
/* 218 */   public String getPrivateImeOptions() { throw new RuntimeException("Stub!"); }
/* 219 */   public void setInputExtras(int xmlResId) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 220 */   public Bundle getInputExtras(boolean create) { throw new RuntimeException("Stub!"); }
/* 221 */   public void setImeHintLocales(LocaleList hintLocales) { throw new RuntimeException("Stub!"); }
/* 222 */   public LocaleList getImeHintLocales() { throw new RuntimeException("Stub!"); }
/* 223 */   public CharSequence getError() { throw new RuntimeException("Stub!"); }
/* 224 */   public void setError(CharSequence error) { throw new RuntimeException("Stub!"); }
/* 225 */   public void setError(CharSequence error, Drawable icon) { throw new RuntimeException("Stub!"); }
/* 226 */   protected boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 227 */   public void setFilters(android.text.InputFilter[] filters) { throw new RuntimeException("Stub!"); }
/* 228 */   public android.text.InputFilter[] getFilters() { throw new RuntimeException("Stub!"); }
/* 229 */   public boolean onPreDraw() { throw new RuntimeException("Stub!"); }
/* 230 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 231 */   public void onScreenStateChanged(int screenState) { throw new RuntimeException("Stub!"); }
/* 232 */   protected boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); }
/* 233 */   protected int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 234 */   protected int getTopPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 235 */   protected int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 236 */   protected int getRightPaddingOffset() { throw new RuntimeException("Stub!"); }
/* 237 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); }
/* 238 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
/* 239 */   public void invalidateDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 240 */   public boolean hasOverlappingRendering() { throw new RuntimeException("Stub!"); }
/* 241 */   public boolean isTextSelectable() { throw new RuntimeException("Stub!"); }
/* 242 */   public void setTextIsSelectable(boolean selectable) { throw new RuntimeException("Stub!"); }
/* 243 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
/* 244 */   protected void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 245 */   public void getFocusedRect(Rect r) { throw new RuntimeException("Stub!"); }
/* 246 */   public int getLineCount() { throw new RuntimeException("Stub!"); }
/* 247 */   public int getLineBounds(int line, Rect bounds) { throw new RuntimeException("Stub!"); }
/* 248 */   public int getBaseline() { throw new RuntimeException("Stub!"); }
/* 249 */   public android.view.PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) { throw new RuntimeException("Stub!"); }
/* 250 */   public boolean onKeyPreIme(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 251 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 252 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 253 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 254 */   public boolean onCheckIsTextEditor() { throw new RuntimeException("Stub!"); }
/* 255 */   public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) { throw new RuntimeException("Stub!"); }
/* 256 */   public boolean extractText(android.view.inputmethod.ExtractedTextRequest request, android.view.inputmethod.ExtractedText outText) { throw new RuntimeException("Stub!"); }
/* 257 */   public void setExtractedText(android.view.inputmethod.ExtractedText text) { throw new RuntimeException("Stub!"); }
/* 258 */   public void onCommitCompletion(android.view.inputmethod.CompletionInfo text) { throw new RuntimeException("Stub!"); }
/* 259 */   public void onCommitCorrection(android.view.inputmethod.CorrectionInfo info) { throw new RuntimeException("Stub!"); }
/* 260 */   public void beginBatchEdit() { throw new RuntimeException("Stub!"); }
/* 261 */   public void endBatchEdit() { throw new RuntimeException("Stub!"); }
/* 262 */   public void onBeginBatchEdit() { throw new RuntimeException("Stub!"); }
/* 263 */   public void onEndBatchEdit() { throw new RuntimeException("Stub!"); }
/* 264 */   public boolean onPrivateIMECommand(String action, Bundle data) { throw new RuntimeException("Stub!"); }
/* 265 */   public void setIncludeFontPadding(boolean includepad) { throw new RuntimeException("Stub!"); }
/* 266 */   public boolean getIncludeFontPadding() { throw new RuntimeException("Stub!"); }
/* 267 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 268 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 269 */   public boolean bringPointIntoView(int offset) { throw new RuntimeException("Stub!"); }
/* 270 */   public boolean moveCursorToVisibleOffset() { throw new RuntimeException("Stub!"); }
/* 271 */   public void computeScroll() { throw new RuntimeException("Stub!"); }
/* 272 */   public void debug(int depth) { throw new RuntimeException("Stub!"); }
/*     */   @android.view.ViewDebug.ExportedProperty(category="text")
/* 274 */   public int getSelectionStart() { throw new RuntimeException("Stub!"); }
/*     */   @android.view.ViewDebug.ExportedProperty(category="text")
/* 276 */   public int getSelectionEnd() { throw new RuntimeException("Stub!"); }
/* 277 */   public boolean hasSelection() { throw new RuntimeException("Stub!"); }
/* 278 */   public void setSingleLine() { throw new RuntimeException("Stub!"); }
/* 279 */   public void setAllCaps(boolean allCaps) { throw new RuntimeException("Stub!"); }
/* 280 */   public void setSingleLine(boolean singleLine) { throw new RuntimeException("Stub!"); }
/* 281 */   public void setEllipsize(android.text.TextUtils.TruncateAt where) { throw new RuntimeException("Stub!"); }
/* 282 */   public void setMarqueeRepeatLimit(int marqueeLimit) { throw new RuntimeException("Stub!"); }
/* 283 */   public int getMarqueeRepeatLimit() { throw new RuntimeException("Stub!"); }
/*     */   @android.view.ViewDebug.ExportedProperty
/* 285 */   public android.text.TextUtils.TruncateAt getEllipsize() { throw new RuntimeException("Stub!"); }
/* 286 */   public void setSelectAllOnFocus(boolean selectAllOnFocus) { throw new RuntimeException("Stub!"); }
/* 287 */   public void setCursorVisible(boolean visible) { throw new RuntimeException("Stub!"); }
/* 288 */   public boolean isCursorVisible() { throw new RuntimeException("Stub!"); }
/* 289 */   protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) { throw new RuntimeException("Stub!"); }
/* 290 */   protected void onSelectionChanged(int selStart, int selEnd) { throw new RuntimeException("Stub!"); }
/* 291 */   public void addTextChangedListener(android.text.TextWatcher watcher) { throw new RuntimeException("Stub!"); }
/* 292 */   public void removeTextChangedListener(android.text.TextWatcher watcher) { throw new RuntimeException("Stub!"); }
/* 293 */   protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 294 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
/* 295 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); }
/* 296 */   public void clearComposingText() { throw new RuntimeException("Stub!"); }
/* 297 */   public void setSelected(boolean selected) { throw new RuntimeException("Stub!"); }
/* 298 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 299 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 300 */   protected void onCreateContextMenu(android.view.ContextMenu menu) { throw new RuntimeException("Stub!"); }
/* 301 */   public boolean showContextMenu() { throw new RuntimeException("Stub!"); }
/* 302 */   public boolean showContextMenu(float x, float y) { throw new RuntimeException("Stub!"); }
/* 303 */   public boolean didTouchFocusSelect() { throw new RuntimeException("Stub!"); }
/* 304 */   public void cancelLongPress() { throw new RuntimeException("Stub!"); }
/* 305 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 306 */   public void setScroller(Scroller s) { throw new RuntimeException("Stub!"); }
/* 307 */   protected float getLeftFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 308 */   protected float getRightFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 309 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
/* 310 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
/* 311 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
/* 312 */   public void findViewsWithText(java.util.ArrayList<View> outViews, CharSequence searched, int flags) { throw new RuntimeException("Stub!"); }
/* 313 */   public boolean onKeyShortcut(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 314 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 315 */   public void onProvideStructure(android.view.ViewStructure structure) { throw new RuntimeException("Stub!"); }
/* 316 */   public void onProvideAutofillStructure(android.view.ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
/* 317 */   public void autofill(android.view.autofill.AutofillValue value) { throw new RuntimeException("Stub!"); }
/* 318 */   public int getAutofillType() { throw new RuntimeException("Stub!"); }
/* 319 */   public android.view.autofill.AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
/* 320 */   public void addExtraDataToAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo info, String extraDataKey, Bundle arguments) { throw new RuntimeException("Stub!"); }
/* 321 */   public boolean isInputMethodTarget() { throw new RuntimeException("Stub!"); }
/* 322 */   public boolean onTextContextMenuItem(int id) { throw new RuntimeException("Stub!"); }
/* 323 */   public boolean performLongClick() { throw new RuntimeException("Stub!"); }
/* 324 */   protected void onScrollChanged(int horiz, int vert, int oldHoriz, int oldVert) { throw new RuntimeException("Stub!"); }
/* 325 */   public boolean isSuggestionsEnabled() { throw new RuntimeException("Stub!"); }
/* 326 */   public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) { throw new RuntimeException("Stub!"); }
/* 327 */   public ActionMode.Callback getCustomSelectionActionModeCallback() { throw new RuntimeException("Stub!"); }
/* 328 */   public void setCustomInsertionActionModeCallback(ActionMode.Callback actionModeCallback) { throw new RuntimeException("Stub!"); }
/* 329 */   public ActionMode.Callback getCustomInsertionActionModeCallback() { throw new RuntimeException("Stub!"); }
/* 330 */   public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) { throw new RuntimeException("Stub!"); }
/* 331 */   public android.view.textclassifier.TextClassifier getTextClassifier() { throw new RuntimeException("Stub!"); }
/* 332 */   public int getOffsetForPosition(float x, float y) { throw new RuntimeException("Stub!"); }
/* 333 */   public boolean onDragEvent(android.view.DragEvent event) { throw new RuntimeException("Stub!"); }
/* 334 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\TextView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */