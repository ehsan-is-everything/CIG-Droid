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
/*    */ public final class Normalizer
/*    */   implements Cloneable
/*    */ {
/*    */   public static final class QuickCheckResult
/*    */   {
/* 16 */     QuickCheckResult() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 18 */   Normalizer() { throw new RuntimeException("Stub!"); }
/* 19 */   public static int compare(char[] s1, int s1Start, int s1Limit, char[] s2, int s2Start, int s2Limit, int options) { throw new RuntimeException("Stub!"); }
/* 20 */   public static int compare(String s1, String s2, int options) { throw new RuntimeException("Stub!"); }
/* 21 */   public static int compare(char[] s1, char[] s2, int options) { throw new RuntimeException("Stub!"); }
/* 22 */   public static int compare(int char32a, int char32b, int options) { throw new RuntimeException("Stub!"); }
/* 23 */   public static int compare(int char32a, String str2, int options) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 32 */   public static final QuickCheckResult YES = null; public static final QuickCheckResult NO = null; public static final QuickCheckResult MAYBE = null;
/*    */   public static final int INPUT_IS_FCD = 131072;
/*    */   public static final int FOLD_CASE_EXCLUDE_SPECIAL_I = 1;
/*    */   public static final int FOLD_CASE_DEFAULT = 0;
/*    */   public static final int COMPARE_IGNORE_CASE = 65536;
/*    */   public static final int COMPARE_CODE_POINT_ORDER = 32768;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\Normalizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */