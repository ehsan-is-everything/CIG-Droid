package javax.xml.xpath;

import java.util.List;

public abstract interface XPathFunction
{
  public abstract Object evaluate(List paramList)
    throws XPathFunctionException;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\xpath\XPathFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */