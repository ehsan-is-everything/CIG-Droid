/*    */ package android.net;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.net.InetAddress;
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
/*    */ public final class RouteInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   RouteInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public IpPrefix getDestination() { throw new RuntimeException("Stub!"); }
/* 23 */   public InetAddress getGateway() { throw new RuntimeException("Stub!"); }
/* 24 */   public String getInterface() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isDefaultRoute() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean matches(InetAddress destination) { throw new RuntimeException("Stub!"); }
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 29 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 31 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 33 */   public static final Parcelable.Creator<RouteInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\RouteInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */