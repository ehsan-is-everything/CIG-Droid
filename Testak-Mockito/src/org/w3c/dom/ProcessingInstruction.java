package org.w3c.dom;

public abstract interface ProcessingInstruction
  extends Node
{
  public abstract String getTarget();
  
  public abstract String getData();
  
  public abstract void setData(String paramString)
    throws DOMException;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\w3c\dom\ProcessingInstruction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */