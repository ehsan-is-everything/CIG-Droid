/*    */ package java.security;
/*    */ 
/*    */ import javax.security.auth.Subject;
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
/*    */ public abstract interface Principal
/*    */ {
/*    */   public abstract boolean equals(Object paramObject);
/*    */   
/*    */   public abstract String toString();
/*    */   
/*    */   public abstract int hashCode();
/*    */   
/*    */   public abstract String getName();
/*    */   
/*    */   public boolean implies(Subject subject)
/*    */   {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\Principal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */