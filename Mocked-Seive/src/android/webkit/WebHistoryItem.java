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
/*    */ public abstract class WebHistoryItem
/*    */   implements Cloneable
/*    */ {
/*    */   public WebHistoryItem()
/*    */   {
/* 21 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract String getUrl();
/*    */   
/*    */   public abstract String getOriginalUrl();
/*    */   
/*    */   public abstract String getTitle();
/*    */   
/*    */   public abstract Bitmap getFavicon();
/*    */   
/*    */   protected abstract WebHistoryItem clone();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\WebHistoryItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */