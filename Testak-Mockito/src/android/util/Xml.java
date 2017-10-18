/*    */ package android.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.Reader;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import org.xml.sax.ContentHandler;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlSerializer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Xml
/*    */ {
/*    */   public static String FEATURE_RELAXED;
/*    */   
/*    */   public static enum Encoding
/*    */   {
/* 22 */     ISO_8859_1, 
/* 23 */     US_ASCII, 
/* 24 */     UTF_16, 
/* 25 */     UTF_8;
/*    */     private Encoding() {} }
/* 27 */   Xml() { throw new RuntimeException("Stub!"); }
/* 28 */   public static void parse(String xml, ContentHandler contentHandler) throws SAXException { throw new RuntimeException("Stub!"); }
/* 29 */   public static void parse(Reader in, ContentHandler contentHandler) throws IOException, SAXException { throw new RuntimeException("Stub!"); }
/* 30 */   public static void parse(InputStream in, Encoding encoding, ContentHandler contentHandler) throws IOException, SAXException { throw new RuntimeException("Stub!"); }
/* 31 */   public static XmlPullParser newPullParser() { throw new RuntimeException("Stub!"); }
/* 32 */   public static XmlSerializer newSerializer() { throw new RuntimeException("Stub!"); }
/* 33 */   public static Encoding findEncodingByName(String encodingName) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 34 */   public static AttributeSet asAttributeSet(XmlPullParser parser) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\util\Xml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */