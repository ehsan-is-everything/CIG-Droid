/*    */ package android.hardware.camera2.params;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Size;
/*    */ import android.view.Surface;
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
/*    */ public final class OutputConfiguration
/*    */   implements Parcelable
/*    */ {
/* 22 */   public OutputConfiguration(Surface surface) { throw new RuntimeException("Stub!"); }
/* 23 */   public OutputConfiguration(int surfaceGroupId, Surface surface) { throw new RuntimeException("Stub!"); }
/* 24 */   public <T> OutputConfiguration(Size surfaceSize, Class<T> klass) { throw new RuntimeException("Stub!"); }
/* 25 */   public void enableSurfaceSharing() { throw new RuntimeException("Stub!"); }
/* 26 */   public void addSurface(Surface surface) { throw new RuntimeException("Stub!"); }
/* 27 */   public Surface getSurface() { throw new RuntimeException("Stub!"); }
/* 28 */   public List<Surface> getSurfaces() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getSurfaceGroupId() { throw new RuntimeException("Stub!"); }
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 31 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 33 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 36 */   public static final Parcelable.Creator<OutputConfiguration> CREATOR = null;
/*    */   public static final int SURFACE_GROUP_ID_NONE = -1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\camera2\params\OutputConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */