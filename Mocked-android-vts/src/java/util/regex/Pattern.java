/*    */ package java.util.regex;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Stream;
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
/*    */ public final class Pattern
/*    */   implements Serializable
/*    */ {
/*    */   public static final int CANON_EQ = 128;
/*    */   public static final int CASE_INSENSITIVE = 2;
/*    */   public static final int COMMENTS = 4;
/*    */   public static final int DOTALL = 32;
/*    */   public static final int LITERAL = 16;
/*    */   public static final int MULTILINE = 8;
/*    */   public static final int UNICODE_CASE = 64;
/*    */   public static final int UNICODE_CHARACTER_CLASS = 256;
/*    */   public static final int UNIX_LINES = 1;
/*    */   
/* 31 */   Pattern() { throw new RuntimeException("Stub!"); }
/* 32 */   public static Pattern compile(String regex) { throw new RuntimeException("Stub!"); }
/* 33 */   public static Pattern compile(String regex, int flags) throws PatternSyntaxException { throw new RuntimeException("Stub!"); }
/* 34 */   public String pattern() { throw new RuntimeException("Stub!"); }
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 36 */   public Matcher matcher(CharSequence input) { throw new RuntimeException("Stub!"); }
/* 37 */   public int flags() { throw new RuntimeException("Stub!"); }
/* 38 */   public static boolean matches(String regex, CharSequence input) { throw new RuntimeException("Stub!"); }
/* 39 */   public String[] split(CharSequence input, int limit) { throw new RuntimeException("Stub!"); }
/* 40 */   public String[] split(CharSequence input) { throw new RuntimeException("Stub!"); }
/* 41 */   public static String quote(String s) { throw new RuntimeException("Stub!"); }
/* 42 */   public Predicate<String> asPredicate() { throw new RuntimeException("Stub!"); }
/* 43 */   public Stream<String> splitAsStream(CharSequence input) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\regex\Pattern.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */