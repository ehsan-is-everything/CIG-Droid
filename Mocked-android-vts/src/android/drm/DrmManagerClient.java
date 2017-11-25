/*    */ package android.drm;
/*    */ 
/*    */ import android.content.ContentValues;
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ import java.io.IOException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DrmManagerClient
/*    */   implements AutoCloseable
/*    */ {
/*    */   public static final int ERROR_NONE = 0;
/*    */   public static final int ERROR_UNKNOWN = -2000;
/*    */   
/* 33 */   public DrmManagerClient(Context context) { throw new RuntimeException("Stub!"); }
/* 34 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 35 */   public void close() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public void release() { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized void setOnInfoListener(OnInfoListener infoListener) { throw new RuntimeException("Stub!"); }
/* 39 */   public synchronized void setOnEventListener(OnEventListener eventListener) { throw new RuntimeException("Stub!"); }
/* 40 */   public synchronized void setOnErrorListener(OnErrorListener errorListener) { throw new RuntimeException("Stub!"); }
/* 41 */   public String[] getAvailableDrmEngines() { throw new RuntimeException("Stub!"); }
/* 42 */   public ContentValues getConstraints(String path, int action) { throw new RuntimeException("Stub!"); }
/* 43 */   public ContentValues getMetadata(String path) { throw new RuntimeException("Stub!"); }
/* 44 */   public ContentValues getConstraints(Uri uri, int action) { throw new RuntimeException("Stub!"); }
/* 45 */   public ContentValues getMetadata(Uri uri) { throw new RuntimeException("Stub!"); }
/* 46 */   public int saveRights(DrmRights drmRights, String rightsPath, String contentPath) throws IOException { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean canHandle(String path, String mimeType) { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean canHandle(Uri uri, String mimeType) { throw new RuntimeException("Stub!"); }
/* 49 */   public int processDrmInfo(DrmInfo drmInfo) { throw new RuntimeException("Stub!"); }
/* 50 */   public DrmInfo acquireDrmInfo(DrmInfoRequest drmInfoRequest) { throw new RuntimeException("Stub!"); }
/* 51 */   public int acquireRights(DrmInfoRequest drmInfoRequest) { throw new RuntimeException("Stub!"); }
/* 52 */   public int getDrmObjectType(String path, String mimeType) { throw new RuntimeException("Stub!"); }
/* 53 */   public int getDrmObjectType(Uri uri, String mimeType) { throw new RuntimeException("Stub!"); }
/* 54 */   public String getOriginalMimeType(String path) { throw new RuntimeException("Stub!"); }
/* 55 */   public String getOriginalMimeType(Uri uri) { throw new RuntimeException("Stub!"); }
/* 56 */   public int checkRightsStatus(String path) { throw new RuntimeException("Stub!"); }
/* 57 */   public int checkRightsStatus(Uri uri) { throw new RuntimeException("Stub!"); }
/* 58 */   public int checkRightsStatus(String path, int action) { throw new RuntimeException("Stub!"); }
/* 59 */   public int checkRightsStatus(Uri uri, int action) { throw new RuntimeException("Stub!"); }
/* 60 */   public int removeRights(String path) { throw new RuntimeException("Stub!"); }
/* 61 */   public int removeRights(Uri uri) { throw new RuntimeException("Stub!"); }
/* 62 */   public int removeAllRights() { throw new RuntimeException("Stub!"); }
/* 63 */   public int openConvertSession(String mimeType) { throw new RuntimeException("Stub!"); }
/* 64 */   public DrmConvertedStatus convertData(int convertId, byte[] inputData) { throw new RuntimeException("Stub!"); }
/* 65 */   public DrmConvertedStatus closeConvertSession(int convertId) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnErrorListener
/*    */   {
/*    */     public abstract void onError(DrmManagerClient paramDrmManagerClient, DrmErrorEvent paramDrmErrorEvent);
/*    */   }
/*    */   
/*    */   public static abstract interface OnEventListener
/*    */   {
/*    */     public abstract void onEvent(DrmManagerClient paramDrmManagerClient, DrmEvent paramDrmEvent);
/*    */   }
/*    */   
/*    */   public static abstract interface OnInfoListener
/*    */   {
/*    */     public abstract void onInfo(DrmManagerClient paramDrmManagerClient, DrmInfoEvent paramDrmInfoEvent);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\drm\DrmManagerClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */