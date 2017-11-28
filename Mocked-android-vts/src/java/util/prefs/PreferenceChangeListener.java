package java.util.prefs;

import java.util.EventListener;

@FunctionalInterface
public abstract interface PreferenceChangeListener
  extends EventListener
{
  public abstract void preferenceChange(PreferenceChangeEvent paramPreferenceChangeEvent);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\prefs\PreferenceChangeListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */