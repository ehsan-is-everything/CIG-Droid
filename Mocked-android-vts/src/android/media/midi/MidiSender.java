/*    */ package android.media.midi;
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
/*    */ public abstract class MidiSender
/*    */ {
/* 20 */   public MidiSender() { throw new RuntimeException("Stub!"); }
/* 21 */   public void connect(MidiReceiver receiver) { throw new RuntimeException("Stub!"); }
/* 22 */   public void disconnect(MidiReceiver receiver) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void onConnect(MidiReceiver paramMidiReceiver);
/*    */   
/*    */   public abstract void onDisconnect(MidiReceiver paramMidiReceiver);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\midi\MidiSender.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */