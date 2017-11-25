/*    */ package javax.crypto.spec;
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
/*    */ public class OAEPParameterSpec
/*    */   implements AlgorithmParameterSpec
/*    */ {
/* 30 */   public OAEPParameterSpec(String mdName, String mgfName, AlgorithmParameterSpec mgfSpec, PSource pSrc) { throw new RuntimeException("Stub!"); }
/* 31 */   public String getDigestAlgorithm() { throw new RuntimeException("Stub!"); }
/* 32 */   public String getMGFAlgorithm() { throw new RuntimeException("Stub!"); }
/* 33 */   public AlgorithmParameterSpec getMGFParameters() { throw new RuntimeException("Stub!"); }
/* 34 */   public PSource getPSource() { throw new RuntimeException("Stub!"); }
/*    */   
/* 36 */   public static final OAEPParameterSpec DEFAULT = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\crypto\spec\OAEPParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */