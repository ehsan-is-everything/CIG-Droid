/*    */ package javax.xml.parsers;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import javax.xml.validation.Schema;
/*    */ import org.xml.sax.HandlerBase;
/*    */ import org.xml.sax.InputSource;
/*    */ import org.xml.sax.Parser;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXNotRecognizedException;
/*    */ import org.xml.sax.SAXNotSupportedException;
/*    */ import org.xml.sax.XMLReader;
/*    */ import org.xml.sax.helpers.DefaultHandler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class SAXParser
/*    */ {
/* 23 */   protected SAXParser() { throw new RuntimeException("Stub!"); }
/* 24 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 25 */   public void parse(InputStream is, HandlerBase hb) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public void parse(InputStream is, HandlerBase hb, String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public void parse(InputStream is, DefaultHandler dh) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public void parse(InputStream is, DefaultHandler dh, String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public void parse(String uri, HandlerBase hb) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 30 */   public void parse(String uri, DefaultHandler dh) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 31 */   public void parse(File f, HandlerBase hb) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public void parse(File f, DefaultHandler dh) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public void parse(InputSource is, HandlerBase hb) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void parse(InputSource is, DefaultHandler dh) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract Parser getParser() throws SAXException;
/*    */   public abstract XMLReader getXMLReader() throws SAXException;
/*    */   public abstract boolean isNamespaceAware();
/*    */   public abstract boolean isValidating();
/*    */   public abstract void setProperty(String paramString, Object paramObject) throws SAXNotRecognizedException, SAXNotSupportedException;
/*    */   public abstract Object getProperty(String paramString) throws SAXNotRecognizedException, SAXNotSupportedException;
/* 41 */   public Schema getSchema() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\parsers\SAXParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */