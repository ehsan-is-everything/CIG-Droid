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
/*    */ public class ClipData
/*    */   implements Parcelable
/*    */ {
/*    */   public static class Item
/*    */   {
/* 23 */     public Item(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 24 */     public Item(CharSequence text, String htmlText) { throw new RuntimeException("Stub!"); }
/* 25 */     public Item(Intent intent) { throw new RuntimeException("Stub!"); }
/* 26 */     public Item(Uri uri) { throw new RuntimeException("Stub!"); }
/* 27 */     public Item(CharSequence text, Intent intent, Uri uri) { throw new RuntimeException("Stub!"); }
/* 28 */     public Item(CharSequence text, String htmlText, Intent intent, Uri uri) { throw new RuntimeException("Stub!"); }
/* 29 */     public CharSequence getText() { throw new RuntimeException("Stub!"); }
/* 30 */     public String getHtmlText() { throw new RuntimeException("Stub!"); }
/* 31 */     public Intent getIntent() { throw new RuntimeException("Stub!"); }
/* 32 */     public Uri getUri() { throw new RuntimeException("Stub!"); }
/* 33 */     public CharSequence coerceToText(Context context) { throw new RuntimeException("Stub!"); }
/* 34 */     public CharSequence coerceToStyledText(Context context) { throw new RuntimeException("Stub!"); }
/* 35 */     public String coerceToHtmlText(Context context) { throw new RuntimeException("Stub!"); }
/* 36 */     public String toString() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 38 */   public ClipData(CharSequence label, String[] mimeTypes, Item item) { throw new RuntimeException("Stub!"); }
/* 39 */   public ClipData(ClipDescription description, Item item) { throw new RuntimeException("Stub!"); }
/* 40 */   public ClipData(ClipData other) { throw new RuntimeException("Stub!"); }
/* 41 */   public static ClipData newPlainText(CharSequence label, CharSequence text) { throw new RuntimeException("Stub!"); }
/* 42 */   public static ClipData newHtmlText(CharSequence label, CharSequence text, String htmlText) { throw new RuntimeException("Stub!"); }
/* 43 */   public static ClipData newIntent(CharSequence label, Intent intent) { throw new RuntimeException("Stub!"); }
/* 44 */   public static ClipData newUri(ContentResolver resolver, CharSequence label, Uri uri) { throw new RuntimeException("Stub!"); }
/* 45 */   public static ClipData newRawUri(CharSequence label, Uri uri) { throw new RuntimeException("Stub!"); }
/* 46 */   public ClipDescription getDescription() { throw new RuntimeException("Stub!"); }
/* 47 */   public void addItem(Item item) { throw new RuntimeException("Stub!"); }
/* 48 */   public void addItem(ContentResolver resolver, Item item) { throw new RuntimeException("Stub!"); }
/* 49 */   public int getItemCount() { throw new RuntimeException("Stub!"); }
/* 50 */   public Item getItemAt(int index) { throw new RuntimeException("Stub!"); }
/* 51 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 52 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 53 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 55 */   public static final Parcelable.Creator<ClipData> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\ClipData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */