/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.List;
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
/*    */ public final class KeyboardShortcutGroup
/*    */   implements Parcelable
/*    */ {
/* 20 */   public KeyboardShortcutGroup(CharSequence label, List<KeyboardShortcutInfo> items) { throw new RuntimeException("Stub!"); }
/* 21 */   public KeyboardShortcutGroup(CharSequence label) { throw new RuntimeException("Stub!"); }
/* 22 */   public CharSequence getLabel() { throw new RuntimeException("Stub!"); }
/* 23 */   public List<KeyboardShortcutInfo> getItems() { throw new RuntimeException("Stub!"); }
/* 24 */   public void addItem(KeyboardShortcutInfo item) { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 28 */   public static final Parcelable.Creator<KeyboardShortcutGroup> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\KeyboardShortcutGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */