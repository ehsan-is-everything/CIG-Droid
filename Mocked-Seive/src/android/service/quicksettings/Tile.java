/*    */ package android.service.quicksettings;
/*    */ 
/*    */ import android.graphics.drawable.Icon;
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
/*    */ public final class Tile
/*    */   implements Parcelable
/*    */ {
/* 20 */   Tile() { throw new RuntimeException("Stub!"); }
/* 21 */   public int getState() { throw new RuntimeException("Stub!"); }
/* 22 */   public void setState(int state) { throw new RuntimeException("Stub!"); }
/* 23 */   public Icon getIcon() { throw new RuntimeException("Stub!"); }
/* 24 */   public void setIcon(Icon icon) { throw new RuntimeException("Stub!"); }
/* 25 */   public CharSequence getLabel() { throw new RuntimeException("Stub!"); }
/* 26 */   public void setLabel(CharSequence label) { throw new RuntimeException("Stub!"); }
/* 27 */   public CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setContentDescription(CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
/* 29 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 30 */   public void updateTile() { throw new RuntimeException("Stub!"); }
/* 31 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 36 */   public static final Parcelable.Creator<Tile> CREATOR = null;
/*    */   public static final int STATE_ACTIVE = 2;
/*    */   public static final int STATE_INACTIVE = 1;
/*    */   public static final int STATE_UNAVAILABLE = 0;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\quicksettings\Tile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */