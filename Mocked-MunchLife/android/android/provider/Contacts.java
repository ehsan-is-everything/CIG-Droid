package android.provider;

import android.content.Context;

//import com.example.anycut.CreateShortcutActivity;

import android.graphics.Bitmap;
import android.net.Uri;

public class Contacts {

	public static final class Phones {

		 public static final Uri CONTENT_URI =
            Uri.parse("content://contacts/phones");
		public static final String PERSON_ID = null;
		public static final String DISPLAY_NAME = null;
		public static final String NUMBER = null;
		public static final String TYPE = null;
		public static final int TYPE_HOME = 0;
		public static final int TYPE_MOBILE = 1;
		public static final int TYPE_WORK = 2;
		public static final int TYPE_PAGER = 3;
		public static final int TYPE_OTHER = 4;

	}

	public static final class People {

		public static final String CONTENT_URI = null;

		public static Bitmap loadContactPhoto(Context c, Uri personUri, int i,
				Object object) {
			// TODO Auto-generated method stub
			return new Bitmap();
		}

	}
	public static final class Intents {
		public static final class UI {

			public static final String TITLE_EXTRA_KEY = null;
			
		}
	}

}
