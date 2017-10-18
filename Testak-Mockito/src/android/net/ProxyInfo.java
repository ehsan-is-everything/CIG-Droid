/*    */ package android.net;
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
/*    */ public class ProxyInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   ProxyInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public static ProxyInfo buildDirectProxy(String host, int port) { throw new RuntimeException("Stub!"); }
/* 23 */   public static ProxyInfo buildDirectProxy(String host, int port, List<String> exclList) { throw new RuntimeException("Stub!"); }
/* 24 */   public static ProxyInfo buildPacProxy(Uri pacUri) { throw new RuntimeException("Stub!"); }
/* 25 */   public Uri getPacFileUrl() { throw new RuntimeException("Stub!"); }
/* 26 */   public String getHost() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getPort() { throw new RuntimeException("Stub!"); }
/* 28 */   public String[] getExclusionList() { throw new RuntimeException("Stub!"); }
/* 29 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 31 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 32 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 33 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 35 */   public static final Parcelable.Creator<ProxyInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\ProxyInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */