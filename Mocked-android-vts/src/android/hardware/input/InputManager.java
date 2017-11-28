/*    */ package android.hardware.input;
/*    */ 
/*    */ import android.os.Handler;
/*    */ import android.view.InputDevice;
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
/*    */ 
/*    */ public final class InputManager
/*    */ {
/*    */   public static final String ACTION_QUERY_KEYBOARD_LAYOUTS = "android.hardware.input.action.QUERY_KEYBOARD_LAYOUTS";
/*    */   public static final String META_DATA_KEYBOARD_LAYOUTS = "android.hardware.input.metadata.KEYBOARD_LAYOUTS";
/*    */   
/* 26 */   InputManager() { throw new RuntimeException("Stub!"); }
/* 27 */   public InputDevice getInputDevice(int id) { throw new RuntimeException("Stub!"); }
/* 28 */   public int[] getInputDeviceIds() { throw new RuntimeException("Stub!"); }
/* 29 */   public void registerInputDeviceListener(InputDeviceListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 30 */   public void unregisterInputDeviceListener(InputDeviceListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface InputDeviceListener
/*    */   {
/*    */     public abstract void onInputDeviceAdded(int paramInt);
/*    */     
/*    */     public abstract void onInputDeviceRemoved(int paramInt);
/*    */     
/*    */     public abstract void onInputDeviceChanged(int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\input\InputManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */