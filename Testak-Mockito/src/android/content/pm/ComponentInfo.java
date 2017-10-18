/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.util.Printer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ComponentInfo
/*    */   extends PackageItemInfo
/*    */ {
/*    */   public ApplicationInfo applicationInfo;
/*    */   public int descriptionRes;
/*    */   public boolean directBootAware;
/*    */   public boolean enabled;
/*    */   public boolean exported;
/*    */   public String processName;
/*    */   public String splitName;
/*    */   
/* 21 */   public ComponentInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public ComponentInfo(ComponentInfo orig) { throw new RuntimeException("Stub!"); }
/* 23 */   protected ComponentInfo(Parcel source) { throw new RuntimeException("Stub!"); }
/* 24 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 26 */   public final int getIconResource() { throw new RuntimeException("Stub!"); }
/* 27 */   public final int getLogoResource() { throw new RuntimeException("Stub!"); }
/* 28 */   public final int getBannerResource() { throw new RuntimeException("Stub!"); }
/* 29 */   protected void dumpFront(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 30 */   protected void dumpBack(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 31 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\pm\ComponentInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */