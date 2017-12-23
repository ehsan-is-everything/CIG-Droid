package android.content;

import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
public class Context {

	public static final CursorFactory MODE_PRIVATE = null;
	public static final String INPUT_METHOD_SERVICE = null;
	public static final String POWER_SERVICE= "";
	public String getText(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public Resources getResources() {
		// TODO Auto-generated method stub
		return new Resources();
	}
	public int getIdentifier(String resourceName, Object object, String packageName) {
		// TODO Auto-generated method stub
		return 0;
	}
	public PackageManager getPackageManager() {
		return new PackageManager<>();
	}
	public Context getBaseContext(){
		return new Context();
	}
	public AssetManager getAssets() {
		return new AssetManager();
	}
	public Context getApplicationContext() {
		return this;
	}
}
