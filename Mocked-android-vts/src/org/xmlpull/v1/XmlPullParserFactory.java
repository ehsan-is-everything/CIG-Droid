/*    */ package org.xmlpull.v1;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class XmlPullParserFactory { public static final String PROPERTY_NAME = "org.xmlpull.v1.XmlPullParserFactory";
/*    */   
/*  7 */   protected XmlPullParserFactory() { throw new RuntimeException("Stub!"); }
/*  8 */   public void setFeature(String name, boolean state) throws XmlPullParserException { throw new RuntimeException("Stub!"); }
/*  9 */   public boolean getFeature(String name) { throw new RuntimeException("Stub!"); }
/* 10 */   public void setNamespaceAware(boolean awareness) { throw new RuntimeException("Stub!"); }
/* 11 */   public boolean isNamespaceAware() { throw new RuntimeException("Stub!"); }
/* 12 */   public void setValidating(boolean validating) { throw new RuntimeException("Stub!"); }
/* 13 */   public boolean isValidating() { throw new RuntimeException("Stub!"); }
/* 14 */   public XmlPullParser newPullParser() throws XmlPullParserException { throw new RuntimeException("Stub!"); }
/* 15 */   public XmlSerializer newSerializer() throws XmlPullParserException { throw new RuntimeException("Stub!"); }
/* 16 */   public static XmlPullParserFactory newInstance() throws XmlPullParserException { throw new RuntimeException("Stub!"); }
/* 17 */   public static XmlPullParserFactory newInstance(String unused, Class unused2) throws XmlPullParserException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   protected String classNamesLocation;
/*    */   protected java.util.HashMap<String, Boolean> features;
/*    */   protected ArrayList parserClasses;
/*    */   protected ArrayList serializerClasses;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\xmlpull\v1\XmlPullParserFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */