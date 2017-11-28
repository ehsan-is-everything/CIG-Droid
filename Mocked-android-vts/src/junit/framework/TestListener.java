package junit.framework;

public abstract interface TestListener
{
  public abstract void addError(Test paramTest, Throwable paramThrowable);
  
  public abstract void addFailure(Test paramTest, AssertionFailedError paramAssertionFailedError);
  
  public abstract void endTest(Test paramTest);
  
  public abstract void startTest(Test paramTest);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\junit\framework\TestListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */