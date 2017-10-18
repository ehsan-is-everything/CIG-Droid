/*    */ package android.telecom;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.view.Surface;
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
/*    */ public final class RemoteConnection
/*    */ {
/*    */   public static abstract class Callback
/*    */   {
/* 22 */     public Callback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onStateChanged(RemoteConnection connection, int state) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onDisconnected(RemoteConnection connection, DisconnectCause disconnectCause) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onRingbackRequested(RemoteConnection connection, boolean ringback) { throw new RuntimeException("Stub!"); }
/* 26 */     public void onConnectionCapabilitiesChanged(RemoteConnection connection, int connectionCapabilities) { throw new RuntimeException("Stub!"); }
/* 27 */     public void onConnectionPropertiesChanged(RemoteConnection connection, int connectionProperties) { throw new RuntimeException("Stub!"); }
/* 28 */     public void onPostDialWait(RemoteConnection connection, String remainingPostDialSequence) { throw new RuntimeException("Stub!"); }
/* 29 */     public void onPostDialChar(RemoteConnection connection, char nextChar) { throw new RuntimeException("Stub!"); }
/* 30 */     public void onVoipAudioChanged(RemoteConnection connection, boolean isVoip) { throw new RuntimeException("Stub!"); }
/* 31 */     public void onStatusHintsChanged(RemoteConnection connection, StatusHints statusHints) { throw new RuntimeException("Stub!"); }
/* 32 */     public void onAddressChanged(RemoteConnection connection, Uri address, int presentation) { throw new RuntimeException("Stub!"); }
/* 33 */     public void onCallerDisplayNameChanged(RemoteConnection connection, String callerDisplayName, int presentation) { throw new RuntimeException("Stub!"); }
/* 34 */     public void onVideoStateChanged(RemoteConnection connection, int videoState) { throw new RuntimeException("Stub!"); }
/* 35 */     public void onDestroyed(RemoteConnection connection) { throw new RuntimeException("Stub!"); }
/* 36 */     public void onConferenceableConnectionsChanged(RemoteConnection connection, List<RemoteConnection> conferenceableConnections) { throw new RuntimeException("Stub!"); }
/* 37 */     public void onVideoProviderChanged(RemoteConnection connection, RemoteConnection.VideoProvider videoProvider) { throw new RuntimeException("Stub!"); }
/* 38 */     public void onConferenceChanged(RemoteConnection connection, RemoteConference conference) { throw new RuntimeException("Stub!"); }
/* 39 */     public void onExtrasChanged(RemoteConnection connection, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 40 */     public void onConnectionEvent(RemoteConnection connection, String event, Bundle extras) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */   public static class VideoProvider {
/*    */     public static abstract class Callback {
/* 46 */       public Callback() { throw new RuntimeException("Stub!"); }
/* 47 */       public void onSessionModifyRequestReceived(RemoteConnection.VideoProvider videoProvider, VideoProfile videoProfile) { throw new RuntimeException("Stub!"); }
/* 48 */       public void onSessionModifyResponseReceived(RemoteConnection.VideoProvider videoProvider, int status, VideoProfile requestedProfile, VideoProfile responseProfile) { throw new RuntimeException("Stub!"); }
/* 49 */       public void onCallSessionEvent(RemoteConnection.VideoProvider videoProvider, int event) { throw new RuntimeException("Stub!"); }
/* 50 */       public void onPeerDimensionsChanged(RemoteConnection.VideoProvider videoProvider, int width, int height) { throw new RuntimeException("Stub!"); }
/* 51 */       public void onCallDataUsageChanged(RemoteConnection.VideoProvider videoProvider, long dataUsage) { throw new RuntimeException("Stub!"); }
/* 52 */       public void onCameraCapabilitiesChanged(RemoteConnection.VideoProvider videoProvider, VideoProfile.CameraCapabilities cameraCapabilities) { throw new RuntimeException("Stub!"); }
/* 53 */       public void onVideoQualityChanged(RemoteConnection.VideoProvider videoProvider, int videoQuality) { throw new RuntimeException("Stub!"); } }
/*    */     
/* 55 */     VideoProvider() { throw new RuntimeException("Stub!"); }
/* 56 */     public void registerCallback(Callback l) { throw new RuntimeException("Stub!"); }
/* 57 */     public void unregisterCallback(Callback l) { throw new RuntimeException("Stub!"); }
/* 58 */     public void setCamera(String cameraId) { throw new RuntimeException("Stub!"); }
/* 59 */     public void setPreviewSurface(Surface surface) { throw new RuntimeException("Stub!"); }
/* 60 */     public void setDisplaySurface(Surface surface) { throw new RuntimeException("Stub!"); }
/* 61 */     public void setDeviceOrientation(int rotation) { throw new RuntimeException("Stub!"); }
/* 62 */     public void setZoom(float value) { throw new RuntimeException("Stub!"); }
/* 63 */     public void sendSessionModifyRequest(VideoProfile fromProfile, VideoProfile toProfile) { throw new RuntimeException("Stub!"); }
/* 64 */     public void sendSessionModifyResponse(VideoProfile responseProfile) { throw new RuntimeException("Stub!"); }
/* 65 */     public void requestCameraCapabilities() { throw new RuntimeException("Stub!"); }
/* 66 */     public void requestCallDataUsage() { throw new RuntimeException("Stub!"); }
/* 67 */     public void setPauseImage(Uri uri) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 69 */   RemoteConnection() { throw new RuntimeException("Stub!"); }
/* 70 */   public void registerCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 71 */   public void registerCallback(Callback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 72 */   public void unregisterCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 73 */   public int getState() { throw new RuntimeException("Stub!"); }
/* 74 */   public DisconnectCause getDisconnectCause() { throw new RuntimeException("Stub!"); }
/* 75 */   public int getConnectionCapabilities() { throw new RuntimeException("Stub!"); }
/* 76 */   public int getConnectionProperties() { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean isVoipAudioMode() { throw new RuntimeException("Stub!"); }
/* 78 */   public StatusHints getStatusHints() { throw new RuntimeException("Stub!"); }
/* 79 */   public Uri getAddress() { throw new RuntimeException("Stub!"); }
/* 80 */   public int getAddressPresentation() { throw new RuntimeException("Stub!"); }
/* 81 */   public CharSequence getCallerDisplayName() { throw new RuntimeException("Stub!"); }
/* 82 */   public int getCallerDisplayNamePresentation() { throw new RuntimeException("Stub!"); }
/* 83 */   public int getVideoState() { throw new RuntimeException("Stub!"); }
/* 84 */   public final VideoProvider getVideoProvider() { throw new RuntimeException("Stub!"); }
/* 85 */   public final Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 86 */   public boolean isRingbackRequested() { throw new RuntimeException("Stub!"); }
/* 87 */   public void abort() { throw new RuntimeException("Stub!"); }
/* 88 */   public void answer() { throw new RuntimeException("Stub!"); }
/* 89 */   public void reject() { throw new RuntimeException("Stub!"); }
/* 90 */   public void hold() { throw new RuntimeException("Stub!"); }
/* 91 */   public void unhold() { throw new RuntimeException("Stub!"); }
/* 92 */   public void disconnect() { throw new RuntimeException("Stub!"); }
/* 93 */   public void playDtmfTone(char digit) { throw new RuntimeException("Stub!"); }
/* 94 */   public void stopDtmfTone() { throw new RuntimeException("Stub!"); }
/* 95 */   public void postDialContinue(boolean proceed) { throw new RuntimeException("Stub!"); }
/* 96 */   public void pullExternalCall() { throw new RuntimeException("Stub!"); }
/* 97 */   public void setCallAudioState(CallAudioState state) { throw new RuntimeException("Stub!"); }
/* 98 */   public List<RemoteConnection> getConferenceableConnections() { throw new RuntimeException("Stub!"); }
/* 99 */   public RemoteConference getConference() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telecom\RemoteConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */