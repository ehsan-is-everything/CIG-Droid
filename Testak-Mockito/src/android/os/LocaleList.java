/*    */ package android.os;
/*    */ 
/*    */ import java.util.Locale;
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
/*    */ public final class LocaleList
/*    */   implements Parcelable
/*    */ {
/* 21 */   public LocaleList(Locale... list) { throw new RuntimeException("Stub!"); }
/* 22 */   public Locale get(int index) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 24 */   public int size() { throw new RuntimeException("Stub!"); }
/* 25 */   public int indexOf(Locale locale) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 27 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 28 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 29 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 30 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/* 31 */   public String toLanguageTags() { throw new RuntimeException("Stub!"); }
/* 32 */   public static LocaleList getEmptyLocaleList() { throw new RuntimeException("Stub!"); }
/* 33 */   public static LocaleList forLanguageTags(String list) { throw new RuntimeException("Stub!"); }
/* 34 */   public Locale getFirstMatch(String[] supportedLocales) { throw new RuntimeException("Stub!"); }
/* 35 */   public static LocaleList getDefault() { throw new RuntimeException("Stub!"); }
/* 36 */   public static LocaleList getAdjustedDefault() { throw new RuntimeException("Stub!"); }
/* 37 */   public static void setDefault(LocaleList locales) { throw new RuntimeException("Stub!"); }
/*    */   
/* 39 */   public static final Parcelable.Creator<LocaleList> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\LocaleList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */