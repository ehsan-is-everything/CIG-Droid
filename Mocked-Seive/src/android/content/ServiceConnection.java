/*    */ package android.content;
/*    */ 
/*    */ import android.os.IBinder;
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
/*    */ public abstract interface ServiceConnection
/*    */ {
/*    */   public abstract void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder);
/*    */   
/*    */   public abstract void onServiceDisconnected(ComponentName paramComponentName);
/*    */   
/*    */   public void onBindingDied(ComponentName name)
/*    */   {
/* 22 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\ServiceConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */