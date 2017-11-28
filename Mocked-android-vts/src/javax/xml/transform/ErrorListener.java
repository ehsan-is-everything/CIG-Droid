package javax.xml.transform;

public abstract interface ErrorListener
{
  public abstract void warning(TransformerException paramTransformerException)
    throws TransformerException;
  
  public abstract void error(TransformerException paramTransformerException)
    throws TransformerException;
  
  public abstract void fatalError(TransformerException paramTransformerException)
    throws TransformerException;
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\transform\ErrorListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */