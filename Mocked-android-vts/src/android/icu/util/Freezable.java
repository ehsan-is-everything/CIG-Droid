package android.icu.util;

public abstract interface Freezable<T>
  extends Cloneable
{
  public abstract boolean isFrozen();
  
  public abstract T freeze();
  
  public abstract T cloneAsThawed();
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\util\Freezable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */