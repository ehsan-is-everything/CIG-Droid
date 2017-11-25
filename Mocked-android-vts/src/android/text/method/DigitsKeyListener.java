/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Spanned;
/*    */ import java.util.Locale;
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
/*    */ public class DigitsKeyListener
/*    */   extends NumberKeyListener
/*    */ {
/*    */   @Deprecated
/* 22 */   public DigitsKeyListener() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 24 */   public DigitsKeyListener(boolean sign, boolean decimal) { throw new RuntimeException("Stub!"); }
/* 25 */   public DigitsKeyListener(Locale locale) { throw new RuntimeException("Stub!"); }
/* 26 */   public DigitsKeyListener(Locale locale, boolean sign, boolean decimal) { throw new RuntimeException("Stub!"); }
/* 27 */   protected char[] getAcceptedChars() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 29 */   public static DigitsKeyListener getInstance() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 31 */   public static DigitsKeyListener getInstance(boolean sign, boolean decimal) { throw new RuntimeException("Stub!"); }
/* 32 */   public static DigitsKeyListener getInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 33 */   public static DigitsKeyListener getInstance(Locale locale, boolean sign, boolean decimal) { throw new RuntimeException("Stub!"); }
/* 34 */   public static DigitsKeyListener getInstance(String accepted) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getInputType() { throw new RuntimeException("Stub!"); }
/* 36 */   public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\method\DigitsKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */