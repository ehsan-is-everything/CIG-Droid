/*    */ package org.xml.sax.helpers;
/*    */ 
/*    */ import org.xml.sax.DTDHandler;
/*    */ import org.xml.sax.Locator;
/*    */ import org.xml.sax.SAXException;
/*    */ 
/*    */ 
/*    */ public class XMLReaderAdapter
/*    */   implements org.xml.sax.Parser, org.xml.sax.ContentHandler
/*    */ {
/* 11 */   public XMLReaderAdapter() throws SAXException { throw new RuntimeException("Stub!"); }
/* 12 */   public XMLReaderAdapter(org.xml.sax.XMLReader xmlReader) { throw new RuntimeException("Stub!"); }
/* 13 */   public void setLocale(java.util.Locale locale) throws SAXException { throw new RuntimeException("Stub!"); }
/* 14 */   public void setEntityResolver(org.xml.sax.EntityResolver resolver) { throw new RuntimeException("Stub!"); }
/* 15 */   public void setDTDHandler(DTDHandler handler) { throw new RuntimeException("Stub!"); }
/* 16 */   public void setDocumentHandler(org.xml.sax.DocumentHandler handler) { throw new RuntimeException("Stub!"); }
/* 17 */   public void setErrorHandler(org.xml.sax.ErrorHandler handler) { throw new RuntimeException("Stub!"); }
/* 18 */   public void parse(String systemId) throws java.io.IOException, SAXException { throw new RuntimeException("Stub!"); }
/* 19 */   public void parse(org.xml.sax.InputSource input) throws java.io.IOException, SAXException { throw new RuntimeException("Stub!"); }
/* 20 */   public void setDocumentLocator(Locator locator) { throw new RuntimeException("Stub!"); }
/* 21 */   public void startDocument() throws SAXException { throw new RuntimeException("Stub!"); }
/* 22 */   public void endDocument() throws SAXException { throw new RuntimeException("Stub!"); }
/* 23 */   public void startPrefixMapping(String prefix, String uri) { throw new RuntimeException("Stub!"); }
/* 24 */   public void endPrefixMapping(String prefix) { throw new RuntimeException("Stub!"); }
/* 25 */   public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes atts) throws SAXException { throw new RuntimeException("Stub!"); }
/* 26 */   public void endElement(String uri, String localName, String qName) throws SAXException { throw new RuntimeException("Stub!"); }
/* 27 */   public void characters(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 28 */   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 29 */   public void processingInstruction(String target, String data) throws SAXException { throw new RuntimeException("Stub!"); }
/* 30 */   public void skippedEntity(String name) throws SAXException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\xml\sax\helpers\XMLReaderAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */