package javax.xml.transform;

import java.util.Properties;

public abstract interface Templates
{
  public abstract Transformer newTransformer()
    throws TransformerConfigurationException;
  
  public abstract Properties getOutputProperties();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\transform\Templates.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */