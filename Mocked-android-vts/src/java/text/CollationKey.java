/*    */ package java.text;
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
/*    */ public abstract class CollationKey
/*    */   implements Comparable<CollationKey>
/*    */ {
/* 43 */   protected CollationKey(String source) { throw new RuntimeException("Stub!"); }
/*    */   public abstract int compareTo(CollationKey paramCollationKey);
/* 45 */   public String getSourceString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract byte[] toByteArray();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\text\CollationKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */