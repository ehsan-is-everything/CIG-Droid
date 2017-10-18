/*    */ package android.telephony;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class PhoneStateListener {
/*    */   public static final int LISTEN_CALL_FORWARDING_INDICATOR = 8;
/*    */   public static final int LISTEN_CALL_STATE = 32;
/*    */   public static final int LISTEN_CELL_INFO = 1024;
/*    */   public static final int LISTEN_CELL_LOCATION = 16;
/*    */   public static final int LISTEN_DATA_ACTIVITY = 128;
/*    */   public static final int LISTEN_DATA_CONNECTION_STATE = 64;
/*    */   public static final int LISTEN_MESSAGE_WAITING_INDICATOR = 4;
/*    */   public static final int LISTEN_NONE = 0;
/*    */   public static final int LISTEN_SERVICE_STATE = 1;
/*    */   @Deprecated
/*    */   public static final int LISTEN_SIGNAL_STRENGTH = 2;
/*    */   public static final int LISTEN_SIGNAL_STRENGTHS = 256;
/*    */   
/* 20 */   public PhoneStateListener() { throw new RuntimeException("Stub!"); }
/* 21 */   public void onServiceStateChanged(ServiceState serviceState) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 23 */   public void onSignalStrengthChanged(int asu) { throw new RuntimeException("Stub!"); }
/* 24 */   public void onMessageWaitingIndicatorChanged(boolean mwi) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onCallForwardingIndicatorChanged(boolean cfi) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onCellLocationChanged(CellLocation location) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onCallStateChanged(int state, String incomingNumber) { throw new RuntimeException("Stub!"); }
/* 28 */   public void onDataConnectionStateChanged(int state) { throw new RuntimeException("Stub!"); }
/* 29 */   public void onDataConnectionStateChanged(int state, int networkType) { throw new RuntimeException("Stub!"); }
/* 30 */   public void onDataActivity(int direction) { throw new RuntimeException("Stub!"); }
/* 31 */   public void onSignalStrengthsChanged(SignalStrength signalStrength) { throw new RuntimeException("Stub!"); }
/* 32 */   public void onCellInfoChanged(List<CellInfo> cellInfo) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telephony\PhoneStateListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */