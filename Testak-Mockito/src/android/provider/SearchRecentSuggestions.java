/*    */ package android.provider;
/*    */ 
/*    */ import android.content.ContentResolver;
/*    */ import android.content.Context;
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
/*    */ 
/*    */ 
/*    */ public class SearchRecentSuggestions
/*    */ {
/* 20 */   public SearchRecentSuggestions(Context context, String authority, int mode) { throw new RuntimeException("Stub!"); }
/* 21 */   public void saveRecentQuery(String queryString, String line2) { throw new RuntimeException("Stub!"); }
/* 22 */   public void clearHistory() { throw new RuntimeException("Stub!"); }
/* 23 */   protected void truncateHistory(ContentResolver cr, int maxEntries) { throw new RuntimeException("Stub!"); }
/* 24 */   public static final String[] QUERIES_PROJECTION_1LINE = null;
/* 25 */   public static final String[] QUERIES_PROJECTION_2LINE = null;
/*    */   public static final int QUERIES_PROJECTION_DATE_INDEX = 1;
/*    */   public static final int QUERIES_PROJECTION_DISPLAY1_INDEX = 3;
/*    */   public static final int QUERIES_PROJECTION_DISPLAY2_INDEX = 4;
/*    */   public static final int QUERIES_PROJECTION_QUERY_INDEX = 2;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\provider\SearchRecentSuggestions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */