/*    */ package android.media;
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
/*    */ public class MediaCasException
/*    */   extends Exception
/*    */ {
/*    */   public static final class UnsupportedCasException
/*    */     extends MediaCasException
/*    */   {
/*    */     UnsupportedCasException()
/*    */     {
/* 24 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */   public static final class NotProvisionedException extends MediaCasException {
/* 29 */     NotProvisionedException() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class DeniedByServerException extends MediaCasException {
/*    */     DeniedByServerException() {
/* 34 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */   public static final class ResourceBusyException extends MediaCasException {
/* 39 */     ResourceBusyException() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 41 */   MediaCasException() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\MediaCasException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */