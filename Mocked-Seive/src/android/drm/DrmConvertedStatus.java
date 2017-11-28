/*    */ package android.drm;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DrmConvertedStatus
/*    */ {
/*    */   public static final int STATUS_ERROR = 3;
/*    */   
/*    */ 
/*    */   public static final int STATUS_INPUTDATA_ERROR = 2;
/*    */   
/*    */ 
/*    */   public static final int STATUS_OK = 1;
/*    */   
/*    */ 
/*    */ 
/*    */   public DrmConvertedStatus(int statusCode, byte[] convertedData, int offset)
/*    */   {
/* 20 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */ 
/* 24 */   public final byte[] convertedData = null;
/*    */   public final int offset;
/*    */   public final int statusCode;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\drm\DrmConvertedStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */