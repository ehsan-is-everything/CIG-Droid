/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.io.Reader;
/*    */ import java.io.Writer;
/*    */ import java.nio.charset.CharsetDecoder;
/*    */ import java.nio.charset.CharsetEncoder;
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
/*    */ public final class Channels
/*    */ {
/* 30 */   Channels() { throw new RuntimeException("Stub!"); }
/* 31 */   public static InputStream newInputStream(ReadableByteChannel ch) { throw new RuntimeException("Stub!"); }
/* 32 */   public static OutputStream newOutputStream(WritableByteChannel ch) { throw new RuntimeException("Stub!"); }
/* 33 */   public static InputStream newInputStream(AsynchronousByteChannel ch) { throw new RuntimeException("Stub!"); }
/* 34 */   public static OutputStream newOutputStream(AsynchronousByteChannel ch) { throw new RuntimeException("Stub!"); }
/* 35 */   public static ReadableByteChannel newChannel(InputStream in) { throw new RuntimeException("Stub!"); }
/* 36 */   public static WritableByteChannel newChannel(OutputStream out) { throw new RuntimeException("Stub!"); }
/* 37 */   public static Reader newReader(ReadableByteChannel ch, CharsetDecoder dec, int minBufferCap) { throw new RuntimeException("Stub!"); }
/* 38 */   public static Reader newReader(ReadableByteChannel ch, String csName) { throw new RuntimeException("Stub!"); }
/* 39 */   public static Writer newWriter(WritableByteChannel ch, CharsetEncoder enc, int minBufferCap) { throw new RuntimeException("Stub!"); }
/* 40 */   public static Writer newWriter(WritableByteChannel ch, String csName) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\Channels.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */