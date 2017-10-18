/*    */ package javax.xml.transform.stream;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.OutputStream;
/*    */ import java.io.Writer;
/*    */ import javax.xml.transform.Result;
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
/*    */ public class StreamResult
/*    */   implements Result
/*    */ {
/*    */   public static final String FEATURE = "http://javax.xml.transform.stream.StreamResult/feature";
/*    */   
/* 24 */   public StreamResult() { throw new RuntimeException("Stub!"); }
/* 25 */   public StreamResult(OutputStream outputStream) { throw new RuntimeException("Stub!"); }
/* 26 */   public StreamResult(Writer writer) { throw new RuntimeException("Stub!"); }
/* 27 */   public StreamResult(String systemId) { throw new RuntimeException("Stub!"); }
/* 28 */   public StreamResult(File f) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setOutputStream(OutputStream outputStream) { throw new RuntimeException("Stub!"); }
/* 30 */   public OutputStream getOutputStream() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setWriter(Writer writer) { throw new RuntimeException("Stub!"); }
/* 32 */   public Writer getWriter() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setSystemId(String systemId) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setSystemId(File f) { throw new RuntimeException("Stub!"); }
/* 35 */   public String getSystemId() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\transform\stream\StreamResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */