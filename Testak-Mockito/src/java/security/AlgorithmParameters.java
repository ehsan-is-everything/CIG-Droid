/*    */ package java.security;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ import java.security.spec.InvalidParameterSpecException;
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
/*    */ public class AlgorithmParameters
/*    */ {
/* 29 */   protected AlgorithmParameters(AlgorithmParametersSpi paramSpi, Provider provider, String algorithm) { throw new RuntimeException("Stub!"); }
/* 30 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 31 */   public static AlgorithmParameters getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 32 */   public static AlgorithmParameters getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 33 */   public static AlgorithmParameters getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 34 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 35 */   public final void init(AlgorithmParameterSpec paramSpec) throws InvalidParameterSpecException { throw new RuntimeException("Stub!"); }
/* 36 */   public final void init(byte[] params) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public final void init(byte[] params, String format) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public final <T extends AlgorithmParameterSpec> T getParameterSpec(Class<T> paramSpec) throws InvalidParameterSpecException { throw new RuntimeException("Stub!"); }
/* 39 */   public final byte[] getEncoded() throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public final byte[] getEncoded(String format) throws IOException { throw new RuntimeException("Stub!"); }
/* 41 */   public final String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\AlgorithmParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */