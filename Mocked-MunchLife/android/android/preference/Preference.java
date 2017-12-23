package android.preference;

public class Preference {
	private OnPreferenceChangeListener mOnChangeListener;

	public interface OnPreferenceChangeListener {

		boolean onPreferenceChange(Preference preference, Object newValue);
	}

	public void setOnPreferenceChangeListener(OnPreferenceChangeListener onPreferenceChangeListener) {
		mOnChangeListener = onPreferenceChangeListener;
	}
}
