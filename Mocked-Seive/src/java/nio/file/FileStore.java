/*    */ package java.nio.file;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.file.attribute.FileAttributeView;
/*    */ import java.nio.file.attribute.FileStoreAttributeView;
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
/*    */ public abstract class FileStore
/*    */ {
/*    */   protected FileStore()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract String name();
/*    */   
/*    */   public abstract String type();
/*    */   
/*    */   public abstract boolean isReadOnly();
/*    */   
/*    */   public abstract long getTotalSpace()
/*    */     throws IOException;
/*    */   
/*    */   public abstract long getUsableSpace()
/*    */     throws IOException;
/*    */   
/*    */   public abstract long getUnallocatedSpace()
/*    */     throws IOException;
/*    */   
/*    */   public abstract boolean supportsFileAttributeView(Class<? extends FileAttributeView> paramClass);
/*    */   
/*    */   public abstract boolean supportsFileAttributeView(String paramString);
/*    */   
/*    */   public abstract <V extends FileStoreAttributeView> V getFileStoreAttributeView(Class<V> paramClass);
/*    */   
/*    */   public abstract Object getAttribute(String paramString)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\file\FileStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */