/*    */ package org.xml.sax.helpers;
/*    */ 
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXParseException;
/*    */ import org.xml.sax.XMLReader;
/*    */ 
/*    */ 
/*    */ public class XMLFilterImpl
/*    */   implements org.xml.sax.XMLFilter, org.xml.sax.EntityResolver, org.xml.sax.DTDHandler, org.xml.sax.ContentHandler, org.xml.sax.ErrorHandler
/*    */ {
/* 11 */   public XMLFilterImpl() { throw new RuntimeException("Stub!"); }
/* 12 */   public XMLFilterImpl(XMLReader parent) { throw new RuntimeException("Stub!"); }
/* 13 */   public void setParent(XMLReader parent) { throw new RuntimeException("Stub!"); }
/* 14 */   public XMLReader getParent() { throw new RuntimeException("Stub!"); }
/* 15 */   public void setFeature(String name, boolean value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 16 */   public boolean getFeature(String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 17 */   public void setProperty(String name, Object value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 18 */   public Object getProperty(String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 19 */   public void setEntityResolver(org.xml.sax.EntityResolver resolver) { throw new RuntimeException("Stub!"); }
/* 20 */   public org.xml.sax.EntityResolver getEntityResolver() { throw new RuntimeException("Stub!"); }
/* 21 */   public void setDTDHandler(org.xml.sax.DTDHandler handler) { throw new RuntimeException("Stub!"); }
/* 22 */   public org.xml.sax.DTDHandler getDTDHandler() { throw new RuntimeException("Stub!"); }
/* 23 */   public void setContentHandler(org.xml.sax.ContentHandler handler) { throw new RuntimeException("Stub!"); }
/* 24 */   public org.xml.sax.ContentHandler getContentHandler() { throw new RuntimeException("Stub!"); }
/* 25 */   public void setErrorHandler(org.xml.sax.ErrorHandler handler) { throw new RuntimeException("Stub!"); }
/* 26 */   public org.xml.sax.ErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); }
/* 27 */   public void parse(org.xml.sax.InputSource input) throws SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public void parse(String systemId) throws SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public org.xml.sax.InputSource resolveEntity(String publicId, String systemId) throws SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 30 */   public void notationDecl(String name, String publicId, String systemId) throws SAXException { throw new RuntimeException("Stub!"); }
/* 31 */   public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) throws SAXException { throw new RuntimeException("Stub!"); }
/* 32 */   public void setDocumentLocator(org.xml.sax.Locator locator) { throw new RuntimeException("Stub!"); }
/* 33 */   public void startDocument() throws SAXException { throw new RuntimeException("Stub!"); }
/* 34 */   public void endDocument() throws SAXException { throw new RuntimeException("Stub!"); }
/* 35 */   public void startPrefixMapping(String prefix, String uri) throws SAXException { throw new RuntimeException("Stub!"); }
/* 36 */   public void endPrefixMapping(String prefix) throws SAXException { throw new RuntimeException("Stub!"); }
/* 37 */   public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes atts) throws SAXException { throw new RuntimeException("Stub!"); }
/* 38 */   public void endElement(String uri, String localName, String qName) throws SAXException { throw new RuntimeException("Stub!"); }
/* 39 */   public void characters(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 40 */   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 41 */   public void processingInstruction(String target, String data) throws SAXException { throw new RuntimeException("Stub!"); }
/* 42 */   public void skippedEntity(String name) throws SAXException { throw new RuntimeException("Stub!"); }
/* 43 */   public void warning(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); }
/* 44 */   public void error(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); }
/* 45 */   public void fatalError(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\xml\sax\helpers\XMLFilterImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */