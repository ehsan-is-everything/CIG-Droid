/*    */ package android.telecom;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import java.util.List;
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
/*    */ public final class RemoteConference
/*    */ {
/*    */   public static abstract class Callback
/*    */   {
/* 22 */     public Callback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onStateChanged(RemoteConference conference, int oldState, int newState) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onDisconnected(RemoteConference conference, DisconnectCause disconnectCause) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onConnectionAdded(RemoteConference conference, RemoteConnection connection) { throw new RuntimeException("Stub!"); }
/* 26 */     public void onConnectionRemoved(RemoteConference conference, RemoteConnection connection) { throw new RuntimeException("Stub!"); }
/* 27 */     public void onConnectionCapabilitiesChanged(RemoteConference conference, int connectionCapabilities) { throw new RuntimeException("Stub!"); }
/* 28 */     public void onConnectionPropertiesChanged(RemoteConference conference, int connectionProperties) { throw new RuntimeException("Stub!"); }
/* 29 */     public void onConferenceableConnectionsChanged(RemoteConference conference, List<RemoteConnection> conferenceableConnections) { throw new RuntimeException("Stub!"); }
/* 30 */     public void onDestroyed(RemoteConference conference) { throw new RuntimeException("Stub!"); }
/* 31 */     public void onExtrasChanged(RemoteConference conference, Bundle extras) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 33 */   RemoteConference() { throw new RuntimeException("Stub!"); }
/* 34 */   public final List<RemoteConnection> getConnections() { throw new RuntimeException("Stub!"); }
/* 35 */   public final int getState() { throw new RuntimeException("Stub!"); }
/* 36 */   public final int getConnectionCapabilities() { throw new RuntimeException("Stub!"); }
/* 37 */   public final int getConnectionProperties() { throw new RuntimeException("Stub!"); }
/* 38 */   public final Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 39 */   public void disconnect() { throw new RuntimeException("Stub!"); }
/* 40 */   public void separate(RemoteConnection connection) { throw new RuntimeException("Stub!"); }
/* 41 */   public void merge() { throw new RuntimeException("Stub!"); }
/* 42 */   public void swap() { throw new RuntimeException("Stub!"); }
/* 43 */   public void hold() { throw new RuntimeException("Stub!"); }
/* 44 */   public void unhold() { throw new RuntimeException("Stub!"); }
/* 45 */   public DisconnectCause getDisconnectCause() { throw new RuntimeException("Stub!"); }
/* 46 */   public void playDtmfTone(char digit) { throw new RuntimeException("Stub!"); }
/* 47 */   public void stopDtmfTone() { throw new RuntimeException("Stub!"); }
/* 48 */   public void setCallAudioState(CallAudioState state) { throw new RuntimeException("Stub!"); }
/* 49 */   public List<RemoteConnection> getConferenceableConnections() { throw new RuntimeException("Stub!"); }
/* 50 */   public final void registerCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 51 */   public final void registerCallback(Callback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 52 */   public final void unregisterCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telecom\RemoteConference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */