/*    */ package android.drm;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DrmEvent
/*    */ {
/*    */   public static final String DRM_INFO_OBJECT = "drm_info_object";
/*    */   public static final String DRM_INFO_STATUS_OBJECT = "drm_info_status_object";
/*    */   public static final int TYPE_ALL_RIGHTS_REMOVED = 1001;
/*    */   public static final int TYPE_DRM_INFO_PROCESSED = 1002;
/*    */   
/* 20 */   protected DrmEvent(int uniqueId, int type, String message, HashMap<String, Object> attributes) { throw new RuntimeException("Stub!"); }
/* 21 */   protected DrmEvent(int uniqueId, int type, String message) { throw new RuntimeException("Stub!"); }
/* 22 */   public int getUniqueId() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 24 */   public String getMessage() { throw new RuntimeException("Stub!"); }
/* 25 */   public Object getAttribute(String key) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\drm\DrmEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */