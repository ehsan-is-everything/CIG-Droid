/*    */ package android.net.sip;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Message;
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
/*    */ public class SipAudioCall
/*    */ {
/*    */   public static class Listener
/*    */   {
/* 22 */     public Listener() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onReadyToCall(SipAudioCall call) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onCalling(SipAudioCall call) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onRinging(SipAudioCall call, SipProfile caller) { throw new RuntimeException("Stub!"); }
/* 26 */     public void onRingingBack(SipAudioCall call) { throw new RuntimeException("Stub!"); }
/* 27 */     public void onCallEstablished(SipAudioCall call) { throw new RuntimeException("Stub!"); }
/* 28 */     public void onCallEnded(SipAudioCall call) { throw new RuntimeException("Stub!"); }
/* 29 */     public void onCallBusy(SipAudioCall call) { throw new RuntimeException("Stub!"); }
/* 30 */     public void onCallHeld(SipAudioCall call) { throw new RuntimeException("Stub!"); }
/* 31 */     public void onError(SipAudioCall call, int errorCode, String errorMessage) { throw new RuntimeException("Stub!"); }
/* 32 */     public void onChanged(SipAudioCall call) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 34 */   public SipAudioCall(Context context, SipProfile localProfile) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setListener(Listener listener) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setListener(Listener listener, boolean callbackImmediately) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isInCall() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isOnHold() { throw new RuntimeException("Stub!"); }
/* 39 */   public void close() { throw new RuntimeException("Stub!"); }
/* 40 */   public SipProfile getLocalProfile() { throw new RuntimeException("Stub!"); }
/* 41 */   public SipProfile getPeerProfile() { throw new RuntimeException("Stub!"); }
/* 42 */   public int getState() { throw new RuntimeException("Stub!"); }
/* 43 */   public void attachCall(SipSession session, String sessionDescription) throws SipException { throw new RuntimeException("Stub!"); }
/* 44 */   public void makeCall(SipProfile peerProfile, SipSession sipSession, int timeout) throws SipException { throw new RuntimeException("Stub!"); }
/* 45 */   public void endCall() throws SipException { throw new RuntimeException("Stub!"); }
/* 46 */   public void holdCall(int timeout) throws SipException { throw new RuntimeException("Stub!"); }
/* 47 */   public void answerCall(int timeout) throws SipException { throw new RuntimeException("Stub!"); }
/* 48 */   public void continueCall(int timeout) throws SipException { throw new RuntimeException("Stub!"); }
/* 49 */   public void toggleMute() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isMuted() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setSpeakerMode(boolean speakerMode) { throw new RuntimeException("Stub!"); }
/* 52 */   public void sendDtmf(int code) { throw new RuntimeException("Stub!"); }
/* 53 */   public void sendDtmf(int code, Message result) { throw new RuntimeException("Stub!"); }
/* 54 */   public void startAudio() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\sip\SipAudioCall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */