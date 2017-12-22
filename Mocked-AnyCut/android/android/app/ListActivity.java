package android.app;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListActivity extends Activity {
	public void setListAdapter(ListAdapter adapter) {
//        synchronized (this) {
//            ensureList();
//            mAdapter = adapter;
//            mList.setAdapter(adapter);
//        }
    }
	protected void onListItemClick(ListView l, View v, int position, long id) {
    }
}
