/*     */ package android.content.res;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ public final class Configuration
/*     */   implements android.os.Parcelable, Comparable<Configuration>
/*     */ {
/*     */   public static final int COLOR_MODE_HDR_MASK = 12;
/*     */   public static final int COLOR_MODE_HDR_NO = 4;
/*     */   public static final int COLOR_MODE_HDR_SHIFT = 2;
/*     */   public static final int COLOR_MODE_HDR_UNDEFINED = 0;
/*     */   public static final int COLOR_MODE_HDR_YES = 8;
/*     */   public static final int COLOR_MODE_UNDEFINED = 0;
/*     */   public static final int COLOR_MODE_WIDE_COLOR_GAMUT_MASK = 3;
/*     */   public static final int COLOR_MODE_WIDE_COLOR_GAMUT_NO = 1;
/*     */   public static final int COLOR_MODE_WIDE_COLOR_GAMUT_UNDEFINED = 0;
/*     */   public static final int COLOR_MODE_WIDE_COLOR_GAMUT_YES = 2;
/*     */   
/*  21 */   public Configuration() { throw new RuntimeException("Stub!"); }
/*  22 */   public Configuration(Configuration o) { throw new RuntimeException("Stub!"); }
/*  23 */   public boolean isLayoutSizeAtLeast(int size) { throw new RuntimeException("Stub!"); }
/*  24 */   public void setTo(Configuration o) { throw new RuntimeException("Stub!"); }
/*  25 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  26 */   public void setToDefaults() { throw new RuntimeException("Stub!"); }
/*  27 */   public int updateFrom(Configuration delta) { throw new RuntimeException("Stub!"); }
/*  28 */   public int diff(Configuration delta) { throw new RuntimeException("Stub!"); }
/*  29 */   public static boolean needNewResources(int configChanges, int interestingChanges) { throw new RuntimeException("Stub!"); }
/*  30 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*  31 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  32 */   public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); }
/*  33 */   public int compareTo(Configuration that) { throw new RuntimeException("Stub!"); }
/*  34 */   public boolean equals(Configuration that) { throw new RuntimeException("Stub!"); }
/*  35 */   public boolean equals(Object that) { throw new RuntimeException("Stub!"); }
/*  36 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*  37 */   public android.os.LocaleList getLocales() { throw new RuntimeException("Stub!"); }
/*  38 */   public void setLocales(android.os.LocaleList locales) { throw new RuntimeException("Stub!"); }
/*  39 */   public void setLocale(Locale loc) { throw new RuntimeException("Stub!"); }
/*  40 */   public int getLayoutDirection() { throw new RuntimeException("Stub!"); }
/*  41 */   public void setLayoutDirection(Locale loc) { throw new RuntimeException("Stub!"); }
/*  42 */   public boolean isScreenRound() { throw new RuntimeException("Stub!"); }
/*  43 */   public boolean isScreenWideColorGamut() { throw new RuntimeException("Stub!"); }
/*  44 */   public boolean isScreenHdr() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */   public static final android.os.Parcelable.Creator<Configuration> CREATOR = null;
/*     */   public static final int DENSITY_DPI_UNDEFINED = 0;
/*     */   public static final int HARDKEYBOARDHIDDEN_NO = 1;
/*     */   public static final int HARDKEYBOARDHIDDEN_UNDEFINED = 0;
/*     */   public static final int HARDKEYBOARDHIDDEN_YES = 2;
/*     */   public static final int KEYBOARDHIDDEN_NO = 1;
/*     */   public static final int KEYBOARDHIDDEN_UNDEFINED = 0;
/*     */   public static final int KEYBOARDHIDDEN_YES = 2;
/*     */   public static final int KEYBOARD_12KEY = 3;
/*     */   public static final int KEYBOARD_NOKEYS = 1;
/*     */   public static final int KEYBOARD_QWERTY = 2;
/*     */   public static final int KEYBOARD_UNDEFINED = 0;
/*     */   public static final int MNC_ZERO = 65535;
/*     */   public static final int NAVIGATIONHIDDEN_NO = 1;
/*     */   public static final int NAVIGATIONHIDDEN_UNDEFINED = 0;
/*     */   public static final int NAVIGATIONHIDDEN_YES = 2;
/*     */   public static final int NAVIGATION_DPAD = 2;
/*     */   public static final int NAVIGATION_NONAV = 1;
/*     */   public static final int NAVIGATION_TRACKBALL = 3;
/*     */   public static final int NAVIGATION_UNDEFINED = 0;
/*     */   public static final int NAVIGATION_WHEEL = 4;
/*     */   public static final int ORIENTATION_LANDSCAPE = 2;
/*     */   public static final int ORIENTATION_PORTRAIT = 1;
/*     */   @Deprecated
/*     */   public static final int ORIENTATION_SQUARE = 3;
/*     */   public static final int ORIENTATION_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_LTR = 64;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_MASK = 192;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_RTL = 128;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_SHIFT = 6;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_LONG_MASK = 48;
/*     */   public static final int SCREENLAYOUT_LONG_NO = 16;
/*     */   public static final int SCREENLAYOUT_LONG_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_LONG_YES = 32;
/*     */   public static final int SCREENLAYOUT_ROUND_MASK = 768;
/*     */   public static final int SCREENLAYOUT_ROUND_NO = 256;
/*     */   public static final int SCREENLAYOUT_ROUND_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_ROUND_YES = 512;
/*     */   public static final int SCREENLAYOUT_SIZE_LARGE = 3;
/*     */   public static final int SCREENLAYOUT_SIZE_MASK = 15;
/*     */   public static final int SCREENLAYOUT_SIZE_NORMAL = 2;
/*     */   public static final int SCREENLAYOUT_SIZE_SMALL = 1;
/*     */   public static final int SCREENLAYOUT_SIZE_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_SIZE_XLARGE = 4;
/*     */   public static final int SCREENLAYOUT_UNDEFINED = 0;
/*     */   public static final int SCREEN_HEIGHT_DP_UNDEFINED = 0;
/*     */   public static final int SCREEN_WIDTH_DP_UNDEFINED = 0;
/*     */   public static final int SMALLEST_SCREEN_WIDTH_DP_UNDEFINED = 0;
/*     */   public static final int TOUCHSCREEN_FINGER = 3;
/*     */   public static final int TOUCHSCREEN_NOTOUCH = 1;
/*     */   @Deprecated
/*     */   public static final int TOUCHSCREEN_STYLUS = 2;
/*     */   public static final int TOUCHSCREEN_UNDEFINED = 0;
/*     */   public static final int UI_MODE_NIGHT_MASK = 48;
/*     */   public static final int UI_MODE_NIGHT_NO = 16;
/*     */   public static final int UI_MODE_NIGHT_UNDEFINED = 0;
/*     */   public static final int UI_MODE_NIGHT_YES = 32;
/*     */   public static final int UI_MODE_TYPE_APPLIANCE = 5;
/*     */   public static final int UI_MODE_TYPE_CAR = 3;
/*     */   public static final int UI_MODE_TYPE_DESK = 2;
/*     */   public static final int UI_MODE_TYPE_MASK = 15;
/*     */   public static final int UI_MODE_TYPE_NORMAL = 1;
/*     */   public static final int UI_MODE_TYPE_TELEVISION = 4;
/*     */   public static final int UI_MODE_TYPE_UNDEFINED = 0;
/*     */   public static final int UI_MODE_TYPE_VR_HEADSET = 7;
/*     */   public static final int UI_MODE_TYPE_WATCH = 6;
/*     */   public int colorMode;
/*     */   public int densityDpi;
/*     */   public float fontScale;
/*     */   public int hardKeyboardHidden;
/*     */   public int keyboard;
/*     */   public int keyboardHidden;
/*     */   @Deprecated
/*     */   public Locale locale;
/*     */   public int mcc;
/*     */   public int mnc;
/*     */   public int navigation;
/*     */   public int navigationHidden;
/*     */   public int orientation;
/*     */   public int screenHeightDp;
/*     */   public int screenLayout;
/*     */   public int screenWidthDp;
/*     */   public int smallestScreenWidthDp;
/*     */   public int touchscreen;
/*     */   public int uiMode;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\res\Configuration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */