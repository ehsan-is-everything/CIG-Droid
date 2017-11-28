/*    */ package android.text;
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
/*    */ public abstract class LoginFilter
/*    */   implements InputFilter
/*    */ {
/*    */   public static class UsernameFilterGMail
/*    */     extends LoginFilter
/*    */   {
/* 24 */     public UsernameFilterGMail() { throw new RuntimeException("Stub!"); }
/* 25 */     public UsernameFilterGMail(boolean appendInvalid) { throw new RuntimeException("Stub!"); }
/* 26 */     public boolean isAllowed(char c) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class UsernameFilterGeneric
/*    */     extends LoginFilter {
/* 31 */     public UsernameFilterGeneric() { throw new RuntimeException("Stub!"); }
/* 32 */     public UsernameFilterGeneric(boolean appendInvalid) { throw new RuntimeException("Stub!"); }
/* 33 */     public boolean isAllowed(char c) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class PasswordFilterGMail
/*    */     extends LoginFilter {
/* 38 */     public PasswordFilterGMail() { throw new RuntimeException("Stub!"); }
/* 39 */     public PasswordFilterGMail(boolean appendInvalid) { throw new RuntimeException("Stub!"); }
/* 40 */     public boolean isAllowed(char c) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 42 */   LoginFilter() { throw new RuntimeException("Stub!"); }
/* 43 */   public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
/* 44 */   public void onStart() { throw new RuntimeException("Stub!"); }
/* 45 */   public void onInvalidCharacter(char c) { throw new RuntimeException("Stub!"); }
/* 46 */   public void onStop() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean isAllowed(char paramChar);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\LoginFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */