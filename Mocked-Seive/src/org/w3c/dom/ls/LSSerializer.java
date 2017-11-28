package org.w3c.dom.ls;

import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

public abstract interface LSSerializer
{
  public abstract DOMConfiguration getDomConfig();
  
  public abstract String getNewLine();
  
  public abstract void setNewLine(String paramString);
  
  public abstract boolean write(Node paramNode, LSOutput paramLSOutput)
    throws LSException;
  
  public abstract boolean writeToURI(Node paramNode, String paramString)
    throws LSException;
  
  public abstract String writeToString(Node paramNode)
    throws DOMException, LSException;
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\w3c\dom\ls\LSSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */