/*    */ package org.xml.sax.ext;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.xml.sax.InputSource;
/*    */ import org.xml.sax.SAXException;
/*    */ 
/*    */ public class DefaultHandler2
/*    */   extends org.xml.sax.helpers.DefaultHandler
/*    */   implements LexicalHandler, DeclHandler, EntityResolver2
/*    */ {
/* 11 */   public DefaultHandler2() { throw new RuntimeException("Stub!"); }
/* 12 */   public void startCDATA() throws SAXException { throw new RuntimeException("Stub!"); }
/* 13 */   public void endCDATA() throws SAXException { throw new RuntimeException("Stub!"); }
/* 14 */   public void startDTD(String name, String publicId, String systemId) throws SAXException { throw new RuntimeException("Stub!"); }
/* 15 */   public void endDTD() throws SAXException { throw new RuntimeException("Stub!"); }
/* 16 */   public void startEntity(String name) throws SAXException { throw new RuntimeException("Stub!"); }
/* 17 */   public void endEntity(String name) throws SAXException { throw new RuntimeException("Stub!"); }
/* 18 */   public void comment(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); }
/* 19 */   public void attributeDecl(String eName, String aName, String type, String mode, String value) throws SAXException { throw new RuntimeException("Stub!"); }
/* 20 */   public void elementDecl(String name, String model) throws SAXException { throw new RuntimeException("Stub!"); }
/* 21 */   public void externalEntityDecl(String name, String publicId, String systemId) throws SAXException { throw new RuntimeException("Stub!"); }
/* 22 */   public void internalEntityDecl(String name, String value) throws SAXException { throw new RuntimeException("Stub!"); }
/* 23 */   public InputSource getExternalSubset(String name, String baseURI) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 24 */   public InputSource resolveEntity(String name, String publicId, String baseURI, String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\xml\sax\ext\DefaultHandler2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */