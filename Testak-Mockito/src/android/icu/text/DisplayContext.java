/*    */ package android.icu.text;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum DisplayContext
/*    */ {
/* 13 */   CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE, 
/* 14 */   CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE, 
/* 15 */   CAPITALIZATION_FOR_STANDALONE, 
/* 16 */   CAPITALIZATION_FOR_UI_LIST_OR_MENU, 
/* 17 */   CAPITALIZATION_NONE, 
/* 18 */   DIALECT_NAMES, 
/* 19 */   LENGTH_FULL, 
/* 20 */   LENGTH_SHORT, 
/* 21 */   STANDARD_NAMES;
/*    */   
/*    */   private DisplayContext() {}
/* 24 */   public static enum Type { CAPITALIZATION, 
/* 25 */     DIALECT_HANDLING, 
/* 26 */     DISPLAY_LENGTH;
/*    */     private Type() {} }
/* 28 */   public Type type() { throw new RuntimeException("Stub!"); }
/* 29 */   public int value() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\DisplayContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */