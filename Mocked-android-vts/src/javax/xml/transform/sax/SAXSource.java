/*    */ package javax.xml.transform.sax;
/*    */ 
/*    */ import javax.xml.transform.Source;
/*    */ import org.xml.sax.InputSource;
/*    */ import org.xml.sax.XMLReader;
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
/*    */ public class SAXSource
/*    */   implements Source
/*    */ {
/*    */   public static final String FEATURE = "http://javax.xml.transform.sax.SAXSource/feature";
/*    */   
/* 24 */   public SAXSource() { throw new RuntimeException("Stub!"); }
/* 25 */   public SAXSource(XMLReader reader, InputSource inputSource) { throw new RuntimeException("Stub!"); }
/* 26 */   public SAXSource(InputSource inputSource) { throw new RuntimeException("Stub!"); }
/* 27 */   public void setXMLReader(XMLReader reader) { throw new RuntimeException("Stub!"); }
/* 28 */   public XMLReader getXMLReader() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setInputSource(InputSource inputSource) { throw new RuntimeException("Stub!"); }
/* 30 */   public InputSource getInputSource() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setSystemId(String systemId) { throw new RuntimeException("Stub!"); }
/* 32 */   public String getSystemId() { throw new RuntimeException("Stub!"); }
/* 33 */   public static InputSource sourceToInputSource(Source source) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\transform\sax\SAXSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */