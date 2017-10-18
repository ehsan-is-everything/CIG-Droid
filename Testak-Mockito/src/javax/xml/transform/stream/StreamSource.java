/*    */ package javax.xml.transform.stream;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.InputStream;
/*    */ import java.io.Reader;
/*    */ import javax.xml.transform.Source;
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
/*    */ public class StreamSource
/*    */   implements Source
/*    */ {
/*    */   public static final String FEATURE = "http://javax.xml.transform.stream.StreamSource/feature";
/*    */   
/* 24 */   public StreamSource() { throw new RuntimeException("Stub!"); }
/* 25 */   public StreamSource(InputStream inputStream) { throw new RuntimeException("Stub!"); }
/* 26 */   public StreamSource(InputStream inputStream, String systemId) { throw new RuntimeException("Stub!"); }
/* 27 */   public StreamSource(Reader reader) { throw new RuntimeException("Stub!"); }
/* 28 */   public StreamSource(Reader reader, String systemId) { throw new RuntimeException("Stub!"); }
/* 29 */   public StreamSource(String systemId) { throw new RuntimeException("Stub!"); }
/* 30 */   public StreamSource(File f) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setInputStream(InputStream inputStream) { throw new RuntimeException("Stub!"); }
/* 32 */   public InputStream getInputStream() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setReader(Reader reader) { throw new RuntimeException("Stub!"); }
/* 34 */   public Reader getReader() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setPublicId(String publicId) { throw new RuntimeException("Stub!"); }
/* 36 */   public String getPublicId() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setSystemId(String systemId) { throw new RuntimeException("Stub!"); }
/* 38 */   public String getSystemId() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setSystemId(File f) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\transform\stream\StreamSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */