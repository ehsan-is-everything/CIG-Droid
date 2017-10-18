/*    */ package android.media;
/*    */ 
/*    */ import java.io.Closeable;
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
/*    */ public abstract class MediaDataSource
/*    */   implements Closeable
/*    */ {
/*    */   public MediaDataSource()
/*    */   {
/* 22 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*    */     throws IOException;
/*    */   
/*    */   public abstract long getSize()
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\MediaDataSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */