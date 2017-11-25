/*    */ package android.os;
/*    */ 
/*    */ import java.io.PrintWriter;
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
/*    */ public abstract class TokenWatcher
/*    */ {
/* 20 */   public TokenWatcher(Handler h, String tag) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void acquired();
/*    */   public abstract void released();
/* 23 */   public void acquire(IBinder token, String tag) { throw new RuntimeException("Stub!"); }
/* 24 */   public void cleanup(IBinder token, boolean unlink) { throw new RuntimeException("Stub!"); }
/* 25 */   public void release(IBinder token) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isAcquired() { throw new RuntimeException("Stub!"); }
/* 27 */   public void dump() { throw new RuntimeException("Stub!"); }
/* 28 */   public void dump(PrintWriter pw) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\TokenWatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */