/*    */ package android.media;
/*    */ 
/*    */ import java.util.UUID;
/*    */ 
/*    */ public final class MediaDrm {
/*    */   @Deprecated
/*    */   public static final int EVENT_KEY_EXPIRED = 3;
/*    */   public static final int EVENT_KEY_REQUIRED = 2;
/*    */   @Deprecated
/*    */   public static final int EVENT_PROVISION_REQUIRED = 1;
/*    */   public static final int EVENT_SESSION_RECLAIMED = 5;
/*    */   public static final int EVENT_VENDOR_DEFINED = 4;
/*    */   public static final int KEY_TYPE_OFFLINE = 2;
/*    */   public static final int KEY_TYPE_RELEASE = 3;
/*    */   public static final int KEY_TYPE_STREAMING = 1;
/*    */   public static final String PROPERTY_ALGORITHMS = "algorithms";
/*    */   public static final String PROPERTY_DESCRIPTION = "description";
/*    */   public static final String PROPERTY_DEVICE_UNIQUE_ID = "deviceUniqueId";
/*    */   public static final String PROPERTY_VENDOR = "vendor";
/*    */   public static final String PROPERTY_VERSION = "version";
/*    */   
/*    */   public static final class MediaDrmStateException extends IllegalStateException {
/* 23 */     MediaDrmStateException() { throw new RuntimeException("Stub!"); }
/* 24 */     public String getDiagnosticInfo() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static abstract interface OnExpirationUpdateListener { public abstract void onExpirationUpdate(MediaDrm paramMediaDrm, byte[] paramArrayOfByte, long paramLong); }
/*    */   
/*    */   public static abstract interface OnKeyStatusChangeListener { public abstract void onKeyStatusChange(MediaDrm paramMediaDrm, byte[] paramArrayOfByte, java.util.List<MediaDrm.KeyStatus> paramList, boolean paramBoolean); }
/*    */   
/*    */   public static final class KeyStatus { public static final int STATUS_EXPIRED = 1;
/*    */     public static final int STATUS_INTERNAL_ERROR = 4;
/*    */     public static final int STATUS_OUTPUT_NOT_ALLOWED = 2;
/*    */     public static final int STATUS_PENDING = 3;
/*    */     public static final int STATUS_USABLE = 0;
/*    */     
/* 36 */     KeyStatus() { throw new RuntimeException("Stub!"); }
/* 37 */     public int getStatusCode() { throw new RuntimeException("Stub!"); }
/* 38 */     public byte[] getKeyId() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */   public static abstract interface OnEventListener {
/*    */     public abstract void onEvent(MediaDrm paramMediaDrm, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2);
/*    */   }
/*    */   
/*    */   public static final class KeyRequest {
/*    */     public static final int REQUEST_TYPE_INITIAL = 0;
/*    */     public static final int REQUEST_TYPE_RELEASE = 2;
/*    */     public static final int REQUEST_TYPE_RENEWAL = 1;
/*    */     
/* 51 */     KeyRequest() { throw new RuntimeException("Stub!"); }
/* 52 */     public byte[] getData() { throw new RuntimeException("Stub!"); }
/* 53 */     public String getDefaultUrl() { throw new RuntimeException("Stub!"); }
/* 54 */     public int getRequestType() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static final class ProvisionRequest
/*    */   {
/* 61 */     ProvisionRequest() { throw new RuntimeException("Stub!"); }
/* 62 */     public byte[] getData() { throw new RuntimeException("Stub!"); }
/* 63 */     public String getDefaultUrl() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public final class CryptoSession {
/* 67 */     CryptoSession() { throw new RuntimeException("Stub!"); }
/* 68 */     public byte[] encrypt(byte[] keyid, byte[] input, byte[] iv) { throw new RuntimeException("Stub!"); }
/* 69 */     public byte[] decrypt(byte[] keyid, byte[] input, byte[] iv) { throw new RuntimeException("Stub!"); }
/* 70 */     public byte[] sign(byte[] keyid, byte[] message) { throw new RuntimeException("Stub!"); }
/* 71 */     public boolean verify(byte[] keyid, byte[] message, byte[] signature) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 73 */   public MediaDrm(UUID uuid) throws UnsupportedSchemeException { throw new RuntimeException("Stub!"); }
/* 74 */   public static final boolean isCryptoSchemeSupported(UUID uuid) { throw new RuntimeException("Stub!"); }
/* 75 */   public static final boolean isCryptoSchemeSupported(UUID uuid, String mimeType) { throw new RuntimeException("Stub!"); }
/* 76 */   public void setOnExpirationUpdateListener(OnExpirationUpdateListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 77 */   public void setOnKeyStatusChangeListener(OnKeyStatusChangeListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 78 */   public void setOnEventListener(OnEventListener listener) { throw new RuntimeException("Stub!"); }
/*    */   public native byte[] openSession() throws NotProvisionedException, ResourceBusyException;
/*    */   public native void closeSession(byte[] paramArrayOfByte);
/*    */   public native KeyRequest getKeyRequest(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString, int paramInt, java.util.HashMap<String, String> paramHashMap) throws NotProvisionedException;
/*    */   public native byte[] provideKeyResponse(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2) throws NotProvisionedException, DeniedByServerException;
/*    */   public native void restoreKeys(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
/*    */   public native void removeKeys(byte[] paramArrayOfByte);
/*    */   public native java.util.HashMap<String, String> queryKeyStatus(byte[] paramArrayOfByte);
/* 86 */   public ProvisionRequest getProvisionRequest() { throw new RuntimeException("Stub!"); }
/* 87 */   public void provideProvisionResponse(byte[] response) throws DeniedByServerException { throw new RuntimeException("Stub!"); }
/*    */   public native java.util.List<byte[]> getSecureStops();
/*    */   public native byte[] getSecureStop(byte[] paramArrayOfByte);
/*    */   public native void releaseSecureStops(byte[] paramArrayOfByte);
/*    */   public native void releaseAllSecureStops();
/*    */   public native String getPropertyString(String paramString);
/*    */   public native byte[] getPropertyByteArray(String paramString);
/*    */   public native void setPropertyString(String paramString1, String paramString2);
/*    */   public native void setPropertyByteArray(String paramString, byte[] paramArrayOfByte);
/* 96 */   public CryptoSession getCryptoSession(byte[] sessionId, String cipherAlgorithm, String macAlgorithm) { throw new RuntimeException("Stub!"); }
/* 97 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public final native void release();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\MediaDrm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */