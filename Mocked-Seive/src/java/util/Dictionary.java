/*    */ package java.util;
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
/*    */ 
/*    */ 
/*    */ public abstract class Dictionary<K, V>
/*    */ {
/*    */   public Dictionary()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract int size();
/*    */   
/*    */   public abstract boolean isEmpty();
/*    */   
/*    */   public abstract Enumeration<K> keys();
/*    */   
/*    */   public abstract Enumeration<V> elements();
/*    */   
/*    */   public abstract V get(Object paramObject);
/*    */   
/*    */   public abstract V put(K paramK, V paramV);
/*    */   
/*    */   public abstract V remove(Object paramObject);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\Dictionary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */