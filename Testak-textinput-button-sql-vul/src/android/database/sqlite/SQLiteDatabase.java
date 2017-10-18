package android.database.sqlite;

import java.io.File;

import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.os.Bundle;
import android.os.CancellationSignal;

public class SQLiteDatabase {
	private static final int CREATE_IF_NECESSARY = 0;

	public interface CursorFactory {
		/**
		 * See
		 * {@link SQLiteCursor#SQLiteCursor(SQLiteCursorDriver, String, SQLiteQuery)}.
		 */
		// public Cursor newCursor(SQLiteDatabase db,
		// SQLiteCursorDriver masterQuery, String editTable,
		// SQLiteQuery query);
	}

	/**
	 * Equivalent to openDatabase(file.getPath(), factory, CREATE_IF_NECESSARY).
	 */
	public static SQLiteDatabase openOrCreateDatabase(File file, CursorFactory factory) {
		return openOrCreateDatabase(file.getPath(), factory);
	}

	/**
	 * Equivalent to openDatabase(path, factory, CREATE_IF_NECESSARY).
	 */
	public static SQLiteDatabase openOrCreateDatabase(String path, CursorFactory factory) {
		return openDatabase(path, factory, CREATE_IF_NECESSARY, null);
	}

	/**
	 * Equivalent to openDatabase(path, factory, CREATE_IF_NECESSARY, errorHandler).
	 */
	public static SQLiteDatabase openOrCreateDatabase(String path, CursorFactory factory,
			DatabaseErrorHandler errorHandler) {
		return openDatabase(path, factory, CREATE_IF_NECESSARY, errorHandler);
	}

	public static SQLiteDatabase openDatabase(String path, CursorFactory factory, int flags) {
		return openDatabase(path, factory, flags, null);
	}

	public static SQLiteDatabase openDatabase(String path, CursorFactory factory, int flags,
			DatabaseErrorHandler errorHandler) {
		SQLiteDatabase db = new SQLiteDatabase(path, flags, factory, errorHandler);
		db.open();
		return db;
	}

	private CursorFactory mCursorFactory;
	private DatabaseErrorHandler mErrorHandler;

	private SQLiteDatabase(String path, int openFlags, CursorFactory cursorFactory, DatabaseErrorHandler errorHandler) {
		mCursorFactory = cursorFactory;
		mErrorHandler = errorHandler;
		// mConfigurationLocked = new SQLiteDatabaseConfiguration(path, openFlags);
	}

	private void open() {

	}

	public void execSQL(String sql) /*throws SQLException*/ {
	}

	public void execSQL(String sql, Object[] bindArgs) /*throws SQLException*/ {

	}

	public Cursor rawQuery(String sql, String[] selectionArgs) {
		return rawQueryWithFactory(null, sql, selectionArgs, null, null);
	}

	public Cursor rawQuery(String sql, String[] selectionArgs, CancellationSignal cancellationSignal) {
		return rawQueryWithFactory(null, sql, selectionArgs, null, cancellationSignal);
	}

	public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String sql, String[] selectionArgs,
			String editTable) {
		return rawQueryWithFactory(cursorFactory, sql, selectionArgs, editTable, null);
	}

	public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String sql, String[] selectionArgs, String editTable,
			CancellationSignal cancellationSignal) {
		// acquireReference();
		// try {
		// SQLiteCursorDriver driver = new SQLiteDirectCursorDriver(this, sql,
		// editTable, cancellationSignal);
		// return driver.query(cursorFactory != null ? cursorFactory : mCursorFactory,
		// selectionArgs);
		// } finally {
		// releaseReference();
		// }
		return new Cursor() {
			
			@Override
			public void setExtras(Bundle extras) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Bundle respond(Bundle extras) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean requery() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean moveToPrevious() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean moveToPosition(int position) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean moveToNext() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean moveToLast() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean moveToFirst() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean move(int offset) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isNull(int columnIndex) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isLast() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isFirst() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isClosed() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isBeforeFirst() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isAfterLast() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getWantsAllOnMoveCalls() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getType(int columnIndex) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getString(int columnIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public short getShort(int columnIndex) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getPosition() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getLong(int columnIndex) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getInt(int columnIndex) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public float getFloat(int columnIndex) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Bundle getExtras() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public double getDouble(int columnIndex) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String[] getColumnNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getColumnName(int columnIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getColumnIndexOrThrow(String columnName) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getColumnIndex(String columnName) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public byte[] getBlob(int columnIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void deactivate() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
