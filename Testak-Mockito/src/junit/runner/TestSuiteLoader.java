package junit.runner;

public abstract interface TestSuiteLoader
{
  public abstract Class load(String paramString)
    throws ClassNotFoundException;
  
  public abstract Class reload(Class paramClass)
    throws ClassNotFoundException;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\junit\runner\TestSuiteLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */