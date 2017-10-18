/*    */ package android.content;
/*    */ 
/*    */ import android.net.Uri;
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
/*    */ public class ContentProviderResult
/*    */   implements Parcelable
/*    */ {
/* 21 */   public ContentProviderResult(Uri uri) { throw new RuntimeException("Stub!"); }
/* 22 */   public ContentProviderResult(int count) { throw new RuntimeException("Stub!"); }
/* 23 */   public ContentProviderResult(Parcel source) { throw new RuntimeException("Stub!"); }
/* 24 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/* 30 */   public static final Parcelable.Creator<ContentProviderResult> CREATOR = null;
/*    */   public final Integer count;
/*    */   public final Uri uri;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\ContentProviderResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */