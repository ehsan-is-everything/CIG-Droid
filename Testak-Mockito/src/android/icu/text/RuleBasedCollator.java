/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.VersionInfo;
/*    */ import java.text.CharacterIterator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class RuleBasedCollator
/*    */   extends Collator
/*    */ {
/* 14 */   public RuleBasedCollator(String rules)
/* 14 */     throws Exception { throw new RuntimeException("Stub!"); }
/* 15 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/* 16 */   public CollationElementIterator getCollationElementIterator(String source) { throw new RuntimeException("Stub!"); }
/* 17 */   public CollationElementIterator getCollationElementIterator(CharacterIterator source) { throw new RuntimeException("Stub!"); }
/* 18 */   public CollationElementIterator getCollationElementIterator(UCharacterIterator source) { throw new RuntimeException("Stub!"); }
/* 19 */   public boolean isFrozen() { throw new RuntimeException("Stub!"); }
/* 20 */   public Collator freeze() { throw new RuntimeException("Stub!"); }
/* 21 */   public RuleBasedCollator cloneAsThawed() { throw new RuntimeException("Stub!"); }
/* 22 */   public void setUpperCaseFirst(boolean upperfirst) { throw new RuntimeException("Stub!"); }
/* 23 */   public void setLowerCaseFirst(boolean lowerfirst) { throw new RuntimeException("Stub!"); }
/* 24 */   public final void setCaseFirstDefault() { throw new RuntimeException("Stub!"); }
/* 25 */   public void setAlternateHandlingDefault() { throw new RuntimeException("Stub!"); }
/* 26 */   public void setCaseLevelDefault() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setDecompositionDefault() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setFrenchCollationDefault() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setStrengthDefault() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setNumericCollationDefault() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setFrenchCollation(boolean flag) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setAlternateHandlingShifted(boolean shifted) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setCaseLevel(boolean flag) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setDecomposition(int decomposition) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setStrength(int newStrength) { throw new RuntimeException("Stub!"); }
/* 36 */   public RuleBasedCollator setMaxVariable(int group) { throw new RuntimeException("Stub!"); }
/* 37 */   public int getMaxVariable() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setNumericCollation(boolean flag) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setReorderCodes(int... order) { throw new RuntimeException("Stub!"); }
/* 40 */   public String getRules() { throw new RuntimeException("Stub!"); }
/* 41 */   public String getRules(boolean fullrules) { throw new RuntimeException("Stub!"); }
/* 42 */   public UnicodeSet getTailoredSet() { throw new RuntimeException("Stub!"); }
/* 43 */   public void getContractionsAndExpansions(UnicodeSet contractions, UnicodeSet expansions, boolean addPrefixes) throws Exception { throw new RuntimeException("Stub!"); }
/* 44 */   public CollationKey getCollationKey(String source) { throw new RuntimeException("Stub!"); }
/* 45 */   public int getStrength() { throw new RuntimeException("Stub!"); }
/* 46 */   public int getDecomposition() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isUpperCaseFirst() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean isLowerCaseFirst() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean isAlternateHandlingShifted() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isCaseLevel() { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean isFrenchCollation() { throw new RuntimeException("Stub!"); }
/* 52 */   public int getVariableTop() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean getNumericCollation() { throw new RuntimeException("Stub!"); }
/* 54 */   public int[] getReorderCodes() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 56 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 57 */   public int compare(String source, String target) { throw new RuntimeException("Stub!"); }
/* 58 */   public VersionInfo getVersion() { throw new RuntimeException("Stub!"); }
/* 59 */   public VersionInfo getUCAVersion() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\RuleBasedCollator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */