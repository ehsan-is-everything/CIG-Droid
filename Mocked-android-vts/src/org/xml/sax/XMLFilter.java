package org.xml.sax;

public abstract interface XMLFilter
  extends XMLReader
{
  public abstract void setParent(XMLReader paramXMLReader);
  
  public abstract XMLReader getParent();
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\xml\sax\XMLFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */