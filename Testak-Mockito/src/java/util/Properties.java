/*    */ package java.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.Reader;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Properties
/*    */   extends Hashtable<Object, Object>
/*    */ {
/*    */   protected Properties defaults;
/*    */   
/* 31 */   public Properties() { throw new RuntimeException("Stub!"); }
/* 32 */   public Properties(Properties defaults) { throw new RuntimeException("Stub!"); }
/* 33 */   public synchronized Object setProperty(String key, String value) { throw new RuntimeException("Stub!"); }
/* 34 */   public synchronized void load(Reader reader) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public synchronized void load(InputStream inStream) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public void save(OutputStream out, String comments) { throw new RuntimeException("Stub!"); }
/* 38 */   public void store(Writer writer, String comments) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public void store(OutputStream out, String comments) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException { throw new RuntimeException("Stub!"); }
/* 41 */   public void storeToXML(OutputStream os, String comment) throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public void storeToXML(OutputStream os, String comment, String encoding) throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public String getProperty(String key) { throw new RuntimeException("Stub!"); }
/* 44 */   public String getProperty(String key, String defaultValue) { throw new RuntimeException("Stub!"); }
/* 45 */   public Enumeration<?> propertyNames() { throw new RuntimeException("Stub!"); }
/* 46 */   public Set<String> stringPropertyNames() { throw new RuntimeException("Stub!"); }
/* 47 */   public void list(PrintStream out) { throw new RuntimeException("Stub!"); }
/* 48 */   public void list(PrintWriter out) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Properties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */