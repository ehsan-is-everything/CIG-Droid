/*    */ package android.media.midi;
/*    */ 
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
/*    */ 
/*    */ public abstract class MidiReceiver
/*    */ {
/* 20 */   public MidiReceiver() { throw new RuntimeException("Stub!"); }
/* 21 */   public MidiReceiver(int maxMessageSize) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onSend(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong) throws IOException;
/* 23 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); }
/* 24 */   public void onFlush() throws IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public final int getMaxMessageSize() { throw new RuntimeException("Stub!"); }
/* 26 */   public void send(byte[] msg, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public void send(byte[] msg, int offset, int count, long timestamp) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\midi\MidiReceiver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */