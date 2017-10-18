/*    */ package android.telecom;
/*    */ 
/*    */ import android.os.Bundle;
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
/*    */ public abstract class Conference
/*    */   extends Conferenceable
/*    */ {
/*    */   public static final long CONNECT_TIME_NOT_SPECIFIED = 0L;
/*    */   
/* 21 */   public Conference(PhoneAccountHandle phoneAccount) { throw new RuntimeException("Stub!"); }
/* 22 */   public final PhoneAccountHandle getPhoneAccountHandle() { throw new RuntimeException("Stub!"); }
/* 23 */   public final List<Connection> getConnections() { throw new RuntimeException("Stub!"); }
/* 24 */   public final int getState() { throw new RuntimeException("Stub!"); }
/* 25 */   public final int getConnectionCapabilities() { throw new RuntimeException("Stub!"); }
/* 26 */   public final int getConnectionProperties() { throw new RuntimeException("Stub!"); }
/* 27 */   public final CallAudioState getCallAudioState() { throw new RuntimeException("Stub!"); }
/* 28 */   public Connection.VideoProvider getVideoProvider() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getVideoState() { throw new RuntimeException("Stub!"); }
/* 30 */   public void onDisconnect() { throw new RuntimeException("Stub!"); }
/* 31 */   public void onSeparate(Connection connection) { throw new RuntimeException("Stub!"); }
/* 32 */   public void onMerge(Connection connection) { throw new RuntimeException("Stub!"); }
/* 33 */   public void onHold() { throw new RuntimeException("Stub!"); }
/* 34 */   public void onUnhold() { throw new RuntimeException("Stub!"); }
/* 35 */   public void onMerge() { throw new RuntimeException("Stub!"); }
/* 36 */   public void onSwap() { throw new RuntimeException("Stub!"); }
/* 37 */   public void onPlayDtmfTone(char c) { throw new RuntimeException("Stub!"); }
/* 38 */   public void onStopDtmfTone() { throw new RuntimeException("Stub!"); }
/* 39 */   public void onCallAudioStateChanged(CallAudioState state) { throw new RuntimeException("Stub!"); }
/* 40 */   public void onConnectionAdded(Connection connection) { throw new RuntimeException("Stub!"); }
/* 41 */   public final void setOnHold() { throw new RuntimeException("Stub!"); }
/* 42 */   public final void setDialing() { throw new RuntimeException("Stub!"); }
/* 43 */   public final void setActive() { throw new RuntimeException("Stub!"); }
/* 44 */   public final void setDisconnected(DisconnectCause disconnectCause) { throw new RuntimeException("Stub!"); }
/* 45 */   public final DisconnectCause getDisconnectCause() { throw new RuntimeException("Stub!"); }
/* 46 */   public final void setConnectionCapabilities(int connectionCapabilities) { throw new RuntimeException("Stub!"); }
/* 47 */   public final void setConnectionProperties(int connectionProperties) { throw new RuntimeException("Stub!"); }
/* 48 */   public final boolean addConnection(Connection connection) { throw new RuntimeException("Stub!"); }
/* 49 */   public final void removeConnection(Connection connection) { throw new RuntimeException("Stub!"); }
/* 50 */   public final void setConferenceableConnections(List<Connection> conferenceableConnections) { throw new RuntimeException("Stub!"); }
/* 51 */   public final void setVideoState(Connection c, int videoState) { throw new RuntimeException("Stub!"); }
/* 52 */   public final void setVideoProvider(Connection c, Connection.VideoProvider videoProvider) { throw new RuntimeException("Stub!"); }
/* 53 */   public final List<Connection> getConferenceableConnections() { throw new RuntimeException("Stub!"); }
/* 54 */   public final void destroy() { throw new RuntimeException("Stub!"); }
/* 55 */   public final void setConnectionTime(long connectionTimeMillis) { throw new RuntimeException("Stub!"); }
/* 56 */   public final long getConnectionTime() { throw new RuntimeException("Stub!"); }
/* 57 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 58 */   public final void setStatusHints(StatusHints statusHints) { throw new RuntimeException("Stub!"); }
/* 59 */   public final StatusHints getStatusHints() { throw new RuntimeException("Stub!"); }
/* 60 */   public final void setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 61 */   public final void putExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 62 */   public final void removeExtras(List<String> keys) { throw new RuntimeException("Stub!"); }
/* 63 */   public final void removeExtras(String... keys) { throw new RuntimeException("Stub!"); }
/* 64 */   public final Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 65 */   public void onExtrasChanged(Bundle extras) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telecom\Conference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */