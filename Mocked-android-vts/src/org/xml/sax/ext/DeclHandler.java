package org.xml.sax.ext;

import org.xml.sax.SAXException;

public abstract interface DeclHandler
{
  public abstract void elementDecl(String paramString1, String paramString2)
    throws SAXException;
  
  public abstract void attributeDecl(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    throws SAXException;
  
  public abstract void internalEntityDecl(String paramString1, String paramString2)
    throws SAXException;
  
  public abstract void externalEntityDecl(String paramString1, String paramString2, String paramString3)
    throws SAXException;
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\xml\sax\ext\DeclHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */