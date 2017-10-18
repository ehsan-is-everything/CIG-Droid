/*    */ package org.xml.sax.helpers;
/*    */ 
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXNotRecognizedException;
/*    */ import org.xml.sax.SAXNotSupportedException;
/*    */ 
/*    */ 
/*    */ public class ParserAdapter
/*    */   implements org.xml.sax.XMLReader, org.xml.sax.DocumentHandler
/*    */ {
/* 11 */   public ParserAdapter() throws SAXException { throw new RuntimeException("Stub!"); }
/* 12 */   public ParserAdapter(org.xml.sax.Parser parser) { throw new RuntimeException("Stub!"); }
/* 13 */   public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 14 */   public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 15 */   public void setProperty(String name, Object value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 16 */   public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); }
/* 17 */   public void setEntityResolver(org.xml.sax.EntityResolver resolver) { throw new RuntimeException("Stub!"); }
/* 18 */   public org.xml.sax.EntityResolver getEntityResolver() { throw new RuntimeException("Stub!"); }
/* 19 */   public void setDTDHandler(org.xml.sax.DTDHandler handler) { throw new RuntimeException("Stub!"); }
/* 20 */   public org.xml.sax.DTDHandler getDTDHandler() { throw new RuntimeException("Stub!"); }
/* 21 */   public void setContentHandler(org.xml.sax.ContentHandler handler) { throw new RuntimeException("Stub!"); }
/* 22 */   public org.xml.sax.ContentHandler getContentHandler() { throw new RuntimeException("Stub!"); }
/* 23 */   public void setErrorHandler(org.xml.sax.ErrorHandler handler) { throw new RuntimeException("Stub!"); }
/* 24 */   public org.xml.sax.ErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); }
/* 25 */   public void parse(String systemId) throws java.io.IOException, SAXException { throw new RuntimeException("Stub!"); }
/* 26 */   public void parse(org.xml.sax.InputSource input) throws java.io.IOException, SAXException { throw new RuntimeException("Stub!"); }
/* 27 */   public void setDocumentLocator(org.xml.sax.Locator locator) { throw new RuntimeException("Stub!"); }
/* 28 */   public void startDocument() throws SAXException { throw new RuntimeException("Stub!"); }
/* 29 */   public void endDocument() throws SAXException { throw new RuntimeException("Stub!"); }
/* 30 */   public void startElement(String qName, org.xml.sax.AttributeList qAtts) throws SAXException { throw new RuntimeException("Stub!"); }
/* 31 */   public void endElement(String qName) throws SAXException { throw new RuntimeException("Stub!"); }
/* 32 */   public void characters(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 33 */   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 34 */   public void processingInstruction(String target, String data) throws SAXException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\xml\sax\helpers\ParserAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */