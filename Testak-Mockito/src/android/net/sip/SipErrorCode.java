/*    */ package android.net.sip;
/*    */ 
/*    */ 
/*    */ public class SipErrorCode
/*    */ {
/*    */   public static final int CLIENT_ERROR = -4;
/*    */   public static final int CROSS_DOMAIN_AUTHENTICATION = -11;
/*    */   public static final int DATA_CONNECTION_LOST = -10;
/*    */   public static final int INVALID_CREDENTIALS = -8;
/*    */   public static final int INVALID_REMOTE_URI = -6;
/*    */   public static final int IN_PROGRESS = -9;
/*    */   public static final int NO_ERROR = 0;
/*    */   public static final int PEER_NOT_REACHABLE = -7;
/*    */   public static final int SERVER_ERROR = -2;
/*    */   public static final int SERVER_UNREACHABLE = -12;
/*    */   public static final int SOCKET_ERROR = -1;
/*    */   public static final int TIME_OUT = -5;
/*    */   public static final int TRANSACTION_TERMINTED = -3;
/*    */   
/* 20 */   SipErrorCode() { throw new RuntimeException("Stub!"); }
/* 21 */   public static String toString(int errorCode) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\sip\SipErrorCode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */