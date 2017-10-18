/*    */ package javax.xml.validation;
/*    */ 
/*    */ import org.w3c.dom.TypeInfo;
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
/*    */ public abstract class TypeInfoProvider
/*    */ {
/*    */   protected TypeInfoProvider()
/*    */   {
/* 22 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract TypeInfo getElementTypeInfo();
/*    */   
/*    */   public abstract TypeInfo getAttributeTypeInfo(int paramInt);
/*    */   
/*    */   public abstract boolean isIdAttribute(int paramInt);
/*    */   
/*    */   public abstract boolean isSpecified(int paramInt);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\validation\TypeInfoProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */