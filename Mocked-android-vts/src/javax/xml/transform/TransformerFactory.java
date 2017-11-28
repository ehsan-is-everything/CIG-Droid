/*    */ package javax.xml.transform;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class TransformerFactory
/*    */ {
/* 23 */   protected TransformerFactory() { throw new RuntimeException("Stub!"); }
/* 24 */   public static TransformerFactory newInstance() throws TransformerFactoryConfigurationError { throw new RuntimeException("Stub!"); }
/* 25 */   public static TransformerFactory newInstance(String factoryClassName, ClassLoader classLoader) throws TransformerFactoryConfigurationError { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Transformer newTransformer(Source paramSource)
/*    */     throws TransformerConfigurationException;
/*    */   
/*    */   public abstract Transformer newTransformer()
/*    */     throws TransformerConfigurationException;
/*    */   
/*    */   public abstract Templates newTemplates(Source paramSource)
/*    */     throws TransformerConfigurationException;
/*    */   
/*    */   public abstract Source getAssociatedStylesheet(Source paramSource, String paramString1, String paramString2, String paramString3)
/*    */     throws TransformerConfigurationException;
/*    */   
/*    */   public abstract void setURIResolver(URIResolver paramURIResolver);
/*    */   
/*    */   public abstract URIResolver getURIResolver();
/*    */   
/*    */   public abstract void setFeature(String paramString, boolean paramBoolean)
/*    */     throws TransformerConfigurationException;
/*    */   
/*    */   public abstract boolean getFeature(String paramString);
/*    */   
/*    */   public abstract void setAttribute(String paramString, Object paramObject);
/*    */   
/*    */   public abstract Object getAttribute(String paramString);
/*    */   
/*    */   public abstract void setErrorListener(ErrorListener paramErrorListener);
/*    */   
/*    */   public abstract ErrorListener getErrorListener();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\transform\TransformerFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */