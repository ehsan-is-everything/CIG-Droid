/*     */ package android.net.wifi;
/*     */ 
/*     */ import android.net.wifi.hotspot2.PasspointConfiguration;
/*     */ 
/*     */ public class WifiManager { public static final String ACTION_PICK_WIFI_NETWORK = "android.net.wifi.PICK_WIFI_NETWORK";
/*     */   public static final String ACTION_REQUEST_SCAN_ALWAYS_AVAILABLE = "android.net.wifi.action.REQUEST_SCAN_ALWAYS_AVAILABLE";
/*     */   public static final int ERROR_AUTHENTICATING = 1;
/*     */   public static final String EXTRA_BSSID = "bssid";
/*     */   public static final String EXTRA_NETWORK_INFO = "networkInfo";
/*     */   public static final String EXTRA_NEW_RSSI = "newRssi";
/*     */   public static final String EXTRA_NEW_STATE = "newState";
/*     */   public static final String EXTRA_PREVIOUS_WIFI_STATE = "previous_wifi_state";
/*     */   public static final String EXTRA_RESULTS_UPDATED = "resultsUpdated";
/*     */   public static final String EXTRA_SUPPLICANT_CONNECTED = "connected";
/*     */   public static final String EXTRA_SUPPLICANT_ERROR = "supplicantError";
/*     */   public static final String EXTRA_WIFI_INFO = "wifiInfo";
/*     */   public static final String EXTRA_WIFI_STATE = "wifi_state";
/*     */   public static final String NETWORK_IDS_CHANGED_ACTION = "android.net.wifi.NETWORK_IDS_CHANGED";
/*     */   public static final String NETWORK_STATE_CHANGED_ACTION = "android.net.wifi.STATE_CHANGE";
/*     */   public static final String RSSI_CHANGED_ACTION = "android.net.wifi.RSSI_CHANGED";
/*     */   
/*  22 */   public static abstract class WpsCallback { public WpsCallback() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public abstract void onStarted(String paramString);
/*     */     
/*     */     public abstract void onSucceeded();
/*     */     
/*     */     public abstract void onFailed(int paramInt); }
/*     */   
/*  30 */   public class LocalOnlyHotspotReservation implements AutoCloseable { LocalOnlyHotspotReservation() { throw new RuntimeException("Stub!"); }
/*  31 */     public WifiConfiguration getWifiConfiguration() { throw new RuntimeException("Stub!"); }
/*  32 */     public void close() { throw new RuntimeException("Stub!"); }
/*  33 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static class LocalOnlyHotspotCallback { public static final int ERROR_GENERIC = 2;
/*     */     public static final int ERROR_INCOMPATIBLE_MODE = 3;
/*  37 */     public LocalOnlyHotspotCallback() { throw new RuntimeException("Stub!"); }
/*  38 */     public void onStarted(WifiManager.LocalOnlyHotspotReservation reservation) { throw new RuntimeException("Stub!"); }
/*  39 */     public void onStopped() { throw new RuntimeException("Stub!"); }
/*  40 */     public void onFailed(int reason) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int ERROR_NO_CHANNEL = 1;
/*     */     public static final int ERROR_TETHERING_DISALLOWED = 4; }
/*     */   
/*     */   public static final String SCAN_RESULTS_AVAILABLE_ACTION = "android.net.wifi.SCAN_RESULTS";
/*     */   public static final String SUPPLICANT_CONNECTION_CHANGE_ACTION = "android.net.wifi.supplicant.CONNECTION_CHANGE";
/*     */   
/*  48 */   public class WifiLock { WifiLock() { throw new RuntimeException("Stub!"); }
/*  49 */     public void acquire() { throw new RuntimeException("Stub!"); }
/*  50 */     public void release() { throw new RuntimeException("Stub!"); }
/*  51 */     public void setReferenceCounted(boolean refCounted) { throw new RuntimeException("Stub!"); }
/*  52 */     public boolean isHeld() { throw new RuntimeException("Stub!"); }
/*  53 */     public void setWorkSource(android.os.WorkSource ws) { throw new RuntimeException("Stub!"); }
/*  54 */     public String toString() { throw new RuntimeException("Stub!"); }
/*  55 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final String SUPPLICANT_STATE_CHANGED_ACTION = "android.net.wifi.supplicant.STATE_CHANGE";
/*     */   
/*  59 */   public class MulticastLock { MulticastLock() { throw new RuntimeException("Stub!"); }
/*  60 */     public void acquire() { throw new RuntimeException("Stub!"); }
/*  61 */     public void release() { throw new RuntimeException("Stub!"); }
/*  62 */     public void setReferenceCounted(boolean refCounted) { throw new RuntimeException("Stub!"); }
/*  63 */     public boolean isHeld() { throw new RuntimeException("Stub!"); }
/*  64 */     public String toString() { throw new RuntimeException("Stub!"); }
/*  65 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } }
/*     */   
/*  67 */   WifiManager() { throw new RuntimeException("Stub!"); }
/*  68 */   public java.util.List<WifiConfiguration> getConfiguredNetworks() { throw new RuntimeException("Stub!"); }
/*  69 */   public int addNetwork(WifiConfiguration config) { throw new RuntimeException("Stub!"); }
/*  70 */   public int updateNetwork(WifiConfiguration config) { throw new RuntimeException("Stub!"); }
/*  71 */   public void addOrUpdatePasspointConfiguration(PasspointConfiguration config) { throw new RuntimeException("Stub!"); }
/*  72 */   public void removePasspointConfiguration(String fqdn) { throw new RuntimeException("Stub!"); }
/*  73 */   public java.util.List<PasspointConfiguration> getPasspointConfigurations() { throw new RuntimeException("Stub!"); }
/*  74 */   public boolean removeNetwork(int netId) { throw new RuntimeException("Stub!"); }
/*  75 */   public boolean enableNetwork(int netId, boolean attemptConnect) { throw new RuntimeException("Stub!"); }
/*  76 */   public boolean disableNetwork(int netId) { throw new RuntimeException("Stub!"); }
/*  77 */   public boolean disconnect() { throw new RuntimeException("Stub!"); }
/*  78 */   public boolean reconnect() { throw new RuntimeException("Stub!"); }
/*  79 */   public boolean reassociate() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  81 */   public boolean pingSupplicant() { throw new RuntimeException("Stub!"); }
/*  82 */   public boolean is5GHzBandSupported() { throw new RuntimeException("Stub!"); }
/*  83 */   public boolean isP2pSupported() { throw new RuntimeException("Stub!"); }
/*  84 */   public boolean isDeviceToApRttSupported() { throw new RuntimeException("Stub!"); }
/*  85 */   public boolean isPreferredNetworkOffloadSupported() { throw new RuntimeException("Stub!"); }
/*  86 */   public boolean isTdlsSupported() { throw new RuntimeException("Stub!"); }
/*  87 */   public boolean isEnhancedPowerReportingSupported() { throw new RuntimeException("Stub!"); }
/*  88 */   public boolean startScan() { throw new RuntimeException("Stub!"); }
/*  89 */   public WifiInfo getConnectionInfo() { throw new RuntimeException("Stub!"); }
/*  90 */   public java.util.List<ScanResult> getScanResults() { throw new RuntimeException("Stub!"); }
/*  91 */   public boolean isScanAlwaysAvailable() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  93 */   public boolean saveConfiguration() { throw new RuntimeException("Stub!"); }
/*  94 */   public android.net.DhcpInfo getDhcpInfo() { throw new RuntimeException("Stub!"); }
/*  95 */   public boolean setWifiEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*  96 */   public int getWifiState() { throw new RuntimeException("Stub!"); }
/*  97 */   public boolean isWifiEnabled() { throw new RuntimeException("Stub!"); }
/*  98 */   public static int calculateSignalLevel(int rssi, int numLevels) { throw new RuntimeException("Stub!"); }
/*  99 */   public static int compareSignalLevel(int rssiA, int rssiB) { throw new RuntimeException("Stub!"); }
/* 100 */   public void startLocalOnlyHotspot(LocalOnlyHotspotCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 101 */   public void setTdlsEnabled(java.net.InetAddress remoteIPAddress, boolean enable) { throw new RuntimeException("Stub!"); }
/* 102 */   public void setTdlsEnabledWithMacAddress(String remoteMacAddress, boolean enable) { throw new RuntimeException("Stub!"); }
/* 103 */   public void startWps(WpsInfo config, WpsCallback listener) { throw new RuntimeException("Stub!"); }
/* 104 */   public void cancelWps(WpsCallback listener) { throw new RuntimeException("Stub!"); }
/* 105 */   public WifiLock createWifiLock(int lockType, String tag) { throw new RuntimeException("Stub!"); }
/* 106 */   public WifiLock createWifiLock(String tag) { throw new RuntimeException("Stub!"); }
/* 107 */   public MulticastLock createMulticastLock(String tag) { throw new RuntimeException("Stub!"); }
/* 108 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static final int WIFI_MODE_FULL = 1;
/*     */   public static final int WIFI_MODE_FULL_HIGH_PERF = 3;
/*     */   public static final int WIFI_MODE_SCAN_ONLY = 2;
/*     */   public static final String WIFI_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_STATE_CHANGED";
/*     */   public static final int WIFI_STATE_DISABLED = 1;
/*     */   public static final int WIFI_STATE_DISABLING = 0;
/*     */   public static final int WIFI_STATE_ENABLED = 3;
/*     */   public static final int WIFI_STATE_ENABLING = 2;
/*     */   public static final int WIFI_STATE_UNKNOWN = 4;
/*     */   public static final int WPS_AUTH_FAILURE = 6;
/*     */   public static final int WPS_OVERLAP_ERROR = 3;
/*     */   public static final int WPS_TIMED_OUT = 7;
/*     */   public static final int WPS_TKIP_ONLY_PROHIBITED = 5;
/*     */   public static final int WPS_WEP_PROHIBITED = 4;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\wifi\WifiManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */