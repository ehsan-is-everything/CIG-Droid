package org.xml.sax;

import java.io.IOException;

public abstract interface EntityResolver
{
  public abstract InputSource resolveEntity(String paramString1, String paramString2)
    throws SAXException, IOException;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\xml\sax\EntityResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */