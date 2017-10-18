/*    */ package java.util;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.ByteBuffer;
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
/*    */ 
/*    */ 
/*    */ public class Base64
/*    */ {
/*    */   public static class Encoder
/*    */   {
/* 31 */     Encoder() { throw new RuntimeException("Stub!"); }
/* 32 */     public byte[] encode(byte[] src) { throw new RuntimeException("Stub!"); }
/* 33 */     public int encode(byte[] src, byte[] dst) { throw new RuntimeException("Stub!"); }
/*    */     
/* 35 */     public String encodeToString(byte[] src) { throw new RuntimeException("Stub!"); }
/* 36 */     public ByteBuffer encode(ByteBuffer buffer) { throw new RuntimeException("Stub!"); }
/* 37 */     public OutputStream wrap(OutputStream os) { throw new RuntimeException("Stub!"); }
/* 38 */     public Encoder withoutPadding() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class Decoder {
/* 42 */     Decoder() { throw new RuntimeException("Stub!"); }
/* 43 */     public byte[] decode(byte[] src) { throw new RuntimeException("Stub!"); }
/* 44 */     public byte[] decode(String src) { throw new RuntimeException("Stub!"); }
/* 45 */     public int decode(byte[] src, byte[] dst) { throw new RuntimeException("Stub!"); }
/* 46 */     public ByteBuffer decode(ByteBuffer buffer) { throw new RuntimeException("Stub!"); }
/* 47 */     public InputStream wrap(InputStream is) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 49 */   Base64() { throw new RuntimeException("Stub!"); }
/* 50 */   public static Encoder getEncoder() { throw new RuntimeException("Stub!"); }
/* 51 */   public static Encoder getUrlEncoder() { throw new RuntimeException("Stub!"); }
/* 52 */   public static Encoder getMimeEncoder() { throw new RuntimeException("Stub!"); }
/* 53 */   public static Encoder getMimeEncoder(int lineLength, byte[] lineSeparator) { throw new RuntimeException("Stub!"); }
/* 54 */   public static Decoder getDecoder() { throw new RuntimeException("Stub!"); }
/* 55 */   public static Decoder getUrlDecoder() { throw new RuntimeException("Stub!"); }
/* 56 */   public static Decoder getMimeDecoder() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Base64.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */