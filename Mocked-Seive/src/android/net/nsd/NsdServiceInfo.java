/*    */ package android.net.nsd;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.net.InetAddress;
/*    */ import java.util.Map;
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
/*    */ public final class NsdServiceInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public NsdServiceInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public String getServiceName() { throw new RuntimeException("Stub!"); }
/* 23 */   public void setServiceName(String s) { throw new RuntimeException("Stub!"); }
/* 24 */   public String getServiceType() { throw new RuntimeException("Stub!"); }
/* 25 */   public void setServiceType(String s) { throw new RuntimeException("Stub!"); }
/* 26 */   public InetAddress getHost() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setHost(InetAddress s) { throw new RuntimeException("Stub!"); }
/* 28 */   public int getPort() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setPort(int p) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setAttribute(String key, String value) { throw new RuntimeException("Stub!"); }
/* 31 */   public void removeAttribute(String key) { throw new RuntimeException("Stub!"); }
/* 32 */   public Map<String, byte[]> getAttributes() { throw new RuntimeException("Stub!"); }
/* 33 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 34 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 35 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 37 */   public static final Parcelable.Creator<NsdServiceInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\nsd\NsdServiceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */