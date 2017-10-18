package java.lang.reflect;

public abstract interface TypeVariable<D extends GenericDeclaration>
  extends Type
{
  public abstract Type[] getBounds();
  
  public abstract D getGenericDeclaration();
  
  public abstract String getName();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\reflect\TypeVariable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */