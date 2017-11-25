/*    */ package android.util;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.io.Reader;
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
/*    */ public final class JsonReader
/*    */   implements Closeable
/*    */ {
/* 21 */   public JsonReader(Reader in) { throw new RuntimeException("Stub!"); }
/* 22 */   public void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isLenient() { throw new RuntimeException("Stub!"); }
/* 24 */   public void beginArray() throws IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public void endArray() throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public void beginObject() throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public void endObject() throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean hasNext() throws IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public JsonToken peek() throws IOException { throw new RuntimeException("Stub!"); }
/* 30 */   public String nextName() throws IOException { throw new RuntimeException("Stub!"); }
/* 31 */   public String nextString() throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean nextBoolean() throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public void nextNull() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public double nextDouble() throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public long nextLong() throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public int nextInt() throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public void skipValue() throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\util\JsonReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */