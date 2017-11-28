/*    */ package android.database.sqlite;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.os.CancellationSignal;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SQLiteQueryBuilder
/*    */ {
/* 20 */   public SQLiteQueryBuilder() { throw new RuntimeException("Stub!"); }
/* 21 */   public void setDistinct(boolean distinct) { throw new RuntimeException("Stub!"); }
/* 22 */   public String getTables() { throw new RuntimeException("Stub!"); }
/* 23 */   public void setTables(String inTables) { throw new RuntimeException("Stub!"); }
/* 24 */   public void appendWhere(CharSequence inWhere) { throw new RuntimeException("Stub!"); }
/* 25 */   public void appendWhereEscapeString(String inWhere) { throw new RuntimeException("Stub!"); }
/* 26 */   public void setProjectionMap(Map<String, String> columnMap) { throw new RuntimeException("Stub!"); }
/* 27 */   public void setCursorFactory(SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setStrict(boolean flag) { throw new RuntimeException("Stub!"); }
/* 29 */   public static String buildQueryString(boolean distinct, String tables, String[] columns, String where, String groupBy, String having, String orderBy, String limit) { throw new RuntimeException("Stub!"); }
/* 30 */   public static void appendColumns(StringBuilder s, String[] columns) { throw new RuntimeException("Stub!"); }
/* 31 */   public Cursor query(SQLiteDatabase db, String[] projectionIn, String selection, String[] selectionArgs, String groupBy, String having, String sortOrder) { throw new RuntimeException("Stub!"); }
/* 32 */   public Cursor query(SQLiteDatabase db, String[] projectionIn, String selection, String[] selectionArgs, String groupBy, String having, String sortOrder, String limit) { throw new RuntimeException("Stub!"); }
/* 33 */   public Cursor query(SQLiteDatabase db, String[] projectionIn, String selection, String[] selectionArgs, String groupBy, String having, String sortOrder, String limit, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 34 */   public String buildQuery(String[] projectionIn, String selection, String groupBy, String having, String sortOrder, String limit) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public String buildQuery(String[] projectionIn, String selection, String[] selectionArgs, String groupBy, String having, String sortOrder, String limit) { throw new RuntimeException("Stub!"); }
/* 37 */   public String buildUnionSubQuery(String typeDiscriminatorColumn, String[] unionColumns, Set<String> columnsPresentInTable, int computedColumnsOffset, String typeDiscriminatorValue, String selection, String groupBy, String having) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 39 */   public String buildUnionSubQuery(String typeDiscriminatorColumn, String[] unionColumns, Set<String> columnsPresentInTable, int computedColumnsOffset, String typeDiscriminatorValue, String selection, String[] selectionArgs, String groupBy, String having) { throw new RuntimeException("Stub!"); }
/* 40 */   public String buildUnionQuery(String[] subQueries, String sortOrder, String limit) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\sqlite\SQLiteQueryBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */