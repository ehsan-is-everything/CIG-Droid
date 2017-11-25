/*    */ package javax.xml.parsers;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import javax.xml.validation.Schema;
/*    */ import org.w3c.dom.DOMImplementation;
/*    */ import org.w3c.dom.Document;
/*    */ import org.xml.sax.EntityResolver;
/*    */ import org.xml.sax.ErrorHandler;
/*    */ import org.xml.sax.InputSource;
/*    */ import org.xml.sax.SAXException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class DocumentBuilder
/*    */ {
/* 23 */   protected DocumentBuilder() { throw new RuntimeException("Stub!"); }
/* 24 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 25 */   public Document parse(InputStream is) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public Document parse(InputStream is, String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public Document parse(String uri) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public Document parse(File f) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract Document parse(InputSource paramInputSource) throws SAXException, IOException;
/*    */   public abstract boolean isNamespaceAware();
/*    */   public abstract boolean isValidating();
/*    */   public abstract void setEntityResolver(EntityResolver paramEntityResolver);
/*    */   public abstract void setErrorHandler(ErrorHandler paramErrorHandler);
/*    */   public abstract Document newDocument();
/*    */   public abstract DOMImplementation getDOMImplementation();
/* 36 */   public Schema getSchema() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\parsers\DocumentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */