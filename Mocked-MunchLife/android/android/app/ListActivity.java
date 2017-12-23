package android.app;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListActivity extends Activity {
	private ListAdapter mAdapter;
	private ListView mList=new ListView();
	public void setListAdapter(ListAdapter adapter) {
//        synchronized (this) {
//            ensureList();
            mAdapter = adapter;
            mList.setAdapter(adapter);
//        }
    }
	protected void onListItemClick(ListView l, View v, int position, long id) {
    }
	public ListView getListView() {
//        ensureList();
        return mList;
//		return new ListView();
    }
	public ListAdapter getListAdapter() {
        return mAdapter;
    }
}
