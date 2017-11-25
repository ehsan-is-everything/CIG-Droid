/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.IntentFilter;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ResolveInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static class DisplayNameComparator
/*    */     implements Comparator<ResolveInfo>
/*    */   {
/* 24 */     public DisplayNameComparator(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 25 */     public final int compare(ResolveInfo a, ResolveInfo b) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 27 */   public ResolveInfo() { throw new RuntimeException("Stub!"); }
/* 28 */   public ResolveInfo(ResolveInfo orig) { throw new RuntimeException("Stub!"); }
/* 29 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 30 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 31 */   public final int getIconResource() { throw new RuntimeException("Stub!"); }
/* 32 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 33 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 34 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 35 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
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
/* 51 */   public static final Parcelable.Creator<ResolveInfo> CREATOR = null;
/*    */   public ActivityInfo activityInfo;
/*    */   public IntentFilter filter;
/*    */   public int icon;
/*    */   public boolean isDefault;
/*    */   public boolean isInstantAppAvailable;
/*    */   public int labelRes;
/*    */   public int match;
/*    */   public CharSequence nonLocalizedLabel;
/*    */   public int preferredOrder;
/*    */   public int priority;
/*    */   public ProviderInfo providerInfo;
/*    */   public String resolvePackageName;
/*    */   public ServiceInfo serviceInfo;
/*    */   public int specificIndex;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\ResolveInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */