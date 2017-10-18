/*    */ package android.view;
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
/*    */ public final class KeyboardShortcutInfo
/*    */   implements Parcelable
/*    */ {
/* 20 */   public KeyboardShortcutInfo(CharSequence label, int keycode, int modifiers) { throw new RuntimeException("Stub!"); }
/* 21 */   public KeyboardShortcutInfo(CharSequence label, char baseCharacter, int modifiers) { throw new RuntimeException("Stub!"); }
/* 22 */   public CharSequence getLabel() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getKeycode() { throw new RuntimeException("Stub!"); }
/* 24 */   public char getBaseCharacter() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getModifiers() { throw new RuntimeException("Stub!"); }
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 29 */   public static final Parcelable.Creator<KeyboardShortcutInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\KeyboardShortcutInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */