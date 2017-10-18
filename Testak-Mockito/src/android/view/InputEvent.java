/*    */ package android.view;
/*    */ 
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
/*    */ 
/*    */ public abstract class InputEvent
/*    */   implements Parcelable
/*    */ {
/* 21 */   InputEvent() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getDeviceId();
/* 23 */   public final InputDevice getDevice() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getSource();
/* 25 */   public boolean isFromSource(int source) { throw new RuntimeException("Stub!"); }
/*    */   public abstract long getEventTime();
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 29 */   public static final Parcelable.Creator<InputEvent> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\InputEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */