/*    */ package android.view.textservice;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.ServiceInfo;
/*    */ import android.graphics.drawable.Drawable;
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
/*    */ public final class SpellCheckerInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   SpellCheckerInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public String getId() { throw new RuntimeException("Stub!"); }
/* 23 */   public ComponentName getComponent() { throw new RuntimeException("Stub!"); }
/* 24 */   public String getPackageName() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 27 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 28 */   public ServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); }
/* 29 */   public String getSettingsActivity() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getSubtypeCount() { throw new RuntimeException("Stub!"); }
/* 31 */   public SpellCheckerSubtype getSubtypeAt(int index) { throw new RuntimeException("Stub!"); }
/* 32 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 34 */   public static final Parcelable.Creator<SpellCheckerInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\textservice\SpellCheckerInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */