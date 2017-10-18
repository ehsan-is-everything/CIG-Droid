/*    */ package android.net.wifi.hotspot2.pps;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.security.PrivateKey;
/*    */ import java.security.cert.X509Certificate;
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
/*    */ public final class Credential
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class UserCredential
/*    */     implements Parcelable
/*    */   {
/* 24 */     public UserCredential() { throw new RuntimeException("Stub!"); }
/* 25 */     public UserCredential(UserCredential source) { throw new RuntimeException("Stub!"); }
/* 26 */     public void setUsername(String username) { throw new RuntimeException("Stub!"); }
/* 27 */     public String getUsername() { throw new RuntimeException("Stub!"); }
/* 28 */     public void setPassword(String password) { throw new RuntimeException("Stub!"); }
/* 29 */     public String getPassword() { throw new RuntimeException("Stub!"); }
/* 30 */     public void setEapType(int eapType) { throw new RuntimeException("Stub!"); }
/* 31 */     public int getEapType() { throw new RuntimeException("Stub!"); }
/* 32 */     public void setNonEapInnerMethod(String nonEapInnerMethod) { throw new RuntimeException("Stub!"); }
/* 33 */     public String getNonEapInnerMethod() { throw new RuntimeException("Stub!"); }
/* 34 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 35 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 36 */     public boolean equals(Object thatObject) { throw new RuntimeException("Stub!"); }
/* 37 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 38 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */     
/* 40 */     public static final Parcelable.Creator<UserCredential> CREATOR = null;
/*    */   }
/*    */   
/*    */   public static final class CertificateCredential
/*    */     implements Parcelable {
/* 45 */     public CertificateCredential() { throw new RuntimeException("Stub!"); }
/* 46 */     public CertificateCredential(CertificateCredential source) { throw new RuntimeException("Stub!"); }
/* 47 */     public void setCertType(String certType) { throw new RuntimeException("Stub!"); }
/* 48 */     public String getCertType() { throw new RuntimeException("Stub!"); }
/* 49 */     public void setCertSha256Fingerprint(byte[] certSha256Fingerprint) { throw new RuntimeException("Stub!"); }
/* 50 */     public byte[] getCertSha256Fingerprint() { throw new RuntimeException("Stub!"); }
/* 51 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 52 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 53 */     public boolean equals(Object thatObject) { throw new RuntimeException("Stub!"); }
/* 54 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 55 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */     
/* 57 */     public static final Parcelable.Creator<CertificateCredential> CREATOR = null;
/*    */   }
/*    */   
/*    */   public static final class SimCredential
/*    */     implements Parcelable {
/* 62 */     public SimCredential() { throw new RuntimeException("Stub!"); }
/* 63 */     public SimCredential(SimCredential source) { throw new RuntimeException("Stub!"); }
/* 64 */     public void setImsi(String imsi) { throw new RuntimeException("Stub!"); }
/* 65 */     public String getImsi() { throw new RuntimeException("Stub!"); }
/* 66 */     public void setEapType(int eapType) { throw new RuntimeException("Stub!"); }
/* 67 */     public int getEapType() { throw new RuntimeException("Stub!"); }
/* 68 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 69 */     public boolean equals(Object thatObject) { throw new RuntimeException("Stub!"); }
/* 70 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 71 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 72 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */     
/* 74 */     public static final Parcelable.Creator<SimCredential> CREATOR = null; }
/*    */   
/* 76 */   public Credential() { throw new RuntimeException("Stub!"); }
/* 77 */   public Credential(Credential source) { throw new RuntimeException("Stub!"); }
/* 78 */   public void setRealm(String realm) { throw new RuntimeException("Stub!"); }
/* 79 */   public String getRealm() { throw new RuntimeException("Stub!"); }
/* 80 */   public void setUserCredential(UserCredential userCredential) { throw new RuntimeException("Stub!"); }
/* 81 */   public UserCredential getUserCredential() { throw new RuntimeException("Stub!"); }
/* 82 */   public void setCertCredential(CertificateCredential certCredential) { throw new RuntimeException("Stub!"); }
/* 83 */   public CertificateCredential getCertCredential() { throw new RuntimeException("Stub!"); }
/* 84 */   public void setSimCredential(SimCredential simCredential) { throw new RuntimeException("Stub!"); }
/* 85 */   public SimCredential getSimCredential() { throw new RuntimeException("Stub!"); }
/* 86 */   public void setCaCertificate(X509Certificate caCertificate) { throw new RuntimeException("Stub!"); }
/* 87 */   public X509Certificate getCaCertificate() { throw new RuntimeException("Stub!"); }
/* 88 */   public void setClientCertificateChain(X509Certificate[] certificateChain) { throw new RuntimeException("Stub!"); }
/* 89 */   public X509Certificate[] getClientCertificateChain() { throw new RuntimeException("Stub!"); }
/* 90 */   public void setClientPrivateKey(PrivateKey clientPrivateKey) { throw new RuntimeException("Stub!"); }
/* 91 */   public PrivateKey getClientPrivateKey() { throw new RuntimeException("Stub!"); }
/* 92 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 93 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 94 */   public boolean equals(Object thatObject) { throw new RuntimeException("Stub!"); }
/* 95 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 96 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 98 */   public static final Parcelable.Creator<Credential> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\wifi\hotspot2\pps\Credential.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */