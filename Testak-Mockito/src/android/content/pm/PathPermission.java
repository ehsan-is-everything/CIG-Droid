/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.PatternMatcher;
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
/*    */ public class PathPermission
/*    */   extends PatternMatcher
/*    */ {
/*    */   public PathPermission(String pattern, int type, String readPermission, String writePermission)
/*    */   {
/* 21 */     super((Parcel)null);throw new RuntimeException("Stub!"); }
/* 22 */   public PathPermission(Parcel src) { super((Parcel)null);throw new RuntimeException("Stub!"); }
/* 23 */   public String getReadPermission() { throw new RuntimeException("Stub!"); }
/* 24 */   public String getWritePermission() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 27 */   public static final Parcelable.Creator<PathPermission> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\pm\PathPermission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */