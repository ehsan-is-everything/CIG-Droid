/*    */ package java.io;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class FileDescriptor
/*    */ {
/* 29 */   public FileDescriptor() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean valid() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 35 */   public static final FileDescriptor out = null; public static final FileDescriptor in = null; public static final FileDescriptor err = null;
/*    */   
/*    */   public native void sync()
/*    */     throws SyncFailedException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\FileDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */