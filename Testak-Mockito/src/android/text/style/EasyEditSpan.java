/*    */ package android.text.style;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.os.Parcel;
/*    */ import android.text.ParcelableSpan;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EasyEditSpan
/*    */   implements ParcelableSpan
/*    */ {
/*    */   public static final String EXTRA_TEXT_CHANGED_TYPE = "android.text.style.EXTRA_TEXT_CHANGED_TYPE";
/*    */   public static final int TEXT_DELETED = 1;
/*    */   public static final int TEXT_MODIFIED = 2;
/*    */   
/* 21 */   public EasyEditSpan() { throw new RuntimeException("Stub!"); }
/* 22 */   public EasyEditSpan(PendingIntent pendingIntent) { throw new RuntimeException("Stub!"); }
/* 23 */   public EasyEditSpan(Parcel source) { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\style\EasyEditSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */