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
/*    */ public final class MidiOutputPort
/*    */   extends MidiSender
/*    */   implements Closeable
/*    */ {
/* 22 */   MidiOutputPort() { throw new RuntimeException("Stub!"); }
/* 23 */   public final int getPortNumber() { throw new RuntimeException("Stub!"); }
/* 24 */   public void onConnect(MidiReceiver receiver) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onDisconnect(MidiReceiver receiver) { throw new RuntimeException("Stub!"); }
/* 26 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\midi\MidiOutputPort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */