/*    */ package android.net.wifi.aware;
/*    */ 
/*    */ import android.net.NetworkSpecifier;
/*    */ import android.os.Handler;
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
/*    */ public class WifiAwareSession
/*    */   implements AutoCloseable
/*    */ {
/* 21 */   WifiAwareSession() { throw new RuntimeException("Stub!"); }
/* 22 */   public void close() { throw new RuntimeException("Stub!"); }
/* 23 */   public void publish(PublishConfig publishConfig, DiscoverySessionCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 24 */   public void subscribe(SubscribeConfig subscribeConfig, DiscoverySessionCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 25 */   public NetworkSpecifier createNetworkSpecifierOpen(int role, byte[] peer) { throw new RuntimeException("Stub!"); }
/* 26 */   public NetworkSpecifier createNetworkSpecifierPassphrase(int role, byte[] peer, String passphrase) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\wifi\aware\WifiAwareSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */