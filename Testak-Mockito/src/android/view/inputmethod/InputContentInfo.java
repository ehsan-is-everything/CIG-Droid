/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.content.ClipDescription;
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
/*    */ public final class InputContentInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public InputContentInfo(Uri contentUri, ClipDescription description) { throw new RuntimeException("Stub!"); }
/* 22 */   public InputContentInfo(Uri contentUri, ClipDescription description, Uri linkUri) { throw new RuntimeException("Stub!"); }
/* 23 */   public Uri getContentUri() { throw new RuntimeException("Stub!"); }
/* 24 */   public ClipDescription getDescription() { throw new RuntimeException("Stub!"); }
/* 25 */   public Uri getLinkUri() { throw new RuntimeException("Stub!"); }
/* 26 */   public void requestPermission() { throw new RuntimeException("Stub!"); }
/* 27 */   public void releasePermission() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 29 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 31 */   public static final Parcelable.Creator<InputContentInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\inputmethod\InputContentInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */