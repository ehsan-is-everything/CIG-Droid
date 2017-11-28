/*    */ package android.net.wifi;
/*    */ 
/*    */ import java.security.PrivateKey;
/*    */ import java.security.cert.X509Certificate;
/*    */ 
/*    */ 
/*    */ public class WifiEnterpriseConfig
/*    */   implements android.os.Parcelable
/*    */ {
/*    */   public static final class Eap
/*    */   {
/*    */     public static final int AKA = 5;
/*    */     public static final int AKA_PRIME = 6;
/*    */     public static final int NONE = -1;
/*    */     public static final int PEAP = 0;
/*    */     public static final int PWD = 3;
/*    */     public static final int SIM = 4;
/*    */     public static final int TLS = 1;
/*    */     public static final int TTLS = 2;
/*    */     public static final int UNAUTH_TLS = 7;
/*    */     
/* 22 */     Eap() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class Phase2 {
/*    */     public static final int AKA = 6;
/*    */     public static final int AKA_PRIME = 7;
/*    */     public static final int GTC = 4;
/*    */     public static final int MSCHAP = 2;
/*    */     public static final int MSCHAPV2 = 3;
/*    */     public static final int NONE = 0;
/*    */     public static final int PAP = 1;
/*    */     public static final int SIM = 5;
/*    */     
/* 35 */     Phase2() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 45 */   public WifiEnterpriseConfig() { throw new RuntimeException("Stub!"); }
/* 46 */   public WifiEnterpriseConfig(WifiEnterpriseConfig source) { throw new RuntimeException("Stub!"); }
/* 47 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 48 */   public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setEapMethod(int eapMethod) { throw new RuntimeException("Stub!"); }
/* 50 */   public int getEapMethod() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setPhase2Method(int phase2Method) { throw new RuntimeException("Stub!"); }
/* 52 */   public int getPhase2Method() { throw new RuntimeException("Stub!"); }
/* 53 */   public void setIdentity(String identity) { throw new RuntimeException("Stub!"); }
/* 54 */   public String getIdentity() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setAnonymousIdentity(String anonymousIdentity) { throw new RuntimeException("Stub!"); }
/* 56 */   public String getAnonymousIdentity() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setPassword(String password) { throw new RuntimeException("Stub!"); }
/* 58 */   public String getPassword() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setCaCertificate(X509Certificate cert) { throw new RuntimeException("Stub!"); }
/* 60 */   public X509Certificate getCaCertificate() { throw new RuntimeException("Stub!"); }
/* 61 */   public void setCaCertificates(X509Certificate[] certs) { throw new RuntimeException("Stub!"); }
/* 62 */   public X509Certificate[] getCaCertificates() { throw new RuntimeException("Stub!"); }
/* 63 */   public void setClientKeyEntry(PrivateKey privateKey, X509Certificate clientCertificate) { throw new RuntimeException("Stub!"); }
/* 64 */   public void setClientKeyEntryWithCertificateChain(PrivateKey privateKey, X509Certificate[] clientCertificateChain) { throw new RuntimeException("Stub!"); }
/* 65 */   public X509Certificate getClientCertificate() { throw new RuntimeException("Stub!"); }
/* 66 */   public X509Certificate[] getClientCertificateChain() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 68 */   public void setSubjectMatch(String subjectMatch) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 70 */   public String getSubjectMatch() { throw new RuntimeException("Stub!"); }
/* 71 */   public void setAltSubjectMatch(String altSubjectMatch) { throw new RuntimeException("Stub!"); }
/* 72 */   public String getAltSubjectMatch() { throw new RuntimeException("Stub!"); }
/* 73 */   public void setDomainSuffixMatch(String domain) { throw new RuntimeException("Stub!"); }
/* 74 */   public String getDomainSuffixMatch() { throw new RuntimeException("Stub!"); }
/* 75 */   public void setRealm(String realm) { throw new RuntimeException("Stub!"); }
/* 76 */   public String getRealm() { throw new RuntimeException("Stub!"); }
/* 77 */   public void setPlmn(String plmn) { throw new RuntimeException("Stub!"); }
/* 78 */   public String getPlmn() { throw new RuntimeException("Stub!"); }
/* 79 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 81 */   public static final android.os.Parcelable.Creator<WifiEnterpriseConfig> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\wifi\WifiEnterpriseConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */