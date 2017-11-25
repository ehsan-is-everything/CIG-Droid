/*    */ package javax.xml.validation;
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
/*    */ public abstract class Schema
/*    */ {
/*    */   protected Schema()
/*    */   {
/* 23 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract Validator newValidator();
/*    */   
/*    */   public abstract ValidatorHandler newValidatorHandler();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\validation\Schema.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */