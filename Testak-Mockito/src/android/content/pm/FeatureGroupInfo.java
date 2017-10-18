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
/*    */ public final class FeatureGroupInfo
/*    */   implements Parcelable
/*    */ {
/* 20 */   public FeatureGroupInfo() { throw new RuntimeException("Stub!"); }
/* 21 */   public FeatureGroupInfo(FeatureGroupInfo other) { throw new RuntimeException("Stub!"); }
/* 22 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 23 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 25 */   public FeatureInfo[] features = null;
/* 26 */   public static final Parcelable.Creator<FeatureGroupInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\pm\FeatureGroupInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */