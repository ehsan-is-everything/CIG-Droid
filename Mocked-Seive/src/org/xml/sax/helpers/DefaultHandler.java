/*    */ package org.xml.sax.helpers;
/*    */ 
/*    */ import org.xml.sax.Locator;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXParseException;
/*    */ 
/*    */ 
/*    */ public class DefaultHandler
/*    */   implements org.xml.sax.EntityResolver, org.xml.sax.DTDHandler, org.xml.sax.ContentHandler, org.xml.sax.ErrorHandler
/*    */ {
/* 11 */   public DefaultHandler() { throw new RuntimeException("Stub!"); }
/* 12 */   public org.xml.sax.InputSource resolveEntity(String publicId, String systemId) throws java.io.IOException, SAXException { throw new RuntimeException("Stub!"); }
/* 13 */   public void notationDecl(String name, String publicId, String systemId) throws SAXException { throw new RuntimeException("Stub!"); }
/* 14 */   public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) throws SAXException { throw new RuntimeException("Stub!"); }
/* 15 */   public void setDocumentLocator(Locator locator) { throw new RuntimeException("Stub!"); }
/* 16 */   public void startDocument() throws SAXException { throw new RuntimeException("Stub!"); }
/* 17 */   public void endDocument() throws SAXException { throw new RuntimeException("Stub!"); }
/* 18 */   public void startPrefixMapping(String prefix, String uri) throws SAXException { throw new RuntimeException("Stub!"); }
/* 19 */   public void endPrefixMapping(String prefix) throws SAXException { throw new RuntimeException("Stub!"); }
/* 20 */   public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws SAXException { throw new RuntimeException("Stub!"); }
/* 21 */   public void endElement(String uri, String localName, String qName) throws SAXException { throw new RuntimeException("Stub!"); }
/* 22 */   public void characters(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 23 */   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 24 */   public void processingInstruction(String target, String data) throws SAXException { throw new RuntimeException("Stub!"); }
/* 25 */   public void skippedEntity(String name) throws SAXException { throw new RuntimeException("Stub!"); }
/* 26 */   public void warning(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); }
/* 27 */   public void error(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); }
/* 28 */   public void fatalError(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\xml\sax\helpers\DefaultHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */