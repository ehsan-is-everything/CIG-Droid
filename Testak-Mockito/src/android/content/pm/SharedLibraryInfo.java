/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ 
/*    */ 
/*    */ public final class SharedLibraryInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   SharedLibraryInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getVersion() { throw new RuntimeException("Stub!"); }
/* 25 */   public VersionedPackage getDeclaringPackage() { throw new RuntimeException("Stub!"); }
/* 26 */   public List<VersionedPackage> getDependentPackages() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 29 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 35 */   public static final Parcelable.Creator<SharedLibraryInfo> CREATOR = null;
/*    */   public static final int TYPE_BUILTIN = 0;
/*    */   public static final int TYPE_DYNAMIC = 1;
/*    */   public static final int TYPE_STATIC = 2;
/*    */   public static final int VERSION_UNDEFINED = -1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\pm\SharedLibraryInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */