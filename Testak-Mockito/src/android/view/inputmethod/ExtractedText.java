/*    */ package android.view.inputmethod;
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
/*    */ public class ExtractedText
/*    */   implements Parcelable
/*    */ {
/* 21 */   public ExtractedText() { throw new RuntimeException("Stub!"); }
/* 22 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 23 */   public int describeContents() { throw new RuntimeException("Stub!"); }
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
/* 34 */   public static final Parcelable.Creator<ExtractedText> CREATOR = null;
/*    */   public static final int FLAG_SELECTING = 2;
/*    */   public static final int FLAG_SINGLE_LINE = 1;
/*    */   public int flags;
/*    */   public int partialEndOffset;
/*    */   public int partialStartOffset;
/*    */   public int selectionEnd;
/*    */   public int selectionStart;
/*    */   public int startOffset;
/*    */   public CharSequence text;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\inputmethod\ExtractedText.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */