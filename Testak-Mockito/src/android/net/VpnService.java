/*    */ package android.net;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.app.Service;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.pm.PackageManager.NameNotFoundException;
/*    */ import android.os.IBinder;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.net.DatagramSocket;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class VpnService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.net.VpnService";
/*    */   
/*    */   public class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setSession(String session) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setConfigureIntent(PendingIntent intent) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setMtu(int mtu) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder addAddress(InetAddress address, int prefixLength) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder addAddress(String address, int prefixLength) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder addRoute(InetAddress address, int prefixLength) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder addRoute(String address, int prefixLength) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder addDnsServer(InetAddress address) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder addDnsServer(String address) { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder addSearchDomain(String domain) { throw new RuntimeException("Stub!"); }
/* 34 */     public Builder allowFamily(int family) { throw new RuntimeException("Stub!"); }
/* 35 */     public Builder addAllowedApplication(String packageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/* 36 */     public Builder addDisallowedApplication(String packageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/* 37 */     public Builder allowBypass() { throw new RuntimeException("Stub!"); }
/* 38 */     public Builder setBlocking(boolean blocking) { throw new RuntimeException("Stub!"); }
/* 39 */     public Builder setUnderlyingNetworks(Network[] networks) { throw new RuntimeException("Stub!"); }
/* 40 */     public ParcelFileDescriptor establish() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 42 */   public VpnService() { throw new RuntimeException("Stub!"); }
/* 43 */   public static Intent prepare(Context context) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean protect(int socket) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean protect(Socket socket) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean protect(DatagramSocket socket) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean setUnderlyingNetworks(Network[] networks) { throw new RuntimeException("Stub!"); }
/* 48 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 49 */   public void onRevoke() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\VpnService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */