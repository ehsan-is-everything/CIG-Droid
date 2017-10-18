package javax.xml.transform;

public abstract interface Result
{
  public static final String PI_DISABLE_OUTPUT_ESCAPING = "javax.xml.transform.disable-output-escaping";
  public static final String PI_ENABLE_OUTPUT_ESCAPING = "javax.xml.transform.enable-output-escaping";
  
  public abstract void setSystemId(String paramString);
  
  public abstract String getSystemId();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\transform\Result.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */