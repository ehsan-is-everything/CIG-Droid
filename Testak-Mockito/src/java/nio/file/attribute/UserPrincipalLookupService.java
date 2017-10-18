/*    */ package java.nio.file.attribute;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ public abstract class UserPrincipalLookupService
/*    */ {
/*    */   protected UserPrincipalLookupService()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract UserPrincipal lookupPrincipalByName(String paramString)
/*    */     throws IOException;
/*    */   
/*    */   public abstract GroupPrincipal lookupPrincipalByGroupName(String paramString)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\file\attribute\UserPrincipalLookupService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */