/*    */ package java.nio.charset;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.CharBuffer;
/*    */ import java.util.Locale;
/*    */ import java.util.Set;
/*    */ import java.util.SortedMap;
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
/*    */ public abstract class Charset
/*    */   implements Comparable<Charset>
/*    */ {
/* 31 */   protected Charset(String canonicalName, String[] aliases) { throw new RuntimeException("Stub!"); }
/* 32 */   public static boolean isSupported(String charsetName) { throw new RuntimeException("Stub!"); }
/* 33 */   public static Charset forName(String charsetName) { throw new RuntimeException("Stub!"); }
/* 34 */   public static SortedMap<String, Charset> availableCharsets() { throw new RuntimeException("Stub!"); }
/* 35 */   public static Charset defaultCharset() { throw new RuntimeException("Stub!"); }
/* 36 */   public final String name() { throw new RuntimeException("Stub!"); }
/* 37 */   public final Set<String> aliases() { throw new RuntimeException("Stub!"); }
/* 38 */   public String displayName() { throw new RuntimeException("Stub!"); }
/* 39 */   public final boolean isRegistered() { throw new RuntimeException("Stub!"); }
/* 40 */   public String displayName(Locale locale) { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean contains(Charset paramCharset);
/*    */   public abstract CharsetDecoder newDecoder();
/*    */   public abstract CharsetEncoder newEncoder();
/* 44 */   public boolean canEncode() { throw new RuntimeException("Stub!"); }
/* 45 */   public final CharBuffer decode(ByteBuffer bb) { throw new RuntimeException("Stub!"); }
/* 46 */   public final ByteBuffer encode(CharBuffer cb) { throw new RuntimeException("Stub!"); }
/* 47 */   public final ByteBuffer encode(String str) { throw new RuntimeException("Stub!"); }
/* 48 */   public final int compareTo(Charset that) { throw new RuntimeException("Stub!"); }
/* 49 */   public final int hashCode() { throw new RuntimeException("Stub!"); }
/* 50 */   public final boolean equals(Object ob) { throw new RuntimeException("Stub!"); }
/* 51 */   public final String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\charset\Charset.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */