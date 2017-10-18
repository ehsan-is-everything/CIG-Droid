/*    */ package android.graphics.pdf;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Rect;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import java.util.List;
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
/*    */ public class PdfDocument
/*    */ {
/*    */   public static final class PageInfo
/*    */   {
/*    */     public static final class Builder
/*    */     {
/* 24 */       public Builder(int pageWidth, int pageHeight, int pageNumber) { throw new RuntimeException("Stub!"); }
/* 25 */       public Builder setContentRect(Rect contentRect) { throw new RuntimeException("Stub!"); }
/* 26 */       public PdfDocument.PageInfo create() { throw new RuntimeException("Stub!"); } }
/*    */     
/* 28 */     PageInfo() { throw new RuntimeException("Stub!"); }
/* 29 */     public int getPageWidth() { throw new RuntimeException("Stub!"); }
/* 30 */     public int getPageHeight() { throw new RuntimeException("Stub!"); }
/* 31 */     public Rect getContentRect() { throw new RuntimeException("Stub!"); }
/* 32 */     public int getPageNumber() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class Page {
/* 36 */     Page() { throw new RuntimeException("Stub!"); }
/* 37 */     public Canvas getCanvas() { throw new RuntimeException("Stub!"); }
/* 38 */     public PdfDocument.PageInfo getInfo() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 40 */   public PdfDocument() { throw new RuntimeException("Stub!"); }
/* 41 */   public Page startPage(PageInfo pageInfo) { throw new RuntimeException("Stub!"); }
/* 42 */   public void finishPage(Page page) { throw new RuntimeException("Stub!"); }
/* 43 */   public void writeTo(OutputStream out) throws IOException { throw new RuntimeException("Stub!"); }
/* 44 */   public List<PageInfo> getPages() { throw new RuntimeException("Stub!"); }
/* 45 */   public void close() { throw new RuntimeException("Stub!"); }
/* 46 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\pdf\PdfDocument.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */