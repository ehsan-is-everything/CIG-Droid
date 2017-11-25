package android.text;

public abstract interface TextWatcher
  extends NoCopySpan
{
  public abstract void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void afterTextChanged(Editable paramEditable);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\TextWatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */