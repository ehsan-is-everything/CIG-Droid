/*    */ package android.util;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.io.Writer;
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
/*    */ public final class JsonWriter
/*    */   implements Closeable
/*    */ {
/* 21 */   public JsonWriter(Writer out) { throw new RuntimeException("Stub!"); }
/* 22 */   public void setIndent(String indent) { throw new RuntimeException("Stub!"); }
/* 23 */   public void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isLenient() { throw new RuntimeException("Stub!"); }
/* 25 */   public JsonWriter beginArray() throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public JsonWriter endArray() throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public JsonWriter beginObject() throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public JsonWriter endObject() throws IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public JsonWriter name(String name) throws IOException { throw new RuntimeException("Stub!"); }
/* 30 */   public JsonWriter value(String value) throws IOException { throw new RuntimeException("Stub!"); }
/* 31 */   public JsonWriter nullValue() throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public JsonWriter value(boolean value) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public JsonWriter value(double value) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public JsonWriter value(long value) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public JsonWriter value(Number value) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\util\JsonWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */