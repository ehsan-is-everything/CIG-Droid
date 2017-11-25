/*    */ package android.view;
/*    */ 
/*    */ import android.content.ClipData;
/*    */ import android.content.ClipDescription;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DragEvent
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int ACTION_DRAG_ENDED = 4;
/*    */   public static final int ACTION_DRAG_ENTERED = 5;
/*    */   public static final int ACTION_DRAG_EXITED = 6;
/*    */   public static final int ACTION_DRAG_LOCATION = 2;
/*    */   public static final int ACTION_DRAG_STARTED = 1;
/*    */   public static final int ACTION_DROP = 3;
/*    */   
/* 21 */   DragEvent() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getAction() { throw new RuntimeException("Stub!"); }
/* 23 */   public float getX() { throw new RuntimeException("Stub!"); }
/* 24 */   public float getY() { throw new RuntimeException("Stub!"); }
/* 25 */   public ClipData getClipData() { throw new RuntimeException("Stub!"); }
/* 26 */   public ClipDescription getClipDescription() { throw new RuntimeException("Stub!"); }
/* 27 */   public Object getLocalState() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean getResult() { throw new RuntimeException("Stub!"); }
/* 29 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 31 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 39 */   public static final Parcelable.Creator<DragEvent> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\DragEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */