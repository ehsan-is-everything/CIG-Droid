/*    */ package android.icu.text;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Normalizer2
/*    */ {
/*    */   public static enum Mode
/*    */   {
/* 16 */     COMPOSE, 
/* 17 */     COMPOSE_CONTIGUOUS, 
/* 18 */     DECOMPOSE, 
/* 19 */     FCD;
/*    */     private Mode() {} }
/* 21 */   Normalizer2() { throw new RuntimeException("Stub!"); }
/* 22 */   public static Normalizer2 getNFCInstance() { throw new RuntimeException("Stub!"); }
/* 23 */   public static Normalizer2 getNFDInstance() { throw new RuntimeException("Stub!"); }
/* 24 */   public static Normalizer2 getNFKCInstance() { throw new RuntimeException("Stub!"); }
/* 25 */   public static Normalizer2 getNFKDInstance() { throw new RuntimeException("Stub!"); }
/* 26 */   public static Normalizer2 getNFKCCasefoldInstance() { throw new RuntimeException("Stub!"); }
/* 27 */   public static Normalizer2 getInstance(InputStream data, String name, Mode mode) { throw new RuntimeException("Stub!"); }
/* 28 */   public String normalize(CharSequence src) { throw new RuntimeException("Stub!"); }
/*    */   public abstract StringBuilder normalize(CharSequence paramCharSequence, StringBuilder paramStringBuilder);
/*    */   public abstract Appendable normalize(CharSequence paramCharSequence, Appendable paramAppendable);
/*    */   public abstract StringBuilder normalizeSecondAndAppend(StringBuilder paramStringBuilder, CharSequence paramCharSequence);
/*    */   public abstract StringBuilder append(StringBuilder paramStringBuilder, CharSequence paramCharSequence);
/*    */   public abstract String getDecomposition(int paramInt);
/* 34 */   public String getRawDecomposition(int c) { throw new RuntimeException("Stub!"); }
/* 35 */   public int composePair(int a, int b) { throw new RuntimeException("Stub!"); }
/* 36 */   public int getCombiningClass(int c) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean isNormalized(CharSequence paramCharSequence);
/*    */   
/*    */   public abstract Normalizer.QuickCheckResult quickCheck(CharSequence paramCharSequence);
/*    */   
/*    */   public abstract int spanQuickCheckYes(CharSequence paramCharSequence);
/*    */   
/*    */   public abstract boolean hasBoundaryBefore(int paramInt);
/*    */   
/*    */   public abstract boolean hasBoundaryAfter(int paramInt);
/*    */   
/*    */   public abstract boolean isInert(int paramInt);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\Normalizer2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */