/*     */ package android.view;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.os.Vibrator;
/*     */ import java.util.List;
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
/*     */ public final class InputDevice
/*     */   implements Parcelable
/*     */ {
/*     */   public static final class MotionRange
/*     */   {
/*  23 */     MotionRange() { throw new RuntimeException("Stub!"); }
/*  24 */     public int getAxis() { throw new RuntimeException("Stub!"); }
/*  25 */     public int getSource() { throw new RuntimeException("Stub!"); }
/*  26 */     public boolean isFromSource(int source) { throw new RuntimeException("Stub!"); }
/*  27 */     public float getMin() { throw new RuntimeException("Stub!"); }
/*  28 */     public float getMax() { throw new RuntimeException("Stub!"); }
/*  29 */     public float getRange() { throw new RuntimeException("Stub!"); }
/*  30 */     public float getFlat() { throw new RuntimeException("Stub!"); }
/*  31 */     public float getFuzz() { throw new RuntimeException("Stub!"); }
/*  32 */     public float getResolution() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  34 */   InputDevice() { throw new RuntimeException("Stub!"); }
/*  35 */   public static InputDevice getDevice(int id) { throw new RuntimeException("Stub!"); }
/*  36 */   public static int[] getDeviceIds() { throw new RuntimeException("Stub!"); }
/*  37 */   public int getId() { throw new RuntimeException("Stub!"); }
/*  38 */   public int getControllerNumber() { throw new RuntimeException("Stub!"); }
/*  39 */   public int getVendorId() { throw new RuntimeException("Stub!"); }
/*  40 */   public int getProductId() { throw new RuntimeException("Stub!"); }
/*  41 */   public String getDescriptor() { throw new RuntimeException("Stub!"); }
/*  42 */   public boolean isVirtual() { throw new RuntimeException("Stub!"); }
/*  43 */   public String getName() { throw new RuntimeException("Stub!"); }
/*  44 */   public int getSources() { throw new RuntimeException("Stub!"); }
/*  45 */   public boolean supportsSource(int source) { throw new RuntimeException("Stub!"); }
/*  46 */   public int getKeyboardType() { throw new RuntimeException("Stub!"); }
/*  47 */   public KeyCharacterMap getKeyCharacterMap() { throw new RuntimeException("Stub!"); }
/*  48 */   public boolean[] hasKeys(int... keys) { throw new RuntimeException("Stub!"); }
/*  49 */   public MotionRange getMotionRange(int axis) { throw new RuntimeException("Stub!"); }
/*  50 */   public MotionRange getMotionRange(int axis, int source) { throw new RuntimeException("Stub!"); }
/*  51 */   public List<MotionRange> getMotionRanges() { throw new RuntimeException("Stub!"); }
/*  52 */   public Vibrator getVibrator() { throw new RuntimeException("Stub!"); }
/*  53 */   public boolean hasMicrophone() { throw new RuntimeException("Stub!"); }
/*  54 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*  55 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*  56 */   public String toString() { throw new RuntimeException("Stub!"); }
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
/* 102 */   public static final Parcelable.Creator<InputDevice> CREATOR = null;
/*     */   public static final int KEYBOARD_TYPE_ALPHABETIC = 2;
/*     */   public static final int KEYBOARD_TYPE_NONE = 0;
/*     */   public static final int KEYBOARD_TYPE_NON_ALPHABETIC = 1;
/*     */   @Deprecated
/*     */   public static final int MOTION_RANGE_ORIENTATION = 8;
/*     */   @Deprecated
/*     */   public static final int MOTION_RANGE_PRESSURE = 2;
/*     */   @Deprecated
/*     */   public static final int MOTION_RANGE_SIZE = 3;
/*     */   @Deprecated
/*     */   public static final int MOTION_RANGE_TOOL_MAJOR = 6;
/*     */   @Deprecated
/*     */   public static final int MOTION_RANGE_TOOL_MINOR = 7;
/*     */   @Deprecated
/*     */   public static final int MOTION_RANGE_TOUCH_MAJOR = 4;
/*     */   @Deprecated
/*     */   public static final int MOTION_RANGE_TOUCH_MINOR = 5;
/*     */   @Deprecated
/*     */   public static final int MOTION_RANGE_X = 0;
/*     */   @Deprecated
/*     */   public static final int MOTION_RANGE_Y = 1;
/*     */   public static final int SOURCE_ANY = -256;
/*     */   public static final int SOURCE_BLUETOOTH_STYLUS = 49154;
/*     */   public static final int SOURCE_CLASS_BUTTON = 1;
/*     */   public static final int SOURCE_CLASS_JOYSTICK = 16;
/*     */   public static final int SOURCE_CLASS_MASK = 255;
/*     */   public static final int SOURCE_CLASS_NONE = 0;
/*     */   public static final int SOURCE_CLASS_POINTER = 2;
/*     */   public static final int SOURCE_CLASS_POSITION = 8;
/*     */   public static final int SOURCE_CLASS_TRACKBALL = 4;
/*     */   public static final int SOURCE_DPAD = 513;
/*     */   public static final int SOURCE_GAMEPAD = 1025;
/*     */   public static final int SOURCE_HDMI = 33554433;
/*     */   public static final int SOURCE_JOYSTICK = 16777232;
/*     */   public static final int SOURCE_KEYBOARD = 257;
/*     */   public static final int SOURCE_MOUSE = 8194;
/*     */   public static final int SOURCE_MOUSE_RELATIVE = 131076;
/*     */   public static final int SOURCE_ROTARY_ENCODER = 4194304;
/*     */   public static final int SOURCE_STYLUS = 16386;
/*     */   public static final int SOURCE_TOUCHPAD = 1048584;
/*     */   public static final int SOURCE_TOUCHSCREEN = 4098;
/*     */   public static final int SOURCE_TOUCH_NAVIGATION = 2097152;
/*     */   public static final int SOURCE_TRACKBALL = 65540;
/*     */   public static final int SOURCE_UNKNOWN = 0;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\InputDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */