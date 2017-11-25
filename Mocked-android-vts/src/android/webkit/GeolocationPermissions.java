/*    */ package android.webkit;
/*    */ 
/*    */ import java.util.Set;
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
/*    */ public class GeolocationPermissions
/*    */ {
/* 24 */   GeolocationPermissions() { throw new RuntimeException("Stub!"); }
/* 25 */   public static GeolocationPermissions getInstance() { throw new RuntimeException("Stub!"); }
/* 26 */   public void getOrigins(ValueCallback<Set<String>> callback) { throw new RuntimeException("Stub!"); }
/* 27 */   public void getAllowed(String origin, ValueCallback<Boolean> callback) { throw new RuntimeException("Stub!"); }
/* 28 */   public void clear(String origin) { throw new RuntimeException("Stub!"); }
/* 29 */   public void allow(String origin) { throw new RuntimeException("Stub!"); }
/* 30 */   public void clearAll() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface Callback
/*    */   {
/*    */     public abstract void invoke(String paramString, boolean paramBoolean1, boolean paramBoolean2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\GeolocationPermissions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */