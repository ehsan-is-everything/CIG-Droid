/*    */ package android.test;
/*    */ 
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.regex.MatchResult;
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
/*    */ @Deprecated
/*    */ public final class MoreAsserts
/*    */ {
/* 21 */   MoreAsserts() { throw new RuntimeException("Stub!"); }
/* 22 */   public static void assertAssignableFrom(Class<?> expected, Object actual) { throw new RuntimeException("Stub!"); }
/* 23 */   public static void assertAssignableFrom(Class<?> expected, Class<?> actual) { throw new RuntimeException("Stub!"); }
/* 24 */   public static void assertNotEqual(String message, Object unexpected, Object actual) { throw new RuntimeException("Stub!"); }
/* 25 */   public static void assertNotEqual(Object unexpected, Object actual) { throw new RuntimeException("Stub!"); }
/* 26 */   public static void assertEquals(String message, byte[] expected, byte[] actual) { throw new RuntimeException("Stub!"); }
/* 27 */   public static void assertEquals(byte[] expected, byte[] actual) { throw new RuntimeException("Stub!"); }
/* 28 */   public static void assertEquals(String message, int[] expected, int[] actual) { throw new RuntimeException("Stub!"); }
/* 29 */   public static void assertEquals(int[] expected, int[] actual) { throw new RuntimeException("Stub!"); }
/* 30 */   public static void assertEquals(String message, double[] expected, double[] actual) { throw new RuntimeException("Stub!"); }
/* 31 */   public static void assertEquals(double[] expected, double[] actual) { throw new RuntimeException("Stub!"); }
/* 32 */   public static void assertEquals(String message, Object[] expected, Object[] actual) { throw new RuntimeException("Stub!"); }
/* 33 */   public static void assertEquals(Object[] expected, Object[] actual) { throw new RuntimeException("Stub!"); }
/* 34 */   public static void assertEquals(String message, Set<? extends Object> expected, Set<? extends Object> actual) { throw new RuntimeException("Stub!"); }
/* 35 */   public static void assertEquals(Set<? extends Object> expected, Set<? extends Object> actual) { throw new RuntimeException("Stub!"); }
/* 36 */   public static MatchResult assertMatchesRegex(String message, String expectedRegex, String actual) { throw new RuntimeException("Stub!"); }
/* 37 */   public static MatchResult assertMatchesRegex(String expectedRegex, String actual) { throw new RuntimeException("Stub!"); }
/* 38 */   public static MatchResult assertContainsRegex(String message, String expectedRegex, String actual) { throw new RuntimeException("Stub!"); }
/* 39 */   public static MatchResult assertContainsRegex(String expectedRegex, String actual) { throw new RuntimeException("Stub!"); }
/* 40 */   public static void assertNotMatchesRegex(String message, String expectedRegex, String actual) { throw new RuntimeException("Stub!"); }
/* 41 */   public static void assertNotMatchesRegex(String expectedRegex, String actual) { throw new RuntimeException("Stub!"); }
/* 42 */   public static void assertNotContainsRegex(String message, String expectedRegex, String actual) { throw new RuntimeException("Stub!"); }
/* 43 */   public static void assertNotContainsRegex(String expectedRegex, String actual) { throw new RuntimeException("Stub!"); }
/* 44 */   public static void assertContentsInOrder(String message, Iterable<?> actual, Object... expected) { throw new RuntimeException("Stub!"); }
/* 45 */   public static void assertContentsInOrder(Iterable<?> actual, Object... expected) { throw new RuntimeException("Stub!"); }
/* 46 */   public static void assertContentsInAnyOrder(String message, Iterable<?> actual, Object... expected) { throw new RuntimeException("Stub!"); }
/* 47 */   public static void assertContentsInAnyOrder(Iterable<?> actual, Object... expected) { throw new RuntimeException("Stub!"); }
/* 48 */   public static void assertEmpty(String message, Iterable<?> iterable) { throw new RuntimeException("Stub!"); }
/* 49 */   public static void assertEmpty(Iterable<?> iterable) { throw new RuntimeException("Stub!"); }
/* 50 */   public static void assertEmpty(String message, Map<?, ?> map) { throw new RuntimeException("Stub!"); }
/* 51 */   public static void assertEmpty(Map<?, ?> map) { throw new RuntimeException("Stub!"); }
/* 52 */   public static void assertNotEmpty(String message, Iterable<?> iterable) { throw new RuntimeException("Stub!"); }
/* 53 */   public static void assertNotEmpty(Iterable<?> iterable) { throw new RuntimeException("Stub!"); }
/* 54 */   public static void assertNotEmpty(String message, Map<?, ?> map) { throw new RuntimeException("Stub!"); }
/* 55 */   public static void assertNotEmpty(Map<?, ?> map) { throw new RuntimeException("Stub!"); }
/* 56 */   public static void checkEqualsAndHashCodeMethods(String message, Object lhs, Object rhs, boolean expectedResult) { throw new RuntimeException("Stub!"); }
/* 57 */   public static void checkEqualsAndHashCodeMethods(Object lhs, Object rhs, boolean expectedResult) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\MoreAsserts.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */