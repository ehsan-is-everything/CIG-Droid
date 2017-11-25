package android.widget;

public abstract interface SectionIndexer
{
  public abstract Object[] getSections();
  
  public abstract int getPositionForSection(int paramInt);
  
  public abstract int getSectionForPosition(int paramInt);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\SectionIndexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */