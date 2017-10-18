/*    */ package org.xmlpull.v1.sax2;
/*    */ 
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ 
/*    */ public class Driver implements org.xml.sax.Locator, org.xml.sax.XMLReader, org.xml.sax.Attributes { protected static final String APACHE_DYNAMIC_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/dynamic";
/*    */   protected static final String APACHE_SCHEMA_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/schema";
/*    */   
/*  8 */   public Driver() throws org.xmlpull.v1.XmlPullParserException { throw new RuntimeException("Stub!"); }
/*  9 */   public Driver(XmlPullParser pp) throws org.xmlpull.v1.XmlPullParserException { throw new RuntimeException("Stub!"); }
/* 10 */   public int getLength() { throw new RuntimeException("Stub!"); }
/* 11 */   public String getURI(int index) { throw new RuntimeException("Stub!"); }
/* 12 */   public String getLocalName(int index) { throw new RuntimeException("Stub!"); }
/* 13 */   public String getQName(int index) { throw new RuntimeException("Stub!"); }
/* 14 */   public String getType(int index) { throw new RuntimeException("Stub!"); }
/* 15 */   public String getValue(int index) { throw new RuntimeException("Stub!"); }
/* 16 */   public int getIndex(String uri, String localName) { throw new RuntimeException("Stub!"); }
/* 17 */   public int getIndex(String qName) { throw new RuntimeException("Stub!"); }
/* 18 */   public String getType(String uri, String localName) { throw new RuntimeException("Stub!"); }
/* 19 */   public String getType(String qName) { throw new RuntimeException("Stub!"); }
/* 20 */   public String getValue(String uri, String localName) { throw new RuntimeException("Stub!"); }
/* 21 */   public String getValue(String qName) { throw new RuntimeException("Stub!"); }
/* 22 */   public String getPublicId() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getSystemId() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getLineNumber() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getColumnNumber() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean getFeature(String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 27 */   public void setFeature(String name, boolean value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 28 */   public Object getProperty(String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 29 */   public void setProperty(String name, Object value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 30 */   public void setEntityResolver(org.xml.sax.EntityResolver resolver) { throw new RuntimeException("Stub!"); }
/* 31 */   public org.xml.sax.EntityResolver getEntityResolver() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setDTDHandler(org.xml.sax.DTDHandler handler) { throw new RuntimeException("Stub!"); }
/* 33 */   public org.xml.sax.DTDHandler getDTDHandler() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setContentHandler(org.xml.sax.ContentHandler handler) { throw new RuntimeException("Stub!"); }
/* 35 */   public org.xml.sax.ContentHandler getContentHandler() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setErrorHandler(org.xml.sax.ErrorHandler handler) { throw new RuntimeException("Stub!"); }
/* 37 */   public org.xml.sax.ErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); }
/* 38 */   public void parse(org.xml.sax.InputSource source) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public void parse(String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public void parseSubTree(XmlPullParser pp) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 41 */   protected void startElement(String namespace, String localName, String qName) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   protected static final String DECLARATION_HANDLER_PROPERTY = "http://xml.org/sax/properties/declaration-handler";
/*    */   protected static final String LEXICAL_HANDLER_PROPERTY = "http://xml.org/sax/properties/lexical-handler";
/*    */   protected static final String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
/*    */   protected static final String NAMESPACE_PREFIXES_FEATURE = "http://xml.org/sax/features/namespace-prefixes";
/*    */   protected static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
/*    */   protected org.xml.sax.ContentHandler contentHandler;
/*    */   protected org.xml.sax.ErrorHandler errorHandler;
/*    */   protected XmlPullParser pp;
/*    */   protected String systemId;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\xmlpull\v1\sax2\Driver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */