/*    */ package android.app.admin;
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
/*    */ public final class ConnectEvent
/*    */   extends NetworkEvent
/*    */   implements Parcelable
/*    */ {
/* 22 */   ConnectEvent() { throw new RuntimeException("Stub!"); }
/* 23 */   public InetAddress getInetAddress() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getPort() { throw new RuntimeException("Stub!"); }
/* 25 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 29 */   public static final Parcelable.Creator<ConnectEvent> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\admin\ConnectEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */