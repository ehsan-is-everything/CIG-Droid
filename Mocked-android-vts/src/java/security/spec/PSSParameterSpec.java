/*    */ package java.security.spec;
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
/*    */ 
/*    */ 
/*    */ public class PSSParameterSpec
/*    */   implements AlgorithmParameterSpec
/*    */ {
/* 30 */   public PSSParameterSpec(String mdName, String mgfName, AlgorithmParameterSpec mgfSpec, int saltLen, int trailerField) { throw new RuntimeException("Stub!"); }
/* 31 */   public PSSParameterSpec(int saltLen) { throw new RuntimeException("Stub!"); }
/* 32 */   public String getDigestAlgorithm() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getMGFAlgorithm() { throw new RuntimeException("Stub!"); }
/* 34 */   public AlgorithmParameterSpec getMGFParameters() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getSaltLength() { throw new RuntimeException("Stub!"); }
/* 36 */   public int getTrailerField() { throw new RuntimeException("Stub!"); }
/*    */   
/* 38 */   public static final PSSParameterSpec DEFAULT = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\spec\PSSParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */