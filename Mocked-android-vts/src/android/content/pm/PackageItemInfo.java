/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.res.XmlResourceParser;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.util.Printer;
/*    */ 
/*    */ 
/*    */ public class PackageItemInfo
/*    */ {
/*    */   public int banner;
/*    */   public int icon;
/*    */   public int labelRes;
/*    */   public int logo;
/*    */   public android.os.Bundle metaData;
/*    */   public String name;
/*    */   public CharSequence nonLocalizedLabel;
/*    */   public String packageName;
/*    */   
/*    */   public static class DisplayNameComparator
/*    */     implements java.util.Comparator<PackageItemInfo>
/*    */   {
/* 23 */     public DisplayNameComparator(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 24 */     public final int compare(PackageItemInfo aa, PackageItemInfo ab) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 26 */   public PackageItemInfo() { throw new RuntimeException("Stub!"); }
/* 27 */   public PackageItemInfo(PackageItemInfo orig) { throw new RuntimeException("Stub!"); }
/* 28 */   protected PackageItemInfo(Parcel source) { throw new RuntimeException("Stub!"); }
/* 29 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 30 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 31 */   public Drawable loadUnbadgedIcon(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 32 */   public Drawable loadBanner(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 33 */   public Drawable loadLogo(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 34 */   public XmlResourceParser loadXmlMetaData(PackageManager pm, String name) { throw new RuntimeException("Stub!"); }
/* 35 */   protected void dumpFront(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 36 */   protected void dumpBack(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 37 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\PackageItemInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */