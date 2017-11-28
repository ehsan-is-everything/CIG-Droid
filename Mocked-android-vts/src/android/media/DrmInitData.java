/*    */ package android.media;
/*    */ 
/*    */ import java.util.UUID;
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
/*    */ public abstract class DrmInitData
/*    */ {
/*    */   public static final class SchemeInitData
/*    */   {
/* 21 */     SchemeInitData() { throw new RuntimeException("Stub!"); }
/* 22 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 23 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 24 */     public final byte[] data = null;
/*    */     public final String mimeType; }
/*    */   
/* 27 */   DrmInitData() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract SchemeInitData get(UUID paramUUID);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\DrmInitData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */