/*    */ package android.content.pm;
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
/*    */ public class FeatureInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public FeatureInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public FeatureInfo(FeatureInfo orig) { throw new RuntimeException("Stub!"); }
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/* 26 */   public String getGlEsVersion() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 34 */   public static final Parcelable.Creator<FeatureInfo> CREATOR = null;
/*    */   public static final int FLAG_REQUIRED = 1;
/*    */   public static final int GL_ES_VERSION_UNDEFINED = 0;
/*    */   public int flags;
/*    */   public String name;
/*    */   public int reqGlEsVersion;
/*    */   public int version;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\FeatureInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */