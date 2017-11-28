/*    */ package java.util;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.math.BigDecimal;
/*    */ import java.math.BigInteger;
/*    */ import java.nio.channels.ReadableByteChannel;
/*    */ import java.nio.file.Path;
/*    */ import java.util.regex.MatchResult;
/*    */ import java.util.regex.Pattern;
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
/*    */ public final class Scanner
/*    */   implements Iterator<String>, Closeable
/*    */ {
/* 31 */   public Scanner(Readable source) { throw new RuntimeException("Stub!"); }
/* 32 */   public Scanner(InputStream source) { throw new RuntimeException("Stub!"); }
/* 33 */   public Scanner(InputStream source, String charsetName) { throw new RuntimeException("Stub!"); }
/* 34 */   public Scanner(File source) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 35 */   public Scanner(File source, String charsetName) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 36 */   public Scanner(Path source) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public Scanner(Path source, String charsetName) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public Scanner(String source) { throw new RuntimeException("Stub!"); }
/* 39 */   public Scanner(ReadableByteChannel source) { throw new RuntimeException("Stub!"); }
/* 40 */   public Scanner(ReadableByteChannel source, String charsetName) { throw new RuntimeException("Stub!"); }
/* 41 */   public void close() { throw new RuntimeException("Stub!"); }
/* 42 */   public IOException ioException() { throw new RuntimeException("Stub!"); }
/* 43 */   public Pattern delimiter() { throw new RuntimeException("Stub!"); }
/* 44 */   public Scanner useDelimiter(Pattern pattern) { throw new RuntimeException("Stub!"); }
/* 45 */   public Scanner useDelimiter(String pattern) { throw new RuntimeException("Stub!"); }
/* 46 */   public Locale locale() { throw new RuntimeException("Stub!"); }
/* 47 */   public Scanner useLocale(Locale locale) { throw new RuntimeException("Stub!"); }
/* 48 */   public int radix() { throw new RuntimeException("Stub!"); }
/* 49 */   public Scanner useRadix(int radix) { throw new RuntimeException("Stub!"); }
/* 50 */   public MatchResult match() { throw new RuntimeException("Stub!"); }
/* 51 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean hasNext() { throw new RuntimeException("Stub!"); }
/* 53 */   public String next() { throw new RuntimeException("Stub!"); }
/* 54 */   public void remove() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean hasNext(String pattern) { throw new RuntimeException("Stub!"); }
/* 56 */   public String next(String pattern) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean hasNext(Pattern pattern) { throw new RuntimeException("Stub!"); }
/* 58 */   public String next(Pattern pattern) { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean hasNextLine() { throw new RuntimeException("Stub!"); }
/* 60 */   public String nextLine() { throw new RuntimeException("Stub!"); }
/* 61 */   public String findInLine(String pattern) { throw new RuntimeException("Stub!"); }
/* 62 */   public String findInLine(Pattern pattern) { throw new RuntimeException("Stub!"); }
/* 63 */   public String findWithinHorizon(String pattern, int horizon) { throw new RuntimeException("Stub!"); }
/* 64 */   public String findWithinHorizon(Pattern pattern, int horizon) { throw new RuntimeException("Stub!"); }
/* 65 */   public Scanner skip(Pattern pattern) { throw new RuntimeException("Stub!"); }
/* 66 */   public Scanner skip(String pattern) { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean hasNextBoolean() { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean nextBoolean() { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean hasNextByte() { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean hasNextByte(int radix) { throw new RuntimeException("Stub!"); }
/* 71 */   public byte nextByte() { throw new RuntimeException("Stub!"); }
/* 72 */   public byte nextByte(int radix) { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean hasNextShort() { throw new RuntimeException("Stub!"); }
/* 74 */   public boolean hasNextShort(int radix) { throw new RuntimeException("Stub!"); }
/* 75 */   public short nextShort() { throw new RuntimeException("Stub!"); }
/* 76 */   public short nextShort(int radix) { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean hasNextInt() { throw new RuntimeException("Stub!"); }
/* 78 */   public boolean hasNextInt(int radix) { throw new RuntimeException("Stub!"); }
/* 79 */   public int nextInt() { throw new RuntimeException("Stub!"); }
/* 80 */   public int nextInt(int radix) { throw new RuntimeException("Stub!"); }
/* 81 */   public boolean hasNextLong() { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean hasNextLong(int radix) { throw new RuntimeException("Stub!"); }
/* 83 */   public long nextLong() { throw new RuntimeException("Stub!"); }
/* 84 */   public long nextLong(int radix) { throw new RuntimeException("Stub!"); }
/* 85 */   public boolean hasNextFloat() { throw new RuntimeException("Stub!"); }
/* 86 */   public float nextFloat() { throw new RuntimeException("Stub!"); }
/* 87 */   public boolean hasNextDouble() { throw new RuntimeException("Stub!"); }
/* 88 */   public double nextDouble() { throw new RuntimeException("Stub!"); }
/* 89 */   public boolean hasNextBigInteger() { throw new RuntimeException("Stub!"); }
/* 90 */   public boolean hasNextBigInteger(int radix) { throw new RuntimeException("Stub!"); }
/* 91 */   public BigInteger nextBigInteger() { throw new RuntimeException("Stub!"); }
/* 92 */   public BigInteger nextBigInteger(int radix) { throw new RuntimeException("Stub!"); }
/* 93 */   public boolean hasNextBigDecimal() { throw new RuntimeException("Stub!"); }
/* 94 */   public BigDecimal nextBigDecimal() { throw new RuntimeException("Stub!"); }
/* 95 */   public Scanner reset() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\Scanner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */