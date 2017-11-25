/*    */ package android.app.assist;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ 
/*    */ public class AssistStructure implements android.os.Parcelable {
/*    */   public static class WindowNode {
/*  7 */     WindowNode() { throw new RuntimeException("Stub!"); }
/*  8 */     public int getLeft() { throw new RuntimeException("Stub!"); }
/*  9 */     public int getTop() { throw new RuntimeException("Stub!"); }
/* 10 */     public int getWidth() { throw new RuntimeException("Stub!"); }
/* 11 */     public int getHeight() { throw new RuntimeException("Stub!"); }
/* 12 */     public CharSequence getTitle() { throw new RuntimeException("Stub!"); }
/* 13 */     public int getDisplayId() { throw new RuntimeException("Stub!"); }
/* 14 */     public AssistStructure.ViewNode getRootViewNode() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static class ViewNode { public static final int TEXT_COLOR_UNDEFINED = 1;
/*    */     
/* 18 */     ViewNode() { throw new RuntimeException("Stub!"); }
/* 19 */     public int getId() { throw new RuntimeException("Stub!"); }
/* 20 */     public String getIdPackage() { throw new RuntimeException("Stub!"); }
/* 21 */     public String getIdType() { throw new RuntimeException("Stub!"); }
/* 22 */     public String getIdEntry() { throw new RuntimeException("Stub!"); }
/* 23 */     public android.view.autofill.AutofillId getAutofillId() { throw new RuntimeException("Stub!"); }
/* 24 */     public int getAutofillType() { throw new RuntimeException("Stub!"); }
/* 25 */     public String[] getAutofillHints() { throw new RuntimeException("Stub!"); }
/* 26 */     public android.view.autofill.AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
/* 27 */     public CharSequence[] getAutofillOptions() { throw new RuntimeException("Stub!"); }
/* 28 */     public int getInputType() { throw new RuntimeException("Stub!"); }
/* 29 */     public int getLeft() { throw new RuntimeException("Stub!"); }
/* 30 */     public int getTop() { throw new RuntimeException("Stub!"); }
/* 31 */     public int getScrollX() { throw new RuntimeException("Stub!"); }
/* 32 */     public int getScrollY() { throw new RuntimeException("Stub!"); }
/* 33 */     public int getWidth() { throw new RuntimeException("Stub!"); }
/* 34 */     public int getHeight() { throw new RuntimeException("Stub!"); }
/* 35 */     public android.graphics.Matrix getTransformation() { throw new RuntimeException("Stub!"); }
/* 36 */     public float getElevation() { throw new RuntimeException("Stub!"); }
/* 37 */     public float getAlpha() { throw new RuntimeException("Stub!"); }
/* 38 */     public int getVisibility() { throw new RuntimeException("Stub!"); }
/* 39 */     public boolean isAssistBlocked() { throw new RuntimeException("Stub!"); }
/* 40 */     public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 41 */     public boolean isClickable() { throw new RuntimeException("Stub!"); }
/* 42 */     public boolean isFocusable() { throw new RuntimeException("Stub!"); }
/* 43 */     public boolean isFocused() { throw new RuntimeException("Stub!"); }
/* 44 */     public boolean isAccessibilityFocused() { throw new RuntimeException("Stub!"); }
/* 45 */     public boolean isCheckable() { throw new RuntimeException("Stub!"); }
/* 46 */     public boolean isChecked() { throw new RuntimeException("Stub!"); }
/* 47 */     public boolean isSelected() { throw new RuntimeException("Stub!"); }
/* 48 */     public boolean isActivated() { throw new RuntimeException("Stub!"); }
/* 49 */     public boolean isOpaque() { throw new RuntimeException("Stub!"); }
/* 50 */     public boolean isLongClickable() { throw new RuntimeException("Stub!"); }
/* 51 */     public boolean isContextClickable() { throw new RuntimeException("Stub!"); }
/* 52 */     public String getClassName() { throw new RuntimeException("Stub!"); }
/* 53 */     public CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
/* 54 */     public String getWebDomain() { throw new RuntimeException("Stub!"); }
/* 55 */     public android.view.ViewStructure.HtmlInfo getHtmlInfo() { throw new RuntimeException("Stub!"); }
/* 56 */     public android.os.LocaleList getLocaleList() { throw new RuntimeException("Stub!"); }
/* 57 */     public CharSequence getText() { throw new RuntimeException("Stub!"); }
/* 58 */     public int getTextSelectionStart() { throw new RuntimeException("Stub!"); }
/* 59 */     public int getTextSelectionEnd() { throw new RuntimeException("Stub!"); }
/* 60 */     public int getTextColor() { throw new RuntimeException("Stub!"); }
/* 61 */     public int getTextBackgroundColor() { throw new RuntimeException("Stub!"); }
/* 62 */     public float getTextSize() { throw new RuntimeException("Stub!"); }
/* 63 */     public int getTextStyle() { throw new RuntimeException("Stub!"); }
/* 64 */     public int[] getTextLineCharOffsets() { throw new RuntimeException("Stub!"); }
/* 65 */     public int[] getTextLineBaselines() { throw new RuntimeException("Stub!"); }
/* 66 */     public String getHint() { throw new RuntimeException("Stub!"); }
/* 67 */     public android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 68 */     public int getChildCount() { throw new RuntimeException("Stub!"); }
/* 69 */     public ViewNode getChildAt(int index) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static final int TEXT_STYLE_BOLD = 1;
/*    */     public static final int TEXT_STYLE_ITALIC = 2;
/*    */     public static final int TEXT_STYLE_STRIKE_THRU = 8;
/*    */     public static final int TEXT_STYLE_UNDERLINE = 4; }
/*    */   
/* 76 */   public AssistStructure() { throw new RuntimeException("Stub!"); }
/* 77 */   public long getAcquisitionStartTime() { throw new RuntimeException("Stub!"); }
/* 78 */   public long getAcquisitionEndTime() { throw new RuntimeException("Stub!"); }
/* 79 */   public android.content.ComponentName getActivityComponent() { throw new RuntimeException("Stub!"); }
/* 80 */   public boolean isHomeActivity() { throw new RuntimeException("Stub!"); }
/* 81 */   public int getWindowNodeCount() { throw new RuntimeException("Stub!"); }
/* 82 */   public WindowNode getWindowNodeAt(int index) { throw new RuntimeException("Stub!"); }
/* 83 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 84 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 86 */   public static final android.os.Parcelable.Creator<AssistStructure> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\assist\AssistStructure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */