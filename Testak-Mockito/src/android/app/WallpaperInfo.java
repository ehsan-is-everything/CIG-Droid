/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.content.pm.ServiceInfo;
/*    */ import android.content.res.Resources.NotFoundException;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.net.Uri;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.util.Printer;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ 
/*    */ public final class WallpaperInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public WallpaperInfo(Context context, ResolveInfo service) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 22 */   public String getPackageName() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getServiceName() { throw new RuntimeException("Stub!"); }
/* 24 */   public ServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); }
/* 25 */   public ComponentName getComponent() { throw new RuntimeException("Stub!"); }
/* 26 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 27 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 28 */   public Drawable loadThumbnail(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 29 */   public CharSequence loadAuthor(PackageManager pm) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 30 */   public CharSequence loadDescription(PackageManager pm) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 31 */   public Uri loadContextUri(PackageManager pm) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 32 */   public CharSequence loadContextDescription(PackageManager pm) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean getShowMetadataInPreview() { throw new RuntimeException("Stub!"); }
/* 34 */   public String getSettingsActivity() { throw new RuntimeException("Stub!"); }
/* 35 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 36 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 37 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 38 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 40 */   public static final android.os.Parcelable.Creator<WallpaperInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\WallpaperInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */