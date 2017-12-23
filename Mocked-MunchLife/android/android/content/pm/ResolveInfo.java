package android.content.pm;

import java.util.Comparator;

import android.graphics.drawable.Drawable;

public class ResolveInfo {
	public ActivityInfo activityInfo;
	public static class DisplayNameComparator implements Comparator <ResolveInfo>{

		public DisplayNameComparator(PackageManager<?> mPm) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public int compare(ResolveInfo arg0, ResolveInfo arg1) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public CharSequence loadLabel(PackageManager<?> pm) {
		// TODO Auto-generated method stub
		return "";
	}

	public Drawable loadIcon(PackageManager mPackageManager) {
		// TODO Auto-generated method stub
		return null;
	}

}
