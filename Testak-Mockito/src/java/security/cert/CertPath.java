/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.ObjectStreamException;
/*    */ import java.io.Serializable;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
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
/*    */ public abstract class CertPath
/*    */   implements Serializable
/*    */ {
/*    */   protected static class CertPathRep
/*    */     implements Serializable
/*    */   {
/* 33 */     protected CertPathRep(String type, byte[] data) { throw new RuntimeException("Stub!"); }
/* 34 */     protected Object readResolve() throws ObjectStreamException { throw new RuntimeException("Stub!"); } }
/*    */   
/* 36 */   protected CertPath(String type) { throw new RuntimeException("Stub!"); }
/* 37 */   public String getType() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Iterator<String> getEncodings();
/* 39 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 40 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 41 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   public abstract byte[] getEncoded() throws CertificateEncodingException;
/*    */   public abstract byte[] getEncoded(String paramString) throws CertificateEncodingException;
/*    */   public abstract List<? extends Certificate> getCertificates();
/* 45 */   protected Object writeReplace() throws ObjectStreamException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\CertPath.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */