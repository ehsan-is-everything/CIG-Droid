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
/*    */ public final class SentenceSuggestionsInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public SentenceSuggestionsInfo(SuggestionsInfo[] suggestionsInfos, int[] offsets, int[] lengths) { throw new RuntimeException("Stub!"); }
/* 22 */   public SentenceSuggestionsInfo(Parcel source) { throw new RuntimeException("Stub!"); }
/* 23 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getSuggestionsCount() { throw new RuntimeException("Stub!"); }
/* 26 */   public SuggestionsInfo getSuggestionsInfoAt(int i) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getOffsetAt(int i) { throw new RuntimeException("Stub!"); }
/* 28 */   public int getLengthAt(int i) { throw new RuntimeException("Stub!"); }
/*    */   
/* 30 */   public static final Parcelable.Creator<SentenceSuggestionsInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\textservice\SentenceSuggestionsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */