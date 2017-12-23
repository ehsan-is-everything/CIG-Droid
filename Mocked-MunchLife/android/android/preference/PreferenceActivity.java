package android.preference;

import android.app.ListActivity;

public class PreferenceActivity extends ListActivity{
	public PreferenceScreen getPreferenceScreen() {
//        if (mPreferenceManager != null) {
//            return mPreferenceManager.getPreferenceScreen();
//        }
        return new PreferenceScreen();
    }
}
