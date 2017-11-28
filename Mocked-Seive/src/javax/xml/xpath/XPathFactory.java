/*    */ package javax.xml.xpath;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class XPathFactory
/*    */ {
/*    */   public static final String DEFAULT_OBJECT_MODEL_URI = "http://java.sun.com/jaxp/xpath/dom";
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final String DEFAULT_PROPERTY_NAME = "javax.xml.xpath.XPathFactory";
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 22 */   protected XPathFactory() { throw new RuntimeException("Stub!"); }
/* 23 */   public static final XPathFactory newInstance() { throw new RuntimeException("Stub!"); }
/* 24 */   public static final XPathFactory newInstance(String uri) throws XPathFactoryConfigurationException { throw new RuntimeException("Stub!"); }
/* 25 */   public static XPathFactory newInstance(String uri, String factoryClassName, ClassLoader classLoader) throws XPathFactoryConfigurationException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean isObjectModelSupported(String paramString);
/*    */   
/*    */   public abstract void setFeature(String paramString, boolean paramBoolean)
/*    */     throws XPathFactoryConfigurationException;
/*    */   
/*    */   public abstract boolean getFeature(String paramString)
/*    */     throws XPathFactoryConfigurationException;
/*    */   
/*    */   public abstract void setXPathVariableResolver(XPathVariableResolver paramXPathVariableResolver);
/*    */   
/*    */   public abstract void setXPathFunctionResolver(XPathFunctionResolver paramXPathFunctionResolver);
/*    */   
/*    */   public abstract XPath newXPath();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\xpath\XPathFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */