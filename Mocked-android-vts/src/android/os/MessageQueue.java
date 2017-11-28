/*    */ package android.os;
/*    */ 
/*    */ import java.io.FileDescriptor;
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
/*    */ public final class MessageQueue
/*    */ {
/* 31 */   MessageQueue() { throw new RuntimeException("Stub!"); }
/* 32 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isIdle() { throw new RuntimeException("Stub!"); }
/* 34 */   public void addIdleHandler(IdleHandler handler) { throw new RuntimeException("Stub!"); }
/* 35 */   public void removeIdleHandler(IdleHandler handler) { throw new RuntimeException("Stub!"); }
/* 36 */   public void addOnFileDescriptorEventListener(FileDescriptor fd, int events, OnFileDescriptorEventListener listener) { throw new RuntimeException("Stub!"); }
/* 37 */   public void removeOnFileDescriptorEventListener(FileDescriptor fd) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnFileDescriptorEventListener
/*    */   {
/*    */     public static final int EVENT_ERROR = 4;
/*    */     public static final int EVENT_INPUT = 1;
/*    */     public static final int EVENT_OUTPUT = 2;
/*    */     
/*    */     public abstract int onFileDescriptorEvents(FileDescriptor paramFileDescriptor, int paramInt);
/*    */   }
/*    */   
/*    */   public static abstract interface IdleHandler
/*    */   {
/*    */     public abstract boolean queueIdle();
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\MessageQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */