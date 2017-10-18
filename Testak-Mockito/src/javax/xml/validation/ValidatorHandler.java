/*    */ package javax.xml.validation;
/*    */ 
/*    */ import org.w3c.dom.ls.LSResourceResolver;
/*    */ import org.xml.sax.ContentHandler;
/*    */ import org.xml.sax.ErrorHandler;
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
/*    */ public abstract class ValidatorHandler
/*    */   implements ContentHandler
/*    */ {
/* 23 */   protected ValidatorHandler() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setContentHandler(ContentHandler paramContentHandler);
/*    */   public abstract ContentHandler getContentHandler();
/*    */   public abstract void setErrorHandler(ErrorHandler paramErrorHandler);
/*    */   public abstract ErrorHandler getErrorHandler();
/*    */   public abstract void setResourceResolver(LSResourceResolver paramLSResourceResolver);
/*    */   public abstract LSResourceResolver getResourceResolver();
/*    */   public abstract TypeInfoProvider getTypeInfoProvider();
/* 31 */   public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 32 */   public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 33 */   public void setProperty(String name, Object object) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 34 */   public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\validation\ValidatorHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */