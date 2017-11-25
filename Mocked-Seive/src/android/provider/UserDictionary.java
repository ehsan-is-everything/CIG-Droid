/*    */ package android.provider;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UserDictionary
/*    */ {
/*    */   public static final String AUTHORITY = "user_dictionary";
/*    */   
/*    */   public static class Words
/*    */     implements BaseColumns
/*    */   {
/*    */     public static final String APP_ID = "appid";
/*    */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.userword";
/*    */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.userword";
/*    */     
/* 23 */     public Words() { throw new RuntimeException("Stub!"); }
/*    */     @Deprecated
/* 25 */     public static void addWord(Context context, String word, int frequency, int localeType) { throw new RuntimeException("Stub!"); }
/* 26 */     public static void addWord(Context context, String word, int frequency, String shortcut, Locale locale) { throw new RuntimeException("Stub!"); }
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
/*    */ 
/* 41 */     public static final Uri CONTENT_URI = null; public static final String DEFAULT_SORT_ORDER = "frequency DESC"; public static final String FREQUENCY = "frequency"; public static final String LOCALE = "locale"; @Deprecated
/*    */     public static final int LOCALE_TYPE_ALL = 0; @Deprecated
/* 43 */     public static final int LOCALE_TYPE_CURRENT = 1; public static final String SHORTCUT = "shortcut"; public static final String WORD = "word"; public static final String _ID = "_id"; } public UserDictionary() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 46 */   public static final Uri CONTENT_URI = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\provider\UserDictionary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */