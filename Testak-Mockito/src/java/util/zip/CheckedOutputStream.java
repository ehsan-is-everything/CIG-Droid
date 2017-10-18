/*    */ package java.util.zip;
/*    */ 
/*    */ import java.io.FilterOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
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
/*    */ public class CheckedOutputStream
/*    */   extends FilterOutputStream
/*    */ {
/*    */   public CheckedOutputStream(OutputStream out, Checksum cksum)
/*    */   {
/* 30 */     super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 31 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public Checksum getChecksum() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\zip\CheckedOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */