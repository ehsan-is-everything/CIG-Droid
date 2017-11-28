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
/*    */ public class ExtractedTextRequest
/*    */   implements Parcelable
/*    */ {
/* 21 */   public ExtractedTextRequest() { throw new RuntimeException("Stub!"); }
/* 22 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 23 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 29 */   public static final Parcelable.Creator<ExtractedTextRequest> CREATOR = null;
/*    */   public int flags;
/*    */   public int hintMaxChars;
/*    */   public int hintMaxLines;
/*    */   public int token;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\inputmethod\ExtractedTextRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */