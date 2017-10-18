package org.w3c.dom;

public abstract interface Text
  extends CharacterData
{
  public abstract Text splitText(int paramInt)
    throws DOMException;
  
  public abstract boolean isElementContentWhitespace();
  
  public abstract String getWholeText();
  
  public abstract Text replaceWholeText(String paramString)
    throws DOMException;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\w3c\dom\Text.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */