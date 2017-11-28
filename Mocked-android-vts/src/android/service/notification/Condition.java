/*    */ package android.service.notification;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ import android.net.Uri.Builder;
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
/*    */ public final class Condition
/*    */   implements Parcelable
/*    */ {
/* 21 */   public Condition(Uri id, String summary, int state) { throw new RuntimeException("Stub!"); }
/* 22 */   public Condition(Uri id, String summary, String line1, String line2, int icon, int state, int flags) { throw new RuntimeException("Stub!"); }
/* 23 */   public Condition(Parcel source) { throw new RuntimeException("Stub!"); }
/* 24 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 25 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 26 */   public static String stateToString(int state) { throw new RuntimeException("Stub!"); }
/* 27 */   public static String relevanceToString(int flags) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 29 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 31 */   public Condition copy() { throw new RuntimeException("Stub!"); }
/* 32 */   public static Uri.Builder newId(Context context) { throw new RuntimeException("Stub!"); }
/* 33 */   public static boolean isValidId(Uri id, String pkg) { throw new RuntimeException("Stub!"); }
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
/*    */ 
/*    */ 
/*    */ 
/* 49 */   public static final Parcelable.Creator<Condition> CREATOR = null;
/*    */   public static final int FLAG_RELEVANT_ALWAYS = 2;
/*    */   public static final int FLAG_RELEVANT_NOW = 1;
/*    */   public static final String SCHEME = "condition";
/*    */   public static final int STATE_ERROR = 3;
/*    */   public static final int STATE_FALSE = 0;
/*    */   public static final int STATE_TRUE = 1;
/*    */   public static final int STATE_UNKNOWN = 2;
/*    */   public final int flags;
/*    */   public final int icon;
/*    */   public final Uri id;
/*    */   public final String line1;
/*    */   public final String line2;
/*    */   public final int state;
/*    */   public final String summary;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\notification\Condition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */