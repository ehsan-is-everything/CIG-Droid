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
/*    */ public abstract class BasicPermission
/*    */   extends Permission
/*    */   implements Serializable
/*    */ {
/*    */   public BasicPermission(String name)
/*    */   {
/* 31 */     super((String)null);throw new RuntimeException("Stub!"); }
/* 32 */   public BasicPermission(String name, String actions) { super((String)null);throw new RuntimeException("Stub!"); }
/* 33 */   public boolean implies(Permission p) { throw new RuntimeException("Stub!"); }
/* 34 */   public String getActions() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\BasicPermission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */