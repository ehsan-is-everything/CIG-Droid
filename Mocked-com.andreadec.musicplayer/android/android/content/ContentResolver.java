package android.content;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ContentResolver {

	SQLiteDatabase sql;

	public ContentResolver() {
		this.sql = new SQLiteDatabase(null, 0, null, null);
	}

	public Cursor query(String externalContentUri, String[] projection, String where, String[] selectionArgs,
			String orderBy) {
		// TODO Auto-generated method stub
		return sql.query(externalContentUri, projection, where, selectionArgs, null, null, orderBy);
	}

}
