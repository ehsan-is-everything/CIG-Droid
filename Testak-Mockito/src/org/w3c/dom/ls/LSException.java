/*    */ package org.w3c.dom.ls;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LSException
/*    */   extends RuntimeException
/*    */ {
/*    */   public static final short PARSE_ERR = 81;
/*    */   
/*    */   public static final short SERIALIZE_ERR = 82;
/*    */   
/*    */   public short code;
/*    */   
/*    */ 
/*    */   public LSException(short code, String message)
/*    */   {
/* 17 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\w3c\dom\ls\LSException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */