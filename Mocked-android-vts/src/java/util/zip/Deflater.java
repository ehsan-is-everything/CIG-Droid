/*    */ package java.util.zip;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Deflater
/*    */ {
/*    */   public static final int BEST_COMPRESSION = 9;
/*    */   
/*    */ 
/*    */   public static final int BEST_SPEED = 1;
/*    */   
/*    */   public static final int DEFAULT_COMPRESSION = -1;
/*    */   
/*    */   public static final int DEFAULT_STRATEGY = 0;
/*    */   
/*    */   public static final int DEFLATED = 8;
/*    */   
/*    */   public static final int FILTERED = 1;
/*    */   
/*    */   public static final int FULL_FLUSH = 3;
/*    */   
/*    */   public static final int HUFFMAN_ONLY = 2;
/*    */   
/*    */   public static final int NO_COMPRESSION = 0;
/*    */   
/*    */   public static final int NO_FLUSH = 0;
/*    */   public static final int SYNC_FLUSH = 2;
/*    */   
/* 29 */   public Deflater(int level, boolean nowrap) { throw new RuntimeException("Stub!"); }
/* 30 */   public Deflater(int level) { throw new RuntimeException("Stub!"); }
/* 31 */   public Deflater() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setInput(byte[] b, int off, int len) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setInput(byte[] b) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setDictionary(byte[] b, int off, int len) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setDictionary(byte[] b) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setStrategy(int strategy) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setLevel(int level) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean needsInput() { throw new RuntimeException("Stub!"); }
/* 39 */   public void finish() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean finished() { throw new RuntimeException("Stub!"); }
/* 41 */   public int deflate(byte[] b, int off, int len) { throw new RuntimeException("Stub!"); }
/* 42 */   public int deflate(byte[] b) { throw new RuntimeException("Stub!"); }
/* 43 */   public int deflate(byte[] b, int off, int len, int flush) { throw new RuntimeException("Stub!"); }
/* 44 */   public int getAdler() { throw new RuntimeException("Stub!"); }
/* 45 */   public int getTotalIn() { throw new RuntimeException("Stub!"); }
/* 46 */   public long getBytesRead() { throw new RuntimeException("Stub!"); }
/* 47 */   public int getTotalOut() { throw new RuntimeException("Stub!"); }
/* 48 */   public long getBytesWritten() { throw new RuntimeException("Stub!"); }
/* 49 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 50 */   public void end() { throw new RuntimeException("Stub!"); }
/* 51 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\zip\Deflater.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */