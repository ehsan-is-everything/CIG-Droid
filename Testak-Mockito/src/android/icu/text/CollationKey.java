/*    */ package android.icu.text;
/*    */ 
/*    */ 
/*    */ public final class CollationKey
/*    */   implements Comparable<CollationKey>
/*    */ {
/*    */   public static final class BoundMode
/*    */   {
/*    */     public static final int LOWER = 0;
/*    */     
/*    */     public static final int UPPER = 1;
/*    */     public static final int UPPER_LONG = 2;
/*    */     
/*    */     BoundMode()
/*    */     {
/* 16 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */ 
/* 21 */   public CollationKey(String source, byte[] key) { throw new RuntimeException("Stub!"); }
/* 22 */   public String getSourceString() { throw new RuntimeException("Stub!"); }
/* 23 */   public byte[] toByteArray() { throw new RuntimeException("Stub!"); }
/* 24 */   public int compareTo(CollationKey target) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean equals(Object target) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean equals(CollationKey target) { throw new RuntimeException("Stub!"); }
/* 27 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 28 */   public CollationKey getBound(int boundType, int noOfLevels) { throw new RuntimeException("Stub!"); }
/* 29 */   public CollationKey merge(CollationKey source) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\CollationKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */