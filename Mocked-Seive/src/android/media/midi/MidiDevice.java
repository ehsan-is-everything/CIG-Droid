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
/*    */ public final class MidiDevice
/*    */   implements Closeable
/*    */ {
/*    */   public class MidiConnection
/*    */     implements Closeable
/*    */   {
/* 24 */     MidiConnection() { throw new RuntimeException("Stub!"); }
/* 25 */     public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } }
/*    */   
/* 28 */   MidiDevice() { throw new RuntimeException("Stub!"); }
/* 29 */   public MidiDeviceInfo getInfo() { throw new RuntimeException("Stub!"); }
/* 30 */   public MidiInputPort openInputPort(int portNumber) { throw new RuntimeException("Stub!"); }
/* 31 */   public MidiOutputPort openOutputPort(int portNumber) { throw new RuntimeException("Stub!"); }
/* 32 */   public MidiConnection connectPorts(MidiInputPort inputPort, int outputPortNumber) { throw new RuntimeException("Stub!"); }
/* 33 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\midi\MidiDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */