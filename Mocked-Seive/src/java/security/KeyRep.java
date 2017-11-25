/*    */ package java.security;
/*    */ 
/*    */ import java.io.ObjectStreamException;
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
/*    */ public class KeyRep
/*    */   implements Serializable
/*    */ {
/*    */   public static enum Type
/*    */   {
/* 32 */     PRIVATE, 
/* 33 */     PUBLIC, 
/* 34 */     SECRET;
/*    */     private Type() {} }
/* 36 */   public KeyRep(Type type, String algorithm, String format, byte[] encoded) { throw new RuntimeException("Stub!"); }
/* 37 */   protected Object readResolve() throws ObjectStreamException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\KeyRep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */