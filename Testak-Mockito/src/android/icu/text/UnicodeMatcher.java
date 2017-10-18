package android.icu.text;

public abstract interface UnicodeMatcher
{
  public static final char ETHER = '￿';
  public static final int U_MATCH = 2;
  public static final int U_MISMATCH = 0;
  public static final int U_PARTIAL_MATCH = 1;
  
  public abstract int matches(Replaceable paramReplaceable, int[] paramArrayOfInt, int paramInt, boolean paramBoolean);
  
  public abstract String toPattern(boolean paramBoolean);
  
  public abstract boolean matchesIndexValue(int paramInt);
  
  public abstract void addMatchSetTo(UnicodeSet paramUnicodeSet);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\UnicodeMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */