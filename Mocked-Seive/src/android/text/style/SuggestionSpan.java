/*    */ package android.text.style;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.text.ParcelableSpan;
/*    */ import android.text.TextPaint;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SuggestionSpan
/*    */   extends CharacterStyle
/*    */   implements ParcelableSpan
/*    */ {
/*    */   public static final String ACTION_SUGGESTION_PICKED = "android.text.style.SUGGESTION_PICKED";
/*    */   
/* 22 */   public SuggestionSpan(Context context, String[] suggestions, int flags) { throw new RuntimeException("Stub!"); }
/* 23 */   public SuggestionSpan(Locale locale, String[] suggestions, int flags) { throw new RuntimeException("Stub!"); }
/* 24 */   public SuggestionSpan(Context context, Locale locale, String[] suggestions, int flags, Class<?> notificationTargetClass) { throw new RuntimeException("Stub!"); }
/* 25 */   public SuggestionSpan(Parcel src) { throw new RuntimeException("Stub!"); }
/* 26 */   public String[] getSuggestions() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 28 */   public String getLocale() { throw new RuntimeException("Stub!"); }
/* 29 */   public Locale getLocaleObject() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getFlags() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setFlags(int flags) { throw new RuntimeException("Stub!"); }
/* 32 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 33 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 34 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 36 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 37 */   public void updateDrawState(TextPaint tp) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 47 */   public static final Parcelable.Creator<SuggestionSpan> CREATOR = null;
/*    */   public static final int FLAG_AUTO_CORRECTION = 4;
/*    */   public static final int FLAG_EASY_CORRECT = 1;
/*    */   public static final int FLAG_MISSPELLED = 2;
/*    */   public static final int SUGGESTIONS_MAX_SIZE = 5;
/*    */   public static final String SUGGESTION_SPAN_PICKED_AFTER = "after";
/*    */   public static final String SUGGESTION_SPAN_PICKED_BEFORE = "before";
/*    */   public static final String SUGGESTION_SPAN_PICKED_HASHCODE = "hashcode";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\style\SuggestionSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */