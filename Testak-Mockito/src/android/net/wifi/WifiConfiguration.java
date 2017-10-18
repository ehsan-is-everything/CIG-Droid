/*     */ package android.net.wifi;
/*     */ 
/*     */ import java.util.BitSet;
/*     */ 
/*     */ public class WifiConfiguration implements android.os.Parcelable { public String BSSID;
/*     */   public String FQDN;
/*     */   public String SSID;
/*     */   public BitSet allowedAuthAlgorithms;
/*     */   public BitSet allowedGroupCiphers;
/*     */   public BitSet allowedKeyManagement;
/*     */   public BitSet allowedPairwiseCiphers;
/*     */   public BitSet allowedProtocols;
/*     */   public WifiEnterpriseConfig enterpriseConfig;
/*     */   public boolean hiddenSSID;
/*     */   public boolean isHomeProviderNetwork;
/*     */   public int networkId;
/*     */   public String preSharedKey;
/*     */   @Deprecated
/*     */   public int priority;
/*     */   public String providerFriendlyName;
/*     */   
/*     */   public static class KeyMgmt { public static final int IEEE8021X = 3; public static final int NONE = 0;
/*  23 */     KeyMgmt() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */     public static final int WPA_EAP = 2;
/*     */     public static final int WPA_PSK = 1;
/*  28 */     public static final String[] strings = null;
/*     */     public static final String varName = "key_mgmt"; }
/*     */   
/*     */   public static class Protocol { public static final int RSN = 1;
/*     */     
/*  33 */     Protocol() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int WPA = 0;
/*  36 */     public static final String[] strings = null;
/*     */     public static final String varName = "proto"; }
/*     */   
/*     */   public static class AuthAlgorithm { public static final int LEAP = 2;
/*     */     
/*  41 */     AuthAlgorithm() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int OPEN = 0;
/*     */     public static final int SHARED = 1;
/*  45 */     public static final String[] strings = null;
/*     */     public static final String varName = "auth_alg"; }
/*     */   
/*     */   public static class PairwiseCipher { public static final int CCMP = 2;
/*     */     
/*  50 */     PairwiseCipher() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int NONE = 0;
/*     */     public static final int TKIP = 1;
/*  54 */     public static final String[] strings = null;
/*     */     public static final String varName = "pairwise"; }
/*     */   
/*     */   public static class GroupCipher { public static final int CCMP = 3;
/*     */     
/*  59 */     GroupCipher() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int TKIP = 2;
/*     */     public static final int WEP104 = 1;
/*     */     public static final int WEP40 = 0;
/*  64 */     public static final String[] strings = null;
/*     */     public static final String varName = "group"; }
/*     */   
/*     */   public static class Status { public static final int CURRENT = 0;
/*     */     
/*  69 */     Status() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int DISABLED = 1;
/*     */     public static final int ENABLED = 2;
/*  73 */     public static final String[] strings = null; }
/*     */   
/*  75 */   public WifiConfiguration() { throw new RuntimeException("Stub!"); }
/*  76 */   public boolean isPasspoint() { throw new RuntimeException("Stub!"); }
/*  77 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  78 */   public android.net.ProxyInfo getHttpProxy() { throw new RuntimeException("Stub!"); }
/*  79 */   public void setHttpProxy(android.net.ProxyInfo httpProxy) { throw new RuntimeException("Stub!"); }
/*  80 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*  81 */   public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */   public long[] roamingConsortiumIds = null;
/*     */   public int status;
/* 100 */   public String[] wepKeys = null;
/*     */   public int wepTxKeyIndex;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\wifi\WifiConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */