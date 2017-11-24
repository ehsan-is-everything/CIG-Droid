package android.database.sqlite;

import java.io.File;
import java.util.LinkedList;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.os.Bundle;
import android.os.CancellationSignal;
import gov.nasa.jpf.symbc.Debug;

public class SQLiteDatabase {
	private static final int CREATE_IF_NECESSARY = 0;
	private static final String[] CONFLICT_VALUES = new String[] { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ",
			" OR IGNORE ", " OR REPLACE " };

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

	public SQLiteDatabase(String path, int openFlags, CursorFactory cursorFactory, DatabaseErrorHandler errorHandler) {
		mCursorFactory = cursorFactory;
		mErrorHandler = errorHandler;
		// mConfigurationLocked = new SQLiteDatabaseConfiguration(path, openFlags);
	}

	private void open() {

	}

	public void execSQL(String sql) /* throws SQLException */ {
		execSQL(sql, null);
	}

	public void execSQL(String sql, Object[] bindArgs) /* throws SQLException */ {

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

	public Cursor query(boolean distinct, String table, String[] columns, String selection, String[] selectionArgs,
			String groupBy, String having, String orderBy, String limit) {
		return queryWithFactory(null, distinct, table, columns, selection, selectionArgs, groupBy, having, orderBy,
				limit, null);
	}

	public Cursor query(String table, String[] columns, String selection, String[] selectionArgs, String groupBy,
			String having, String orderBy, String limit) {

		return query(false, table, columns, selection, selectionArgs, groupBy, having, orderBy, limit);
	}

	public Cursor query(String table, String[] columns, String selection, String[] selectionArgs, String groupBy,
			String having, String orderBy) {

		return query(false, table, columns, selection, selectionArgs, groupBy, having, orderBy, null /* limit */);
	}

	public Cursor query(boolean distinct, String table, String[] columns, String selection, String[] selectionArgs,
			String groupBy, String having, String orderBy, String limit, CancellationSignal cancellationSignal) {
		return queryWithFactory(null, distinct, table, columns, selection, selectionArgs, groupBy, having, orderBy,
				limit, cancellationSignal);
	}

	public Cursor queryWithFactory(CursorFactory cursorFactory, boolean distinct, String table, String[] columns,
			String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) {
		return queryWithFactory(cursorFactory, distinct, table, columns, selection, selectionArgs, groupBy, having,
				orderBy, limit, null);
	}

	public Cursor queryWithFactory(CursorFactory cursorFactory, boolean distinct, String table, String[] columns,
			String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit,
			CancellationSignal cancellationSignal) {
		// acquireReference();
		try {
			StringBuilder query = new StringBuilder(120);

			query.append("SELECT ");
			if (distinct) {
				query.append("DISTINCT ");
			}
			if (columns != null && columns.length != 0) {
				int n = columns.length;

				for (int i = 0; i < n; i++) {
					String column = columns[i];

					if (column != null) {
						if (i > 0) {
							query.append(", ");
						}
						query.append(column);
					}
				}
				query.append(' ');
			} else {
				query.append("* ");
			}
			query.append("FROM ");
			query.append(table);
			query.append(" WHERE ");
			query.append(selection);
			query.append(" GROUP BY ");
			query.append(groupBy);
			query.append(" HAVING ");
			query.append(having);
			query.append(" ORDER BY ");
			query.append(orderBy);
			query.append(" LIMIT ");
			query.append(limit);
			String sql = query.toString();

			return rawQueryWithFactory(cursorFactory, sql, selectionArgs, table, cancellationSignal);
		} finally {
			// releaseReference();
		}
	}

	public int update(String table, ContentValues values, String whereClause, String[] whereArgs) {
		return updateWithOnConflict(table, values, whereClause, whereArgs, 0);
	}

	public int updateWithOnConflict(String table, ContentValues values, String whereClause, String[] whereArgs,
			int conflictAlgorithm) {
		// if (values == null || values.size() == 0) {
		// throw new IllegalArgumentException("Empty values");
		// }
		//
		// //acquireReference();
		// try {
		// StringBuilder sql = new StringBuilder(120);
		// sql.append("UPDATE ");
		// sql.append(CONFLICT_VALUES[conflictAlgorithm]);
		// sql.append(table);
		// sql.append(" SET ");
		//
		// // move all bind args to one array
		// int setValuesSize = values.size();
		// int bindArgsSize = (whereArgs == null) ? setValuesSize : (setValuesSize +
		// whereArgs.length);
		// Object[] bindArgs = new Object[bindArgsSize];
		// int i = 0;
		// for (String colName : values.keySet()) {
		// sql.append((i > 0) ? "," : "");
		// sql.append(colName);
		// bindArgs[i++] = values.get(colName);
		// sql.append("=?");
		// }
		// if (whereArgs != null) {
		// for (i = setValuesSize; i < bindArgsSize; i++) {
		// bindArgs[i] = whereArgs[i - setValuesSize];
		// }
		// }
		// if (!whereClause.isEmpty()) {
		// sql.append(" WHERE ");
		// sql.append(whereClause);
		// }
		//
		// //SQLiteStatement statement = new SQLiteStatement(this, sql.toString(),
		// bindArgs);
		// try {
		return Debug.makeSymbolicInteger("db.updateWithOnConflict()");
		// } finally {
		// //statement.close();
		// }
		// } finally {
		// //releaseReference();
		// }
	}

	public int delete(String table, String whereClause, String[] whereArgs) {
		// acquireReference();
		// try {
		// SQLiteStatement statement = new SQLiteStatement(this, "DELETE FROM " + table
		// +
		// (!TextUtils.isEmpty(whereClause) ? " WHERE " + whereClause : ""), whereArgs);
		// try {
		return Debug.makeSymbolicInteger("db.delete()");
		// } finally {
		// statement.close();
		// }
		// } finally {
		// releaseReference();
		// }
	}

	public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String sql, String[] selectionArgs, String editTable,
			CancellationSignal cancellationSignal) {
		return new Cursor() {

			@Override
			public void setExtras(Bundle extras) {
				// TODO Auto-generated method stub

			}

			@Override
			public Bundle respond(Bundle extras) {
				// TODO Auto-generated method stub
				return (Bundle) Debug.makeSymbolicRef("dbCursor.Bundle", extras);
			}

			@Override
			public boolean requery() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.requery()");
			}

			@Override
			public boolean moveToPrevious() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.moveToPrevious()");
			}

			@Override
			public boolean moveToPosition(int position) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.moveToPosition()");
			}

			@Override
			public boolean moveToNext() {
				// TODO Auto-generated method stub

				return Debug.makeSymbolicBoolean("dbCursor.moveToNext()");
			}

			@Override
			public boolean moveToLast() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.moveToLast()");
			}

			@Override
			public boolean moveToFirst() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.moveToFirst()");
			}

			@Override
			public boolean move(int offset) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.move()");
			}

			@Override
			public boolean isNull(int columnIndex) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.isNull()");
			}

			@Override
			public boolean isLast() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.isLast()");
			}

			@Override
			public boolean isFirst() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.isFirst()");
			}

			@Override
			public boolean isClosed() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.isClosed()");
			}

			@Override
			public boolean isBeforeFirst() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.isBeforeFirst()");
			}

			@Override
			public boolean isAfterLast() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.isAfterLast()");
			}

			@Override
			public boolean getWantsAllOnMoveCalls() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicBoolean("dbCursor.getWantsAllOnMoveCalls()");
			}

			@Override
			public int getType(int columnIndex) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicInteger("dbCursor.getType()");
			}

			@Override
			public String getString(int columnIndex) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicString("dbCursor.getString()");
			}

			@Override
			public short getShort(int columnIndex) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicShort("dbCursor.getShort()");
			}

			@Override
			public int getPosition() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicInteger("dbCursor.getPosition()");
			}

			@Override
			public long getLong(int columnIndex) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicLong("dbCursor.getLong()");
			}

			@Override
			public int getInt(int columnIndex) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicInteger("dbCursor.getInt()");
			}

			@Override
			public float getFloat(int columnIndex) {
				// TODO Auto-generated method stub
				return (float) Debug.makeSymbolicReal("dbCursor.getFloat()");
			}

			@Override
			public Bundle getExtras() {
				// TODO Auto-generated method stub
				return (Bundle) Debug.makeSymbolicRef("dbCursor.getExtras()", new Bundle());
			}

			@Override
			public double getDouble(int columnIndex) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicReal("dbCursor.getDouble()");
			}

			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicInteger("dbCursor.getCount()");
			}

			@Override
			public String[] getColumnNames() {
				// TODO extend the makeSymbolic()
				return (String[]) Debug.makeSymbolicRef("dbCursor.getColumnNames()",
						(new LinkedList<String>()).toArray());
			}

			@Override
			public String getColumnName(int columnIndex) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicString("dbCursor.getColumnName()");
			}

			@Override
			public int getColumnIndexOrThrow(String columnName) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicInteger("dbCursor.getColumnIndexOrThrow()");
			}

			@Override
			public int getColumnIndex(String columnName) {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicInteger("dbCursor.getColumnIndex()");
			}

			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return Debug.makeSymbolicInteger("dbCursor.getColumnCount()");
			}

			@Override
			public byte[] getBlob(int columnIndex) {
				// TODO Auto-generated method stub
				return (byte[]) Debug.makeSymbolicRef("dbCursor.getBlob()", (new LinkedList<String>()).toArray());
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
