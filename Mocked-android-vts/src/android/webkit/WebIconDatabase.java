/*    */ package android.webkit;
/*    */ 
/*    */ import android.graphics.Bitmap;
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
/*    */ @Deprecated
/*    */ public abstract class WebIconDatabase
/*    */ {
/* 26 */   public WebIconDatabase() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void open(String paramString);
/*    */   public abstract void close();
/*    */   public abstract void removeAllIcons();
/*    */   public abstract void requestIconForPageUrl(String paramString, IconListener paramIconListener);
/*    */   public abstract void retainIconForPageUrl(String paramString);
/*    */   public abstract void releaseIconForPageUrl(String paramString);
/* 33 */   public static WebIconDatabase getInstance() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/*    */   public static abstract interface IconListener
/*    */   {
/*    */     public abstract void onReceivedIcon(String paramString, Bitmap paramBitmap);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\WebIconDatabase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */