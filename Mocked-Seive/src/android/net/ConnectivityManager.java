/*    */ package android.net;
/*    */ 
/*    */ import android.os.Handler;
/*    */ 
/*    */ public class ConnectivityManager { @Deprecated
/*    */   public static final String ACTION_BACKGROUND_DATA_SETTING_CHANGED = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED";
/*    */   public static final String ACTION_CAPTIVE_PORTAL_SIGN_IN = "android.net.conn.CAPTIVE_PORTAL";
/*    */   public static final String ACTION_RESTRICT_BACKGROUND_CHANGED = "android.net.conn.RESTRICT_BACKGROUND_CHANGED";
/*    */   public static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
/*    */   @Deprecated
/*    */   public static final int DEFAULT_NETWORK_PREFERENCE = 1;
/*    */   public static final String EXTRA_CAPTIVE_PORTAL = "android.net.extra.CAPTIVE_PORTAL";
/*    */   public static final String EXTRA_CAPTIVE_PORTAL_URL = "android.net.extra.CAPTIVE_PORTAL_URL";
/*    */   public static final String EXTRA_EXTRA_INFO = "extraInfo";
/*    */   public static final String EXTRA_IS_FAILOVER = "isFailover";
/*    */   public static final String EXTRA_NETWORK = "android.net.extra.NETWORK";
/*    */   @Deprecated
/*    */   public static final String EXTRA_NETWORK_INFO = "networkInfo";
/*    */   public static final String EXTRA_NETWORK_REQUEST = "android.net.extra.NETWORK_REQUEST";
/*    */   public static final String EXTRA_NETWORK_TYPE = "networkType";
/*    */   public static final String EXTRA_NO_CONNECTIVITY = "noConnectivity";
/*    */   public static final String EXTRA_OTHER_NETWORK_INFO = "otherNetwork";
/*    */   public static final String EXTRA_REASON = "reason";
/*    */   
/* 25 */   public static class NetworkCallback { public NetworkCallback() { throw new RuntimeException("Stub!"); }
/* 26 */     public void onAvailable(Network network) { throw new RuntimeException("Stub!"); }
/* 27 */     public void onLosing(Network network, int maxMsToLive) { throw new RuntimeException("Stub!"); }
/* 28 */     public void onLost(Network network) { throw new RuntimeException("Stub!"); }
/* 29 */     public void onUnavailable() { throw new RuntimeException("Stub!"); }
/* 30 */     public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) { throw new RuntimeException("Stub!"); }
/* 31 */     public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 33 */   ConnectivityManager() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 35 */   public static boolean isNetworkTypeValid(int networkType) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public void setNetworkPreference(int preference) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 39 */   public int getNetworkPreference() { throw new RuntimeException("Stub!"); }
/* 40 */   public NetworkInfo getActiveNetworkInfo() { throw new RuntimeException("Stub!"); }
/* 41 */   public Network getActiveNetwork() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 43 */   public NetworkInfo getNetworkInfo(int networkType) { throw new RuntimeException("Stub!"); }
/* 44 */   public NetworkInfo getNetworkInfo(Network network) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 46 */   public NetworkInfo[] getAllNetworkInfo() { throw new RuntimeException("Stub!"); }
/* 47 */   public Network[] getAllNetworks() { throw new RuntimeException("Stub!"); }
/* 48 */   public LinkProperties getLinkProperties(Network network) { throw new RuntimeException("Stub!"); }
/* 49 */   public NetworkCapabilities getNetworkCapabilities(Network network) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 51 */   public boolean getBackgroundDataSetting() { throw new RuntimeException("Stub!"); }
/* 52 */   public void addDefaultNetworkActiveListener(OnNetworkActiveListener l) { throw new RuntimeException("Stub!"); }
/* 53 */   public void removeDefaultNetworkActiveListener(OnNetworkActiveListener l) { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean isDefaultNetworkActive() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 56 */   public void reportBadNetwork(Network network) { throw new RuntimeException("Stub!"); }
/* 57 */   public void reportNetworkConnectivity(Network network, boolean hasConnectivity) { throw new RuntimeException("Stub!"); }
/* 58 */   public ProxyInfo getDefaultProxy() { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean isActiveNetworkMetered() { throw new RuntimeException("Stub!"); }
/* 60 */   public void requestNetwork(NetworkRequest request, NetworkCallback networkCallback) { throw new RuntimeException("Stub!"); }
/* 61 */   public void requestNetwork(NetworkRequest request, NetworkCallback networkCallback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 62 */   public void requestNetwork(NetworkRequest request, NetworkCallback networkCallback, int timeoutMs) { throw new RuntimeException("Stub!"); }
/* 63 */   public void requestNetwork(NetworkRequest request, NetworkCallback networkCallback, Handler handler, int timeoutMs) { throw new RuntimeException("Stub!"); }
/* 64 */   public void requestNetwork(NetworkRequest request, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 65 */   public void releaseNetworkRequest(android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 66 */   public void registerNetworkCallback(NetworkRequest request, NetworkCallback networkCallback) { throw new RuntimeException("Stub!"); }
/* 67 */   public void registerNetworkCallback(NetworkRequest request, NetworkCallback networkCallback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 68 */   public void registerNetworkCallback(NetworkRequest request, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 69 */   public void registerDefaultNetworkCallback(NetworkCallback networkCallback) { throw new RuntimeException("Stub!"); }
/* 70 */   public void registerDefaultNetworkCallback(NetworkCallback networkCallback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 71 */   public boolean requestBandwidthUpdate(Network network) { throw new RuntimeException("Stub!"); }
/* 72 */   public void unregisterNetworkCallback(NetworkCallback networkCallback) { throw new RuntimeException("Stub!"); }
/* 73 */   public void unregisterNetworkCallback(android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
/* 74 */   public int getMultipathPreference(Network network) { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean bindProcessToNetwork(Network network) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 77 */   public static boolean setProcessDefaultNetwork(Network network) { throw new RuntimeException("Stub!"); }
/* 78 */   public Network getBoundNetworkForProcess() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 80 */   public static Network getProcessDefaultNetwork() { throw new RuntimeException("Stub!"); }
/* 81 */   public int getRestrictBackgroundStatus() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int MULTIPATH_PREFERENCE_HANDOVER = 1;
/*    */   public static final int MULTIPATH_PREFERENCE_PERFORMANCE = 4;
/*    */   public static final int MULTIPATH_PREFERENCE_RELIABILITY = 2;
/*    */   public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
/*    */   public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
/*    */   public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;
/*    */   public static final int TYPE_BLUETOOTH = 7;
/*    */   public static final int TYPE_DUMMY = 8;
/*    */   public static final int TYPE_ETHERNET = 9;
/*    */   public static final int TYPE_MOBILE = 0;
/*    */   public static final int TYPE_MOBILE_DUN = 4;
/*    */   @Deprecated
/*    */   public static final int TYPE_MOBILE_HIPRI = 5;
/*    */   @Deprecated
/*    */   public static final int TYPE_MOBILE_MMS = 2;
/*    */   @Deprecated
/*    */   public static final int TYPE_MOBILE_SUPL = 3;
/*    */   public static final int TYPE_VPN = 17;
/*    */   public static final int TYPE_WIFI = 1;
/*    */   public static final int TYPE_WIMAX = 6;
/*    */   public static abstract interface OnNetworkActiveListener
/*    */   {
/*    */     public abstract void onNetworkActive();
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\ConnectivityManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */