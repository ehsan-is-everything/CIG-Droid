package java.lang.reflect;

public abstract interface ParameterizedType
  extends Type
{
  public abstract Type[] getActualTypeArguments();
  
  public abstract Type getRawType();
  
  public abstract Type getOwnerType();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\reflect\ParameterizedType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */