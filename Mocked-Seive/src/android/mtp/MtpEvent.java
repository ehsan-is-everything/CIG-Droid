/*    */ package android.mtp;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MtpEvent
/*    */ {
/*    */   public static final int EVENT_CANCEL_TRANSACTION = 16385;
/*    */   
/*    */ 
/*    */   public static final int EVENT_CAPTURE_COMPLETE = 16397;
/*    */   
/*    */   public static final int EVENT_DEVICE_INFO_CHANGED = 16392;
/*    */   public static final int EVENT_DEVICE_PROP_CHANGED = 16390;
/*    */   public static final int EVENT_DEVICE_RESET = 16395;
/*    */   public static final int EVENT_OBJECT_ADDED = 16386;
/*    */   public static final int EVENT_OBJECT_INFO_CHANGED = 16391;
/*    */   public static final int EVENT_OBJECT_PROP_CHANGED = 51201;
/*    */   public static final int EVENT_OBJECT_PROP_DESC_CHANGED = 51202;
/*    */   
/* 20 */   MtpEvent() { throw new RuntimeException("Stub!"); }
/* 21 */   public int getEventCode() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getParameter1() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getParameter2() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getParameter3() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getObjectHandle() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getStorageId() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getDevicePropCode() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getTransactionId() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getObjectPropCode() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getObjectFormatCode() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int EVENT_OBJECT_REFERENCES_CHANGED = 51203;
/*    */   public static final int EVENT_OBJECT_REMOVED = 16387;
/*    */   public static final int EVENT_REQUEST_OBJECT_TRANSFER = 16393;
/*    */   public static final int EVENT_STORAGE_INFO_CHANGED = 16396;
/*    */   public static final int EVENT_STORE_ADDED = 16388;
/*    */   public static final int EVENT_STORE_FULL = 16394;
/*    */   public static final int EVENT_STORE_REMOVED = 16389;
/*    */   public static final int EVENT_UNDEFINED = 16384;
/*    */   public static final int EVENT_UNREPORTED_STATUS = 16398;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\mtp\MtpEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */