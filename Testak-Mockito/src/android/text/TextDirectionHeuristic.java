package android.text;

public abstract interface TextDirectionHeuristic
{
  public abstract boolean isRtl(char[] paramArrayOfChar, int paramInt1, int paramInt2);
  
  public abstract boolean isRtl(CharSequence paramCharSequence, int paramInt1, int paramInt2);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\TextDirectionHeuristic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */