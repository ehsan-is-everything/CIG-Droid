/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.content;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

import com.example.anycut.ActivityPickerActivity;
import com.example.anycut.CreateShortcutActivity;

public class Intent {

	public static final String EXTRA_SHORTCUT_NAME = null;

	public static final String EXTRA_SHORTCUT_ICON_RESOURCE = null;

	public static final String EXTRA_SHORTCUT_ICON = null;

	public static final int FLAG_ACTIVITY_CLEAR_TOP = 0;

	public static final String EXTRA_SHORTCUT_INTENT = null;

	public static final String ACTION_PICK = null;

	public static final String ACTION_CALL = null;

	public static final String ACTION_SENDTO = null;

	public static final Activity ACTION_MAIN = null;

	private Activity mActivity;

	private Class<?> cls;
	private Bundle mExtras;

	public Intent(Activity packageContext, Class<?> cls) {
		this.mActivity = packageContext;
		this.setCls(cls);
	}

	public Intent() {
		// TODO Auto-generated constructor stub
	}

	public Intent(String actionPick, Uri contentUri) {
		// TODO Auto-generated constructor stub
	}

	public Intent(Activity actionMain) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 * @param defaultValue
	 *            the value to be returned if no value of the desired type is stored
	 *            with the given name.
	 *
	 * @return the value of an item that previously added with putExtra() or the
	 *         default value if none was found.
	 *
	 * @see #putExtra(String, boolean)
	 */
	public boolean getBooleanExtra(String name, boolean defaultValue) {
		return mExtras == null ? defaultValue : mExtras.getBoolean(name, defaultValue);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 * @param defaultValue
	 *            the value to be returned if no value of the desired type is stored
	 *            with the given name.
	 *
	 * @return the value of an item that previously added with putExtra() or the
	 *         default value if none was found.
	 *
	 * @see #putExtra(String, byte)
	 */
	public byte getByteExtra(String name, byte defaultValue) {
		return mExtras == null ? defaultValue : mExtras.getByte(name, defaultValue);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 * @param defaultValue
	 *            the value to be returned if no value of the desired type is stored
	 *            with the given name.
	 *
	 * @return the value of an item that previously added with putExtra() or the
	 *         default value if none was found.
	 *
	 * @see #putExtra(String, short)
	 */
	public short getShortExtra(String name, short defaultValue) {
		return mExtras == null ? defaultValue : mExtras.getShort(name, defaultValue);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 * @param defaultValue
	 *            the value to be returned if no value of the desired type is stored
	 *            with the given name.
	 *
	 * @return the value of an item that previously added with putExtra() or the
	 *         default value if none was found.
	 *
	 * @see #putExtra(String, char)
	 */
	public char getCharExtra(String name, char defaultValue) {
		return mExtras == null ? defaultValue : mExtras.getChar(name, defaultValue);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 * @param defaultValue
	 *            the value to be returned if no value of the desired type is stored
	 *            with the given name.
	 *
	 * @return the value of an item that previously added with putExtra() or the
	 *         default value if none was found.
	 *
	 * @see #putExtra(String, int)
	 */
	public int getIntExtra(String name, int defaultValue) {
		return mExtras == null ? defaultValue : mExtras.getInt(name, defaultValue);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 * @param defaultValue
	 *            the value to be returned if no value of the desired type is stored
	 *            with the given name.
	 *
	 * @return the value of an item that previously added with putExtra() or the
	 *         default value if none was found.
	 *
	 * @see #putExtra(String, long)
	 */
	public long getLongExtra(String name, long defaultValue) {
		return mExtras == null ? defaultValue : mExtras.getLong(name, defaultValue);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 * @param defaultValue
	 *            the value to be returned if no value of the desired type is stored
	 *            with the given name.
	 *
	 * @return the value of an item that previously added with putExtra(), or the
	 *         default value if no such item is present
	 *
	 * @see #putExtra(String, float)
	 */
	public float getFloatExtra(String name, float defaultValue) {
		return mExtras == null ? defaultValue : mExtras.getFloat(name, defaultValue);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 * @param defaultValue
	 *            the value to be returned if no value of the desired type is stored
	 *            with the given name.
	 *
	 * @return the value of an item that previously added with putExtra() or the
	 *         default value if none was found.
	 *
	 * @see #putExtra(String, double)
	 */
	public double getDoubleExtra(String name, double defaultValue) {
		return mExtras == null ? defaultValue : mExtras.getDouble(name, defaultValue);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no String value was found.
	 *
	 * @see #putExtra(String, String)
	 */
	public String getStringExtra(String name) {
		return mExtras == null ? null : mExtras.getString(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no CharSequence value was found.
	 *
	 * @see #putExtra(String, CharSequence)
	 */
	public CharSequence getCharSequenceExtra(String name) {
		return mExtras == null ? null : mExtras.getCharSequence(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no Parcelable value was found.
	 *
	 * @see #putExtra(String, Parcelable)
	 *//*
		 * public <T extends Parcelable> T getParcelableExtra(String name) { return
		 * mExtras == null ? null : mExtras.<T>getParcelable(name); }
		 * 
		 * /** Retrieve extended data from the intent.
		 *
		 * @param name The name of the desired item.
		 *
		 * @return the value of an item that previously added with putExtra() or null if
		 * no Parcelable[] value was found.
		 *
		 * @see #putExtra(String, Parcelable[])
		 */
	/*
	 * public Parcelable[] getParcelableArrayExtra(String name) { return mExtras ==
	 * null ? null : mExtras.getParcelableArray(name); }
	 * 
	 * /** Retrieve extended data from the intent.
	 *
	 * @param name The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 * no ArrayList<Parcelable> value was found.
	 *
	 * @see #putParcelableArrayListExtra(String, ArrayList)
	 *//*
		 * public <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(String
		 * name) { return mExtras == null ? null :
		 * mExtras.<T>getParcelableArrayList(name); }
		 * 
		 * /** Retrieve extended data from the intent.
		 *
		 * @param name The name of the desired item.
		 *
		 * @return the value of an item that previously added with putExtra() or null if
		 * no Serializable value was found.
		 *
		 * @see #putExtra(String, Serializable)
		 */
	public Serializable getSerializableExtra(String name) {
		return mExtras == null ? null : mExtras.getSerializable(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no ArrayList<Integer> value was found.
	 *
	 * @see #putIntegerArrayListExtra(String, ArrayList)
	 */
	public ArrayList<Integer> getIntegerArrayListExtra(String name) {
		return mExtras == null ? null : mExtras.getIntegerArrayList(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no ArrayList<String> value was found.
	 *
	 * @see #putStringArrayListExtra(String, ArrayList)
	 */
	public ArrayList<String> getStringArrayListExtra(String name) {
		return mExtras == null ? null : mExtras.getStringArrayList(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no ArrayList<CharSequence> value was found.
	 *
	 * @see #putCharSequenceArrayListExtra(String, ArrayList)
	 */
	public ArrayList<CharSequence> getCharSequenceArrayListExtra(String name) {
		return mExtras == null ? null : mExtras.getCharSequenceArrayList(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no boolean array value was found.
	 *
	 * @see #putExtra(String, boolean[])
	 */
	public boolean[] getBooleanArrayExtra(String name) {
		return mExtras == null ? null : mExtras.getBooleanArray(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no byte array value was found.
	 *
	 * @see #putExtra(String, byte[])
	 */
	public byte[] getByteArrayExtra(String name) {
		return mExtras == null ? null : mExtras.getByteArray(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no short array value was found.
	 *
	 * @see #putExtra(String, short[])
	 */
	public short[] getShortArrayExtra(String name) {
		return mExtras == null ? null : mExtras.getShortArray(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no char array value was found.
	 *
	 * @see #putExtra(String, char[])
	 */
	public char[] getCharArrayExtra(String name) {
		return mExtras == null ? null : mExtras.getCharArray(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no int array value was found.
	 *
	 * @see #putExtra(String, int[])
	 */
	public int[] getIntArrayExtra(String name) {
		return mExtras == null ? null : mExtras.getIntArray(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no long array value was found.
	 *
	 * @see #putExtra(String, long[])
	 */
	public long[] getLongArrayExtra(String name) {
		return mExtras == null ? null : mExtras.getLongArray(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no float array value was found.
	 *
	 * @see #putExtra(String, float[])
	 */
	public float[] getFloatArrayExtra(String name) {
		return mExtras == null ? null : mExtras.getFloatArray(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no double array value was found.
	 *
	 * @see #putExtra(String, double[])
	 */
	public double[] getDoubleArrayExtra(String name) {
		return mExtras == null ? null : mExtras.getDoubleArray(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no String array value was found.
	 *
	 * @see #putExtra(String, String[])
	 */
	public String[] getStringArrayExtra(String name) {
		return mExtras == null ? null : mExtras.getStringArray(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no CharSequence array value was found.
	 *
	 * @see #putExtra(String, CharSequence[])
	 */
	public CharSequence[] getCharSequenceArrayExtra(String name) {
		return mExtras == null ? null : mExtras.getCharSequenceArray(name);
	}

	/**
	 * Retrieve extended data from the intent.
	 *
	 * @param name
	 *            The name of the desired item.
	 *
	 * @return the value of an item that previously added with putExtra() or null if
	 *         no Bundle value was found.
	 *
	 * @see #putExtra(String, Bundle)
	 *//*
		 * public Bundle getBundleExtra(String name) { return mExtras == null ? null :
		 * mExtras.getBundle(name); }
		 * 
		 * /** Retrieve extended data from the intent.
		 *
		 * @param name The name of the desired item.
		 *
		 * @return the value of an item that previously added with putExtra() or null if
		 * no IBinder value was found.
		 *
		 * @see #putExtra(String, IBinder)
		 *
		 * @deprecated
		 * 
		 * @hide
		 */
	/*
	 * @Deprecated public IBinder getIBinderExtra(String name) { return mExtras ==
	 * null ? null : mExtras.getIBinder(name); }
	 * 
	 * /** Retrieve extended data from the intent.
	 *
	 * @param name The name of the desired item.
	 * 
	 * @param defaultValue The default value to return in case no item is associated
	 * with the key 'name'
	 *
	 * @return the value of an item that previously added with putExtra() or
	 * defaultValue if none was found.
	 *
	 * @see #putExtra
	 *
	 * @deprecated
	 * 
	 * @hide
	 */
	@Deprecated
	public Object getExtra(String name, Object defaultValue) {
		Object result = defaultValue;
		if (mExtras != null) {
			Object result2 = mExtras.get(name);
			if (result2 != null) {
				result = result2;
			}
		}

		return result;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The boolean data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getBooleanExtra(String, boolean)
	 */
	public Intent putExtra(String name, boolean value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putBoolean(name, value);
		return this;
	}

	public static class ShortcutIconResource implements Parcelable {
		/**
		 * The package name of the application containing the icon.
		 */
		public String packageName;

		/**
		 * The resource name of the icon, including package, name and type.
		 */
		public String resourceName;

		/**
		 * Creates a new ShortcutIconResource for the specified context and resource
		 * identifier.
		 *
		 * @param context
		 *            The context of the application.
		 * @param resourceId
		 *            The resource identifier for the icon.
		 * @return A new ShortcutIconResource with the specified's context package name
		 *         and icon resource identifier.``
		 */
		public static ShortcutIconResource fromContext(Context context, @AnyRes int resourceId) {
			ShortcutIconResource icon = new ShortcutIconResource();
			icon.packageName = context.getPackageName();
			icon.resourceName = context.getResources().getResourceName(resourceId);
			return icon;
		}

		/**
		 * Used to read a ShortcutIconResource from a Parcel.
		 */
		public static final Parcelable.Creator<ShortcutIconResource> CREATOR = new Parcelable.Creator<ShortcutIconResource>() {

			public ShortcutIconResource createFromParcel(Parcel source) {
				ShortcutIconResource icon = new ShortcutIconResource();
				icon.packageName = source.readString();
				icon.resourceName = source.readString();
				return icon;
			}

			public ShortcutIconResource[] newArray(int size) {
				return new ShortcutIconResource[size];
			}
		};

		/**
		 * No special parcel contents.
		 */
		public int describeContents() {
			return 0;
		}

		public void writeToParcel(Parcel dest, int flags) {
			dest.writeString(packageName);
			dest.writeString(resourceName);
		}

		@Override
		public String toString() {
			return resourceName;
		}
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The byte data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getByteExtra(String, byte)
	 */
	public Intent putExtra(String name, byte value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putByte(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The char data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getCharExtra(String, char)
	 */
	public Intent putExtra(String name, char value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putChar(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The short data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getShortExtra(String, short)
	 */
	public Intent putExtra(String name, short value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putShort(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The integer data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getIntExtra(String, int)
	 */
	public Intent putExtra(String name, int value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putInt(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The long data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getLongExtra(String, long)
	 */
	public Intent putExtra(String name, long value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putLong(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The float data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getFloatExtra(String, float)
	 */
	public Intent putExtra(String name, float value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putFloat(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The double data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getDoubleExtra(String, double)
	 */
	public Intent putExtra(String name, double value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putDouble(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The String data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getStringExtra(String)
	 */
	public Intent putExtra(String name, String value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putString(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The CharSequence data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getCharSequenceExtra(String)
	 */
	public Intent putExtra(String name, CharSequence value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putCharSequence(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The Parcelable data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getParcelableExtra(String)
	 *//*
		 * public Intent putExtra(String name, Parcelable value) { if (mExtras == null)
		 * { mExtras = new Bundle(); } mExtras.putParcelable(name, value); return this;
		 * }
		 * 
		 * /** Add extended data to the intent. The name must include a package prefix,
		 * for example the app com.android.contacts would use names like
		 * "com.android.contacts.ShowAll".
		 *
		 * @param name The name of the extra data, with package prefix.
		 * 
		 * @param value The Parcelable[] data value.
		 *
		 * @return Returns the same Intent object, for chaining multiple calls into a
		 * single statement.
		 *
		 * @see #putExtras
		 * 
		 * @see #removeExtra
		 * 
		 * @see #getParcelableArrayExtra(String)
		 */
	/*
	 * public Intent putExtra(String name, Parcelable[] value) { if (mExtras ==
	 * null) { mExtras = new Bundle(); } mExtras.putParcelableArray(name, value);
	 * return this; }
	 * 
	 * /** Add extended data to the intent. The name must include a package prefix,
	 * for example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name The name of the extra data, with package prefix.
	 * 
	 * @param value The ArrayList<Parcelable> data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 * single statement.
	 *
	 * @see #putExtras
	 * 
	 * @see #removeExtra
	 * 
	 * @see #getParcelableArrayListExtra(String)
	 *//*
		 * public Intent putParcelableArrayListExtra(String name, ArrayList<? extends
		 * Parcelable> value) { if (mExtras == null) { mExtras = new Bundle(); }
		 * mExtras.putParcelableArrayList(name, value); return this; }
		 * 
		 * /** Add extended data to the intent. The name must include a package prefix,
		 * for example the app com.android.contacts would use names like
		 * "com.android.contacts.ShowAll".
		 *
		 * @param name The name of the extra data, with package prefix.
		 * 
		 * @param value The ArrayList<Integer> data value.
		 *
		 * @return Returns the same Intent object, for chaining multiple calls into a
		 * single statement.
		 *
		 * @see #putExtras
		 * 
		 * @see #removeExtra
		 * 
		 * @see #getIntegerArrayListExtra(String)
		 */
	public Intent putIntegerArrayListExtra(String name, ArrayList<Integer> value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putIntegerArrayList(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The ArrayList<String> data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getStringArrayListExtra(String)
	 */
	public Intent putStringArrayListExtra(String name, ArrayList<String> value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putStringArrayList(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The ArrayList<CharSequence> data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getCharSequenceArrayListExtra(String)
	 */
	public Intent putCharSequenceArrayListExtra(String name, ArrayList<CharSequence> value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putCharSequenceArrayList(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The Serializable data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getSerializableExtra(String)
	 */
	public Intent putExtra(String name, Serializable value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putSerializable(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The boolean array data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getBooleanArrayExtra(String)
	 */
	public Intent putExtra(String name, boolean[] value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putBooleanArray(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The byte array data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getByteArrayExtra(String)
	 */
	public Intent putExtra(String name, byte[] value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putByteArray(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The short array data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getShortArrayExtra(String)
	 */
	public Intent putExtra(String name, short[] value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putShortArray(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The char array data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getCharArrayExtra(String)
	 */
	public Intent putExtra(String name, char[] value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putCharArray(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The int array data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getIntArrayExtra(String)
	 */
	public Intent putExtra(String name, int[] value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putIntArray(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The byte array data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getLongArrayExtra(String)
	 */
	public Intent putExtra(String name, long[] value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putLongArray(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The float array data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getFloatArrayExtra(String)
	 */
	public Intent putExtra(String name, float[] value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putFloatArray(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The double array data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getDoubleArrayExtra(String)
	 */
	public Intent putExtra(String name, double[] value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putDoubleArray(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The String array data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getStringArrayExtra(String)
	 */
	public Intent putExtra(String name, String[] value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putStringArray(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The CharSequence array data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getCharSequenceArrayExtra(String)
	 */
	public Intent putExtra(String name, CharSequence[] value) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putCharSequenceArray(name, value);
		return this;
	}

	/**
	 * Add extended data to the intent. The name must include a package prefix, for
	 * example the app com.android.contacts would use names like
	 * "com.android.contacts.ShowAll".
	 *
	 * @param name
	 *            The name of the extra data, with package prefix.
	 * @param value
	 *            The Bundle data value.
	 *
	 * @return Returns the same Intent object, for chaining multiple calls into a
	 *         single statement.
	 *
	 * @see #putExtras
	 * @see #removeExtra
	 * @see #getBundleExtra(String)
	 *//*
		 * public Intent putExtra(String name, Bundle value) { if (mExtras == null) {
		 * mExtras = new Bundle(); } mExtras.putBundle(name, value); return this; }
		 * 
		 * /** Add extended data to the intent. The name must include a package prefix,
		 * for example the app com.android.contacts would use names like
		 * "com.android.contacts.ShowAll".
		 *
		 * @param name The name of the extra data, with package prefix.
		 * 
		 * @param value The IBinder data value.
		 *
		 * @return Returns the same Intent object, for chaining multiple calls into a
		 * single statement.
		 *
		 * @see #putExtras
		 * 
		 * @see #removeExtra
		 * 
		 * @see #getIBinderExtra(String)
		 *
		 * @deprecated
		 * 
		 * @hide
		 */
	/*
	 * @Deprecated public Intent putExtra(String name, IBinder value) { if (mExtras
	 * == null) { mExtras = new Bundle(); } mExtras.putIBinder(name, value); return
	 * this; }
	 * 
	 * /** Copy all extras in 'src' in to this intent.
	 *
	 * @param src Contains the extras to copy.
	 *
	 * @see #putExtra
	 *//*
		 * public Intent putExtras(Intent src) { if (src.mExtras != null) { if (mExtras
		 * == null) { mExtras = new Bundle(src.mExtras); } else {
		 * mExtras.putAll(src.mExtras); } } return this; }
		 * 
		 * /** Add a set of extended data to the intent. The keys must include a package
		 * prefix, for example the app com.android.contacts would use names like
		 * "com.android.contacts.ShowAll".
		 *
		 * @param extras The Bundle of extras to add to this intent.
		 *
		 * @see #putExtra
		 * 
		 * @see #removeExtra
		 *//*
			 * public Intent putExtras(Bundle extras) { if (mExtras == null) { mExtras = new
			 * Bundle(); } mExtras.putAll(extras); return this; }
			 * 
			 * /** Completely replace the extras in the Intent with the extras in the given
			 * Intent.
			 *
			 * @param src The exact extras contained in this Intent are copied into the
			 * target intent, replacing any that were previously there.
			 *//*
				 * public Intent replaceExtras(Intent src) { mExtras = src.mExtras != null ? new
				 * Bundle(src.mExtras) : null; return this; }
				 * 
				 * /** Completely replace the extras in the Intent with the given Bundle of
				 * extras.
				 *
				 * @param extras The new set of extras in the Intent, or null to erase all
				 * extras.
				 *//*
					 * public Intent replaceExtras(Bundle extras) { mExtras = extras != null ? new
					 * Bundle(extras) : null; return this; }
					 * 
					 * /** Remove extended data from the intent.
					 *
					 * @see #putExtra
					 */
	public void removeExtra(String name) {
		if (mExtras != null) {
			mExtras.remove(name);
			if (mExtras.size() == 0) {
				mExtras = null;
			}
		}
	}

	public Class<?> getCls() {
		return cls;
	}

	public void setCls(Class<?> cls) {
		this.cls = cls;
	}

	public void addFlags(int i) {
		// TODO Auto-generated method stub

	}

	public Bitmap getParcelableExtra(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAction(String string) {
		// TODO Auto-generated method stub

	}

	public void setType(String type) {
		// TODO Auto-generated method stub

	}

	public Intent putExtra(String name, Intent intent) {
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putSerializable(name, (Serializable) intent);
		return this;
	}
	public Intent setDataAndType(Uri data, String type) {
//        mData = data;
//        mType = type;
        return this;
    }
	public Intent setData(Uri data) {
		// mData = data;
		// mType = null;
        return this;
    }

	public Intent setClass(Activity createShortcutActivity, Class<?> cls) {
		// TODO Auto-generated method stub
		return this;
	}

	public Uri getData() {
		// TODO Auto-generated method stub
		return new Uri();
	}

	public Intent putExtra(String extraShortcutIcon, Bitmap generatePhoneNumberIcon) {
		// TODO Auto-generated method stub
		if (mExtras == null) {
			mExtras = new Bundle();
		}
		mExtras.putSerializable(extraShortcutIcon, (Serializable) generatePhoneNumberIcon);
		return this;
	}
}
