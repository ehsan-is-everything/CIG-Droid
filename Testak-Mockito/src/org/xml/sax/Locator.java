package org.xml.sax;

public abstract interface Locator
{
  public abstract String getPublicId();
  
  public abstract String getSystemId();
  
  public abstract int getLineNumber();
  
  public abstract int getColumnNumber();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\xml\sax\Locator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */