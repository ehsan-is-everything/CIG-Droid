/*    */ package android.content.res;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class AssetManager
/*    */   implements AutoCloseable
/*    */ {
/*    */   public static final int ACCESS_BUFFER = 3;
/*    */   public static final int ACCESS_RANDOM = 1;
/*    */   public static final int ACCESS_STREAMING = 2;
/*    */   public static final int ACCESS_UNKNOWN = 0;
/*    */   
/*    */   public final class AssetInputStream
/*    */     extends InputStream
/*    */   {
/* 24 */     AssetInputStream() { throw new RuntimeException("Stub!"); }
/* 25 */     public final int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */     public final boolean markSupported() { throw new RuntimeException("Stub!"); }
/* 27 */     public final int available() throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */     public final void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 29 */     public final void mark(int readlimit) { throw new RuntimeException("Stub!"); }
/* 30 */     public final void reset() throws IOException { throw new RuntimeException("Stub!"); }
/* 31 */     public final int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */     public final int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */     public final long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } }
/*    */   
/* 36 */   AssetManager() { throw new RuntimeException("Stub!"); }
/* 37 */   public void close() { throw new RuntimeException("Stub!"); }
/* 38 */   public final InputStream open(String fileName) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public final InputStream open(String fileName, int accessMode) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public final AssetFileDescriptor openFd(String fileName) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public final native String[] list(String paramString) throws IOException;
/* 42 */   public final AssetFileDescriptor openNonAssetFd(String fileName) throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public final AssetFileDescriptor openNonAssetFd(int cookie, String fileName) throws IOException { throw new RuntimeException("Stub!"); }
/* 44 */   public final XmlResourceParser openXmlResourceParser(String fileName) throws IOException { throw new RuntimeException("Stub!"); }
/* 45 */   public final XmlResourceParser openXmlResourceParser(int cookie, String fileName) throws IOException { throw new RuntimeException("Stub!"); }
/* 46 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public final native String[] getLocales();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\res\AssetManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */