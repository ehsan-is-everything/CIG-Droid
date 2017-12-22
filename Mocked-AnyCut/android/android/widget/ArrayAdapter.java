package android.widget;

import java.util.ArrayList;

import com.example.anycut.CreateShortcutActivity;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

public class ArrayAdapter<T> extends BaseAdapter {

	public ArrayAdapter(Activity activity, int i, ArrayList<T> activities) {
		// TODO Auto-generated constructor stub
	}

	public ArrayAdapter() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayAdapter<CharSequence> createFromResource(Activity context, int textArrayResId,
			int textViewResId) {
		// CharSequence[] strings = context.getResources().getTextArray(textArrayResId);
		// return new ArrayAdapter<CharSequence>(context, textViewResId, strings);
		return new ArrayAdapter<>();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return null;
	}

}
