package android.text;

public abstract interface SpanWatcher
  extends NoCopySpan
{
  public abstract void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2);
  
  public abstract void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2);
  
  public abstract void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\SpanWatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */