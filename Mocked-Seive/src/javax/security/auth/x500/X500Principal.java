/*    */ package javax.security.auth.x500;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.Serializable;
/*    */ import java.security.Principal;
/*    */ import java.util.Map;
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
/*    */ public final class X500Principal
/*    */   implements Principal, Serializable
/*    */ {
/*    */   public static final String CANONICAL = "CANONICAL";
/*    */   public static final String RFC1779 = "RFC1779";
/*    */   public static final String RFC2253 = "RFC2253";
/*    */   
/* 30 */   public X500Principal(String name) { throw new RuntimeException("Stub!"); }
/* 31 */   public X500Principal(String name, Map<String, String> keywordMap) { throw new RuntimeException("Stub!"); }
/* 32 */   public X500Principal(byte[] name) { throw new RuntimeException("Stub!"); }
/* 33 */   public X500Principal(InputStream is) { throw new RuntimeException("Stub!"); }
/* 34 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 35 */   public String getName(String format) { throw new RuntimeException("Stub!"); }
/* 36 */   public String getName(String format, Map<String, String> oidMap) { throw new RuntimeException("Stub!"); }
/* 37 */   public byte[] getEncoded() { throw new RuntimeException("Stub!"); }
/* 38 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 40 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\security\auth\x500\X500Principal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */