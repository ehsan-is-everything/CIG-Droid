/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.spi.AbstractSelectableChannel;
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
/*    */ public abstract class Pipe
/*    */ {
/*    */   public static abstract class SourceChannel
/*    */     extends AbstractSelectableChannel
/*    */     implements ReadableByteChannel, ScatteringByteChannel
/*    */   {
/*    */     protected SourceChannel(SelectorProvider provider)
/*    */     {
/* 33 */       super();throw new RuntimeException("Stub!"); }
/* 34 */     public final int validOps() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class SinkChannel extends AbstractSelectableChannel implements WritableByteChannel, GatheringByteChannel
/*    */   {
/*    */     protected SinkChannel(SelectorProvider provider) {
/* 40 */       super();throw new RuntimeException("Stub!"); }
/* 41 */     public final int validOps() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 43 */   protected Pipe() { throw new RuntimeException("Stub!"); }
/*    */   public abstract SourceChannel source();
/*    */   public abstract SinkChannel sink();
/* 46 */   public static Pipe open() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\Pipe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */