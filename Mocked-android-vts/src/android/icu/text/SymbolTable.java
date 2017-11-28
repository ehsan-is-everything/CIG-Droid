package android.icu.text;

import java.text.ParsePosition;

public abstract interface SymbolTable
{
  public static final char SYMBOL_REF = '$';
  
  public abstract char[] lookup(String paramString);
  
  public abstract UnicodeMatcher lookupMatcher(int paramInt);
  
  public abstract String parseReference(String paramString, ParsePosition paramParsePosition, int paramInt);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\SymbolTable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */