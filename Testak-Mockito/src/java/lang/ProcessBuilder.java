/*    */ package java.lang;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public final class ProcessBuilder
/*    */ {
/*    */   public static abstract class Redirect
/*    */   {
/*    */     public static enum Type
/*    */     {
/* 33 */       APPEND, 
/* 34 */       INHERIT, 
/* 35 */       PIPE, 
/* 36 */       READ, 
/* 37 */       WRITE;
/*    */       private Type() {} }
/* 39 */     Redirect() { throw new RuntimeException("Stub!"); }
/*    */     public abstract Type type();
/* 41 */     public File file() { throw new RuntimeException("Stub!"); }
/* 42 */     public static Redirect from(File file) { throw new RuntimeException("Stub!"); }
/* 43 */     public static Redirect to(File file) { throw new RuntimeException("Stub!"); }
/* 44 */     public static Redirect appendTo(File file) { throw new RuntimeException("Stub!"); }
/* 45 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 46 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/* 49 */     public static final Redirect PIPE = null; public static final Redirect INHERIT = null; }
/*    */   
/* 51 */   public ProcessBuilder(List<String> command) { throw new RuntimeException("Stub!"); }
/* 52 */   public ProcessBuilder(String... command) { throw new RuntimeException("Stub!"); }
/* 53 */   public ProcessBuilder command(List<String> command) { throw new RuntimeException("Stub!"); }
/* 54 */   public ProcessBuilder command(String... command) { throw new RuntimeException("Stub!"); }
/* 55 */   public List<String> command() { throw new RuntimeException("Stub!"); }
/* 56 */   public Map<String, String> environment() { throw new RuntimeException("Stub!"); }
/* 57 */   public File directory() { throw new RuntimeException("Stub!"); }
/* 58 */   public ProcessBuilder directory(File directory) { throw new RuntimeException("Stub!"); }
/* 59 */   public ProcessBuilder redirectInput(Redirect source) { throw new RuntimeException("Stub!"); }
/* 60 */   public ProcessBuilder redirectOutput(Redirect destination) { throw new RuntimeException("Stub!"); }
/* 61 */   public ProcessBuilder redirectError(Redirect destination) { throw new RuntimeException("Stub!"); }
/* 62 */   public ProcessBuilder redirectInput(File file) { throw new RuntimeException("Stub!"); }
/* 63 */   public ProcessBuilder redirectOutput(File file) { throw new RuntimeException("Stub!"); }
/* 64 */   public ProcessBuilder redirectError(File file) { throw new RuntimeException("Stub!"); }
/* 65 */   public Redirect redirectInput() { throw new RuntimeException("Stub!"); }
/* 66 */   public Redirect redirectOutput() { throw new RuntimeException("Stub!"); }
/* 67 */   public Redirect redirectError() { throw new RuntimeException("Stub!"); }
/* 68 */   public ProcessBuilder inheritIO() { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean redirectErrorStream() { throw new RuntimeException("Stub!"); }
/* 70 */   public ProcessBuilder redirectErrorStream(boolean redirectErrorStream) { throw new RuntimeException("Stub!"); }
/* 71 */   public Process start() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\ProcessBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */