/*    */ package java.security;
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
/*    */ public abstract class Permission
/*    */   implements Guard, Serializable
/*    */ {
/* 30 */   public Permission(String name) { throw new RuntimeException("Stub!"); }
/* 31 */   public void checkGuard(Object object) throws SecurityException { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean implies(Permission paramPermission);
/* 33 */   public final String getName() { throw new RuntimeException("Stub!"); }
/*    */   public abstract String getActions();
/* 35 */   public PermissionCollection newPermissionCollection() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\Permission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */