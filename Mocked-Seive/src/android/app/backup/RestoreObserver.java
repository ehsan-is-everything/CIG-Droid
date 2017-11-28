/*    */ package android.app.backup;
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
/*    */ public abstract class RestoreObserver
/*    */ {
/* 20 */   public RestoreObserver() { throw new RuntimeException("Stub!"); }
/* 21 */   public void restoreStarting(int numPackages) { throw new RuntimeException("Stub!"); }
/* 22 */   public void onUpdate(int nowBeingRestored, String currentPackage) { throw new RuntimeException("Stub!"); }
/* 23 */   public void restoreFinished(int error) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\backup\RestoreObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */