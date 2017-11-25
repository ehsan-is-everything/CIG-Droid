/*    */ package android.net;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.net.InetAddress;
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
/*    */ public final class LinkProperties
/*    */   implements Parcelable
/*    */ {
/* 21 */   LinkProperties() { throw new RuntimeException("Stub!"); }
/* 22 */   public String getInterfaceName() { throw new RuntimeException("Stub!"); }
/* 23 */   public List<LinkAddress> getLinkAddresses() { throw new RuntimeException("Stub!"); }
/* 24 */   public List<InetAddress> getDnsServers() { throw new RuntimeException("Stub!"); }
/* 25 */   public String getDomains() { throw new RuntimeException("Stub!"); }
/* 26 */   public List<RouteInfo> getRoutes() { throw new RuntimeException("Stub!"); }
/* 27 */   public ProxyInfo getHttpProxy() { throw new RuntimeException("Stub!"); }
/* 28 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 29 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 31 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 32 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 34 */   public static final Parcelable.Creator<LinkProperties> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\LinkProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */