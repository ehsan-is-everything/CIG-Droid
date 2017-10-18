/*    */ package java.security;
/*    */ 
/*    */ import java.security.spec.AlgorithmParameterSpec;
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
/*    */ public class AlgorithmParameterGenerator
/*    */ {
/* 29 */   protected AlgorithmParameterGenerator(AlgorithmParameterGeneratorSpi paramGenSpi, Provider provider, String algorithm) { throw new RuntimeException("Stub!"); }
/* 30 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 31 */   public static AlgorithmParameterGenerator getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 32 */   public static AlgorithmParameterGenerator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 33 */   public static AlgorithmParameterGenerator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 34 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 35 */   public final void init(int size) { throw new RuntimeException("Stub!"); }
/* 36 */   public final void init(int size, SecureRandom random) { throw new RuntimeException("Stub!"); }
/* 37 */   public final void init(AlgorithmParameterSpec genParamSpec) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 38 */   public final void init(AlgorithmParameterSpec genParamSpec, SecureRandom random) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 39 */   public final AlgorithmParameters generateParameters() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\AlgorithmParameterGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */