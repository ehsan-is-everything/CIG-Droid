/*    */ package android.app;
/*    */ 
/*    */ import android.graphics.Rect;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Rational;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class PictureInPictureParams
/*    */   implements Parcelable
/*    */ {
/*    */   public static class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setAspectRatio(Rational aspectRatio) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setActions(List<RemoteAction> actions) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setSourceRectHint(Rect launchBounds) { throw new RuntimeException("Stub!"); }
/* 27 */     public PictureInPictureParams build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 29 */   PictureInPictureParams() { throw new RuntimeException("Stub!"); }
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 31 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 33 */   public static final Parcelable.Creator<PictureInPictureParams> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\PictureInPictureParams.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */