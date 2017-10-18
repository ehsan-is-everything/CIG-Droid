package java.util.concurrent;

@FunctionalInterface
public abstract interface Callable<V>
{
  public abstract V call()
    throws Exception;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\Callable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */