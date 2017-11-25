/*    */ package android.app.admin;
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
/*    */ public final class DnsEvent
/*    */   extends NetworkEvent
/*    */   implements Parcelable
/*    */ {
/* 22 */   DnsEvent() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getHostname() { throw new RuntimeException("Stub!"); }
/* 24 */   public List<InetAddress> getInetAddresses() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getTotalResolvedAddressCount() { throw new RuntimeException("Stub!"); }
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 30 */   public static final Parcelable.Creator<DnsEvent> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\admin\DnsEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */