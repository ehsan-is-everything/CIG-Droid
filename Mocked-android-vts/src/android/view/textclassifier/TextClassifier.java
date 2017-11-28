/*    */ package android.view.textclassifier;
/*    */ 
/*    */ import android.os.LocaleList;
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
/*    */ 
/*    */ 
/*    */ public abstract interface TextClassifier
/*    */ {
/* 22 */   public static final TextClassifier NO_OP = null;
/*    */   public static final String TYPE_ADDRESS = "address";
/*    */   public static final String TYPE_EMAIL = "email";
/*    */   public static final String TYPE_OTHER = "other";
/*    */   public static final String TYPE_PHONE = "phone";
/*    */   public static final String TYPE_URL = "url";
/*    */   
/*    */   public abstract TextSelection suggestSelection(CharSequence paramCharSequence, int paramInt1, int paramInt2, LocaleList paramLocaleList);
/*    */   
/*    */   public abstract TextClassification classifyText(CharSequence paramCharSequence, int paramInt1, int paramInt2, LocaleList paramLocaleList);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\textclassifier\TextClassifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */