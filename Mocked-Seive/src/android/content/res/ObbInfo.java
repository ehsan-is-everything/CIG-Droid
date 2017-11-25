/*    */ package android.content.res;
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
/*    */ public class ObbInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   ObbInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 23 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 24 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 31 */   public static final Parcelable.Creator<ObbInfo> CREATOR = null;
/*    */   public static final int OBB_OVERLAY = 1;
/*    */   public String filename;
/*    */   public int flags;
/*    */   public String packageName;
/*    */   public int version;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\res\ObbInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */