package org.w3c.dom;

public abstract interface NameList
{
  public abstract String getName(int paramInt);
  
  public abstract String getNamespaceURI(int paramInt);
  
  public abstract int getLength();
  
  public abstract boolean contains(String paramString);
  
  public abstract boolean containsNS(String paramString1, String paramString2);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\w3c\dom\NameList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */