/*    */ package android.net;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.net.DatagramSocket;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Proxy;
/*    */ import java.net.Socket;
/*    */ import java.net.URL;
/*    */ import java.net.URLConnection;
/*    */ import java.net.UnknownHostException;
/*    */ import javax.net.SocketFactory;
/*    */ 
/*    */ 
/*    */ public class Network
/*    */   implements Parcelable
/*    */ {
/* 21 */   Network() { throw new RuntimeException("Stub!"); }
/* 22 */   public InetAddress[] getAllByName(String host) throws UnknownHostException { throw new RuntimeException("Stub!"); }
/* 23 */   public InetAddress getByName(String host) throws UnknownHostException { throw new RuntimeException("Stub!"); }
/* 24 */   public SocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); }
/* 25 */   public URLConnection openConnection(URL url) throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public URLConnection openConnection(URL url, Proxy proxy) throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public void bindSocket(DatagramSocket socket) throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public void bindSocket(Socket socket) throws IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public void bindSocket(FileDescriptor fd) throws IOException { throw new RuntimeException("Stub!"); }
/* 30 */   public long getNetworkHandle() { throw new RuntimeException("Stub!"); }
/* 31 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 32 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 34 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 37 */   public static final Parcelable.Creator<Network> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\Network.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */