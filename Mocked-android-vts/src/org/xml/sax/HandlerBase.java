/*    */ package org.xml.sax;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class HandlerBase
/*    */   implements EntityResolver, DTDHandler, DocumentHandler, ErrorHandler
/*    */ {
/* 11 */   public HandlerBase() { throw new RuntimeException("Stub!"); }
/* 12 */   public InputSource resolveEntity(String publicId, String systemId) throws SAXException { throw new RuntimeException("Stub!"); }
/* 13 */   public void notationDecl(String name, String publicId, String systemId) { throw new RuntimeException("Stub!"); }
/* 14 */   public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) { throw new RuntimeException("Stub!"); }
/* 15 */   public void setDocumentLocator(Locator locator) { throw new RuntimeException("Stub!"); }
/* 16 */   public void startDocument() throws SAXException { throw new RuntimeException("Stub!"); }
/* 17 */   public void endDocument() throws SAXException { throw new RuntimeException("Stub!"); }
/* 18 */   public void startElement(String name, AttributeList attributes) throws SAXException { throw new RuntimeException("Stub!"); }
/* 19 */   public void endElement(String name) throws SAXException { throw new RuntimeException("Stub!"); }
/* 20 */   public void characters(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 21 */   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 22 */   public void processingInstruction(String target, String data) throws SAXException { throw new RuntimeException("Stub!"); }
/* 23 */   public void warning(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); }
/* 24 */   public void error(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); }
/* 25 */   public void fatalError(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\xml\sax\HandlerBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */