/*    */ package android.opengl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.Buffer;
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
/*    */ public class ETC1Util
/*    */ {
/*    */   public static class ETC1Texture
/*    */   {
/* 22 */     public ETC1Texture(int width, int height, ByteBuffer data) { throw new RuntimeException("Stub!"); }
/* 23 */     public int getWidth() { throw new RuntimeException("Stub!"); }
/* 24 */     public int getHeight() { throw new RuntimeException("Stub!"); }
/* 25 */     public ByteBuffer getData() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 27 */   public ETC1Util() { throw new RuntimeException("Stub!"); }
/* 28 */   public static void loadTexture(int target, int level, int border, int fallbackFormat, int fallbackType, InputStream input) throws IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public static void loadTexture(int target, int level, int border, int fallbackFormat, int fallbackType, ETC1Texture texture) { throw new RuntimeException("Stub!"); }
/* 30 */   public static boolean isETC1Supported() { throw new RuntimeException("Stub!"); }
/* 31 */   public static ETC1Texture createTexture(InputStream input) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public static ETC1Texture compressTexture(Buffer input, int width, int height, int pixelSize, int stride) { throw new RuntimeException("Stub!"); }
/* 33 */   public static void writeTexture(ETC1Texture texture, OutputStream output) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\opengl\ETC1Util.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */