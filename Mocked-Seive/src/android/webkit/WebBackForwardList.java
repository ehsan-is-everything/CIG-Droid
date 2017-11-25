/*    */ package android.webkit;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public abstract class WebBackForwardList
/*    */   implements Cloneable, Serializable
/*    */ {
/*    */   public WebBackForwardList()
/*    */   {
/* 21 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract WebHistoryItem getCurrentItem();
/*    */   
/*    */   public abstract int getCurrentIndex();
/*    */   
/*    */   public abstract WebHistoryItem getItemAtIndex(int paramInt);
/*    */   
/*    */   public abstract int getSize();
/*    */   
/*    */   protected abstract WebBackForwardList clone();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\WebBackForwardList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */