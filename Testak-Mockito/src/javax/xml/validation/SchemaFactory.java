/*    */ package javax.xml.validation;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.net.URL;
/*    */ import javax.xml.transform.Source;
/*    */ import org.w3c.dom.ls.LSResourceResolver;
/*    */ import org.xml.sax.ErrorHandler;
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
/*    */ public abstract class SchemaFactory
/*    */ {
/* 23 */   protected SchemaFactory() { throw new RuntimeException("Stub!"); }
/* 24 */   public static SchemaFactory newInstance(String schemaLanguage) { throw new RuntimeException("Stub!"); }
/* 25 */   public static SchemaFactory newInstance(String schemaLanguage, String factoryClassName, ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean isSchemaLanguageSupported(String paramString);
/* 27 */   public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 28 */   public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 29 */   public void setProperty(String name, Object object) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 30 */   public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setErrorHandler(ErrorHandler paramErrorHandler);
/*    */   public abstract ErrorHandler getErrorHandler();
/*    */   public abstract void setResourceResolver(LSResourceResolver paramLSResourceResolver);
/*    */   public abstract LSResourceResolver getResourceResolver();
/* 35 */   public Schema newSchema(Source schema) throws SAXException { throw new RuntimeException("Stub!"); }
/* 36 */   public Schema newSchema(File schema) throws SAXException { throw new RuntimeException("Stub!"); }
/* 37 */   public Schema newSchema(URL schema) throws SAXException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Schema newSchema(Source[] paramArrayOfSource)
/*    */     throws SAXException;
/*    */   
/*    */   public abstract Schema newSchema()
/*    */     throws SAXException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\validation\SchemaFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */