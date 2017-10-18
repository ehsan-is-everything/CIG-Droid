/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Enumeration;
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
/*    */ public abstract class PermissionCollection
/*    */   implements Serializable
/*    */ {
/* 30 */   public PermissionCollection() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void add(Permission paramPermission);
/*    */   public abstract boolean implies(Permission paramPermission);
/*    */   public abstract Enumeration<Permission> elements();
/* 34 */   public void setReadOnly() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean isReadOnly() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\PermissionCollection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */