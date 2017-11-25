/*    */ package android.net;
/*    */ 
/*    */ import java.util.List;
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
/*    */ public class UrlQuerySanitizer
/*    */ {
/*    */   public class ParameterValuePair
/*    */   {
/*    */     public String mParameter;
/*    */     public String mValue;
/*    */     
/* 22 */     public ParameterValuePair(String parameter, String value) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract interface ValueSanitizer { public abstract String sanitize(String paramString); }
/*    */   
/*    */   public static class IllegalCharacterValueSanitizer implements UrlQuerySanitizer.ValueSanitizer { public static final int ALL_BUT_NUL_AND_ANGLE_BRACKETS_LEGAL = 1439;
/*    */     public static final int ALL_BUT_NUL_LEGAL = 1535;
/*    */     public static final int ALL_BUT_WHITESPACE_LEGAL = 1532;
/*    */     public static final int ALL_ILLEGAL = 0;
/*    */     public static final int ALL_OK = 2047;
/*    */     
/* 33 */     public IllegalCharacterValueSanitizer(int flags) { throw new RuntimeException("Stub!"); }
/* 34 */     public String sanitize(String value) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/*    */     public static final int ALL_WHITESPACE_OK = 3;
/*    */     
/*    */     public static final int AMP_AND_SPACE_LEGAL = 129;
/*    */     public static final int AMP_LEGAL = 128;
/*    */     public static final int AMP_OK = 128;
/*    */     public static final int DQUOTE_OK = 8;
/*    */     public static final int GT_OK = 64;
/*    */     public static final int LT_OK = 32;
/*    */     public static final int NON_7_BIT_ASCII_OK = 4;
/*    */     public static final int NUL_OK = 512;
/*    */     public static final int OTHER_WHITESPACE_OK = 2;
/*    */     public static final int PCT_OK = 256;
/*    */     public static final int SCRIPT_URL_OK = 1024;
/*    */     public static final int SPACE_LEGAL = 1;
/*    */     public static final int SPACE_OK = 1;
/*    */     public static final int SQUOTE_OK = 16;
/*    */     public static final int URL_AND_SPACE_LEGAL = 405;
/*    */     public static final int URL_LEGAL = 404;
/*    */   }
/*    */   
/* 58 */   public UrlQuerySanitizer() { throw new RuntimeException("Stub!"); }
/* 59 */   public UrlQuerySanitizer(String url) { throw new RuntimeException("Stub!"); }
/* 60 */   public ValueSanitizer getUnregisteredParameterValueSanitizer() { throw new RuntimeException("Stub!"); }
/* 61 */   public void setUnregisteredParameterValueSanitizer(ValueSanitizer sanitizer) { throw new RuntimeException("Stub!"); }
/* 62 */   public static final ValueSanitizer getAllIllegal() { throw new RuntimeException("Stub!"); }
/* 63 */   public static final ValueSanitizer getAllButNulLegal() { throw new RuntimeException("Stub!"); }
/* 64 */   public static final ValueSanitizer getAllButWhitespaceLegal() { throw new RuntimeException("Stub!"); }
/* 65 */   public static final ValueSanitizer getUrlLegal() { throw new RuntimeException("Stub!"); }
/* 66 */   public static final ValueSanitizer getUrlAndSpaceLegal() { throw new RuntimeException("Stub!"); }
/* 67 */   public static final ValueSanitizer getAmpLegal() { throw new RuntimeException("Stub!"); }
/* 68 */   public static final ValueSanitizer getAmpAndSpaceLegal() { throw new RuntimeException("Stub!"); }
/* 69 */   public static final ValueSanitizer getSpaceLegal() { throw new RuntimeException("Stub!"); }
/* 70 */   public static final ValueSanitizer getAllButNulAndAngleBracketsLegal() { throw new RuntimeException("Stub!"); }
/* 71 */   public void parseUrl(String url) { throw new RuntimeException("Stub!"); }
/* 72 */   public void parseQuery(String query) { throw new RuntimeException("Stub!"); }
/* 73 */   public Set<String> getParameterSet() { throw new RuntimeException("Stub!"); }
/* 74 */   public List<ParameterValuePair> getParameterList() { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean hasParameter(String parameter) { throw new RuntimeException("Stub!"); }
/* 76 */   public String getValue(String parameter) { throw new RuntimeException("Stub!"); }
/* 77 */   public void registerParameter(String parameter, ValueSanitizer valueSanitizer) { throw new RuntimeException("Stub!"); }
/* 78 */   public void registerParameters(String[] parameters, ValueSanitizer valueSanitizer) { throw new RuntimeException("Stub!"); }
/* 79 */   public void setAllowUnregisteredParamaters(boolean allowUnregisteredParamaters) { throw new RuntimeException("Stub!"); }
/* 80 */   public boolean getAllowUnregisteredParamaters() { throw new RuntimeException("Stub!"); }
/* 81 */   public void setPreferFirstRepeatedParameter(boolean preferFirstRepeatedParameter) { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean getPreferFirstRepeatedParameter() { throw new RuntimeException("Stub!"); }
/* 83 */   protected void parseEntry(String parameter, String value) { throw new RuntimeException("Stub!"); }
/* 84 */   protected void addSanitizedEntry(String parameter, String value) { throw new RuntimeException("Stub!"); }
/* 85 */   public ValueSanitizer getValueSanitizer(String parameter) { throw new RuntimeException("Stub!"); }
/* 86 */   public ValueSanitizer getEffectiveValueSanitizer(String parameter) { throw new RuntimeException("Stub!"); }
/* 87 */   public String unescape(String string) { throw new RuntimeException("Stub!"); }
/* 88 */   protected boolean isHexDigit(char c) { throw new RuntimeException("Stub!"); }
/* 89 */   protected int decodeHexDigit(char c) { throw new RuntimeException("Stub!"); }
/* 90 */   protected void clear() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\UrlQuerySanitizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */