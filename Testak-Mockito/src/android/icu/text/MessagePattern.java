/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.Freezable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MessagePattern
/*    */   implements Cloneable, Freezable<MessagePattern>
/*    */ {
/*    */   public static final int ARG_NAME_NOT_NUMBER = -1;
/*    */   public static final int ARG_NAME_NOT_VALID = -2;
/*    */   public static final double NO_NUMERIC_VALUE = -1.23456789E8D;
/*    */   
/*    */   public static enum ApostropheMode
/*    */   {
/* 19 */     DOUBLE_OPTIONAL, 
/* 20 */     DOUBLE_REQUIRED;
/*    */     
/*    */     private ApostropheMode() {}
/*    */   }
/*    */   
/*    */   public static final class Part {
/* 26 */     public static enum Type { ARG_DOUBLE, 
/* 27 */       ARG_INT, 
/* 28 */       ARG_LIMIT, 
/* 29 */       ARG_NAME, 
/* 30 */       ARG_NUMBER, 
/* 31 */       ARG_SELECTOR, 
/* 32 */       ARG_START, 
/* 33 */       ARG_STYLE, 
/* 34 */       ARG_TYPE, 
/* 35 */       INSERT_CHAR, 
/* 36 */       MSG_LIMIT, 
/* 37 */       MSG_START, 
/* 38 */       REPLACE_NUMBER, 
/* 39 */       SKIP_SYNTAX;
/* 40 */       private Type() {} public boolean hasNumericValue() { throw new RuntimeException("Stub!"); } }
/*    */     
/* 42 */     Part() { throw new RuntimeException("Stub!"); }
/* 43 */     public Type getType() { throw new RuntimeException("Stub!"); }
/* 44 */     public int getIndex() { throw new RuntimeException("Stub!"); }
/* 45 */     public int getLength() { throw new RuntimeException("Stub!"); }
/* 46 */     public int getLimit() { throw new RuntimeException("Stub!"); }
/* 47 */     public int getValue() { throw new RuntimeException("Stub!"); }
/* 48 */     public MessagePattern.ArgType getArgType() { throw new RuntimeException("Stub!"); }
/* 49 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 50 */     public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 51 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static enum ArgType {
/* 55 */     CHOICE, 
/* 56 */     NONE, 
/* 57 */     PLURAL, 
/* 58 */     SELECT, 
/* 59 */     SELECTORDINAL, 
/* 60 */     SIMPLE;
/* 61 */     private ArgType() {} public boolean hasPluralStyle() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 63 */   public MessagePattern() { throw new RuntimeException("Stub!"); }
/* 64 */   public MessagePattern(ApostropheMode mode) { throw new RuntimeException("Stub!"); }
/* 65 */   public MessagePattern(String pattern) { throw new RuntimeException("Stub!"); }
/* 66 */   public MessagePattern parse(String pattern) { throw new RuntimeException("Stub!"); }
/* 67 */   public MessagePattern parseChoiceStyle(String pattern) { throw new RuntimeException("Stub!"); }
/* 68 */   public MessagePattern parsePluralStyle(String pattern) { throw new RuntimeException("Stub!"); }
/* 69 */   public MessagePattern parseSelectStyle(String pattern) { throw new RuntimeException("Stub!"); }
/* 70 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 71 */   public void clearPatternAndSetApostropheMode(ApostropheMode mode) { throw new RuntimeException("Stub!"); }
/* 72 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 73 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 74 */   public ApostropheMode getApostropheMode() { throw new RuntimeException("Stub!"); }
/* 75 */   public String getPatternString() { throw new RuntimeException("Stub!"); }
/* 76 */   public boolean hasNamedArguments() { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean hasNumberedArguments() { throw new RuntimeException("Stub!"); }
/* 78 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 79 */   public static int validateArgumentName(String name) { throw new RuntimeException("Stub!"); }
/* 80 */   public String autoQuoteApostropheDeep() { throw new RuntimeException("Stub!"); }
/* 81 */   public int countParts() { throw new RuntimeException("Stub!"); }
/* 82 */   public Part getPart(int i) { throw new RuntimeException("Stub!"); }
/* 83 */   public MessagePattern.Part.Type getPartType(int i) { throw new RuntimeException("Stub!"); }
/* 84 */   public int getPatternIndex(int partIndex) { throw new RuntimeException("Stub!"); }
/* 85 */   public String getSubstring(Part part) { throw new RuntimeException("Stub!"); }
/* 86 */   public boolean partSubstringMatches(Part part, String s) { throw new RuntimeException("Stub!"); }
/* 87 */   public double getNumericValue(Part part) { throw new RuntimeException("Stub!"); }
/* 88 */   public double getPluralOffset(int pluralStart) { throw new RuntimeException("Stub!"); }
/* 89 */   public int getLimitPartIndex(int start) { throw new RuntimeException("Stub!"); }
/* 90 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */   
/* 92 */   public MessagePattern cloneAsThawed() { throw new RuntimeException("Stub!"); }
/* 93 */   public MessagePattern freeze() { throw new RuntimeException("Stub!"); }
/* 94 */   public boolean isFrozen() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\MessagePattern.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */