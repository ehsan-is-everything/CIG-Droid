/*    */ package android.content;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.PersistableBundle;
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
/*    */ public class ClipDescription
/*    */   implements Parcelable
/*    */ {
/* 21 */   public ClipDescription(CharSequence label, String[] mimeTypes) { throw new RuntimeException("Stub!"); }
/* 22 */   public ClipDescription(ClipDescription o) { throw new RuntimeException("Stub!"); }
/* 23 */   public static boolean compareMimeTypes(String concreteType, String desiredType) { throw new RuntimeException("Stub!"); }
/* 24 */   public long getTimestamp() { throw new RuntimeException("Stub!"); }
/* 25 */   public CharSequence getLabel() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean hasMimeType(String mimeType) { throw new RuntimeException("Stub!"); }
/* 27 */   public String[] filterMimeTypes(String mimeType) { throw new RuntimeException("Stub!"); }
/* 28 */   public int getMimeTypeCount() { throw new RuntimeException("Stub!"); }
/* 29 */   public String getMimeType(int index) { throw new RuntimeException("Stub!"); }
/* 30 */   public PersistableBundle getExtras() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setExtras(PersistableBundle extras) { throw new RuntimeException("Stub!"); }
/* 32 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 40 */   public static final Parcelable.Creator<ClipDescription> CREATOR = null;
/*    */   public static final String MIMETYPE_TEXT_HTML = "text/html";
/*    */   public static final String MIMETYPE_TEXT_INTENT = "text/vnd.android.intent";
/*    */   public static final String MIMETYPE_TEXT_PLAIN = "text/plain";
/*    */   public static final String MIMETYPE_TEXT_URILIST = "text/uri-list";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\ClipDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */