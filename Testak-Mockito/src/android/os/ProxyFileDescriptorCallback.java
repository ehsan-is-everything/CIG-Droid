/*    */ package android.os;
/*    */ 
/*    */ import android.system.ErrnoException;
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
/*    */ public abstract class ProxyFileDescriptorCallback
/*    */ {
/* 20 */   public ProxyFileDescriptorCallback() { throw new RuntimeException("Stub!"); }
/* 21 */   public long onGetSize() throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 22 */   public int onRead(long offset, int size, byte[] data) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 23 */   public int onWrite(long offset, int size, byte[] data) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 24 */   public void onFsync() throws ErrnoException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void onRelease();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\ProxyFileDescriptorCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */