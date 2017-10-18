/*    */ package javax.xml.parsers;
/*    */ 
/*    */ import javax.xml.validation.Schema;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXNotRecognizedException;
/*    */ import org.xml.sax.SAXNotSupportedException;
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
/*    */ public abstract class SAXParserFactory
/*    */ {
/* 23 */   protected SAXParserFactory() { throw new RuntimeException("Stub!"); }
/* 24 */   public static SAXParserFactory newInstance() { throw new RuntimeException("Stub!"); }
/* 25 */   public static SAXParserFactory newInstance(String factoryClassName, ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
/*    */   public abstract SAXParser newSAXParser() throws ParserConfigurationException, SAXException;
/* 27 */   public void setNamespaceAware(boolean awareness) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setValidating(boolean validating) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isNamespaceAware() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isValidating() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setFeature(String paramString, boolean paramBoolean) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException;
/*    */   public abstract boolean getFeature(String paramString) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException;
/* 33 */   public Schema getSchema() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setSchema(Schema schema) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setXIncludeAware(boolean state) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\parsers\SAXParserFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */