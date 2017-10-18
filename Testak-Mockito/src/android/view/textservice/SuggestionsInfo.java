/*    */ package android.view.textservice;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ public final class SuggestionsInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public SuggestionsInfo(int suggestionsAttributes, String[] suggestions) { throw new RuntimeException("Stub!"); }
/* 22 */   public SuggestionsInfo(int suggestionsAttributes, String[] suggestions, int cookie, int sequence) { throw new RuntimeException("Stub!"); }
/* 23 */   public SuggestionsInfo(Parcel source) { throw new RuntimeException("Stub!"); }
/* 24 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 25 */   public void setCookieAndSequence(int cookie, int sequence) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getCookie() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getSequence() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getSuggestionsAttributes() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getSuggestionsCount() { throw new RuntimeException("Stub!"); }
/* 30 */   public String getSuggestionAt(int i) { throw new RuntimeException("Stub!"); }
/* 31 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 36 */   public static final Parcelable.Creator<SuggestionsInfo> CREATOR = null;
/*    */   public static final int RESULT_ATTR_HAS_RECOMMENDED_SUGGESTIONS = 4;
/*    */   public static final int RESULT_ATTR_IN_THE_DICTIONARY = 1;
/*    */   public static final int RESULT_ATTR_LOOKS_LIKE_TYPO = 2;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\textservice\SuggestionsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */