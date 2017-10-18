/*    */ package android.icu.text;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UnicodeSetSpanner
/*    */ {
/*    */   public static enum CountMethod
/*    */   {
/* 15 */     MIN_ELEMENTS, 
/* 16 */     WHOLE_SPAN;
/*    */     
/*    */     private CountMethod() {} }
/*    */   
/* 20 */   public static enum TrimOption { BOTH, 
/* 21 */     LEADING, 
/* 22 */     TRAILING;
/*    */     private TrimOption() {} }
/* 24 */   public UnicodeSetSpanner(UnicodeSet source) { throw new RuntimeException("Stub!"); }
/* 25 */   public UnicodeSet getUnicodeSet() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 27 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 28 */   public int countIn(CharSequence sequence) { throw new RuntimeException("Stub!"); }
/* 29 */   public int countIn(CharSequence sequence, CountMethod countMethod) { throw new RuntimeException("Stub!"); }
/* 30 */   public int countIn(CharSequence sequence, CountMethod countMethod, UnicodeSet.SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
/* 31 */   public String deleteFrom(CharSequence sequence) { throw new RuntimeException("Stub!"); }
/* 32 */   public String deleteFrom(CharSequence sequence, UnicodeSet.SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
/* 33 */   public String replaceFrom(CharSequence sequence, CharSequence replacement) { throw new RuntimeException("Stub!"); }
/* 34 */   public String replaceFrom(CharSequence sequence, CharSequence replacement, CountMethod countMethod) { throw new RuntimeException("Stub!"); }
/* 35 */   public String replaceFrom(CharSequence sequence, CharSequence replacement, CountMethod countMethod, UnicodeSet.SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
/* 36 */   public CharSequence trim(CharSequence sequence) { throw new RuntimeException("Stub!"); }
/* 37 */   public CharSequence trim(CharSequence sequence, TrimOption trimOption) { throw new RuntimeException("Stub!"); }
/* 38 */   public CharSequence trim(CharSequence sequence, TrimOption trimOption, UnicodeSet.SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\UnicodeSetSpanner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */