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
/*    */ 
/*    */ public abstract class UnicodeFilter
/*    */   implements UnicodeMatcher
/*    */ {
/* 15 */   UnicodeFilter() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean contains(int paramInt);
/* 17 */   public int matches(Replaceable text, int[] offset, int limit, boolean incremental) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\UnicodeFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */