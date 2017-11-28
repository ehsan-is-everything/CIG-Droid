package android.test;

@Deprecated
public abstract interface PerformanceTestCase
{
  public abstract int startPerformance(Intermediates paramIntermediates);
  
  public abstract boolean isPerformanceOnly();
  
  public static abstract interface Intermediates
  {
    public abstract void setInternalIterations(int paramInt);
    
    public abstract void startTiming(boolean paramBoolean);
    
    public abstract void addIntermediate(String paramString);
    
    public abstract void addIntermediate(String paramString, long paramLong);
    
    public abstract void finishTiming(boolean paramBoolean);
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\PerformanceTestCase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */