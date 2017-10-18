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
/*    */ public class ConfigurationInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public ConfigurationInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public ConfigurationInfo(ConfigurationInfo orig) { throw new RuntimeException("Stub!"); }
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/* 26 */   public String getGlEsVersion() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 36 */   public static final Parcelable.Creator<ConfigurationInfo> CREATOR = null;
/*    */   public static final int GL_ES_VERSION_UNDEFINED = 0;
/*    */   public static final int INPUT_FEATURE_FIVE_WAY_NAV = 2;
/*    */   public static final int INPUT_FEATURE_HARD_KEYBOARD = 1;
/*    */   public int reqGlEsVersion;
/*    */   public int reqInputFeatures;
/*    */   public int reqKeyboardType;
/*    */   public int reqNavigation;
/*    */   public int reqTouchScreen;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\pm\ConfigurationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */