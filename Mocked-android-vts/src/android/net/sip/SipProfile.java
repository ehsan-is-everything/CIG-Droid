/*    */ package android.net.sip;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.Serializable;
/*    */ import java.text.ParseException;
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
/*    */ public class SipProfile
/*    */   implements Parcelable, Serializable, Cloneable
/*    */ {
/*    */   public static class Builder
/*    */   {
/* 23 */     public Builder(SipProfile profile) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder(String uriString) throws ParseException { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder(String username, String serverDomain) throws ParseException { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setAuthUserName(String name) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setProfileName(String name) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setPassword(String password) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setPort(int port) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setProtocol(String protocol) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setOutboundProxy(String outboundProxy) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder setDisplayName(String displayName) { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder setSendKeepAlive(boolean flag) { throw new RuntimeException("Stub!"); }
/* 34 */     public Builder setAutoRegistration(boolean flag) { throw new RuntimeException("Stub!"); }
/* 35 */     public SipProfile build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 37 */   SipProfile() { throw new RuntimeException("Stub!"); }
/* 38 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 39 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 40 */   public String getUriString() { throw new RuntimeException("Stub!"); }
/* 41 */   public String getDisplayName() { throw new RuntimeException("Stub!"); }
/* 42 */   public String getUserName() { throw new RuntimeException("Stub!"); }
/* 43 */   public String getAuthUserName() { throw new RuntimeException("Stub!"); }
/* 44 */   public String getPassword() { throw new RuntimeException("Stub!"); }
/* 45 */   public String getSipDomain() { throw new RuntimeException("Stub!"); }
/* 46 */   public int getPort() { throw new RuntimeException("Stub!"); }
/* 47 */   public String getProtocol() { throw new RuntimeException("Stub!"); }
/* 48 */   public String getProxyAddress() { throw new RuntimeException("Stub!"); }
/* 49 */   public String getProfileName() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean getSendKeepAlive() { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean getAutoRegistration() { throw new RuntimeException("Stub!"); }
/*    */   
/* 53 */   public static final Parcelable.Creator<SipProfile> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\sip\SipProfile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */