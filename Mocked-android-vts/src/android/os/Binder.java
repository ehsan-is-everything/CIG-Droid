/*    */ package android.os;
/*    */ 
/*    */ import java.io.FileDescriptor;
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
/*    */ public class Binder
/*    */   implements IBinder
/*    */ {
/* 21 */   public Binder() { throw new RuntimeException("Stub!"); }
/*    */   public static final native int getCallingPid();
/*    */   public static final native int getCallingUid();
/* 24 */   public static final UserHandle getCallingUserHandle() { throw new RuntimeException("Stub!"); }
/*    */   public static final native long clearCallingIdentity();
/*    */   public static final native void restoreCallingIdentity(long paramLong);
/*    */   public static final native void flushPendingCommands();
/*    */   public static final native void joinThreadPool();
/* 29 */   public void attachInterface(IInterface owner, String descriptor) { throw new RuntimeException("Stub!"); }
/* 30 */   public String getInterfaceDescriptor() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean pingBinder() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isBinderAlive() { throw new RuntimeException("Stub!"); }
/* 33 */   public IInterface queryLocalInterface(String descriptor) { throw new RuntimeException("Stub!"); }
/* 34 */   protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 35 */   public void dump(FileDescriptor fd, String[] args) { throw new RuntimeException("Stub!"); }
/* 36 */   public void dumpAsync(FileDescriptor fd, String[] args) { throw new RuntimeException("Stub!"); }
/* 37 */   protected void dump(FileDescriptor fd, PrintWriter fout, String[] args) { throw new RuntimeException("Stub!"); }
/* 38 */   public final boolean transact(int code, Parcel data, Parcel reply, int flags) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 39 */   public void linkToDeath(IBinder.DeathRecipient recipient, int flags) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean unlinkToDeath(IBinder.DeathRecipient recipient, int flags) { throw new RuntimeException("Stub!"); }
/* 41 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\Binder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */