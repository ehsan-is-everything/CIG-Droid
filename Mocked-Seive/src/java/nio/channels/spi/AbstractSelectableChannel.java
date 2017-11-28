/*    */ package java.nio.channels.spi;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.ClosedChannelException;
/*    */ import java.nio.channels.SelectableChannel;
/*    */ import java.nio.channels.SelectionKey;
/*    */ import java.nio.channels.Selector;
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
/*    */ public abstract class AbstractSelectableChannel
/*    */   extends SelectableChannel
/*    */ {
/* 30 */   protected AbstractSelectableChannel(SelectorProvider provider) { throw new RuntimeException("Stub!"); }
/* 31 */   public final SelectorProvider provider() { throw new RuntimeException("Stub!"); }
/* 32 */   public final boolean isRegistered() { throw new RuntimeException("Stub!"); }
/* 33 */   public final SelectionKey keyFor(Selector sel) { throw new RuntimeException("Stub!"); }
/* 34 */   public final SelectionKey register(Selector sel, int ops, Object att) throws ClosedChannelException { throw new RuntimeException("Stub!"); }
/* 35 */   protected final void implCloseChannel() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void implCloseSelectableChannel() throws IOException;
/* 37 */   public final boolean isBlocking() { throw new RuntimeException("Stub!"); }
/* 38 */   public final Object blockingLock() { throw new RuntimeException("Stub!"); }
/* 39 */   public final SelectableChannel configureBlocking(boolean block) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   protected abstract void implConfigureBlocking(boolean paramBoolean)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\spi\AbstractSelectableChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */