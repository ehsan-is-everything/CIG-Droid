/*     */ package android.view.accessibility;
/*     */ 
/*     */ import android.view.View;
/*     */ 
/*     */ public class AccessibilityNodeInfo implements android.os.Parcelable {
/*     */   public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
/*     */   public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
/*     */   public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
/*     */   public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
/*     */   public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
/*     */   public static final String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
/*     */   public static final String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
/*     */   public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
/*     */   public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
/*     */   public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
/*     */   public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
/*     */   public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
/*     */   public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
/*     */   public static final int ACTION_CLEAR_FOCUS = 2;
/*     */   public static final int ACTION_CLEAR_SELECTION = 8;
/*     */   public static final int ACTION_CLICK = 16;
/*     */   
/*  23 */   public static final class AccessibilityAction { public AccessibilityAction(int actionId, CharSequence label) { throw new RuntimeException("Stub!"); }
/*  24 */     public int getId() { throw new RuntimeException("Stub!"); }
/*  25 */     public CharSequence getLabel() { throw new RuntimeException("Stub!"); }
/*  26 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*  27 */     public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/*  28 */     public String toString() { throw new RuntimeException("Stub!"); }
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
/*  60 */     public static final AccessibilityAction ACTION_SHOW_ON_SCREEN = null; public static final AccessibilityAction ACTION_SET_TEXT = null; public static final AccessibilityAction ACTION_SET_SELECTION = null; public static final AccessibilityAction ACTION_SET_PROGRESS = null; public static final AccessibilityAction ACTION_SELECT = null; public static final AccessibilityAction ACTION_SCROLL_UP = null; public static final AccessibilityAction ACTION_SCROLL_TO_POSITION = null; public static final AccessibilityAction ACTION_SCROLL_RIGHT = null; public static final AccessibilityAction ACTION_SCROLL_LEFT = null; public static final AccessibilityAction ACTION_SCROLL_FORWARD = null; public static final AccessibilityAction ACTION_SCROLL_DOWN = null; public static final AccessibilityAction ACTION_SCROLL_BACKWARD = null; public static final AccessibilityAction ACTION_PREVIOUS_HTML_ELEMENT = null; public static final AccessibilityAction ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = null; public static final AccessibilityAction ACTION_PASTE = null; public static final AccessibilityAction ACTION_NEXT_HTML_ELEMENT = null; public static final AccessibilityAction ACTION_NEXT_AT_MOVEMENT_GRANULARITY = null; public static final AccessibilityAction ACTION_MOVE_WINDOW = null; public static final AccessibilityAction ACTION_LONG_CLICK = null; public static final AccessibilityAction ACTION_FOCUS = null; public static final AccessibilityAction ACTION_EXPAND = null; public static final AccessibilityAction ACTION_DISMISS = null; public static final AccessibilityAction ACTION_CUT = null; public static final AccessibilityAction ACTION_COPY = null; public static final AccessibilityAction ACTION_CONTEXT_CLICK = null; public static final AccessibilityAction ACTION_COLLAPSE = null; public static final AccessibilityAction ACTION_CLICK = null; public static final AccessibilityAction ACTION_CLEAR_SELECTION = null; public static final AccessibilityAction ACTION_CLEAR_FOCUS = null; public static final AccessibilityAction ACTION_CLEAR_ACCESSIBILITY_FOCUS = null; public static final AccessibilityAction ACTION_ACCESSIBILITY_FOCUS = null; }
/*     */   
/*     */   public static final class RangeInfo { public static final int RANGE_TYPE_FLOAT = 1;
/*     */     
/*  64 */     RangeInfo() { throw new RuntimeException("Stub!"); }
/*  65 */     public static RangeInfo obtain(int type, float min, float max, float current) { throw new RuntimeException("Stub!"); }
/*  66 */     public int getType() { throw new RuntimeException("Stub!"); }
/*  67 */     public float getMin() { throw new RuntimeException("Stub!"); }
/*  68 */     public float getMax() { throw new RuntimeException("Stub!"); }
/*  69 */     public float getCurrent() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int RANGE_TYPE_INT = 0;
/*     */     public static final int RANGE_TYPE_PERCENT = 2; }
/*     */   
/*     */   public static final class CollectionInfo { public static final int SELECTION_MODE_MULTIPLE = 2;
/*     */     
/*  76 */     CollectionInfo() { throw new RuntimeException("Stub!"); }
/*  77 */     public static CollectionInfo obtain(int rowCount, int columnCount, boolean hierarchical) { throw new RuntimeException("Stub!"); }
/*  78 */     public static CollectionInfo obtain(int rowCount, int columnCount, boolean hierarchical, int selectionMode) { throw new RuntimeException("Stub!"); }
/*  79 */     public int getRowCount() { throw new RuntimeException("Stub!"); }
/*  80 */     public int getColumnCount() { throw new RuntimeException("Stub!"); }
/*  81 */     public boolean isHierarchical() { throw new RuntimeException("Stub!"); }
/*  82 */     public int getSelectionMode() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int SELECTION_MODE_NONE = 0;
/*     */     public static final int SELECTION_MODE_SINGLE = 1;
/*     */   }
/*     */   
/*     */   public static final class CollectionItemInfo {
/*  89 */     CollectionItemInfo() { throw new RuntimeException("Stub!"); }
/*  90 */     public static CollectionItemInfo obtain(int rowIndex, int rowSpan, int columnIndex, int columnSpan, boolean heading) { throw new RuntimeException("Stub!"); }
/*  91 */     public static CollectionItemInfo obtain(int rowIndex, int rowSpan, int columnIndex, int columnSpan, boolean heading, boolean selected) { throw new RuntimeException("Stub!"); }
/*  92 */     public int getColumnIndex() { throw new RuntimeException("Stub!"); }
/*  93 */     public int getRowIndex() { throw new RuntimeException("Stub!"); }
/*  94 */     public int getColumnSpan() { throw new RuntimeException("Stub!"); }
/*  95 */     public int getRowSpan() { throw new RuntimeException("Stub!"); }
/*  96 */     public boolean isHeading() { throw new RuntimeException("Stub!"); }
/*  97 */     public boolean isSelected() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  99 */   AccessibilityNodeInfo() { throw new RuntimeException("Stub!"); }
/* 100 */   public void setSource(View source) { throw new RuntimeException("Stub!"); }
/* 101 */   public void setSource(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
/* 102 */   public AccessibilityNodeInfo findFocus(int focus) { throw new RuntimeException("Stub!"); }
/* 103 */   public AccessibilityNodeInfo focusSearch(int direction) { throw new RuntimeException("Stub!"); }
/* 104 */   public int getWindowId() { throw new RuntimeException("Stub!"); }
/* 105 */   public boolean refresh() { throw new RuntimeException("Stub!"); }
/* 106 */   public boolean refreshWithExtraData(String extraDataKey, android.os.Bundle args) { throw new RuntimeException("Stub!"); }
/* 107 */   public int getChildCount() { throw new RuntimeException("Stub!"); }
/* 108 */   public AccessibilityNodeInfo getChild(int index) { throw new RuntimeException("Stub!"); }
/* 109 */   public void addChild(View child) { throw new RuntimeException("Stub!"); }
/* 110 */   public boolean removeChild(View child) { throw new RuntimeException("Stub!"); }
/* 111 */   public void addChild(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
/* 112 */   public boolean removeChild(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
/* 113 */   public java.util.List<AccessibilityAction> getActionList() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 115 */   public int getActions() { throw new RuntimeException("Stub!"); }
/* 116 */   public void addAction(AccessibilityAction action) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 118 */   public void addAction(int action) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 120 */   public void removeAction(int action) { throw new RuntimeException("Stub!"); }
/* 121 */   public boolean removeAction(AccessibilityAction action) { throw new RuntimeException("Stub!"); }
/* 122 */   public AccessibilityNodeInfo getTraversalBefore() { throw new RuntimeException("Stub!"); }
/* 123 */   public void setTraversalBefore(View view) { throw new RuntimeException("Stub!"); }
/* 124 */   public void setTraversalBefore(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
/* 125 */   public AccessibilityNodeInfo getTraversalAfter() { throw new RuntimeException("Stub!"); }
/* 126 */   public void setTraversalAfter(View view) { throw new RuntimeException("Stub!"); }
/* 127 */   public void setTraversalAfter(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
/* 128 */   public java.util.List<String> getAvailableExtraData() { throw new RuntimeException("Stub!"); }
/* 129 */   public void setAvailableExtraData(java.util.List<String> extraDataKeys) { throw new RuntimeException("Stub!"); }
/* 130 */   public void setMaxTextLength(int max) { throw new RuntimeException("Stub!"); }
/* 131 */   public int getMaxTextLength() { throw new RuntimeException("Stub!"); }
/* 132 */   public void setMovementGranularities(int granularities) { throw new RuntimeException("Stub!"); }
/* 133 */   public int getMovementGranularities() { throw new RuntimeException("Stub!"); }
/* 134 */   public boolean performAction(int action) { throw new RuntimeException("Stub!"); }
/* 135 */   public boolean performAction(int action, android.os.Bundle arguments) { throw new RuntimeException("Stub!"); }
/* 136 */   public java.util.List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String text) { throw new RuntimeException("Stub!"); }
/* 137 */   public java.util.List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId(String viewId) { throw new RuntimeException("Stub!"); }
/* 138 */   public AccessibilityWindowInfo getWindow() { throw new RuntimeException("Stub!"); }
/* 139 */   public AccessibilityNodeInfo getParent() { throw new RuntimeException("Stub!"); }
/* 140 */   public void setParent(View parent) { throw new RuntimeException("Stub!"); }
/* 141 */   public void setParent(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
/* 142 */   public void getBoundsInParent(android.graphics.Rect outBounds) { throw new RuntimeException("Stub!"); }
/* 143 */   public void setBoundsInParent(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
/* 144 */   public void getBoundsInScreen(android.graphics.Rect outBounds) { throw new RuntimeException("Stub!"); }
/* 145 */   public void setBoundsInScreen(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
/* 146 */   public boolean isCheckable() { throw new RuntimeException("Stub!"); }
/* 147 */   public void setCheckable(boolean checkable) { throw new RuntimeException("Stub!"); }
/* 148 */   public boolean isChecked() { throw new RuntimeException("Stub!"); }
/* 149 */   public void setChecked(boolean checked) { throw new RuntimeException("Stub!"); }
/* 150 */   public boolean isFocusable() { throw new RuntimeException("Stub!"); }
/* 151 */   public void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); }
/* 152 */   public boolean isFocused() { throw new RuntimeException("Stub!"); }
/* 153 */   public void setFocused(boolean focused) { throw new RuntimeException("Stub!"); }
/* 154 */   public boolean isVisibleToUser() { throw new RuntimeException("Stub!"); }
/* 155 */   public void setVisibleToUser(boolean visibleToUser) { throw new RuntimeException("Stub!"); }
/* 156 */   public boolean isAccessibilityFocused() { throw new RuntimeException("Stub!"); }
/* 157 */   public void setAccessibilityFocused(boolean focused) { throw new RuntimeException("Stub!"); }
/* 158 */   public boolean isSelected() { throw new RuntimeException("Stub!"); }
/* 159 */   public void setSelected(boolean selected) { throw new RuntimeException("Stub!"); }
/* 160 */   public boolean isClickable() { throw new RuntimeException("Stub!"); }
/* 161 */   public void setClickable(boolean clickable) { throw new RuntimeException("Stub!"); }
/* 162 */   public boolean isLongClickable() { throw new RuntimeException("Stub!"); }
/* 163 */   public void setLongClickable(boolean longClickable) { throw new RuntimeException("Stub!"); }
/* 164 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 165 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 166 */   public boolean isPassword() { throw new RuntimeException("Stub!"); }
/* 167 */   public void setPassword(boolean password) { throw new RuntimeException("Stub!"); }
/* 168 */   public boolean isScrollable() { throw new RuntimeException("Stub!"); }
/* 169 */   public void setScrollable(boolean scrollable) { throw new RuntimeException("Stub!"); }
/* 170 */   public boolean isEditable() { throw new RuntimeException("Stub!"); }
/* 171 */   public void setEditable(boolean editable) { throw new RuntimeException("Stub!"); }
/* 172 */   public int getDrawingOrder() { throw new RuntimeException("Stub!"); }
/* 173 */   public void setDrawingOrder(int drawingOrderInParent) { throw new RuntimeException("Stub!"); }
/* 174 */   public CollectionInfo getCollectionInfo() { throw new RuntimeException("Stub!"); }
/* 175 */   public void setCollectionInfo(CollectionInfo collectionInfo) { throw new RuntimeException("Stub!"); }
/* 176 */   public CollectionItemInfo getCollectionItemInfo() { throw new RuntimeException("Stub!"); }
/* 177 */   public void setCollectionItemInfo(CollectionItemInfo collectionItemInfo) { throw new RuntimeException("Stub!"); }
/* 178 */   public RangeInfo getRangeInfo() { throw new RuntimeException("Stub!"); }
/* 179 */   public void setRangeInfo(RangeInfo rangeInfo) { throw new RuntimeException("Stub!"); }
/* 180 */   public boolean isContentInvalid() { throw new RuntimeException("Stub!"); }
/* 181 */   public void setContentInvalid(boolean contentInvalid) { throw new RuntimeException("Stub!"); }
/* 182 */   public boolean isContextClickable() { throw new RuntimeException("Stub!"); }
/* 183 */   public void setContextClickable(boolean contextClickable) { throw new RuntimeException("Stub!"); }
/* 184 */   public int getLiveRegion() { throw new RuntimeException("Stub!"); }
/* 185 */   public void setLiveRegion(int mode) { throw new RuntimeException("Stub!"); }
/* 186 */   public boolean isMultiLine() { throw new RuntimeException("Stub!"); }
/* 187 */   public void setMultiLine(boolean multiLine) { throw new RuntimeException("Stub!"); }
/* 188 */   public boolean canOpenPopup() { throw new RuntimeException("Stub!"); }
/* 189 */   public void setCanOpenPopup(boolean opensPopup) { throw new RuntimeException("Stub!"); }
/* 190 */   public boolean isDismissable() { throw new RuntimeException("Stub!"); }
/* 191 */   public void setDismissable(boolean dismissable) { throw new RuntimeException("Stub!"); }
/* 192 */   public boolean isImportantForAccessibility() { throw new RuntimeException("Stub!"); }
/* 193 */   public void setImportantForAccessibility(boolean important) { throw new RuntimeException("Stub!"); }
/* 194 */   public boolean isShowingHintText() { throw new RuntimeException("Stub!"); }
/* 195 */   public void setShowingHintText(boolean showingHintText) { throw new RuntimeException("Stub!"); }
/* 196 */   public CharSequence getPackageName() { throw new RuntimeException("Stub!"); }
/* 197 */   public void setPackageName(CharSequence packageName) { throw new RuntimeException("Stub!"); }
/* 198 */   public CharSequence getClassName() { throw new RuntimeException("Stub!"); }
/* 199 */   public void setClassName(CharSequence className) { throw new RuntimeException("Stub!"); }
/* 200 */   public CharSequence getText() { throw new RuntimeException("Stub!"); }
/* 201 */   public void setText(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 202 */   public CharSequence getHintText() { throw new RuntimeException("Stub!"); }
/* 203 */   public void setHintText(CharSequence hintText) { throw new RuntimeException("Stub!"); }
/* 204 */   public void setError(CharSequence error) { throw new RuntimeException("Stub!"); }
/* 205 */   public CharSequence getError() { throw new RuntimeException("Stub!"); }
/* 206 */   public CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
/* 207 */   public void setContentDescription(CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
/* 208 */   public void setLabelFor(View labeled) { throw new RuntimeException("Stub!"); }
/* 209 */   public void setLabelFor(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
/* 210 */   public AccessibilityNodeInfo getLabelFor() { throw new RuntimeException("Stub!"); }
/* 211 */   public void setLabeledBy(View label) { throw new RuntimeException("Stub!"); }
/* 212 */   public void setLabeledBy(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
/* 213 */   public AccessibilityNodeInfo getLabeledBy() { throw new RuntimeException("Stub!"); }
/* 214 */   public void setViewIdResourceName(String viewIdResName) { throw new RuntimeException("Stub!"); }
/* 215 */   public String getViewIdResourceName() { throw new RuntimeException("Stub!"); }
/* 216 */   public int getTextSelectionStart() { throw new RuntimeException("Stub!"); }
/* 217 */   public int getTextSelectionEnd() { throw new RuntimeException("Stub!"); }
/* 218 */   public void setTextSelection(int start, int end) { throw new RuntimeException("Stub!"); }
/* 219 */   public int getInputType() { throw new RuntimeException("Stub!"); }
/* 220 */   public void setInputType(int inputType) { throw new RuntimeException("Stub!"); }
/* 221 */   public android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 222 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 223 */   public static AccessibilityNodeInfo obtain(View source) { throw new RuntimeException("Stub!"); }
/* 224 */   public static AccessibilityNodeInfo obtain(View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
/* 225 */   public static AccessibilityNodeInfo obtain() { throw new RuntimeException("Stub!"); }
/* 226 */   public static AccessibilityNodeInfo obtain(AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/* 227 */   public void recycle() { throw new RuntimeException("Stub!"); }
/* 228 */   public void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 229 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); }
/* 230 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 231 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */   public static final int ACTION_COLLAPSE = 524288;
/*     */   
/*     */ 
/*     */   public static final int ACTION_COPY = 16384;
/*     */   
/*     */ 
/*     */   public static final int ACTION_CUT = 65536;
/*     */   
/*     */ 
/*     */   public static final int ACTION_DISMISS = 1048576;
/*     */   
/*     */ 
/*     */   public static final int ACTION_EXPAND = 262144;
/*     */   
/*     */ 
/*     */   public static final int ACTION_FOCUS = 1;
/*     */   
/*     */ 
/*     */   public static final int ACTION_LONG_CLICK = 32;
/*     */   
/*     */ 
/*     */   public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
/*     */   
/*     */   public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
/*     */   
/*     */   public static final int ACTION_PASTE = 32768;
/*     */   
/*     */   public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
/*     */   
/*     */   public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
/*     */   
/*     */   public static final int ACTION_SCROLL_BACKWARD = 8192;
/*     */   
/*     */   public static final int ACTION_SCROLL_FORWARD = 4096;
/*     */   
/*     */   public static final int ACTION_SELECT = 4;
/*     */   
/*     */   public static final int ACTION_SET_SELECTION = 131072;
/*     */   
/*     */   public static final int ACTION_SET_TEXT = 2097152;
/*     */   
/* 276 */   public static final android.os.Parcelable.Creator<AccessibilityNodeInfo> CREATOR = null;
/*     */   public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
/*     */   public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
/*     */   public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
/*     */   public static final int FOCUS_ACCESSIBILITY = 2;
/*     */   public static final int FOCUS_INPUT = 1;
/*     */   public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
/*     */   public static final int MOVEMENT_GRANULARITY_LINE = 4;
/*     */   public static final int MOVEMENT_GRANULARITY_PAGE = 16;
/*     */   public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
/*     */   public static final int MOVEMENT_GRANULARITY_WORD = 2;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\accessibility\AccessibilityNodeInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */