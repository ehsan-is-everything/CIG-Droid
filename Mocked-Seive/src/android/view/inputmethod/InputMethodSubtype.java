/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.pm.ApplicationInfo;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public final class InputMethodSubtype
/*    */   implements Parcelable
/*    */ {
/*    */   public static class InputMethodSubtypeBuilder
/*    */   {
/* 23 */     public InputMethodSubtypeBuilder() { throw new RuntimeException("Stub!"); }
/* 24 */     public InputMethodSubtypeBuilder setIsAuxiliary(boolean isAuxiliary) { throw new RuntimeException("Stub!"); }
/* 25 */     public InputMethodSubtypeBuilder setOverridesImplicitlyEnabledSubtype(boolean overridesImplicitlyEnabledSubtype) { throw new RuntimeException("Stub!"); }
/* 26 */     public InputMethodSubtypeBuilder setIsAsciiCapable(boolean isAsciiCapable) { throw new RuntimeException("Stub!"); }
/* 27 */     public InputMethodSubtypeBuilder setSubtypeIconResId(int subtypeIconResId) { throw new RuntimeException("Stub!"); }
/* 28 */     public InputMethodSubtypeBuilder setSubtypeNameResId(int subtypeNameResId) { throw new RuntimeException("Stub!"); }
/* 29 */     public InputMethodSubtypeBuilder setSubtypeId(int subtypeId) { throw new RuntimeException("Stub!"); }
/* 30 */     public InputMethodSubtypeBuilder setSubtypeLocale(String subtypeLocale) { throw new RuntimeException("Stub!"); }
/* 31 */     public InputMethodSubtypeBuilder setLanguageTag(String languageTag) { throw new RuntimeException("Stub!"); }
/* 32 */     public InputMethodSubtypeBuilder setSubtypeMode(String subtypeMode) { throw new RuntimeException("Stub!"); }
/* 33 */     public InputMethodSubtypeBuilder setSubtypeExtraValue(String subtypeExtraValue) { throw new RuntimeException("Stub!"); }
/* 34 */     public InputMethodSubtype build() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   @Deprecated
/* 37 */   public InputMethodSubtype(int nameId, int iconId, String locale, String mode, String extraValue, boolean isAuxiliary, boolean overridesImplicitlyEnabledSubtype) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 39 */   public InputMethodSubtype(int nameId, int iconId, String locale, String mode, String extraValue, boolean isAuxiliary, boolean overridesImplicitlyEnabledSubtype, int id) { throw new RuntimeException("Stub!"); }
/* 40 */   public int getNameResId() { throw new RuntimeException("Stub!"); }
/* 41 */   public int getIconResId() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 43 */   public String getLocale() { throw new RuntimeException("Stub!"); }
/* 44 */   public String getLanguageTag() { throw new RuntimeException("Stub!"); }
/* 45 */   public String getMode() { throw new RuntimeException("Stub!"); }
/* 46 */   public String getExtraValue() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isAuxiliary() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean overridesImplicitlyEnabledSubtype() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean isAsciiCapable() { throw new RuntimeException("Stub!"); }
/* 50 */   public CharSequence getDisplayName(Context context, String packageName, ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean containsExtraValueKey(String key) { throw new RuntimeException("Stub!"); }
/* 52 */   public String getExtraValueOf(String key) { throw new RuntimeException("Stub!"); }
/* 53 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 55 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 56 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 58 */   public static final Parcelable.Creator<InputMethodSubtype> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\inputmethod\InputMethodSubtype.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */