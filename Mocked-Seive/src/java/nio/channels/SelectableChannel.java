/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.spi.AbstractInterruptibleChannel;
/*    */ import java.nio.channels.spi.SelectorProvider;
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
/*    */ public abstract class SelectableChannel
/*    */   extends AbstractInterruptibleChannel
/*    */   implements Channel
/*    */ {
/* 31 */   protected SelectableChannel() { throw new RuntimeException("Stub!"); }
/*    */   public abstract SelectorProvider provider();
/*    */   public abstract int validOps();
/*    */   public abstract boolean isRegistered();
/*    */   public abstract SelectionKey keyFor(Selector paramSelector);
/*    */   public abstract SelectionKey register(Selector paramSelector, int paramInt, Object paramObject) throws ClosedChannelException;
/* 37 */   public final SelectionKey register(Selector sel, int ops) throws ClosedChannelException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract SelectableChannel configureBlocking(boolean paramBoolean)
/*    */     throws IOException;
/*    */   
/*    */   public abstract boolean isBlocking();
/*    */   
/*    */   public abstract Object blockingLock();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\SelectableChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */