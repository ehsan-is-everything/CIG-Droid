/*    */ package android.net.wifi.aware;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ public class DiscoverySessionCallback
/*    */ {
/* 20 */   public DiscoverySessionCallback() { throw new RuntimeException("Stub!"); }
/* 21 */   public void onPublishStarted(PublishDiscoverySession session) { throw new RuntimeException("Stub!"); }
/* 22 */   public void onSubscribeStarted(SubscribeDiscoverySession session) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onSessionConfigUpdated() { throw new RuntimeException("Stub!"); }
/* 24 */   public void onSessionConfigFailed() { throw new RuntimeException("Stub!"); }
/* 25 */   public void onSessionTerminated() { throw new RuntimeException("Stub!"); }
/* 26 */   public void onServiceDiscovered(PeerHandle peerHandle, byte[] serviceSpecificInfo, List<byte[]> matchFilter) { throw new RuntimeException("Stub!"); }
/*    */   
/* 28 */   public void onMessageSendSucceeded(int messageId) { throw new RuntimeException("Stub!"); }
/*    */   
/* 30 */   public void onMessageSendFailed(int messageId) { throw new RuntimeException("Stub!"); }
/* 31 */   public void onMessageReceived(PeerHandle peerHandle, byte[] message) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\wifi\aware\DiscoverySessionCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */