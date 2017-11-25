/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.util.Printer;
/*    */ 
/*    */ public class EditorInfo
/*    */   implements android.text.InputType, android.os.Parcelable {
/*    */   public String privateImeOptions;
/*    */   public String packageName;
/*    */   public CharSequence label;
/*    */   public int inputType;
/*    */   public int initialSelStart;
/*    */   public int initialSelEnd;
/*    */   public int initialCapsMode;
/*    */   public int imeOptions;
/*    */   public CharSequence hintText;
/*    */   public android.os.LocaleList hintLocales;
/*    */   public String fieldName;
/*    */   public int fieldId;
/*    */   public android.os.Bundle extras;
/*    */   
/* 21 */   public EditorInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public final void makeCompatible(int targetSdkVersion) { throw new RuntimeException("Stub!"); }
/* 23 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 24 */   public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
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
/*    */ 
/*    */ 
/* 47 */   public String[] contentMimeTypes = null;
/*    */   public CharSequence actionLabel;
/*    */   public int actionId;
/*    */   public static final int IME_NULL = 0;
/*    */   public static final int IME_MASK_ACTION = 255;
/*    */   public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
/*    */   public static final int IME_FLAG_NO_FULLSCREEN = 33554432;
/*    */   public static final int IME_FLAG_NO_EXTRACT_UI = 268435456;
/*    */   public static final int IME_FLAG_NO_ENTER_ACTION = 1073741824;
/*    */   public static final int IME_FLAG_NO_ACCESSORY_ACTION = 536870912;
/*    */   public static final int IME_FLAG_NAVIGATE_PREVIOUS = 67108864;
/*    */   public static final int IME_FLAG_NAVIGATE_NEXT = 134217728;
/*    */   public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
/*    */   public static final int IME_ACTION_UNSPECIFIED = 0;
/* 61 */   public static final int IME_ACTION_SEND = 4; public static final int IME_ACTION_SEARCH = 3; public static final int IME_ACTION_PREVIOUS = 7; public static final int IME_ACTION_NONE = 1; public static final int IME_ACTION_NEXT = 5; public static final int IME_ACTION_GO = 2; public static final int IME_ACTION_DONE = 6; public static final android.os.Parcelable.Creator<EditorInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\inputmethod\EditorInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */