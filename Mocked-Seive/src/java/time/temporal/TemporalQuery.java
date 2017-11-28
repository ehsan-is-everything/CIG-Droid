package java.time.temporal;

@FunctionalInterface
public abstract interface TemporalQuery<R>
{
  public abstract R queryFrom(TemporalAccessor paramTemporalAccessor);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\temporal\TemporalQuery.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */