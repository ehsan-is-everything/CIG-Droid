package javax.xml.transform;

public abstract interface SourceLocator
{
  public abstract String getPublicId();
  
  public abstract String getSystemId();
  
  public abstract int getLineNumber();
  
  public abstract int getColumnNumber();
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\transform\SourceLocator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */