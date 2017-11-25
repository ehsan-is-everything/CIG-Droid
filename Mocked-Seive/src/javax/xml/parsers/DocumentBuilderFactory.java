/*    */ package javax.xml.parsers;
/*    */ 
/*    */ import javax.xml.validation.Schema;
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
/*    */ public abstract class DocumentBuilderFactory
/*    */ {
/* 23 */   protected DocumentBuilderFactory() { throw new RuntimeException("Stub!"); }
/* 24 */   public static DocumentBuilderFactory newInstance() { throw new RuntimeException("Stub!"); }
/* 25 */   public static DocumentBuilderFactory newInstance(String factoryClassName, ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
/*    */   public abstract DocumentBuilder newDocumentBuilder() throws ParserConfigurationException;
/* 27 */   public void setNamespaceAware(boolean awareness) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setValidating(boolean validating) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setIgnoringElementContentWhitespace(boolean whitespace) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setExpandEntityReferences(boolean expandEntityRef) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setIgnoringComments(boolean ignoreComments) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setCoalescing(boolean coalescing) { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isNamespaceAware() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean isValidating() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean isIgnoringElementContentWhitespace() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isExpandEntityReferences() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isIgnoringComments() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isCoalescing() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setAttribute(String paramString, Object paramObject) throws IllegalArgumentException;
/*    */   public abstract Object getAttribute(String paramString) throws IllegalArgumentException;
/*    */   public abstract void setFeature(String paramString, boolean paramBoolean) throws ParserConfigurationException;
/*    */   public abstract boolean getFeature(String paramString) throws ParserConfigurationException;
/* 43 */   public Schema getSchema() { throw new RuntimeException("Stub!"); }
/* 44 */   public void setSchema(Schema schema) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setXIncludeAware(boolean state) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\parsers\DocumentBuilderFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */