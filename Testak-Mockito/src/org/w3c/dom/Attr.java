package org.w3c.dom;

public abstract interface Attr
  extends Node
{
  public abstract String getName();
  
  public abstract boolean getSpecified();
  
  public abstract String getValue();
  
  public abstract void setValue(String paramString)
    throws DOMException;
  
  public abstract Element getOwnerElement();
  
  public abstract TypeInfo getSchemaTypeInfo();
  
  public abstract boolean isId();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\w3c\dom\Attr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */