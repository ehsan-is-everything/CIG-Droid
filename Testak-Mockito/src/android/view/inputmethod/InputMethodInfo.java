/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.content.pm.ServiceInfo;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class InputMethodInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public InputMethodInfo(Context context, ResolveInfo service) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 22 */   public InputMethodInfo(String packageName, String className, CharSequence label, String settingsActivity) { throw new RuntimeException("Stub!"); }
/* 23 */   public String getId() { throw new RuntimeException("Stub!"); }
/* 24 */   public String getPackageName() { throw new RuntimeException("Stub!"); }
/* 25 */   public String getServiceName() { throw new RuntimeException("Stub!"); }
/* 26 */   public ServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); }
/* 27 */   public ComponentName getComponent() { throw new RuntimeException("Stub!"); }
/* 28 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 29 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 30 */   public String getSettingsActivity() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getSubtypeCount() { throw new RuntimeException("Stub!"); }
/* 32 */   public InputMethodSubtype getSubtypeAt(int index) { throw new RuntimeException("Stub!"); }
/* 33 */   public int getIsDefaultResourceId() { throw new RuntimeException("Stub!"); }
/* 34 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 37 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 38 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 39 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 41 */   public static final Parcelable.Creator<InputMethodInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\inputmethod\InputMethodInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */