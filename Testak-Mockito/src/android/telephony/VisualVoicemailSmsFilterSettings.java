/*    */ package android.telephony;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public final class VisualVoicemailSmsFilterSettings
/*    */   implements Parcelable
/*    */ {
/*    */   public static class Builder
/*    */   {
/* 22 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 23 */     public VisualVoicemailSmsFilterSettings build() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setClientPrefix(String clientPrefix) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setOriginatingNumbers(List<String> originatingNumbers) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setDestinationPort(int destinationPort) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 28 */   VisualVoicemailSmsFilterSettings() { throw new RuntimeException("Stub!"); }
/* 29 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 30 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 31 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 38 */   public static final Parcelable.Creator<VisualVoicemailSmsFilterSettings> CREATOR = null;
/*    */   public static final int DESTINATION_PORT_ANY = -1;
/*    */   public static final int DESTINATION_PORT_DATA_SMS = -2;
/*    */   public final String clientPrefix;
/*    */   public final int destinationPort;
/*    */   public final List<String> originatingNumbers;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telephony\VisualVoicemailSmsFilterSettings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */