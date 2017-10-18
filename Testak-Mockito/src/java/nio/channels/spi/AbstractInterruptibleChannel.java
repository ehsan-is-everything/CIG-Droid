/*    */ package java.nio.channels.spi;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.AsynchronousCloseException;
/*    */ import java.nio.channels.Channel;
/*    */ import java.nio.channels.InterruptibleChannel;
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
/*    */ public abstract class AbstractInterruptibleChannel
/*    */   implements Channel, InterruptibleChannel
/*    */ {
/* 34 */   protected AbstractInterruptibleChannel() { throw new RuntimeException("Stub!"); }
/* 35 */   public final void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void implCloseChannel() throws IOException;
/* 37 */   public final boolean isOpen() { throw new RuntimeException("Stub!"); }
/* 38 */   protected final void begin() { throw new RuntimeException("Stub!"); }
/* 39 */   protected final void end(boolean completed) throws AsynchronousCloseException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\channels\spi\AbstractInterruptibleChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */