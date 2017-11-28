/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.AndroidRuntimeException;
/*    */ 
/*    */ public class KeyCharacterMap implements Parcelable
/*    */ {
/*    */   public static final int ALPHA = 3;
/*    */   @Deprecated
/*    */   public static final int BUILT_IN_KEYBOARD = 0;
/*    */   public static final int COMBINING_ACCENT = Integer.MIN_VALUE;
/*    */   public static final int COMBINING_ACCENT_MASK = Integer.MAX_VALUE;
/*    */   
/*    */   @Deprecated
/*    */   public static class KeyData
/*    */   {
/*    */     public static final int META_LENGTH = 4;
/*    */     public char displayLabel;
/*    */     
/*    */     public KeyData()
/*    */     {
/* 24 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */     
/* 27 */     public char[] meta = null;
/*    */     public char number;
/*    */   }
/*    */   
/*    */   public static class UnavailableException
/*    */     extends AndroidRuntimeException {
/* 33 */     public UnavailableException(String msg) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 35 */   KeyCharacterMap() { throw new RuntimeException("Stub!"); }
/* 36 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 37 */   public static KeyCharacterMap load(int deviceId) { throw new RuntimeException("Stub!"); }
/* 38 */   public int get(int keyCode, int metaState) { throw new RuntimeException("Stub!"); }
/* 39 */   public char getNumber(int keyCode) { throw new RuntimeException("Stub!"); }
/* 40 */   public char getMatch(int keyCode, char[] chars) { throw new RuntimeException("Stub!"); }
/* 41 */   public char getMatch(int keyCode, char[] chars, int metaState) { throw new RuntimeException("Stub!"); }
/* 42 */   public char getDisplayLabel(int keyCode) { throw new RuntimeException("Stub!"); }
/* 43 */   public static int getDeadChar(int accent, int c) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 45 */   public boolean getKeyData(int keyCode, KeyData results) { throw new RuntimeException("Stub!"); }
/* 46 */   public KeyEvent[] getEvents(char[] chars) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isPrintingKey(int keyCode) { throw new RuntimeException("Stub!"); }
/* 48 */   public int getKeyboardType() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getModifierBehavior() { throw new RuntimeException("Stub!"); }
/* 50 */   public static boolean deviceHasKey(int keyCode) { throw new RuntimeException("Stub!"); }
/* 51 */   public static boolean[] deviceHasKeys(int[] keyCodes) { throw new RuntimeException("Stub!"); }
/* 52 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 53 */   public int describeContents() { throw new RuntimeException("Stub!"); }
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
/* 69 */   public static final Parcelable.Creator<KeyCharacterMap> CREATOR = null;
/*    */   public static final int FULL = 4;
/*    */   public static final char HEX_INPUT = '';
/*    */   public static final int MODIFIER_BEHAVIOR_CHORDED = 0;
/*    */   public static final int MODIFIER_BEHAVIOR_CHORDED_OR_TOGGLED = 1;
/*    */   public static final int NUMERIC = 1;
/*    */   public static final char PICKER_DIALOG_INPUT = '';
/*    */   public static final int PREDICTIVE = 2;
/*    */   public static final int SPECIAL_FUNCTION = 5;
/*    */   public static final int VIRTUAL_KEYBOARD = -1;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\KeyCharacterMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */