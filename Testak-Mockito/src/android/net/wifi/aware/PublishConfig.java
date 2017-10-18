/*    */ package android.net.wifi.aware;
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
/*    */ 
/*    */ public final class PublishConfig
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setServiceName(String serviceName) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setServiceSpecificInfo(byte[] serviceSpecificInfo) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setMatchFilter(List<byte[]> matchFilter) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setPublishType(int publishType) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setTtlSec(int ttlSec) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setTerminateNotificationEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
/* 30 */     public PublishConfig build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 32 */   PublishConfig() { throw new RuntimeException("Stub!"); }
/* 33 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 34 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 35 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 37 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/* 41 */   public static final Parcelable.Creator<PublishConfig> CREATOR = null;
/*    */   public static final int PUBLISH_TYPE_SOLICITED = 1;
/*    */   public static final int PUBLISH_TYPE_UNSOLICITED = 0;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\wifi\aware\PublishConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */