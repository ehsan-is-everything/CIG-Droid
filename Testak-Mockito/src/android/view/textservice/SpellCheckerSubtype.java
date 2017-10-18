/*    */ package android.view.textservice;
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
/*    */ public final class SpellCheckerSubtype
/*    */   implements Parcelable
/*    */ {
/*    */   @Deprecated
/* 22 */   public SpellCheckerSubtype(int nameId, String locale, String extraValue) { throw new RuntimeException("Stub!"); }
/* 23 */   public int getNameResId() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 25 */   public String getLocale() { throw new RuntimeException("Stub!"); }
/* 26 */   public String getLanguageTag() { throw new RuntimeException("Stub!"); }
/* 27 */   public String getExtraValue() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean containsExtraValueKey(String key) { throw new RuntimeException("Stub!"); }
/* 29 */   public String getExtraValueOf(String key) { throw new RuntimeException("Stub!"); }
/* 30 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 32 */   public CharSequence getDisplayName(Context context, String packageName, ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 36 */   public static final Parcelable.Creator<SpellCheckerSubtype> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\textservice\SpellCheckerSubtype.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */