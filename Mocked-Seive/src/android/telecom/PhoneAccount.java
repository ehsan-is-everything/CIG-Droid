/*    */ package android.telecom;
/*    */ 
/*    */ import android.graphics.drawable.Icon;
/*    */ import android.net.Uri;
/*    */ 
/*    */ 
/*    */ public final class PhoneAccount
/*    */   implements android.os.Parcelable
/*    */ {
/*    */   public static final int CAPABILITY_CALL_PROVIDER = 2;
/*    */   public static final int CAPABILITY_CALL_SUBJECT = 64;
/*    */   public static final int CAPABILITY_CONNECTION_MANAGER = 1;
/*    */   public static final int CAPABILITY_PLACE_EMERGENCY_CALLS = 16;
/*    */   public static final int CAPABILITY_RTT = 4096;
/*    */   public static final int CAPABILITY_SELF_MANAGED = 2048;
/*    */   public static final int CAPABILITY_SIM_SUBSCRIPTION = 4;
/*    */   public static final int CAPABILITY_SUPPORTS_VIDEO_CALLING = 1024;
/*    */   public static final int CAPABILITY_VIDEO_CALLING = 8;
/*    */   public static final int CAPABILITY_VIDEO_CALLING_RELIES_ON_PRESENCE = 256;
/*    */   
/*    */   public static class Builder
/*    */   {
/* 23 */     public Builder(PhoneAccountHandle accountHandle, CharSequence label) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder(PhoneAccount phoneAccount) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setAddress(Uri value) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setSubscriptionAddress(Uri value) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setCapabilities(int value) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setIcon(Icon icon) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setHighlightColor(int value) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setShortDescription(CharSequence value) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder addSupportedUriScheme(String uriScheme) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder setSupportedUriSchemes(java.util.List<String> uriSchemes) { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 34 */     public PhoneAccount build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 36 */   PhoneAccount() { throw new RuntimeException("Stub!"); }
/* 37 */   public static Builder builder(PhoneAccountHandle accountHandle, CharSequence label) { throw new RuntimeException("Stub!"); }
/* 38 */   public Builder toBuilder() { throw new RuntimeException("Stub!"); }
/* 39 */   public PhoneAccountHandle getAccountHandle() { throw new RuntimeException("Stub!"); }
/* 40 */   public Uri getAddress() { throw new RuntimeException("Stub!"); }
/* 41 */   public Uri getSubscriptionAddress() { throw new RuntimeException("Stub!"); }
/* 42 */   public int getCapabilities() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean hasCapabilities(int capability) { throw new RuntimeException("Stub!"); }
/* 44 */   public CharSequence getLabel() { throw new RuntimeException("Stub!"); }
/* 45 */   public CharSequence getShortDescription() { throw new RuntimeException("Stub!"); }
/* 46 */   public java.util.List<String> getSupportedUriSchemes() { throw new RuntimeException("Stub!"); }
/* 47 */   public android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 48 */   public Icon getIcon() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean supportsUriScheme(String uriScheme) { throw new RuntimeException("Stub!"); }
/* 51 */   public int getHighlightColor() { throw new RuntimeException("Stub!"); }
/* 52 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 53 */   public void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 54 */   public String toString() { throw new RuntimeException("Stub!"); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 73 */   public static final android.os.Parcelable.Creator<PhoneAccount> CREATOR = null;
/*    */   public static final String EXTRA_CALL_SUBJECT_CHARACTER_ENCODING = "android.telecom.extra.CALL_SUBJECT_CHARACTER_ENCODING";
/*    */   public static final String EXTRA_CALL_SUBJECT_MAX_LENGTH = "android.telecom.extra.CALL_SUBJECT_MAX_LENGTH";
/*    */   public static final int NO_HIGHLIGHT_COLOR = 0;
/*    */   public static final int NO_RESOURCE_ID = -1;
/*    */   public static final String SCHEME_SIP = "sip";
/*    */   public static final String SCHEME_TEL = "tel";
/*    */   public static final String SCHEME_VOICEMAIL = "voicemail";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telecom\PhoneAccount.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */