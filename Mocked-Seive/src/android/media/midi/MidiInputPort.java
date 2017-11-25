/*    */ package android.media.midi;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
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
/*    */ public final class MidiInputPort
/*    */   extends MidiReceiver
/*    */   implements Closeable
/*    */ {
/* 22 */   MidiInputPort() { throw new RuntimeException("Stub!"); }
/* 23 */   public final int getPortNumber() { throw new RuntimeException("Stub!"); }
/* 24 */   public void onSend(byte[] msg, int offset, int count, long timestamp) throws IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public void onFlush() throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\midi\MidiInputPort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */