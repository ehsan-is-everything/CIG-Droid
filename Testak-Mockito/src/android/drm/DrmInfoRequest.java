/*    */ package android.drm;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DrmInfoRequest
/*    */ {
/*    */   public static final String ACCOUNT_ID = "account_id";
/*    */   public static final String SUBSCRIPTION_ID = "subscription_id";
/*    */   public static final int TYPE_REGISTRATION_INFO = 1;
/*    */   public static final int TYPE_RIGHTS_ACQUISITION_INFO = 3;
/*    */   public static final int TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO = 4;
/*    */   public static final int TYPE_UNREGISTRATION_INFO = 2;
/*    */   
/* 20 */   public DrmInfoRequest(int infoType, String mimeType) { throw new RuntimeException("Stub!"); }
/* 21 */   public String getMimeType() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getInfoType() { throw new RuntimeException("Stub!"); }
/* 23 */   public void put(String key, Object value) { throw new RuntimeException("Stub!"); }
/* 24 */   public Object get(String key) { throw new RuntimeException("Stub!"); }
/* 25 */   public Iterator<String> keyIterator() { throw new RuntimeException("Stub!"); }
/* 26 */   public Iterator<Object> iterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\drm\DrmInfoRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */