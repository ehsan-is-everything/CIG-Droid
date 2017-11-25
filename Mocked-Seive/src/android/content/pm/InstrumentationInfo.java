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
/*    */ public class InstrumentationInfo
/*    */   extends PackageItemInfo
/*    */   implements Parcelable
/*    */ {
/* 22 */   public InstrumentationInfo() { throw new RuntimeException("Stub!"); }
/* 23 */   public InstrumentationInfo(InstrumentationInfo orig) { throw new RuntimeException("Stub!"); }
/* 24 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 33 */   public String[] splitNames = null;
/* 34 */   public String[] splitPublicSourceDirs = null;
/* 35 */   public String[] splitSourceDirs = null;
/*    */   
/*    */ 
/* 38 */   public static final Parcelable.Creator<InstrumentationInfo> CREATOR = null;
/*    */   public String dataDir;
/*    */   public boolean functionalTest;
/*    */   public boolean handleProfiling;
/*    */   public String publicSourceDir;
/*    */   public String sourceDir;
/*    */   public String targetPackage;
/*    */   public String targetProcesses;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\InstrumentationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */