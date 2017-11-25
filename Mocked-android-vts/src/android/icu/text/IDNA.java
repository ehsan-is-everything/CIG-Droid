/*    */ package android.icu.text;
/*    */ 
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public abstract class IDNA {
/*    */   public static final int CHECK_BIDI = 4;
/*    */   public static final int CHECK_CONTEXTJ = 8;
/*    */   public static final int CHECK_CONTEXTO = 64;
/*    */   public static final int DEFAULT = 0;
/*    */   public static final int NONTRANSITIONAL_TO_ASCII = 16;
/*    */   public static final int NONTRANSITIONAL_TO_UNICODE = 32;
/*    */   public static final int USE_STD3_RULES = 2;
/*    */   
/*    */   public static final class Info {
/* 16 */     public Info() { throw new RuntimeException("Stub!"); }
/* 17 */     public boolean hasErrors() { throw new RuntimeException("Stub!"); }
/* 18 */     public Set<IDNA.Error> getErrors() { throw new RuntimeException("Stub!"); }
/* 19 */     public boolean isTransitionalDifferent() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static enum Error {
/* 23 */     BIDI, 
/* 24 */     CONTEXTJ, 
/* 25 */     CONTEXTO_DIGITS, 
/* 26 */     CONTEXTO_PUNCTUATION, 
/* 27 */     DISALLOWED, 
/* 28 */     DOMAIN_NAME_TOO_LONG, 
/* 29 */     EMPTY_LABEL, 
/* 30 */     HYPHEN_3_4, 
/* 31 */     INVALID_ACE_LABEL, 
/* 32 */     LABEL_HAS_DOT, 
/* 33 */     LABEL_TOO_LONG, 
/* 34 */     LEADING_COMBINING_MARK, 
/* 35 */     LEADING_HYPHEN, 
/* 36 */     PUNYCODE, 
/* 37 */     TRAILING_HYPHEN;
/*    */     private Error() {} }
/* 39 */   IDNA() { throw new RuntimeException("Stub!"); }
/* 40 */   public static IDNA getUTS46Instance(int options) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract StringBuilder labelToASCII(CharSequence paramCharSequence, StringBuilder paramStringBuilder, Info paramInfo);
/*    */   
/*    */   public abstract StringBuilder labelToUnicode(CharSequence paramCharSequence, StringBuilder paramStringBuilder, Info paramInfo);
/*    */   
/*    */   public abstract StringBuilder nameToASCII(CharSequence paramCharSequence, StringBuilder paramStringBuilder, Info paramInfo);
/*    */   
/*    */   public abstract StringBuilder nameToUnicode(CharSequence paramCharSequence, StringBuilder paramStringBuilder, Info paramInfo);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\IDNA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */