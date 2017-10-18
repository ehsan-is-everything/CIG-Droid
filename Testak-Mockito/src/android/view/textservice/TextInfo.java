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
/*    */ public final class TextInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public TextInfo(String text) { throw new RuntimeException("Stub!"); }
/* 22 */   public TextInfo(String text, int cookie, int sequenceNumber) { throw new RuntimeException("Stub!"); }
/* 23 */   public TextInfo(CharSequence charSequence, int start, int end, int cookie, int sequenceNumber) { throw new RuntimeException("Stub!"); }
/* 24 */   public TextInfo(Parcel source) { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */   public String getText() { throw new RuntimeException("Stub!"); }
/* 27 */   public CharSequence getCharSequence() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getCookie() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getSequence() { throw new RuntimeException("Stub!"); }
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 32 */   public static final Parcelable.Creator<TextInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\textservice\TextInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */