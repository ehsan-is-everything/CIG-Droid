package javax.xml.xpath;

import javax.xml.namespace.QName;

public abstract interface XPathFunctionResolver
{
  public abstract XPathFunction resolveFunction(QName paramQName, int paramInt);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\xpath\XPathFunctionResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */