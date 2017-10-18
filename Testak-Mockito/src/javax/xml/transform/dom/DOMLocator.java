package javax.xml.transform.dom;

import javax.xml.transform.SourceLocator;
import org.w3c.dom.Node;

public abstract interface DOMLocator
  extends SourceLocator
{
  public abstract Node getOriginatingNode();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\transform\dom\DOMLocator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */