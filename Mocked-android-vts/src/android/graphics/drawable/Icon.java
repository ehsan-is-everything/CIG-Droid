/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.ColorStateList;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.net.Uri;
/*    */ import android.os.Handler;
/*    */ import android.os.Message;
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
/*    */ public final class Icon
/*    */   implements Parcelable
/*    */ {
/* 25 */   Icon() { throw new RuntimeException("Stub!"); }
/* 26 */   public void loadDrawableAsync(Context context, Message andThen) { throw new RuntimeException("Stub!"); }
/* 27 */   public void loadDrawableAsync(Context context, OnDrawableLoadedListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 28 */   public Drawable loadDrawable(Context context) { throw new RuntimeException("Stub!"); }
/* 29 */   public static Icon createWithResource(Context context, int resId) { throw new RuntimeException("Stub!"); }
/* 30 */   public static Icon createWithResource(String resPackage, int resId) { throw new RuntimeException("Stub!"); }
/* 31 */   public static Icon createWithBitmap(Bitmap bits) { throw new RuntimeException("Stub!"); }
/* 32 */   public static Icon createWithAdaptiveBitmap(Bitmap bits) { throw new RuntimeException("Stub!"); }
/* 33 */   public static Icon createWithData(byte[] data, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 34 */   public static Icon createWithContentUri(String uri) { throw new RuntimeException("Stub!"); }
/* 35 */   public static Icon createWithContentUri(Uri uri) { throw new RuntimeException("Stub!"); }
/* 36 */   public Icon setTint(int tint) { throw new RuntimeException("Stub!"); }
/* 37 */   public Icon setTintList(ColorStateList tintList) { throw new RuntimeException("Stub!"); }
/* 38 */   public Icon setTintMode(PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); }
/* 39 */   public static Icon createWithFilePath(String path) { throw new RuntimeException("Stub!"); }
/* 40 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 41 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 42 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 44 */   public static final Parcelable.Creator<Icon> CREATOR = null;
/*    */   
/*    */   public static abstract interface OnDrawableLoadedListener
/*    */   {
/*    */     public abstract void onDrawableLoaded(Drawable paramDrawable);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\drawable\Icon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */