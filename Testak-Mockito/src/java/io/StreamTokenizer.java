/*    */ package java.io;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class StreamTokenizer
/*    */ {
/*    */   public static final int TT_EOF = -1;
/*    */   
/*    */ 
/*    */ 
/*    */   public static final int TT_EOL = 10;
/*    */   
/*    */ 
/*    */   public static final int TT_NUMBER = -2;
/*    */   
/*    */ 
/*    */   public static final int TT_WORD = -3;
/*    */   
/*    */ 
/*    */   public double nval;
/*    */   
/*    */ 
/*    */   public String sval;
/*    */   
/*    */   public int ttype;
/*    */   
/*    */ 
/*    */   @Deprecated
/* 30 */   public StreamTokenizer(InputStream is) { throw new RuntimeException("Stub!"); }
/* 31 */   public StreamTokenizer(Reader r) { throw new RuntimeException("Stub!"); }
/* 32 */   public void resetSyntax() { throw new RuntimeException("Stub!"); }
/* 33 */   public void wordChars(int low, int hi) { throw new RuntimeException("Stub!"); }
/* 34 */   public void whitespaceChars(int low, int hi) { throw new RuntimeException("Stub!"); }
/* 35 */   public void ordinaryChars(int low, int hi) { throw new RuntimeException("Stub!"); }
/* 36 */   public void ordinaryChar(int ch) { throw new RuntimeException("Stub!"); }
/* 37 */   public void commentChar(int ch) { throw new RuntimeException("Stub!"); }
/* 38 */   public void quoteChar(int ch) { throw new RuntimeException("Stub!"); }
/* 39 */   public void parseNumbers() { throw new RuntimeException("Stub!"); }
/* 40 */   public void eolIsSignificant(boolean flag) { throw new RuntimeException("Stub!"); }
/* 41 */   public void slashStarComments(boolean flag) { throw new RuntimeException("Stub!"); }
/* 42 */   public void slashSlashComments(boolean flag) { throw new RuntimeException("Stub!"); }
/* 43 */   public void lowerCaseMode(boolean fl) { throw new RuntimeException("Stub!"); }
/* 44 */   public int nextToken() throws IOException { throw new RuntimeException("Stub!"); }
/* 45 */   public void pushBack() { throw new RuntimeException("Stub!"); }
/* 46 */   public int lineno() { throw new RuntimeException("Stub!"); }
/* 47 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\StreamTokenizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */