/*     */ package android.icu.util;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Iterator;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ULocale
/*     */   implements Serializable, Comparable<ULocale>
/*     */ {
/*     */   public static enum Category
/*     */   {
/*  18 */     DISPLAY, 
/*  19 */     FORMAT;
/*     */     
/*     */     private Category() {} }
/*     */   
/*  23 */   public static final class Builder { public Builder() { throw new RuntimeException("Stub!"); }
/*  24 */     public Builder setLocale(ULocale locale) { throw new RuntimeException("Stub!"); }
/*  25 */     public Builder setLanguageTag(String languageTag) { throw new RuntimeException("Stub!"); }
/*  26 */     public Builder setLanguage(String language) { throw new RuntimeException("Stub!"); }
/*  27 */     public Builder setScript(String script) { throw new RuntimeException("Stub!"); }
/*  28 */     public Builder setRegion(String region) { throw new RuntimeException("Stub!"); }
/*  29 */     public Builder setVariant(String variant) { throw new RuntimeException("Stub!"); }
/*  30 */     public Builder setExtension(char key, String value) { throw new RuntimeException("Stub!"); }
/*  31 */     public Builder setUnicodeLocaleKeyword(String key, String type) { throw new RuntimeException("Stub!"); }
/*  32 */     public Builder addUnicodeLocaleAttribute(String attribute) { throw new RuntimeException("Stub!"); }
/*  33 */     public Builder removeUnicodeLocaleAttribute(String attribute) { throw new RuntimeException("Stub!"); }
/*  34 */     public Builder clear() { throw new RuntimeException("Stub!"); }
/*  35 */     public Builder clearExtensions() { throw new RuntimeException("Stub!"); }
/*  36 */     public ULocale build() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  38 */   public ULocale(String localeID) { throw new RuntimeException("Stub!"); }
/*  39 */   public ULocale(String a, String b) { throw new RuntimeException("Stub!"); }
/*  40 */   public ULocale(String a, String b, String c) { throw new RuntimeException("Stub!"); }
/*  41 */   public static ULocale forLocale(Locale loc) { throw new RuntimeException("Stub!"); }
/*  42 */   public static ULocale createCanonical(String nonCanonicalID) { throw new RuntimeException("Stub!"); }
/*  43 */   public Locale toLocale() { throw new RuntimeException("Stub!"); }
/*  44 */   public static ULocale getDefault() { throw new RuntimeException("Stub!"); }
/*  45 */   public static ULocale getDefault(Category category) { throw new RuntimeException("Stub!"); }
/*  46 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*  47 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*  48 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*  49 */   public int compareTo(ULocale other) { throw new RuntimeException("Stub!"); }
/*  50 */   public static ULocale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/*  51 */   public static String[] getISOCountries() { throw new RuntimeException("Stub!"); }
/*  52 */   public static String[] getISOLanguages() { throw new RuntimeException("Stub!"); }
/*  53 */   public String getLanguage() { throw new RuntimeException("Stub!"); }
/*  54 */   public static String getLanguage(String localeID) { throw new RuntimeException("Stub!"); }
/*  55 */   public String getScript() { throw new RuntimeException("Stub!"); }
/*  56 */   public static String getScript(String localeID) { throw new RuntimeException("Stub!"); }
/*  57 */   public String getCountry() { throw new RuntimeException("Stub!"); }
/*  58 */   public static String getCountry(String localeID) { throw new RuntimeException("Stub!"); }
/*  59 */   public String getVariant() { throw new RuntimeException("Stub!"); }
/*  60 */   public static String getVariant(String localeID) { throw new RuntimeException("Stub!"); }
/*  61 */   public static String getFallback(String localeID) { throw new RuntimeException("Stub!"); }
/*  62 */   public ULocale getFallback() { throw new RuntimeException("Stub!"); }
/*  63 */   public String getBaseName() { throw new RuntimeException("Stub!"); }
/*  64 */   public static String getBaseName(String localeID) { throw new RuntimeException("Stub!"); }
/*  65 */   public String getName() { throw new RuntimeException("Stub!"); }
/*  66 */   public static String getName(String localeID) { throw new RuntimeException("Stub!"); }
/*  67 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  68 */   public Iterator<String> getKeywords() { throw new RuntimeException("Stub!"); }
/*  69 */   public static Iterator<String> getKeywords(String localeID) { throw new RuntimeException("Stub!"); }
/*  70 */   public String getKeywordValue(String keywordName) { throw new RuntimeException("Stub!"); }
/*  71 */   public static String getKeywordValue(String localeID, String keywordName) { throw new RuntimeException("Stub!"); }
/*  72 */   public static String canonicalize(String localeID) { throw new RuntimeException("Stub!"); }
/*  73 */   public ULocale setKeywordValue(String keyword, String value) { throw new RuntimeException("Stub!"); }
/*  74 */   public static String setKeywordValue(String localeID, String keyword, String value) { throw new RuntimeException("Stub!"); }
/*  75 */   public String getISO3Language() { throw new RuntimeException("Stub!"); }
/*  76 */   public static String getISO3Language(String localeID) { throw new RuntimeException("Stub!"); }
/*  77 */   public String getISO3Country() { throw new RuntimeException("Stub!"); }
/*  78 */   public static String getISO3Country(String localeID) { throw new RuntimeException("Stub!"); }
/*  79 */   public boolean isRightToLeft() { throw new RuntimeException("Stub!"); }
/*  80 */   public String getDisplayLanguage() { throw new RuntimeException("Stub!"); }
/*  81 */   public String getDisplayLanguage(ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/*  82 */   public static String getDisplayLanguage(String localeID, String displayLocaleID) { throw new RuntimeException("Stub!"); }
/*  83 */   public static String getDisplayLanguage(String localeID, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/*  84 */   public String getDisplayLanguageWithDialect() { throw new RuntimeException("Stub!"); }
/*  85 */   public String getDisplayLanguageWithDialect(ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/*  86 */   public static String getDisplayLanguageWithDialect(String localeID, String displayLocaleID) { throw new RuntimeException("Stub!"); }
/*  87 */   public static String getDisplayLanguageWithDialect(String localeID, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/*  88 */   public String getDisplayScript() { throw new RuntimeException("Stub!"); }
/*  89 */   public String getDisplayScript(ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/*  90 */   public static String getDisplayScript(String localeID, String displayLocaleID) { throw new RuntimeException("Stub!"); }
/*  91 */   public static String getDisplayScript(String localeID, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/*  92 */   public String getDisplayCountry() { throw new RuntimeException("Stub!"); }
/*  93 */   public String getDisplayCountry(ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/*  94 */   public static String getDisplayCountry(String localeID, String displayLocaleID) { throw new RuntimeException("Stub!"); }
/*  95 */   public static String getDisplayCountry(String localeID, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/*  96 */   public String getDisplayVariant() { throw new RuntimeException("Stub!"); }
/*  97 */   public String getDisplayVariant(ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/*  98 */   public static String getDisplayVariant(String localeID, String displayLocaleID) { throw new RuntimeException("Stub!"); }
/*  99 */   public static String getDisplayVariant(String localeID, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/* 100 */   public static String getDisplayKeyword(String keyword) { throw new RuntimeException("Stub!"); }
/* 101 */   public static String getDisplayKeyword(String keyword, String displayLocaleID) { throw new RuntimeException("Stub!"); }
/* 102 */   public static String getDisplayKeyword(String keyword, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/* 103 */   public String getDisplayKeywordValue(String keyword) { throw new RuntimeException("Stub!"); }
/* 104 */   public String getDisplayKeywordValue(String keyword, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/* 105 */   public static String getDisplayKeywordValue(String localeID, String keyword, String displayLocaleID) { throw new RuntimeException("Stub!"); }
/* 106 */   public static String getDisplayKeywordValue(String localeID, String keyword, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/* 107 */   public String getDisplayName() { throw new RuntimeException("Stub!"); }
/* 108 */   public String getDisplayName(ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/* 109 */   public static String getDisplayName(String localeID, String displayLocaleID) { throw new RuntimeException("Stub!"); }
/* 110 */   public static String getDisplayName(String localeID, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/* 111 */   public String getDisplayNameWithDialect() { throw new RuntimeException("Stub!"); }
/* 112 */   public String getDisplayNameWithDialect(ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/* 113 */   public static String getDisplayNameWithDialect(String localeID, String displayLocaleID) { throw new RuntimeException("Stub!"); }
/* 114 */   public static String getDisplayNameWithDialect(String localeID, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/* 115 */   public String getCharacterOrientation() { throw new RuntimeException("Stub!"); }
/* 116 */   public String getLineOrientation() { throw new RuntimeException("Stub!"); }
/* 117 */   public static ULocale acceptLanguage(String acceptLanguageList, ULocale[] availableLocales, boolean[] fallback) { throw new RuntimeException("Stub!"); }
/* 118 */   public static ULocale acceptLanguage(ULocale[] acceptLanguageList, ULocale[] availableLocales, boolean[] fallback) { throw new RuntimeException("Stub!"); }
/* 119 */   public static ULocale acceptLanguage(String acceptLanguageList, boolean[] fallback) { throw new RuntimeException("Stub!"); }
/* 120 */   public static ULocale acceptLanguage(ULocale[] acceptLanguageList, boolean[] fallback) { throw new RuntimeException("Stub!"); }
/* 121 */   public static ULocale addLikelySubtags(ULocale loc) { throw new RuntimeException("Stub!"); }
/* 122 */   public static ULocale minimizeSubtags(ULocale loc) { throw new RuntimeException("Stub!"); }
/* 123 */   public String getExtension(char key) { throw new RuntimeException("Stub!"); }
/* 124 */   public Set<Character> getExtensionKeys() { throw new RuntimeException("Stub!"); }
/* 125 */   public Set<String> getUnicodeLocaleAttributes() { throw new RuntimeException("Stub!"); }
/* 126 */   public String getUnicodeLocaleType(String key) { throw new RuntimeException("Stub!"); }
/* 127 */   public Set<String> getUnicodeLocaleKeys() { throw new RuntimeException("Stub!"); }
/* 128 */   public String toLanguageTag() { throw new RuntimeException("Stub!"); }
/* 129 */   public static ULocale forLanguageTag(String languageTag) { throw new RuntimeException("Stub!"); }
/* 130 */   public static String toUnicodeLocaleKey(String keyword) { throw new RuntimeException("Stub!"); }
/* 131 */   public static String toUnicodeLocaleType(String keyword, String value) { throw new RuntimeException("Stub!"); }
/* 132 */   public static String toLegacyKey(String keyword) { throw new RuntimeException("Stub!"); }
/* 133 */   public static String toLegacyType(String keyword, String value) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */   public static final ULocale US = null; public static final char UNICODE_LOCALE_EXTENSION = 'u'; public static final ULocale UK = null; public static final ULocale TRADITIONAL_CHINESE = null; public static final ULocale TAIWAN = null; public static final ULocale SIMPLIFIED_CHINESE = null; public static final ULocale ROOT = null; public static final char PRIVATE_USE_EXTENSION = 'x'; public static final ULocale PRC = null; public static final ULocale KOREAN = null; public static final ULocale KOREA = null; public static final ULocale JAPANESE = null; public static final ULocale JAPAN = null; public static final ULocale ITALY = null; public static final ULocale ITALIAN = null; public static final ULocale GERMANY = null; public static final ULocale GERMAN = null; public static final ULocale FRENCH = null; public static final ULocale FRANCE = null; public static final ULocale ENGLISH = null; public static final ULocale CHINESE = null; public static final ULocale CHINA = null; public static final ULocale CANADA_FRENCH = null; public static final ULocale CANADA = null;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\util\ULocale.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */