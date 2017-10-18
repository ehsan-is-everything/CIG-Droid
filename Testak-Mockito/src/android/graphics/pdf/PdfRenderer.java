/*    */ package android.graphics.pdf;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Matrix;
/*    */ import android.graphics.Rect;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class PdfRenderer
/*    */   implements AutoCloseable
/*    */ {
/*    */   public final class Page
/*    */     implements AutoCloseable
/*    */   {
/*    */     public static final int RENDER_MODE_FOR_DISPLAY = 1;
/*    */     public static final int RENDER_MODE_FOR_PRINT = 2;
/*    */     
/* 24 */     Page() { throw new RuntimeException("Stub!"); }
/* 25 */     public int getIndex() { throw new RuntimeException("Stub!"); }
/* 26 */     public int getWidth() { throw new RuntimeException("Stub!"); }
/* 27 */     public int getHeight() { throw new RuntimeException("Stub!"); }
/* 28 */     public void render(Bitmap destination, Rect destClip, Matrix transform, int renderMode) { throw new RuntimeException("Stub!"); }
/* 29 */     public void close() { throw new RuntimeException("Stub!"); }
/* 30 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/* 34 */   public PdfRenderer(ParcelFileDescriptor input) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void close() { throw new RuntimeException("Stub!"); }
/* 36 */   public int getPageCount() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean shouldScaleForPrinting() { throw new RuntimeException("Stub!"); }
/* 38 */   public Page openPage(int index) { throw new RuntimeException("Stub!"); }
/* 39 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\pdf\PdfRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */